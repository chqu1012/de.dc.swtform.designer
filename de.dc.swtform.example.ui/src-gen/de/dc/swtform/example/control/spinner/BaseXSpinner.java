package de.dc.swtform.example.control.spinner;

import de.dc.swtform.designer.control.*;
import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.*;
public abstract class BaseXSpinner extends Composite implements SelectionListener{
	
	protected Spinner weitsprungSpinner;
	
	public BaseXSpinner(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		weitsprungSpinner = SwtFactory.createSpinner(this, false, 0, 1000, 500, 1, 1);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
	
}
