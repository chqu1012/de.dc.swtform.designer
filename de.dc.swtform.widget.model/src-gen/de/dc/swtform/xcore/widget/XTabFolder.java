/**
 */
package de.dc.swtform.xcore.widget;

import de.dc.swtform.layout.model.XLayoutElement;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTab Folder</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XTabFolder#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTabFolder()
 * @model
 * @generated
 */
public interface XTabFolder extends XWidget, XLayoutElement {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XTabItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTabFolder_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTabItem> getItems();

} // XTabFolder
