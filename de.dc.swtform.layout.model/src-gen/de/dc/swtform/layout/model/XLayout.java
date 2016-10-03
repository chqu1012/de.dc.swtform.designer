/**
 */
package de.dc.swtform.layout.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XLayout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.XLayout#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XLayout#getMarginWidth <em>Margin Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XLayout#getMarginHeight <em>Margin Height</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.layout.model.ModelPackage#getXLayout()
 * @model abstract="true"
 * @generated
 */
public interface XLayout extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXLayout_Name()
	 * @model unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XLayout#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Margin Width</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Width</em>' attribute.
	 * @see #setMarginWidth(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXLayout_MarginWidth()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginWidth();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XLayout#getMarginWidth <em>Margin Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Width</em>' attribute.
	 * @see #getMarginWidth()
	 * @generated
	 */
	void setMarginWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Margin Height</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Height</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Height</em>' attribute.
	 * @see #setMarginHeight(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXLayout_MarginHeight()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginHeight();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XLayout#getMarginHeight <em>Margin Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Height</em>' attribute.
	 * @see #getMarginHeight()
	 * @generated
	 */
	void setMarginHeight(Integer value);

} // XLayout
