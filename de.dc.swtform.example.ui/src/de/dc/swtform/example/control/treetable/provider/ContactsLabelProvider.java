
package de.dc.swtform.example.control.treetable.provider;

import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

import de.dc.swtform.example.control.treetable.model.BaseContactsModel;

public class ContactsLabelProvider extends BaseContactsLabelProvider{
		@Override
		String getColumnText0(BaseContactsModel model) {
			return model.getName()+"";
		}
		@Override
		String getColumnText1(BaseContactsModel model) {
			return model.getVorname()+"";
		}
		@Override
		String getColumnText2(BaseContactsModel model) {
			return model.getHandy()+"";
		}
}
