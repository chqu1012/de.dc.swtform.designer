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
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getShowBorder <em>Show Border</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getVerticalScroll <em>Vertical Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getHorizontalScroll <em>Horizontal Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTableViewerImpl extends XViewerImpl implements XTableViewer {
	/**
	 * The default value of the '{@link #getShowHeader() <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowHeader()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowHeader() <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowHeader()
	 * @generated
	 * @ordered
	 */
	protected Boolean showHeader = SHOW_HEADER_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowLines() <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowLines()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_LINES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowLines() <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowLines()
	 * @generated
	 * @ordered
	 */
	protected Boolean showLines = SHOW_LINES_EDEFAULT;

	/**
	 * The default value of the '{@link #getShowBorder() <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowBorder()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_BORDER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShowBorder() <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShowBorder()
	 * @generated
	 * @ordered
	 */
	protected Boolean showBorder = SHOW_BORDER_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalScroll() <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalScroll()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VERTICAL_SCROLL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalScroll() <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalScroll()
	 * @generated
	 * @ordered
	 */
	protected Boolean verticalScroll = VERTICAL_SCROLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalScroll() <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalScroll()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean HORIZONTAL_SCROLL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalScroll() <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalScroll()
	 * @generated
	 * @ordered
	 */
	protected Boolean horizontalScroll = HORIZONTAL_SCROLL_EDEFAULT;

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
	public Boolean getShowHeader() {
		return showHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowHeader(Boolean newShowHeader) {
		Boolean oldShowHeader = showHeader;
		showHeader = newShowHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_HEADER, oldShowHeader, showHeader));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowLines() {
		return showLines;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowLines(Boolean newShowLines) {
		Boolean oldShowLines = showLines;
		showLines = newShowLines;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_LINES, oldShowLines, showLines));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getShowBorder() {
		return showBorder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShowBorder(Boolean newShowBorder) {
		Boolean oldShowBorder = showBorder;
		showBorder = newShowBorder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__SHOW_BORDER, oldShowBorder, showBorder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getVerticalScroll() {
		return verticalScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalScroll(Boolean newVerticalScroll) {
		Boolean oldVerticalScroll = verticalScroll;
		verticalScroll = newVerticalScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL, oldVerticalScroll, verticalScroll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getHorizontalScroll() {
		return horizontalScroll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalScroll(Boolean newHorizontalScroll) {
		Boolean oldHorizontalScroll = horizontalScroll;
		horizontalScroll = newHorizontalScroll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL, oldHorizontalScroll, horizontalScroll));
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
				return getShowHeader();
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				return getShowLines();
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				return getShowBorder();
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				return getVerticalScroll();
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				return getHorizontalScroll();
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
				return SHOW_HEADER_EDEFAULT == null ? showHeader != null : !SHOW_HEADER_EDEFAULT.equals(showHeader);
			case WidgetPackage.XTABLE_VIEWER__SHOW_LINES:
				return SHOW_LINES_EDEFAULT == null ? showLines != null : !SHOW_LINES_EDEFAULT.equals(showLines);
			case WidgetPackage.XTABLE_VIEWER__SHOW_BORDER:
				return SHOW_BORDER_EDEFAULT == null ? showBorder != null : !SHOW_BORDER_EDEFAULT.equals(showBorder);
			case WidgetPackage.XTABLE_VIEWER__VERTICAL_SCROLL:
				return VERTICAL_SCROLL_EDEFAULT == null ? verticalScroll != null : !VERTICAL_SCROLL_EDEFAULT.equals(verticalScroll);
			case WidgetPackage.XTABLE_VIEWER__HORIZONTAL_SCROLL:
				return HORIZONTAL_SCROLL_EDEFAULT == null ? horizontalScroll != null : !HORIZONTAL_SCROLL_EDEFAULT.equals(horizontalScroll);
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
		result.append(')');
		return result.toString();
	}

} //XTableViewerImpl
