package de.dc.swtform.example.control;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class XUnitLabel extends BaseXUnitLabel {

	public XUnitLabel(Composite parent) {
		super(parent);
	}
	@Override
	protected void onRecordSelection(SelectionEvent e) {
		// TODO: Abnehmen button implementation
		System.out.println("Abnehmen button implementation");
	}
}
