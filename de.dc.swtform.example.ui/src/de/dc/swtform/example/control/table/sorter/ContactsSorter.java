package de.dc.swtform.example.control.table.sorter;

import de.dc.swtform.example.control.table.model.*;
	
public class ContactsSorter extends BaseContactsSorter{
	
	@Override
	int sortName(BaseContactsModel m1, BaseContactsModel m2) {
		return m1.getName().compareTo(m2.getName());
	}
	@Override
	int sortVorname(BaseContactsModel m1, BaseContactsModel m2) {
		return m1.getVorname().compareTo(m2.getVorname());
	}
	@Override
	int sortHandy(BaseContactsModel m1, BaseContactsModel m2) {
		return m1.getHandy()-m2.getHandy();
	}
}
