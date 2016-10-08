package de.dc.swtform.example.control.table;

import de.dc.swtform.designer.control.*;
import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.*;

import de.dc.swtform.example.control.table.filter.*;	
import de.dc.swtform.example.control.table.provider.*;
import de.dc.swtform.example.control.table.sorter.*;

public abstract class BaseXTableViewer extends Composite implements SelectionListener{
	
	protected TableViewer contactsTableViewer;
	protected Text searchContactsText;
	
	protected Text Text;
	protected Combo titelCombo;
	protected Label beschreibungLabel;
	
	public BaseXTableViewer(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		String[] titles = new String[]{"Name", "Vorname", "Handy"};
		int[] bounds = new int[]{100, 100, 100};
		LabelProvider labelProvider = new ContactsLabelProvider();
		BaseTableViewer contactsComposite = SwtFactory.createSearchTableViewer(this, titles, bounds, true, labelProvider);
		contactsComposite.addFilter(new ContactsFilter());
		contactsComposite.addSorter(new ContactsSorter());
		contactsTableViewer = contactsComposite.getViewer();
		contactsComposite.setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
		Text = SwtFactory.createLabelUnit(this, "Kilometerstand", "Km", 100, 3, 5, 0 );
		Composite titelContainer = SwtFactory.createGridComposite(this, 3, 5, 0);
		SwtFactory.createLabel(titelContainer, "Titel", 100);
		titelCombo = new Combo(titelContainer, SWT.NONE);
		SwtFactory.createComboItems(titelCombo,new String[]{"Dr.","Bachelor","Master","Diplom"});
		beschreibungLabel = SwtFactory.createLabel(this, "Hallo Welt kann man auch anders benutzen", 100);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
}

