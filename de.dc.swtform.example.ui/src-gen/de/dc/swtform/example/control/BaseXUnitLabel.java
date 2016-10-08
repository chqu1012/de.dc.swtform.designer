package de.dc.swtform.example.control;

import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

public abstract class BaseXUnitLabel extends Composite implements SelectionListener{
	
	protected Text unitText;
	protected Text hochkantText;
	protected Text tiefkantText;
	protected Button abnehmenButton;
	
	public BaseXUnitLabel(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		unitText = SwtFactory.createLabelUnit(this, "Unit", "Km", 100, 3, 5, 0 );
		hochkantText = SwtFactory.createLabelUnit(this, "Hochkant", "Km", 100, 3, 5, 0 );
		tiefkantText = SwtFactory.createLabelUnit(this, "Tiefkant", "Km", 100, 3, 5, 0 );
		abnehmenButton = SwtFactory.createPushButton(this, "Abnehmen");
		abnehmenButton.addSelectionListener(this);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if(abnehmenButton==e.getSource()){
			onRecordSelection(e);
		} 
	}
	protected abstract void onRecordSelection(SelectionEvent e);
}

