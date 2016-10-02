/**
 */
package de.dc.swtform.xcore.widget;

import de.dc.swtform.layout.model.XLayoutElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XComposite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XComposite#getWidgets <em>Widgets</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XComposite#getViewers <em>Viewers</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XComposite#getComposites <em>Composites</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXComposite()
 * @model
 * @generated
 */
public interface XComposite extends XWidget, XLayoutElement {
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
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXComposite_Widgets()
	 * @model containment="true"
	 * @generated
	 */
	EList<XWidget> getWidgets();

	/**
	 * Returns the value of the '<em><b>Viewers</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XViewer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Viewers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Viewers</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXComposite_Viewers()
	 * @model containment="true"
	 * @generated
	 */
	EList<XViewer> getViewers();

	/**
	 * Returns the value of the '<em><b>Composites</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XComposite}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composites</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composites</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXComposite_Composites()
	 * @model containment="true"
	 * @generated
	 */
	EList<XComposite> getComposites();

} // XComposite
