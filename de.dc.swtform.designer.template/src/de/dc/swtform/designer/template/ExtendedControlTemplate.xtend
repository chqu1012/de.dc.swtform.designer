package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm

class ExtendedControlTemplate implements IGenerator<SwtForm>{
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import org.eclipse.swt.events.SelectionEvent;
	import org.eclipse.swt.widgets.Composite;
	
	public class «in.name» extends Base«in.name» {
	
		public «in.name»(Composite parent) {
			super(parent);
		}
		«FOR w: in.widgets»
		@Override
		protected void on«w.name.toFirstUpper»Selection(SelectionEvent e) {
			// TODO: «w.name» button implementation
			System.out.println("«w.name» button implementation");
		}
		«ENDFOR»
	}
	'''
}