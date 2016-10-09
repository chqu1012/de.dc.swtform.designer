package de.dc.swtform.designer.template;

import com.google.common.base.Objects;
import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.util.XWidgetToStringMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.ISelectable;
import de.dc.swtform.xcore.widget.XTableViewer;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class BaseControlTemplate implements IGenerator<SwtForm> {
  @Extension
  private static XWidgetToStringMapper mapper = new XWidgetToStringMapper();
  
  @Override
  public String gen(final SwtForm in) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = in.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import de.dc.swtform.designer.control.*;");
    _builder.newLine();
    _builder.append("import de.dc.swtform.designer.util.*;\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.jface.viewers.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.*;");
    _builder.newLine();
    {
      EList<XWidget> _widgets = in.getWidgets();
      final Function1<XWidget, Boolean> _function = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTableViewer));
      };
      boolean _exists = IterableExtensions.<XWidget>exists(_widgets, _function);
      if (_exists) {
        _builder.append("import ");
        String _packagePath_1 = in.getPackagePath();
        _builder.append(_packagePath_1, "");
        _builder.append(".filter.*;\t");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _packagePath_2 = in.getPackagePath();
        _builder.append(_packagePath_2, "");
        _builder.append(".provider.*;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _packagePath_3 = in.getPackagePath();
        _builder.append(_packagePath_3, "");
        _builder.append(".sorter.*;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("public abstract class Base");
    String _name = in.getName();
    _builder.append(_name, "");
    _builder.append(" extends Composite implements SelectionListener{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<XWidget> _widgets_1 = in.getWidgets();
      boolean _hasElements = false;
      for(final XWidget w : _widgets_1) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate("\n", "\t");
        }
        String _field = BaseControlTemplate.mapper.field(w);
        _builder.append(_field, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Base");
    String _name_1 = in.getName();
    _builder.append(_name_1, "\t");
    _builder.append("(Composite parent){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(parent, 0); ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setLayout(new GridLayout(1, false));");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<XWidget> _widgets_2 = in.getWidgets();
      for(final XWidget w_1 : _widgets_2) {
        _builder.append("\t\t");
        CharSequence _createWidget = BaseControlTemplate.mapper.createWidget(w_1);
        _builder.append(_createWidget, "\t\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t\t");
    {
      EList<XWidget> _widgets_3 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_1 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof ISelectable));
      };
      Iterable<XWidget> _filter = IterableExtensions.<XWidget>filter(_widgets_3, _function_1);
      for(final XWidget w_2 : _filter) {
        final ISelectable selection = ((ISelectable) w_2);
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        {
          boolean _isHasSelectionListener = selection.isHasSelectionListener();
          if (_isHasSelectionListener) {
            String _controlName = BaseControlTemplate.mapper.controlName(w_2);
            _builder.append(_controlName, "\t\t");
            _builder.append(".addSelectionListener(this);");
          }
        }
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void widgetDefaultSelected(SelectionEvent e) {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void widgetSelected(SelectionEvent e) {");
    _builder.newLine();
    {
      EList<XWidget> _widgets_4 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_2 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof ISelectable));
      };
      Iterable<XWidget> _filter_1 = IterableExtensions.<XWidget>filter(_widgets_4, _function_2);
      for(final XWidget w_3 : _filter_1) {
        _builder.append("\t\t");
        final ISelectable selection_1 = ((ISelectable) w_3);
        _builder.newLineIfNotEmpty();
        {
          boolean _isHasSelectionListener_1 = selection_1.isHasSelectionListener();
          if (_isHasSelectionListener_1) {
            _builder.append("\t\t");
            _builder.append("if(");
            String _controlName_1 = BaseControlTemplate.mapper.controlName(w_3);
            _builder.append(_controlName_1, "\t\t");
            _builder.append("==e.getSource()){");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("\t");
            _builder.append("on");
            {
              String _selectionListenerName = selection_1.getSelectionListenerName();
              boolean _equals = Objects.equal(_selectionListenerName, null);
              if (_equals) {
                String _name_2 = w_3.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_2);
                _builder.append(_firstUpper, "\t\t\t");
              } else {
                String _selectionListenerName_1 = selection_1.getSelectionListenerName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_selectionListenerName_1);
                _builder.append(_firstUpper_1, "\t\t\t");
              }
            }
            _builder.append("Selection(e);");
            _builder.newLineIfNotEmpty();
            _builder.append("\t\t");
            _builder.append("} ");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<XWidget> _widgets_5 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_3 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof ISelectable));
      };
      Iterable<XWidget> _filter_2 = IterableExtensions.<XWidget>filter(_widgets_5, _function_3);
      for(final XWidget w_4 : _filter_2) {
        _builder.append("\t");
        final ISelectable selection_2 = ((ISelectable) w_4);
        _builder.newLineIfNotEmpty();
        {
          boolean _isHasSelectionListener_2 = selection_2.isHasSelectionListener();
          if (_isHasSelectionListener_2) {
            _builder.append("\t");
            _builder.append("protected abstract void on");
            {
              String _selectionListenerName_2 = selection_2.getSelectionListenerName();
              boolean _equals_1 = Objects.equal(_selectionListenerName_2, null);
              if (_equals_1) {
                String _name_3 = w_4.getName();
                String _firstUpper_2 = StringExtensions.toFirstUpper(_name_3);
                _builder.append(_firstUpper_2, "\t");
              } else {
                String _selectionListenerName_3 = selection_2.getSelectionListenerName();
                String _firstUpper_3 = StringExtensions.toFirstUpper(_selectionListenerName_3);
                _builder.append(_firstUpper_3, "\t");
              }
            }
            _builder.append("Selection(SelectionEvent e);");
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
