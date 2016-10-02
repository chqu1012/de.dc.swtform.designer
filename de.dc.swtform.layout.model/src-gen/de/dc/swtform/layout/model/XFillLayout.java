/**
 */
package de.dc.swtform.layout.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XFill Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.XFillLayout#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XFillLayout#getSpacing <em>Spacing</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.layout.model.ModelPackage#getXFillLayout()
 * @model
 * @generated
 */
public interface XFillLayout extends XLayout {
	/**
	 * Returns the value of the '<em><b>Typ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Typ</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Typ</em>' attribute.
	 * @see #setTyp(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXFillLayout_Typ()
	 * @model unique="false"
	 * @generated
	 */
	Integer getTyp();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XFillLayout#getTyp <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Typ</em>' attribute.
	 * @see #getTyp()
	 * @generated
	 */
	void setTyp(Integer value);

	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXFillLayout_Spacing()
	 * @model unique="false"
	 * @generated
	 */
	Integer getSpacing();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XFillLayout#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(Integer value);

} // XFillLayout
