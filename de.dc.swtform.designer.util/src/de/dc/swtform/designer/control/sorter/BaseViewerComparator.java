package de.dc.swtform.designer.control.sorter;

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;
import org.eclipse.swt.SWT;

public abstract class BaseViewerComparator<T> extends ViewerComparator {
	
	private int propertyIndex;
	private static final int DESCENDING = 1;
	private int direction = DESCENDING;

	public BaseViewerComparator() {
		this.propertyIndex = 0;
		direction = DESCENDING;
	}

	public int getDirection() {
		return direction == 1 ? SWT.DOWN : SWT.UP;
	}

	public void setColumn(int column) {
		if (column == this.propertyIndex) {
			direction = 1 - direction;
		} else {
			this.propertyIndex = column;
			direction = DESCENDING;
		}
	}

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		int rc = 0;

		T m1 = (T) e1;
		T m2 = (T) e2;
		rc= compare(m1, m2, propertyIndex);
		if (direction == DESCENDING) {
			rc = -rc;
		}
		return rc;
	}

	public abstract int compare(T m1, T m2, int columnIndex);
}