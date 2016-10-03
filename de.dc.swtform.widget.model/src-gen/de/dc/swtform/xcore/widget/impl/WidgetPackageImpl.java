/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.layout.model.ModelPackage;

import de.dc.swtform.xcore.widget.WidgetFactory;
import de.dc.swtform.xcore.widget.WidgetPackage;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetPackageImpl extends EPackageImpl implements WidgetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "widget.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xWidgetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCheckButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRadioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xToogleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xSpinnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDateTimeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xDialogTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xUnitLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xToolBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xToolBarItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCoolBarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCoolBarItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xBrowserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLabelComboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLabelTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xComboEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xComboItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xScrolledCompositeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTabFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTabItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xcTabFolderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xcTabItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLabelProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xContentProviderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTableViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTableViewerColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xTreeViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xListViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xComboViewerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xDateTimeTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum xDialogTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum styleEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WidgetPackageImpl() {
		super(eNS_URI, WidgetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WidgetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static WidgetPackage init() {
		if (isInited) return (WidgetPackage)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI);

		// Obtain or create and register package
		WidgetPackageImpl theWidgetPackage = (WidgetPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WidgetPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WidgetPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ModelPackage.eINSTANCE.eClass();

		// Load packages
		theWidgetPackage.loadPackage();

		// Fix loaded packages
		theWidgetPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theWidgetPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WidgetPackage.eNS_URI, theWidgetPackage);
		return theWidgetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXWidget() {
		if (xWidgetEClass == null) {
			xWidgetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(0);
		}
		return xWidgetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXWidget_Name() {
        return (EAttribute)getXWidget().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXWidget_Text() {
        return (EAttribute)getXWidget().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXWidget_Data() {
        return (EAttribute)getXWidget().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXWidget_Message() {
        return (EAttribute)getXWidget().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXButton() {
		if (xButtonEClass == null) {
			xButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(1);
		}
		return xButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXButton_IsSelected() {
        return (EAttribute)getXButton().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCheckButton() {
		if (xCheckButtonEClass == null) {
			xCheckButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(2);
		}
		return xCheckButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRadioButton() {
		if (xRadioButtonEClass == null) {
			xRadioButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(3);
		}
		return xRadioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXToogleButton() {
		if (xToogleButtonEClass == null) {
			xToogleButtonEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(4);
		}
		return xToogleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXSpinner() {
		if (xSpinnerEClass == null) {
			xSpinnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(5);
		}
		return xSpinnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXSpinner_PageIncrement() {
        return (EAttribute)getXSpinner().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXSpinner_Digits() {
        return (EAttribute)getXSpinner().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDateTime() {
		if (xDateTimeEClass == null) {
			xDateTimeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(6);
		}
		return xDateTimeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDateTime_DateTimeType() {
        return (EAttribute)getXDateTime().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXDialogText() {
		if (xDialogTextEClass == null) {
			xDialogTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(8);
		}
		return xDialogTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDialogText_Path() {
        return (EAttribute)getXDialogText().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDialogText_LabelWidth() {
        return (EAttribute)getXDialogText().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXDialogText_DialogType() {
        return (EAttribute)getXDialogText().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXUnitLabel() {
		if (xUnitLabelEClass == null) {
			xUnitLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(9);
		}
		return xUnitLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXUnitLabel_Value() {
        return (EAttribute)getXUnitLabel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXUnitLabel_Unit() {
        return (EAttribute)getXUnitLabel().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXToolBar() {
		if (xToolBarEClass == null) {
			xToolBarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(11);
		}
		return xToolBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXToolBarItem() {
		if (xToolBarItemEClass == null) {
			xToolBarItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(12);
		}
		return xToolBarItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCoolBar() {
		if (xCoolBarEClass == null) {
			xCoolBarEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(13);
		}
		return xCoolBarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCoolBarItem() {
		if (xCoolBarItemEClass == null) {
			xCoolBarItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(14);
		}
		return xCoolBarItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXBrowser() {
		if (xBrowserEClass == null) {
			xBrowserEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(15);
		}
		return xBrowserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLink() {
		if (xLinkEClass == null) {
			xLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(16);
		}
		return xLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLink_Url() {
        return (EAttribute)getXLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLabel() {
		if (xLabelEClass == null) {
			xLabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(17);
		}
		return xLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLabel_Width() {
        return (EAttribute)getXLabel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLabelCombo() {
		if (xLabelComboEClass == null) {
			xLabelComboEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(18);
		}
		return xLabelComboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLabelCombo_ReadOnly() {
        return (EAttribute)getXLabelCombo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXLabelCombo_Items() {
        return (EReference)getXLabelCombo().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLabelText() {
		if (xLabelTextEClass == null) {
			xLabelTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(19);
		}
		return xLabelTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCombo() {
		if (xComboEClass == null) {
			xComboEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(20);
		}
		return xComboEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCombo_Items() {
        return (EReference)getXCombo().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXComboItem() {
		if (xComboItemEClass == null) {
			xComboItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(21);
		}
		return xComboItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXText() {
		if (xTextEClass == null) {
			xTextEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(22);
		}
		return xTextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXComposite() {
		if (xCompositeEClass == null) {
			xCompositeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(23);
		}
		return xCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXComposite_Widgets() {
        return (EReference)getXComposite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXComposite_Viewers() {
        return (EReference)getXComposite().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXComposite_Composites() {
        return (EReference)getXComposite().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXGroup() {
		if (xGroupEClass == null) {
			xGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(24);
		}
		return xGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXScrolledComposite() {
		if (xScrolledCompositeEClass == null) {
			xScrolledCompositeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(25);
		}
		return xScrolledCompositeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTabFolder() {
		if (xTabFolderEClass == null) {
			xTabFolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(26);
		}
		return xTabFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXTabFolder_Items() {
        return (EReference)getXTabFolder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTabItem() {
		if (xTabItemEClass == null) {
			xTabItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(27);
		}
		return xTabItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCTabFolder() {
		if (xcTabFolderEClass == null) {
			xcTabFolderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(28);
		}
		return xcTabFolderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXCTabFolder_Items() {
        return (EReference)getXCTabFolder().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXCTabItem() {
		if (xcTabItemEClass == null) {
			xcTabItemEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(29);
		}
		return xcTabItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXViewer() {
		if (xViewerEClass == null) {
			xViewerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(30);
		}
		return xViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXViewer_LabelProvider() {
        return (EReference)getXViewer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXViewer_ContentProvider() {
        return (EReference)getXViewer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLabelProvider() {
		if (xLabelProviderEClass == null) {
			xLabelProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(31);
		}
		return xLabelProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXContentProvider() {
		if (xContentProviderEClass == null) {
			xContentProviderEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(32);
		}
		return xContentProviderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTableViewer() {
		if (xTableViewerEClass == null) {
			xTableViewerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(33);
		}
		return xTableViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_ShowHeader() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_ShowLines() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_ShowBorder() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_VerticalScroll() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_HorizontalScroll() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewer_HasSearch() {
        return (EAttribute)getXTableViewer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXTableViewer_Columns() {
        return (EReference)getXTableViewer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTableViewerColumn() {
		if (xTableViewerColumnEClass == null) {
			xTableViewerColumnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(34);
		}
		return xTableViewerColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewerColumn_Size() {
        return (EAttribute)getXTableViewerColumn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXTableViewerColumn_Alignment() {
        return (EAttribute)getXTableViewerColumn().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXTreeViewer() {
		if (xTreeViewerEClass == null) {
			xTreeViewerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(35);
		}
		return xTreeViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXListViewer() {
		if (xListViewerEClass == null) {
			xListViewerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(36);
		}
		return xListViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXComboViewer() {
		if (xComboViewerEClass == null) {
			xComboViewerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(37);
		}
		return xComboViewerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXDateTimeType() {
		if (xDateTimeTypeEEnum == null) {
			xDateTimeTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(7);
		}
		return xDateTimeTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getXDialogType() {
		if (xDialogTypeEEnum == null) {
			xDialogTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(10);
		}
		return xDialogTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStyle() {
		if (styleEEnum == null) {
			styleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(WidgetPackage.eNS_URI).getEClassifiers().get(38);
		}
		return styleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFactory getWidgetFactory() {
		return (WidgetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("de.dc.swtform.xcore.widget." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //WidgetPackageImpl
