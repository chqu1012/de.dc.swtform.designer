package de.dc.swtform.designer.template

import de.dc.swtform.designer.util.XWidgetToStringMapper
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.ISelectable

class BaseControlTemplate implements IGenerator<SwtForm>{
	
	extension static XWidgetToStringMapper mapper = new XWidgetToStringMapper()
	
	override gen(SwtForm in)'''
	package «in.packagePath»;

	import de.dc.swtform.designer.util.*;	
	
	import org.eclipse.swt.layout.*;
	import org.eclipse.swt.events.*;
	import org.eclipse.swt.widgets.*;
	
	public abstract class Base«in.name» extends Composite implements SelectionListener{
		
		«FOR w: in.widgets SEPARATOR '\n'»«w.field»«ENDFOR»
		
		public Base«in.name»(Composite parent){
			super(parent, 0); 
			setLayout(new GridLayout(1, false));
			
			«FOR w: in.widgets»
			«w.createWidget»
			«ENDFOR»
			«FOR w: in.widgets.filter[it instanceof ISelectable]»«val selection = w as ISelectable»
			«IF selection.hasSelectionListener»«w.controlName».addSelectionListener(this);«ENDIF»
			«ENDFOR»
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	
		@Override
		public void widgetSelected(SelectionEvent e) {
			«FOR w: in.widgets.filter[it instanceof ISelectable]»
			«val selection = w as ISelectable»
			«IF selection.hasSelectionListener»
			if(«w.controlName»==e.getSource()){
				on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(e);
			} 
			«ENDIF»
			«ENDFOR»
		}
		«FOR w: in.widgets.filter[it instanceof ISelectable]»
		«val selection = w as ISelectable»
		«IF selection.hasSelectionListener»
		protected abstract void on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(SelectionEvent e);
		«ENDIF»
		«ENDFOR»
	}
	
	'''
}