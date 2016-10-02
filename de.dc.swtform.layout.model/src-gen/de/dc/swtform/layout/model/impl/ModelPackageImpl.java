/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelFactory;
import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XFillData;
import de.dc.swtform.layout.model.XFillLayout;
import de.dc.swtform.layout.model.XGridData;
import de.dc.swtform.layout.model.XGridLayout;
import de.dc.swtform.layout.model.XLayout;
import de.dc.swtform.layout.model.XLayoutData;
import de.dc.swtform.layout.model.XLayoutDataElement;
import de.dc.swtform.layout.model.XLayoutElement;
import de.dc.swtform.layout.model.XRowData;
import de.dc.swtform.layout.model.XRowLayout;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ModelPackageImpl extends EPackageImpl implements ModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLayoutElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLayoutDataElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLayoutDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xGridDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xFillDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRowDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xGridLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xFillLayoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass xRowLayoutEClass = null;

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
	 * @see de.dc.swtform.layout.model.ModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ModelPackageImpl() {
		super(eNS_URI, ModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ModelPackage init() {
		if (isInited) return (ModelPackage)EPackage.Registry.INSTANCE.getEPackage(ModelPackage.eNS_URI);

		// Obtain or create and register package
		ModelPackageImpl theModelPackage = (ModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ModelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theModelPackage.createPackageContents();

		// Initialize created meta-data
		theModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ModelPackage.eNS_URI, theModelPackage);
		return theModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLayoutElement() {
		return xLayoutElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXLayoutElement_Layout() {
		return (EReference)xLayoutElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLayoutDataElement() {
		return xLayoutDataElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getXLayoutDataElement_LayoutData() {
		return (EReference)xLayoutDataElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLayoutData() {
		return xLayoutDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXLayout() {
		return xLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLayout_Name() {
		return (EAttribute)xLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLayout_MarginWidth() {
		return (EAttribute)xLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXLayout_MarginHeight() {
		return (EAttribute)xLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXGridData() {
		return xGridDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_VerticalAlignment() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_HorizontalAlignment() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_WidthHint() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_HeightHint() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_HorizontalIndent() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_VerticalIndent() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_HorizontalSpan() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_VerticalSpan() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_GrabExcessHorizontalSpace() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_GrabExcessVerticalSpace() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_MinimumWidth() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_MinimumHeight() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridData_Exclude() {
		return (EAttribute)xGridDataEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXFillData() {
		return xFillDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_DefaultWidth() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_DefaultHeight() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_CurrentWhint() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_CurrentHhint() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_CurrentWidth() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillData_CurrentHeight() {
		return (EAttribute)xFillDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRowData() {
		return xRowDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowData_Width() {
		return (EAttribute)xRowDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowData_Height() {
		return (EAttribute)xRowDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowData_Exclude() {
		return (EAttribute)xRowDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXGridLayout() {
		return xGridLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_NumColumns() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_MakeColumnsEqualWidth() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_MarginLeft() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_MarginTop() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_MarginRight() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_MarginBottom() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_HorizontalSpacing() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXGridLayout_VerticalSpacing() {
		return (EAttribute)xGridLayoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXFillLayout() {
		return xFillLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillLayout_Typ() {
		return (EAttribute)xFillLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXFillLayout_Spacing() {
		return (EAttribute)xFillLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getXRowLayout() {
		return xRowLayoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Typ() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Spacing() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Wrap() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Pack() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Fill() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Center() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_Justify() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_MarginLeft() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_MarginTop() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_MarginRight() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getXRowLayout_MarginBottom() {
		return (EAttribute)xRowLayoutEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelFactory getModelFactory() {
		return (ModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		xLayoutElementEClass = createEClass(XLAYOUT_ELEMENT);
		createEReference(xLayoutElementEClass, XLAYOUT_ELEMENT__LAYOUT);

		xLayoutDataElementEClass = createEClass(XLAYOUT_DATA_ELEMENT);
		createEReference(xLayoutDataElementEClass, XLAYOUT_DATA_ELEMENT__LAYOUT_DATA);

		xLayoutDataEClass = createEClass(XLAYOUT_DATA);

		xLayoutEClass = createEClass(XLAYOUT);
		createEAttribute(xLayoutEClass, XLAYOUT__NAME);
		createEAttribute(xLayoutEClass, XLAYOUT__MARGIN_WIDTH);
		createEAttribute(xLayoutEClass, XLAYOUT__MARGIN_HEIGHT);

		xGridDataEClass = createEClass(XGRID_DATA);
		createEAttribute(xGridDataEClass, XGRID_DATA__VERTICAL_ALIGNMENT);
		createEAttribute(xGridDataEClass, XGRID_DATA__HORIZONTAL_ALIGNMENT);
		createEAttribute(xGridDataEClass, XGRID_DATA__WIDTH_HINT);
		createEAttribute(xGridDataEClass, XGRID_DATA__HEIGHT_HINT);
		createEAttribute(xGridDataEClass, XGRID_DATA__HORIZONTAL_INDENT);
		createEAttribute(xGridDataEClass, XGRID_DATA__VERTICAL_INDENT);
		createEAttribute(xGridDataEClass, XGRID_DATA__HORIZONTAL_SPAN);
		createEAttribute(xGridDataEClass, XGRID_DATA__VERTICAL_SPAN);
		createEAttribute(xGridDataEClass, XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE);
		createEAttribute(xGridDataEClass, XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE);
		createEAttribute(xGridDataEClass, XGRID_DATA__MINIMUM_WIDTH);
		createEAttribute(xGridDataEClass, XGRID_DATA__MINIMUM_HEIGHT);
		createEAttribute(xGridDataEClass, XGRID_DATA__EXCLUDE);

		xFillDataEClass = createEClass(XFILL_DATA);
		createEAttribute(xFillDataEClass, XFILL_DATA__DEFAULT_WIDTH);
		createEAttribute(xFillDataEClass, XFILL_DATA__DEFAULT_HEIGHT);
		createEAttribute(xFillDataEClass, XFILL_DATA__CURRENT_WHINT);
		createEAttribute(xFillDataEClass, XFILL_DATA__CURRENT_HHINT);
		createEAttribute(xFillDataEClass, XFILL_DATA__CURRENT_WIDTH);
		createEAttribute(xFillDataEClass, XFILL_DATA__CURRENT_HEIGHT);

		xRowDataEClass = createEClass(XROW_DATA);
		createEAttribute(xRowDataEClass, XROW_DATA__WIDTH);
		createEAttribute(xRowDataEClass, XROW_DATA__HEIGHT);
		createEAttribute(xRowDataEClass, XROW_DATA__EXCLUDE);

		xGridLayoutEClass = createEClass(XGRID_LAYOUT);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__NUM_COLUMNS);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__MARGIN_LEFT);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__MARGIN_TOP);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__MARGIN_RIGHT);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__MARGIN_BOTTOM);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__HORIZONTAL_SPACING);
		createEAttribute(xGridLayoutEClass, XGRID_LAYOUT__VERTICAL_SPACING);

		xFillLayoutEClass = createEClass(XFILL_LAYOUT);
		createEAttribute(xFillLayoutEClass, XFILL_LAYOUT__TYP);
		createEAttribute(xFillLayoutEClass, XFILL_LAYOUT__SPACING);

		xRowLayoutEClass = createEClass(XROW_LAYOUT);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__TYP);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__SPACING);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__WRAP);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__PACK);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__FILL);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__CENTER);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__JUSTIFY);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__MARGIN_LEFT);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__MARGIN_TOP);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__MARGIN_RIGHT);
		createEAttribute(xRowLayoutEClass, XROW_LAYOUT__MARGIN_BOTTOM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		xLayoutElementEClass.getESuperTypes().add(this.getXLayoutDataElement());
		xGridDataEClass.getESuperTypes().add(this.getXLayoutData());
		xFillDataEClass.getESuperTypes().add(this.getXLayoutData());
		xRowDataEClass.getESuperTypes().add(this.getXLayoutData());
		xGridLayoutEClass.getESuperTypes().add(this.getXLayout());
		xFillLayoutEClass.getESuperTypes().add(this.getXLayout());
		xRowLayoutEClass.getESuperTypes().add(this.getXLayout());

		// Initialize classes, features, and operations; add parameters
		initEClass(xLayoutElementEClass, XLayoutElement.class, "XLayoutElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXLayoutElement_Layout(), this.getXLayout(), null, "Layout", null, 0, 1, XLayoutElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xLayoutDataElementEClass, XLayoutDataElement.class, "XLayoutDataElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getXLayoutDataElement_LayoutData(), this.getXLayoutData(), null, "layoutData", null, 0, 1, XLayoutDataElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xLayoutDataEClass, XLayoutData.class, "XLayoutData", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(xLayoutEClass, XLayout.class, "XLayout", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXLayout_Name(), theEcorePackage.getEString(), "name", null, 0, 1, XLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLayout_MarginWidth(), theEcorePackage.getEIntegerObject(), "marginWidth", null, 0, 1, XLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXLayout_MarginHeight(), theEcorePackage.getEIntegerObject(), "marginHeight", null, 0, 1, XLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xGridDataEClass, XGridData.class, "XGridData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXGridData_VerticalAlignment(), theEcorePackage.getEIntegerObject(), "verticalAlignment", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_HorizontalAlignment(), theEcorePackage.getEIntegerObject(), "horizontalAlignment", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_WidthHint(), theEcorePackage.getEIntegerObject(), "widthHint", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_HeightHint(), theEcorePackage.getEIntegerObject(), "heightHint", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_HorizontalIndent(), theEcorePackage.getEIntegerObject(), "horizontalIndent", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_VerticalIndent(), theEcorePackage.getEIntegerObject(), "verticalIndent", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_HorizontalSpan(), theEcorePackage.getEIntegerObject(), "horizontalSpan", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_VerticalSpan(), theEcorePackage.getEIntegerObject(), "verticalSpan", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_GrabExcessHorizontalSpace(), theEcorePackage.getEBooleanObject(), "grabExcessHorizontalSpace", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_GrabExcessVerticalSpace(), theEcorePackage.getEBooleanObject(), "grabExcessVerticalSpace", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_MinimumWidth(), theEcorePackage.getEIntegerObject(), "minimumWidth", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_MinimumHeight(), theEcorePackage.getEIntegerObject(), "minimumHeight", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridData_Exclude(), theEcorePackage.getEBooleanObject(), "exclude", null, 0, 1, XGridData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xFillDataEClass, XFillData.class, "XFillData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXFillData_DefaultWidth(), theEcorePackage.getEIntegerObject(), "defaultWidth", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillData_DefaultHeight(), theEcorePackage.getEIntegerObject(), "defaultHeight", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillData_CurrentWhint(), theEcorePackage.getEIntegerObject(), "currentWhint", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillData_CurrentHhint(), theEcorePackage.getEIntegerObject(), "currentHhint", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillData_CurrentWidth(), theEcorePackage.getEIntegerObject(), "currentWidth", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillData_CurrentHeight(), theEcorePackage.getEIntegerObject(), "currentHeight", null, 0, 1, XFillData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xRowDataEClass, XRowData.class, "XRowData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXRowData_Width(), theEcorePackage.getEIntegerObject(), "width", null, 0, 1, XRowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowData_Height(), theEcorePackage.getEIntegerObject(), "height", null, 0, 1, XRowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowData_Exclude(), theEcorePackage.getEBooleanObject(), "exclude", null, 0, 1, XRowData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xGridLayoutEClass, XGridLayout.class, "XGridLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXGridLayout_NumColumns(), theEcorePackage.getEIntegerObject(), "numColumns", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_MakeColumnsEqualWidth(), theEcorePackage.getEBooleanObject(), "makeColumnsEqualWidth", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_MarginLeft(), theEcorePackage.getEIntegerObject(), "marginLeft", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_MarginTop(), theEcorePackage.getEIntegerObject(), "marginTop", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_MarginRight(), theEcorePackage.getEIntegerObject(), "marginRight", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_MarginBottom(), theEcorePackage.getEIntegerObject(), "marginBottom", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_HorizontalSpacing(), theEcorePackage.getEIntegerObject(), "horizontalSpacing", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXGridLayout_VerticalSpacing(), theEcorePackage.getEIntegerObject(), "verticalSpacing", null, 0, 1, XGridLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xFillLayoutEClass, XFillLayout.class, "XFillLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXFillLayout_Typ(), theEcorePackage.getEIntegerObject(), "typ", null, 0, 1, XFillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXFillLayout_Spacing(), theEcorePackage.getEIntegerObject(), "spacing", null, 0, 1, XFillLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(xRowLayoutEClass, XRowLayout.class, "XRowLayout", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getXRowLayout_Typ(), theEcorePackage.getEIntegerObject(), "typ", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Spacing(), theEcorePackage.getEIntegerObject(), "spacing", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Wrap(), theEcorePackage.getEBooleanObject(), "wrap", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Pack(), theEcorePackage.getEBooleanObject(), "pack", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Fill(), theEcorePackage.getEBooleanObject(), "fill", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Center(), theEcorePackage.getEBooleanObject(), "center", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_Justify(), theEcorePackage.getEBooleanObject(), "justify", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_MarginLeft(), theEcorePackage.getEIntegerObject(), "marginLeft", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_MarginTop(), theEcorePackage.getEIntegerObject(), "marginTop", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_MarginRight(), theEcorePackage.getEIntegerObject(), "marginRight", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getXRowLayout_MarginBottom(), theEcorePackage.getEIntegerObject(), "marginBottom", null, 0, 1, XRowLayout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ModelPackageImpl
