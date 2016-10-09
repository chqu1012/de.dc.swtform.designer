package de.dc.swtform.example.control.spinner;

import java.util.*;
import java.util.List;

import org.eclipse.swt.events.*;

import org.eclipse.jface.viewers.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import de.dc.swtform.designer.util.*;
public class XSpinnerMain extends BaseXSpinner {

	public XSpinnerMain(Composite parent) {
		super(parent);
	}
	
	

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Shell");
		shell.setSize(600, 600);
		shell.setLayout(new FillLayout());

		new XSpinnerMain(shell);
	
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}
}

