package de.dc.swtform.example.control;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class XUnitLabelMain extends BaseXUnitLabel {

	protected Button OkButton;
	protected Button AbbrechenButton;

	public XUnitLabelMain(Composite parent) {
		super(parent);
	}

	public static void main(String[] args) {
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Shell");
		shell.setSize(600, 800);
		shell.setLayout(new FillLayout());

		new XUnitLabelMain(shell);
	
		shell.open();

		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	@Override
	protected void onRecordSelection(SelectionEvent e) {
		System.out.println("Abnehmen button implementation");
	}
}

