/**
 */
package de.dc.swtform.xcore.widget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XLabel Combo</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XLabelCombo#getComboWidth <em>Combo Width</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XLabelCombo#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XLabelCombo#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabelCombo()
 * @model
 * @generated
 */
public interface XLabelCombo extends XWidget {
	/**
	 * Returns the value of the '<em><b>Combo Width</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Combo Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combo Width</em>' attribute.
	 * @see #setComboWidth(int)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabelCombo_ComboWidth()
	 * @model default="100" unique="false"
	 * @generated
	 */
	int getComboWidth();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XLabelCombo#getComboWidth <em>Combo Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Combo Width</em>' attribute.
	 * @see #getComboWidth()
	 * @generated
	 */
	void setComboWidth(int value);

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
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabelCombo_ReadOnly()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isReadOnly();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XLabelCombo#isReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #isReadOnly()
	 * @generated
	 */
	void setReadOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XComboItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXLabelCombo_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<XComboItem> getItems();

} // XLabelCombo
