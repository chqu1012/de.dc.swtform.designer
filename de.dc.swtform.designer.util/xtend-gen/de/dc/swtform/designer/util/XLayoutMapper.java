package de.dc.swtform.designer.util;

import com.google.common.base.Objects;
import de.dc.swtform.layout.model.ModelFactory;
import de.dc.swtform.layout.model.XFillLayout;
import de.dc.swtform.layout.model.XGridLayout;
import de.dc.swtform.layout.model.XLayout;
import java.util.Arrays;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

@SuppressWarnings("all")
public class XLayoutMapper {
  public void initialize(final Composite parent, final XLayout l) {
    boolean _notEquals = (!Objects.equal(l, null));
    if (_notEquals) {
      this.init(parent, l);
    } else {
      final XFillLayout layout = ModelFactory.eINSTANCE.createXFillLayout();
      this.init(parent, layout);
    }
  }
  
  private void _init(final Composite parent, final XFillLayout o) {
    final FillLayout layout = new FillLayout();
    parent.setLayout(layout);
  }
  
  private void _init(final Composite parent, final XGridLayout l) {
    Integer _numColumns = l.getNumColumns();
    Boolean _makeColumnsEqualWidth = l.getMakeColumnsEqualWidth();
    final GridLayout layout = new GridLayout((_numColumns).intValue(), (_makeColumnsEqualWidth).booleanValue());
    parent.setLayout(layout);
  }
  
  private void init(final Composite parent, final XLayout o) {
    if (o instanceof XFillLayout) {
      _init(parent, (XFillLayout)o);
      return;
    } else if (o instanceof XGridLayout) {
      _init(parent, (XGridLayout)o);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parent, o).toString());
    }
  }
}
