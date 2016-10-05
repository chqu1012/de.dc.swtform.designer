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

class XWidgetToStringMapper {
	extension XLayoutMapper layoutMapper = new XLayoutMapper

	dispatch def String controlName(XButton w)'''«w.name.toFirstLower»Button'''
	dispatch def String controlName(XLabel w)'''«w.name.toFirstLower»Label'''
	dispatch def String controlName(XLabelCombo w)'''«w.name.toFirstLower»Combo'''
	dispatch def String controlName(XCombo w)'''«w.name.toFirstLower»Combo'''
	dispatch def String controlName(XText w)'''«w.name.toFirstLower»Text'''
	dispatch def String controlName(XTableViewer w)'''«w.name.toFirstLower»TableViewer'''
	dispatch def String controlName(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.name.toFirstLower»«ENDFOR»'''
	dispatch def String controlName(XDateTime w)'''«w.name.toFirstLower»DateTime'''
	dispatch def String controlName(XCheckButton w)'''«w.name.toFirstLower»CheckButton'''
	dispatch def String controlName(XRadioButton w)'''«w.name.toFirstLower»RadioButton'''
	dispatch def String controlName(XTableViewerColumn w)''''''
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
	dispatch def String field(XTableViewer w)'''protected TableViewer «w.controlName»;'''
	dispatch def String field(XComposite w)'''«FOR child : w.widgets SEPARATOR '\n'»«child.field»«ENDFOR»'''
	dispatch def String field(XDateTime w)'''protected DateTime «w.controlName»;'''
	dispatch def String field(XCheckButton w)'''protected Button «w.controlName»;'''
	dispatch def String field(XRadioButton w)'''protected Button «w.controlName»;'''
	dispatch def String field(XTableViewerColumn w)''''''
	dispatch def String field(XComboItem w)''''''
	dispatch def String field(XDialogText w)'''protected Text «w.controlName»;'''
	dispatch def String field(XUnitLabel w)'''protected Text «w.controlName»;'''
	dispatch def String field(XSpinner w)'''protected Spinner «w.controlName»;'''
	dispatch def String field(XLink w)'''protected Link «w.controlName»;'''


	dispatch def createWidget(XButton w)'''
	«w.name.toFirstLower»Button = SwtFactory.createPushButton(this, "«w.name»");
	«w.getGridData('Button')»'''

	dispatch def createWidget(XLabel w)'''
	«w.name»Label = SwtFactory.createLabel(this, "«w.name»", «w.width»);
	«w.getGridData('Label')»'''

	dispatch def createWidget(XLabelCombo w)'''
	Composite «w.name»Container = SwtFactory.createGridComposite(this, 3, 5, 0);
	SwtFactory.createLabel(«w.name»Container, «w.name», «w.width»);
	container.setLayoutDate(«w.getGridData('Label')»);
	«w.name»Combo = new Combo(«w.name»Container, SWT.NONE);
	«w.name»Combo.createComboItems(new String(){«w.items.map['\"'+it.name+'\"'].reduce[p1, p2|p1+','+p2]»});
	«w.getGridData('Combo')»''' 

	dispatch def createWidget(XText w)'''«w.name»Text = SwtFactory.createText(this, "«w.message»");
	«w.getGridData('Text')»;'''  

	dispatch def createWidget(XCombo w)'''Combo  «w.name»Combo = new Combo(this, SWT.NONE);
	«w.getGridData('Text')»'''

	dispatch def createWidget(XTableViewer w)'''
	Compposite «w.name»Container = SwtFactory.createGridComposite(this, 1, 0, 0);
	«w.getGridData('Composite')»
	«IF w.hasSearch»
	Text search«w.name»Text = SwtFactory.creatText(«w.name»Container);
	search«w.name»Text.setMessage("Search");
	«ENDIF»
	TableViewer «w.name»TableViewer = new TableViewer(«w.name»Container, SWT.BORDER);
	«w.name»TableViewer.getTable().setHeaderVisible(«w.showHeader»);
	«w.name»TableViewer.getTable().setLinesVisible(«w.showLines»);
	'''
	dispatch def createWidget(XDateTime w)'''DateTime «w.name»DateTime = new DateTime(this, SWT.DATE | SWT.DROP_DOWN);
	«w.getGridData('Composite')»'''

	dispatch def createWidget(XComposite w)'''Composite «w.name»Composite = new Composite(this, SWT.NONE);'''
	dispatch def createWidget(XCheckButton w)'''Button «w.name»Button = new Bubtton(this, SWT.CHECK);'''
	dispatch def createWidget(XRadioButton w)'''Button «w.name»Button = new Bubtton(this, SWT.READIO);'''
	dispatch def createWidget(XToogleButton w)'''Button «w.name»Button = new Bubtton(this, SWT.TOGGLE);'''
	dispatch def createWidget(XTableViewerColumn w)''''''
	dispatch def createWidget(XComboItem w)''''''

//	dispatch def createWidget(XDialogText w) {
//		val container = SwtFactory.createGridComposite(this, 3, 5, 0)
//		container.initLayoutData = w.layoutData
//		SwtFactory.createLabel(container, w.name, w.labelWidth)
//		val text = SwtFactory.creatText(container)
//		val button = SwtFactory.createPushButton(container, '...')
//		button.addSelectionListener(new SelectionAdapter() {
//			override widgetSelected(SelectionEvent e) {
//				switch w.dialogType {
//					case OPEN_FILE: {
//						text.text = SwtFactory.openFileDialog(SWT.OPEN)
//						return
//					}
////					case OPEN_COLOR:
//					case OPEN_DIRECTORY: {
//						var fd = new DirectoryDialog(new Shell, SWT.OPEN)
//						val path = fd.open
//						if (path != null) {
//							text.text = path
//						}
//						return
//					}
////					case OPEN_FONT:
//					case SAVE_FILE: {
//						text.text = SwtFactory.openFileDialog(SWT.SAVE)
//						return
//					}
//					default: {
//					}
//				}
//			}
//		})
//		text.data = w
//		text
//	}

	dispatch def createWidget(XUnitLabel w)'''
	«w.name.toFirstLower»Text = SwtFactory.createLabelUnit(this, "«w.name.toFirstUpper»", "«w.unit.toFirstUpper»", «w.width», 3, 5, 0 «IF w.layoutData!=null»«w.layoutData.fillLayoutData»«ENDIF»);
	''' 
	
	dispatch def fillLayoutData(XGridData d)'''«val gd = d as XGridData», «gd.horizontalAlignment», «gd.verticalAlignment», «gd.grabExcessHorizontalSpace», «gd.grabExcessVerticalSpace», «gd.horizontalSpan», «gd.verticalSpan», «gd.widthHint», «gd.heightHint»'''
	dispatch def fillLayoutData(XFillData d)''''''
	
	
//	dispatch def createWidget(XSpinner w) {
//		val control = new Spinner(this, SWT.READ_ONLY)
//		control.setMinimum(0)
//		control.setMaximum(1000)
//		control.setSelection(500)
//		control.setIncrement(1)
//		control.setPageIncrement(100)
//		control.data = w
//		control.initLayoutData(w.layoutData)
//		control
//	}
//
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
//		control.text = w.name
//		control.data = w
//		control.initLayoutData(w.layoutData)
//		control
//	}
//
//	def createLabelContainer(XLabel w) {
//		val container = SwtFactory.createGridComposite(this, 3, 5, 0)
//		SwtFactory.createLabel(container, w.name, w.width)
//		container.initLayoutData(w.layoutData)
//		container
//	}
//
//	def createComboItems(Combo combo, EList<XComboItem> items) {
//		items.forEach[combo.add = it.name]
//	}
//
//	def createTableViewerColumn(TableViewer viewer, XTableViewerColumn w) {
//		val col = new TableViewerColumn(viewer, SWT.NONE)
//		col.column.width = w.size
//		col.column.text = w.name
//	}
//
//	def initLayoutData(Control control, XLayoutData ld) {
//		if (ld != null) {
//			control.layoutData(ld)
//		}
//	}

	def getGridData(XWidget w, String widgetType)'''
	«IF w.layoutData instanceof XGridData»
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