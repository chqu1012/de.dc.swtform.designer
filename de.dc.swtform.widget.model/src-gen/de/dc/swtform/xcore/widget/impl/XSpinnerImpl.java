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
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getSelection <em>Selection</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl#getIncrement <em>Increment</em>}</li>
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
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_EDEFAULT = new Integer(0);

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected Integer minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAXIMUM_EDEFAULT = new Integer(1000);

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected Integer maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SELECTION_EDEFAULT = new Integer(500);

	/**
	 * The cached value of the '{@link #getSelection() <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelection()
	 * @generated
	 * @ordered
	 */
	protected Integer selection = SELECTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected static final Integer INCREMENT_EDEFAULT = new Integer(1);

	/**
	 * The cached value of the '{@link #getIncrement() <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncrement()
	 * @generated
	 * @ordered
	 */
	protected Integer increment = INCREMENT_EDEFAULT;

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
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(Integer newMinimum) {
		Integer oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(Integer newMaximum) {
		Integer oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSelection() {
		return selection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelection(Integer newSelection) {
		Integer oldSelection = selection;
		selection = newSelection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__SELECTION, oldSelection, selection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIncrement() {
		return increment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncrement(Integer newIncrement) {
		Integer oldIncrement = increment;
		increment = newIncrement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XSPINNER__INCREMENT, oldIncrement, increment));
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
			case WidgetPackage.XSPINNER__READ_ONLY:
				return isReadOnly();
			case WidgetPackage.XSPINNER__MINIMUM:
				return getMinimum();
			case WidgetPackage.XSPINNER__MAXIMUM:
				return getMaximum();
			case WidgetPackage.XSPINNER__SELECTION:
				return getSelection();
			case WidgetPackage.XSPINNER__INCREMENT:
				return getIncrement();
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
			case WidgetPackage.XSPINNER__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WidgetPackage.XSPINNER__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case WidgetPackage.XSPINNER__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case WidgetPackage.XSPINNER__SELECTION:
				setSelection((Integer)newValue);
				return;
			case WidgetPackage.XSPINNER__INCREMENT:
				setIncrement((Integer)newValue);
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
			case WidgetPackage.XSPINNER__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WidgetPackage.XSPINNER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case WidgetPackage.XSPINNER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case WidgetPackage.XSPINNER__SELECTION:
				setSelection(SELECTION_EDEFAULT);
				return;
			case WidgetPackage.XSPINNER__INCREMENT:
				setIncrement(INCREMENT_EDEFAULT);
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
			case WidgetPackage.XSPINNER__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WidgetPackage.XSPINNER__MINIMUM:
				return MINIMUM_EDEFAULT == null ? minimum != null : !MINIMUM_EDEFAULT.equals(minimum);
			case WidgetPackage.XSPINNER__MAXIMUM:
				return MAXIMUM_EDEFAULT == null ? maximum != null : !MAXIMUM_EDEFAULT.equals(maximum);
			case WidgetPackage.XSPINNER__SELECTION:
				return SELECTION_EDEFAULT == null ? selection != null : !SELECTION_EDEFAULT.equals(selection);
			case WidgetPackage.XSPINNER__INCREMENT:
				return INCREMENT_EDEFAULT == null ? increment != null : !INCREMENT_EDEFAULT.equals(increment);
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
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", selection: ");
		result.append(selection);
		result.append(", increment: ");
		result.append(increment);
		result.append(')');
		return result.toString();
	}

} //XSpinnerImpl
