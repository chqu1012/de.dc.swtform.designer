package de.dc.swtform.designer.util;

import org.eclipse.swt.layout.GridData;

@SuppressWarnings("all")
public class LayoutFactory {
  public static GridData griddata(final int hAlign, final int vAlign, final boolean hGrab, final boolean vGrab, final int widthHinh) {
    GridData _xblockexpression = null;
    {
      final GridData gd = new GridData(hAlign, vAlign, hGrab, vGrab);
      gd.widthHint = widthHinh;
      _xblockexpression = gd;
    }
    return _xblockexpression;
  }
  
  public static GridData griddata(final int hAlign, final int vAlign, final boolean hGrab, final boolean vGrab) {
    return new GridData(hAlign, vAlign, hGrab, vGrab);
  }
  
  public static GridData griddata(final int hAlign, final int vAlign, final boolean hGrab, final boolean vGrab, final int hSpan, final int vSpan) {
    return new GridData(hAlign, vAlign, hGrab, vGrab, hSpan, vSpan);
  }
}
