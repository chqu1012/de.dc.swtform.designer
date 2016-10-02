/**
 */
package de.dc.swtform.xcore.widget;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>XDialog Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getXDialogType()
 * @model
 * @generated
 */
public enum XDialogType implements Enumerator {
	/**
	 * The '<em><b>Open File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_FILE(0, "OpenFile", "OpenFile"),

	/**
	 * The '<em><b>Save File</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_FILE_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE_FILE(0, "SaveFile", "SaveFile"),

	/**
	 * The '<em><b>Open Directory</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_DIRECTORY_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_DIRECTORY(0, "OpenDirectory", "OpenDirectory"),

	/**
	 * The '<em><b>Open Font</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_FONT_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_FONT(0, "OpenFont", "OpenFont"),

	/**
	 * The '<em><b>Open Color</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_COLOR_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_COLOR(0, "OpenColor", "OpenColor");

	/**
	 * The '<em><b>Open File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_FILE
	 * @model name="OpenFile"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_FILE_VALUE = 0;

	/**
	 * The '<em><b>Save File</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Save File</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE_FILE
	 * @model name="SaveFile"
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_FILE_VALUE = 0;

	/**
	 * The '<em><b>Open Directory</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Directory</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_DIRECTORY
	 * @model name="OpenDirectory"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_DIRECTORY_VALUE = 0;

	/**
	 * The '<em><b>Open Font</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Font</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_FONT
	 * @model name="OpenFont"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_FONT_VALUE = 0;

	/**
	 * The '<em><b>Open Color</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Color</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_COLOR
	 * @model name="OpenColor"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_COLOR_VALUE = 0;

	/**
	 * An array of all the '<em><b>XDialog Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final XDialogType[] VALUES_ARRAY =
		new XDialogType[] {
			OPEN_FILE,
			SAVE_FILE,
			OPEN_DIRECTORY,
			OPEN_FONT,
			OPEN_COLOR,
		};

	/**
	 * A public read-only list of all the '<em><b>XDialog Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<XDialogType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>XDialog Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XDialogType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDialogType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDialog Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XDialogType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			XDialogType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>XDialog Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static XDialogType get(int value) {
		switch (value) {
			case OPEN_FILE_VALUE: return OPEN_FILE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private XDialogType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //XDialogType
