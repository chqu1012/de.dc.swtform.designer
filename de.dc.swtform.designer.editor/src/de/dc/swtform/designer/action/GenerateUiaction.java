package de.dc.swtform.designer.action;

import static de.dc.swtform.designer.template.Template.BaseControl;
import static de.dc.swtform.designer.template.Template.ExtendedBaseControl;
import static de.dc.swtform.designer.template.Template.TestControl;
import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;

import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import de.dc.swtform.designer.template.BaseControlTemplate;
import de.dc.swtform.designer.template.ExtendedControlTemplate;
import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.template.Template;
import de.dc.swtform.designer.template.TemplateManager;
import de.dc.swtform.designer.template.TestControlTemplate;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.model.presentation.ModelEditor;
import de.dc.swtform.xcore.widget.XViewer;
import de.dc.swtform.xcore.widget.XWidget;

public class GenerateUiaction extends ActionDelegate {

	private SwtForm form;
	private HashMap<String, XWidget> uiMap;
	
	private XWidget lastDoubleWidget;
	
	@Override
	public void run(IAction action) {
		super.run(action);
		lastDoubleWidget=null;
		uiMap = new HashMap<String, XWidget>();
		
		getSelectedForm();
		
		if(!isValidForm() && lastDoubleWidget!=null){
			showInValidFormAndSelectTreeItem();
		}else if (form != null) {
			generateUI();
		}
	}

	private void generateUI() {
		try {
			IProject project = getCurrentProject();
			project.open(null);
			IJavaProject javaProject = JavaCore.create(project);
			IFolder srcFolder = getFolder(javaProject, "src");
			IFolder srcGenFolder = getFolder(javaProject, "src-gen");
			IFolder testFolder = getFolder(javaProject, "test");
			
//			IGenerator<SwtForm> extendedTpl = new ExtendedControlTemplate();
//			IGenerator<SwtForm> baseTpl = new BaseControlTemplate();
//			IGenerator<SwtForm> testTpl = new TestControlTemplate();
//			String extendedContent = extendedTpl.gen(form);
//			String baseContent = baseTpl.gen(form);
//			String testContent = testTpl.gen(form);
			
			cleanFolders(srcFolder, srcGenFolder, testFolder);
			
			for (XWidget  w : form.getWidgets()) {
				if (w instanceof XViewer) {
					XViewer viewer = (XViewer) w;
					String providerContent = TemplateManager.Instance.get(Template.LabelProvider).gen(viewer);
					String baseProviderContent = TemplateManager.Instance.get(Template.BaseLabelProvider).gen(viewer);
					String modelContent = TemplateManager.Instance.get(Template.TableViewerModel).gen(viewer);
					String labelProviderName = viewer.getName()+"LabelProvider.java";
					String modelName = viewer.getName()+"Model.java";
					String baseLabelProviderName = "Base"+labelProviderName;
					String baseModelName = "Base"+modelName;
					createJavaClass(javaProject, srcGenFolder, baseProviderContent, baseLabelProviderName, form.getPackagePath()+".provider","src-gen");
					createJavaClass(javaProject, srcGenFolder, modelContent, baseModelName, form.getPackagePath()+".model","src-gen");
					createJavaClass(javaProject, srcFolder, providerContent, labelProviderName, form.getPackagePath()+".provider","src");
//					createJavaClass(javaProject, srcFolder, modelContent, modelName, form.getPackagePath()+".model","src");
				}
			}
			
			String baseContent = TemplateManager.Instance.get(Template.BaseControl).gen(form);
			String extendedContent = TemplateManager.Instance.get(Template.ExtendedBaseControl).gen(form);
			String testContent = TemplateManager.Instance.get(Template.TestControl).gen(form);

			createBaseUIClass(javaProject, srcGenFolder,baseContent);
			createExtendedUIClass(javaProject, srcFolder, extendedContent);
			createTestUIClass(javaProject, testFolder, testContent);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void cleanFolders(IFolder srcFolder, IFolder srcGenFolder, IFolder testFolder) {
		deleteFiles(srcFolder);
		deleteFiles(srcGenFolder);
		deleteFiles(testFolder);
	}

	private void deleteFiles(IFolder folder) {
		try {
			for (IResource r : folder.members()) {
				r.delete(true, null);
			}
			folder.refreshLocal(DEPTH_INFINITE, null);
		} catch (CoreException e) {
			e.printStackTrace();
		}
	}

	private void showInValidFormAndSelectTreeItem() {
		MessageDialog.openInformation(new Shell(), "Doppelte Steuerelementname!", "Die Namen m�ssen f�r jedes Element eindeutig definiert sein. \""+lastDoubleWidget.getName()+"\" kommt zweimal vor.");
		ModelEditor activeEditor = (ModelEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		((TreeViewer)activeEditor.getViewer()).setSelection(new StructuredSelection(lastDoubleWidget), true);
	}

	private void getSelectedForm() {
		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof SwtForm) {
				form = (SwtForm) ss.getFirstElement();
			}
		}
	}

	private boolean isValidForm() {
		for (EObject o : form.eContents()) {
			XWidget widget = (XWidget)o;
			boolean containsKey = uiMap.containsKey(widget.getName());
			if(containsKey){
				return !containsKey;
			}else{
				uiMap.put(widget.getName(), widget);
			}
		}
		return true;
	}
	
	private void createTestUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = form.getName()+"Main.java";
		createJavaClass(javaProject, folder, content, fileName, form.getPackagePath(), "test");
	}
	
	private void createBaseUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = "Base"+form.getName()+".java";
		createJavaClass(javaProject, folder, content, fileName, form.getPackagePath(), "src-gen");
	}

	private void createExtendedUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = form.getName()+".java";
		createJavaClass(javaProject, folder, content, fileName, form.getPackagePath(), "src");
	}

	private void createJavaClass(IJavaProject javaProject, IFolder folder, String content, String fileName, String packagePath, String srcPath)
			throws CoreException, JavaModelException {
		IPackageFragment newPackage = createPackage(javaProject, folder, packagePath, srcPath);
		newPackage.getResource().refreshLocal(DEPTH_INFINITE, null);
		if(newPackage.getCompilationUnit(fileName).exists()){
			newPackage.getCompilationUnit(fileName).delete(true, null);
		}
		ICompilationUnit cu = newPackage.createCompilationUnit(fileName, content, false, null);
		cu.getResource().refreshLocal(DEPTH_INFINITE, null);
		cu.open(null);
	}

	
	private IPackageFragment createPackage(IJavaProject javaProject, IFolder folder, String path, String srcPath) throws CoreException {
		IPackageFragmentRoot f = javaProject.getPackageFragmentRoot(getFolder(javaProject, srcPath));
		IPackageFragment packFragment = f.createPackageFragment(path, true, null);
		return packFragment;
	}

	private IFolder getFolder(IJavaProject javaProject, String name) throws CoreException {
		IFolder folder = javaProject.getProject().getFolder(name);
		if (!folder.exists()) {
			folder.create(true, true, null);
		}
		return folder;
	}
	
	public static IProject getCurrentProject() {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();

		if (editorPart != null) {
			IFileEditorInput input = (IFileEditorInput) editorPart.getEditorInput();
			IFile file = input.getFile();
			IProject activeProject = file.getProject();
			return activeProject;
		}
		return null;
	}
}
