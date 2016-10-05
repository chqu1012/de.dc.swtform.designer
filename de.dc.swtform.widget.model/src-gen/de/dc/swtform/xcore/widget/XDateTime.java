/**
 */
package de.dc.swtform.xcore.widget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDate Time</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XDateTime#getDateTimeType <em>Date Time Type</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDateTime()
 * @model
 * @generated
 */
public interface XDateTime extends XWidget, ISelectable {
	/**
	 * Returns the value of the '<em><b>Date Time Type</b></em>' attribute list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XDateTimeType}.
	 * The literals are from the enumeration {@link de.dc.swtform.xcore.widget.XDateTimeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Time Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Time Type</em>' attribute list.
	 * @see de.dc.swtform.xcore.widget.XDateTimeType
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDateTime_DateTimeType()
	 * @model unique="false"
	 * @generated
	 */
	EList<XDateTimeType> getDateTimeType();

} // XDateTime
