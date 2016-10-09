package de.dc.swtform.example.control.table;

import java.util.*;
import java.util.List;

import org.eclipse.swt.events.*;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import de.dc.swtform.designer.util.*;
import de.dc.swtform.example.control.table.model.*;
public class XTableViewerMain extends BaseXTableViewer {

	public XTableViewerMain(Composite parent) {
		super(parent);
		fillContactsDummies(contactsTableViewer);
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

		new XTableViewerMain(shell);
	
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

		@Override
	protected void onBearbeitenSelection(SelectionEvent e) {
		// TODO: Bearbeiten button implementation
		System.out.println("Bearbeiten button implementation");
	}
@Override
protected void onPushSelection(SelectionEvent e) {
	// TODO: Push button implementation
	System.out.println("Push button implementation");
}

@Override
protected void onTestSelection(SelectionEvent e) {
	// TODO: test button implementation
	System.out.println("test button implementation");
}
}

