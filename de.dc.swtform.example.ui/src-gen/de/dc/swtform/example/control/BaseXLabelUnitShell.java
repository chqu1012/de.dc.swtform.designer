package de.dc.swtform.example.control;

import de.dc.swtform.designer.util.SwtFactory;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;

public abstract class BaseXLabelUnitShell extends Composite implements SelectionListener{
	
	protected Text unitText;
	protected Text hochkantText;
	protected Text tiefkantText;
	protected Text querText;
	
	public BaseXLabelUnitShell(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		unitText = SwtFactory.createLabelUnit(this, "Unit", "Km", 100, 3, 5, 0 , 4, 4, true, false, 1, 1, -1, -1);
		hochkantText = SwtFactory.createLabelUnit(this, "Hochkant", "Km", 100, 3, 5, 0 );
		tiefkantText = SwtFactory.createLabelUnit(this, "Tiefkant", "Km", 100, 3, 5, 0 );
		querText = SwtFactory.createLabelUnit(this, "Quer", "Km", 100, 3, 5, 0 );
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		if(unitText==e.getSource()){
			onUnitSelection(e);
		} 
		if(hochkantText==e.getSource()){
			onHochkantSelection(e);
		} 
		if(tiefkantText==e.getSource()){
			onTiefkantSelection(e);
		} 
		if(querText==e.getSource()){
			onQuerSelection(e);
		} 
	}
	protected abstract void onUnitSelection(SelectionEvent e);
	protected abstract void onHochkantSelection(SelectionEvent e);
	protected abstract void onTiefkantSelection(SelectionEvent e);
	protected abstract void onQuerSelection(SelectionEvent e);
}

