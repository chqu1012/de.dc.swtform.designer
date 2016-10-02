package de.dc.swtform.designer.util

import de.dc.swtform.layout.model.XFillLayout
import de.dc.swtform.layout.model.XGridLayout
import de.dc.swtform.layout.model.XLayout
import org.eclipse.swt.widgets.Composite
import org.eclipse.swt.layout.FillLayout
import org.eclipse.swt.layout.GridLayout
import de.dc.swtform.layout.model.ModelFactory

class XLayoutMapper {
	
	def initialize(Composite parent, XLayout l){
		if(l!=null){
			init(parent, l)
		}else{
			val layout = ModelFactory.eINSTANCE.createXFillLayout
			init(parent, layout)
		}
	}

	def private dispatch init(Composite parent, XFillLayout o){
		val layout = new FillLayout
		parent.layout = layout
	}

	def private dispatch init(Composite parent, XGridLayout l){
		val layout = new GridLayout(l.numColumns, l.makeColumnsEqualWidth)
		parent.layout = layout
	}	
}