package de.dc.swtform.designer.util;

import com.google.common.base.Objects;
import de.dc.swtform.designer.util.SwtFactory;
import de.dc.swtform.designer.util.XLayoutMapper;
import de.dc.swtform.layout.model.XFillData;
import de.dc.swtform.layout.model.XGridData;
import de.dc.swtform.layout.model.XLayout;
import de.dc.swtform.layout.model.XLayoutData;
import de.dc.swtform.xcore.widget.XButton;
import de.dc.swtform.xcore.widget.XCheckButton;
import de.dc.swtform.xcore.widget.XCombo;
import de.dc.swtform.xcore.widget.XComboItem;
import de.dc.swtform.xcore.widget.XComposite;
import de.dc.swtform.xcore.widget.XDateTime;
import de.dc.swtform.xcore.widget.XDialogText;
import de.dc.swtform.xcore.widget.XDialogType;
import de.dc.swtform.xcore.widget.XLabel;
import de.dc.swtform.xcore.widget.XLink;
import de.dc.swtform.xcore.widget.XRadioButton;
import de.dc.swtform.xcore.widget.XSpinner;
import de.dc.swtform.xcore.widget.XTableViewer;
import de.dc.swtform.xcore.widget.XTableViewerColumn;
import de.dc.swtform.xcore.widget.XText;
import de.dc.swtform.xcore.widget.XToogleButton;
import de.dc.swtform.xcore.widget.XUnitLabel;
import de.dc.swtform.xcore.widget.XWidget;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TableViewerColumn;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Link;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Spinner;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class XWidgetToSwtMapper {
  @Extension
  private XLayoutMapper layoutMapper = new XLayoutMapper();
  
  protected Object _createWidget(final Composite parent, final XButton w) {
    Object _xblockexpression = null;
    {
      final Button control = new Button(parent, SWT.PUSH);
      String _name = w.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        String _name_1 = w.getName();
        control.setText(_name_1);
      }
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XLabel w) {
    Object _xblockexpression = null;
    {
      final Label control = new Label(parent, SWT.NONE);
      String _name = w.getName();
      boolean _notEquals = (!Objects.equal(_name, null));
      if (_notEquals) {
        String _name_1 = w.getName();
        control.setText(_name_1);
      }
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XText w) {
    Object _xblockexpression = null;
    {
      final Text control = new Text(parent, SWT.NONE);
      String _message = w.getMessage();
      boolean _notEquals = (!Objects.equal(_message, null));
      if (_notEquals) {
        String _message_1 = w.getMessage();
        control.setMessage(_message_1);
      }
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XCombo w) {
    Object _xblockexpression = null;
    {
      final Combo control = new Combo(parent, SWT.NONE);
      EList<XComboItem> _items = w.getItems();
      this.createComboItems(control, _items);
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XTableViewer w) {
    Object _xblockexpression = null;
    {
      final Composite container = SwtFactory.createGridComposite(parent, 1, 0, 0);
      XLayoutData _layoutData = w.getLayoutData();
      this.initLayoutData(container, _layoutData);
      boolean _isHasSearch = w.isHasSearch();
      if (_isHasSearch) {
        final Text searchText = SwtFactory.creatText(container);
        searchText.setMessage("Search");
      }
      final TableViewer control = new TableViewer(container, SWT.BORDER);
      Table _table = control.getTable();
      boolean _isShowHeader = w.isShowHeader();
      _table.setHeaderVisible(_isShowHeader);
      Table _table_1 = control.getTable();
      boolean _isShowLines = w.isShowLines();
      _table_1.setLinesVisible(_isShowLines);
      EList<XTableViewerColumn> _columns = w.getColumns();
      final Consumer<XTableViewerColumn> _function = (XTableViewerColumn it) -> {
        this.createTableViewerColumn(control, it);
      };
      _columns.forEach(_function);
      Control _control = control.getControl();
      XLayoutData _layoutData_1 = w.getLayoutData();
      _xblockexpression = this.initLayoutData(_control, _layoutData_1);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XComposite w) {
    final Composite control = new Composite(parent, SWT.NONE);
    XLayout _layout = w.getLayout();
    this.layoutMapper.initialize(control, _layout);
    XLayoutData _layoutData = w.getLayoutData();
    this.initLayoutData(control, _layoutData);
    EList<XWidget> _widgets = w.getWidgets();
    final Consumer<XWidget> _function = (XWidget widget) -> {
      this.createWidget(control, widget);
    };
    _widgets.forEach(_function);
    return null;
  }
  
  protected Object _createWidget(final Composite parent, final XDateTime w) {
    Object _xblockexpression = null;
    {
      final DateTime control = new DateTime(parent, (SWT.DATE | SWT.DROP_DOWN));
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XCheckButton w) {
    return this.createButton(parent, SWT.CHECK, w);
  }
  
  protected Object _createWidget(final Composite parent, final XRadioButton w) {
    return this.createButton(parent, SWT.RADIO, w);
  }
  
  protected Object _createWidget(final Composite parent, final XToogleButton w) {
    return this.createButton(parent, SWT.TOGGLE, w);
  }
  
  protected Object _createWidget(final Composite parent, final XDialogText w) {
    final Composite container = SwtFactory.createGridComposite(parent, 3, 5, 0);
    String _name = w.getName();
    int _labelWidth = w.getLabelWidth();
    SwtFactory.createLabel(container, _name, _labelWidth);
    final Text text = SwtFactory.creatText(container);
    final Button button = SwtFactory.createPushButton(container, "...");
    button.addSelectionListener(new SelectionAdapter() {
      @Override
      public void widgetSelected(final SelectionEvent e) {
        XDialogType _dialogType = w.getDialogType();
        if (_dialogType != null) {
          switch (_dialogType) {
            case OPEN_FILE:
              String _openFileDialog = SwtFactory.openFileDialog(SWT.OPEN);
              text.setText(_openFileDialog);
              return;
            case OPEN_DIRECTORY:
              Shell _shell = new Shell();
              DirectoryDialog fd = new DirectoryDialog(_shell, SWT.OPEN);
              final String path = fd.open();
              boolean _notEquals = (!Objects.equal(path, null));
              if (_notEquals) {
                text.setText(path);
              }
              return;
            case SAVE_FILE:
              String _openFileDialog_1 = SwtFactory.openFileDialog(SWT.SAVE);
              text.setText(_openFileDialog_1);
              return;
            default:
              break;
          }
        } else {
        }
      }
    });
    return null;
  }
  
  protected Object _createWidget(final Composite parent, final XUnitLabel w) {
    Object _xblockexpression = null;
    {
      final Composite container = SwtFactory.createGridComposite(parent, 3, 5, 0);
      String _name = w.getName();
      int _labelWidth = w.getLabelWidth();
      SwtFactory.createLabel(container, _name, _labelWidth);
      SwtFactory.creatText(container);
      String _unit = w.getUnit();
      SwtFactory.createLabel(container, _unit, 30);
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(container, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XSpinner w) {
    Object _xblockexpression = null;
    {
      final Spinner control = new Spinner(parent, SWT.READ_ONLY);
      control.setMinimum(0);
      control.setMaximum(1000);
      control.setSelection(500);
      control.setIncrement(1);
      control.setPageIncrement(100);
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  protected Object _createWidget(final Composite parent, final XLink w) {
    Object _xblockexpression = null;
    {
      final Link control = new Link(parent, SWT.NONE);
      String _url = w.getUrl();
      String _plus = ("<a>" + _url);
      String _plus_1 = (_plus + "</a>");
      control.setText(_plus_1);
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  public Object createButton(final Composite parent, final int style, final XButton w) {
    Object _xblockexpression = null;
    {
      final Button control = new Button(parent, style);
      Boolean _isSelected = w.getIsSelected();
      control.setSelection((_isSelected).booleanValue());
      String _name = w.getName();
      control.setText(_name);
      XLayoutData _layoutData = w.getLayoutData();
      _xblockexpression = this.initLayoutData(control, _layoutData);
    }
    return _xblockexpression;
  }
  
  public void createComboItems(final Combo combo, final EList<XComboItem> items) {
    final Consumer<XComboItem> _function = (XComboItem it) -> {
      String _name = it.getName();
      combo.add(_name);
    };
    items.forEach(_function);
  }
  
  public void createTableViewerColumn(final TableViewer viewer, final XTableViewerColumn w) {
    final TableViewerColumn col = new TableViewerColumn(viewer, SWT.NONE);
    TableColumn _column = col.getColumn();
    Integer _size = w.getSize();
    _column.setWidth((_size).intValue());
    TableColumn _column_1 = col.getColumn();
    String _name = w.getName();
    _column_1.setText(_name);
  }
  
  public Object initLayoutData(final Control control, final XLayoutData ld) {
    Object _xifexpression = null;
    boolean _notEquals = (!Objects.equal(ld, null));
    if (_notEquals) {
      _xifexpression = this.layoutData(control, ld);
    }
    return _xifexpression;
  }
  
  protected Object _layoutData(final Control control, final XGridData ld) {
    GridData _gridData = new GridData();
    final Procedure1<GridData> _function = (GridData it) -> {
      Boolean _grabExcessHorizontalSpace = ld.getGrabExcessHorizontalSpace();
      it.grabExcessHorizontalSpace = (_grabExcessHorizontalSpace).booleanValue();
      Boolean _grabExcessVerticalSpace = ld.getGrabExcessVerticalSpace();
      it.grabExcessVerticalSpace = (_grabExcessVerticalSpace).booleanValue();
      Integer _horizontalAlignment = ld.getHorizontalAlignment();
      it.horizontalAlignment = (_horizontalAlignment).intValue();
      Integer _verticalAlignment = ld.getVerticalAlignment();
      it.verticalAlignment = (_verticalAlignment).intValue();
      Integer _widthHint = ld.getWidthHint();
      it.widthHint = (_widthHint).intValue();
      Integer _heightHint = ld.getHeightHint();
      it.heightHint = (_heightHint).intValue();
      Integer _horizontalSpan = ld.getHorizontalSpan();
      it.horizontalSpan = (_horizontalSpan).intValue();
      Integer _verticalSpan = ld.getVerticalSpan();
      it.verticalSpan = (_verticalSpan).intValue();
    };
    final GridData gd = ObjectExtensions.<GridData>operator_doubleArrow(_gridData, _function);
    control.setLayoutData(gd);
    return null;
  }
  
  protected Object _layoutData(final Control control, final XFillData ld) {
    return null;
  }
  
  public Object createWidget(final Composite parent, final XWidget w) {
    if (w instanceof XCheckButton) {
      return _createWidget(parent, (XCheckButton)w);
    } else if (w instanceof XRadioButton) {
      return _createWidget(parent, (XRadioButton)w);
    } else if (w instanceof XTableViewer) {
      return _createWidget(parent, (XTableViewer)w);
    } else if (w instanceof XToogleButton) {
      return _createWidget(parent, (XToogleButton)w);
    } else if (w instanceof XButton) {
      return _createWidget(parent, (XButton)w);
    } else if (w instanceof XCombo) {
      return _createWidget(parent, (XCombo)w);
    } else if (w instanceof XComposite) {
      return _createWidget(parent, (XComposite)w);
    } else if (w instanceof XDateTime) {
      return _createWidget(parent, (XDateTime)w);
    } else if (w instanceof XDialogText) {
      return _createWidget(parent, (XDialogText)w);
    } else if (w instanceof XLabel) {
      return _createWidget(parent, (XLabel)w);
    } else if (w instanceof XLink) {
      return _createWidget(parent, (XLink)w);
    } else if (w instanceof XSpinner) {
      return _createWidget(parent, (XSpinner)w);
    } else if (w instanceof XText) {
      return _createWidget(parent, (XText)w);
    } else if (w instanceof XUnitLabel) {
      return _createWidget(parent, (XUnitLabel)w);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(parent, w).toString());
    }
  }
  
  public Object layoutData(final Control control, final XLayoutData ld) {
    if (ld instanceof XFillData) {
      return _layoutData(control, (XFillData)ld);
    } else if (ld instanceof XGridData) {
      return _layoutData(control, (XGridData)ld);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(control, ld).toString());
    }
  }
}
