/**
 */
package de.dc.swtform.xcore.model;

import de.dc.swtform.layout.model.XLayout;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XLayout Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.model.XLayoutElement#getLayout <em>Layout</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.model.ModelPackage#getXLayoutElement()
 * @model abstract="true"
 * @generated
 */
public interface XLayoutElement extends XLayoutDataElement {
	/**
	 * Returns the value of the '<em><b>Layout</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Layout</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Layout</em>' containment reference.
	 * @see #setLayout(XLayout)
	 * @see de.dc.swtform.xcore.model.ModelPackage#getXLayoutElement_Layout()
	 * @model containment="true"
	 * @generated
	 */
	XLayout getLayout();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.model.XLayoutElement#getLayout <em>Layout</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Layout</em>' containment reference.
	 * @see #getLayout()
	 * @generated
	 */
	void setLayout(XLayout value);

} // XLayoutElement
