package de.dc.swtform.designer.util

import de.dc.swtform.layout.model.XFillData
import de.dc.swtform.layout.model.XGridData
import de.dc.swtform.layout.model.XLayoutData
import de.dc.swtform.xcore.widget.XButton
import de.dc.swtform.xcore.widget.XCheckButton
import de.dc.swtform.xcore.widget.XCombo
import de.dc.swtform.xcore.widget.XComboItem
import de.dc.swtform.xcore.widget.XComposite
import de.dc.swtform.xcore.widget.XDateTime
import de.dc.swtform.xcore.widget.XDialogText
import de.dc.swtform.xcore.widget.XLabel
import de.dc.swtform.xcore.widget.XLink
import de.dc.swtform.xcore.widget.XRadioButton
import de.dc.swtform.xcore.widget.XSpinner
import de.dc.swtform.xcore.widget.XTableViewer
import de.dc.swtform.xcore.widget.XTableViewerColumn
import de.dc.swtform.xcore.widget.XText
import de.dc.swtform.xcore.widget.XToogleButton
import de.dc.swtform.xcore.widget.XUnitLabel
import org.eclipse.emf.common.util.EList
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.DateTime
import org.eclipse.swt.widgets.DirectoryDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Link
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.widgets.Text
import de.dc.swtform.xcore.widget.XLabelCombo
import de.dc.swtform.xcore.widget.XTreeViewer

class XWidgetToSwtMapper {

	extension XLayoutMapper layoutMapper = new XLayoutMapper

	dispatch def createWidget(Composite parent, XButton w) {
		val control = SwtFactory.createPushButton(parent, w.text)
		control.initLayoutData(w.layoutData)
		control.data = w
		control
	}

	dispatch def createWidget(Composite parent, XLabel w) {
		val control = new Label(parent, SWT.NONE)
		if (w.text != null) {
			control.text = w.text
		}
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	dispatch def createWidget(Composite parent, XLabelCombo w) {
		val container = createLabelContainer(parent, w)
		val combo = new Combo(container, SWT.NONE)
		combo.createComboItems(w.items)
		combo.initLayoutData(w.layoutData)
		combo.data = w
		combo
	}

	dispatch def createWidget(Composite parent, XText w) {
		val control = new Text(parent, SWT.NONE)
		if (w.message != null) {
			control.message = w.message
		}
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	dispatch def createWidget(Composite parent, XCombo w) {
		val control = new Combo(parent, SWT.NONE)
		control.createComboItems(w.items)
		control.initLayoutData(w.layoutData)
		control.data = w
		control
	}

	dispatch def createWidget(Composite parent, XTableViewer w) {
//		val styles = w.style?.map[value].reduce[p1, p2|p1.bitwiseOr(p2)]
		val container = SwtFactory.createGridComposite(parent, 1, 0, 0)
		container.initLayoutData(w.layoutData)
		if (w.hasSearch) {
			val searchText = SwtFactory.createText(container)
			searchText.message = 'Search'
		}
		val control = new TableViewer(container, SWT.BORDER)
		control.table.headerVisible = w.showHeader
		control.table.linesVisible = w.showLines
		w.columns.forEach[control.createTableViewerColumn(it)]
		control.control.initLayoutData(w.layoutData)
		control.table.data = w
		control.table
	}
	
	dispatch def createWidget(Composite parent, XTreeViewer w){
		val viewer = SwtFactory.createTreeViewer(parent)
		viewer.tree.headerVisible=true
		viewer.tree.linesVisible = true
		viewer.control.initLayoutData(w.layoutData)
		viewer.control
	}

	dispatch def createWidget(Composite parent, XComposite w) {
		val control = new Composite(parent, SWT.NONE)
		control.initialize(w.layout)
		control.initLayoutData(w.layoutData)
		control.data = w
		w.widgets.forEach[widget|control.createWidget(widget)]
		control
	}

	dispatch def createWidget(Composite parent, XDateTime w) {
		val control = new DateTime(parent, SWT.DATE.bitwiseOr(SWT.DROP_DOWN))
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	dispatch def createWidget(Composite parent, XCheckButton w) {
		createButton(parent, SWT.CHECK, w)
	}

	dispatch def createWidget(Composite parent, XRadioButton w) {
		createButton(parent, SWT.RADIO, w)
	}

	dispatch def createWidget(Composite parent, XToogleButton w) {
		createButton(parent, SWT.TOGGLE, w)
	}

	dispatch def createWidget(Composite parent, XTableViewerColumn w) {
	}

	dispatch def createWidget(Composite parent, XComboItem w) {
	}

	dispatch def createWidget(Composite parent, XDialogText w) {
		val container = SwtFactory.createGridComposite(parent, 3, 5, 0)
		container.initLayoutData = w.layoutData
		SwtFactory.createLabel(container, w.text, w.labelWidth)
		val text = SwtFactory.createText(container)
		val button = SwtFactory.createPushButton(container, '...')
		button.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				switch w.dialogType {
					case OPEN_FILE: {
						text.text = SwtFactory.openFileDialog(SWT.OPEN)
						return
					}
//					case OPEN_COLOR:
					case OPEN_DIRECTORY: {
						var fd = new DirectoryDialog(new Shell, SWT.OPEN)
						val path = fd.open
						if (path != null) {
							text.text = path
						}
						return
					}
//					case OPEN_FONT:
					case SAVE_FILE: {
						text.text = SwtFactory.openFileDialog(SWT.SAVE)
						return
					}
					default: {
					}
				}
			}
		})
		text.data = w
		text
	}

	dispatch def createWidget(Composite parent, XUnitLabel w) {
		val container = SwtFactory.createGridComposite(parent, 3, 5, 0)
		SwtFactory.createLabel(container, w.text, w.width)
		val text = SwtFactory.createText(container)
		SwtFactory.createLabel(container, w.unit, 30)
		text.data = w
		container.initLayoutData(w.layoutData)
		text
	}

	dispatch def createWidget(Composite parent, XSpinner w) {
		val control = new Spinner(parent, SWT.READ_ONLY)
		control.setMinimum(0)
		control.setMaximum(1000)
		control.setSelection(500)
		control.setIncrement(1)
		control.setPageIncrement(100)
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	dispatch def createWidget(Composite parent, XLink w) {
		val control = new Link(parent, SWT.NONE);
		control.text = "<a>" + w.url + "</a>"
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	def createButton(Composite parent, int style, XButton w) {
		val control = new Button(parent, style)
		control.selection = w.isSelected
		control.text = w.text
		control.data = w
		control.initLayoutData(w.layoutData)
		control
	}

	def createLabelContainer(Composite parent, XLabel w) {
		val container = SwtFactory.createGridComposite(parent, 3, 5, 0)
		SwtFactory.createLabel(container, w.text, w.width)
		container.initLayoutData(w.layoutData)
		container
	}

	def createComboItems(Combo combo, EList<XComboItem> items) {
		items.forEach[combo.add = it.text]
	}

	def createTableViewerColumn(TableViewer viewer, XTableViewerColumn w) {
		val col = new TableViewerColumn(viewer, SWT.NONE)
		col.column.width = w.size
		col.column.text = w.text
	}

	def initLayoutData(Control control, XLayoutData ld) {
		if (ld != null) {
			control.layoutData(ld)
		}
	}

	dispatch def layoutData(Control control, XGridData ld) {
		val gd = new GridData() => [
			grabExcessHorizontalSpace = ld.grabExcessHorizontalSpace
			grabExcessVerticalSpace = ld.grabExcessVerticalSpace
			horizontalAlignment = ld.horizontalAlignment
			verticalAlignment = ld.verticalAlignment
			widthHint = ld.widthHint
			heightHint = ld.heightHint
			horizontalSpan = ld.horizontalSpan
			verticalSpan = ld.verticalSpan
		]
		control.layoutData = gd
	}

	dispatch def layoutData(Control control, XFillData ld) {
	}
}
