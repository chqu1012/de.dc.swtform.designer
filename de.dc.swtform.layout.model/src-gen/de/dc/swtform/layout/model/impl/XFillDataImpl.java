/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XFillData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XFill Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getDefaultWidth <em>Default Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getDefaultHeight <em>Default Height</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getCurrentWhint <em>Current Whint</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getCurrentHhint <em>Current Hhint</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getCurrentWidth <em>Current Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XFillDataImpl#getCurrentHeight <em>Current Height</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XFillDataImpl extends XLayoutDataImpl implements XFillData {
	/**
	 * The default value of the '{@link #getDefaultWidth() <em>Default Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultWidth() <em>Default Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultWidth = DEFAULT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultHeight() <em>Default Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEFAULT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultHeight() <em>Default Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer defaultHeight = DEFAULT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentWhint() <em>Current Whint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWhint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_WHINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentWhint() <em>Current Whint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWhint()
	 * @generated
	 * @ordered
	 */
	protected Integer currentWhint = CURRENT_WHINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentHhint() <em>Current Hhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHhint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_HHINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentHhint() <em>Current Hhint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHhint()
	 * @generated
	 * @ordered
	 */
	protected Integer currentHhint = CURRENT_HHINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentWidth() <em>Current Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentWidth() <em>Current Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer currentWidth = CURRENT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getCurrentHeight() <em>Current Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CURRENT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentHeight() <em>Current Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer currentHeight = CURRENT_HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XFillDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XFILL_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultWidth() {
		return defaultWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultWidth(Integer newDefaultWidth) {
		Integer oldDefaultWidth = defaultWidth;
		defaultWidth = newDefaultWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__DEFAULT_WIDTH, oldDefaultWidth, defaultWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefaultHeight() {
		return defaultHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultHeight(Integer newDefaultHeight) {
		Integer oldDefaultHeight = defaultHeight;
		defaultHeight = newDefaultHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__DEFAULT_HEIGHT, oldDefaultHeight, defaultHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentWhint() {
		return currentWhint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentWhint(Integer newCurrentWhint) {
		Integer oldCurrentWhint = currentWhint;
		currentWhint = newCurrentWhint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__CURRENT_WHINT, oldCurrentWhint, currentWhint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentHhint() {
		return currentHhint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentHhint(Integer newCurrentHhint) {
		Integer oldCurrentHhint = currentHhint;
		currentHhint = newCurrentHhint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__CURRENT_HHINT, oldCurrentHhint, currentHhint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentWidth() {
		return currentWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentWidth(Integer newCurrentWidth) {
		Integer oldCurrentWidth = currentWidth;
		currentWidth = newCurrentWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__CURRENT_WIDTH, oldCurrentWidth, currentWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCurrentHeight() {
		return currentHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentHeight(Integer newCurrentHeight) {
		Integer oldCurrentHeight = currentHeight;
		currentHeight = newCurrentHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XFILL_DATA__CURRENT_HEIGHT, oldCurrentHeight, currentHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XFILL_DATA__DEFAULT_WIDTH:
				return getDefaultWidth();
			case ModelPackage.XFILL_DATA__DEFAULT_HEIGHT:
				return getDefaultHeight();
			case ModelPackage.XFILL_DATA__CURRENT_WHINT:
				return getCurrentWhint();
			case ModelPackage.XFILL_DATA__CURRENT_HHINT:
				return getCurrentHhint();
			case ModelPackage.XFILL_DATA__CURRENT_WIDTH:
				return getCurrentWidth();
			case ModelPackage.XFILL_DATA__CURRENT_HEIGHT:
				return getCurrentHeight();
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
			case ModelPackage.XFILL_DATA__DEFAULT_WIDTH:
				setDefaultWidth((Integer)newValue);
				return;
			case ModelPackage.XFILL_DATA__DEFAULT_HEIGHT:
				setDefaultHeight((Integer)newValue);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_WHINT:
				setCurrentWhint((Integer)newValue);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_HHINT:
				setCurrentHhint((Integer)newValue);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_WIDTH:
				setCurrentWidth((Integer)newValue);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_HEIGHT:
				setCurrentHeight((Integer)newValue);
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
			case ModelPackage.XFILL_DATA__DEFAULT_WIDTH:
				setDefaultWidth(DEFAULT_WIDTH_EDEFAULT);
				return;
			case ModelPackage.XFILL_DATA__DEFAULT_HEIGHT:
				setDefaultHeight(DEFAULT_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_WHINT:
				setCurrentWhint(CURRENT_WHINT_EDEFAULT);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_HHINT:
				setCurrentHhint(CURRENT_HHINT_EDEFAULT);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_WIDTH:
				setCurrentWidth(CURRENT_WIDTH_EDEFAULT);
				return;
			case ModelPackage.XFILL_DATA__CURRENT_HEIGHT:
				setCurrentHeight(CURRENT_HEIGHT_EDEFAULT);
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
			case ModelPackage.XFILL_DATA__DEFAULT_WIDTH:
				return DEFAULT_WIDTH_EDEFAULT == null ? defaultWidth != null : !DEFAULT_WIDTH_EDEFAULT.equals(defaultWidth);
			case ModelPackage.XFILL_DATA__DEFAULT_HEIGHT:
				return DEFAULT_HEIGHT_EDEFAULT == null ? defaultHeight != null : !DEFAULT_HEIGHT_EDEFAULT.equals(defaultHeight);
			case ModelPackage.XFILL_DATA__CURRENT_WHINT:
				return CURRENT_WHINT_EDEFAULT == null ? currentWhint != null : !CURRENT_WHINT_EDEFAULT.equals(currentWhint);
			case ModelPackage.XFILL_DATA__CURRENT_HHINT:
				return CURRENT_HHINT_EDEFAULT == null ? currentHhint != null : !CURRENT_HHINT_EDEFAULT.equals(currentHhint);
			case ModelPackage.XFILL_DATA__CURRENT_WIDTH:
				return CURRENT_WIDTH_EDEFAULT == null ? currentWidth != null : !CURRENT_WIDTH_EDEFAULT.equals(currentWidth);
			case ModelPackage.XFILL_DATA__CURRENT_HEIGHT:
				return CURRENT_HEIGHT_EDEFAULT == null ? currentHeight != null : !CURRENT_HEIGHT_EDEFAULT.equals(currentHeight);
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
		result.append(" (defaultWidth: ");
		result.append(defaultWidth);
		result.append(", defaultHeight: ");
		result.append(defaultHeight);
		result.append(", currentWhint: ");
		result.append(currentWhint);
		result.append(", currentHhint: ");
		result.append(currentHhint);
		result.append(", currentWidth: ");
		result.append(currentWidth);
		result.append(", currentHeight: ");
		result.append(currentHeight);
		result.append(')');
		return result.toString();
	}

} //XFillDataImpl
