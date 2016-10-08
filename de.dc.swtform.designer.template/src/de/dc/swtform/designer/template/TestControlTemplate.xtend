package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.ISelectable
import de.dc.swtform.xcore.widget.XTableViewer

class TestControlTemplate implements IGenerator<SwtForm> {
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import java.util.*;
	import java.util.List;
	
	import org.eclipse.jface.viewers.*;
	import org.eclipse.swt.layout.*;
	import org.eclipse.swt.widgets.*;
	import de.dc.swtform.designer.util.*;
	«IF in.widgets.filter[it instanceof XTableViewer].size>0»
	import de.dc.swtform.example.control.model.*;
	«ENDIF»
	public class «in.name»Main extends Base«in.name» {
	
		public «in.name»Main(Composite parent) {
			super(parent);
			«FOR w : in.widgets.filter[it instanceof XTableViewer]»
			fill«w.name.toFirstUpper»Dummies(«w.name.toLowerCase»TableViewer);
			«ENDFOR»
		}
		«FOR w : in.widgets.filter[it instanceof XTableViewer]»
		private void fill«w.name.toFirstUpper»Dummies(TableViewer viewer) {
			List<Base«w.name.toFirstUpper»Model> entries = new ArrayList<Base«w.name.toFirstUpper»Model>();
			for (int i = 0; i < 100; i++) {
				«val paramInput = (w as XTableViewer).columns.map[
					if(it.typ=='String'){
						return "Dummy.getRandomString()"					
					}else if(typ=="int" || typ=='Integer'){
						return "Dummy.getRandomInt(1000000)"				
					}else if(typ=="double" || typ=='Double'){
						return "Dummy.getRandomDouble()"				
					}else{
						return ""
					}
				].reduce[p1, p2|p1+','+p2]»
				entries.add(create(«paramInput»));
			}
			viewer.setInput(entries);
		}
		«val paramWithType = (w as XTableViewer).columns.map[typ+' '+name].reduce[p1, p2|p1+', '+p2]»
		«val paramWithoutType = (w as XTableViewer).columns.map[name].reduce[p1, p2|p1+', '+p2]»
		public Base«w.name.toFirstUpper»Model create(«paramWithType»){
			return new Base«w.name.toFirstUpper»Model(«paramWithoutType»);
		}
		«ENDFOR»
	
		public static void main(String[] args) {
			Display display = new Display();
			Shell shell = new Shell(display);
			shell.setText("Shell");
			shell.setSize(600, 600);
			shell.setLayout(new FillLayout());
	
			new «in.name»Main(shell);
		
			shell.open();
	
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch())
					display.sleep();
			}
			display.dispose();
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