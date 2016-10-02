/**
 */
package de.dc.swtform.xcore.widget;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XViewer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XViewer#getLabelProvider <em>Label Provider</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XViewer#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXViewer()
 * @model abstract="true"
 * @generated
 */
public interface XViewer extends XWidget {
	/**
	 * Returns the value of the '<em><b>Label Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label Provider</em>' containment reference.
	 * @see #setLabelProvider(XLabelProvider)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXViewer_LabelProvider()
	 * @model containment="true"
	 * @generated
	 */
	XLabelProvider getLabelProvider();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XViewer#getLabelProvider <em>Label Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label Provider</em>' containment reference.
	 * @see #getLabelProvider()
	 * @generated
	 */
	void setLabelProvider(XLabelProvider value);

	/**
	 * Returns the value of the '<em><b>Content Provider</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Content Provider</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Content Provider</em>' containment reference.
	 * @see #setContentProvider(XContentProvider)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXViewer_ContentProvider()
	 * @model containment="true"
	 * @generated
	 */
	XContentProvider getContentProvider();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XViewer#getContentProvider <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Content Provider</em>' containment reference.
	 * @see #getContentProvider()
	 * @generated
	 */
	void setContentProvider(XContentProvider value);

} // XViewer
