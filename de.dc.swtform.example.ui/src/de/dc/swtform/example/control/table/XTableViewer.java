package de.dc.swtform.example.control.table;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.widgets.Composite;

public class XTableViewer extends BaseXTableViewer {

	public XTableViewer(Composite parent) {
		super(parent);
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
