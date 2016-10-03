package de.dc.swtform.designer.util

import org.eclipse.swt.SWT
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.widgets.Label
import org.eclipse.swt.widgets.Button
import org.eclipse.swt.widgets.FileDialog
import org.eclipse.swt.widgets.Shell
import org.eclipse.swt.widgets.Text
import org.eclipse.swt.layout.GridLayout

class SwtFactory {
	
	def static createLabel(Composite parent, String text){
		val label = new Label(parent, SWT.NONE)
		label.text = text
		label
	}
	
	def static createLabel(Composite parent, String text, int width){
		val label = new Label(parent, SWT.NONE)
		val gd = LayoutFactory::griddata(SWT.FILL, SWT.CENTER, false, false, width)
		label.layoutData = gd
		label.text = text
		label
	}
	
	def static creatText(Composite parent){
		val text = new Text(parent, SWT.BORDER)
		val gd = LayoutFactory::griddata(SWT.FILL, SWT.FILL, true, false)
		text.layoutData=gd
		text
	}
	
	def static createGridComposite(Composite parent, int numOfCol, int marginWidth, int marginHeight){
		new Composite(parent, SWT.NONE) => [
			val layout= new GridLayout(numOfCol, false)
			layout.marginHeight=marginHeight
			layout.marginWidth=marginWidth
			it.layout = layout
		]
	}
	
    def static createPushButton(Composite parent, String text){
    	val button = new Button(parent, SWT.PUSH)
		button.text = text
		button
    }
    
    def static openFileDialog(int style){
    	val fd = new FileDialog(new Shell, style)
    	var path = ""
    	path = fd.open
    	path
    }
	
}