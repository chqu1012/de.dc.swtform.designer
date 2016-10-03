package de.dc.swtform.designer.template

import de.dc.swtform.xcore.model.SwtForm
import de.dc.swtform.xcore.widget.XButton

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
	
		«FOR w : in.widgets.filter[it instanceof XButton]»
		@Override
		protected void on«w.name»Selection(SelectionEvent e) {
			System.out.println("TODO: «w.name» BUTTON");
		}
		«ENDFOR»
	}
	
	'''
}