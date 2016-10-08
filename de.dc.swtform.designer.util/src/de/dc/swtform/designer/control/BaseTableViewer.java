package de.dc.swtform.designer.control;

import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;

import de.dc.swtform.designer.control.filter.BaseFilter;
import de.dc.swtform.designer.control.sorter.BaseViewerComparator;

public class BaseTableViewer extends Composite implements KeyListener, SelectionListener{
	private Text searchText;
	private Table table;
	private TableViewer viewer;
	private boolean showHeader=true;
	private boolean showLines=true;
	private BaseFilter<?> filter;
	private boolean hasSearch;
	private BaseViewerComparator<?> comparator;
	
	public BaseTableViewer(Composite parent, int style, String[] titles, int[] bounds, boolean hasSearch, LabelProvider labelProvider) {
		super(parent, style);
		this.hasSearch = hasSearch;
		setLayout(new GridLayout(1, false));
		
		if(hasSearch){
			searchText = new Text(this, SWT.BORDER);
			searchText.setMessage("Search...");
			searchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
			searchText.addKeyListener(this);
		}
		
		viewer = new TableViewer(this, SWT.BORDER | SWT.FULL_SELECTION);
		table = viewer.getTable();
		table.setLinesVisible(showLines);
		table.setHeaderVisible(showHeader);
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));
		
		for (int i = 0; i < bounds.length; i++) {
			createColumn(titles[i], bounds[i]);
		}
		
		viewer.setContentProvider(ArrayContentProvider.getInstance());
		viewer.setLabelProvider(labelProvider);
	}

	public void addSorter(BaseViewerComparator<?> sorter){
		comparator = sorter;
		viewer.setComparator(comparator);
	}
	
	public void addFilter(BaseFilter<?> filter){
		this.filter = filter;
		viewer.addFilter(filter);
	}
	
	public TableViewer getViewer(){
		return viewer;
	}
	
	public void setLabelProvider(LabelProvider labelProvider){
		viewer.setLabelProvider(labelProvider);
	}
	
	private void createColumn(String name, int width) {
		TableViewerColumn viewerCol = new TableViewerColumn(viewer, SWT.NONE);
		TableColumn col = viewerCol.getColumn();
		col.setWidth(width);
		col.setText(name);
		col.addSelectionListener(this);
	}

	@Override
	protected void checkSubclass() {
	}

	@Override
	public void keyPressed(KeyEvent e) {
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(hasSearch){
			filter.setSearchText(searchText.getText());
			viewer.refresh();
		}
	}

	public void setShowLines(boolean showLines) {
		this.showLines = showLines;
	}

	public void setShowHeader(boolean showHeader) {
		this.showHeader = showHeader;
	}

	private int getColumnIndex(TableColumn c){
		for (int i = 0; i < viewer.getTable().getColumns().length; i++) {
			if (c==viewer.getTable().getColumns()[i]) {
				return i;
			}
		}
		return 0;
	}
	
	@Override
	public void widgetSelected(SelectionEvent e) {
		if(comparator!=null && e.widget instanceof TableColumn){
			comparator.setColumn(getColumnIndex((TableColumn) e.widget));  
			int dir = comparator.getDirection();  
			viewer.getTable().setSortDirection(dir);  
			viewer.refresh();		
		}
	}

	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

}
