package de.dc.swtform.example.control;

import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

public abstract class BaseXLabelUnitShell extends Composite implements SelectionListener{
	
	protected Text unitText;
	protected Text hochkantText;
	protected Text tiefkantText;
	protected Text querText;
	protected Button okButton;
	protected Button cancelButton;
	
	public BaseXLabelUnitShell(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		unitText = SwtFactory.createLabelUnit(this, "Unit", "Km", 100, 3, 5, 0 , 4, 4, true, false, 1, 1, -1, -1);
		hochkantText = SwtFactory.createLabelUnit(this, "Hochkant", "Km", 100, 3, 5, 0 );
		tiefkantText = SwtFactory.createLabelUnit(this, "Tiefkant", "Km", 100, 3, 5, 0 );
		querText = SwtFactory.createLabelUnit(this, "Quer", "Km", 100, 3, 5, 0 );
		okButton = SwtFactory.createPushButton(this, "Ok");
		okButton.setLayoutData(LayoutFactory.gridData(4, 4, true, false, 1, 1, -1, -1));
		cancelButton = SwtFactory.createPushButton(this, "Cancel");
		cancelButton.setLayoutData(LayoutFactory.gridData(4, 4, true, false, 1, 1, -1, -1));
		unitText.addSelectionListener(this);
		okButton.addSelectionListener(this);
		cancelButton.addSelectionListener(this);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if(unitText==e.getSource()){
			onUnitSelection(e);
		} 
		if(okButton==e.getSource()){
			onOkSelection(e);
		} 
		if(cancelButton==e.getSource()){
			onCancelActionSelection(e);
		} 
	}
	protected abstract void onUnitSelection(SelectionEvent e);
	protected abstract void onOkSelection(SelectionEvent e);
	protected abstract void onCancelActionSelection(SelectionEvent e);
}

