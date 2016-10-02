/**
 */
package de.dc.swtform.xcore.widget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTable Viewer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getShowBorder <em>Show Border</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getVerticalScroll <em>Vertical Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getHorizontalScroll <em>Horizontal Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer()
 * @model
 * @generated
 */
public interface XTableViewer extends XViewer {
	/**
	 * Returns the value of the '<em><b>Show Header</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Header</em>' attribute.
	 * @see #setShowHeader(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowHeader()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowHeader();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowHeader <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Header</em>' attribute.
	 * @see #getShowHeader()
	 * @generated
	 */
	void setShowHeader(Boolean value);

	/**
	 * Returns the value of the '<em><b>Show Lines</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Lines</em>' attribute.
	 * @see #setShowLines(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowLines()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowLines();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowLines <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lines</em>' attribute.
	 * @see #getShowLines()
	 * @generated
	 */
	void setShowLines(Boolean value);

	/**
	 * Returns the value of the '<em><b>Show Border</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Border</em>' attribute.
	 * @see #setShowBorder(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowBorder()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getShowBorder();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#getShowBorder <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Border</em>' attribute.
	 * @see #getShowBorder()
	 * @generated
	 */
	void setShowBorder(Boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Scroll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Scroll</em>' attribute.
	 * @see #setVerticalScroll(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_VerticalScroll()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getVerticalScroll();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#getVerticalScroll <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Scroll</em>' attribute.
	 * @see #getVerticalScroll()
	 * @generated
	 */
	void setVerticalScroll(Boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Scroll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Scroll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Scroll</em>' attribute.
	 * @see #setHorizontalScroll(Boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_HorizontalScroll()
	 * @model unique="false"
	 * @generated
	 */
	Boolean getHorizontalScroll();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#getHorizontalScroll <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Scroll</em>' attribute.
	 * @see #getHorizontalScroll()
	 * @generated
	 */
	void setHorizontalScroll(Boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XTableViewerColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTableViewerColumn> getColumns();

} // XTableViewer
