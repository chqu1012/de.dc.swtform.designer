/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDialog Text</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XDialogText#getPath <em>Path</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XDialogText#getDialogType <em>Dialog Type</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDialogText()
 * @model
 * @generated
 */
public interface XDialogText extends XWidget {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDialogText_Path()
	 * @model unique="false"
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XDialogText#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Dialog Type</b></em>' attribute.
	 * The literals are from the enumeration {@link de.dc.swtform.xcore.widget.XDialogType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dialog Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dialog Type</em>' attribute.
	 * @see de.dc.swtform.xcore.widget.XDialogType
	 * @see #setDialogType(XDialogType)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDialogText_DialogType()
	 * @model unique="false"
	 * @generated
	 */
	XDialogType getDialogType();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XDialogText#getDialogType <em>Dialog Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dialog Type</em>' attribute.
	 * @see de.dc.swtform.xcore.widget.XDialogType
	 * @see #getDialogType()
	 * @generated
	 */
	void setDialogType(XDialogType value);

} // XDialogText
