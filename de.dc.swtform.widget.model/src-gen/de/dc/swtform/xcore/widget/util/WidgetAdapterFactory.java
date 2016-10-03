/**
 */
package de.dc.swtform.xcore.widget.util;

import de.dc.swtform.layout.model.XLayoutDataElement;
import de.dc.swtform.layout.model.XLayoutElement;

import de.dc.swtform.xcore.widget.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.xcore.widget.WidgetPackage
 * @generated
 */
public class WidgetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WidgetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WidgetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WidgetSwitch<Adapter> modelSwitch =
		new WidgetSwitch<Adapter>() {
			@Override
			public Adapter caseXWidget(XWidget object) {
				return createXWidgetAdapter();
			}
			@Override
			public Adapter caseXButton(XButton object) {
				return createXButtonAdapter();
			}
			@Override
			public Adapter caseXCheckButton(XCheckButton object) {
				return createXCheckButtonAdapter();
			}
			@Override
			public Adapter caseXRadioButton(XRadioButton object) {
				return createXRadioButtonAdapter();
			}
			@Override
			public Adapter caseXToogleButton(XToogleButton object) {
				return createXToogleButtonAdapter();
			}
			@Override
			public Adapter caseXSpinner(XSpinner object) {
				return createXSpinnerAdapter();
			}
			@Override
			public Adapter caseXDateTime(XDateTime object) {
				return createXDateTimeAdapter();
			}
			@Override
			public Adapter caseXDialogText(XDialogText object) {
				return createXDialogTextAdapter();
			}
			@Override
			public Adapter caseXUnitLabel(XUnitLabel object) {
				return createXUnitLabelAdapter();
			}
			@Override
			public Adapter caseXToolBar(XToolBar object) {
				return createXToolBarAdapter();
			}
			@Override
			public Adapter caseXToolBarItem(XToolBarItem object) {
				return createXToolBarItemAdapter();
			}
			@Override
			public Adapter caseXCoolBar(XCoolBar object) {
				return createXCoolBarAdapter();
			}
			@Override
			public Adapter caseXCoolBarItem(XCoolBarItem object) {
				return createXCoolBarItemAdapter();
			}
			@Override
			public Adapter caseXBrowser(XBrowser object) {
				return createXBrowserAdapter();
			}
			@Override
			public Adapter caseXLink(XLink object) {
				return createXLinkAdapter();
			}
			@Override
			public Adapter caseXLabel(XLabel object) {
				return createXLabelAdapter();
			}
			@Override
			public Adapter caseXLabelCombo(XLabelCombo object) {
				return createXLabelComboAdapter();
			}
			@Override
			public Adapter caseXCombo(XCombo object) {
				return createXComboAdapter();
			}
			@Override
			public Adapter caseXComboItem(XComboItem object) {
				return createXComboItemAdapter();
			}
			@Override
			public Adapter caseXText(XText object) {
				return createXTextAdapter();
			}
			@Override
			public Adapter caseXComposite(XComposite object) {
				return createXCompositeAdapter();
			}
			@Override
			public Adapter caseXGroup(XGroup object) {
				return createXGroupAdapter();
			}
			@Override
			public Adapter caseXScrolledComposite(XScrolledComposite object) {
				return createXScrolledCompositeAdapter();
			}
			@Override
			public Adapter caseXTabFolder(XTabFolder object) {
				return createXTabFolderAdapter();
			}
			@Override
			public Adapter caseXTabItem(XTabItem object) {
				return createXTabItemAdapter();
			}
			@Override
			public Adapter caseXCTabFolder(XCTabFolder object) {
				return createXCTabFolderAdapter();
			}
			@Override
			public Adapter caseXCTabItem(XCTabItem object) {
				return createXCTabItemAdapter();
			}
			@Override
			public Adapter caseXViewer(XViewer object) {
				return createXViewerAdapter();
			}
			@Override
			public Adapter caseXLabelProvider(XLabelProvider object) {
				return createXLabelProviderAdapter();
			}
			@Override
			public Adapter caseXContentProvider(XContentProvider object) {
				return createXContentProviderAdapter();
			}
			@Override
			public Adapter caseXTableViewer(XTableViewer object) {
				return createXTableViewerAdapter();
			}
			@Override
			public Adapter caseXTableViewerColumn(XTableViewerColumn object) {
				return createXTableViewerColumnAdapter();
			}
			@Override
			public Adapter caseXTreeViewer(XTreeViewer object) {
				return createXTreeViewerAdapter();
			}
			@Override
			public Adapter caseXListViewer(XListViewer object) {
				return createXListViewerAdapter();
			}
			@Override
			public Adapter caseXComboViewer(XComboViewer object) {
				return createXComboViewerAdapter();
			}
			@Override
			public Adapter caseXLayoutDataElement(XLayoutDataElement object) {
				return createXLayoutDataElementAdapter();
			}
			@Override
			public Adapter caseXLayoutElement(XLayoutElement object) {
				return createXLayoutElementAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XWidget <em>XWidget</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XWidget
	 * @generated
	 */
	public Adapter createXWidgetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XButton <em>XButton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XButton
	 * @generated
	 */
	public Adapter createXButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCheckButton <em>XCheck Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCheckButton
	 * @generated
	 */
	public Adapter createXCheckButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XRadioButton <em>XRadio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XRadioButton
	 * @generated
	 */
	public Adapter createXRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XToogleButton <em>XToogle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XToogleButton
	 * @generated
	 */
	public Adapter createXToogleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XSpinner <em>XSpinner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XSpinner
	 * @generated
	 */
	public Adapter createXSpinnerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XDateTime <em>XDate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XDateTime
	 * @generated
	 */
	public Adapter createXDateTimeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XDialogText <em>XDialog Text</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XDialogText
	 * @generated
	 */
	public Adapter createXDialogTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XUnitLabel <em>XUnit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XUnitLabel
	 * @generated
	 */
	public Adapter createXUnitLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XToolBar <em>XTool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XToolBar
	 * @generated
	 */
	public Adapter createXToolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XToolBarItem <em>XTool Bar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XToolBarItem
	 * @generated
	 */
	public Adapter createXToolBarItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCoolBar <em>XCool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCoolBar
	 * @generated
	 */
	public Adapter createXCoolBarAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCoolBarItem <em>XCool Bar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCoolBarItem
	 * @generated
	 */
	public Adapter createXCoolBarItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XBrowser <em>XBrowser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XBrowser
	 * @generated
	 */
	public Adapter createXBrowserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XLink <em>XLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XLink
	 * @generated
	 */
	public Adapter createXLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XLabel <em>XLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XLabel
	 * @generated
	 */
	public Adapter createXLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XLabelCombo <em>XLabel Combo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XLabelCombo
	 * @generated
	 */
	public Adapter createXLabelComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCombo <em>XCombo</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCombo
	 * @generated
	 */
	public Adapter createXComboAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XComboItem <em>XCombo Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XComboItem
	 * @generated
	 */
	public Adapter createXComboItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XText <em>XText</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XText
	 * @generated
	 */
	public Adapter createXTextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XComposite <em>XComposite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XComposite
	 * @generated
	 */
	public Adapter createXCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XGroup <em>XGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XGroup
	 * @generated
	 */
	public Adapter createXGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XScrolledComposite <em>XScrolled Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XScrolledComposite
	 * @generated
	 */
	public Adapter createXScrolledCompositeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XTabFolder <em>XTab Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XTabFolder
	 * @generated
	 */
	public Adapter createXTabFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XTabItem <em>XTab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XTabItem
	 * @generated
	 */
	public Adapter createXTabItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCTabFolder <em>XC Tab Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCTabFolder
	 * @generated
	 */
	public Adapter createXCTabFolderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XCTabItem <em>XC Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XCTabItem
	 * @generated
	 */
	public Adapter createXCTabItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XViewer <em>XViewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XViewer
	 * @generated
	 */
	public Adapter createXViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XLabelProvider <em>XLabel Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XLabelProvider
	 * @generated
	 */
	public Adapter createXLabelProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XContentProvider <em>XContent Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XContentProvider
	 * @generated
	 */
	public Adapter createXContentProviderAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XTableViewer <em>XTable Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XTableViewer
	 * @generated
	 */
	public Adapter createXTableViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XTableViewerColumn <em>XTable Viewer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XTableViewerColumn
	 * @generated
	 */
	public Adapter createXTableViewerColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XTreeViewer <em>XTree Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XTreeViewer
	 * @generated
	 */
	public Adapter createXTreeViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XListViewer <em>XList Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XListViewer
	 * @generated
	 */
	public Adapter createXListViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.xcore.widget.XComboViewer <em>XCombo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.xcore.widget.XComboViewer
	 * @generated
	 */
	public Adapter createXComboViewerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayoutDataElement <em>XLayout Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayoutDataElement
	 * @generated
	 */
	public Adapter createXLayoutDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayoutElement <em>XLayout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayoutElement
	 * @generated
	 */
	public Adapter createXLayoutElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WidgetAdapterFactory
