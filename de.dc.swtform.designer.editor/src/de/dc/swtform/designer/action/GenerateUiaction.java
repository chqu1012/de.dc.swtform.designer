package de.dc.swtform.designer.action;

import static org.eclipse.core.resources.IResource.DEPTH_INFINITE;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.actions.ActionDelegate;

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
				IPackageFragmentRoot newPackage = createPackage(javaProject, form.getPackagePath());
				newPackage.getResource().refreshLocal(DEPTH_INFINITE, null);

				System.out.println(project.getName());
				System.out.println(javaProject.getElementName());
				System.out.println(srcFolder.getName());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}

	}

	private IPackageFragmentRoot createPackage(IJavaProject javaProject, String path) throws CoreException {
		IPackageFragmentRoot folder = javaProject.getPackageFragmentRoot(getSrcFolder(javaProject));
		folder.createPackageFragment(path, true, null);
		return folder;
	}

	private IFolder getSrcFolder(IJavaProject javaProject) throws CoreException {
		IFolder folder = javaProject.getProject().getFolder("src");
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
