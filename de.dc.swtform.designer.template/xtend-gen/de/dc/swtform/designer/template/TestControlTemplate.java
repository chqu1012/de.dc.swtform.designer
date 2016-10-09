package de.dc.swtform.designer.template;

import com.google.common.base.Objects;
import de.dc.swtform.designer.template.IGenerator;
import de.dc.swtform.designer.util.XWidgetToStringMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XTableViewer;
import de.dc.swtform.xcore.widget.XTableViewerColumn;
import de.dc.swtform.xcore.widget.XTreeViewer;
import de.dc.swtform.xcore.widget.XWidget;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class TestControlTemplate implements IGenerator<SwtForm> {
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
    _builder.append("import java.util.*;");
    _builder.newLine();
    _builder.append("import java.util.List;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.swt.events.*;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("import org.eclipse.jface.viewers.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.layout.*;");
    _builder.newLine();
    _builder.append("import org.eclipse.swt.widgets.*;");
    _builder.newLine();
    _builder.append("import de.dc.swtform.designer.util.*;");
    _builder.newLine();
    {
      EList<XWidget> _widgets = in.getWidgets();
      final Function1<XWidget, Boolean> _function = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTreeViewer));
      };
      Iterable<XWidget> _filter = IterableExtensions.<XWidget>filter(_widgets, _function);
      for(final XWidget w : _filter) {
        _builder.append("import de.dc.swtform.designer.control.model.TreeNode;");
        _builder.newLine();
      }
    }
    {
      EList<XWidget> _widgets_1 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_1 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTableViewer));
      };
      Iterable<XWidget> _filter_1 = IterableExtensions.<XWidget>filter(_widgets_1, _function_1);
      int _size = IterableExtensions.size(_filter_1);
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("import ");
        String _packagePath_1 = in.getPackagePath();
        _builder.append(_packagePath_1, "");
        _builder.append(".model.*;");
        _builder.newLineIfNotEmpty();
      }
    }
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
    _builder.append("public ");
    String _name_2 = in.getName();
    _builder.append(_name_2, "\t");
    _builder.append("Main(Composite parent) {");
    _builder.newLineIfNotEmpty();
    _builder.append("\t\t");
    _builder.append("super(parent);");
    _builder.newLine();
    {
      EList<XWidget> _widgets_2 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_2 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTableViewer));
      };
      Iterable<XWidget> _filter_2 = IterableExtensions.<XWidget>filter(_widgets_2, _function_2);
      for(final XWidget w_1 : _filter_2) {
        _builder.append("\t\t");
        _builder.append("fill");
        String _name_3 = w_1.getName();
        String _firstUpper = StringExtensions.toFirstUpper(_name_3);
        _builder.append(_firstUpper, "\t\t");
        _builder.append("Dummies(");
        String _name_4 = w_1.getName();
        String _firstLower = StringExtensions.toFirstLower(_name_4);
        _builder.append(_firstLower, "\t\t");
        _builder.append("TableViewer);");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<XWidget> _widgets_3 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_3 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTreeViewer));
      };
      Iterable<XWidget> _filter_3 = IterableExtensions.<XWidget>filter(_widgets_3, _function_3);
      for(final XWidget w_2 : _filter_3) {
        _builder.append("\t\t");
        _builder.append("fill");
        String _name_5 = w_2.getName();
        String _firstUpper_1 = StringExtensions.toFirstUpper(_name_5);
        _builder.append(_firstUpper_1, "\t\t");
        _builder.append("Dummies(");
        String _name_6 = w_2.getName();
        String _firstLower_1 = StringExtensions.toFirstLower(_name_6);
        _builder.append(_firstLower_1, "\t\t");
        _builder.append("TreeViewer);");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      EList<XWidget> _widgets_4 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_4 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTreeViewer));
      };
      Iterable<XWidget> _filter_4 = IterableExtensions.<XWidget>filter(_widgets_4, _function_4);
      for(final XWidget w_3 : _filter_4) {
        _builder.append("\t");
        _builder.append("private void fill");
        String _name_7 = w_3.getName();
        String _firstUpper_2 = StringExtensions.toFirstUpper(_name_7);
        _builder.append(_firstUpper_2, "\t");
        _builder.append("Dummies(TreeViewer viewer) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("TreeNode parent = new TreeNode(null, \"parent\");");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("TreeNode current = createTreeNode(parent, Dummy.getRandomString());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (int i = 0; i < 100; i++) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("parent.getChildren().add(current);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("current = createTreeNode(current, Dummy.getRandomString());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewer.setInput(parent);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("private TreeNode createTreeNode(TreeNode parent, String value) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("TreeNode node = new TreeNode(parent, value);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (int i = 0; i < 5; i++) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("TreeNode newNode= new TreeNode(node, Dummy.getRandomString());");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("node.getChildren().add(newNode);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return node;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    {
      EList<XWidget> _widgets_5 = in.getWidgets();
      final Function1<XWidget, Boolean> _function_5 = (XWidget it) -> {
        return Boolean.valueOf((it instanceof XTableViewer));
      };
      Iterable<XWidget> _filter_5 = IterableExtensions.<XWidget>filter(_widgets_5, _function_5);
      for(final XWidget w_4 : _filter_5) {
        _builder.append("\t");
        _builder.append("private void fill");
        String _name_8 = w_4.getName();
        String _firstUpper_3 = StringExtensions.toFirstUpper(_name_8);
        _builder.append(_firstUpper_3, "\t");
        _builder.append("Dummies(TableViewer viewer) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("List<Base");
        String _name_9 = w_4.getName();
        String _firstUpper_4 = StringExtensions.toFirstUpper(_name_9);
        _builder.append(_firstUpper_4, "\t\t");
        _builder.append("Model> entries = new ArrayList<Base");
        String _name_10 = w_4.getName();
        String _firstUpper_5 = StringExtensions.toFirstUpper(_name_10);
        _builder.append(_firstUpper_5, "\t\t");
        _builder.append("Model>();");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("for (int i = 0; i < 100; i++) {");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t\t");
        EList<XTableViewerColumn> _columns = ((XTableViewer) w_4).getColumns();
        final Function1<XTableViewerColumn, String> _function_6 = (XTableViewerColumn it) -> {
          String _typ = it.getTyp();
          boolean _equals = Objects.equal(_typ, "String");
          if (_equals) {
            return "Dummy.getRandomString()";
          } else {
            if ((Objects.equal(it.getTyp(), "int") || Objects.equal(it.getTyp(), "Integer"))) {
              return "Dummy.getRandomInt(1000000)";
            } else {
              if ((Objects.equal(it.getTyp(), "double") || Objects.equal(it.getTyp(), "Double"))) {
                return "Dummy.getRandomDouble()";
              } else {
                return "";
              }
            }
          }
        };
        List<String> _map = ListExtensions.<XTableViewerColumn, String>map(_columns, _function_6);
        final Function2<String, String, String> _function_7 = (String p1, String p2) -> {
          return ((p1 + ",") + p2);
        };
        final String paramInput = IterableExtensions.<String>reduce(_map, _function_7);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t\t");
        _builder.append("entries.add(create(");
        _builder.append(paramInput, "\t\t\t");
        _builder.append("));");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("viewer.setInput(entries);");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        EList<XTableViewerColumn> _columns_1 = ((XTableViewer) w_4).getColumns();
        final Function1<XTableViewerColumn, String> _function_8 = (XTableViewerColumn it) -> {
          String _typ = it.getTyp();
          String _plus = (_typ + " ");
          String _name_11 = it.getName();
          return (_plus + _name_11);
        };
        List<String> _map_1 = ListExtensions.<XTableViewerColumn, String>map(_columns_1, _function_8);
        final Function2<String, String, String> _function_9 = (String p1, String p2) -> {
          return ((p1 + ", ") + p2);
        };
        final String paramWithType = IterableExtensions.<String>reduce(_map_1, _function_9);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        EList<XTableViewerColumn> _columns_2 = ((XTableViewer) w_4).getColumns();
        final Function1<XTableViewerColumn, String> _function_10 = (XTableViewerColumn it) -> {
          return it.getName();
        };
        List<String> _map_2 = ListExtensions.<XTableViewerColumn, String>map(_columns_2, _function_10);
        final Function2<String, String, String> _function_11 = (String p1, String p2) -> {
          return ((p1 + ", ") + p2);
        };
        final String paramWithoutType = IterableExtensions.<String>reduce(_map_2, _function_11);
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("public Base");
        String _name_11 = w_4.getName();
        String _firstUpper_6 = StringExtensions.toFirstUpper(_name_11);
        _builder.append(_firstUpper_6, "\t");
        _builder.append("Model create(");
        _builder.append(paramWithType, "\t");
        _builder.append("){");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("return new Base");
        String _name_12 = w_4.getName();
        String _firstUpper_7 = StringExtensions.toFirstUpper(_name_12);
        _builder.append(_firstUpper_7, "\t\t");
        _builder.append("Model(");
        _builder.append(paramWithoutType, "\t\t");
        _builder.append(");");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
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
    _builder.append("shell.setSize(600, 600);");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("shell.setLayout(new FillLayout());");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("new ");
    String _name_13 = in.getName();
    _builder.append(_name_13, "\t\t");
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
    {
      EList<XWidget> _widgets_6 = in.getWidgets();
      for(final XWidget w_5 : _widgets_6) {
        String _widgetSelectedMethod = TestControlTemplate.mapper.widgetSelectedMethod(w_5, false);
        _builder.append(_widgetSelectedMethod, "");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    return _builder.toString();
  }
}
