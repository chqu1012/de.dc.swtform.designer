package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XButton

class BaseControlTemplate implements IGenerator<SwtForm>{
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import static de.dc.swtform.designer.util.SwtFactory.createPushButton;
	
	import org.eclipse.swt.events.SelectionEvent;
	import org.eclipse.swt.events.SelectionListener;
	import org.eclipse.swt.layout.FillLayout;
	import org.eclipse.swt.widgets.Button;
	import org.eclipse.swt.widgets.Composite;
	
	public abstract class Base«in.name» extends Composite implements SelectionListener{
		
		«FOR w: in.widgets.filter[it instanceof XButton]»
		protected Button «w.name»Button;
		«ENDFOR»
		
		public Base«in.name»(Composite parent){
			super(parent, 0);
			setLayout(new FillLayout());
			
			«FOR w: in.widgets.filter[it instanceof XButton]»
			«w.name»Button=createPushButton(this, "«w.name»");
			«w.name»Button.addSelectionListener(this);
			«ENDFOR»
		}
		
		@Override
		public void widgetDefaultSelected(SelectionEvent e) {
		}
	
		@Override
		public void widgetSelected(SelectionEvent e) {
			«FOR w: in.widgets.filter[it instanceof XButton]»
			if(«w.name»Button==e.getSource()){
				on«w.name»Selection(e);
			}
			«ENDFOR»
		}
		«FOR w: in.widgets.filter[it instanceof XButton]»
		protected abstract void on«w.name»Selection(SelectionEvent e);
		«ENDFOR»
	}
	
	'''
}