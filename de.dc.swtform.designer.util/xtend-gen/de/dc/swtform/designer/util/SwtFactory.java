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
  public static Text createLabelUnit(final Composite parent, final String label, final String unit, final int labelWidth, final int numOfCol, final int marginWith, final int marginHeight) {
    Text _xblockexpression = null;
    {
      final Composite composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight);
      SwtFactory.createLabel(composite, label, labelWidth);
      final Text text = SwtFactory.createText(composite);
      SwtFactory.createLabel(composite, unit, 30);
      _xblockexpression = text;
    }
    return _xblockexpression;
  }
  
  public static Text createLabelUnit(final Composite parent, final String label, final String unit, final int labelWidth, final int numOfCol, final int marginWith, final int marginHeight, final int hAlign, final int vAlign, final boolean hGrab, final boolean vGrab, final int hSpan, final int vSpan, final int widthHint, final int heightHint) {
    Text _xblockexpression = null;
    {
      final Composite composite = SwtFactory.createGridComposite(parent, numOfCol, marginWith, marginHeight);
      GridData _gridData = LayoutFactory.gridData(hAlign, vAlign, hGrab, vGrab, hSpan, vSpan, widthHint, heightHint);
      composite.setLayoutData(_gridData);
      SwtFactory.createLabel(composite, label, labelWidth);
      final Text text = SwtFactory.createText(composite);
      SwtFactory.createLabel(composite, unit, 30);
      _xblockexpression = text;
    }
    return _xblockexpression;
  }
  
  public static Label createLabel(final Composite parent, final String text) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NONE);
      label.setText(text);
      _xblockexpression = label;
    }
    return _xblockexpression;
  }
  
  public static Text createText(final Composite parent, final String message) {
    Text _xblockexpression = null;
    {
      final Text text = SwtFactory.createText(parent);
      text.setMessage(message);
      _xblockexpression = text;
    }
    return _xblockexpression;
  }
  
  public static Label createLabel(final Composite parent, final String text, final int width) {
    Label _xblockexpression = null;
    {
      final Label label = new Label(parent, SWT.NONE);
      final GridData gd = LayoutFactory.gridData(SWT.FILL, SWT.CENTER, false, false, width);
      label.setLayoutData(gd);
      label.setText(text);
      _xblockexpression = label;
    }
    return _xblockexpression;
  }
  
  public static Text createText(final Composite parent) {
    Text _xblockexpression = null;
    {
      final Text text = new Text(parent, SWT.BORDER);
      final GridData gd = LayoutFactory.gridData(SWT.FILL, SWT.FILL, true, false);
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
