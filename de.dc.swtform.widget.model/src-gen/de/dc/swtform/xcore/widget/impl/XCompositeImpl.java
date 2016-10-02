/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XLayout;
import de.dc.swtform.layout.model.XLayoutElement;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XComposite;
import de.dc.swtform.xcore.widget.XViewer;
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
 * An implementation of the model object '<em><b>XComposite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCompositeImpl#getLayout <em>Layout</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCompositeImpl#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCompositeImpl#getViewers <em>Viewers</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XCompositeImpl#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XCompositeImpl extends XWidgetImpl implements XComposite {
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
	 * The cached value of the '{@link #getViewers() <em>Viewers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getViewers()
	 * @generated
	 * @ordered
	 */
	protected EList<XViewer> viewers;

	/**
	 * The cached value of the '{@link #getComposites() <em>Composites</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComposites()
	 * @generated
	 * @ordered
	 */
	protected EList<XComposite> composites;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XCompositeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXComposite();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WidgetPackage.XCOMPOSITE__LAYOUT, oldLayout, newLayout);
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
				msgs = ((InternalEObject)layout).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XCOMPOSITE__LAYOUT, null, msgs);
			if (newLayout != null)
				msgs = ((InternalEObject)newLayout).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XCOMPOSITE__LAYOUT, null, msgs);
			msgs = basicSetLayout(newLayout, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XCOMPOSITE__LAYOUT, newLayout, newLayout));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XWidget> getWidgets() {
		if (widgets == null) {
			widgets = new EObjectContainmentEList<XWidget>(XWidget.class, this, WidgetPackage.XCOMPOSITE__WIDGETS);
		}
		return widgets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XViewer> getViewers() {
		if (viewers == null) {
			viewers = new EObjectContainmentEList<XViewer>(XViewer.class, this, WidgetPackage.XCOMPOSITE__VIEWERS);
		}
		return viewers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<XComposite> getComposites() {
		if (composites == null) {
			composites = new EObjectContainmentEList<XComposite>(XComposite.class, this, WidgetPackage.XCOMPOSITE__COMPOSITES);
		}
		return composites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WidgetPackage.XCOMPOSITE__LAYOUT:
				return basicSetLayout(null, msgs);
			case WidgetPackage.XCOMPOSITE__WIDGETS:
				return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
			case WidgetPackage.XCOMPOSITE__VIEWERS:
				return ((InternalEList<?>)getViewers()).basicRemove(otherEnd, msgs);
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
				return ((InternalEList<?>)getComposites()).basicRemove(otherEnd, msgs);
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
			case WidgetPackage.XCOMPOSITE__LAYOUT:
				return getLayout();
			case WidgetPackage.XCOMPOSITE__WIDGETS:
				return getWidgets();
			case WidgetPackage.XCOMPOSITE__VIEWERS:
				return getViewers();
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
				return getComposites();
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
			case WidgetPackage.XCOMPOSITE__LAYOUT:
				setLayout((XLayout)newValue);
				return;
			case WidgetPackage.XCOMPOSITE__WIDGETS:
				getWidgets().clear();
				getWidgets().addAll((Collection<? extends XWidget>)newValue);
				return;
			case WidgetPackage.XCOMPOSITE__VIEWERS:
				getViewers().clear();
				getViewers().addAll((Collection<? extends XViewer>)newValue);
				return;
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
				getComposites().clear();
				getComposites().addAll((Collection<? extends XComposite>)newValue);
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
			case WidgetPackage.XCOMPOSITE__LAYOUT:
				setLayout((XLayout)null);
				return;
			case WidgetPackage.XCOMPOSITE__WIDGETS:
				getWidgets().clear();
				return;
			case WidgetPackage.XCOMPOSITE__VIEWERS:
				getViewers().clear();
				return;
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
				getComposites().clear();
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
			case WidgetPackage.XCOMPOSITE__LAYOUT:
				return layout != null;
			case WidgetPackage.XCOMPOSITE__WIDGETS:
				return widgets != null && !widgets.isEmpty();
			case WidgetPackage.XCOMPOSITE__VIEWERS:
				return viewers != null && !viewers.isEmpty();
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
				return composites != null && !composites.isEmpty();
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
		if (baseClass == XLayoutElement.class) {
			switch (derivedFeatureID) {
				case WidgetPackage.XCOMPOSITE__LAYOUT: return ModelPackage.XLAYOUT_ELEMENT__LAYOUT;
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
		if (baseClass == XLayoutElement.class) {
			switch (baseFeatureID) {
				case ModelPackage.XLAYOUT_ELEMENT__LAYOUT: return WidgetPackage.XCOMPOSITE__LAYOUT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //XCompositeImpl
