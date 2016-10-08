package de.dc.swtform.example.control.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.dc.swtform.example.control.model.BaseContactsModel;

public abstract class BaseContactsLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object o, int i) {
		return null;
	}

	@Override
	public String getColumnText(Object o, int i) {
		if (o instanceof BaseContactsModel) {
			BaseContactsModel model = (BaseContactsModel) o;
			switch (i) {
			case 0:
				return getColumnText0(model);
			case 1:
				return getColumnText1(model);
			case 2:
				return getColumnText2(model);
			default:
				return "";
			}
		}
		return "";
	}
	abstract String getColumnText0(BaseContactsModel model);
	abstract String getColumnText1(BaseContactsModel model);
	abstract String getColumnText2(BaseContactsModel model);
}
