package de.dc.swtform.example.control;

import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.dc.swtform.designer.control.BaseTableViewer;
import de.dc.swtform.designer.util.LayoutFactory;
import de.dc.swtform.designer.util.SwtFactory;
import de.dc.swtform.example.control.filter.ContactsFilter;
import de.dc.swtform.example.control.provider.ContactsLabelProvider;

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

