package de.dc.swtform.designer.template;

import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.util.XWidgetToStringMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XTableViewer;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

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
    _builder.append("\t\t");
    {
      EList<XWidget> _widgets_2 = in.getWidgets();
      for(final XWidget w_1 : _widgets_2) {
        CharSequence _createWidget = BaseControlTemplate.mapper.createWidget(w_1);
        _builder.append(_createWidget, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    {
      EList<XWidget> _widgets_3 = in.getWidgets();
      for(final XWidget w_2 : _widgets_3) {
        String _addListener = BaseControlTemplate.mapper.addListener(w_2);
        _builder.append(_addListener, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
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
    _builder.append("\t\t");
    {
      EList<XWidget> _widgets_4 = in.getWidgets();
      for(final XWidget w_3 : _widgets_4) {
        String _widgetSelected = BaseControlTemplate.mapper.widgetSelected(w_3);
        _builder.append(_widgetSelected, "\t\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<XWidget> _widgets_5 = in.getWidgets();
      for(final XWidget w_4 : _widgets_5) {
        String _widgetSelectedMethod = BaseControlTemplate.mapper.widgetSelectedMethod(w_4, true);
        _builder.append(_widgetSelectedMethod, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
