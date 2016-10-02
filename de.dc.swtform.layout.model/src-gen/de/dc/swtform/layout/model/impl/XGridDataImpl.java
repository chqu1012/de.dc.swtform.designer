/**
 */
package de.dc.swtform.layout.model.impl;

import de.dc.swtform.layout.model.ModelPackage;
import de.dc.swtform.layout.model.XGridData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XGrid Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getVerticalAlignment <em>Vertical Alignment</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getHorizontalAlignment <em>Horizontal Alignment</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getWidthHint <em>Width Hint</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getHeightHint <em>Height Hint</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getHorizontalIndent <em>Horizontal Indent</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getVerticalIndent <em>Vertical Indent</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getHorizontalSpan <em>Horizontal Span</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getVerticalSpan <em>Vertical Span</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getGrabExcessHorizontalSpace <em>Grab Excess Horizontal Space</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getGrabExcessVerticalSpace <em>Grab Excess Vertical Space</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getMinimumWidth <em>Minimum Width</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getMinimumHeight <em>Minimum Height</em>}</li>
 *   <li>{@link de.dc.swtform.layout.model.impl.XGridDataImpl#getExclude <em>Exclude</em>}</li>
 * </ul>
 *
 * @generated
 */
public class XGridDataImpl extends XLayoutDataImpl implements XGridData {
	/**
	 * The default value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalAlignment() <em>Vertical Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalAlignment = VERTICAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_ALIGNMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalAlignment() <em>Horizontal Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalAlignment()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalAlignment = HORIZONTAL_ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWidthHint() <em>Width Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidthHint()
	 * @generated
	 * @ordered
	 */
	protected Integer widthHint = WIDTH_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightHint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_HINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeightHint() <em>Height Hint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeightHint()
	 * @generated
	 * @ordered
	 */
	protected Integer heightHint = HEIGHT_HINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalIndent() <em>Horizontal Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalIndent()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalIndent = HORIZONTAL_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalIndent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_INDENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalIndent() <em>Vertical Indent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalIndent()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalIndent = VERTICAL_INDENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HORIZONTAL_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHorizontalSpan() <em>Horizontal Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHorizontalSpan()
	 * @generated
	 * @ordered
	 */
	protected Integer horizontalSpan = HORIZONTAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VERTICAL_SPAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVerticalSpan() <em>Vertical Span</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalSpan()
	 * @generated
	 * @ordered
	 */
	protected Integer verticalSpan = VERTICAL_SPAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrabExcessHorizontalSpace() <em>Grab Excess Horizontal Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrabExcessHorizontalSpace()
	 * @generated
	 * @ordered
	 */
	protected Boolean grabExcessHorizontalSpace = GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrabExcessVerticalSpace() <em>Grab Excess Vertical Space</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrabExcessVerticalSpace()
	 * @generated
	 * @ordered
	 */
	protected Boolean grabExcessVerticalSpace = GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumWidth() <em>Minimum Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer minimumWidth = MINIMUM_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MINIMUM_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinimumHeight() <em>Minimum Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer minimumHeight = MINIMUM_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean EXCLUDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExclude() <em>Exclude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExclude()
	 * @generated
	 * @ordered
	 */
	protected Boolean exclude = EXCLUDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XGridDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModelPackage.Literals.XGRID_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalAlignment() {
		return verticalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalAlignment(Integer newVerticalAlignment) {
		Integer oldVerticalAlignment = verticalAlignment;
		verticalAlignment = newVerticalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT, oldVerticalAlignment, verticalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalAlignment() {
		return horizontalAlignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalAlignment(Integer newHorizontalAlignment) {
		Integer oldHorizontalAlignment = horizontalAlignment;
		horizontalAlignment = newHorizontalAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT, oldHorizontalAlignment, horizontalAlignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWidthHint() {
		return widthHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidthHint(Integer newWidthHint) {
		Integer oldWidthHint = widthHint;
		widthHint = newWidthHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__WIDTH_HINT, oldWidthHint, widthHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHeightHint() {
		return heightHint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeightHint(Integer newHeightHint) {
		Integer oldHeightHint = heightHint;
		heightHint = newHeightHint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__HEIGHT_HINT, oldHeightHint, heightHint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalIndent() {
		return horizontalIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalIndent(Integer newHorizontalIndent) {
		Integer oldHorizontalIndent = horizontalIndent;
		horizontalIndent = newHorizontalIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__HORIZONTAL_INDENT, oldHorizontalIndent, horizontalIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalIndent() {
		return verticalIndent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalIndent(Integer newVerticalIndent) {
		Integer oldVerticalIndent = verticalIndent;
		verticalIndent = newVerticalIndent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__VERTICAL_INDENT, oldVerticalIndent, verticalIndent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHorizontalSpan() {
		return horizontalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHorizontalSpan(Integer newHorizontalSpan) {
		Integer oldHorizontalSpan = horizontalSpan;
		horizontalSpan = newHorizontalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__HORIZONTAL_SPAN, oldHorizontalSpan, horizontalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVerticalSpan() {
		return verticalSpan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVerticalSpan(Integer newVerticalSpan) {
		Integer oldVerticalSpan = verticalSpan;
		verticalSpan = newVerticalSpan;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__VERTICAL_SPAN, oldVerticalSpan, verticalSpan));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGrabExcessHorizontalSpace() {
		return grabExcessHorizontalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessHorizontalSpace(Boolean newGrabExcessHorizontalSpace) {
		Boolean oldGrabExcessHorizontalSpace = grabExcessHorizontalSpace;
		grabExcessHorizontalSpace = newGrabExcessHorizontalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE, oldGrabExcessHorizontalSpace, grabExcessHorizontalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getGrabExcessVerticalSpace() {
		return grabExcessVerticalSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrabExcessVerticalSpace(Boolean newGrabExcessVerticalSpace) {
		Boolean oldGrabExcessVerticalSpace = grabExcessVerticalSpace;
		grabExcessVerticalSpace = newGrabExcessVerticalSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE, oldGrabExcessVerticalSpace, grabExcessVerticalSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinimumWidth() {
		return minimumWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumWidth(Integer newMinimumWidth) {
		Integer oldMinimumWidth = minimumWidth;
		minimumWidth = newMinimumWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__MINIMUM_WIDTH, oldMinimumWidth, minimumWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinimumHeight() {
		return minimumHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumHeight(Integer newMinimumHeight) {
		Integer oldMinimumHeight = minimumHeight;
		minimumHeight = newMinimumHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__MINIMUM_HEIGHT, oldMinimumHeight, minimumHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getExclude() {
		return exclude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclude(Boolean newExclude) {
		Boolean oldExclude = exclude;
		exclude = newExclude;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.XGRID_DATA__EXCLUDE, oldExclude, exclude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT:
				return getVerticalAlignment();
			case ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT:
				return getHorizontalAlignment();
			case ModelPackage.XGRID_DATA__WIDTH_HINT:
				return getWidthHint();
			case ModelPackage.XGRID_DATA__HEIGHT_HINT:
				return getHeightHint();
			case ModelPackage.XGRID_DATA__HORIZONTAL_INDENT:
				return getHorizontalIndent();
			case ModelPackage.XGRID_DATA__VERTICAL_INDENT:
				return getVerticalIndent();
			case ModelPackage.XGRID_DATA__HORIZONTAL_SPAN:
				return getHorizontalSpan();
			case ModelPackage.XGRID_DATA__VERTICAL_SPAN:
				return getVerticalSpan();
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return getGrabExcessHorizontalSpace();
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return getGrabExcessVerticalSpace();
			case ModelPackage.XGRID_DATA__MINIMUM_WIDTH:
				return getMinimumWidth();
			case ModelPackage.XGRID_DATA__MINIMUM_HEIGHT:
				return getMinimumHeight();
			case ModelPackage.XGRID_DATA__EXCLUDE:
				return getExclude();
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
			case ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__WIDTH_HINT:
				setWidthHint((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__HEIGHT_HINT:
				setHeightHint((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_INDENT:
				setHorizontalIndent((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__VERTICAL_INDENT:
				setVerticalIndent((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_SPAN:
				setHorizontalSpan((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__VERTICAL_SPAN:
				setVerticalSpan((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				setGrabExcessHorizontalSpace((Boolean)newValue);
				return;
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				setGrabExcessVerticalSpace((Boolean)newValue);
				return;
			case ModelPackage.XGRID_DATA__MINIMUM_WIDTH:
				setMinimumWidth((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__MINIMUM_HEIGHT:
				setMinimumHeight((Integer)newValue);
				return;
			case ModelPackage.XGRID_DATA__EXCLUDE:
				setExclude((Boolean)newValue);
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
			case ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT:
				setVerticalAlignment(VERTICAL_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT:
				setHorizontalAlignment(HORIZONTAL_ALIGNMENT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__WIDTH_HINT:
				setWidthHint(WIDTH_HINT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__HEIGHT_HINT:
				setHeightHint(HEIGHT_HINT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_INDENT:
				setHorizontalIndent(HORIZONTAL_INDENT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__VERTICAL_INDENT:
				setVerticalIndent(VERTICAL_INDENT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__HORIZONTAL_SPAN:
				setHorizontalSpan(HORIZONTAL_SPAN_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__VERTICAL_SPAN:
				setVerticalSpan(VERTICAL_SPAN_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				setGrabExcessHorizontalSpace(GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				setGrabExcessVerticalSpace(GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__MINIMUM_WIDTH:
				setMinimumWidth(MINIMUM_WIDTH_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__MINIMUM_HEIGHT:
				setMinimumHeight(MINIMUM_HEIGHT_EDEFAULT);
				return;
			case ModelPackage.XGRID_DATA__EXCLUDE:
				setExclude(EXCLUDE_EDEFAULT);
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
			case ModelPackage.XGRID_DATA__VERTICAL_ALIGNMENT:
				return VERTICAL_ALIGNMENT_EDEFAULT == null ? verticalAlignment != null : !VERTICAL_ALIGNMENT_EDEFAULT.equals(verticalAlignment);
			case ModelPackage.XGRID_DATA__HORIZONTAL_ALIGNMENT:
				return HORIZONTAL_ALIGNMENT_EDEFAULT == null ? horizontalAlignment != null : !HORIZONTAL_ALIGNMENT_EDEFAULT.equals(horizontalAlignment);
			case ModelPackage.XGRID_DATA__WIDTH_HINT:
				return WIDTH_HINT_EDEFAULT == null ? widthHint != null : !WIDTH_HINT_EDEFAULT.equals(widthHint);
			case ModelPackage.XGRID_DATA__HEIGHT_HINT:
				return HEIGHT_HINT_EDEFAULT == null ? heightHint != null : !HEIGHT_HINT_EDEFAULT.equals(heightHint);
			case ModelPackage.XGRID_DATA__HORIZONTAL_INDENT:
				return HORIZONTAL_INDENT_EDEFAULT == null ? horizontalIndent != null : !HORIZONTAL_INDENT_EDEFAULT.equals(horizontalIndent);
			case ModelPackage.XGRID_DATA__VERTICAL_INDENT:
				return VERTICAL_INDENT_EDEFAULT == null ? verticalIndent != null : !VERTICAL_INDENT_EDEFAULT.equals(verticalIndent);
			case ModelPackage.XGRID_DATA__HORIZONTAL_SPAN:
				return HORIZONTAL_SPAN_EDEFAULT == null ? horizontalSpan != null : !HORIZONTAL_SPAN_EDEFAULT.equals(horizontalSpan);
			case ModelPackage.XGRID_DATA__VERTICAL_SPAN:
				return VERTICAL_SPAN_EDEFAULT == null ? verticalSpan != null : !VERTICAL_SPAN_EDEFAULT.equals(verticalSpan);
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_HORIZONTAL_SPACE:
				return GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT == null ? grabExcessHorizontalSpace != null : !GRAB_EXCESS_HORIZONTAL_SPACE_EDEFAULT.equals(grabExcessHorizontalSpace);
			case ModelPackage.XGRID_DATA__GRAB_EXCESS_VERTICAL_SPACE:
				return GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT == null ? grabExcessVerticalSpace != null : !GRAB_EXCESS_VERTICAL_SPACE_EDEFAULT.equals(grabExcessVerticalSpace);
			case ModelPackage.XGRID_DATA__MINIMUM_WIDTH:
				return MINIMUM_WIDTH_EDEFAULT == null ? minimumWidth != null : !MINIMUM_WIDTH_EDEFAULT.equals(minimumWidth);
			case ModelPackage.XGRID_DATA__MINIMUM_HEIGHT:
				return MINIMUM_HEIGHT_EDEFAULT == null ? minimumHeight != null : !MINIMUM_HEIGHT_EDEFAULT.equals(minimumHeight);
			case ModelPackage.XGRID_DATA__EXCLUDE:
				return EXCLUDE_EDEFAULT == null ? exclude != null : !EXCLUDE_EDEFAULT.equals(exclude);
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
		result.append(" (verticalAlignment: ");
		result.append(verticalAlignment);
		result.append(", horizontalAlignment: ");
		result.append(horizontalAlignment);
		result.append(", widthHint: ");
		result.append(widthHint);
		result.append(", heightHint: ");
		result.append(heightHint);
		result.append(", horizontalIndent: ");
		result.append(horizontalIndent);
		result.append(", verticalIndent: ");
		result.append(verticalIndent);
		result.append(", horizontalSpan: ");
		result.append(horizontalSpan);
		result.append(", verticalSpan: ");
		result.append(verticalSpan);
		result.append(", grabExcessHorizontalSpace: ");
		result.append(grabExcessHorizontalSpace);
		result.append(", grabExcessVerticalSpace: ");
		result.append(grabExcessVerticalSpace);
		result.append(", minimumWidth: ");
		result.append(minimumWidth);
		result.append(", minimumHeight: ");
		result.append(minimumHeight);
		result.append(", exclude: ");
		result.append(exclude);
		result.append(')');
		return result.toString();
	}

} //XGridDataImpl
