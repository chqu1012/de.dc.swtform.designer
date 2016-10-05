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
public class TestControlTemplate implements IGenerator<SwtForm> {
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
    _builder.append("import org.eclipse.swt.layout.FillLayout;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Button;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Composite;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Display;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.Shell;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = in.getName();
    _builder.append(_name, "");
    _builder.append("Main extends Base");
    String _name_1 = in.getName();
    _builder.append(_name_1, "");
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Button OkButton;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("protected Button AbbrechenButton;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public ");
    String _name_2 = in.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Main(Composite parent) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(parent);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public static void main(String[] args) {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Display display = new Display();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Shell shell = new Shell(display);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("shell.setText(\"Shell\");");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("shell.setSize(600, 800);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("shell.setLayout(new FillLayout());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ");
    String _name_3 = in.getName();
    _builder.append(_name_3, "\t\t");
    _builder.append("Main(shell);");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("shell.open();");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("while (!shell.isDisposed()) {");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("if (!display.readAndDispatch())");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("display.sleep();");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("display.dispose();");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
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
                String _name_4 = w.getName();
                String _firstUpper = StringExtensions.toFirstUpper(_name_4);
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
            String _name_5 = w.getName();
            _builder.append(_name_5, "\t\t");
            _builder.append(" button implementation");
            _builder.newLineIfNotEmpty();
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("System.out.println(\"");
            String _name_6 = w.getName();
            _builder.append(_name_6, "\t\t");
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
    _builder.newLine();
    return _builder.toString();
  }
}
