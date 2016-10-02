/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XSpinner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getPageIncrement <em>Page Increment</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getDigits <em>Digits</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner()
 * @model
 * @generated
 */
public interface XSpinner extends XWidget {
	/**
	 * Returns the value of the '<em><b>Page Increment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Page Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page Increment</em>' attribute.
	 * @see #setPageIncrement(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_PageIncrement()
	 * @model unique="false"
	 * @generated
	 */
	Integer getPageIncrement();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getPageIncrement <em>Page Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Increment</em>' attribute.
	 * @see #getPageIncrement()
	 * @generated
	 */
	void setPageIncrement(Integer value);

	/**
	 * Returns the value of the '<em><b>Digits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Digits</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Digits</em>' attribute.
	 * @see #setDigits(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_Digits()
	 * @model unique="false"
	 * @generated
	 */
	Integer getDigits();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getDigits <em>Digits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Digits</em>' attribute.
	 * @see #getDigits()
	 * @generated
	 */
	void setDigits(Integer value);

} // XSpinner
