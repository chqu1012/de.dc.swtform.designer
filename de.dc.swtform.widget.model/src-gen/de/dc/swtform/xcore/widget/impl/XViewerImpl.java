/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XContentProvider;
import de.dc.swtform.xcore.widget.XLabelProvider;
import de.dc.swtform.xcore.widget.XMenu;
import de.dc.swtform.xcore.widget.XViewer;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XViewer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XViewerImpl#getLabelProvider <em>Label Provider</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XViewerImpl#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.impl.XViewerImpl#getMenu <em>Menu</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class XViewerImpl extends XWidgetImpl implements XViewer {
	/**
	 * The cached value of the '{@link #getLabelProvider() <em>Label Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabelProvider()
	 * @generated
	 * @ordered
	 */
	protected XLabelProvider labelProvider;

	/**
	 * The cached value of the '{@link #getContentProvider() <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentProvider()
	 * @generated
	 * @ordered
	 */
	protected XContentProvider contentProvider;

	/**
	 * The cached value of the '{@link #getMenu() <em>Menu</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenu()
	 * @generated
	 * @ordered
	 */
	protected XMenu menu;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XViewerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WidgetPackage.eINSTANCE.getXViewer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLabelProvider getLabelProvider() {
		return labelProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabelProvider(XLabelProvider newLabelProvider, NotificationChain msgs) {
		XLabelProvider oldLabelProvider = labelProvider;
		labelProvider = newLabelProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__LABEL_PROVIDER, oldLabelProvider, newLabelProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabelProvider(XLabelProvider newLabelProvider) {
		if (newLabelProvider != labelProvider) {
			NotificationChain msgs = null;
			if (labelProvider != null)
				msgs = ((InternalEObject)labelProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__LABEL_PROVIDER, null, msgs);
			if (newLabelProvider != null)
				msgs = ((InternalEObject)newLabelProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__LABEL_PROVIDER, null, msgs);
			msgs = basicSetLabelProvider(newLabelProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__LABEL_PROVIDER, newLabelProvider, newLabelProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XContentProvider getContentProvider() {
		return contentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentProvider(XContentProvider newContentProvider, NotificationChain msgs) {
		XContentProvider oldContentProvider = contentProvider;
		contentProvider = newContentProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentProvider(XContentProvider newContentProvider) {
		if (newContentProvider != contentProvider) {
			NotificationChain msgs = null;
			if (contentProvider != null)
				msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__CONTENT_PROVIDER, null, msgs);
			if (newContentProvider != null)
				msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__CONTENT_PROVIDER, null, msgs);
			msgs = basicSetContentProvider(newContentProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__CONTENT_PROVIDER, newContentProvider, newContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMenu getMenu() {
		return menu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMenu(XMenu newMenu, NotificationChain msgs) {
		XMenu oldMenu = menu;
		menu = newMenu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__MENU, oldMenu, newMenu);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenu(XMenu newMenu) {
		if (newMenu != menu) {
			NotificationChain msgs = null;
			if (menu != null)
				msgs = ((InternalEObject)menu).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__MENU, null, msgs);
			if (newMenu != null)
				msgs = ((InternalEObject)newMenu).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WidgetPackage.XVIEWER__MENU, null, msgs);
			msgs = basicSetMenu(newMenu, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WidgetPackage.XVIEWER__MENU, newMenu, newMenu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WidgetPackage.XVIEWER__LABEL_PROVIDER:
				return basicSetLabelProvider(null, msgs);
			case WidgetPackage.XVIEWER__CONTENT_PROVIDER:
				return basicSetContentProvider(null, msgs);
			case WidgetPackage.XVIEWER__MENU:
				return basicSetMenu(null, msgs);
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
			case WidgetPackage.XVIEWER__LABEL_PROVIDER:
				return getLabelProvider();
			case WidgetPackage.XVIEWER__CONTENT_PROVIDER:
				return getContentProvider();
			case WidgetPackage.XVIEWER__MENU:
				return getMenu();
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
			case WidgetPackage.XVIEWER__LABEL_PROVIDER:
				setLabelProvider((XLabelProvider)newValue);
				return;
			case WidgetPackage.XVIEWER__CONTENT_PROVIDER:
				setContentProvider((XContentProvider)newValue);
				return;
			case WidgetPackage.XVIEWER__MENU:
				setMenu((XMenu)newValue);
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
			case WidgetPackage.XVIEWER__LABEL_PROVIDER:
				setLabelProvider((XLabelProvider)null);
				return;
			case WidgetPackage.XVIEWER__CONTENT_PROVIDER:
				setContentProvider((XContentProvider)null);
				return;
			case WidgetPackage.XVIEWER__MENU:
				setMenu((XMenu)null);
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
			case WidgetPackage.XVIEWER__LABEL_PROVIDER:
				return labelProvider != null;
			case WidgetPackage.XVIEWER__CONTENT_PROVIDER:
				return contentProvider != null;
			case WidgetPackage.XVIEWER__MENU:
				return menu != null;
		}
		return super.eIsSet(featureID);
	}

} //XViewerImpl
