/**
 */
package de.dc.swtform.layout.model.provider;


import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XRowLayout;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.swtform.layout.model.XRowLayout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XRowLayoutItemProvider extends XLayoutItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRowLayoutItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addTypPropertyDescriptor(object);
			addSpacingPropertyDescriptor(object);
			addWrapPropertyDescriptor(object);
			addPackPropertyDescriptor(object);
			addFillPropertyDescriptor(object);
			addCenterPropertyDescriptor(object);
			addJustifyPropertyDescriptor(object);
			addMarginLeftPropertyDescriptor(object);
			addMarginTopPropertyDescriptor(object);
			addMarginRightPropertyDescriptor(object);
			addMarginBottomPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Typ feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_typ_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_typ_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__TYP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_spacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_spacing_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__SPACING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Wrap feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWrapPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_wrap_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_wrap_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__WRAP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pack feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_pack_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_pack_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__PACK,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fill feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFillPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_fill_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_fill_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__FILL,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Center feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCenterPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_center_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_center_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__CENTER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Justify feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJustifyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_justify_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_justify_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__JUSTIFY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Margin Left feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginLeftPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_marginLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_marginLeft_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__MARGIN_LEFT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Margin Top feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginTopPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_marginTop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_marginTop_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__MARGIN_TOP,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Margin Right feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginRightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_marginRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_marginRight_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__MARGIN_RIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Margin Bottom feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMarginBottomPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XRowLayout_marginBottom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XRowLayout_marginBottom_feature", "_UI_XRowLayout_type"),
				 ModelPackage.Literals.XROW_LAYOUT__MARGIN_BOTTOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns XRowLayout.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XRowLayout"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XRowLayout)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XRowLayout_type") :
			getString("_UI_XRowLayout_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(XRowLayout.class)) {
			case ModelPackage.XROW_LAYOUT__TYP:
			case ModelPackage.XROW_LAYOUT__SPACING:
			case ModelPackage.XROW_LAYOUT__WRAP:
			case ModelPackage.XROW_LAYOUT__PACK:
			case ModelPackage.XROW_LAYOUT__FILL:
			case ModelPackage.XROW_LAYOUT__CENTER:
			case ModelPackage.XROW_LAYOUT__JUSTIFY:
			case ModelPackage.XROW_LAYOUT__MARGIN_LEFT:
			case ModelPackage.XROW_LAYOUT__MARGIN_TOP:
			case ModelPackage.XROW_LAYOUT__MARGIN_RIGHT:
			case ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}
