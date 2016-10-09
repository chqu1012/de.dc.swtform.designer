/**
 */
package de.dc.swtform.xcore.widget;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XTree Viewer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.xcore.widget.XTreeViewer#isShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTreeViewer#isShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTreeViewer#isHasFilter <em>Has Filter</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTreeViewer#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTreeViewer()
 * @model
 * @generated
 */
public interface XTreeViewer extends XViewer {
	/**
	 * Returns the value of the '<em><b>Show Header</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Header</em>' attribute.
	 * @see #setShowHeader(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTreeViewer_ShowHeader()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowHeader();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTreeViewer#isShowHeader <em>Show Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Header</em>' attribute.
	 * @see #isShowHeader()
	 * @generated
	 */
	void setShowHeader(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Lines</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Lines</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Lines</em>' attribute.
	 * @see #setShowLines(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTreeViewer_ShowLines()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowLines();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTreeViewer#isShowLines <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lines</em>' attribute.
	 * @see #isShowLines()
	 * @generated
	 */
	void setShowLines(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Filter</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Filter</em>' attribute.
	 * @see #setHasFilter(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTreeViewer_HasFilter()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isHasFilter();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTreeViewer#isHasFilter <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Filter</em>' attribute.
	 * @see #isHasFilter()
	 * @generated
	 */
	void setHasFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.swtform.xcore.widget.XTreeViewerColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Columns</em>' containment reference list.
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTreeViewer_Columns()
	 * @model containment="true"
	 * @generated
	 */
	EList<XTreeViewerColumn> getColumns();

} // XTreeViewer
