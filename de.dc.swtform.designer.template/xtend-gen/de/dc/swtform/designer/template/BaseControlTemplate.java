package de.dc.swtform.designer.template;

import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.util.XWidgetToStringMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
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
    _builder.append("import de.dc.swtform.designer.util.SwtFactory;\t");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Base");
    String _name = in.getName();
    _builder.append(_name, "");
    _builder.append(" extends Composite implements SelectionListener{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<XWidget> _widgets = in.getWidgets();
      boolean _hasElements = false;
      for(final XWidget w : _widgets) {
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
      EList<XWidget> _widgets_1 = in.getWidgets();
      for(final XWidget w_1 : _widgets_1) {
        _builder.append("\t\t");
        CharSequence _createWidget = BaseControlTemplate.mapper.createWidget(w_1);
        _builder.append(_createWidget, "\t\t");
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
      EList<XWidget> _widgets_2 = in.getWidgets();
      for(final XWidget w_2 : _widgets_2) {
        _builder.append("\t\t");
        _builder.append("if(");
        String _controlName = BaseControlTemplate.mapper.controlName(w_2);
        _builder.append(_controlName, "\t\t");
        _builder.append("==e.getSource()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("on");
        String _name_2 = w_2.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_2);
        _builder.append(_firstUpper, "\t\t\t");
        _builder.append("Selection(e);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("} ");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<XWidget> _widgets_3 = in.getWidgets();
      for(final XWidget w_3 : _widgets_3) {
        _builder.append("\t");
        _builder.append("protected abstract void on");
        String _name_3 = w_3.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper_1, "\t");
        _builder.append("Selection(SelectionEvent e);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
