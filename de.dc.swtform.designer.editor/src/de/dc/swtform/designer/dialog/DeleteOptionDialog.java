package de.dc.swtform.designer.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.wb.swt.SWTResourceManager;

public class DeleteOptionDialog extends Dialog {

	private boolean isSrcSelected = false;
	private boolean isSrcGenSelected = false;
	private boolean isTestSelected = false;
	private Button btnTest;
	private Button btnSrcgen;
	private Button btnSrc;
	private String path;
	
	public DeleteOptionDialog(Shell parentShell, String path) {
		super(parentShell);
		this.path = path;
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite container = (Composite) super.createDialogArea(parent);
		container.setLayout(new GridLayout(1, false));
		
		Label lblWelcheVerzeichnisseSollen = new Label(container, SWT.WRAP);
		lblWelcheVerzeichnisseSollen.setLayoutData(new GridData(SWT.LEFT, SWT.CENTER, true, false, 1, 1));
		lblWelcheVerzeichnisseSollen.setText("Welche Verzeichnisse sollen gereinigt werden, bevor die Generierung durchgef\u00FChrt wird? ");
		
		new Label(container, SWT.NONE).setText("Alle Dateien unter dem Verzeichnis werden gel\u00F6scht: ");
		
		new Label(container, SWT.NONE).setText(path);
		
		btnSrc = new Button(container, SWT.CHECK);
		btnSrc.setFont(SWTResourceManager.getFont("Segoe UI", 9, SWT.BOLD));
		btnSrc.setText("src, eigenen Code wird auch gel\u00F6scht!");
		
		btnSrcgen = new Button(container, SWT.CHECK);
		btnSrcgen.setSelection(true);
		btnSrcgen.setText("src-gen, nur generierter Code");
		
		btnTest = new Button(container, SWT.CHECK);
		btnTest.setSelection(true);
		btnTest.setText("test, nur generierter Code");

		return container;
	}

	@Override
	protected void buttonPressed(int buttonId) {
		if(buttonId== IDialogConstants.OK_ID){
			isSrcGenSelected=btnSrcgen.getSelection();
			isSrcSelected=btnSrc.getSelection();
			isTestSelected=btnTest.getSelection();
		}
		super.buttonPressed(buttonId);
	}
	
	public boolean isSrcSelected() {
		return isSrcSelected;
	}

	public boolean isSrcGenSelected() {
		return isSrcGenSelected;
	}

	public boolean isTestSelected() {
		return isTestSelected;
	}
	
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
	}

	@Override
	protected Point getInitialSize() {
		return new Point(450, 300);
	}
}
