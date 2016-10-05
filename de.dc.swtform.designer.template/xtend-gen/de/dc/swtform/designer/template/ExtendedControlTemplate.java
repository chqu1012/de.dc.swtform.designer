package de.dc.swtform.designer.template;

import com.google.common.base.Objects;
import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.ISelectable;
import de.dc.swtform.xcore.widget.XWidget;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ExtendedControlTemplate implements IGenerator<SwtForm> {
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
    {
      EList<XWidget> _widgets = in.getWidgets();
      final Function1<XWidget, Boolean> _function = (XWidget it) -> {
        return Boolean.valueOf((it instanceof ISelectable));
      };
      Iterable<XWidget> _filter = IterableExtensions.<XWidget>filter(_widgets, _function);
      for(final XWidget w : _filter) {
        _builder.append("\t");
        final ISelectable selection = ((ISelectable) w);
        _builder.newLineIfNotEmpty();
        {
          boolean _isHasSelectionListener = selection.isHasSelectionListener();
          if (_isHasSelectionListener) {
            _builder.append("\t");
            _builder.append("@Override");
            _builder.newLine();
            _builder.append("\t");
            _builder.append("protected void on");
            {
              String _selectionListenerName = selection.getSelectionListenerName();
              boolean _equals = Objects.equal(_selectionListenerName, null);
              if (_equals) {
                String _name_3 = w.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_3);
                _builder.append(_firstUpper, "\t");
              } else {
                String _selectionListenerName_1 = selection.getSelectionListenerName();
                String _firstUpper_1 = StringExtensions.toFirstUpper(_selectionListenerName_1);
                _builder.append(_firstUpper_1, "\t");
              }
            }
            _builder.append("Selection(SelectionEvent e) {");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("// TODO: ");
            String _name_4 = w.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append(" button implementation");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("System.out.println(\"");
            String _name_5 = w.getName();
            _builder.append(_name_5, "\t\t");
            _builder.append(" button implementation\");");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("}");
            _builder.newLine();
          }
        }
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder.toString();
  }
}
