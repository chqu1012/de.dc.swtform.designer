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
	
	def static createLabelUnit(Composite parent, String label, String unit, int labelWidth, int numOfCol, int marginWith, int marginHeight){
		val composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight);
		SwtFactory.createLabel(composite, label, labelWidth);
		val text = SwtFactory.createText(composite);
		SwtFactory.createLabel(composite, unit, 30);
		text
	}
	
	def static createLabelUnit(Composite parent, String label, String unit, int labelWidth, int numOfCol, int marginWith, int marginHeight,
		int hAlign, int vAlign, boolean hGrab, boolean vGrab, int hSpan, int vSpan, int widthHint, int heightHint){
		val composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight);
		composite.setLayoutData(LayoutFactory.gridData(hAlign, vAlign, hGrab, vGrab, hSpan, vSpan, widthHint, heightHint));
		SwtFactory.createLabel(composite, label, labelWidth);
		val text = SwtFactory.createText(composite);
		SwtFactory.createLabel(composite, unit, 30);
		text
	}
	
	def static createLabel(Composite parent, String text){
		val label = new Label(parent, SWT.NONE)
		label.text = text
		label
	}
	
	def static createText(Composite parent, String message){
		val text = createText( parent);
		text.message = message
		text
	}
	
	def static createLabel(Composite parent, String text, int width){
		val label = new Label(parent, SWT.NONE)
		val gd = LayoutFactory::gridData(SWT.FILL, SWT.CENTER, false, false, width)
		label.layoutData = gd
		label.text = text
		label
	}
	
	def static createText(Composite parent){
		val text = new Text(parent, SWT.BORDER)
		val gd = LayoutFactory::gridData(SWT.FILL, SWT.FILL, true, false)
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