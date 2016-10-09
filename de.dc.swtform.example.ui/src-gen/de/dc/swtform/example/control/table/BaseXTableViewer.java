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
	protected Menu menuMenu;
	protected MenuItem neuMenuItem;
	protected MenuItem bearbeitenMenuItem;
	
	protected Text Text;
	protected Combo titelCombo;
	protected Label beschreibungLabel;
	protected Button pushButton;
	protected Label testLabel;
	protected Button testButton;
	
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
		menuMenu = SwtFactory.createMenu(contactsTableViewer.getTable());
		neuMenuItem = SwtFactory.createMenuItem(menuMenu, "Neu");
		bearbeitenMenuItem = SwtFactory.createMenuItem(menuMenu, "Bearbeiten");
		contactsComposite.setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
		Text = SwtFactory.createLabelUnit(this, "Kilometerstand", "Km", 100, 3, 5, 0 );
		Composite titelContainer = SwtFactory.createGridComposite(this, 3, 5, 0);
		SwtFactory.createLabel(titelContainer, "Titel", 100);
		titelCombo = new Combo(titelContainer, SWT.NONE);
		SwtFactory.createComboItems(titelCombo,new String[]{"Dr.","Bachelor","Master","Diplom"});
		beschreibungLabel = SwtFactory.createLabel(this, "Hallo Welt kann man auch anders benutzen", 100);
		pushButton = SwtFactory.createPushButton(this, "Push");
		Composite Composite = new Composite(this, SWT.NONE);
			testLabel = SwtFactory.createLabel(this, "test", 100);
			testButton = SwtFactory.createPushButton(this, "test");
		
				bearbeitenMenuItem.addSelectionListener(this);
		pushButton.addSelectionListener(this);
		
		testButton.addSelectionListener(this);
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
		
				if(bearbeitenMenuItem==e.getSource()){
				onBearbeitenSelection(e);
			} 
		if(pushButton==e.getSource()){
			onPushSelection(e);
		} 
		
		if(testButton==e.getSource()){
			onTestSelection(e);
		} 
	}
	
	
			protected abstract void onBearbeitenSelection(SelectionEvent e);
	protected abstract void onPushSelection(SelectionEvent e);
	
	protected abstract void onTestSelection(SelectionEvent e);
}
