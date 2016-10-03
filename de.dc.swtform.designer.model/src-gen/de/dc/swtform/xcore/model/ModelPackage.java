/**
 */
package de.dc.swtform.xcore.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.swtform.xcore.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel runtimePlatform='RCP' modelDirectory='/de.dc.swtform.designer.model/src-gen' editDirectory='/de.dc.swtform.designer.edit/src-gen' editorDirectory='/de.dc.swtform.designer.editor/src-gen' fileExtensions='swtform' multipleEditorPages='false' creationSubmenus='true' decoration='Live' basePackage='de.dc.swtform.xcore'"
 * @generated
 */
public interface ModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.dc.swtform.xcore.model";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "model";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelPackage eINSTANCE = de.dc.swtform.xcore.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.model.impl.XNamedElementImpl <em>XNamed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.model.impl.XNamedElementImpl
	 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXNamedElement()
	 * @generated
	 */
	int XNAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>XNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XNamed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XNAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.model.impl.SwtFormImpl <em>Swt Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.model.impl.SwtFormImpl
	 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getSwtForm()
	 * @generated
	 */
	int SWT_FORM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM__NAME = XNAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM__LAYOUT_DATA = XNAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM__LAYOUT = XNAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM__PACKAGE_PATH = XNAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM__WIDGETS = XNAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Swt Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM_FEATURE_COUNT = XNAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Swt Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SWT_FORM_OPERATION_COUNT = XNAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.model.impl.XLayoutDataElementImpl <em>XLayout Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.model.impl.XLayoutDataElementImpl
	 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXLayoutDataElement()
	 * @generated
	 */
	int XLAYOUT_DATA_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_DATA_ELEMENT__LAYOUT_DATA = 0;

	/**
	 * The number of structural features of the '<em>XLayout Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_DATA_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>XLayout Data Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_DATA_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.model.impl.XLayoutElementImpl <em>XLayout Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.model.impl.XLayoutElementImpl
	 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXLayoutElement()
	 * @generated
	 */
	int XLAYOUT_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_ELEMENT__LAYOUT_DATA = XLAYOUT_DATA_ELEMENT__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_ELEMENT__LAYOUT = XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XLayout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_ELEMENT_FEATURE_COUNT = XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XLayout Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_ELEMENT_OPERATION_COUNT = XLAYOUT_DATA_ELEMENT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.model.SwtForm <em>Swt Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Swt Form</em>'.
	 * @see de.dc.swtform.xcore.model.SwtForm
	 * @generated
	 */
	EClass getSwtForm();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.model.SwtForm#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.swtform.xcore.model.SwtForm#getPackagePath()
	 * @see #getSwtForm()
	 * @generated
	 */
	EAttribute getSwtForm_PackagePath();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.model.SwtForm#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see de.dc.swtform.xcore.model.SwtForm#getWidgets()
	 * @see #getSwtForm()
	 * @generated
	 */
	EReference getSwtForm_Widgets();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.model.XLayoutElement <em>XLayout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout Element</em>'.
	 * @see de.dc.swtform.xcore.model.XLayoutElement
	 * @generated
	 */
	EClass getXLayoutElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.xcore.model.XLayoutElement#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see de.dc.swtform.xcore.model.XLayoutElement#getLayout()
	 * @see #getXLayoutElement()
	 * @generated
	 */
	EReference getXLayoutElement_Layout();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.model.XLayoutDataElement <em>XLayout Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout Data Element</em>'.
	 * @see de.dc.swtform.xcore.model.XLayoutDataElement
	 * @generated
	 */
	EClass getXLayoutDataElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.xcore.model.XLayoutDataElement#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see de.dc.swtform.xcore.model.XLayoutDataElement#getLayoutData()
	 * @see #getXLayoutDataElement()
	 * @generated
	 */
	EReference getXLayoutDataElement_LayoutData();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.model.XNamedElement <em>XNamed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XNamed Element</em>'.
	 * @see de.dc.swtform.xcore.model.XNamedElement
	 * @generated
	 */
	EClass getXNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.model.XNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.swtform.xcore.model.XNamedElement#getName()
	 * @see #getXNamedElement()
	 * @generated
	 */
	EAttribute getXNamedElement_Name();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ModelFactory getModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.swtform.xcore.model.impl.SwtFormImpl <em>Swt Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.xcore.model.impl.SwtFormImpl
		 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getSwtForm()
		 * @generated
		 */
		EClass SWT_FORM = eINSTANCE.getSwtForm();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SWT_FORM__PACKAGE_PATH = eINSTANCE.getSwtForm_PackagePath();

		/**
		 * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SWT_FORM__WIDGETS = eINSTANCE.getSwtForm_Widgets();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.xcore.model.impl.XLayoutElementImpl <em>XLayout Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.xcore.model.impl.XLayoutElementImpl
		 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXLayoutElement()
		 * @generated
		 */
		EClass XLAYOUT_ELEMENT = eINSTANCE.getXLayoutElement();

		/**
		 * The meta object literal for the '<em><b>Layout</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLAYOUT_ELEMENT__LAYOUT = eINSTANCE.getXLayoutElement_Layout();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.xcore.model.impl.XLayoutDataElementImpl <em>XLayout Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.xcore.model.impl.XLayoutDataElementImpl
		 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXLayoutDataElement()
		 * @generated
		 */
		EClass XLAYOUT_DATA_ELEMENT = eINSTANCE.getXLayoutDataElement();

		/**
		 * The meta object literal for the '<em><b>Layout Data</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XLAYOUT_DATA_ELEMENT__LAYOUT_DATA = eINSTANCE.getXLayoutDataElement_LayoutData();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.xcore.model.impl.XNamedElementImpl <em>XNamed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.xcore.model.impl.XNamedElementImpl
		 * @see de.dc.swtform.xcore.model.impl.ModelPackageImpl#getXNamedElement()
		 * @generated
		 */
		EClass XNAMED_ELEMENT = eINSTANCE.getXNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XNAMED_ELEMENT__NAME = eINSTANCE.getXNamedElement_Name();

	}

} //ModelPackage
