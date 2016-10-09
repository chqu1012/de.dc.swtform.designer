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
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getSelection <em>Selection</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XSpinner#getIncrement <em>Increment</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_ReadOnly()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_Minimum()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMinimum();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(Integer value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * The default value is <code>"1000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_Maximum()
	 * @model default="1000" unique="false"
	 * @generated
	 */
	Integer getMaximum();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(Integer value);

	/**
	 * Returns the value of the '<em><b>Selection</b></em>' attribute.
	 * The default value is <code>"500"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' attribute.
	 * @see #setSelection(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_Selection()
	 * @model default="500" unique="false"
	 * @generated
	 */
	Integer getSelection();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getSelection <em>Selection</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' attribute.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Integer value);

	/**
	 * Returns the value of the '<em><b>Increment</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Increment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Increment</em>' attribute.
	 * @see #setIncrement(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXSpinner_Increment()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getIncrement();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XSpinner#getIncrement <em>Increment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Increment</em>' attribute.
	 * @see #getIncrement()
	 * @generated
	 */
	void setIncrement(Integer value);

} // XSpinner
