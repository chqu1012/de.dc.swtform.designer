/**
 */
package de.dc.swtform.layout.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XLayout Data Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.XLayoutDataElement#getLayoutData <em>Layout Data</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.layout.model.ModelPackage#getXLayoutDataElement()
 * @model abstract="true"
 * @generated
 */
public interface XLayoutDataElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Layout Data</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout Data</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout Data</em>' containment reference.
	 * @see #setLayoutData(XLayoutData)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXLayoutDataElement_LayoutData()
	 * @model containment="true"
	 * @generated
	 */
	XLayoutData getLayoutData();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XLayoutDataElement#getLayoutData <em>Layout Data</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout Data</em>' containment reference.
	 * @see #getLayoutData()
	 * @generated
	 */
	void setLayoutData(XLayoutData value);

} // XLayoutDataElement
