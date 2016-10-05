package de.dc.swtform.designer.template

import de.dc.swtform.designer.util.XWidgetToStringMapper
import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XButton

class BaseControlTemplate implements IGenerator<SwtForm>{
	
	extension static XWidgetToStringMapper mapper = new XWidgetToStringMapper()
	
	override gen(SwtForm in)'''
	package «in.packagePath»;

	import de.dc.swtform.designer.util.SwtFactory;	
	
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
«««			«w.controlName».addSelectionListener(this);
			«ENDFOR»
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	
		@Override
		public void widgetSelected(SelectionEvent e) {
			«FOR w: in.widgets»
			if(«w.controlName»==e.getSource()){
				on«w.name.toFirstUpper»Selection(e);
			} 
			«ENDFOR»
		}
		«FOR w: in.widgets»
		protected abstract void on«w.name.toFirstUpper»Selection(SelectionEvent e);
		«ENDFOR»
	}
	
	'''
}