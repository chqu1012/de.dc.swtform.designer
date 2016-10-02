/**
 */
package de.dc.swtform.layout.model;

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
 * @see de.dc.swtform.layout.model.ModelFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel runtimePlatform='RCP' modelDirectory='/de.dc.swtform.layout.model/src-gen' editDirectory='/de.dc.swtform.layout.edit/src-gen' editPluginID='de.dc.swtform.layout.edit' basePackage='de.dc.swtform.layout'"
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
	String eNS_URI = "de.dc.swtform.layout.model";

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
	ModelPackage eINSTANCE = de.dc.swtform.layout.model.impl.ModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XLayoutDataElementImpl <em>XLayout Data Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XLayoutDataElementImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutDataElement()
	 * @generated
	 */
	int XLAYOUT_DATA_ELEMENT = 1;

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
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XLayoutElementImpl <em>XLayout Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XLayoutElementImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutElement()
	 * @generated
	 */
	int XLAYOUT_ELEMENT = 0;

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
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XLayoutDataImpl <em>XLayout Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XLayoutDataImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutData()
	 * @generated
	 */
	int XLAYOUT_DATA = 2;

	/**
	 * The number of structural features of the '<em>XLayout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_DATA_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>XLayout Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XLayoutImpl <em>XLayout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XLayoutImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayout()
	 * @generated
	 */
	int XLAYOUT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT__MARGIN_WIDTH = 1;

	/**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT__MARGIN_HEIGHT = 2;

	/**
	 * The number of structural features of the '<em>XLayout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>XLayout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLAYOUT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XGridDataImpl <em>XGrid Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XGridDataImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXGridData()
	 * @generated
	 */
	int XGRID_DATA = 4;

	/**
	 * The feature id for the '<em><b>Vertical Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__VERTICAL_ALIGNMENT = XLAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Horizontal Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__HORIZONTAL_ALIGNMENT = XLAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Width Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__WIDTH_HINT = XLAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Height Hint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__HEIGHT_HINT = XLAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__HORIZONTAL_INDENT = XLAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Indent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__VERTICAL_INDENT = XLAYOUT_DATA_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__HORIZONTAL_SPAN = XLAYOUT_DATA_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vertical Span</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__VERTICAL_SPAN = XLAYOUT_DATA_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = XLAYOUT_DATA_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Grab Excess Vertical Space</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = XLAYOUT_DATA_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Minimum Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__MINIMUM_WIDTH = XLAYOUT_DATA_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Minimum Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__MINIMUM_HEIGHT = XLAYOUT_DATA_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA__EXCLUDE = XLAYOUT_DATA_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>XGrid Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA_FEATURE_COUNT = XLAYOUT_DATA_FEATURE_COUNT + 13;

	/**
	 * The number of operations of the '<em>XGrid Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_DATA_OPERATION_COUNT = XLAYOUT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XFillDataImpl <em>XFill Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XFillDataImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXFillData()
	 * @generated
	 */
	int XFILL_DATA = 5;

	/**
	 * The feature id for the '<em><b>Default Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__DEFAULT_WIDTH = XLAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Default Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__DEFAULT_HEIGHT = XLAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Current Whint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__CURRENT_WHINT = XLAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Current Hhint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__CURRENT_HHINT = XLAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Current Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__CURRENT_WIDTH = XLAYOUT_DATA_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Current Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA__CURRENT_HEIGHT = XLAYOUT_DATA_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XFill Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA_FEATURE_COUNT = XLAYOUT_DATA_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>XFill Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_DATA_OPERATION_COUNT = XLAYOUT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XRowDataImpl <em>XRow Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XRowDataImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXRowData()
	 * @generated
	 */
	int XROW_DATA = 6;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_DATA__WIDTH = XLAYOUT_DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_DATA__HEIGHT = XLAYOUT_DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_DATA__EXCLUDE = XLAYOUT_DATA_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XRow Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_DATA_FEATURE_COUNT = XLAYOUT_DATA_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XRow Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_DATA_OPERATION_COUNT = XLAYOUT_DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl <em>XGrid Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XGridLayoutImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXGridLayout()
	 * @generated
	 */
	int XGRID_LAYOUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__NAME = XLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_WIDTH = XLAYOUT__MARGIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_HEIGHT = XLAYOUT__MARGIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Num Columns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__NUM_COLUMNS = XLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = XLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_LEFT = XLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_TOP = XLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_RIGHT = XLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__MARGIN_BOTTOM = XLAYOUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__HORIZONTAL_SPACING = XLAYOUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT__VERTICAL_SPACING = XLAYOUT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>XGrid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT_FEATURE_COUNT = XLAYOUT_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>XGrid Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGRID_LAYOUT_OPERATION_COUNT = XLAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XFillLayoutImpl <em>XFill Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XFillLayoutImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXFillLayout()
	 * @generated
	 */
	int XFILL_LAYOUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT__NAME = XLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT__MARGIN_WIDTH = XLAYOUT__MARGIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT__MARGIN_HEIGHT = XLAYOUT__MARGIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT__TYP = XLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT__SPACING = XLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XFill Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT_FEATURE_COUNT = XLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XFill Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XFILL_LAYOUT_OPERATION_COUNT = XLAYOUT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl <em>XRow Layout</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.layout.model.impl.XRowLayoutImpl
	 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXRowLayout()
	 * @generated
	 */
	int XROW_LAYOUT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__NAME = XLAYOUT__NAME;

	/**
	 * The feature id for the '<em><b>Margin Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_WIDTH = XLAYOUT__MARGIN_WIDTH;

	/**
	 * The feature id for the '<em><b>Margin Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_HEIGHT = XLAYOUT__MARGIN_HEIGHT;

	/**
	 * The feature id for the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__TYP = XLAYOUT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__SPACING = XLAYOUT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Wrap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__WRAP = XLAYOUT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Pack</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__PACK = XLAYOUT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Fill</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__FILL = XLAYOUT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Center</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__CENTER = XLAYOUT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Justify</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__JUSTIFY = XLAYOUT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Margin Left</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_LEFT = XLAYOUT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Margin Top</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_TOP = XLAYOUT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Margin Right</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_RIGHT = XLAYOUT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Margin Bottom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT__MARGIN_BOTTOM = XLAYOUT_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>XRow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT_FEATURE_COUNT = XLAYOUT_FEATURE_COUNT + 11;

	/**
	 * The number of operations of the '<em>XRow Layout</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XROW_LAYOUT_OPERATION_COUNT = XLAYOUT_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XLayoutElement <em>XLayout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout Element</em>'.
	 * @see de.dc.swtform.layout.model.XLayoutElement
	 * @generated
	 */
	EClass getXLayoutElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.layout.model.XLayoutElement#getLayout <em>Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout</em>'.
	 * @see de.dc.swtform.layout.model.XLayoutElement#getLayout()
	 * @see #getXLayoutElement()
	 * @generated
	 */
	EReference getXLayoutElement_Layout();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XLayoutDataElement <em>XLayout Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout Data Element</em>'.
	 * @see de.dc.swtform.layout.model.XLayoutDataElement
	 * @generated
	 */
	EClass getXLayoutDataElement();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.layout.model.XLayoutDataElement#getLayoutData <em>Layout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Layout Data</em>'.
	 * @see de.dc.swtform.layout.model.XLayoutDataElement#getLayoutData()
	 * @see #getXLayoutDataElement()
	 * @generated
	 */
	EReference getXLayoutDataElement_LayoutData();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XLayoutData <em>XLayout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout Data</em>'.
	 * @see de.dc.swtform.layout.model.XLayoutData
	 * @generated
	 */
	EClass getXLayoutData();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XLayout <em>XLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLayout</em>'.
	 * @see de.dc.swtform.layout.model.XLayout
	 * @generated
	 */
	EClass getXLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XLayout#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.swtform.layout.model.XLayout#getName()
	 * @see #getXLayout()
	 * @generated
	 */
	EAttribute getXLayout_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XLayout#getMarginWidth <em>Margin Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Width</em>'.
	 * @see de.dc.swtform.layout.model.XLayout#getMarginWidth()
	 * @see #getXLayout()
	 * @generated
	 */
	EAttribute getXLayout_MarginWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XLayout#getMarginHeight <em>Margin Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Height</em>'.
	 * @see de.dc.swtform.layout.model.XLayout#getMarginHeight()
	 * @see #getXLayout()
	 * @generated
	 */
	EAttribute getXLayout_MarginHeight();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XGridData <em>XGrid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XGrid Data</em>'.
	 * @see de.dc.swtform.layout.model.XGridData
	 * @generated
	 */
	EClass getXGridData();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getVerticalAlignment <em>Vertical Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Alignment</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getVerticalAlignment()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_VerticalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getHorizontalAlignment <em>Horizontal Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Alignment</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getHorizontalAlignment()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_HorizontalAlignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getWidthHint <em>Width Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width Hint</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getWidthHint()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_WidthHint();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getHeightHint <em>Height Hint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height Hint</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getHeightHint()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_HeightHint();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getHorizontalIndent <em>Horizontal Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Indent</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getHorizontalIndent()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_HorizontalIndent();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getVerticalIndent <em>Vertical Indent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Indent</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getVerticalIndent()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_VerticalIndent();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getHorizontalSpan <em>Horizontal Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Span</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getHorizontalSpan()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_HorizontalSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getVerticalSpan <em>Vertical Span</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Span</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getVerticalSpan()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_VerticalSpan();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Horizontal Space</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getGrabExcessHorizontalSpace()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_GrabExcessHorizontalSpace();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grab Excess Vertical Space</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getGrabExcessVerticalSpace()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_GrabExcessVerticalSpace();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getMinimumWidth <em>Minimum Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Width</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getMinimumWidth()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_MinimumWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getMinimumHeight <em>Minimum Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minimum Height</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getMinimumHeight()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_MinimumHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridData#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see de.dc.swtform.layout.model.XGridData#getExclude()
	 * @see #getXGridData()
	 * @generated
	 */
	EAttribute getXGridData_Exclude();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XFillData <em>XFill Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFill Data</em>'.
	 * @see de.dc.swtform.layout.model.XFillData
	 * @generated
	 */
	EClass getXFillData();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getDefaultWidth <em>Default Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Width</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getDefaultWidth()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_DefaultWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getDefaultHeight <em>Default Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Height</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getDefaultHeight()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_DefaultHeight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getCurrentWhint <em>Current Whint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Whint</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getCurrentWhint()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_CurrentWhint();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getCurrentHhint <em>Current Hhint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Hhint</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getCurrentHhint()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_CurrentHhint();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getCurrentWidth <em>Current Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Width</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getCurrentWidth()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_CurrentWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillData#getCurrentHeight <em>Current Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Height</em>'.
	 * @see de.dc.swtform.layout.model.XFillData#getCurrentHeight()
	 * @see #getXFillData()
	 * @generated
	 */
	EAttribute getXFillData_CurrentHeight();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XRowData <em>XRow Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRow Data</em>'.
	 * @see de.dc.swtform.layout.model.XRowData
	 * @generated
	 */
	EClass getXRowData();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowData#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.swtform.layout.model.XRowData#getWidth()
	 * @see #getXRowData()
	 * @generated
	 */
	EAttribute getXRowData_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowData#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see de.dc.swtform.layout.model.XRowData#getHeight()
	 * @see #getXRowData()
	 * @generated
	 */
	EAttribute getXRowData_Height();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowData#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exclude</em>'.
	 * @see de.dc.swtform.layout.model.XRowData#getExclude()
	 * @see #getXRowData()
	 * @generated
	 */
	EAttribute getXRowData_Exclude();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XGridLayout <em>XGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XGrid Layout</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout
	 * @generated
	 */
	EClass getXGridLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getNumColumns <em>Num Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Columns</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getNumColumns()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_NumColumns();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Make Columns Equal Width</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getMakeColumnsEqualWidth()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_MakeColumnsEqualWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getMarginLeft()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_MarginLeft();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getMarginTop()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getMarginRight()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_MarginRight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getMarginBottom()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_MarginBottom();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Spacing</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getHorizontalSpacing()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_HorizontalSpacing();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XGridLayout#getVerticalSpacing <em>Vertical Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Spacing</em>'.
	 * @see de.dc.swtform.layout.model.XGridLayout#getVerticalSpacing()
	 * @see #getXGridLayout()
	 * @generated
	 */
	EAttribute getXGridLayout_VerticalSpacing();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XFillLayout <em>XFill Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XFill Layout</em>'.
	 * @see de.dc.swtform.layout.model.XFillLayout
	 * @generated
	 */
	EClass getXFillLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillLayout#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.dc.swtform.layout.model.XFillLayout#getTyp()
	 * @see #getXFillLayout()
	 * @generated
	 */
	EAttribute getXFillLayout_Typ();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XFillLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.swtform.layout.model.XFillLayout#getSpacing()
	 * @see #getXFillLayout()
	 * @generated
	 */
	EAttribute getXFillLayout_Spacing();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.layout.model.XRowLayout <em>XRow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRow Layout</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout
	 * @generated
	 */
	EClass getXRowLayout();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getTyp <em>Typ</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Typ</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getTyp()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Typ();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getSpacing()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Spacing();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getWrap <em>Wrap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wrap</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getWrap()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Wrap();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getPack <em>Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pack</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getPack()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Pack();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getFill <em>Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fill</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getFill()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Fill();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getCenter <em>Center</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Center</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getCenter()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Center();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getJustify <em>Justify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Justify</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getJustify()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_Justify();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getMarginLeft <em>Margin Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Left</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getMarginLeft()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_MarginLeft();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getMarginTop <em>Margin Top</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Top</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getMarginTop()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_MarginTop();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getMarginRight <em>Margin Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Right</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getMarginRight()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_MarginRight();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.layout.model.XRowLayout#getMarginBottom <em>Margin Bottom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Margin Bottom</em>'.
	 * @see de.dc.swtform.layout.model.XRowLayout#getMarginBottom()
	 * @see #getXRowLayout()
	 * @generated
	 */
	EAttribute getXRowLayout_MarginBottom();

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
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XLayoutElementImpl <em>XLayout Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XLayoutElementImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutElement()
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
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XLayoutDataElementImpl <em>XLayout Data Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XLayoutDataElementImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutDataElement()
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
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XLayoutDataImpl <em>XLayout Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XLayoutDataImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayoutData()
		 * @generated
		 */
		EClass XLAYOUT_DATA = eINSTANCE.getXLayoutData();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XLayoutImpl <em>XLayout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XLayoutImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXLayout()
		 * @generated
		 */
		EClass XLAYOUT = eINSTANCE.getXLayout();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLAYOUT__NAME = eINSTANCE.getXLayout_Name();

		/**
		 * The meta object literal for the '<em><b>Margin Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLAYOUT__MARGIN_WIDTH = eINSTANCE.getXLayout_MarginWidth();

		/**
		 * The meta object literal for the '<em><b>Margin Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XLAYOUT__MARGIN_HEIGHT = eINSTANCE.getXLayout_MarginHeight();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XGridDataImpl <em>XGrid Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XGridDataImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXGridData()
		 * @generated
		 */
		EClass XGRID_DATA = eINSTANCE.getXGridData();

		/**
		 * The meta object literal for the '<em><b>Vertical Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__VERTICAL_ALIGNMENT = eINSTANCE.getXGridData_VerticalAlignment();

		/**
		 * The meta object literal for the '<em><b>Horizontal Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__HORIZONTAL_ALIGNMENT = eINSTANCE.getXGridData_HorizontalAlignment();

		/**
		 * The meta object literal for the '<em><b>Width Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__WIDTH_HINT = eINSTANCE.getXGridData_WidthHint();

		/**
		 * The meta object literal for the '<em><b>Height Hint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__HEIGHT_HINT = eINSTANCE.getXGridData_HeightHint();

		/**
		 * The meta object literal for the '<em><b>Horizontal Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__HORIZONTAL_INDENT = eINSTANCE.getXGridData_HorizontalIndent();

		/**
		 * The meta object literal for the '<em><b>Vertical Indent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__VERTICAL_INDENT = eINSTANCE.getXGridData_VerticalIndent();

		/**
		 * The meta object literal for the '<em><b>Horizontal Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__HORIZONTAL_SPAN = eINSTANCE.getXGridData_HorizontalSpan();

		/**
		 * The meta object literal for the '<em><b>Vertical Span</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__VERTICAL_SPAN = eINSTANCE.getXGridData_VerticalSpan();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Horizontal Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE = eINSTANCE.getXGridData_GrabExcessHorizontalSpace();

		/**
		 * The meta object literal for the '<em><b>Grab Excess Vertical Space</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE = eINSTANCE.getXGridData_GrabExcessVerticalSpace();

		/**
		 * The meta object literal for the '<em><b>Minimum Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__MINIMUM_WIDTH = eINSTANCE.getXGridData_MinimumWidth();

		/**
		 * The meta object literal for the '<em><b>Minimum Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__MINIMUM_HEIGHT = eINSTANCE.getXGridData_MinimumHeight();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_DATA__EXCLUDE = eINSTANCE.getXGridData_Exclude();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XFillDataImpl <em>XFill Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XFillDataImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXFillData()
		 * @generated
		 */
		EClass XFILL_DATA = eINSTANCE.getXFillData();

		/**
		 * The meta object literal for the '<em><b>Default Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__DEFAULT_WIDTH = eINSTANCE.getXFillData_DefaultWidth();

		/**
		 * The meta object literal for the '<em><b>Default Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__DEFAULT_HEIGHT = eINSTANCE.getXFillData_DefaultHeight();

		/**
		 * The meta object literal for the '<em><b>Current Whint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__CURRENT_WHINT = eINSTANCE.getXFillData_CurrentWhint();

		/**
		 * The meta object literal for the '<em><b>Current Hhint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__CURRENT_HHINT = eINSTANCE.getXFillData_CurrentHhint();

		/**
		 * The meta object literal for the '<em><b>Current Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__CURRENT_WIDTH = eINSTANCE.getXFillData_CurrentWidth();

		/**
		 * The meta object literal for the '<em><b>Current Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_DATA__CURRENT_HEIGHT = eINSTANCE.getXFillData_CurrentHeight();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XRowDataImpl <em>XRow Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XRowDataImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXRowData()
		 * @generated
		 */
		EClass XROW_DATA = eINSTANCE.getXRowData();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_DATA__WIDTH = eINSTANCE.getXRowData_Width();

		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_DATA__HEIGHT = eINSTANCE.getXRowData_Height();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_DATA__EXCLUDE = eINSTANCE.getXRowData_Exclude();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl <em>XGrid Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XGridLayoutImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXGridLayout()
		 * @generated
		 */
		EClass XGRID_LAYOUT = eINSTANCE.getXGridLayout();

		/**
		 * The meta object literal for the '<em><b>Num Columns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__NUM_COLUMNS = eINSTANCE.getXGridLayout_NumColumns();

		/**
		 * The meta object literal for the '<em><b>Make Columns Equal Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH = eINSTANCE.getXGridLayout_MakeColumnsEqualWidth();

		/**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__MARGIN_LEFT = eINSTANCE.getXGridLayout_MarginLeft();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__MARGIN_TOP = eINSTANCE.getXGridLayout_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__MARGIN_RIGHT = eINSTANCE.getXGridLayout_MarginRight();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__MARGIN_BOTTOM = eINSTANCE.getXGridLayout_MarginBottom();

		/**
		 * The meta object literal for the '<em><b>Horizontal Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__HORIZONTAL_SPACING = eINSTANCE.getXGridLayout_HorizontalSpacing();

		/**
		 * The meta object literal for the '<em><b>Vertical Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XGRID_LAYOUT__VERTICAL_SPACING = eINSTANCE.getXGridLayout_VerticalSpacing();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XFillLayoutImpl <em>XFill Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XFillLayoutImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXFillLayout()
		 * @generated
		 */
		EClass XFILL_LAYOUT = eINSTANCE.getXFillLayout();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_LAYOUT__TYP = eINSTANCE.getXFillLayout_Typ();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XFILL_LAYOUT__SPACING = eINSTANCE.getXFillLayout_Spacing();

		/**
		 * The meta object literal for the '{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl <em>XRow Layout</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.swtform.layout.model.impl.XRowLayoutImpl
		 * @see de.dc.swtform.layout.model.impl.ModelPackageImpl#getXRowLayout()
		 * @generated
		 */
		EClass XROW_LAYOUT = eINSTANCE.getXRowLayout();

		/**
		 * The meta object literal for the '<em><b>Typ</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__TYP = eINSTANCE.getXRowLayout_Typ();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__SPACING = eINSTANCE.getXRowLayout_Spacing();

		/**
		 * The meta object literal for the '<em><b>Wrap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__WRAP = eINSTANCE.getXRowLayout_Wrap();

		/**
		 * The meta object literal for the '<em><b>Pack</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__PACK = eINSTANCE.getXRowLayout_Pack();

		/**
		 * The meta object literal for the '<em><b>Fill</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__FILL = eINSTANCE.getXRowLayout_Fill();

		/**
		 * The meta object literal for the '<em><b>Center</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__CENTER = eINSTANCE.getXRowLayout_Center();

		/**
		 * The meta object literal for the '<em><b>Justify</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__JUSTIFY = eINSTANCE.getXRowLayout_Justify();

		/**
		 * The meta object literal for the '<em><b>Margin Left</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__MARGIN_LEFT = eINSTANCE.getXRowLayout_MarginLeft();

		/**
		 * The meta object literal for the '<em><b>Margin Top</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__MARGIN_TOP = eINSTANCE.getXRowLayout_MarginTop();

		/**
		 * The meta object literal for the '<em><b>Margin Right</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__MARGIN_RIGHT = eINSTANCE.getXRowLayout_MarginRight();

		/**
		 * The meta object literal for the '<em><b>Margin Bottom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XROW_LAYOUT__MARGIN_BOTTOM = eINSTANCE.getXRowLayout_MarginBottom();

	}

} //ModelPackage
