package de.dc.swtform.designer.template;

import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.util.XWidgetToStringMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ExtendedControlTemplate implements IGenerator<SwtForm> {
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
    _builder.append("import org.eclipse.swt.events.SelectionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = in.getName();
    _builder.append(_name, "");
    _builder.append(" extends Base");
    String _name_1 = in.getName();
    _builder.append(_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = in.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(Composite parent) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(parent);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    {
      EList<XWidget> _widgets = in.getWidgets();
      for(final XWidget w : _widgets) {
        String _widgetSelectedMethod = ExtendedControlTemplate.mapper.widgetSelectedMethod(w, false);
        _builder.append(_widgetSelectedMethod, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
