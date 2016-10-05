/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.ISelectable;
import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XButton;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XButton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XButtonImpl#getSelectionListenerName <em>Selection Listener Name</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XButtonImpl#isHasSelectionListener <em>Has Selection Listener</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XButtonImpl#getIsSelected <em>Is Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XButtonImpl extends XWidgetImpl implements XButton {
	/**
	 * The default value of the '{@link #getSelectionListenerName() <em>Selection Listener Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionListenerName()
	 * @generated
	 * @ordered
	 */
	protected static final String SELECTION_LISTENER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSelectionListenerName() <em>Selection Listener Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelectionListenerName()
	 * @generated
	 * @ordered
	 */
	protected String selectionListenerName = SELECTION_LISTENER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasSelectionListener() <em>Has Selection Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSelectionListener()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SELECTION_LISTENER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSelectionListener() <em>Has Selection Listener</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSelectionListener()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSelectionListener = HAS_SELECTION_LISTENER_EDEFAULT;

	/**
	 * The default value of the '{@link #getIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelected()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean IS_SELECTED_EDEFAULT = Boolean.FALSE;

	/**
	 * The cached value of the '{@link #getIsSelected() <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsSelected()
	 * @generated
	 * @ordered
	 */
	protected Boolean isSelected = IS_SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XButtonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXButton();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSelectionListenerName() {
		return selectionListenerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelectionListenerName(String newSelectionListenerName) {
		String oldSelectionListenerName = selectionListenerName;
		selectionListenerName = newSelectionListenerName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME, oldSelectionListenerName, selectionListenerName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSelectionListener() {
		return hasSelectionListener;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSelectionListener(boolean newHasSelectionListener) {
		boolean oldHasSelectionListener = hasSelectionListener;
		hasSelectionListener = newHasSelectionListener;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER, oldHasSelectionListener, hasSelectionListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getIsSelected() {
		return isSelected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsSelected(Boolean newIsSelected) {
		Boolean oldIsSelected = isSelected;
		isSelected = newIsSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XBUTTON__IS_SELECTED, oldIsSelected, isSelected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME:
				return getSelectionListenerName();
			case WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER:
				return isHasSelectionListener();
			case WidgetPackage.XBUTTON__IS_SELECTED:
				return getIsSelected();
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
			case WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME:
				setSelectionListenerName((String)newValue);
				return;
			case WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER:
				setHasSelectionListener((Boolean)newValue);
				return;
			case WidgetPackage.XBUTTON__IS_SELECTED:
				setIsSelected((Boolean)newValue);
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
			case WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME:
				setSelectionListenerName(SELECTION_LISTENER_NAME_EDEFAULT);
				return;
			case WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER:
				setHasSelectionListener(HAS_SELECTION_LISTENER_EDEFAULT);
				return;
			case WidgetPackage.XBUTTON__IS_SELECTED:
				setIsSelected(IS_SELECTED_EDEFAULT);
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
			case WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME:
				return SELECTION_LISTENER_NAME_EDEFAULT == null ? selectionListenerName != null : !SELECTION_LISTENER_NAME_EDEFAULT.equals(selectionListenerName);
			case WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER:
				return hasSelectionListener != HAS_SELECTION_LISTENER_EDEFAULT;
			case WidgetPackage.XBUTTON__IS_SELECTED:
				return IS_SELECTED_EDEFAULT == null ? isSelected != null : !IS_SELECTED_EDEFAULT.equals(isSelected);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == ISelectable.class) {
			switch (derivedFeatureID) {
				case WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME: return WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME;
				case WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER: return WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == ISelectable.class) {
			switch (baseFeatureID) {
				case WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME: return WidgetPackage.XBUTTON__SELECTION_LISTENER_NAME;
				case WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER: return WidgetPackage.XBUTTON__HAS_SELECTION_LISTENER;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (selectionListenerName: ");
		result.append(selectionListenerName);
		result.append(", hasSelectionListener: ");
		result.append(hasSelectionListener);
		result.append(", isSelected: ");
		result.append(isSelected);
		result.append(')');
		return result.toString();
	}

} //XButtonImpl
