/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XLayout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XLayout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.impl.XLayoutImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XLayoutImpl#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XLayoutImpl#getMarginHeight <em>Margin Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XLayoutImpl extends MinimalEObjectImpl.Container implements XLayout {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginWidth() <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer marginWidth = MARGIN_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginHeight() <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer marginHeight = MARGIN_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XLAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XLAYOUT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginWidth() {
		return marginWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginWidth(Integer newMarginWidth) {
		Integer oldMarginWidth = marginWidth;
		marginWidth = newMarginWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XLAYOUT__MARGIN_WIDTH, oldMarginWidth, marginWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginHeight() {
		return marginHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginHeight(Integer newMarginHeight) {
		Integer oldMarginHeight = marginHeight;
		marginHeight = newMarginHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XLAYOUT__MARGIN_HEIGHT, oldMarginHeight, marginHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XLAYOUT__NAME:
				return getName();
			case ModelPackage.XLAYOUT__MARGIN_WIDTH:
				return getMarginWidth();
			case ModelPackage.XLAYOUT__MARGIN_HEIGHT:
				return getMarginHeight();
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
			case ModelPackage.XLAYOUT__NAME:
				setName((String)newValue);
				return;
			case ModelPackage.XLAYOUT__MARGIN_WIDTH:
				setMarginWidth((Integer)newValue);
				return;
			case ModelPackage.XLAYOUT__MARGIN_HEIGHT:
				setMarginHeight((Integer)newValue);
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
			case ModelPackage.XLAYOUT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ModelPackage.XLAYOUT__MARGIN_WIDTH:
				setMarginWidth(MARGIN_WIDTH_EDEFAULT);
				return;
			case ModelPackage.XLAYOUT__MARGIN_HEIGHT:
				setMarginHeight(MARGIN_HEIGHT_EDEFAULT);
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
			case ModelPackage.XLAYOUT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ModelPackage.XLAYOUT__MARGIN_WIDTH:
				return MARGIN_WIDTH_EDEFAULT == null ? marginWidth != null : !MARGIN_WIDTH_EDEFAULT.equals(marginWidth);
			case ModelPackage.XLAYOUT__MARGIN_HEIGHT:
				return MARGIN_HEIGHT_EDEFAULT == null ? marginHeight != null : !MARGIN_HEIGHT_EDEFAULT.equals(marginHeight);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", marginWidth: ");
		result.append(marginWidth);
		result.append(", marginHeight: ");
		result.append(marginHeight);
		result.append(')');
		return result.toString();
	}

} //XLayoutImpl
