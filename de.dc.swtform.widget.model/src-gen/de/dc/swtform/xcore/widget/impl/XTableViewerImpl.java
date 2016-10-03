/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XTableViewer;
import de.dc.swtform.xcore.widget.XTableViewerColumn;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XTable Viewer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isShowBorder <em>Show Border</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isVerticalScroll <em>Vertical Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isHorizontalScroll <em>Horizontal Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#isHasSearch <em>Has Search</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTableViewerImpl extends XViewerImpl implements XTableViewer {
	/**
	 * The default value of the '{@link #isShowHeader() <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowHeader()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_HEADER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowHeader() <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowHeader()
	 * @generated
	 * @ordered
	 */
	protected boolean showHeader = SHOW_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowLines() <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLines()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_LINES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowLines() <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowLines()
	 * @generated
	 * @ordered
	 */
	protected boolean showLines = SHOW_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #isShowBorder() <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowBorder()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_BORDER_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isShowBorder() <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShowBorder()
	 * @generated
	 * @ordered
	 */
	protected boolean showBorder = SHOW_BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #isVerticalScroll() <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScroll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VERTICAL_SCROLL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isVerticalScroll() <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVerticalScroll()
	 * @generated
	 * @ordered
	 */
	protected boolean verticalScroll = VERTICAL_SCROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHorizontalScroll() <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalScroll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HORIZONTAL_SCROLL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHorizontalScroll() <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHorizontalScroll()
	 * @generated
	 * @ordered
	 */
	protected boolean horizontalScroll = HORIZONTAL_SCROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasSearch() <em>Has Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSearch()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SEARCH_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isHasSearch() <em>Has Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSearch()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSearch = HAS_SEARCH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<XTableViewerColumn> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTableViewerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXTableViewer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowHeader() {
		return showHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowHeader(boolean newShowHeader) {
		boolean oldShowHeader = showHeader;
		showHeader = newShowHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_HEADER, oldShowHeader, showHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowLines() {
		return showLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLines(boolean newShowLines) {
		boolean oldShowLines = showLines;
		showLines = newShowLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_LINES, oldShowLines, showLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isShowBorder() {
		return showBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowBorder(boolean newShowBorder) {
		boolean oldShowBorder = showBorder;
		showBorder = newShowBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_BORDER, oldShowBorder, showBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVerticalScroll() {
		return verticalScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalScroll(boolean newVerticalScroll) {
		boolean oldVerticalScroll = verticalScroll;
		verticalScroll = newVerticalScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL, oldVerticalScroll, verticalScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHorizontalScroll() {
		return horizontalScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalScroll(boolean newHorizontalScroll) {
		boolean oldHorizontalScroll = horizontalScroll;
		horizontalScroll = newHorizontalScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL, oldHorizontalScroll, horizontalScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSearch() {
		return hasSearch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSearch(boolean newHasSearch) {
		boolean oldHasSearch = hasSearch;
		hasSearch = newHasSearch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__HAS_SEARCH, oldHasSearch, hasSearch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XTableViewerColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<XTableViewerColumn>(XTableViewerColumn.class, this, WidgetPackage.XTABLE_VIEWER__COLUMNS);
		}
		return columns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER__COLUMNS:
				return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER__SHOW_HEADER:
				return isShowHeader();
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				return isShowLines();
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				return isShowBorder();
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				return isVerticalScroll();
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				return isHorizontalScroll();
			case WidgetPackage.XTABLE_VIEWER__HAS_SEARCH:
				return isHasSearch();
			case WidgetPackage.XTABLE_VIEWER__COLUMNS:
				return getColumns();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER__SHOW_HEADER:
				setShowHeader((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				setShowLines((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				setShowBorder((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				setVerticalScroll((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				setHorizontalScroll((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__HAS_SEARCH:
				setHasSearch((Boolean)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends XTableViewerColumn>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER__SHOW_HEADER:
				setShowHeader(SHOW_HEADER_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				setShowLines(SHOW_LINES_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				setShowBorder(SHOW_BORDER_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				setVerticalScroll(VERTICAL_SCROLL_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				setHorizontalScroll(HORIZONTAL_SCROLL_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__HAS_SEARCH:
				setHasSearch(HAS_SEARCH_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER__COLUMNS:
				getColumns().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER__SHOW_HEADER:
				return showHeader != SHOW_HEADER_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				return showLines != SHOW_LINES_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				return showBorder != SHOW_BORDER_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				return verticalScroll != VERTICAL_SCROLL_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				return horizontalScroll != HORIZONTAL_SCROLL_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__HAS_SEARCH:
				return hasSearch != HAS_SEARCH_EDEFAULT;
			case WidgetPackage.XTABLE_VIEWER__COLUMNS:
				return columns != null && !columns.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (showHeader: ");
		result.append(showHeader);
		result.append(", showLines: ");
		result.append(showLines);
		result.append(", showBorder: ");
		result.append(showBorder);
		result.append(", verticalScroll: ");
		result.append(verticalScroll);
		result.append(", horizontalScroll: ");
		result.append(horizontalScroll);
		result.append(", hasSearch: ");
		result.append(hasSearch);
		result.append(')');
		return result.toString();
	}

} //XTableViewerImpl
