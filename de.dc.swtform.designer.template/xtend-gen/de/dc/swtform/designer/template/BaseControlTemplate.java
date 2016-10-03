package de.dc.swtform.designer.template;

import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XButton;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;

@SuppressWarnings("all")
public class BaseControlTemplate implements IGenerator<SwtForm> {
  @Override
  public String gen(final SwtForm in) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package ");
    String _packagePath = in.getPackagePath();
    _builder.append(_packagePath, "");
    _builder.append(";");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("import static de.dc.swtform.designer.util.SwtFactory.createPushButton;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionEvent;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.SelectionListener;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.FillLayout;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Button;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public abstract class Base");
    String _name = in.getName();
    _builder.append(_name, "");
    _builder.append(" extends Composite implements SelectionListener{");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<XWidget> _widgets = in.getWidgets();
      final Function1<XWidget, Boolean> _function = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XButton));
      };
      Iterable<XWidget> _filter = IterableExtensions.<XWidget>filter(_widgets, _function);
      for(final XWidget w : _filter) {
        _builder.append("\t");
        _builder.append("protected Button ");
        String _name_1 = w.getName();
        _builder.append(_name_1, "\t");
        _builder.append("Button;");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public Base");
    String _name_2 = in.getName();
    _builder.append(_name_2, "\t");
    _builder.append("(Composite parent){");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(parent, 0);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("setLayout(new FillLayout());");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    {
      EList<XWidget> _widgets_1 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_1 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XButton));
      };
      Iterable<XWidget> _filter_1 = IterableExtensions.<XWidget>filter(_widgets_1, _function_1);
      for(final XWidget w_1 : _filter_1) {
        _builder.append("\t\t");
        String _name_3 = w_1.getName();
        _builder.append(_name_3, "\t\t");
        _builder.append("Button=createPushButton(this, \"");
        String _name_4 = w_1.getName();
        _builder.append(_name_4, "\t\t");
        _builder.append("\");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        String _name_5 = w_1.getName();
        _builder.append(_name_5, "\t\t");
        _builder.append("Button.addSelectionListener(this);");
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
      final Function1<XWidget, Boolean> _function_2 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XButton));
      };
      Iterable<XWidget> _filter_2 = IterableExtensions.<XWidget>filter(_widgets_2, _function_2);
      for(final XWidget w_2 : _filter_2) {
        _builder.append("\t\t");
        _builder.append("if(");
        String _name_6 = w_2.getName();
        _builder.append(_name_6, "\t\t");
        _builder.append("Button==e.getSource()){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("\t");
        _builder.append("on");
        String _name_7 = w_2.getName();
        _builder.append(_name_7, "\t\t\t");
        _builder.append("Selection(e);");
        _builder.newLineIfNotEmpty();
        _builder.append("\t\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    {
      EList<XWidget> _widgets_3 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_3 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XButton));
      };
      Iterable<XWidget> _filter_3 = IterableExtensions.<XWidget>filter(_widgets_3, _function_3);
      for(final XWidget w_3 : _filter_3) {
        _builder.append("\t");
        _builder.append("protected abstract void on");
        String _name_8 = w_3.getName();
        _builder.append(_name_8, "\t");
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
