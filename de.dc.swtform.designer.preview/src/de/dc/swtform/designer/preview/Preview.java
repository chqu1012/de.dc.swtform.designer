package de.dc.swtform.designer.preview;

import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;

import de.dc.swtform.designer.util.XLayoutMapper;
import de.dc.swtform.designer.util.XWidgetToSwtMapper;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.widget.XWidget;

public class Preview extends ViewPart implements ISelectionListener {

	private Composite composite;
	private XWidgetToSwtMapper widgetMapper = new XWidgetToSwtMapper();
	private XLayoutMapper layoutMapper = new XLayoutMapper();

	public Preview() {
	}

	@Override
	public void createPartControl(Composite parent) {
		composite = new Composite(parent, SWT.NONE);
		composite.setLayout(new FillLayout());
		PlatformUI.getWorkbench().getActiveWorkbenchWindow().getSelectionService().addSelectionListener(this);
	}

	@Override
	public void setFocus() {
	}

	@Override
	public void selectionChanged(IWorkbenchPart part, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			clearComposite();
			if (ss.getFirstElement() instanceof SwtForm) {
				SwtForm form = (SwtForm) ss.getFirstElement();
				layoutMapper.initialize(composite, form.getLayout());
				for (XWidget w : form.getWidgets()) {
					widgetMapper.createWidget(composite, w);
				}
			}else if (ss.getFirstElement() instanceof XWidget) {
				XWidget widget = (XWidget) ss.getFirstElement();
				widgetMapper.createWidget(composite, widget);
				
			}
			composite.layout();
		}
	}

	private void clearComposite() {
		for (Control c : composite.getChildren()) {
			c.dispose();
		}
	}
}
