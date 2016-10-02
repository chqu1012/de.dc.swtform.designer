/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XUnit Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XUnitLabel#getValue <em>Value</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XUnitLabel#getUnit <em>Unit</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XUnitLabel#getLabelWidth <em>Label Width</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXUnitLabel()
 * @model
 * @generated
 */
public interface XUnitLabel extends XWidget {
	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXUnitLabel_Value()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getValue();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XUnitLabel#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(String value);

	/**
	 * Returns the value of the '<em><b>Unit</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit</em>' attribute.
	 * @see #setUnit(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXUnitLabel_Unit()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getUnit();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XUnitLabel#getUnit <em>Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unit</em>' attribute.
	 * @see #getUnit()
	 * @generated
	 */
	void setUnit(String value);

	/**
	 * Returns the value of the '<em><b>Label Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Width</em>' attribute.
	 * @see #setLabelWidth(int)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXUnitLabel_LabelWidth()
	 * @model default="100" unique="false"
	 * @generated
	 */
	int getLabelWidth();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XUnitLabel#getLabelWidth <em>Label Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Width</em>' attribute.
	 * @see #getLabelWidth()
	 * @generated
	 */
	void setLabelWidth(int value);

} // XUnitLabel
