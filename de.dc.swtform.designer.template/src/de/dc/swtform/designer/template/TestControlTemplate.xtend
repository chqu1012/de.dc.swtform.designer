package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XButton
import de.dc.swtform.xcore.widget.ISelectable

class TestControlTemplate implements IGenerator<SwtForm> {
	
	override gen(SwtForm in)'''
	package «in.packagePath»;
	
	import static de.dc.swtform.designer.util.SwtFactory.createPushButton;
	
	import org.eclipse.swt.events.SelectionEvent;
	import org.eclipse.swt.layout.FillLayout;
	import org.eclipse.swt.widgets.Button;
	import org.eclipse.swt.widgets.Composite;
	import org.eclipse.swt.widgets.Display;
	import org.eclipse.swt.widgets.Shell;
	
	public class «in.name»Main extends Base«in.name» {
	
		protected Button OkButton;
		protected Button AbbrechenButton;
	
		public «in.name»Main(Composite parent) {
			super(parent);
		}
	
		public static void main(String[] args) {
			Display display = new Display();
			Shell shell = new Shell(display);
			shell.setText("Shell");
			shell.setSize(600, 800);
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