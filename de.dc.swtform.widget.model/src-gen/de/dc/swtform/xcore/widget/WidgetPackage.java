/**
 */
package de.dc.swtform.xcore.widget;

import de.dc.swtform.layout.model.ModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.dc.swtform.xcore.widget.WidgetFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel runtimePlatform='RCP' modelDirectory='/de.dc.swtform.widget.model/src-gen' editDirectory='/de.dc.swtform.widget.edit/src-gen' editPluginID='de.dc.swtform.widget.edit' basePackage='de.dc.swtform.xcore'"
 * @generated
 */
public interface WidgetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "widget";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "de.dc.swtform.xcore.widget";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "widget";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WidgetPackage eINSTANCE = de.dc.swtform.xcore.widget.impl.WidgetPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XWidgetImpl <em>XWidget</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XWidgetImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXWidget()
	 * @generated
	 */
	int XWIDGET = 0;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET__LAYOUT_DATA = ModelPackage.XLAYOUT_DATA_ELEMENT__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET__NAME = ModelPackage.XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET__TEXT = ModelPackage.XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET__DATA = ModelPackage.XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET__MESSAGE = ModelPackage.XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XWidget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET_FEATURE_COUNT = ModelPackage.XLAYOUT_DATA_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XWidget</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XWIDGET_OPERATION_COUNT = ModelPackage.XLAYOUT_DATA_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XButtonImpl <em>XButton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XButtonImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXButton()
	 * @generated
	 */
	int XBUTTON = 1;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XButton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBUTTON_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCheckButtonImpl <em>XCheck Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCheckButtonImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCheckButton()
	 * @generated
	 */
	int XCHECK_BUTTON = 2;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON__IS_SELECTED = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XCheck Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XCheck Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCHECK_BUTTON_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XRadioButtonImpl <em>XRadio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XRadioButtonImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXRadioButton()
	 * @generated
	 */
	int XRADIO_BUTTON = 3;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON__IS_SELECTED = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XRadio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XRadio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XRADIO_BUTTON_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XToogleButtonImpl <em>XToogle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XToogleButtonImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXToogleButton()
	 * @generated
	 */
	int XTOOGLE_BUTTON = 4;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Is Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON__IS_SELECTED = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XToogle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XToogle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOGLE_BUTTON_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XSpinnerImpl <em>XSpinner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XSpinnerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXSpinner()
	 * @generated
	 */
	int XSPINNER = 5;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Page Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__PAGE_INCREMENT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER__DIGITS = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XSpinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XSpinner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSPINNER_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XDateTimeImpl <em>XDate Time</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XDateTimeImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXDateTime()
	 * @generated
	 */
	int XDATE_TIME = 6;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Date Time Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME__DATE_TIME_TYPE = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XDate Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XDate Time</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDATE_TIME_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XDialogTextImpl <em>XDialog Text</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XDialogTextImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXDialogText()
	 * @generated
	 */
	int XDIALOG_TEXT = 7;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__PATH = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Label Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__LABEL_WIDTH = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dialog Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT__DIALOG_TYPE = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XDialog Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XDialog Text</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XDIALOG_TEXT_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XUnitLabelImpl <em>XUnit Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XUnitLabelImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXUnitLabel()
	 * @generated
	 */
	int XUNIT_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__VALUE = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__UNIT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Label Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL__LABEL_WIDTH = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>XUnit Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>XUnit Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XUNIT_LABEL_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XToolBarImpl <em>XTool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XToolBarImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXToolBar()
	 * @generated
	 */
	int XTOOL_BAR = 9;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XTool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XTool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XToolBarItemImpl <em>XTool Bar Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XToolBarItemImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXToolBarItem()
	 * @generated
	 */
	int XTOOL_BAR_ITEM = 10;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XTool Bar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XTool Bar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTOOL_BAR_ITEM_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCoolBarImpl <em>XCool Bar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCoolBarImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCoolBar()
	 * @generated
	 */
	int XCOOL_BAR = 11;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XCool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XCool Bar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCoolBarItemImpl <em>XCool Bar Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCoolBarItemImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCoolBarItem()
	 * @generated
	 */
	int XCOOL_BAR_ITEM = 12;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XCool Bar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XCool Bar Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOOL_BAR_ITEM_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XBrowserImpl <em>XBrowser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XBrowserImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXBrowser()
	 * @generated
	 */
	int XBROWSER = 13;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XBrowser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XBrowser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XBROWSER_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XLinkImpl <em>XLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XLinkImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXLink()
	 * @generated
	 */
	int XLINK = 14;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK__URL = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLINK_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XLabelImpl <em>XLabel</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XLabelImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXLabel()
	 * @generated
	 */
	int XLABEL = 15;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XLabel</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XComboImpl <em>XCombo</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XComboImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCombo()
	 * @generated
	 */
	int XCOMBO = 16;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO__ITEMS = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>XCombo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>XCombo</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XComboItemImpl <em>XCombo Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XComboItemImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXComboItem()
	 * @generated
	 */
	int XCOMBO_ITEM = 17;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XCombo Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XCombo Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_ITEM_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTextImpl <em>XText</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTextImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXText()
	 * @generated
	 */
	int XTEXT = 18;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The number of structural features of the '<em>XText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XText</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEXT_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCompositeImpl <em>XComposite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCompositeImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXComposite()
	 * @generated
	 */
	int XCOMPOSITE = 19;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__LAYOUT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__WIDGETS = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__VIEWERS = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE__COMPOSITES = XWIDGET_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>XComposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>XComposite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMPOSITE_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XGroupImpl <em>XGroup</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XGroupImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXGroup()
	 * @generated
	 */
	int XGROUP = 20;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__LAYOUT_DATA = XCOMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__NAME = XCOMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__TEXT = XCOMPOSITE__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__DATA = XCOMPOSITE__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__MESSAGE = XCOMPOSITE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__LAYOUT = XCOMPOSITE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__WIDGETS = XCOMPOSITE__WIDGETS;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__VIEWERS = XCOMPOSITE__VIEWERS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP__COMPOSITES = XCOMPOSITE__COMPOSITES;

	/**
	 * The number of structural features of the '<em>XGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP_FEATURE_COUNT = XCOMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XGroup</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XGROUP_OPERATION_COUNT = XCOMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XScrolledCompositeImpl <em>XScrolled Composite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XScrolledCompositeImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXScrolledComposite()
	 * @generated
	 */
	int XSCROLLED_COMPOSITE = 21;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__LAYOUT_DATA = XCOMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__NAME = XCOMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__TEXT = XCOMPOSITE__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__DATA = XCOMPOSITE__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__MESSAGE = XCOMPOSITE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__LAYOUT = XCOMPOSITE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__WIDGETS = XCOMPOSITE__WIDGETS;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__VIEWERS = XCOMPOSITE__VIEWERS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE__COMPOSITES = XCOMPOSITE__COMPOSITES;

	/**
	 * The number of structural features of the '<em>XScrolled Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE_FEATURE_COUNT = XCOMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XScrolled Composite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XSCROLLED_COMPOSITE_OPERATION_COUNT = XCOMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTabFolderImpl <em>XTab Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTabFolderImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXTabFolder()
	 * @generated
	 */
	int XTAB_FOLDER = 22;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__LAYOUT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER__ITEMS = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XTab Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XTab Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_FOLDER_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTabItemImpl <em>XTab Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTabItemImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXTabItem()
	 * @generated
	 */
	int XTAB_ITEM = 23;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__LAYOUT_DATA = XCOMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__NAME = XCOMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__TEXT = XCOMPOSITE__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__DATA = XCOMPOSITE__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__MESSAGE = XCOMPOSITE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__LAYOUT = XCOMPOSITE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__WIDGETS = XCOMPOSITE__WIDGETS;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__VIEWERS = XCOMPOSITE__VIEWERS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM__COMPOSITES = XCOMPOSITE__COMPOSITES;

	/**
	 * The number of structural features of the '<em>XTab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM_FEATURE_COUNT = XCOMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XTab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTAB_ITEM_OPERATION_COUNT = XCOMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCTabFolderImpl <em>XC Tab Folder</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCTabFolderImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCTabFolder()
	 * @generated
	 */
	int XC_TAB_FOLDER = 24;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__LAYOUT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Items</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER__ITEMS = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XC Tab Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XC Tab Folder</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_FOLDER_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XCTabItemImpl <em>XC Tab Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XCTabItemImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXCTabItem()
	 * @generated
	 */
	int XC_TAB_ITEM = 25;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__LAYOUT_DATA = XCOMPOSITE__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__NAME = XCOMPOSITE__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__TEXT = XCOMPOSITE__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__DATA = XCOMPOSITE__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__MESSAGE = XCOMPOSITE__MESSAGE;

	/**
	 * The feature id for the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__LAYOUT = XCOMPOSITE__LAYOUT;

	/**
	 * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__WIDGETS = XCOMPOSITE__WIDGETS;

	/**
	 * The feature id for the '<em><b>Viewers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__VIEWERS = XCOMPOSITE__VIEWERS;

	/**
	 * The feature id for the '<em><b>Composites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM__COMPOSITES = XCOMPOSITE__COMPOSITES;

	/**
	 * The number of structural features of the '<em>XC Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM_FEATURE_COUNT = XCOMPOSITE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XC Tab Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XC_TAB_ITEM_OPERATION_COUNT = XCOMPOSITE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XViewerImpl <em>XViewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XViewerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXViewer()
	 * @generated
	 */
	int XVIEWER = 26;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__LABEL_PROVIDER = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER__CONTENT_PROVIDER = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XViewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XViewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XVIEWER_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XLabelProviderImpl <em>XLabel Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XLabelProviderImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXLabelProvider()
	 * @generated
	 */
	int XLABEL_PROVIDER = 27;

	/**
	 * The number of structural features of the '<em>XLabel Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>XLabel Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLABEL_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XContentProviderImpl <em>XContent Provider</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XContentProviderImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXContentProvider()
	 * @generated
	 */
	int XCONTENT_PROVIDER = 28;

	/**
	 * The number of structural features of the '<em>XContent Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTENT_PROVIDER_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>XContent Provider</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCONTENT_PROVIDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTableViewerImpl <em>XTable Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTableViewerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXTableViewer()
	 * @generated
	 */
	int XTABLE_VIEWER = 29;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__LAYOUT_DATA = XVIEWER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__NAME = XVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__TEXT = XVIEWER__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__DATA = XVIEWER__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__MESSAGE = XVIEWER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__LABEL_PROVIDER = XVIEWER__LABEL_PROVIDER;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__CONTENT_PROVIDER = XVIEWER__CONTENT_PROVIDER;

	/**
	 * The feature id for the '<em><b>Show Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__SHOW_HEADER = XVIEWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__SHOW_LINES = XVIEWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Show Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__SHOW_BORDER = XVIEWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Vertical Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__VERTICAL_SCROLL = XVIEWER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Horizontal Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__HORIZONTAL_SCROLL = XVIEWER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER__COLUMNS = XVIEWER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>XTable Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_FEATURE_COUNT = XVIEWER_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>XTable Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_OPERATION_COUNT = XVIEWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl <em>XTable Viewer Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTableViewerColumnImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXTableViewerColumn()
	 * @generated
	 */
	int XTABLE_VIEWER_COLUMN = 30;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__LAYOUT_DATA = XWIDGET__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__NAME = XWIDGET__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__TEXT = XWIDGET__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__DATA = XWIDGET__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__MESSAGE = XWIDGET__MESSAGE;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__ALIGNMENT = XWIDGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN__SIZE = XWIDGET_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>XTable Viewer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN_FEATURE_COUNT = XWIDGET_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>XTable Viewer Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTABLE_VIEWER_COLUMN_OPERATION_COUNT = XWIDGET_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XTreeViewerImpl <em>XTree Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XTreeViewerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXTreeViewer()
	 * @generated
	 */
	int XTREE_VIEWER = 31;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__LAYOUT_DATA = XVIEWER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__NAME = XVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__TEXT = XVIEWER__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__DATA = XVIEWER__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__MESSAGE = XVIEWER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__LABEL_PROVIDER = XVIEWER__LABEL_PROVIDER;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER__CONTENT_PROVIDER = XVIEWER__CONTENT_PROVIDER;

	/**
	 * The number of structural features of the '<em>XTree Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER_FEATURE_COUNT = XVIEWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XTree Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTREE_VIEWER_OPERATION_COUNT = XVIEWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XListViewerImpl <em>XList Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XListViewerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXListViewer()
	 * @generated
	 */
	int XLIST_VIEWER = 32;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__LAYOUT_DATA = XVIEWER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__NAME = XVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__TEXT = XVIEWER__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__DATA = XVIEWER__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__MESSAGE = XVIEWER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__LABEL_PROVIDER = XVIEWER__LABEL_PROVIDER;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER__CONTENT_PROVIDER = XVIEWER__CONTENT_PROVIDER;

	/**
	 * The number of structural features of the '<em>XList Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER_FEATURE_COUNT = XVIEWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XList Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XLIST_VIEWER_OPERATION_COUNT = XVIEWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.impl.XComboViewerImpl <em>XCombo Viewer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.impl.XComboViewerImpl
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXComboViewer()
	 * @generated
	 */
	int XCOMBO_VIEWER = 33;

	/**
	 * The feature id for the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__LAYOUT_DATA = XVIEWER__LAYOUT_DATA;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__NAME = XVIEWER__NAME;

	/**
	 * The feature id for the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__TEXT = XVIEWER__TEXT;

	/**
	 * The feature id for the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__DATA = XVIEWER__DATA;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__MESSAGE = XVIEWER__MESSAGE;

	/**
	 * The feature id for the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__LABEL_PROVIDER = XVIEWER__LABEL_PROVIDER;

	/**
	 * The feature id for the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER__CONTENT_PROVIDER = XVIEWER__CONTENT_PROVIDER;

	/**
	 * The number of structural features of the '<em>XCombo Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER_FEATURE_COUNT = XVIEWER_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>XCombo Viewer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XCOMBO_VIEWER_OPERATION_COUNT = XVIEWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.XDateTimeType <em>XDate Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.XDateTimeType
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXDateTimeType()
	 * @generated
	 */
	int XDATE_TIME_TYPE = 34;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.XDialogType <em>XDialog Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.XDialogType
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getXDialogType()
	 * @generated
	 */
	int XDIALOG_TYPE = 35;

	/**
	 * The meta object id for the '{@link de.dc.swtform.xcore.widget.Style <em>Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.swtform.xcore.widget.Style
	 * @see de.dc.swtform.xcore.widget.impl.WidgetPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 36;


	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XWidget <em>XWidget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XWidget</em>'.
	 * @see de.dc.swtform.xcore.widget.XWidget
	 * @generated
	 */
	EClass getXWidget();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XWidget#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.swtform.xcore.widget.XWidget#getName()
	 * @see #getXWidget()
	 * @generated
	 */
	EAttribute getXWidget_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XWidget#getText <em>Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text</em>'.
	 * @see de.dc.swtform.xcore.widget.XWidget#getText()
	 * @see #getXWidget()
	 * @generated
	 */
	EAttribute getXWidget_Text();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XWidget#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data</em>'.
	 * @see de.dc.swtform.xcore.widget.XWidget#getData()
	 * @see #getXWidget()
	 * @generated
	 */
	EAttribute getXWidget_Data();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XWidget#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see de.dc.swtform.xcore.widget.XWidget#getMessage()
	 * @see #getXWidget()
	 * @generated
	 */
	EAttribute getXWidget_Message();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XButton <em>XButton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XButton</em>'.
	 * @see de.dc.swtform.xcore.widget.XButton
	 * @generated
	 */
	EClass getXButton();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCheckButton <em>XCheck Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCheck Button</em>'.
	 * @see de.dc.swtform.xcore.widget.XCheckButton
	 * @generated
	 */
	EClass getXCheckButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XCheckButton#getIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dc.swtform.xcore.widget.XCheckButton#getIsSelected()
	 * @see #getXCheckButton()
	 * @generated
	 */
	EAttribute getXCheckButton_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XRadioButton <em>XRadio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XRadio Button</em>'.
	 * @see de.dc.swtform.xcore.widget.XRadioButton
	 * @generated
	 */
	EClass getXRadioButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XRadioButton#getIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dc.swtform.xcore.widget.XRadioButton#getIsSelected()
	 * @see #getXRadioButton()
	 * @generated
	 */
	EAttribute getXRadioButton_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XToogleButton <em>XToogle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XToogle Button</em>'.
	 * @see de.dc.swtform.xcore.widget.XToogleButton
	 * @generated
	 */
	EClass getXToogleButton();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XToogleButton#getIsSelected <em>Is Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Selected</em>'.
	 * @see de.dc.swtform.xcore.widget.XToogleButton#getIsSelected()
	 * @see #getXToogleButton()
	 * @generated
	 */
	EAttribute getXToogleButton_IsSelected();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XSpinner <em>XSpinner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XSpinner</em>'.
	 * @see de.dc.swtform.xcore.widget.XSpinner
	 * @generated
	 */
	EClass getXSpinner();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XSpinner#getPageIncrement <em>Page Increment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Page Increment</em>'.
	 * @see de.dc.swtform.xcore.widget.XSpinner#getPageIncrement()
	 * @see #getXSpinner()
	 * @generated
	 */
	EAttribute getXSpinner_PageIncrement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XSpinner#getDigits <em>Digits</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Digits</em>'.
	 * @see de.dc.swtform.xcore.widget.XSpinner#getDigits()
	 * @see #getXSpinner()
	 * @generated
	 */
	EAttribute getXSpinner_Digits();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XDateTime <em>XDate Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDate Time</em>'.
	 * @see de.dc.swtform.xcore.widget.XDateTime
	 * @generated
	 */
	EClass getXDateTime();

	/**
	 * Returns the meta object for the attribute list '{@link de.dc.swtform.xcore.widget.XDateTime#getDateTimeType <em>Date Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Date Time Type</em>'.
	 * @see de.dc.swtform.xcore.widget.XDateTime#getDateTimeType()
	 * @see #getXDateTime()
	 * @generated
	 */
	EAttribute getXDateTime_DateTimeType();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XDialogText <em>XDialog Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XDialog Text</em>'.
	 * @see de.dc.swtform.xcore.widget.XDialogText
	 * @generated
	 */
	EClass getXDialogText();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XDialogText#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see de.dc.swtform.xcore.widget.XDialogText#getPath()
	 * @see #getXDialogText()
	 * @generated
	 */
	EAttribute getXDialogText_Path();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XDialogText#getLabelWidth <em>Label Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Width</em>'.
	 * @see de.dc.swtform.xcore.widget.XDialogText#getLabelWidth()
	 * @see #getXDialogText()
	 * @generated
	 */
	EAttribute getXDialogText_LabelWidth();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XDialogText#getDialogType <em>Dialog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dialog Type</em>'.
	 * @see de.dc.swtform.xcore.widget.XDialogText#getDialogType()
	 * @see #getXDialogText()
	 * @generated
	 */
	EAttribute getXDialogText_DialogType();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XUnitLabel <em>XUnit Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XUnit Label</em>'.
	 * @see de.dc.swtform.xcore.widget.XUnitLabel
	 * @generated
	 */
	EClass getXUnitLabel();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XUnitLabel#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see de.dc.swtform.xcore.widget.XUnitLabel#getValue()
	 * @see #getXUnitLabel()
	 * @generated
	 */
	EAttribute getXUnitLabel_Value();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XUnitLabel#getUnit <em>Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unit</em>'.
	 * @see de.dc.swtform.xcore.widget.XUnitLabel#getUnit()
	 * @see #getXUnitLabel()
	 * @generated
	 */
	EAttribute getXUnitLabel_Unit();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XUnitLabel#getLabelWidth <em>Label Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label Width</em>'.
	 * @see de.dc.swtform.xcore.widget.XUnitLabel#getLabelWidth()
	 * @see #getXUnitLabel()
	 * @generated
	 */
	EAttribute getXUnitLabel_LabelWidth();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XToolBar <em>XTool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTool Bar</em>'.
	 * @see de.dc.swtform.xcore.widget.XToolBar
	 * @generated
	 */
	EClass getXToolBar();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XToolBarItem <em>XTool Bar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTool Bar Item</em>'.
	 * @see de.dc.swtform.xcore.widget.XToolBarItem
	 * @generated
	 */
	EClass getXToolBarItem();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCoolBar <em>XCool Bar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCool Bar</em>'.
	 * @see de.dc.swtform.xcore.widget.XCoolBar
	 * @generated
	 */
	EClass getXCoolBar();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCoolBarItem <em>XCool Bar Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCool Bar Item</em>'.
	 * @see de.dc.swtform.xcore.widget.XCoolBarItem
	 * @generated
	 */
	EClass getXCoolBarItem();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XBrowser <em>XBrowser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XBrowser</em>'.
	 * @see de.dc.swtform.xcore.widget.XBrowser
	 * @generated
	 */
	EClass getXBrowser();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XLink <em>XLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLink</em>'.
	 * @see de.dc.swtform.xcore.widget.XLink
	 * @generated
	 */
	EClass getXLink();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XLink#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see de.dc.swtform.xcore.widget.XLink#getUrl()
	 * @see #getXLink()
	 * @generated
	 */
	EAttribute getXLink_Url();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XLabel <em>XLabel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLabel</em>'.
	 * @see de.dc.swtform.xcore.widget.XLabel
	 * @generated
	 */
	EClass getXLabel();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCombo <em>XCombo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCombo</em>'.
	 * @see de.dc.swtform.xcore.widget.XCombo
	 * @generated
	 */
	EClass getXCombo();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XCombo#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.dc.swtform.xcore.widget.XCombo#getItems()
	 * @see #getXCombo()
	 * @generated
	 */
	EReference getXCombo_Items();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XComboItem <em>XCombo Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCombo Item</em>'.
	 * @see de.dc.swtform.xcore.widget.XComboItem
	 * @generated
	 */
	EClass getXComboItem();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XText <em>XText</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XText</em>'.
	 * @see de.dc.swtform.xcore.widget.XText
	 * @generated
	 */
	EClass getXText();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XComposite <em>XComposite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XComposite</em>'.
	 * @see de.dc.swtform.xcore.widget.XComposite
	 * @generated
	 */
	EClass getXComposite();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XComposite#getWidgets <em>Widgets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Widgets</em>'.
	 * @see de.dc.swtform.xcore.widget.XComposite#getWidgets()
	 * @see #getXComposite()
	 * @generated
	 */
	EReference getXComposite_Widgets();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XComposite#getViewers <em>Viewers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Viewers</em>'.
	 * @see de.dc.swtform.xcore.widget.XComposite#getViewers()
	 * @see #getXComposite()
	 * @generated
	 */
	EReference getXComposite_Viewers();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XComposite#getComposites <em>Composites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Composites</em>'.
	 * @see de.dc.swtform.xcore.widget.XComposite#getComposites()
	 * @see #getXComposite()
	 * @generated
	 */
	EReference getXComposite_Composites();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XGroup <em>XGroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XGroup</em>'.
	 * @see de.dc.swtform.xcore.widget.XGroup
	 * @generated
	 */
	EClass getXGroup();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XScrolledComposite <em>XScrolled Composite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XScrolled Composite</em>'.
	 * @see de.dc.swtform.xcore.widget.XScrolledComposite
	 * @generated
	 */
	EClass getXScrolledComposite();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XTabFolder <em>XTab Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTab Folder</em>'.
	 * @see de.dc.swtform.xcore.widget.XTabFolder
	 * @generated
	 */
	EClass getXTabFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XTabFolder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.dc.swtform.xcore.widget.XTabFolder#getItems()
	 * @see #getXTabFolder()
	 * @generated
	 */
	EReference getXTabFolder_Items();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XTabItem <em>XTab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTab Item</em>'.
	 * @see de.dc.swtform.xcore.widget.XTabItem
	 * @generated
	 */
	EClass getXTabItem();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCTabFolder <em>XC Tab Folder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XC Tab Folder</em>'.
	 * @see de.dc.swtform.xcore.widget.XCTabFolder
	 * @generated
	 */
	EClass getXCTabFolder();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XCTabFolder#getItems <em>Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Items</em>'.
	 * @see de.dc.swtform.xcore.widget.XCTabFolder#getItems()
	 * @see #getXCTabFolder()
	 * @generated
	 */
	EReference getXCTabFolder_Items();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XCTabItem <em>XC Tab Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XC Tab Item</em>'.
	 * @see de.dc.swtform.xcore.widget.XCTabItem
	 * @generated
	 */
	EClass getXCTabItem();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XViewer <em>XViewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XViewer</em>'.
	 * @see de.dc.swtform.xcore.widget.XViewer
	 * @generated
	 */
	EClass getXViewer();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.xcore.widget.XViewer#getLabelProvider <em>Label Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label Provider</em>'.
	 * @see de.dc.swtform.xcore.widget.XViewer#getLabelProvider()
	 * @see #getXViewer()
	 * @generated
	 */
	EReference getXViewer_LabelProvider();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.swtform.xcore.widget.XViewer#getContentProvider <em>Content Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Content Provider</em>'.
	 * @see de.dc.swtform.xcore.widget.XViewer#getContentProvider()
	 * @see #getXViewer()
	 * @generated
	 */
	EReference getXViewer_ContentProvider();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XLabelProvider <em>XLabel Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XLabel Provider</em>'.
	 * @see de.dc.swtform.xcore.widget.XLabelProvider
	 * @generated
	 */
	EClass getXLabelProvider();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XContentProvider <em>XContent Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XContent Provider</em>'.
	 * @see de.dc.swtform.xcore.widget.XContentProvider
	 * @generated
	 */
	EClass getXContentProvider();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XTableViewer <em>XTable Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTable Viewer</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer
	 * @generated
	 */
	EClass getXTableViewer();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowHeader <em>Show Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Header</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getShowHeader()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EAttribute getXTableViewer_ShowHeader();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowLines <em>Show Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Lines</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getShowLines()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EAttribute getXTableViewer_ShowLines();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowBorder <em>Show Border</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Border</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getShowBorder()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EAttribute getXTableViewer_ShowBorder();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewer#getVerticalScroll <em>Vertical Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Scroll</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getVerticalScroll()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EAttribute getXTableViewer_VerticalScroll();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewer#getHorizontalScroll <em>Horizontal Scroll</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Horizontal Scroll</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getHorizontalScroll()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EAttribute getXTableViewer_HorizontalScroll();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.swtform.xcore.widget.XTableViewer#getColumns <em>Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Columns</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewer#getColumns()
	 * @see #getXTableViewer()
	 * @generated
	 */
	EReference getXTableViewer_Columns();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XTableViewerColumn <em>XTable Viewer Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTable Viewer Column</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewerColumn
	 * @generated
	 */
	EClass getXTableViewerColumn();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewerColumn#getAlignment()
	 * @see #getXTableViewerColumn()
	 * @generated
	 */
	EAttribute getXTableViewerColumn_Alignment();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see de.dc.swtform.xcore.widget.XTableViewerColumn#getSize()
	 * @see #getXTableViewerColumn()
	 * @generated
	 */
	EAttribute getXTableViewerColumn_Size();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XTreeViewer <em>XTree Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XTree Viewer</em>'.
	 * @see de.dc.swtform.xcore.widget.XTreeViewer
	 * @generated
	 */
	EClass getXTreeViewer();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XListViewer <em>XList Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XList Viewer</em>'.
	 * @see de.dc.swtform.xcore.widget.XListViewer
	 * @generated
	 */
	EClass getXListViewer();

	/**
	 * Returns the meta object for class '{@link de.dc.swtform.xcore.widget.XComboViewer <em>XCombo Viewer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>XCombo Viewer</em>'.
	 * @see de.dc.swtform.xcore.widget.XComboViewer
	 * @generated
	 */
	EClass getXComboViewer();

	/**
	 * Returns the meta object for enum '{@link de.dc.swtform.xcore.widget.XDateTimeType <em>XDate Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XDate Time Type</em>'.
	 * @see de.dc.swtform.xcore.widget.XDateTimeType
	 * @generated
	 */
	EEnum getXDateTimeType();

	/**
	 * Returns the meta object for enum '{@link de.dc.swtform.xcore.widget.XDialogType <em>XDialog Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>XDialog Type</em>'.
	 * @see de.dc.swtform.xcore.widget.XDialogType
	 * @generated
	 */
	EEnum getXDialogType();

	/**
	 * Returns the meta object for enum '{@link de.dc.swtform.xcore.widget.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Style</em>'.
	 * @see de.dc.swtform.xcore.widget.Style
	 * @generated
	 */
	EEnum getStyle();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WidgetFactory getWidgetFactory();

} //WidgetPackage
