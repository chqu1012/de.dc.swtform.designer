/**
 */
package de.dc.swtform.xcore.model;

import de.dc.swtform.xcore.widget.XWidget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swt Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.model.SwtForm#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.model.SwtForm#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.model.ModelPackage#getSwtForm()
 * @model
 * @generated
 */
public interface SwtForm extends XNamedElement, XLayoutElement {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.swtform.xcore.model.ModelPackage#getSwtForm_PackagePath()
	 * @model default="" unique="false"
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.model.SwtForm#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XWidget}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Widgets</em>' containment reference list.
	 * @see de.dc.swtform.xcore.model.ModelPackage#getSwtForm_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<XWidget> getWidgets();

} // SwtForm
