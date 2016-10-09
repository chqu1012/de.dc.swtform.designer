package de.dc.swtform.example.control.treeviewer;

import de.dc.swtform.designer.control.*;
import de.dc.swtform.designer.util.*;	

import org.eclipse.swt.layout.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.widgets.*;
import org.eclipse.jface.viewers.*;
import org.eclipse.swt.*;
public abstract class BaseXTreeViewer extends Composite implements SelectionListener{
	
	protected TreeViewer familienstammbaumTreeViewer;
	
	public BaseXTreeViewer(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
		familienstammbaumTreeViewer = SwtFactory.createTreeViewer(this, false);
		SwtFactory.createTreeViewerColumn(familienstammbaumTreeViewer, "Name", 300);
		SwtFactory.createTreeViewerColumn(familienstammbaumTreeViewer, "Vorname", 300);
		familienstammbaumTreeViewer.getTree().setLayoutData(LayoutFactory.gridData(4, 4, true, true, 1, 1, -1, -1));
			}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
}

