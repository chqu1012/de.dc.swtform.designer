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
	protected void onHochkantSelection(SelectionEvent e) {
		// TODO: Hochkant button implementation
		System.out.println("Hochkant button implementation");
	}
	@Override
	protected void onTiefkantSelection(SelectionEvent e) {
		// TODO: Tiefkant button implementation
		System.out.println("Tiefkant button implementation");
	}
	@Override
	protected void onQuerSelection(SelectionEvent e) {
		// TODO: Quer button implementation
		System.out.println("Quer button implementation");
	}
}
