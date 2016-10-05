/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XLabel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XLabel#getWidth <em>Width</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabel()
 * @model
 * @generated
 */
public interface XLabel extends XWidget, ISelectable {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabel_Width()
	 * @model default="100" unique="false"
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XLabel#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

} // XLabel
