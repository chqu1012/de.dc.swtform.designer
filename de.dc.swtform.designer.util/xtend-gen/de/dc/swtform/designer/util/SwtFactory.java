package de.dc.swtform.designer.util;

import de.dc.swtform.designer.util.LayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SwtFactory {
  public static Label createLabel(final Composite parent, final String text) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NONE);
      label.setText(text);
      _xblockexpression = label;
    }
    return _xblockexpression;
  }
  
  public static Label createLabel(final Composite parent, final String text, final int width) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NONE);
      final GridData gd = LayoutFactory.griddata(SWT.FILL, SWT.CENTER, false, false, width);
      label.setLayoutData(gd);
      label.setText(text);
      _xblockexpression = label;
    }
    return _xblockexpression;
  }
  
  public static Text creatText(final Composite parent) {
    Text _xblockexpression = null;
    {
      final Text text = new Text(parent, SWT.BORDER);
      final GridData gd = LayoutFactory.griddata(SWT.FILL, SWT.FILL, true, false);
      text.setLayoutData(gd);
      _xblockexpression = text;
    }
    return _xblockexpression;
  }
  
  public static Composite createGridComposite(final Composite parent, final int numOfCol, final int marginWidth, final int marginHeight) {
    Composite _composite = new Composite(parent, SWT.NONE);
    final Procedure1<Composite> _function = (Composite it) -> {
      final GridLayout layout = new GridLayout(numOfCol, false);
      layout.marginHeight = marginHeight;
      layout.marginWidth = marginWidth;
      it.setLayout(layout);
    };
    return ObjectExtensions.<Composite>operator_doubleArrow(_composite, _function);
  }
  
  public static Button createPushButton(final Composite parent, final String text) {
    Button _xblockexpression = null;
    {
      final Button button = new Button(parent, SWT.PUSH);
      button.setText(text);
      _xblockexpression = button;
    }
    return _xblockexpression;
  }
  
  public static String openFileDialog(final int style) {
    String _xblockexpression = null;
    {
      Shell _shell = new Shell();
      final FileDialog fd = new FileDialog(_shell, style);
      String path = "";
      String _open = fd.open();
      path = _open;
      _xblockexpression = path;
    }
    return _xblockexpression;
  }
}
