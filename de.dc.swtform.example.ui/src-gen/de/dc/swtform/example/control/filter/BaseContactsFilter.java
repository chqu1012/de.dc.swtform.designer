package de.dc.swtform.example.control.filter;

import de.dc.swtform.designer.control.filter.BaseFilter;
import de.dc.swtform.example.control.model.BaseContactsModel;

public class BaseContactsFilter extends BaseFilter<BaseContactsModel>{

	@Override
	public boolean match(BaseContactsModel element, String searchString) {
		if(element.getName().toLowerCase().contains(searchString.toLowerCase())){
			return true;
		}
		return false;
	}

}
