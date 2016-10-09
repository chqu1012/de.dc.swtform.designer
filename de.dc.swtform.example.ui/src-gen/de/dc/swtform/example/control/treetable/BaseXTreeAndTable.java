package de.dc.swtform.example.control.treetable;

import de.dc.swtform.designer.control.*;
import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.*;
import de.dc.swtform.example.control.treetable.filter.*;	
import de.dc.swtform.example.control.treetable.provider.*;
import de.dc.swtform.example.control.treetable.sorter.*;
public abstract class BaseXTreeAndTable extends Composite implements SelectionListener{
	
	protected TreeViewer familienstammbaumTreeViewer;
	protected TableViewer contactsTableViewer;
	protected Text searchContactsText;
	
	public BaseXTreeAndTable(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		familienstammbaumTreeViewer = SwtFactory.createTreeViewer(this, false);
		SwtFactory.createTreeViewerColumn(familienstammbaumTreeViewer, "Name", 300);
		SwtFactory.createTreeViewerColumn(familienstammbaumTreeViewer, "Vorname", 300);
		familienstammbaumTreeViewer.getTree().setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
		String[] titles = new String[]{"Name", "Vorname", "Handy"};
		int[] bounds = new int[]{100, 100, 100};
		LabelProvider labelProvider = new ContactsLabelProvider();
		BaseTableViewer contactsComposite = SwtFactory.createSearchTableViewer(this, titles, bounds, true, labelProvider);
		contactsComposite.addFilter(new ContactsFilter());
		contactsComposite.addSorter(new ContactsSorter());
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

