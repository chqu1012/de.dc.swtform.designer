package de.dc.swtform.example.control.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.dc.swtform.example.control.model.PersonsModel;

public class PersonsLabelProvider extends LabelProvider implements ITableLabelProvider {

	@Override
	public Image getColumnImage(Object o, int i) {
		return null;
	}

	@Override
	public String getColumnText(Object o, int i) {
		if (o instanceof PersonsModel) {
			PersonsModel model = (PersonsModel) o;
			switch (i) {
			case 0:
				return model.getName()+"";
			case 1:
				return model.getVorname()+"";
			case 2:
				return model.getHandy()+"";
			default:
				return "";
			}
		}
		return "";
	}
}
