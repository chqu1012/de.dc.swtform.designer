/**
 */
package de.dc.swtform.xcore.widget;

import de.dc.swtform.layout.model.XLayoutDataElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XWidget</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XWidget#getName <em>Name</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XWidget#getText <em>Text</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XWidget#getData <em>Data</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XWidget#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXWidget()
 * @model abstract="true"
 * @generated
 */
public interface XWidget extends XLayoutDataElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXWidget_Name()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XWidget#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXWidget_Text()
	 * @model unique="false"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XWidget#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' attribute.
	 * @see #setData(Object)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXWidget_Data()
	 * @model unique="false"
	 * @generated
	 */
	Object getData();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XWidget#getData <em>Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data</em>' attribute.
	 * @see #getData()
	 * @generated
	 */
	void setData(Object value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXWidget_Message()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XWidget#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

} // XWidget
