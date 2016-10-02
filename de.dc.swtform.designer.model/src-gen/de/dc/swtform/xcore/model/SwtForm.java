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
 *   <li>{@link de.dc.swtform.xcore.model.SwtForm#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.model.ModelPackage#getSwtForm()
 * @model
 * @generated
 */
public interface SwtForm extends XNamedElement, XLayoutElement {
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
