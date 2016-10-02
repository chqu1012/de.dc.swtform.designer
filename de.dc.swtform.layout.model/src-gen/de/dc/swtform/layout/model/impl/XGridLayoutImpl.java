/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XGridLayout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XGrid Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getNumColumns <em>Num Columns</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getMakeColumnsEqualWidth <em>Make Columns Equal Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getHorizontalSpacing <em>Horizontal Spacing</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridLayoutImpl#getVerticalSpacing <em>Vertical Spacing</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XGridLayoutImpl extends XLayoutImpl implements XGridLayout {
	/**
	 * The default value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_COLUMNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumColumns() <em>Num Columns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumColumns()
	 * @generated
	 * @ordered
	 */
	protected Integer numColumns = NUM_COLUMNS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMakeColumnsEqualWidth() <em>Make Columns Equal Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMakeColumnsEqualWidth()
	 * @generated
	 * @ordered
	 */
	protected Boolean makeColumnsEqualWidth = MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_LEFT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginLeft() <em>Margin Left</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginLeft()
	 * @generated
	 * @ordered
	 */
	protected Integer marginLeft = MARGIN_LEFT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_TOP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginTop() <em>Margin Top</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginTop()
	 * @generated
	 * @ordered
	 */
	protected Integer marginTop = MARGIN_TOP_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_RIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginRight() <em>Margin Right</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginRight()
	 * @generated
	 * @ordered
	 */
	protected Integer marginRight = MARGIN_RIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MARGIN_BOTTOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMarginBottom() <em>Margin Bottom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMarginBottom()
	 * @generated
	 * @ordered
	 */
	protected Integer marginBottom = MARGIN_BOTTOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalSpacing() <em>Horizontal Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpacing()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalSpacing = HORIZONTAL_SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalSpacing() <em>Vertical Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpacing()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalSpacing = VERTICAL_SPACING_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XGridLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XGRID_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumColumns() {
		return numColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumColumns(Integer newNumColumns) {
		Integer oldNumColumns = numColumns;
		numColumns = newNumColumns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__NUM_COLUMNS, oldNumColumns, numColumns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getMakeColumnsEqualWidth() {
		return makeColumnsEqualWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMakeColumnsEqualWidth(Boolean newMakeColumnsEqualWidth) {
		Boolean oldMakeColumnsEqualWidth = makeColumnsEqualWidth;
		makeColumnsEqualWidth = newMakeColumnsEqualWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH, oldMakeColumnsEqualWidth, makeColumnsEqualWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginLeft() {
		return marginLeft;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginLeft(Integer newMarginLeft) {
		Integer oldMarginLeft = marginLeft;
		marginLeft = newMarginLeft;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__MARGIN_LEFT, oldMarginLeft, marginLeft));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginTop() {
		return marginTop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginTop(Integer newMarginTop) {
		Integer oldMarginTop = marginTop;
		marginTop = newMarginTop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__MARGIN_TOP, oldMarginTop, marginTop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginRight() {
		return marginRight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginRight(Integer newMarginRight) {
		Integer oldMarginRight = marginRight;
		marginRight = newMarginRight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT, oldMarginRight, marginRight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMarginBottom() {
		return marginBottom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMarginBottom(Integer newMarginBottom) {
		Integer oldMarginBottom = marginBottom;
		marginBottom = newMarginBottom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalSpacing() {
		return horizontalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpacing(Integer newHorizontalSpacing) {
		Integer oldHorizontalSpacing = horizontalSpacing;
		horizontalSpacing = newHorizontalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING, oldHorizontalSpacing, horizontalSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalSpacing() {
		return verticalSpacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpacing(Integer newVerticalSpacing) {
		Integer oldVerticalSpacing = verticalSpacing;
		verticalSpacing = newVerticalSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING, oldVerticalSpacing, verticalSpacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XGRID_LAYOUT__NUM_COLUMNS:
				return getNumColumns();
			case ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return getMakeColumnsEqualWidth();
			case ModelPackage.XGRID_LAYOUT__MARGIN_LEFT:
				return getMarginLeft();
			case ModelPackage.XGRID_LAYOUT__MARGIN_TOP:
				return getMarginTop();
			case ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT:
				return getMarginRight();
			case ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM:
				return getMarginBottom();
			case ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING:
				return getHorizontalSpacing();
			case ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING:
				return getVerticalSpacing();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModelPackage.XGRID_LAYOUT__NUM_COLUMNS:
				setNumColumns((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				setMakeColumnsEqualWidth((Boolean)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING:
				setHorizontalSpacing((Integer)newValue);
				return;
			case ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING:
				setVerticalSpacing((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModelPackage.XGRID_LAYOUT__NUM_COLUMNS:
				setNumColumns(NUM_COLUMNS_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				setMakeColumnsEqualWidth(MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING:
				setHorizontalSpacing(HORIZONTAL_SPACING_EDEFAULT);
				return;
			case ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING:
				setVerticalSpacing(VERTICAL_SPACING_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModelPackage.XGRID_LAYOUT__NUM_COLUMNS:
				return NUM_COLUMNS_EDEFAULT == null ? numColumns != null : !NUM_COLUMNS_EDEFAULT.equals(numColumns);
			case ModelPackage.XGRID_LAYOUT__MAKE_COLUMNS_EQUAL_WIDTH:
				return MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT == null ? makeColumnsEqualWidth != null : !MAKE_COLUMNS_EQUAL_WIDTH_EDEFAULT.equals(makeColumnsEqualWidth);
			case ModelPackage.XGRID_LAYOUT__MARGIN_LEFT:
				return MARGIN_LEFT_EDEFAULT == null ? marginLeft != null : !MARGIN_LEFT_EDEFAULT.equals(marginLeft);
			case ModelPackage.XGRID_LAYOUT__MARGIN_TOP:
				return MARGIN_TOP_EDEFAULT == null ? marginTop != null : !MARGIN_TOP_EDEFAULT.equals(marginTop);
			case ModelPackage.XGRID_LAYOUT__MARGIN_RIGHT:
				return MARGIN_RIGHT_EDEFAULT == null ? marginRight != null : !MARGIN_RIGHT_EDEFAULT.equals(marginRight);
			case ModelPackage.XGRID_LAYOUT__MARGIN_BOTTOM:
				return MARGIN_BOTTOM_EDEFAULT == null ? marginBottom != null : !MARGIN_BOTTOM_EDEFAULT.equals(marginBottom);
			case ModelPackage.XGRID_LAYOUT__HORIZONTAL_SPACING:
				return HORIZONTAL_SPACING_EDEFAULT == null ? horizontalSpacing != null : !HORIZONTAL_SPACING_EDEFAULT.equals(horizontalSpacing);
			case ModelPackage.XGRID_LAYOUT__VERTICAL_SPACING:
				return VERTICAL_SPACING_EDEFAULT == null ? verticalSpacing != null : !VERTICAL_SPACING_EDEFAULT.equals(verticalSpacing);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (numColumns: ");
		result.append(numColumns);
		result.append(", makeColumnsEqualWidth: ");
		result.append(makeColumnsEqualWidth);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", marginRight: ");
		result.append(marginRight);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(", horizontalSpacing: ");
		result.append(horizontalSpacing);
		result.append(", verticalSpacing: ");
		result.append(verticalSpacing);
		result.append(')');
		return result.toString();
	}

} //XGridLayoutImpl
