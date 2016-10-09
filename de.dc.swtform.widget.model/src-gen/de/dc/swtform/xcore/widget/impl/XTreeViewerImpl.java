/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XTreeViewer;
import de.dc.swtform.xcore.widget.XTreeViewerColumn;

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
 * An implementation of the model object '<em><b>XTree Viewer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTreeViewerImpl#isShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTreeViewerImpl#isShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTreeViewerImpl#isHasFilter <em>Has Filter</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTreeViewerImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTreeViewerImpl extends XViewerImpl implements XTreeViewer {
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
	 * The default value of the '{@link #isHasFilter() <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasFilter() <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean hasFilter = HAS_FILTER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<XTreeViewerColumn> columns;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTreeViewerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXTreeViewer();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTREE_VIEWER__SHOW_HEADER, oldShowHeader, showHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTREE_VIEWER__SHOW_LINES, oldShowLines, showLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasFilter() {
		return hasFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFilter(boolean newHasFilter) {
		boolean oldHasFilter = hasFilter;
		hasFilter = newHasFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTREE_VIEWER__HAS_FILTER, oldHasFilter, hasFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XTreeViewerColumn> getColumns() {
		if (columns == null) {
			columns = new EObjectContainmentEList<XTreeViewerColumn>(XTreeViewerColumn.class, this, WidgetPackage.XTREE_VIEWER__COLUMNS);
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
			case WidgetPackage.XTREE_VIEWER__COLUMNS:
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
			case WidgetPackage.XTREE_VIEWER__SHOW_HEADER:
				return isShowHeader();
			case WidgetPackage.XTREE_VIEWER__SHOW_LINES:
				return isShowLines();
			case WidgetPackage.XTREE_VIEWER__HAS_FILTER:
				return isHasFilter();
			case WidgetPackage.XTREE_VIEWER__COLUMNS:
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
			case WidgetPackage.XTREE_VIEWER__SHOW_HEADER:
				setShowHeader((Boolean)newValue);
				return;
			case WidgetPackage.XTREE_VIEWER__SHOW_LINES:
				setShowLines((Boolean)newValue);
				return;
			case WidgetPackage.XTREE_VIEWER__HAS_FILTER:
				setHasFilter((Boolean)newValue);
				return;
			case WidgetPackage.XTREE_VIEWER__COLUMNS:
				getColumns().clear();
				getColumns().addAll((Collection<? extends XTreeViewerColumn>)newValue);
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
			case WidgetPackage.XTREE_VIEWER__SHOW_HEADER:
				setShowHeader(SHOW_HEADER_EDEFAULT);
				return;
			case WidgetPackage.XTREE_VIEWER__SHOW_LINES:
				setShowLines(SHOW_LINES_EDEFAULT);
				return;
			case WidgetPackage.XTREE_VIEWER__HAS_FILTER:
				setHasFilter(HAS_FILTER_EDEFAULT);
				return;
			case WidgetPackage.XTREE_VIEWER__COLUMNS:
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
			case WidgetPackage.XTREE_VIEWER__SHOW_HEADER:
				return showHeader != SHOW_HEADER_EDEFAULT;
			case WidgetPackage.XTREE_VIEWER__SHOW_LINES:
				return showLines != SHOW_LINES_EDEFAULT;
			case WidgetPackage.XTREE_VIEWER__HAS_FILTER:
				return hasFilter != HAS_FILTER_EDEFAULT;
			case WidgetPackage.XTREE_VIEWER__COLUMNS:
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
		result.append(", hasFilter: ");
		result.append(hasFilter);
		result.append(')');
		return result.toString();
	}

} //XTreeViewerImpl
