package de.dc.swtform.example.control;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class SwtForm extends BaseSwtForm {

	public SwtForm(Composite parent) {
		super(parent);
	}
	@Override
	protected void onOkSelection(SelectionEvent e) {
		// TODO: Ok button implementation
	}
	@Override
	protected void onAbbrechenSelection(SelectionEvent e) {
		// TODO: Abbrechen button implementation
	}
}
