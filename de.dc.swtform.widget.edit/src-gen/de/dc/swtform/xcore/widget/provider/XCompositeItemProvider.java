/**
 */
package de.dc.swtform.xcore.widget.provider;


import de.dc.swtform.layout.model.ModelFactory;
import de.dc.swtform.layout.model.ModelPackage;

import de.dc.swtform.xcore.widget.WidgetFactory;
import de.dc.swtform.xcore.widget.WidgetPackage;
import de.dc.swtform.xcore.widget.XComposite;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.swtform.xcore.widget.XComposite} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class XCompositeItemProvider extends XWidgetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCompositeItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(ModelPackage.Literals.XLAYOUT_ELEMENT__LAYOUT);
			childrenFeatures.add(WidgetPackage.eINSTANCE.getXComposite_Widgets());
			childrenFeatures.add(WidgetPackage.eINSTANCE.getXComposite_Viewers());
			childrenFeatures.add(WidgetPackage.eINSTANCE.getXComposite_Composites());
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
	 * This returns XComposite.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/XComposite"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((XComposite)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_XComposite_type") :
			getString("_UI_XComposite_type") + " " + label;
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

		switch (notification.getFeatureID(XComposite.class)) {
			case WidgetPackage.XCOMPOSITE__LAYOUT:
			case WidgetPackage.XCOMPOSITE__WIDGETS:
			case WidgetPackage.XCOMPOSITE__VIEWERS:
			case WidgetPackage.XCOMPOSITE__COMPOSITES:
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
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXButton()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCheckButton()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXRadioButton()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXToogleButton()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXSpinner()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXDateTime()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXDialogText()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXUnitLabel()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXToolBar()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXToolBarItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCoolBar()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCoolBarItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXBrowser()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXLink()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXLabelCombo()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXLabelText()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCombo()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXComboItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXText()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXComposite()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXScrolledComposite()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXTabFolder()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCTabFolder()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXCTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXTableViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXTableViewerColumn()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXTreeViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXListViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Widgets(),
				 WidgetFactory.eINSTANCE.createXComboViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Viewers(),
				 WidgetFactory.eINSTANCE.createXTableViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Viewers(),
				 WidgetFactory.eINSTANCE.createXTreeViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Viewers(),
				 WidgetFactory.eINSTANCE.createXListViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Viewers(),
				 WidgetFactory.eINSTANCE.createXComboViewer()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Composites(),
				 WidgetFactory.eINSTANCE.createXComposite()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Composites(),
				 WidgetFactory.eINSTANCE.createXGroup()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Composites(),
				 WidgetFactory.eINSTANCE.createXScrolledComposite()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Composites(),
				 WidgetFactory.eINSTANCE.createXTabItem()));

		newChildDescriptors.add
			(createChildParameter
				(WidgetPackage.eINSTANCE.getXComposite_Composites(),
				 WidgetFactory.eINSTANCE.createXCTabItem()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == WidgetPackage.eINSTANCE.getXComposite_Widgets() ||
			childFeature == WidgetPackage.eINSTANCE.getXComposite_Composites() ||
			childFeature == WidgetPackage.eINSTANCE.getXComposite_Viewers();

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
