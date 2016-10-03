/**
 */
package de.dc.swtform.layout.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XGrid Layout</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.XGridLayout#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 *
 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout()
 * @model
 * @generated
 */
public interface XGridLayout extends XLayout {
	/**
	 * Returns the value of the '<em><b>Num Columns</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Columns</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Columns</em>' attribute.
	 * @see #setNumColumns(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_NumColumns()
	 * @model default="1" unique="false"
	 * @generated
	 */
	Integer getNumColumns();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getNumColumns <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Columns</em>' attribute.
	 * @see #getNumColumns()
	 * @generated
	 */
	void setNumColumns(Integer value);

	/**
	 * Returns the value of the '<em><b>Make Columns Equal Width</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Make Columns Equal Width</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #setMakeColumnsEqualWidth(Boolean)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_MakeColumnsEqualWidth()
	 * @model default="false" unique="false"
	 * @generated
	 */
	Boolean getMakeColumnsEqualWidth();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Make Columns Equal Width</em>' attribute.
	 * @see #getMakeColumnsEqualWidth()
	 * @generated
	 */
	void setMakeColumnsEqualWidth(Boolean value);

	/**
	 * Returns the value of the '<em><b>Margin Left</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Left</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Left</em>' attribute.
	 * @see #setMarginLeft(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_MarginLeft()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginLeft();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getMarginLeft <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Left</em>' attribute.
	 * @see #getMarginLeft()
	 * @generated
	 */
	void setMarginLeft(Integer value);

	/**
	 * Returns the value of the '<em><b>Margin Top</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Top</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Top</em>' attribute.
	 * @see #setMarginTop(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_MarginTop()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginTop();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getMarginTop <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Top</em>' attribute.
	 * @see #getMarginTop()
	 * @generated
	 */
	void setMarginTop(Integer value);

	/**
	 * Returns the value of the '<em><b>Margin Right</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Right</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Right</em>' attribute.
	 * @see #setMarginRight(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_MarginRight()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginRight();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getMarginRight <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Right</em>' attribute.
	 * @see #getMarginRight()
	 * @generated
	 */
	void setMarginRight(Integer value);

	/**
	 * Returns the value of the '<em><b>Margin Bottom</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Margin Bottom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Margin Bottom</em>' attribute.
	 * @see #setMarginBottom(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_MarginBottom()
	 * @model default="0" unique="false"
	 * @generated
	 */
	Integer getMarginBottom();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getMarginBottom <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Margin Bottom</em>' attribute.
	 * @see #getMarginBottom()
	 * @generated
	 */
	void setMarginBottom(Integer value);

	/**
	 * Returns the value of the '<em><b>Horizontal Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Horizontal Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #setHorizontalSpacing(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_HorizontalSpacing()
	 * @model unique="false"
	 * @generated
	 */
	Integer getHorizontalSpacing();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getHorizontalSpacing <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Horizontal Spacing</em>' attribute.
	 * @see #getHorizontalSpacing()
	 * @generated
	 */
	void setHorizontalSpacing(Integer value);

	/**
	 * Returns the value of the '<em><b>Vertical Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vertical Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #setVerticalSpacing(Integer)
	 * @see de.dc.swtform.layout.model.ModelPackage#getXGridLayout_VerticalSpacing()
	 * @model unique="false"
	 * @generated
	 */
	Integer getVerticalSpacing();

	/**
	 * Sets the value of the '{@link de.dc.swtform.layout.model.XGridLayout#getVerticalSpacing <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Spacing</em>' attribute.
	 * @see #getVerticalSpacing()
	 * @generated
	 */
	void setVerticalSpacing(Integer value);

} // XGridLayout
