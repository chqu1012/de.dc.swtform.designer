package de.dc.swtform.example.control.tree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import de.dc.swtform.designer.control.model.TreeNode;
import de.dc.swtform.designer.util.Dummy;

public class XTreeViewerMain extends BaseXTreeViewer {

	public XTreeViewerMain(Composite parent) {
		super(parent);
		fillContactsDummies(familienstammbaumTreeViewer);
		
	}
	private void fillContactsDummies(TreeViewer viewer) {
		TreeNode parent = new TreeNode(null, "parent");
		TreeNode current = create(parent, Dummy.getRandomString());
		for (int i = 0; i < 100; i++) {
			current = create(current, Dummy.getRandomString());
			parent.getChildren().add(current);
		}
		viewer.setInput(parent);
	}
	private TreeNode create(TreeNode parent, String value) {
		TreeNode node = new TreeNode(parent, value);
		for (int i = 0; i < 5; i++) {
			TreeNode child = new TreeNode(node, Dummy.getRandomString());
			node.getChildren().add(child);
		}
		return node;
	}
	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Shell");
		shell.setSize(600, 600);
		shell.setLayout(new FillLayout());

		new XTreeViewerMain(shell);
	
		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}

