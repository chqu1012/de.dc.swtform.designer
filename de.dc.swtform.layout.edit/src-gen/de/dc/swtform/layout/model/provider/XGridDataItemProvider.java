/**
 */
package de.dc.swtform.layout.model.provider;


import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XGridData;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.swtform.layout.model.XGridData} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XGridDataItemProvider extends XLayoutDataItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XGridDataItemProvider(AdapterFactory adapterFactory) {
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

			addVerticalAlignmentPropertyDescriptor(object);
			addHorizontalAlignmentPropertyDescriptor(object);
			addWidthHintPropertyDescriptor(object);
			addHeightHintPropertyDescriptor(object);
			addHorizontalIndentPropertyDescriptor(object);
			addVerticalIndentPropertyDescriptor(object);
			addHorizontalSpanPropertyDescriptor(object);
			addVerticalSpanPropertyDescriptor(object);
			addGrabExcessHorizontalSpacePropertyDescriptor(object);
			addGrabExcessVerticalSpacePropertyDescriptor(object);
			addMinimumWidthPropertyDescriptor(object);
			addMinimumHeightPropertyDescriptor(object);
			addExcludePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Vertical Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_verticalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_verticalAlignment_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__VERTICAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Alignment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalAlignmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_horizontalAlignment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_horizontalAlignment_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__HORIZONTAL_ALIGNMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Width Hint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWidthHintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_widthHint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_widthHint_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__WIDTH_HINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Height Hint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHeightHintPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_heightHint_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_heightHint_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__HEIGHT_HINT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Indent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalIndentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_horizontalIndent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_horizontalIndent_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__HORIZONTAL_INDENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Indent feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalIndentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_verticalIndent_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_verticalIndent_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__VERTICAL_INDENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Horizontal Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHorizontalSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_horizontalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_horizontalSpan_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__HORIZONTAL_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Vertical Span feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVerticalSpanPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_verticalSpan_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_verticalSpan_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__VERTICAL_SPAN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grab Excess Horizontal Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessHorizontalSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_grabExcessHorizontalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_grabExcessHorizontalSpace_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Grab Excess Vertical Space feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGrabExcessVerticalSpacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_grabExcessVerticalSpace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_grabExcessVerticalSpace_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Width feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumWidthPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_minimumWidth_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_minimumWidth_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__MINIMUM_WIDTH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Minimum Height feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinimumHeightPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_minimumHeight_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_minimumHeight_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__MINIMUM_HEIGHT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Exclude feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExcludePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_XGridData_exclude_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_XGridData_exclude_feature", "_UI_XGridData_type"),
				 ModelPackage.Literals.XGRID_DATA__EXCLUDE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns XGridData.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XGridData"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Integer labelValue = ((XGridData)object).getVerticalAlignment();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_XGridData_type") :
			getString("_UI_XGridData_type") + " " + label;
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

		switch (notification.getFeatureID(XGridData.class)) {
			case ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT:
			case ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT:
			case ModelPackage.XGRID_DATA__WIDTH_HINT:
			case ModelPackage.XGRID_DATA__HEIGHT_HINT:
			case ModelPackage.XGRID_DATA__HORIZONTAL_INDENT:
			case ModelPackage.XGRID_DATA__VERTICAL_INDENT:
			case ModelPackage.XGRID_DATA__HORIZONTAL_SPAN:
			case ModelPackage.XGRID_DATA__VERTICAL_SPAN:
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
			case ModelPackage.XGRID_DATA__MINIMUM_WIDTH:
			case ModelPackage.XGRID_DATA__MINIMUM_HEIGHT:
			case ModelPackage.XGRID_DATA__EXCLUDE:
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
