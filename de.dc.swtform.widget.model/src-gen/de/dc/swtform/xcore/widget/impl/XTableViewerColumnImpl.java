/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XTableViewerColumn;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XTable Viewer Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl#getSize <em>Size</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl#isIsFilterCriteria <em>Is Filter Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XTableViewerColumnImpl extends XWidgetImpl implements XTableViewerColumn {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final String TYP_EDEFAULT = "String";

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected String typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = new Integer(100);

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Integer alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFilterCriteria() <em>Is Filter Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFilterCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FILTER_CRITERIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFilterCriteria() <em>Is Filter Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFilterCriteria()
	 * @generated
	 * @ordered
	 */
	protected boolean isFilterCriteria = IS_FILTER_CRITERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XTableViewerColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXTableViewerColumn();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(String newTyp) {
		String oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER_COLUMN__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER_COLUMN__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Integer newAlignment) {
		Integer oldAlignment = alignment;
		alignment = newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER_COLUMN__ALIGNMENT, oldAlignment, alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFilterCriteria() {
		return isFilterCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFilterCriteria(boolean newIsFilterCriteria) {
		boolean oldIsFilterCriteria = isFilterCriteria;
		isFilterCriteria = newIsFilterCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XTABLE_VIEWER_COLUMN__IS_FILTER_CRITERIA, oldIsFilterCriteria, isFilterCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER_COLUMN__TYP:
				return getTyp();
			case WidgetPackage.XTABLE_VIEWER_COLUMN__SIZE:
				return getSize();
			case WidgetPackage.XTABLE_VIEWER_COLUMN__ALIGNMENT:
				return getAlignment();
			case WidgetPackage.XTABLE_VIEWER_COLUMN__IS_FILTER_CRITERIA:
				return isIsFilterCriteria();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WidgetPackage.XTABLE_VIEWER_COLUMN__TYP:
				setTyp((String)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__SIZE:
				setSize((Integer)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__ALIGNMENT:
				setAlignment((Integer)newValue);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__IS_FILTER_CRITERIA:
				setIsFilterCriteria((Boolean)newValue);
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
			case WidgetPackage.XTABLE_VIEWER_COLUMN__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__ALIGNMENT:
				setAlignment(ALIGNMENT_EDEFAULT);
				return;
			case WidgetPackage.XTABLE_VIEWER_COLUMN__IS_FILTER_CRITERIA:
				setIsFilterCriteria(IS_FILTER_CRITERIA_EDEFAULT);
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
			case WidgetPackage.XTABLE_VIEWER_COLUMN__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case WidgetPackage.XTABLE_VIEWER_COLUMN__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case WidgetPackage.XTABLE_VIEWER_COLUMN__ALIGNMENT:
				return ALIGNMENT_EDEFAULT == null ? alignment != null : !ALIGNMENT_EDEFAULT.equals(alignment);
			case WidgetPackage.XTABLE_VIEWER_COLUMN__IS_FILTER_CRITERIA:
				return isFilterCriteria != IS_FILTER_CRITERIA_EDEFAULT;
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(", size: ");
		result.append(size);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", isFilterCriteria: ");
		result.append(isFilterCriteria);
		result.append(')');
		return result.toString();
	}

} //XTableViewerColumnImpl
