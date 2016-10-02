package de.dc.swtform.designer.util

import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label

class SwtFactory {
	
	def static Label createLabel(Composite parent, String text){
		val label = new Label(parent, SWT.NONE)
		label.text = text
		label
	}
	
	def static Label createLabel(Composite parent, String text, int width){
		val label = new Label(parent, SWT.NONE)
		val gd = LayoutFactory::griddata(SWT.FILL, SWT.FILL, false, false, width)
		label.layoutData = gd
		label.text = text
		label
	}
	
}