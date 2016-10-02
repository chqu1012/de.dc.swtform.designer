/**
 */
package de.dc.swtform.xcore.model.impl;

import de.dc.swtform.layout.model.XLayout;
import de.dc.swtform.layout.model.XLayoutData;

import de.dc.swtform.xcore.model.ModelPackage;
import de.dc.swtform.xcore.model.SwtForm;
import de.dc.swtform.xcore.model.XLayoutDataElement;
import de.dc.swtform.xcore.model.XLayoutElement;

import de.dc.swtform.xcore.widget.XWidget;

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
 * An implementation of the model object '<em><b>Swt Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.model.impl.SwtFormImpl#getLayoutData <em>Layout Data</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.model.impl.SwtFormImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.model.impl.SwtFormImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwtFormImpl extends XNamedElementImpl implements SwtForm {
	/**
	 * The cached value of the '{@link #getLayoutData() <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayoutData()
	 * @generated
	 * @ordered
	 */
	protected XLayoutData layoutData;

	/**
	 * The cached value of the '{@link #getLayout() <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLayout()
	 * @generated
	 * @ordered
	 */
	protected XLayout layout;

	/**
	 * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidgets()
	 * @generated
	 * @ordered
	 */
	protected EList<XWidget> widgets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwtFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.SWT_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLayoutData getLayoutData() {
		return layoutData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayoutData(XLayoutData newLayoutData, NotificationChain msgs) {
		XLayoutData oldLayoutData = layoutData;
		layoutData = newLayoutData;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SWT_FORM__LAYOUT_DATA, oldLayoutData, newLayoutData);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayoutData(XLayoutData newLayoutData) {
		if (newLayoutData != layoutData) {
			NotificationChain msgs = null;
			if (layoutData != null)
				msgs = ((InternalEObject)layoutData).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWT_FORM__LAYOUT_DATA, null, msgs);
			if (newLayoutData != null)
				msgs = ((InternalEObject)newLayoutData).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWT_FORM__LAYOUT_DATA, null, msgs);
			msgs = basicSetLayoutData(newLayoutData, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SWT_FORM__LAYOUT_DATA, newLayoutData, newLayoutData));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLayout getLayout() {
		return layout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLayout(XLayout newLayout, NotificationChain msgs) {
		XLayout oldLayout = layout;
		layout = newLayout;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ModelPackage.SWT_FORM__LAYOUT, oldLayout, newLayout);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLayout(XLayout newLayout) {
		if (newLayout != layout) {
			NotificationChain msgs = null;
			if (layout != null)
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWT_FORM__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ModelPackage.SWT_FORM__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.SWT_FORM__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<XWidget>(XWidget.class, this, ModelPackage.SWT_FORM__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
				return basicSetLayoutData(null, msgs);
			case ModelPackage.SWT_FORM__LAYOUT:
				return basicSetLayout(null, msgs);
			case ModelPackage.SWT_FORM__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
				return getLayoutData();
			case ModelPackage.SWT_FORM__LAYOUT:
				return getLayout();
			case ModelPackage.SWT_FORM__WIDGETS:
				return getWidgets();
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
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
				setLayoutData((XLayoutData)newValue);
				return;
			case ModelPackage.SWT_FORM__LAYOUT:
				setLayout((XLayout)newValue);
				return;
			case ModelPackage.SWT_FORM__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends XWidget>)newValue);
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
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
				setLayoutData((XLayoutData)null);
				return;
			case ModelPackage.SWT_FORM__LAYOUT:
				setLayout((XLayout)null);
				return;
			case ModelPackage.SWT_FORM__WIDGETS:
				getWidgets().clear();
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
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
				return layoutData != null;
			case ModelPackage.SWT_FORM__LAYOUT:
				return layout != null;
			case ModelPackage.SWT_FORM__WIDGETS:
				return widgets != null && !widgets.isEmpty();
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
		if (baseClass == XLayoutDataElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SWT_FORM__LAYOUT_DATA: return ModelPackage.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA;
				default: return -1;
			}
		}
		if (baseClass == XLayoutElement.class) {
			switch (derivedFeatureID) {
				case ModelPackage.SWT_FORM__LAYOUT: return ModelPackage.XLAYOUT_ELEMENT__LAYOUT;
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
		if (baseClass == XLayoutDataElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA: return ModelPackage.SWT_FORM__LAYOUT_DATA;
				default: return -1;
			}
		}
		if (baseClass == XLayoutElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.XLAYOUT_ELEMENT__LAYOUT: return ModelPackage.SWT_FORM__LAYOUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //SwtFormImpl
