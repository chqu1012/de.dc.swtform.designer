/**
 */
package de.dc.swtform.layout.model.provider;


import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XGridLayout;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.swtform.layout.model.XGridLayout} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XGridLayoutItemProvider extends XLayoutItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XGridLayoutItemProvider(AdapterFactory adapterFactory) {
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

			addNumColumnsPropertyDescriptor(object);
			addMakeColumnsEqualWidthPropertyDescriptor(object);
			addMarginLeftPropertyDescriptor(object);
			addMarginTopPropertyDescriptor(object);
			addMarginRightPropertyDescriptor(object);
			addMarginBottomPropertyDescriptor(object);
			addHorizontalSpacingPropertyDescriptor(object);
			addVerticalSpacingPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Num Columns feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumColumnsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridLayout_numColumns_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_numColumns_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__NUM_COLUMNS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Make Columns Equal Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMakeColumnsEqualWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridLayout_makeColumnsEqualWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_makeColumnsEqualWidth_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH,
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
				 getString("_UI_XGridLayout_marginLeft_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_marginLeft_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__MARGIN_LEFT,
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
				 getString("_UI_XGridLayout_marginTop_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_marginTop_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__MARGIN_TOP,
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
				 getString("_UI_XGridLayout_marginRight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_marginRight_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__MARGIN_RIGHT,
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
				 getString("_UI_XGridLayout_marginBottom_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_marginBottom_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__MARGIN_BOTTOM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridLayout_horizontalSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_horizontalSpacing_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__HORIZONTAL_SPACING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Spacing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalSpacingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridLayout_verticalSpacing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridLayout_verticalSpacing_feature", "_UI_XGridLayout_type"),
				 ModelPackage.Literals.XGRID_LAYOUT__VERTICAL_SPACING,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns XGridLayout.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XGridLayout"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XGridLayout)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XGridLayout_type") :
			getString("_UI_XGridLayout_type") + " " + label;
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

		switch (notification.getFeatureID(XGridLayout.class)) {
			case ModelPackage.XGRID_LAYOUT__NUM_COLUMNS:
			case ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
			case ModelPackage.XGRID_LAYOUT__MARGIN_LEFT:
			case ModelPackage.XGRID_LAYOUT__MARGIN_TOP:
			case ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT:
			case ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM:
			case ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING:
			case ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING:
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
