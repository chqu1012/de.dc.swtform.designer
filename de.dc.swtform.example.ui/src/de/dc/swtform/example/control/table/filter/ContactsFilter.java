package de.dc.swtform.example.control.table.filter;

import de.dc.swtform.example.control.table.model.*;

public class ContactsFilter extends BaseContactsFilter{
	
	@Override
	boolean filterName(BaseContactsModel model, String searchString) {
		return model.getName().toLowerCase().contains(searchString.toLowerCase());
	}
	@Override
	boolean filterVorname(BaseContactsModel model, String searchString) {
		return model.getVorname().toLowerCase().contains(searchString.toLowerCase());
	}
	@Override
	boolean filterHandy(BaseContactsModel model, String searchString) {
		return (model.getHandy()+"").contains(searchString.toLowerCase());
	}

}
