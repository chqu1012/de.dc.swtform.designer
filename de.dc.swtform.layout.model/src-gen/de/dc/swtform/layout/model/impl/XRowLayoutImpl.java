/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XRowLayout;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XRow Layout</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getTyp <em>Typ</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getWrap <em>Wrap</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getPack <em>Pack</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getFill <em>Fill</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getCenter <em>Center</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getJustify <em>Justify</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getMarginLeft <em>Margin Left</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getMarginTop <em>Margin Top</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getMarginRight <em>Margin Right</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XRowLayoutImpl#getMarginBottom <em>Margin Bottom</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XRowLayoutImpl extends XLayoutImpl implements XRowLayout {
	/**
	 * The default value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TYP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTyp() <em>Typ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyp()
	 * @generated
	 * @ordered
	 */
	protected Integer typ = TYP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected Integer spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean WRAP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWrap() <em>Wrap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWrap()
	 * @generated
	 * @ordered
	 */
	protected Boolean wrap = WRAP_EDEFAULT;

	/**
	 * The default value of the '{@link #getPack() <em>Pack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPack()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PACK_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPack() <em>Pack</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPack()
	 * @generated
	 * @ordered
	 */
	protected Boolean pack = PACK_EDEFAULT;

	/**
	 * The default value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FILL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFill() <em>Fill</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFill()
	 * @generated
	 * @ordered
	 */
	protected Boolean fill = FILL_EDEFAULT;

	/**
	 * The default value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean CENTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCenter() <em>Center</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCenter()
	 * @generated
	 * @ordered
	 */
	protected Boolean center = CENTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustify()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean JUSTIFY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJustify() <em>Justify</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJustify()
	 * @generated
	 * @ordered
	 */
	protected Boolean justify = JUSTIFY_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XRowLayoutImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XROW_LAYOUT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTyp() {
		return typ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTyp(Integer newTyp) {
		Integer oldTyp = typ;
		typ = newTyp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__TYP, oldTyp, typ));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(Integer newSpacing) {
		Integer oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getWrap() {
		return wrap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWrap(Boolean newWrap) {
		Boolean oldWrap = wrap;
		wrap = newWrap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__WRAP, oldWrap, wrap));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getPack() {
		return pack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPack(Boolean newPack) {
		Boolean oldPack = pack;
		pack = newPack;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__PACK, oldPack, pack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getFill() {
		return fill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFill(Boolean newFill) {
		Boolean oldFill = fill;
		fill = newFill;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__FILL, oldFill, fill));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getCenter() {
		return center;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCenter(Boolean newCenter) {
		Boolean oldCenter = center;
		center = newCenter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__CENTER, oldCenter, center));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getJustify() {
		return justify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJustify(Boolean newJustify) {
		Boolean oldJustify = justify;
		justify = newJustify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__JUSTIFY, oldJustify, justify));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__MARGIN_LEFT, oldMarginLeft, marginLeft));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__MARGIN_TOP, oldMarginTop, marginTop));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__MARGIN_RIGHT, oldMarginRight, marginRight));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM, oldMarginBottom, marginBottom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XROW_LAYOUT__TYP:
				return getTyp();
			case ModelPackage.XROW_LAYOUT__SPACING:
				return getSpacing();
			case ModelPackage.XROW_LAYOUT__WRAP:
				return getWrap();
			case ModelPackage.XROW_LAYOUT__PACK:
				return getPack();
			case ModelPackage.XROW_LAYOUT__FILL:
				return getFill();
			case ModelPackage.XROW_LAYOUT__CENTER:
				return getCenter();
			case ModelPackage.XROW_LAYOUT__JUSTIFY:
				return getJustify();
			case ModelPackage.XROW_LAYOUT__MARGIN_LEFT:
				return getMarginLeft();
			case ModelPackage.XROW_LAYOUT__MARGIN_TOP:
				return getMarginTop();
			case ModelPackage.XROW_LAYOUT__MARGIN_RIGHT:
				return getMarginRight();
			case ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM:
				return getMarginBottom();
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
			case ModelPackage.XROW_LAYOUT__TYP:
				setTyp((Integer)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__SPACING:
				setSpacing((Integer)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__WRAP:
				setWrap((Boolean)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__PACK:
				setPack((Boolean)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__FILL:
				setFill((Boolean)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__CENTER:
				setCenter((Boolean)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__JUSTIFY:
				setJustify((Boolean)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_LEFT:
				setMarginLeft((Integer)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_TOP:
				setMarginTop((Integer)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_RIGHT:
				setMarginRight((Integer)newValue);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom((Integer)newValue);
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
			case ModelPackage.XROW_LAYOUT__TYP:
				setTyp(TYP_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__WRAP:
				setWrap(WRAP_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__PACK:
				setPack(PACK_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__FILL:
				setFill(FILL_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__CENTER:
				setCenter(CENTER_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__JUSTIFY:
				setJustify(JUSTIFY_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_LEFT:
				setMarginLeft(MARGIN_LEFT_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_TOP:
				setMarginTop(MARGIN_TOP_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_RIGHT:
				setMarginRight(MARGIN_RIGHT_EDEFAULT);
				return;
			case ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM:
				setMarginBottom(MARGIN_BOTTOM_EDEFAULT);
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
			case ModelPackage.XROW_LAYOUT__TYP:
				return TYP_EDEFAULT == null ? typ != null : !TYP_EDEFAULT.equals(typ);
			case ModelPackage.XROW_LAYOUT__SPACING:
				return SPACING_EDEFAULT == null ? spacing != null : !SPACING_EDEFAULT.equals(spacing);
			case ModelPackage.XROW_LAYOUT__WRAP:
				return WRAP_EDEFAULT == null ? wrap != null : !WRAP_EDEFAULT.equals(wrap);
			case ModelPackage.XROW_LAYOUT__PACK:
				return PACK_EDEFAULT == null ? pack != null : !PACK_EDEFAULT.equals(pack);
			case ModelPackage.XROW_LAYOUT__FILL:
				return FILL_EDEFAULT == null ? fill != null : !FILL_EDEFAULT.equals(fill);
			case ModelPackage.XROW_LAYOUT__CENTER:
				return CENTER_EDEFAULT == null ? center != null : !CENTER_EDEFAULT.equals(center);
			case ModelPackage.XROW_LAYOUT__JUSTIFY:
				return JUSTIFY_EDEFAULT == null ? justify != null : !JUSTIFY_EDEFAULT.equals(justify);
			case ModelPackage.XROW_LAYOUT__MARGIN_LEFT:
				return MARGIN_LEFT_EDEFAULT == null ? marginLeft != null : !MARGIN_LEFT_EDEFAULT.equals(marginLeft);
			case ModelPackage.XROW_LAYOUT__MARGIN_TOP:
				return MARGIN_TOP_EDEFAULT == null ? marginTop != null : !MARGIN_TOP_EDEFAULT.equals(marginTop);
			case ModelPackage.XROW_LAYOUT__MARGIN_RIGHT:
				return MARGIN_RIGHT_EDEFAULT == null ? marginRight != null : !MARGIN_RIGHT_EDEFAULT.equals(marginRight);
			case ModelPackage.XROW_LAYOUT__MARGIN_BOTTOM:
				return MARGIN_BOTTOM_EDEFAULT == null ? marginBottom != null : !MARGIN_BOTTOM_EDEFAULT.equals(marginBottom);
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
		result.append(" (typ: ");
		result.append(typ);
		result.append(", spacing: ");
		result.append(spacing);
		result.append(", wrap: ");
		result.append(wrap);
		result.append(", pack: ");
		result.append(pack);
		result.append(", fill: ");
		result.append(fill);
		result.append(", center: ");
		result.append(center);
		result.append(", justify: ");
		result.append(justify);
		result.append(", marginLeft: ");
		result.append(marginLeft);
		result.append(", marginTop: ");
		result.append(marginTop);
		result.append(", marginRight: ");
		result.append(marginRight);
		result.append(", marginBottom: ");
		result.append(marginBottom);
		result.append(')');
		return result.toString();
	}

} //XRowLayoutImpl
