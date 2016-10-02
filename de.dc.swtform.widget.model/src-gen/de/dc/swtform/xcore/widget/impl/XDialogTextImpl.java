/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XDialogText;
import de.dc.swtform.xcore.widget.XDialogType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDialog Text</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XDialogTextImpl#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XDialogTextImpl#getDialogType <em>Dialog Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XDialogTextImpl extends XWidgetImpl implements XDialogText {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getDialogType() <em>Dialog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogType()
	 * @generated
	 * @ordered
	 */
	protected static final XDialogType DIALOG_TYPE_EDEFAULT = XDialogType.OPEN_FILE;

	/**
	 * The cached value of the '{@link #getDialogType() <em>Dialog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDialogType()
	 * @generated
	 * @ordered
	 */
	protected XDialogType dialogType = DIALOG_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XDialogTextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXDialogText();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XDIALOG_TEXT__PATH, oldPath, path));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDialogType getDialogType() {
		return dialogType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDialogType(XDialogType newDialogType) {
		XDialogType oldDialogType = dialogType;
		dialogType = newDialogType == null ? DIALOG_TYPE_EDEFAULT : newDialogType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XDIALOG_TEXT__DIALOG_TYPE, oldDialogType, dialogType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WidgetPackage.XDIALOG_TEXT__PATH:
				return getPath();
			case WidgetPackage.XDIALOG_TEXT__DIALOG_TYPE:
				return getDialogType();
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
			case WidgetPackage.XDIALOG_TEXT__PATH:
				setPath((String)newValue);
				return;
			case WidgetPackage.XDIALOG_TEXT__DIALOG_TYPE:
				setDialogType((XDialogType)newValue);
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
			case WidgetPackage.XDIALOG_TEXT__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case WidgetPackage.XDIALOG_TEXT__DIALOG_TYPE:
				setDialogType(DIALOG_TYPE_EDEFAULT);
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
			case WidgetPackage.XDIALOG_TEXT__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case WidgetPackage.XDIALOG_TEXT__DIALOG_TYPE:
				return dialogType != DIALOG_TYPE_EDEFAULT;
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
		result.append(" (path: ");
		result.append(path);
		result.append(", dialogType: ");
		result.append(dialogType);
		result.append(')');
		return result.toString();
	}

} //XDialogTextImpl
