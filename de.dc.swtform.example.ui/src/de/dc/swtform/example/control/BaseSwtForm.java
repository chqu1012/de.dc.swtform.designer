package de.dc.swtform.example.control;

import static de.dc.swtform.designer.util.SwtFactory.createPushButton;

import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public abstract class BaseSwtForm extends Composite implements SelectionListener{
	
	protected Button OkButton;
	protected Button AbbrechenButton;
	
	public BaseSwtForm(Composite parent){
		super(parent, 0);
		setLayout(new FillLayout());
		
		OkButton=createPushButton(this, "Ok");
		OkButton.addSelectionListener(this);
		AbbrechenButton=createPushButton(this, "Abbrechen");
		AbbrechenButton.addSelectionListener(this);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if(OkButton==e.getSource()){
			onOkSelection(e);
		}
		if(AbbrechenButton==e.getSource()){
			onAbbrechenSelection(e);
		}
	}
	protected abstract void onOkSelection(SelectionEvent e);
	protected abstract void onAbbrechenSelection(SelectionEvent e);
}

