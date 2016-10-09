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
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isShowHeader <em>Show Header</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isShowLines <em>Show Lines</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isShowBorder <em>Show Border</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isVerticalScroll <em>Vertical Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isHorizontalScroll <em>Horizontal Scroll</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isHasSearch <em>Has Search</em>}</li>
 *   <li>{@link de.dc.swtform.xcore.widget.XTableViewer#isHasSorter <em>Has Sorter</em>}</li>
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
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Header</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Header</em>' attribute.
	 * @see #setShowHeader(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowHeader()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowHeader();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isShowHeader <em>Show Header</em>}' attribute.
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
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowLines()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowLines();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isShowLines <em>Show Lines</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Lines</em>' attribute.
	 * @see #isShowLines()
	 * @generated
	 */
	void setShowLines(boolean value);

	/**
	 * Returns the value of the '<em><b>Show Border</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Border</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Border</em>' attribute.
	 * @see #setShowBorder(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_ShowBorder()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isShowBorder();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isShowBorder <em>Show Border</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Border</em>' attribute.
	 * @see #isShowBorder()
	 * @generated
	 */
	void setShowBorder(boolean value);

	/**
	 * Returns the value of the '<em><b>Vertical Scroll</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Scroll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Scroll</em>' attribute.
	 * @see #setVerticalScroll(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_VerticalScroll()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isVerticalScroll();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isVerticalScroll <em>Vertical Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Scroll</em>' attribute.
	 * @see #isVerticalScroll()
	 * @generated
	 */
	void setVerticalScroll(boolean value);

	/**
	 * Returns the value of the '<em><b>Horizontal Scroll</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Scroll</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Scroll</em>' attribute.
	 * @see #setHorizontalScroll(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_HorizontalScroll()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isHorizontalScroll();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isHorizontalScroll <em>Horizontal Scroll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Scroll</em>' attribute.
	 * @see #isHorizontalScroll()
	 * @generated
	 */
	void setHorizontalScroll(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Search</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Search</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Search</em>' attribute.
	 * @see #setHasSearch(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_HasSearch()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isHasSearch();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isHasSearch <em>Has Search</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Search</em>' attribute.
	 * @see #isHasSearch()
	 * @generated
	 */
	void setHasSearch(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Sorter</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sorter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sorter</em>' attribute.
	 * @see #setHasSorter(boolean)
	 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXTableViewer_HasSorter()
	 * @model default="true" unique="false"
	 * @generated
	 */
	boolean isHasSorter();

	/**
	 * Sets the value of the '{@link de.dc.swtform.xcore.widget.XTableViewer#isHasSorter <em>Has Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Sorter</em>' attribute.
	 * @see #isHasSorter()
	 * @generated
	 */
	void setHasSorter(boolean value);

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
