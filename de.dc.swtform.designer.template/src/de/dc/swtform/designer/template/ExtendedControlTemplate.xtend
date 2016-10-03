package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XButton

class ExtendedControlTemplate implements IGenerator<SwtForm>{
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import org.eclipse.swt.events.SelectionEvent;
	import org.eclipse.swt.widgets.Composite;
	
	public class «in.name» extends Base«in.name» {
	
		public «in.name»(Composite parent) {
			super(parent);
		}
		«FOR w: in.widgets.filter[it instanceof XButton]»
		@Override
		protected void on«w.name»Selection(SelectionEvent e) {
			// TODO: «w.name» button implementation
		}
		«ENDFOR»
	}
	'''
}