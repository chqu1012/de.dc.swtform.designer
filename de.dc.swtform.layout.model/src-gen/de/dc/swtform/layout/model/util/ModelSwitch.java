/**
 */
package de.dc.swtform.layout.model.util;

import de.dc.swtform.layout.model.*;

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
 * @see de.dc.swtform.layout.model.ModelPackage
 * @generated
 */
public class ModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelSwitch() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
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
			case ModelPackage.XLAYOUT_ELEMENT: {
				XLayoutElement xLayoutElement = (XLayoutElement)theEObject;
				T result = caseXLayoutElement(xLayoutElement);
				if (result == null) result = caseXLayoutDataElement(xLayoutElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XLAYOUT_DATA_ELEMENT: {
				XLayoutDataElement xLayoutDataElement = (XLayoutDataElement)theEObject;
				T result = caseXLayoutDataElement(xLayoutDataElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XLAYOUT_DATA: {
				XLayoutData xLayoutData = (XLayoutData)theEObject;
				T result = caseXLayoutData(xLayoutData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XLAYOUT: {
				XLayout xLayout = (XLayout)theEObject;
				T result = caseXLayout(xLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XGRID_DATA: {
				XGridData xGridData = (XGridData)theEObject;
				T result = caseXGridData(xGridData);
				if (result == null) result = caseXLayoutData(xGridData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XFILL_DATA: {
				XFillData xFillData = (XFillData)theEObject;
				T result = caseXFillData(xFillData);
				if (result == null) result = caseXLayoutData(xFillData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XROW_DATA: {
				XRowData xRowData = (XRowData)theEObject;
				T result = caseXRowData(xRowData);
				if (result == null) result = caseXLayoutData(xRowData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XGRID_LAYOUT: {
				XGridLayout xGridLayout = (XGridLayout)theEObject;
				T result = caseXGridLayout(xGridLayout);
				if (result == null) result = caseXLayout(xGridLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XFILL_LAYOUT: {
				XFillLayout xFillLayout = (XFillLayout)theEObject;
				T result = caseXFillLayout(xFillLayout);
				if (result == null) result = caseXLayout(xFillLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ModelPackage.XROW_LAYOUT: {
				XRowLayout xRowLayout = (XRowLayout)theEObject;
				T result = caseXRowLayout(xRowLayout);
				if (result == null) result = caseXLayout(xRowLayout);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
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
	 * Returns the result of interpreting the object as an instance of '<em>XLayout Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLayout Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLayoutData(XLayoutData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XLayout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XLayout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXLayout(XLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XGrid Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XGrid Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXGridData(XGridData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFill Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFill Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXFillData(XFillData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRow Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRow Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRowData(XRowData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XGrid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XGrid Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXGridLayout(XGridLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XFill Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XFill Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXFillLayout(XFillLayout object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XRow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XRow Layout</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXRowLayout(XRowLayout object) {
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

} //ModelSwitch
