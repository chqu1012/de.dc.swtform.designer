package de.dc.swtform.example.control.tree;

import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

import de.dc.swtform.designer.util.LayoutFactory;
import de.dc.swtform.designer.util.SwtFactory;
public abstract class BaseXTreeViewer extends Composite implements SelectionListener{
	
	protected TreeViewer familienstammbaumTreeViewer;
	
	public BaseXTreeViewer(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		familienstammbaumTreeViewer = SwtFactory.createTreeViewer(this);
		familienstammbaumTreeViewer.getTree().setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
			}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
}

