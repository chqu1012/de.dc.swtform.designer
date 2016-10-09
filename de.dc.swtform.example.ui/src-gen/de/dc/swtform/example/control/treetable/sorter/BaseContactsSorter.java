package de.dc.swtform.example.control.treetable.sorter;

import de.dc.swtform.designer.control.sorter.BaseViewerComparator;
import de.dc.swtform.example.control.treetable.model.BaseContactsModel;

public abstract class BaseContactsSorter extends BaseViewerComparator<BaseContactsModel> {

	@Override
	public int compare(BaseContactsModel m1, BaseContactsModel m2, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return sortName(m1, m2);
		case 1:
			return sortVorname(m1, m2);
		case 2:
			return sortHandy(m1, m2);
		default:
			return 0;
		}
	}
	abstract int sortName(BaseContactsModel m1, BaseContactsModel m2);
	abstract int sortVorname(BaseContactsModel m1, BaseContactsModel m2);
	abstract int sortHandy(BaseContactsModel m1, BaseContactsModel m2);
}
