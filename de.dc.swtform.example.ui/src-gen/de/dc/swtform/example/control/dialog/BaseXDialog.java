package de.dc.swtform.example.control.dialog;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

import de.dc.swtform.designer.util.LayoutFactory;
import de.dc.swtform.designer.util.SwtFactory;
public abstract class BaseXDialog extends Composite implements SelectionListener{
	
	protected Text openFileDialogText;
	protected Text saveFileDialogText;
	protected Text openDirectoryDialogText;
	
	public BaseXDialog(Composite parent){
		super(parent, 0); 
		setLayout(new GridLayout(1, false));
		
			Composite openFileContainer = SwtFactory.createGridComposite(this, 3, 5, 0);
			openFileContainer.setLayoutData(LayoutFactory.gridData(4, 4, true, false, 1, 1, -1, -1));
			SwtFactory.createLabel( openFileContainer, "Open File", 100);
			openFileDialogText = SwtFactory.createText(openFileContainer);
			Button openFileButton = SwtFactory.createPushButton(openFileContainer, "...");
			openFileButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
					openFileDialogText.setText(SwtFactory.openFileDialog(SWT.OPEN));
				}
			});
			Composite saveFileContainer = SwtFactory.createGridComposite(this, 3, 5, 0);
			saveFileContainer.setLayoutData(LayoutFactory.gridData(4, 4, true, false, 1, 1, -1, -1));
			SwtFactory.createLabel( saveFileContainer, "Save File", 100);
			saveFileDialogText = SwtFactory.createText(saveFileContainer);
			Button saveFileButton = SwtFactory.createPushButton(saveFileContainer, "...");
			saveFileButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
					saveFileDialogText.setText(SwtFactory.openFileDialog(SWT.SAVE));
				}
			});
			Composite openDirectoryContainer = SwtFactory.createGridComposite(this, 3, 5, 0);
			openDirectoryContainer.setLayoutData(LayoutFactory.gridData(4, 4, true, false, 1, 1, -1, -1));
			SwtFactory.createLabel( openDirectoryContainer, "Open Directory", 100);
			openDirectoryDialogText = SwtFactory.createText(openDirectoryContainer);
			Button openDirectoryButton = SwtFactory.createPushButton(openDirectoryContainer, "...");
			openDirectoryButton.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
					openDirectoryDialogText.setText(SwtFactory.openDirectoryDialog());
				}
			});
	}
	
	@Override
	public void widgetDefaultSelected(SelectionEvent e) {
	}

	@Override
	public void widgetSelected(SelectionEvent e) {
	}
	
}
