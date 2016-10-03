/**
 */
package de.dc.swtform.xcore.model.provider;


import de.dc.swtform.layout.model.ModelFactory;

import de.dc.swtform.xcore.model.ModelPackage;
import de.dc.swtform.xcore.model.SwtForm;

import de.dc.swtform.xcore.widget.WidgetFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.swtform.xcore.model.SwtForm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SwtFormItemProvider extends XNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwtFormItemProvider(AdapterFactory adapterFactory) {
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

			addPackagePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Package Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SwtForm_packagePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SwtForm_packagePath_feature", "_UI_SwtForm_type"),
				 ModelPackage.Literals.SWT_FORM__PACKAGE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(ModelPackage.Literals.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA);
			childrenFeatures.add(ModelPackage.Literals.XLAYOUT_ELEMENT__LAYOUT);
			childrenFeatures.add(ModelPackage.Literals.SWT_FORM__WIDGETS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns SwtForm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/SwtForm"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((SwtForm)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_SwtForm_type") :
			getString("_UI_SwtForm_type") + " " + label;
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

		switch (notification.getFeatureID(SwtForm.class)) {
			case ModelPackage.SWT_FORM__PACKAGE_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case ModelPackage.SWT_FORM__LAYOUT_DATA:
			case ModelPackage.SWT_FORM__LAYOUT:
			case ModelPackage.SWT_FORM__WIDGETS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA,
				 ModelFactory.eINSTANCE.createXGridData()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA,
				 ModelFactory.eINSTANCE.createXFillData()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA,
				 ModelFactory.eINSTANCE.createXRowData()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_ELEMENT__LAYOUT,
				 ModelFactory.eINSTANCE.createXGridLayout()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_ELEMENT__LAYOUT,
				 ModelFactory.eINSTANCE.createXFillLayout()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.XLAYOUT_ELEMENT__LAYOUT,
				 ModelFactory.eINSTANCE.createXRowLayout()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXButton()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCheckButton()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXToogleButton()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXSpinner()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXDialogText()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXLabel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXUnitLabel()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXToolBar()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXToolBarItem()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCoolBar()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCoolBarItem()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXLink()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXLabelCombo()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXLabelText()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCombo()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXComboItem()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXText()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXComposite()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXGroup()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXScrolledComposite()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXTabFolder()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCTabFolder()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXCTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXTableViewer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXTableViewerColumn()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXTreeViewer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXListViewer()));

		newChildDescriptors.add
			(createChildParameter
				(ModelPackage.Literals.SWT_FORM__WIDGETS,
				 WidgetFactory.eINSTANCE.createXComboViewer()));
	}

}
