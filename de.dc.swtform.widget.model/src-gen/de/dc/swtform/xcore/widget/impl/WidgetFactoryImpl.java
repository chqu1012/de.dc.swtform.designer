/**
 */
package de.dc.swtform.xcore.widget.impl;

import de.dc.swtform.xcore.widget.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WidgetFactoryImpl extends EFactoryImpl implements WidgetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WidgetFactory init() {
		try {
			WidgetFactory theWidgetFactory = (WidgetFactory)EPackage.Registry.INSTANCE.getEFactory(WidgetPackage.eNS_URI);
			if (theWidgetFactory != null) {
				return theWidgetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WidgetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WidgetPackage.XBUTTON: return createXButton();
			case WidgetPackage.XCHECK_BUTTON: return createXCheckButton();
			case WidgetPackage.XRADIO_BUTTON: return createXRadioButton();
			case WidgetPackage.XTOOGLE_BUTTON: return createXToogleButton();
			case WidgetPackage.XSPINNER: return createXSpinner();
			case WidgetPackage.XDATE_TIME: return createXDateTime();
			case WidgetPackage.XDIALOG_TEXT: return createXDialogText();
			case WidgetPackage.XTOOL_BAR: return createXToolBar();
			case WidgetPackage.XTOOL_BAR_ITEM: return createXToolBarItem();
			case WidgetPackage.XCOOL_BAR: return createXCoolBar();
			case WidgetPackage.XCOOL_BAR_ITEM: return createXCoolBarItem();
			case WidgetPackage.XBROWSER: return createXBrowser();
			case WidgetPackage.XLINK: return createXLink();
			case WidgetPackage.XLABEL: return createXLabel();
			case WidgetPackage.XCOMBO: return createXCombo();
			case WidgetPackage.XCOMBO_ITEM: return createXComboItem();
			case WidgetPackage.XTEXT: return createXText();
			case WidgetPackage.XCOMPOSITE: return createXComposite();
			case WidgetPackage.XGROUP: return createXGroup();
			case WidgetPackage.XSCROLLED_COMPOSITE: return createXScrolledComposite();
			case WidgetPackage.XTAB_FOLDER: return createXTabFolder();
			case WidgetPackage.XTAB_ITEM: return createXTabItem();
			case WidgetPackage.XC_TAB_FOLDER: return createXCTabFolder();
			case WidgetPackage.XC_TAB_ITEM: return createXCTabItem();
			case WidgetPackage.XLABEL_PROVIDER: return createXLabelProvider();
			case WidgetPackage.XCONTENT_PROVIDER: return createXContentProvider();
			case WidgetPackage.XTABLE_VIEWER: return createXTableViewer();
			case WidgetPackage.XTABLE_VIEWER_COLUMN: return createXTableViewerColumn();
			case WidgetPackage.XTREE_VIEWER: return createXTreeViewer();
			case WidgetPackage.XLIST_VIEWER: return createXListViewer();
			case WidgetPackage.XCOMBO_VIEWER: return createXComboViewer();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case WidgetPackage.XDATE_TIME_TYPE:
				return createXDateTimeTypeFromString(eDataType, initialValue);
			case WidgetPackage.XDIALOG_TYPE:
				return createXDialogTypeFromString(eDataType, initialValue);
			case WidgetPackage.STYLE:
				return createStyleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case WidgetPackage.XDATE_TIME_TYPE:
				return convertXDateTimeTypeToString(eDataType, instanceValue);
			case WidgetPackage.XDIALOG_TYPE:
				return convertXDialogTypeToString(eDataType, instanceValue);
			case WidgetPackage.STYLE:
				return convertStyleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XButton createXButton() {
		XButtonImpl xButton = new XButtonImpl();
		return xButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCheckButton createXCheckButton() {
		XCheckButtonImpl xCheckButton = new XCheckButtonImpl();
		return xCheckButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XRadioButton createXRadioButton() {
		XRadioButtonImpl xRadioButton = new XRadioButtonImpl();
		return xRadioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XToogleButton createXToogleButton() {
		XToogleButtonImpl xToogleButton = new XToogleButtonImpl();
		return xToogleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XSpinner createXSpinner() {
		XSpinnerImpl xSpinner = new XSpinnerImpl();
		return xSpinner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDateTime createXDateTime() {
		XDateTimeImpl xDateTime = new XDateTimeImpl();
		return xDateTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDialogText createXDialogText() {
		XDialogTextImpl xDialogText = new XDialogTextImpl();
		return xDialogText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XToolBar createXToolBar() {
		XToolBarImpl xToolBar = new XToolBarImpl();
		return xToolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XToolBarItem createXToolBarItem() {
		XToolBarItemImpl xToolBarItem = new XToolBarItemImpl();
		return xToolBarItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCoolBar createXCoolBar() {
		XCoolBarImpl xCoolBar = new XCoolBarImpl();
		return xCoolBar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCoolBarItem createXCoolBarItem() {
		XCoolBarItemImpl xCoolBarItem = new XCoolBarItemImpl();
		return xCoolBarItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XBrowser createXBrowser() {
		XBrowserImpl xBrowser = new XBrowserImpl();
		return xBrowser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLink createXLink() {
		XLinkImpl xLink = new XLinkImpl();
		return xLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLabel createXLabel() {
		XLabelImpl xLabel = new XLabelImpl();
		return xLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCombo createXCombo() {
		XComboImpl xCombo = new XComboImpl();
		return xCombo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XComboItem createXComboItem() {
		XComboItemImpl xComboItem = new XComboItemImpl();
		return xComboItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XText createXText() {
		XTextImpl xText = new XTextImpl();
		return xText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XComposite createXComposite() {
		XCompositeImpl xComposite = new XCompositeImpl();
		return xComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XGroup createXGroup() {
		XGroupImpl xGroup = new XGroupImpl();
		return xGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XScrolledComposite createXScrolledComposite() {
		XScrolledCompositeImpl xScrolledComposite = new XScrolledCompositeImpl();
		return xScrolledComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTabFolder createXTabFolder() {
		XTabFolderImpl xTabFolder = new XTabFolderImpl();
		return xTabFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTabItem createXTabItem() {
		XTabItemImpl xTabItem = new XTabItemImpl();
		return xTabItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCTabFolder createXCTabFolder() {
		XCTabFolderImpl xcTabFolder = new XCTabFolderImpl();
		return xcTabFolder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XCTabItem createXCTabItem() {
		XCTabItemImpl xcTabItem = new XCTabItemImpl();
		return xcTabItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XLabelProvider createXLabelProvider() {
		XLabelProviderImpl xLabelProvider = new XLabelProviderImpl();
		return xLabelProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XContentProvider createXContentProvider() {
		XContentProviderImpl xContentProvider = new XContentProviderImpl();
		return xContentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTableViewer createXTableViewer() {
		XTableViewerImpl xTableViewer = new XTableViewerImpl();
		return xTableViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTableViewerColumn createXTableViewerColumn() {
		XTableViewerColumnImpl xTableViewerColumn = new XTableViewerColumnImpl();
		return xTableViewerColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XTreeViewer createXTreeViewer() {
		XTreeViewerImpl xTreeViewer = new XTreeViewerImpl();
		return xTreeViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XListViewer createXListViewer() {
		XListViewerImpl xListViewer = new XListViewerImpl();
		return xListViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XComboViewer createXComboViewer() {
		XComboViewerImpl xComboViewer = new XComboViewerImpl();
		return xComboViewer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDateTimeType createXDateTimeTypeFromString(EDataType eDataType, String initialValue) {
		XDateTimeType result = XDateTimeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDateTimeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XDialogType createXDialogTypeFromString(EDataType eDataType, String initialValue) {
		XDialogType result = XDialogType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertXDialogTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Style createStyleFromString(EDataType eDataType, String initialValue) {
		Style result = Style.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetPackage getWidgetPackage() {
		return (WidgetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WidgetPackage getPackage() {
		return WidgetPackage.eINSTANCE;
	}

} //WidgetFactoryImpl
