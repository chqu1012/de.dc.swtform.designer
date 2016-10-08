package de.dc.swtform.example.control.table.filter;

import de.dc.swtform.designer.control.filter.BaseFilter;
import de.dc.swtform.example.control.table.model.BaseContactsModel;

public abstract class BaseContactsFilter extends BaseFilter<BaseContactsModel>{

	@Override
	public boolean match(BaseContactsModel element, String searchString) {
		if(filterName(element, searchString)){
			return true;
		}
		if(filterVorname(element, searchString)){
			return true;
		}
		if(filterHandy(element, searchString)){
			return true;
		}
		return false;
	}
	abstract boolean filterName(BaseContactsModel element, String searchString);
	abstract boolean filterVorname(BaseContactsModel element, String searchString);
	abstract boolean filterHandy(BaseContactsModel element, String searchString);
}
