package de.dc.swtform.designer.action;

import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

import de.dc.swtform.designer.template.BaseControlTemplate;
import de.dc.swtform.designer.template.ExtendedControlTemplate;
import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.template.TestControlTemplate;
import de.dc.swtform.xcore.model.SwtForm;

public class GenerateUiaction extends ActionDelegate {

	private SwtForm form;

	@Override
	public void run(IAction action) {
		super.run(action);

		ISelectionService selectionService = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService();
		ISelection selection = selectionService.getSelection();
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			if (ss.getFirstElement() instanceof SwtForm) {
				form = (SwtForm) ss.getFirstElement();
			}
		}

		if (form != null) {
			try {
				IProject project = getCurrentProject();
				project.open(null);
				IJavaProject javaProject = JavaCore.create(project);
				IFolder srcFolder = getSrcFolder(javaProject);
				IFolder srcGenFolder = getFolder(javaProject, "src-gen");
				IFolder testFolder = getFolder(javaProject, "test");
				
				IGenerator<SwtForm> extendedTpl = new ExtendedControlTemplate();
				IGenerator<SwtForm> baseTpl = new BaseControlTemplate();
				IGenerator<SwtForm> testTpl = new TestControlTemplate();
				String extendedContent = extendedTpl.gen(form);
				String baseContent = baseTpl.gen(form);
				String testContent = testTpl.gen(form);
				
				createBaseUIClass(javaProject, srcGenFolder,baseContent);
				createExtendedUIClass(javaProject, srcFolder, extendedContent);
				createTestUIClass(javaProject, testFolder, testContent);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

	private void createTestUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = form.getName()+"Main.java";
		createJavaClass(javaProject, folder, content, fileName, "test");
	}
	
	private void createBaseUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = "Base"+form.getName()+".java";
		createJavaClass(javaProject, folder, content, fileName, "src-gen");
	}

	private void createExtendedUIClass(IJavaProject javaProject, IFolder folder, String content) throws JavaModelException, CoreException {
		String fileName = form.getName()+".java";
		createJavaClass(javaProject, folder, content, fileName, "src");
	}

	private void createJavaClass(IJavaProject javaProject, IFolder folder, String content, String fileName, String srcPath)
			throws CoreException, JavaModelException {
		IPackageFragment newPackage = createPackage(javaProject, folder, form.getPackagePath(), srcPath);
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

	private IFolder getSrcFolder(IJavaProject javaProject) throws CoreException {
		return getFolder(javaProject, "src");
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
