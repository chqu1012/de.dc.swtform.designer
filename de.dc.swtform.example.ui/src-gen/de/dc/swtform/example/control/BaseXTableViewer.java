package de.dc.swtform.example.control;

import de.dc.swtform.designer.control.*;
import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.*;

import de.dc.swtform.example.control.filter.*;	
import de.dc.swtform.example.control.provider.*;

public abstract class BaseXTableViewer extends Composite implements SelectionListener{
	
	protected TableViewer contactsTableViewer;
	protected Text searchContactsText;
	
	public BaseXTableViewer(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		String[] titles = new String[]{"Name", "Vorname", "Handy"};
		int[] bounds = new int[]{100, 100, 100};
		LabelProvider labelProvider = new ContactsLabelProvider();
		BaseTableViewer contactsComposite = SwtFactory.createSearchTableViewer(this, titles, bounds, true, labelProvider);
		contactsComposite.addFilter(new ContactsFilter());
		contactsTableViewer = contactsComposite.getViewer();
		contactsComposite.setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
			}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
}

