package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.ISelectable

class ExtendedControlTemplate implements IGenerator<SwtForm>{
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import org.eclipse.swt.events.SelectionEvent;
	import org.eclipse.swt.widgets.Composite;
	
	public class «in.name» extends Base«in.name» {
	
		public «in.name»(Composite parent) {
			super(parent);
		}
		«FOR w: in.widgets.filter[it instanceof ISelectable]»
		«val selection = w as ISelectable»
		«IF selection.hasSelectionListener»
		@Override
		protected void on«IF selection.selectionListenerName==null»«w.name.toFirstUpper»«ELSE»«selection.selectionListenerName.toFirstUpper»«ENDIF»Selection(SelectionEvent e) {
			// TODO: «w.name» button implementation
			System.out.println("«w.name» button implementation");
		}
		«ENDIF»
		«ENDFOR»
	}
	'''
}