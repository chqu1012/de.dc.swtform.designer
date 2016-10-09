/**
 */
package de.dc.swtform.xcore.widget.util;

import de.dc.swtform.layout.model.XLayoutDataElement;
import de.dc.swtform.layout.model.XLayoutElement;

import de.dc.swtform.xcore.widget.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.xcore.widget.WidgetPackage
 * @generated
 */
public class WidgetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WidgetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WidgetSwitch() {
		if (modelPackage == null) {
			modelPackage = WidgetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WidgetPackage.XWIDGET: {
				XWidget xWidget = (XWidget)theEObject;
				T result = caseXWidget(xWidget);
				if (result == null) result = caseXLayoutDataElement(xWidget);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XBUTTON: {
				XButton xButton = (XButton)theEObject;
				T result = caseXButton(xButton);
				if (result == null) result = caseXWidget(xButton);
				if (result == null) result = caseISelectable(xButton);
				if (result == null) result = caseXLayoutDataElement(xButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCHECK_BUTTON: {
				XCheckButton xCheckButton = (XCheckButton)theEObject;
				T result = caseXCheckButton(xCheckButton);
				if (result == null) result = caseXButton(xCheckButton);
				if (result == null) result = caseXWidget(xCheckButton);
				if (result == null) result = caseISelectable(xCheckButton);
				if (result == null) result = caseXLayoutDataElement(xCheckButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XRADIO_BUTTON: {
				XRadioButton xRadioButton = (XRadioButton)theEObject;
				T result = caseXRadioButton(xRadioButton);
				if (result == null) result = caseXButton(xRadioButton);
				if (result == null) result = caseXWidget(xRadioButton);
				if (result == null) result = caseISelectable(xRadioButton);
				if (result == null) result = caseXLayoutDataElement(xRadioButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTOOGLE_BUTTON: {
				XToogleButton xToogleButton = (XToogleButton)theEObject;
				T result = caseXToogleButton(xToogleButton);
				if (result == null) result = caseXButton(xToogleButton);
				if (result == null) result = caseXWidget(xToogleButton);
				if (result == null) result = caseISelectable(xToogleButton);
				if (result == null) result = caseXLayoutDataElement(xToogleButton);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XSPINNER: {
				XSpinner xSpinner = (XSpinner)theEObject;
				T result = caseXSpinner(xSpinner);
				if (result == null) result = caseXWidget(xSpinner);
				if (result == null) result = caseXLayoutDataElement(xSpinner);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XDATE_TIME: {
				XDateTime xDateTime = (XDateTime)theEObject;
				T result = caseXDateTime(xDateTime);
				if (result == null) result = caseXWidget(xDateTime);
				if (result == null) result = caseISelectable(xDateTime);
				if (result == null) result = caseXLayoutDataElement(xDateTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XDIALOG_TEXT: {
				XDialogText xDialogText = (XDialogText)theEObject;
				T result = caseXDialogText(xDialogText);
				if (result == null) result = caseXWidget(xDialogText);
				if (result == null) result = caseXLayoutDataElement(xDialogText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XUNIT_LABEL: {
				XUnitLabel xUnitLabel = (XUnitLabel)theEObject;
				T result = caseXUnitLabel(xUnitLabel);
				if (result == null) result = caseXLabel(xUnitLabel);
				if (result == null) result = caseXWidget(xUnitLabel);
				if (result == null) result = caseISelectable(xUnitLabel);
				if (result == null) result = caseXLayoutDataElement(xUnitLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTOOL_BAR: {
				XToolBar xToolBar = (XToolBar)theEObject;
				T result = caseXToolBar(xToolBar);
				if (result == null) result = caseXWidget(xToolBar);
				if (result == null) result = caseXLayoutDataElement(xToolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTOOL_BAR_ITEM: {
				XToolBarItem xToolBarItem = (XToolBarItem)theEObject;
				T result = caseXToolBarItem(xToolBarItem);
				if (result == null) result = caseXWidget(xToolBarItem);
				if (result == null) result = caseISelectable(xToolBarItem);
				if (result == null) result = caseXLayoutDataElement(xToolBarItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOOL_BAR: {
				XCoolBar xCoolBar = (XCoolBar)theEObject;
				T result = caseXCoolBar(xCoolBar);
				if (result == null) result = caseXWidget(xCoolBar);
				if (result == null) result = caseXLayoutDataElement(xCoolBar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOOL_BAR_ITEM: {
				XCoolBarItem xCoolBarItem = (XCoolBarItem)theEObject;
				T result = caseXCoolBarItem(xCoolBarItem);
				if (result == null) result = caseXWidget(xCoolBarItem);
				if (result == null) result = caseISelectable(xCoolBarItem);
				if (result == null) result = caseXLayoutDataElement(xCoolBarItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XBROWSER: {
				XBrowser xBrowser = (XBrowser)theEObject;
				T result = caseXBrowser(xBrowser);
				if (result == null) result = caseXWidget(xBrowser);
				if (result == null) result = caseXLayoutDataElement(xBrowser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLINK: {
				XLink xLink = (XLink)theEObject;
				T result = caseXLink(xLink);
				if (result == null) result = caseXWidget(xLink);
				if (result == null) result = caseXLayoutDataElement(xLink);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLABEL: {
				XLabel xLabel = (XLabel)theEObject;
				T result = caseXLabel(xLabel);
				if (result == null) result = caseXWidget(xLabel);
				if (result == null) result = caseISelectable(xLabel);
				if (result == null) result = caseXLayoutDataElement(xLabel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLABEL_COMBO: {
				XLabelCombo xLabelCombo = (XLabelCombo)theEObject;
				T result = caseXLabelCombo(xLabelCombo);
				if (result == null) result = caseXLabel(xLabelCombo);
				if (result == null) result = caseXWidget(xLabelCombo);
				if (result == null) result = caseISelectable(xLabelCombo);
				if (result == null) result = caseXLayoutDataElement(xLabelCombo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLABEL_TEXT: {
				XLabelText xLabelText = (XLabelText)theEObject;
				T result = caseXLabelText(xLabelText);
				if (result == null) result = caseXLabel(xLabelText);
				if (result == null) result = caseXWidget(xLabelText);
				if (result == null) result = caseISelectable(xLabelText);
				if (result == null) result = caseXLayoutDataElement(xLabelText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOMBO: {
				XCombo xCombo = (XCombo)theEObject;
				T result = caseXCombo(xCombo);
				if (result == null) result = caseXWidget(xCombo);
				if (result == null) result = caseXLayoutDataElement(xCombo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOMBO_ITEM: {
				XComboItem xComboItem = (XComboItem)theEObject;
				T result = caseXComboItem(xComboItem);
				if (result == null) result = caseXWidget(xComboItem);
				if (result == null) result = caseXLayoutDataElement(xComboItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTEXT: {
				XText xText = (XText)theEObject;
				T result = caseXText(xText);
				if (result == null) result = caseXWidget(xText);
				if (result == null) result = caseXLayoutDataElement(xText);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOMPOSITE: {
				XComposite xComposite = (XComposite)theEObject;
				T result = caseXComposite(xComposite);
				if (result == null) result = caseXWidget(xComposite);
				if (result == null) result = caseXLayoutElement(xComposite);
				if (result == null) result = caseXLayoutDataElement(xComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XGROUP: {
				XGroup xGroup = (XGroup)theEObject;
				T result = caseXGroup(xGroup);
				if (result == null) result = caseXComposite(xGroup);
				if (result == null) result = caseXWidget(xGroup);
				if (result == null) result = caseXLayoutElement(xGroup);
				if (result == null) result = caseXLayoutDataElement(xGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XSCROLLED_COMPOSITE: {
				XScrolledComposite xScrolledComposite = (XScrolledComposite)theEObject;
				T result = caseXScrolledComposite(xScrolledComposite);
				if (result == null) result = caseXComposite(xScrolledComposite);
				if (result == null) result = caseXWidget(xScrolledComposite);
				if (result == null) result = caseXLayoutElement(xScrolledComposite);
				if (result == null) result = caseXLayoutDataElement(xScrolledComposite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTAB_FOLDER: {
				XTabFolder xTabFolder = (XTabFolder)theEObject;
				T result = caseXTabFolder(xTabFolder);
				if (result == null) result = caseXWidget(xTabFolder);
				if (result == null) result = caseXLayoutElement(xTabFolder);
				if (result == null) result = caseXLayoutDataElement(xTabFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTAB_ITEM: {
				XTabItem xTabItem = (XTabItem)theEObject;
				T result = caseXTabItem(xTabItem);
				if (result == null) result = caseXComposite(xTabItem);
				if (result == null) result = caseXWidget(xTabItem);
				if (result == null) result = caseXLayoutElement(xTabItem);
				if (result == null) result = caseXLayoutDataElement(xTabItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XC_TAB_FOLDER: {
				XCTabFolder xcTabFolder = (XCTabFolder)theEObject;
				T result = caseXCTabFolder(xcTabFolder);
				if (result == null) result = caseXWidget(xcTabFolder);
				if (result == null) result = caseXLayoutElement(xcTabFolder);
				if (result == null) result = caseXLayoutDataElement(xcTabFolder);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XC_TAB_ITEM: {
				XCTabItem xcTabItem = (XCTabItem)theEObject;
				T result = caseXCTabItem(xcTabItem);
				if (result == null) result = caseXComposite(xcTabItem);
				if (result == null) result = caseXWidget(xcTabItem);
				if (result == null) result = caseXLayoutElement(xcTabItem);
				if (result == null) result = caseXLayoutDataElement(xcTabItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XVIEWER: {
				XViewer xViewer = (XViewer)theEObject;
				T result = caseXViewer(xViewer);
				if (result == null) result = caseXWidget(xViewer);
				if (result == null) result = caseXLayoutDataElement(xViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XMENU: {
				XMenu xMenu = (XMenu)theEObject;
				T result = caseXMenu(xMenu);
				if (result == null) result = caseXWidget(xMenu);
				if (result == null) result = caseXLayoutDataElement(xMenu);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XMENU_ITEM: {
				XMenuItem xMenuItem = (XMenuItem)theEObject;
				T result = caseXMenuItem(xMenuItem);
				if (result == null) result = caseXWidget(xMenuItem);
				if (result == null) result = caseISelectable(xMenuItem);
				if (result == null) result = caseXLayoutDataElement(xMenuItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLABEL_PROVIDER: {
				XLabelProvider xLabelProvider = (XLabelProvider)theEObject;
				T result = caseXLabelProvider(xLabelProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCONTENT_PROVIDER: {
				XContentProvider xContentProvider = (XContentProvider)theEObject;
				T result = caseXContentProvider(xContentProvider);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTABLE_VIEWER: {
				XTableViewer xTableViewer = (XTableViewer)theEObject;
				T result = caseXTableViewer(xTableViewer);
				if (result == null) result = caseXViewer(xTableViewer);
				if (result == null) result = caseXWidget(xTableViewer);
				if (result == null) result = caseXLayoutDataElement(xTableViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTABLE_VIEWER_COLUMN: {
				XTableViewerColumn xTableViewerColumn = (XTableViewerColumn)theEObject;
				T result = caseXTableViewerColumn(xTableViewerColumn);
				if (result == null) result = caseXWidget(xTableViewerColumn);
				if (result == null) result = caseXLayoutDataElement(xTableViewerColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTREE_VIEWER: {
				XTreeViewer xTreeViewer = (XTreeViewer)theEObject;
				T result = caseXTreeViewer(xTreeViewer);
				if (result == null) result = caseXViewer(xTreeViewer);
				if (result == null) result = caseXWidget(xTreeViewer);
				if (result == null) result = caseXLayoutDataElement(xTreeViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XTREE_VIEWER_COLUMN: {
				XTreeViewerColumn xTreeViewerColumn = (XTreeViewerColumn)theEObject;
				T result = caseXTreeViewerColumn(xTreeViewerColumn);
				if (result == null) result = caseXWidget(xTreeViewerColumn);
				if (result == null) result = caseXLayoutDataElement(xTreeViewerColumn);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XLIST_VIEWER: {
				XListViewer xListViewer = (XListViewer)theEObject;
				T result = caseXListViewer(xListViewer);
				if (result == null) result = caseXViewer(xListViewer);
				if (result == null) result = caseXWidget(xListViewer);
				if (result == null) result = caseXLayoutDataElement(xListViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.XCOMBO_VIEWER: {
				XComboViewer xComboViewer = (XComboViewer)theEObject;
				T result = caseXComboViewer(xComboViewer);
				if (result == null) result = caseXViewer(xComboViewer);
				if (result == null) result = caseXWidget(xComboViewer);
				if (result == null) result = caseXLayoutDataElement(xComboViewer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WidgetPackage.ISELECTABLE: {
				ISelectable iSelectable = (ISelectable)theEObject;
				T result = caseISelectable(iSelectable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XWidget</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XWidget</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXWidget(XWidget object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XButton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XButton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXButton(XButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCheck Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCheck Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCheckButton(XCheckButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRadio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRadio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRadioButton(XRadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XToogle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XToogle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXToogleButton(XToogleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XSpinner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XSpinner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXSpinner(XSpinner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDate Time</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDate Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDateTime(XDateTime object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XDialog Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XDialog Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXDialogText(XDialogText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XUnit Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XUnit Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXUnitLabel(XUnitLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXToolBar(XToolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTool Bar Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTool Bar Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXToolBarItem(XToolBarItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCool Bar</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCool Bar</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCoolBar(XCoolBar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCool Bar Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCool Bar Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCoolBarItem(XCoolBarItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XBrowser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XBrowser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXBrowser(XBrowser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLink</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLink</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLink(XLink object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLabel</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLabel</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLabel(XLabel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLabel Combo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLabel Combo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLabelCombo(XLabelCombo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLabel Text</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLabel Text</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLabelText(XLabelText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCombo</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCombo</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCombo(XCombo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCombo Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCombo Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXComboItem(XComboItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XText</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XText</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXText(XText object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XComposite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XComposite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXComposite(XComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XGroup</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XGroup</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXGroup(XGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XScrolled Composite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XScrolled Composite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXScrolledComposite(XScrolledComposite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTab Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTab Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTabFolder(XTabFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTab Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTab Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTabItem(XTabItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XC Tab Folder</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XC Tab Folder</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCTabFolder(XCTabFolder object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XC Tab Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XC Tab Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXCTabItem(XCTabItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XViewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XViewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXViewer(XViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMenu</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMenu</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMenu(XMenu object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XMenu Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XMenu Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMenuItem(XMenuItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLabel Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLabel Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLabelProvider(XLabelProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XContent Provider</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XContent Provider</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXContentProvider(XContentProvider object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTable Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTable Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTableViewer(XTableViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTable Viewer Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTable Viewer Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTableViewerColumn(XTableViewerColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTree Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTree Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTreeViewer(XTreeViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XTree Viewer Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XTree Viewer Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXTreeViewerColumn(XTreeViewerColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XList Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XList Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXListViewer(XListViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XCombo Viewer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XCombo Viewer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXComboViewer(XComboViewer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>ISelectable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>ISelectable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseISelectable(ISelectable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLayout Data Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLayout Data Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLayoutDataElement(XLayoutDataElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLayout Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLayout Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLayoutElement(XLayoutElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WidgetSwitch
