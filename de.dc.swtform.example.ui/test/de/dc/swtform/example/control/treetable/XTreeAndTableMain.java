package de.dc.swtform.example.control.treetable;

import java.util.*;
import java.util.List;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import de.dc.swtform.designer.util.*;
import de.dc.swtform.designer.control.model.TreeNode;
import de.dc.swtform.example.control.treetable.model.*;
public class XTreeAndTableMain extends BaseXTreeAndTable {

	public XTreeAndTableMain(Composite parent) {
		super(parent);
		fillContactsDummies(contactsTableViewer);
		fillFamilienstammbaumDummies(familienstammbaumTreeViewer);
	}
	
	private void fillFamilienstammbaumDummies(TreeViewer viewer) {
		TreeNode parent = new TreeNode(null, "parent");
		TreeNode current = createTreeNode(parent, Dummy.getRandomString());
		for (int i = 0; i < 100; i++) {
			parent.getChildren().add(current);
			current = createTreeNode(current, Dummy.getRandomString());
		}
		viewer.setInput(parent);
	}
	private TreeNode createTreeNode(TreeNode parent, String value) {
		TreeNode node = new TreeNode(parent, value);
		for (int i = 0; i < 5; i++) {
			TreeNode newNode= new TreeNode(node, Dummy.getRandomString());
			node.getChildren().add(newNode);
		}
		return node;
	}
	
	private void fillContactsDummies(TableViewer viewer) {
		List<BaseContactsModel> entries = new ArrayList<BaseContactsModel>();
		for (int i = 0; i < 100; i++) {
			entries.add(create(Dummy.getRandomString(),Dummy.getRandomString(),Dummy.getRandomInt(1000000)));
		}
		viewer.setInput(entries);
	}
	public BaseContactsModel create(String Name, String Vorname, int Handy){
		return new BaseContactsModel(Name, Vorname, Handy);
	}

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Shell");
		shell.setSize(600, 600);
		shell.setLayout(new FillLayout());

		new XTreeAndTableMain(shell);
	
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

}

