/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XSpinner;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XSpinner</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getPageIncrement <em>Page Increment</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getDigits <em>Digits</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XSpinnerImpl extends XWidgetImpl implements XSpinner {
	/**
	 * The default value of the '{@link #getPageIncrement() <em>Page Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAGE_INCREMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageIncrement() <em>Page Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageIncrement()
	 * @generated
	 * @ordered
	 */
	protected Integer pageIncrement = PAGE_INCREMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DIGITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDigits() <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDigits()
	 * @generated
	 * @ordered
	 */
	protected Integer digits = DIGITS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XSpinnerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXSpinner();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPageIncrement() {
		return pageIncrement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPageIncrement(Integer newPageIncrement) {
		Integer oldPageIncrement = pageIncrement;
		pageIncrement = newPageIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__PAGE_INCREMENT, oldPageIncrement, pageIncrement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDigits() {
		return digits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDigits(Integer newDigits) {
		Integer oldDigits = digits;
		digits = newDigits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__DIGITS, oldDigits, digits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XSPINNER__PAGE_INCREMENT:
				return getPageIncrement();
			case WidgetPackage.XSPINNER__DIGITS:
				return getDigits();
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
			case WidgetPackage.XSPINNER__PAGE_INCREMENT:
				setPageIncrement((Integer)newValue);
				return;
			case WidgetPackage.XSPINNER__DIGITS:
				setDigits((Integer)newValue);
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
			case WidgetPackage.XSPINNER__PAGE_INCREMENT:
				setPageIncrement(PAGE_INCREMENT_EDEFAULT);
				return;
			case WidgetPackage.XSPINNER__DIGITS:
				setDigits(DIGITS_EDEFAULT);
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
			case WidgetPackage.XSPINNER__PAGE_INCREMENT:
				return PAGE_INCREMENT_EDEFAULT == null ? pageIncrement != null : !PAGE_INCREMENT_EDEFAULT.equals(pageIncrement);
			case WidgetPackage.XSPINNER__DIGITS:
				return DIGITS_EDEFAULT == null ? digits != null : !DIGITS_EDEFAULT.equals(digits);
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
		result.append(" (pageIncrement: ");
		result.append(pageIncrement);
		result.append(", digits: ");
		result.append(digits);
		result.append(')');
		return result.toString();
	}

} //XSpinnerImpl
