/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XButton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XButton#getIsSelected <em>Is Selected</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXButton()
 * @model
 * @generated
 */
public interface XButton extends XWidget, ISelectable {
	/**
	 * Returns the value of the '<em><b>Is Selected</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Selected</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Selected</em>' attribute.
	 * @see #setIsSelected(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXButton_IsSelected()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getIsSelected();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XButton#getIsSelected <em>Is Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Selected</em>' attribute.
	 * @see #getIsSelected()
	 * @generated
	 */
	void setIsSelected(Boolean value);

} // XButton
