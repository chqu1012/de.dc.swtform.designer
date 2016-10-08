package de.dc.swtform.designer.control.filter;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;

public abstract class BaseFilter<T> extends ViewerFilter {
	private String searchString;

	public void setSearchText(String s) {
		this.searchString = s;
	}

	@Override
	public boolean select(Viewer viewer, Object parentElement, Object element) {
		if (searchString == null || searchString.length() == 0) {
			return true;
		}
		T model = (T) element;
		return match(model, searchString);
	}

	public abstract boolean match(T element, String searchString);
}
