/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XComboItem;
import de.dc.swtform.xcore.widget.XLabelCombo;

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
 * An implementation of the model object '<em><b>XLabel Combo</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelComboImpl#getComboWidth <em>Combo Width</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelComboImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XLabelComboImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XLabelComboImpl extends XWidgetImpl implements XLabelCombo {
	/**
	 * The default value of the '{@link #getComboWidth() <em>Combo Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int COMBO_WIDTH_EDEFAULT = 100;

	/**
	 * The cached value of the '{@link #getComboWidth() <em>Combo Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComboWidth()
	 * @generated
	 * @ordered
	 */
	protected int comboWidth = COMBO_WIDTH_EDEFAULT;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<XComboItem> items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XLabelComboImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXLabelCombo();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComboWidth() {
		return comboWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComboWidth(int newComboWidth) {
		int oldComboWidth = comboWidth;
		comboWidth = newComboWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XLABEL_COMBO__COMBO_WIDTH, oldComboWidth, comboWidth));
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
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XLABEL_COMBO__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XComboItem> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<XComboItem>(XComboItem.class, this, WidgetPackage.XLABEL_COMBO__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WidgetPackage.XLABEL_COMBO__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case WidgetPackage.XLABEL_COMBO__COMBO_WIDTH:
				return getComboWidth();
			case WidgetPackage.XLABEL_COMBO__READ_ONLY:
				return isReadOnly();
			case WidgetPackage.XLABEL_COMBO__ITEMS:
				return getItems();
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
			case WidgetPackage.XLABEL_COMBO__COMBO_WIDTH:
				setComboWidth((Integer)newValue);
				return;
			case WidgetPackage.XLABEL_COMBO__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case WidgetPackage.XLABEL_COMBO__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends XComboItem>)newValue);
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
			case WidgetPackage.XLABEL_COMBO__COMBO_WIDTH:
				setComboWidth(COMBO_WIDTH_EDEFAULT);
				return;
			case WidgetPackage.XLABEL_COMBO__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case WidgetPackage.XLABEL_COMBO__ITEMS:
				getItems().clear();
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
			case WidgetPackage.XLABEL_COMBO__COMBO_WIDTH:
				return comboWidth != COMBO_WIDTH_EDEFAULT;
			case WidgetPackage.XLABEL_COMBO__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case WidgetPackage.XLABEL_COMBO__ITEMS:
				return items != null && !items.isEmpty();
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
		result.append(" (comboWidth: ");
		result.append(comboWidth);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //XLabelComboImpl
