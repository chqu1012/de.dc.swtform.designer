package de.dc.swtform.designer.util;

import de.dc.swtform.designer.control.BaseTableViewer;
import de.dc.swtform.designer.util.LayoutFactory;
import java.util.List;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class SwtFactory {
  public static BaseTableViewer createSearchTableViewer(final Composite parent, final String[] titles, final int[] bounds, final boolean hasSearch, final LabelProvider labelProvider) {
    return new BaseTableViewer(parent, SWT.NONE, titles, bounds, hasSearch, labelProvider);
  }
  
  public static TableViewer createTableViewer(final Composite parent, final boolean showHeader, final boolean showLines) {
    TableViewer _xblockexpression = null;
    {
      final TableViewer viewer = new TableViewer(parent, SWT.BORDER);
      Table _table = viewer.getTable();
      _table.setHeaderVisible(showHeader);
      Table _table_1 = viewer.getTable();
      _table_1.setLinesVisible(showLines);
      ArrayContentProvider _instance = ArrayContentProvider.getInstance();
      viewer.setContentProvider(_instance);
      _xblockexpression = viewer;
    }
    return _xblockexpression;
  }
  
  public static TableViewer createTableViewer(final Composite parent, final boolean showHeader, final boolean showLines, final int[] bounds, final String[] titles) {
    TableViewer _xblockexpression = null;
    {
      final TableViewer viewer = SwtFactory.createTableViewer(parent, showHeader, showLines);
      int _size = ((List<Integer>)Conversions.doWrapArray(bounds)).size();
      int _minus = (_size - 1);
      IntegerRange _upTo = new IntegerRange(0, _minus);
      for (final Integer i : _upTo) {
        int _get = bounds[(i).intValue()];
        String _get_1 = titles[(i).intValue()];
        SwtFactory.createTableViewerColumn(viewer, _get, _get_1);
      }
      _xblockexpression = viewer;
    }
    return _xblockexpression;
  }
  
  public static TableViewerColumn createTableViewerColumn(final TableViewer viewer, final int width, final String text) {
    TableViewerColumn _xblockexpression = null;
    {
      final TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
      TableColumn _column = col.getColumn();
      _column.setWidth(width);
      TableColumn _column_1 = col.getColumn();
      _column_1.setText(text);
      _xblockexpression = col;
    }
    return _xblockexpression;
  }
  
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
