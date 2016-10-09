package de.dc.swtform.designer.util

import de.dc.swtform.designer.control.BaseTableViewer
import de.dc.swtform.designer.control.TreeContentProvider
import de.dc.swtform.designer.control.TreeLabelProvider
import org.eclipse.jface.viewers.ArrayContentProvider
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider
import org.eclipse.jface.viewers.LabelProvider
import org.eclipse.jface.viewers.TableViewer
import org.eclipse.jface.viewers.TableViewerColumn
import org.eclipse.jface.viewers.TreeViewer
import org.eclipse.jface.viewers.TreeViewerColumn
import org.eclipse.swt.SWT
import org.eclipse.swt.layout.GridLayout
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.Combo
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Control
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Menu
import org.eclipse.swt.widgets.MenuItem
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.ui.dialogs.FilteredTree
import org.eclipse.ui.dialogs.PatternFilter

class SwtFactory {

	def static createMenuItem(Menu menu, String text) {
		val menuItem = new MenuItem(menu, SWT.NONE)
		menuItem.setText(text)
		menuItem
	}

	def static createMenu(Control parent) {
		val menu = new Menu(parent)
		parent.menu = menu
		menu
	}

	def static createTreeViewer(Composite parent, boolean hasFilter) {
		var TreeViewer viewer = null
		if (hasFilter) {
			val filter = new PatternFilter
			val tree = new FilteredTree(parent,
				SWT.BORDER.bitwiseOr(SWT.MULTI).bitwiseOr(SWT.H_SCROLL).bitwiseOr(SWT.V_SCROLL), filter, true)
			viewer = tree.viewer
		} else {
			val treeViewer = new TreeViewer(parent,
				SWT.BORDER.bitwiseOr(SWT.MULTI).bitwiseOr(SWT.H_SCROLL).bitwiseOr(SWT.V_SCROLL))
			treeViewer.contentProvider = new TreeContentProvider
			treeViewer.labelProvider = new TreeLabelProvider
			treeViewer.tree.headerVisible = true
			treeViewer.tree.linesVisible = true
			viewer = treeViewer
		}
		viewer
	}

	def static createTreeViewerColumn(TreeViewer viewer, String text, int size) {
		val col = new TreeViewerColumn(viewer, SWT.NONE)
		col.getColumn().setText(text)
		col.getColumn().setWidth(size)
		col.getColumn().setAlignment(SWT.LEFT)
		col.labelProvider = new DelegatingStyledCellLabelProvider(new TreeLabelProvider)
		col
	}

	def static createComboItems(Combo combo, String[] items) {
		items.forEach[combo.add(it)]
	}

	def static createSearchTableViewer(Composite parent, String[] titles, int[] bounds, boolean hasSearch,
		LabelProvider labelProvider) {
		new BaseTableViewer(parent, SWT.NONE, titles, bounds, hasSearch, labelProvider)
	}

	def static createTableViewer(Composite parent, boolean showHeader, boolean showLines) {
		val viewer = new TableViewer(parent, SWT.BORDER)
		viewer.table.setHeaderVisible(showHeader)
		viewer.table.setLinesVisible(showLines)
		viewer.contentProvider = ArrayContentProvider.instance
		viewer
	}

	def static createTableViewer(Composite parent, boolean showHeader, boolean showLines, int[] bounds,
		String[] titles) {
		val viewer = createTableViewer(parent, showHeader, showLines)
		for (i : 0 .. (bounds.size - 1)) {
			createTableViewerColumn(viewer, bounds.get(i), titles.get(i))
		}
		viewer
	}

	def static createTableViewerColumn(TableViewer viewer, int width, String text) {
		val col = new TableViewerColumn(viewer, SWT.NONE)
		col.getColumn().setWidth(width)
		col.getColumn().setText(text)
		col.labelProvider = new DelegatingStyledCellLabelProvider(new TreeLabelProvider)
		col
	}

	def static createLabelUnit(Composite parent, String label, String unit, int labelWidth, int numOfCol,
		int marginWith, int marginHeight) {
		val composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight)
		SwtFactory.createLabel(composite, label, labelWidth)
		val text = SwtFactory.createText(composite)
		SwtFactory.createLabel(composite, unit, 30)
		text
	}

	def static createLabelUnit(Composite parent, String label, String unit, int labelWidth, int numOfCol,
		int marginWith, int marginHeight, int hAlign, int vAlign, boolean hGrab, boolean vGrab, int hSpan, int vSpan,
		int widthHint, int heightHint) {
		val composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight)
		composite.setLayoutData(
			LayoutFactory.gridData(hAlign, vAlign, hGrab, vGrab, hSpan, vSpan, widthHint, heightHint))
		SwtFactory.createLabel(composite, label, labelWidth)
		val text = SwtFactory.createText(composite)
		SwtFactory.createLabel(composite, unit, 30)
		text
	}

	def static createLabel(Composite parent, String text) {
		val label = new Label(parent, SWT.NONE)
		label.text = text
		label
	}

	def static createText(Composite parent, String message) {
		val text = createText(parent)
		text.message = message
		text
	}

	def static createLabel(Composite parent, String text, int width) {
		val label = new Label(parent, SWT.NONE)
		val gd = LayoutFactory::gridData(SWT.FILL, SWT.CENTER, false, false, width)
		label.layoutData = gd
		label.text = text
		label
	}

	def static createText(Composite parent) {
		val text = new Text(parent, SWT.BORDER)
		val gd = LayoutFactory::gridData(SWT.FILL, SWT.FILL, true, false)
		text.layoutData = gd
		text
	}

	def static createGridComposite(Composite parent, int numOfCol, int marginWidth, int marginHeight) {
		new Composite(parent, SWT.NONE) => [
			val layout = new GridLayout(numOfCol, false)
			layout.marginHeight = marginHeight
			layout.marginWidth = marginWidth
			it.layout = layout
		]
	}

	def static createPushButton(Composite parent, String text) {
		val button = new Button(parent, SWT.PUSH)
		button.text = text
		button
	}

	def static openFileDialog(int style) {
		val fd = new FileDialog(new Shell, style)
		var path = ""
		path = fd.open
		path
	}

}
