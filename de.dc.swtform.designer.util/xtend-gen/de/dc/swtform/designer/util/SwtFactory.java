package de.dc.swtform.designer.util;

import de.dc.swtform.designer.util.LayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

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
      final GridData gd = LayoutFactory.griddata(SWT.FILL, SWT.FILL, false, false, width);
      label.setLayoutData(gd);
      label.setText(text);
      _xblockexpression = label;
    }
    return _xblockexpression;
  }
}
