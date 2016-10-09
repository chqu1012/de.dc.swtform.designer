package de.dc.swtform.designer.util

import de.dc.swtform.layout.model.XFillData
import de.dc.swtform.layout.model.XGridData
import de.dc.swtform.xcore.widget.XButton
import de.dc.swtform.xcore.widget.XCheckButton
import de.dc.swtform.xcore.widget.XCombo
import de.dc.swtform.xcore.widget.XComboItem
import de.dc.swtform.xcore.widget.XComposite
import de.dc.swtform.xcore.widget.XDateTime
import de.dc.swtform.xcore.widget.XDialogText
import de.dc.swtform.xcore.widget.XLabel
import de.dc.swtform.xcore.widget.XLabelCombo
import de.dc.swtform.xcore.widget.XLink
import de.dc.swtform.xcore.widget.XRadioButton
import de.dc.swtform.xcore.widget.XSpinner
import de.dc.swtform.xcore.widget.XTableViewer
import de.dc.swtform.xcore.widget.XTableViewerColumn
import de.dc.swtform.xcore.widget.XText
import de.dc.swtform.xcore.widget.XToogleButton
import de.dc.swtform.xcore.widget.XUnitLabel
import de.dc.swtform.xcore.widget.XWidget
import de.dc.swtform.xcore.widget.XTreeViewer
import de.dc.swtform.xcore.widget.XTreeViewerColumn
import de.dc.swtform.xcore.widget.XMenu
import de.dc.swtform.xcore.widget.XMenuItem
import de.dc.swtform.xcore.widget.ISelectable
import de.dc.swtform.xcore.widget.XDialogType
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.SWT

class XWidgetToStringMapper {
	extension XLayoutMapper layoutMapper = new XLayoutMapper

	dispatch def String widgetSelectedMethod(XButton w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XLabel w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XLabelCombo w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XCombo w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XText w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XComposite w, boolean isAbstract)'''«FOR child : w.widgets SEPARATOR '\n'»«child.registerWidgetSelectedMethod(isAbstract)»«ENDFOR»'''
	dispatch def String widgetSelectedMethod(XDateTime w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XCheckButton w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XMenu w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XMenuItem w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XRadioButton w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XTableViewerColumn w, boolean isAbstract)''''''
	dispatch def String widgetSelectedMethod(XTreeViewerColumn w, boolean isAbstract)''''''
	dispatch def String widgetSelectedMethod(XComboItem w, boolean isAbstract)''''''
	dispatch def String widgetSelectedMethod(XDialogText w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XUnitLabel w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XSpinner w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	dispatch def String widgetSelectedMethod(XLink w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»'''
	
	dispatch def String widgetSelectedMethod(XTableViewer w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerWidgetSelectedMethod(isAbstract)»«ENDFOR»'''
	
	dispatch def String widgetSelectedMethod(XTreeViewer w, boolean isAbstract)'''«w.registerWidgetSelectedMethod(isAbstract)»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerWidgetSelectedMethod(isAbstract)»«ENDFOR»'''

	dispatch def String widgetSelected(XButton w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XLabel w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XLabelCombo w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XCombo w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XText w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.registerWidgetSelected»«ENDFOR»'''
	dispatch def String widgetSelected(XDateTime w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XCheckButton w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XMenu w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XMenuItem w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XRadioButton w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XTableViewerColumn w)''''''
	dispatch def String widgetSelected(XTreeViewerColumn w)''''''
	dispatch def String widgetSelected(XComboItem w)''''''
	dispatch def String widgetSelected(XDialogText w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XUnitLabel w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XSpinner w)'''«w.registerWidgetSelected»'''
	dispatch def String widgetSelected(XLink w)'''«w.registerWidgetSelected»'''
	
	dispatch def String widgetSelected(XTableViewer w)'''«w.registerWidgetSelected»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerWidgetSelected»«ENDFOR»'''
	
	dispatch def String widgetSelected(XTreeViewer w)'''«w.registerWidgetSelected»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerWidgetSelected»«ENDFOR»'''

	dispatch def String addListener(XButton w)'''«w.registerISelectable»'''
	dispatch def String addListener(XLabel w)'''«w.registerISelectable»'''
	dispatch def String addListener(XLabelCombo w)'''«w.registerISelectable»'''
	dispatch def String addListener(XCombo w)'''«w.registerISelectable»'''
	dispatch def String addListener(XText w)'''«w.registerISelectable»'''
	dispatch def String addListener(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.registerISelectable»«ENDFOR»'''
	dispatch def String addListener(XDateTime w)'''«w.registerISelectable»'''
	dispatch def String addListener(XCheckButton w)'''«w.registerISelectable»'''
	dispatch def String addListener(XMenu w)'''«w.registerISelectable»'''
	dispatch def String addListener(XMenuItem w)'''«w.registerISelectable»'''
	dispatch def String addListener(XRadioButton w)'''«w.registerISelectable»'''
	dispatch def String addListener(XTableViewerColumn w)''''''
	dispatch def String addListener(XTreeViewerColumn w)''''''
	dispatch def String addListener(XComboItem w)''''''
	dispatch def String addListener(XDialogText w)'''«w.registerISelectable»'''
	dispatch def String addListener(XUnitLabel w)'''«w.registerISelectable»'''
	dispatch def String addListener(XSpinner w)'''«w.registerISelectable»'''
	dispatch def String addListener(XLink w)'''«w.registerISelectable»'''
	
	dispatch def String addListener(XTableViewer w)'''«w.registerISelectable»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerISelectable»«ENDFOR»'''
	
	dispatch def String addListener(XTreeViewer w)'''«w.registerISelectable»
	«FOR child : w.menu.items SEPARATOR '\n'»«child.registerISelectable»«ENDFOR»'''
	
	def String registerISelectable(XWidget w)'''«IF w instanceof ISelectable»
	«val s = w as ISelectable»«IF s.hasSelectionListener»«w.controlName».addSelectionListener(this);«ENDIF»
	«ENDIF»'''

	def String registerWidgetSelected(XWidget w)'''«IF w instanceof ISelectable»
	«val selection = w as ISelectable»
	«IF selection.hasSelectionListener»
	if(«w.controlName»==e.getSource()){
		on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(e);
	} 
	«ENDIF»
	«ENDIF»'''
	
	def String registerWidgetSelectedMethod(XWidget w, boolean isAbstract)'''«IF w instanceof ISelectable»
	«val selection = w as ISelectable»«IF selection.hasSelectionListener»
	«IF isAbstract»
	protected abstract void on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(SelectionEvent e);
	«ELSE»
	@Override
	protected void on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(SelectionEvent e) {
		// TODO: «w.name» button implementation
		System.out.println("«w.name» button implementation");
	}
	«ENDIF»
	«ENDIF»«ENDIF»'''
	
	dispatch def String controlName(XButton w)'''«w.name.toFirstLower»Button'''
	dispatch def String controlName(XLabel w)'''«w.name.toFirstLower»Label'''
	dispatch def String controlName(XLabelCombo w)'''«w.name.toFirstLower»Combo'''
	dispatch def String controlName(XCombo w)'''«w.name.toFirstLower»Combo'''
	dispatch def String controlName(XText w)'''«w.name.toFirstLower»Text'''
	dispatch def String controlName(XTableViewer w)'''«w.name.toFirstLower»TableViewer'''
	dispatch def String controlName(XTreeViewer w)'''«w.name.toFirstLower»TreeViewer'''
	dispatch def String controlName(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.name.toFirstLower»«ENDFOR»'''
	dispatch def String controlName(XDateTime w)'''«w.name.toFirstLower»DateTime'''
	dispatch def String controlName(XCheckButton w)'''«w.name.toFirstLower»CheckButton'''
	dispatch def String controlName(XMenu w)'''«w.name.toFirstLower»Menu'''
	dispatch def String controlName(XMenuItem w)'''«w.name.toFirstLower»MenuItem'''
	dispatch def String controlName(XRadioButton w)'''«w.name.toFirstLower»RadioButton'''
	dispatch def String controlName(XTableViewerColumn w)''''''
	dispatch def String controlName(XTreeViewerColumn w)''''''
	dispatch def String controlName(XComboItem w)''''''
	dispatch def String controlName(XDialogText w)'''«w.name.toFirstLower»DialogText'''
	dispatch def String controlName(XUnitLabel w)'''«w.name.toFirstLower»Text'''
	dispatch def String controlName(XSpinner w)'''«w.name.toFirstLower»Spinner'''
	dispatch def String controlName(XLink w)'''«w.name.toFirstLower»Link'''

	dispatch def String field(XButton w)'''protected Button «w.controlName»;'''
	dispatch def String field(XLabel w)'''protected Label «w.controlName»;'''
	dispatch def String field(XLabelCombo w)'''protected Combo «w.controlName»;'''
	dispatch def String field(XCombo w)'''protected Combo «w.controlName»;'''
	dispatch def String field(XText w)'''protected Text «w.controlName»;'''
	dispatch def String field(XTreeViewer w)'''protected TreeViewer «w.controlName»;'''
	dispatch def String field(XTableViewer w)'''
	protected TableViewer «w.controlName»;
	«IF w.hasSearch»
	protected Text search«w.name.toFirstUpper»Text;
	«ENDIF»
	«IF w.menu!=null»
	«w.menu.field»
	«FOR item : w.menu.items SEPARATOR '\n'»«item.field»«ENDFOR»
	«ENDIF»
	'''
	dispatch def String field(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.field»«ENDFOR»'''
	dispatch def String field(XDateTime w)'''protected DateTime «w.controlName»;'''
	dispatch def String field(XCheckButton w)'''protected Button «w.controlName»;'''
	dispatch def String field(XRadioButton w)'''protected Button «w.controlName»;'''
	dispatch def String field(XTableViewerColumn w)''''''
	dispatch def String field(XTreeViewerColumn w)''''''
	dispatch def String field(XComboItem w)''''''
	dispatch def String field(XDialogText w)'''protected Text «w.controlName»;'''
	dispatch def String field(XUnitLabel w)'''protected Text «w.controlName»;'''
	dispatch def String field(XSpinner w)'''protected Spinner «w.controlName»;'''
	dispatch def String field(XLink w)'''protected Link «w.controlName»;'''
	dispatch def String field(XMenu w)'''protected Menu «w.controlName»;'''
    dispatch def String field(XMenuItem w)'''protected MenuItem «w.controlName»;'''

	dispatch def createWidget(XButton w)'''
	«w.name.toFirstLower»Button = SwtFactory.createPushButton(this, "«w.text»");
	«w.getGridData('Button')»'''

	dispatch def createWidget(XLabel w)'''
	«w.name»Label = SwtFactory.createLabel(this, "«w.text»", «w.width»);
	«w.getGridData('Label')»'''

	dispatch def createWidget(XLabelCombo w)'''
	Composite «w.name»Container = SwtFactory.createGridComposite(this, 3, 5, 0);
	SwtFactory.createLabel(«w.name»Container, "«w.text»", «w.width»);
	«w.name.toFirstLower»Combo = new Combo(«w.name»Container, SWT.NONE);
	SwtFactory.createComboItems(«w.name.toFirstLower»Combo,new String[]{«w.items.map['\"'+it.text+'\"'].reduce[p1, p2|p1+','+p2]»});
	«w.getGridData('Combo')»''' 

	dispatch def createWidget(XText w)'''«w.name»Text = SwtFactory.createText(this, "«w.message»");
	«w.getGridData('Text')»;'''  

	dispatch def createWidget(XCombo w)'''Combo  «w.name»Combo = new Combo(this, SWT.NONE);
	«w.getGridData('Text')»'''

	dispatch def createWidget(XTableViewer w)'''
	«val name = w.name.toFirstLower+"Composite"»
	String[] titles = new String[]{«w.columns.map['"'+it.text+'"'].reduce[p1, p2|p1+', '+p2]»};
	int[] bounds = new int[]{«w.columns.map[size+''].reduce[p1, p2|p1+', '+p2]»};
	LabelProvider labelProvider = new «w.name.toFirstUpper»LabelProvider();
	BaseTableViewer «name» = SwtFactory.createSearchTableViewer(this, titles, bounds, «w.hasSearch», labelProvider);
	«name».addFilter(new «w.name.toFirstUpper»Filter());
	«name».addSorter(new «w.name.toFirstUpper»Sorter());
	«w.name.toFirstLower»TableViewer = «name».getViewer();
	«IF w.menu!=null»
	«w.menu.name.toFirstLower»Menu = SwtFactory.createMenu(«w.name.toFirstLower»TableViewer.getTable());
	«FOR item: w.menu.items»
	«item.name.toFirstLower»MenuItem = SwtFactory.createMenuItem(«w.menu.name.toFirstLower»Menu, "«item.text»");
	«ENDFOR»
	«ENDIF»
	«w.getGridData('Composite')»
	'''
    dispatch def createWidget(XTreeViewer w)'''
	«val name = w.name.toFirstLower+"TreeViewer"»
	«name» = SwtFactory.createTreeViewer(this, «w.hasFilter»);
	«FOR c : w.columns»
	SwtFactory.createTreeViewerColumn(«name», "«c.text»", «c.size»);
	«ENDFOR»
	«w.getGridData('TreeViewer.getTree()')»
	'''
	dispatch def createWidget(XDateTime w)'''DateTime «w.name»DateTime = new DateTime(this, SWT.DATE | SWT.DROP_DOWN);
	«w.getGridData('Composite')»'''

	dispatch def createWidget(XComposite w)'''Composite «w.name»Composite = new Composite(this, SWT.NONE);
	«FOR child : w.widgets»«child.createWidget»«ENDFOR»'''
	
	dispatch def createWidget(XCheckButton w)'''Button «w.name»Button = new Button(this, SWT.CHECK);'''
	dispatch def createWidget(XRadioButton w)'''Button «w.name»Button = new Button(this, SWT.READIO);'''
	dispatch def createWidget(XToogleButton w)'''Button «w.name»Button = new Button(this, SWT.TOGGLE);'''
	dispatch def createWidget(XMenu w)'''«w.name»Menu = new Menu(this);'''
	dispatch def createWidget(XMenuItem w)'''«w.name»MenuItem = new MenuItem(this);'''
	dispatch def createWidget(XTableViewerColumn w)''''''
	dispatch def createWidget(XTreeViewerColumn w)''''''
	dispatch def createWidget(XComboItem w)''''''

	dispatch def createWidget(XDialogText w)'''«val name = w.name.toFirstLower»«val container = name+'Container'»
	Composite «container» = SwtFactory.createGridComposite(this, 3, 5, 0);
	«w.getGridData('Container')»
	SwtFactory.createLabel( «container», "«w.text»", «w.labelWidth»);
	«name»DialogText = SwtFactory.createText(«container»);
	Button «name»Button = SwtFactory.createPushButton(«container», "...");
	«name»Button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			«switch (w.dialogType) {
				case OPEN_COLOR: {}
				case OPEN_DIRECTORY: {'''«name»DialogText.setText(SwtFactory.openDirectoryDialog());'''}
				case OPEN_FILE: {'''«name»DialogText.setText(SwtFactory.openFileDialog(SWT.OPEN));'''}
				case OPEN_FONT: {}
				case SAVE_FILE:{'''«name»DialogText.setText(SwtFactory.openFileDialog(SWT.SAVE));'''}
				default: { return "";}
			}»
		}
	});
	'''
	dispatch def createWidget(XUnitLabel w)'''
	«w.name.toFirstLower»Text = SwtFactory.createLabelUnit(this, "«w.text.toFirstUpper»", "«w.unit.toFirstUpper»", «w.width», 3, 5, 0 «IF w.layoutData!=null»«w.layoutData.fillLayoutData»«ENDIF»);
	''' 
	
	dispatch def fillLayoutData(XGridData d)'''«val gd = d as XGridData», «gd.horizontalAlignment», «gd.verticalAlignment», «gd.grabExcessHorizontalSpace», «gd.grabExcessVerticalSpace», «gd.horizontalSpan», «gd.verticalSpan», «gd.widthHint», «gd.heightHint»'''
	dispatch def fillLayoutData(XFillData d)''''''
	
	dispatch def createWidget(XSpinner w)'''
	«w.name.toFirstLower»Spinner = SwtFactory.createSpinner(this, «w.readOnly», «w.minimum», «w.maximum», «w.selection», «w.increment», «w.pageIncrement»);
	«w.getGridData('Spinner')»
	'''

//	dispatch def createWidget(XLink w) {
//		val control = new Link(this, SWT.NONE);
//		control.text = "<a>" + w.url + "</a>"
//		control.data = w
//		control.initLayoutData(w.layoutData)
//		control
//	}
//
//	def createButton(int style, XButton w) {
//		val control = new Button(this, style)
//		control.selection = w.isSelected
//		control.text = w.text
//		control.data = w
//		control.initLayoutData(w.layoutData)
//		control
//	}
//
//	def createLabelContainer(XLabel w) {
//		val container = SwtFactory.createGridComposite(this, 3, 5, 0)
//		SwtFactory.createLabel(container, w.text, w.width)
//		container.initLayoutData(w.layoutData)
//		container
//	}
//
//	def createComboItems(Combo combo, EList<XComboItem> items) {
//		items.forEach[combo.add = it.text]
//	}
//
//	def createTableViewerColumn(TableViewer viewer, XTableViewerColumn w) {
//		val col = new TableViewerColumn(viewer, SWT.NONE)
//		col.column.width = w.size
//		col.column.text = w.text
//	}
//
//	def initLayoutData(Control control, XLayoutData ld) {
//		if (ld != null) {
//			control.layoutData(ld)
//		}
//	}

	def getGridData(XWidget w, String widgetType)'''
	«IF w.layoutData!=null && w.layoutData instanceof XGridData»
	«w.name.toFirstLower»«widgetType».setLayoutData(LayoutFactory.gridData(«(w.layoutData as XGridData).horizontalAlignment», «(w.layoutData as XGridData).verticalAlignment», «(w.layoutData as XGridData).grabExcessHorizontalSpace», «(w.layoutData as XGridData).grabExcessVerticalSpace», «(w.layoutData as XGridData).horizontalSpan», «(w.layoutData as XGridData).verticalSpan», «(w.layoutData as XGridData).widthHint», «(w.layoutData as XGridData).heightHint»));
	«ENDIF»
	'''

//	dispatch def layoutData(Control control, XGridData ld) {
//		val gd = new GridData() => [
//			grabExcessHorizontalSpace = ld.grabExcessHorizontalSpace
//			grabExcessVerticalSpace = ld.grabExcessVerticalSpace
//			horizontalAlignment = ld.horizontalAlignment
//			verticalAlignment = ld.verticalAlignment
//			widthHint = ld.widthHint
//			heightHint = ld.heightHint
//			horizontalSpan = ld.horizontalSpan
//			verticalSpan = ld.verticalSpan
//		]
//		control.layoutData = gd
//	}
//
//	dispatch def layoutData(Control control, XFillData ld) {
//	}
}