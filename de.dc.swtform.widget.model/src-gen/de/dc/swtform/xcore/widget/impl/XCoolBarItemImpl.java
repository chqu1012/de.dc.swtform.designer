/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.ISelectable;
import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XCoolBarItem;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XCool Bar Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCoolBarItemImpl#getSelectionListenerName <em>Selection Listener Name</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCoolBarItemImpl#isHasSelectionListener <em>Has Selection Listener</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XCoolBarItemImpl extends XWidgetImpl implements XCoolBarItem {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XCoolBarItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXCoolBarItem();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME, oldSelectionListenerName, selectionListenerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER, oldHasSelectionListener, hasSelectionListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME:
				return getSelectionListenerName();
			case WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER:
				return isHasSelectionListener();
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
			case WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME:
				setSelectionListenerName((String)newValue);
				return;
			case WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER:
				setHasSelectionListener((Boolean)newValue);
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
			case WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME:
				setSelectionListenerName(SELECTION_LISTENER_NAME_EDEFAULT);
				return;
			case WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER:
				setHasSelectionListener(HAS_SELECTION_LISTENER_EDEFAULT);
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
			case WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME:
				return SELECTION_LISTENER_NAME_EDEFAULT == null ? selectionListenerName != null : !SELECTION_LISTENER_NAME_EDEFAULT.equals(selectionListenerName);
			case WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER:
				return hasSelectionListener != HAS_SELECTION_LISTENER_EDEFAULT;
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
				case WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME: return WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME;
				case WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER: return WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER;
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
				case WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME: return WidgetPackage.XCOOL_BAR_ITEM__SELECTION_LISTENER_NAME;
				case WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER: return WidgetPackage.XCOOL_BAR_ITEM__HAS_SELECTION_LISTENER;
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
		result.append(')');
		return result.toString();
	}

} //XCoolBarItemImpl
