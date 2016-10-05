/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.ISelectable;
import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XLabel;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XLabel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelImpl#getSelectionListenerName <em>Selection Listener Name</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelImpl#isHasSelectionListener <em>Has Selection Listener</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelImpl#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XLabelImpl extends XWidgetImpl implements XLabel {
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
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected int width = WIDTH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XLabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXLabel();
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XLABEL__SELECTION_LISTENER_NAME, oldSelectionListenerName, selectionListenerName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XLABEL__HAS_SELECTION_LISTENER, oldHasSelectionListener, hasSelectionListener));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(int newWidth) {
		int oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XLABEL__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XLABEL__SELECTION_LISTENER_NAME:
				return getSelectionListenerName();
			case WidgetPackage.XLABEL__HAS_SELECTION_LISTENER:
				return isHasSelectionListener();
			case WidgetPackage.XLABEL__WIDTH:
				return getWidth();
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
			case WidgetPackage.XLABEL__SELECTION_LISTENER_NAME:
				setSelectionListenerName((String)newValue);
				return;
			case WidgetPackage.XLABEL__HAS_SELECTION_LISTENER:
				setHasSelectionListener((Boolean)newValue);
				return;
			case WidgetPackage.XLABEL__WIDTH:
				setWidth((Integer)newValue);
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
			case WidgetPackage.XLABEL__SELECTION_LISTENER_NAME:
				setSelectionListenerName(SELECTION_LISTENER_NAME_EDEFAULT);
				return;
			case WidgetPackage.XLABEL__HAS_SELECTION_LISTENER:
				setHasSelectionListener(HAS_SELECTION_LISTENER_EDEFAULT);
				return;
			case WidgetPackage.XLABEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
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
			case WidgetPackage.XLABEL__SELECTION_LISTENER_NAME:
				return SELECTION_LISTENER_NAME_EDEFAULT == null ? selectionListenerName != null : !SELECTION_LISTENER_NAME_EDEFAULT.equals(selectionListenerName);
			case WidgetPackage.XLABEL__HAS_SELECTION_LISTENER:
				return hasSelectionListener != HAS_SELECTION_LISTENER_EDEFAULT;
			case WidgetPackage.XLABEL__WIDTH:
				return width != WIDTH_EDEFAULT;
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
				case WidgetPackage.XLABEL__SELECTION_LISTENER_NAME: return WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME;
				case WidgetPackage.XLABEL__HAS_SELECTION_LISTENER: return WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER;
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
				case WidgetPackage.ISELECTABLE__SELECTION_LISTENER_NAME: return WidgetPackage.XLABEL__SELECTION_LISTENER_NAME;
				case WidgetPackage.ISELECTABLE__HAS_SELECTION_LISTENER: return WidgetPackage.XLABEL__HAS_SELECTION_LISTENER;
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
		result.append(", width: ");
		result.append(width);
		result.append(')');
		return result.toString();
	}

} //XLabelImpl
