/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTable Viewer Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewerColumn()
 * @model
 * @generated
 */
public interface XTableViewerColumn extends XWidget {
	/**
	 * Returns the value of the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alignment</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alignment</em>' attribute.
	 * @see #setAlignment(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewerColumn_Alignment()
	 * @model unique="false"
	 * @generated
	 */
	Integer getAlignment();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getAlignment <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Alignment</em>' attribute.
	 * @see #getAlignment()
	 * @generated
	 */
	void setAlignment(Integer value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * The default value is <code>"100"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewerColumn_Size()
	 * @model default="100" unique="false"
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewerColumn#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

} // XTableViewerColumn
