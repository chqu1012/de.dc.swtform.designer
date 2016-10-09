package de.dc.swtform.designer.template

import de.dc.swtform.designer.util.XWidgetToStringMapper
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XTableViewer

class BaseControlTemplate implements IGenerator<SwtForm>{
	
	extension static XWidgetToStringMapper mapper = new XWidgetToStringMapper()
	
	override gen(SwtForm in)'''
	package «in.packagePath»;

	import de.dc.swtform.designer.control.*;
	import de.dc.swtform.designer.util.*;	
	
	import org.eclipse.swt.layout.*;
	import org.eclipse.swt.events.*;
	import org.eclipse.swt.widgets.*;
	import org.eclipse.jface.viewers.*;
	import org.eclipse.swt.*;
	«IF in.widgets.exists[it instanceof XTableViewer]»
	import «in.packagePath».filter.*;	
	import «in.packagePath».provider.*;
	import «in.packagePath».sorter.*;
	«ENDIF»
	public abstract class Base«in.name» extends Composite implements SelectionListener{
		
		«FOR w: in.widgets SEPARATOR '\n'»«w.field»«ENDFOR»
		
		public Base«in.name»(Composite parent){
			super(parent, 0); 
			setLayout(new GridLayout(1, false));
			
			«FOR w: in.widgets»«w.createWidget»«ENDFOR»
			«FOR w : in.widgets »«w.addListener»«ENDFOR»
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	
		@Override
		public void widgetSelected(SelectionEvent e) {
			«FOR w : in.widgets »«w.widgetSelected»«ENDFOR»
		}
		
		«FOR w : in.widgets»«w.widgetSelectedMethod(true)»«ENDFOR»
	}
	'''
}