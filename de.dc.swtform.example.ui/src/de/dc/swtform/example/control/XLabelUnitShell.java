package de.dc.swtform.example.control;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class XLabelUnitShell extends BaseXLabelUnitShell {

	public XLabelUnitShell(Composite parent) {
		super(parent);
	}
	@Override
	protected void onUnitSelection(SelectionEvent e) {
		// TODO: unit button implementation
		System.out.println("unit button implementation");
	}
	@Override
	protected void onOkSelection(SelectionEvent e) {
		// TODO: Ok button implementation
		System.out.println("Ok button implementation");
	}
	@Override
	protected void onCancelActionSelection(SelectionEvent e) {
		// TODO: Cancel button implementation
		System.out.println("Cancel button implementation");
	}
}
