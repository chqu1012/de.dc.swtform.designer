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
import de.dc.swtform.xcore.widget.XLabel
import de.dc.swtform.xcore.widget.XLink
import de.dc.swtform.xcore.widget.XRadioButton
import de.dc.swtform.xcore.widget.XSpinner
import de.dc.swtform.xcore.widget.XTableViewer
import de.dc.swtform.xcore.widget.XTableViewerColumn
import de.dc.swtform.xcore.widget.XText
import de.dc.swtform.xcore.widget.XToogleButton
import org.eclipse.emf.common.util.EList
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.events.SelectionAdapter
import org.eclipse.swt.events.SelectionEvent
import org.eclipse.swt.layout.GridData
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.DateTime
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Link
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Spinner
import org.eclipse.swt.widgets.Text
import de.dc.swtform.xcore.widget.XDialogText
import org.eclipse.swt.widgets.DirectoryDialog

class XWidgetToSwtMapper {

	extension XLayoutMapper layoutMapper = new XLayoutMapper

	dispatch def createWidget(Composite parent, XButton w) {
		val control = new Button(parent, SWT.PUSH)
		if (w.name != null) {
			control.text = w.name
		}

		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XLabel w) {
		val control = new Label(parent, SWT.NONE)
		if (w.name != null) {
			control.text = w.name
		}

		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XText w) {
		val control = new Text(parent, SWT.NONE)
		if (w.message != null) {
			control.message = w.message
		}
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XCombo w) {
		val control = new Combo(parent, SWT.NONE)
		control.createComboItems(w.items)
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XTableViewer w) {
//		val styles = w.style?.map[value].reduce[p1, p2|p1.bitwiseOr(p2)]
		val control = new TableViewer(parent, SWT.BORDER)
		control.table.headerVisible = w.showHeader
		control.table.linesVisible = w.showLines
		w.columns.forEach[control.createTableViewerColumn(it)]
		control.control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XComposite w) {
		val control = new Composite(parent, SWT.NONE)
		control.initialize(w.layout)
		control.initLayoutData(w.layoutData)
		w.widgets.forEach[widget|control.createWidget(widget)]
	}

	dispatch def createWidget(Composite parent, XDateTime w) {
		val control = new DateTime(parent, SWT.DATE.bitwiseOr(SWT.DROP_DOWN))
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XCheckButton w) {
		val control = new Button(parent, SWT.CHECK)
		control.selection = w.isSelected
		control.text = w.name
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XRadioButton w) {
		val control = new Button(parent, SWT.RADIO)
		control.selection = w.isSelected
		control.text = w.name
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XToogleButton w) {
		val control = new Button(parent, SWT.TOGGLE)
		control.selection = w.isSelected
		control.text = w.name
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XDialogText w) {
		val container = new Composite(parent, SWT.NONE) => [
			val layout= new GridLayout(3, false)
			layout.marginHeight=0
			layout.marginWidth=5
			it.layout = layout
		]
		val label = new Label(container, SWT.NONE)
		label.text = w.name
		val labelGd = new GridData(SWT.FILL, SWT.FILL, false, false)
		labelGd.widthHint=w.labelWidth
		label.layoutData = labelGd
		val text = new Text(container, SWT.BORDER)
		text.layoutData = new GridData(SWT.FILL, SWT.FILL, true, false)
		val button = new Button(container, SWT.PUSH)
		button.text = '...'
		button.addSelectionListener(new SelectionAdapter() {
			override widgetSelected(SelectionEvent e) {
				switch w.dialogType{
					case OPEN_FILE:{
						var fd = new FileDialog(new Shell, SWT.OPEN)
						val path = fd.open
						if (path != null) {
							text.text = path
						}
						return
					}
//					case OPEN_COLOR:
					case OPEN_DIRECTORY:{
						var fd = new DirectoryDialog(new Shell, SWT.OPEN)
						val path = fd.open
						if (path != null) {
							text.text = path
						}
						return
					}
//					case OPEN_FONT:
					case SAVE_FILE:{
						var fd = new FileDialog(new Shell, SWT.SAVE)
						val path = fd.open
						if (path != null) {
							text.text = path
						}
						return
					}
					default: {
					}
				}
				var fd = new FileDialog(new Shell, SWT.OPEN)
				val code = fd.open
				if (code != null) {
					text.text = fd.text
				}
			}
		})
	}

	dispatch def createWidget(Composite parent, XSpinner w) {
		val control = new Spinner(parent, SWT.READ_ONLY)
		control.setMinimum(0)
		control.setMaximum(1000)
		control.setSelection(500)
		control.setIncrement(1)
		control.setPageIncrement(100)
		control.initLayoutData(w.layoutData)
	}

	dispatch def createWidget(Composite parent, XLink w) {
		val control = new Link(parent, SWT.NONE);
		control.text = "<a>" + w.url + "</a>"
		control.initLayoutData(w.layoutData)
	}

	def createComboItems(Combo combo, EList<XComboItem> items) {
		items.forEach[combo.add = it.name]
	}

	def createTableViewerColumn(TableViewer viewer, XTableViewerColumn w) {
		val col = new TableViewerColumn(viewer, SWT.NONE)
		col.column.width = w.size
		col.column.text = w.name
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
