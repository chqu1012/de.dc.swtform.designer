/**
 */
package de.dc.swtform.xcore.widget;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Style</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.xcore.widget.WidgetPackage#getStyle()
 * @model
 * @generated
 */
public enum Style implements Enumerator {
	/**
	 * The '<em><b>None</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NONE_VALUE
	 * @generated
	 * @ordered
	 */
	NONE(0, "None", "None"),

	/**
	 * The '<em><b>Key Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_DOWN(1, "KeyDown", "KeyDown"),

	/**
	 * The '<em><b>Key Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_UP_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_UP(2, "KeyUp", "KeyUp"),

	/**
	 * The '<em><b>Mouse Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_DOWN(3, "MouseDown", "MouseDown"),

	/**
	 * The '<em><b>Mouse Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_UP(4, "MouseUp", "MouseUp"),

	/**
	 * The '<em><b>Mouse Move</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_MOVE(5, "MouseMove", "MouseMove"),

	/**
	 * The '<em><b>Mouse Enter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_ENTER_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_ENTER(6, "MouseEnter", "MouseEnter"),

	/**
	 * The '<em><b>Mouse Exit</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_EXIT_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_EXIT(7, "MouseExit", "MouseExit"),

	/**
	 * The '<em><b>Mouse Double Click</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_DOUBLE_CLICK_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_DOUBLE_CLICK(8, "MouseDoubleClick", "MouseDoubleClick"),

	/**
	 * The '<em><b>Paint</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAINT_VALUE
	 * @generated
	 * @ordered
	 */
	PAINT(9, "Paint", "Paint"),

	/**
	 * The '<em><b>Move</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	MOVE(10, "Move", "Move"),

	/**
	 * The '<em><b>Resize</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RESIZE_VALUE
	 * @generated
	 * @ordered
	 */
	RESIZE(11, "Resize", "Resize"),

	/**
	 * The '<em><b>Dispose</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPOSE_VALUE
	 * @generated
	 * @ordered
	 */
	DISPOSE(12, "Dispose", "Dispose"),

	/**
	 * The '<em><b>Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTION(13, "Selection", "Selection"),

	/**
	 * The '<em><b>Default Selection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT_SELECTION(14, "DefaultSelection", "DefaultSelection"),

	/**
	 * The '<em><b>Focus In</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOCUS_IN_VALUE
	 * @generated
	 * @ordered
	 */
	FOCUS_IN(15, "FocusIn", "FocusIn"),

	/**
	 * The '<em><b>Focus Out</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOCUS_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	FOCUS_OUT(16, "FocusOut", "FocusOut"),

	/**
	 * The '<em><b>Expand</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EXPAND_VALUE
	 * @generated
	 * @ordered
	 */
	EXPAND(17, "Expand", "Expand"),

	/**
	 * The '<em><b>Collapse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE_VALUE
	 * @generated
	 * @ordered
	 */
	COLLAPSE(18, "Collapse", "Collapse"),

	/**
	 * The '<em><b>Iconify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICONIFY_VALUE
	 * @generated
	 * @ordered
	 */
	ICONIFY(19, "Iconify", "Iconify"),

	/**
	 * The '<em><b>Deiconify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEICONIFY_VALUE
	 * @generated
	 * @ordered
	 */
	DEICONIFY(20, "Deiconify", "Deiconify"),

	/**
	 * The '<em><b>Close</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	CLOSE(21, "Close", "Close"),

	/**
	 * The '<em><b>Show</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHOW_VALUE
	 * @generated
	 * @ordered
	 */
	SHOW(22, "Show", "Show"),

	/**
	 * The '<em><b>Hide</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDE_VALUE
	 * @generated
	 * @ordered
	 */
	HIDE(23, "Hide", "Hide"),

	/**
	 * The '<em><b>Modify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFY_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFY(24, "Modify", "Modify"),

	/**
	 * The '<em><b>Verify</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERIFY_VALUE
	 * @generated
	 * @ordered
	 */
	VERIFY(25, "Verify", "Verify"),

	/**
	 * The '<em><b>Activate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	ACTIVATE(26, "Activate", "Activate"),

	/**
	 * The '<em><b>Deactivate</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATE_VALUE
	 * @generated
	 * @ordered
	 */
	DEACTIVATE(27, "Deactivate", "Deactivate"),

	/**
	 * The '<em><b>Help</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HELP_VALUE
	 * @generated
	 * @ordered
	 */
	HELP(28, "Help", "Help"),

	/**
	 * The '<em><b>Drag Detect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAG_DETECT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAG_DETECT(29, "DragDetect", "DragDetect"),

	/**
	 * The '<em><b>Arm</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARM_VALUE
	 * @generated
	 * @ordered
	 */
	ARM(30, "Arm", "Arm"),

	/**
	 * The '<em><b>Traverse</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE(31, "Traverse", "Traverse"),

	/**
	 * The '<em><b>Mouse Hover</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_HOVER_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_HOVER(32, "MouseHover", "MouseHover"),

	/**
	 * The '<em><b>Hard Key Down</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD_KEY_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	HARD_KEY_DOWN(33, "HardKeyDown", "HardKeyDown"),

	/**
	 * The '<em><b>Hard Key Up</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HARD_KEY_UP_VALUE
	 * @generated
	 * @ordered
	 */
	HARD_KEY_UP(34, "HardKeyUp", "HardKeyUp"),

	/**
	 * The '<em><b>Menu Detect</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_DETECT_VALUE
	 * @generated
	 * @ordered
	 */
	MENU_DETECT(35, "MenuDetect", "MenuDetect"),

	/**
	 * The '<em><b>Set Data</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SET_DATA_VALUE
	 * @generated
	 * @ordered
	 */
	SET_DATA(36, "SetData", "SetData"),

	/**
	 * The '<em><b>Mouse Vertical Wheel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_VERTICAL_WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_VERTICAL_WHEEL(37, "MouseVerticalWheel", "MouseVerticalWheel"),

	/**
	 * The '<em><b>Mouse Horizontal Wheel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_HORIZONTAL_WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_HORIZONTAL_WHEEL(38, "MouseHorizontalWheel", "MouseHorizontalWheel"),

	/**
	 * The '<em><b>Mouse Wheel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOUSE_WHEEL_VALUE
	 * @generated
	 * @ordered
	 */
	MOUSE_WHEEL(39, "MouseWheel", "MouseWheel"),

	/**
	 * The '<em><b>Settings</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SETTINGS_VALUE
	 * @generated
	 * @ordered
	 */
	SETTINGS(40, "Settings", "Settings"),

	/**
	 * The '<em><b>Erase Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERASE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ERASE_ITEM(41, "EraseItem", "EraseItem"),

	/**
	 * The '<em><b>Measure Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASURE_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	MEASURE_ITEM(42, "MeasureItem", "MeasureItem"),

	/**
	 * The '<em><b>Paint Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAINT_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	PAINT_ITEM(43, "PaintItem", "PaintItem"),

	/**
	 * The '<em><b>Ime Composition</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IME_COMPOSITION_VALUE
	 * @generated
	 * @ordered
	 */
	IME_COMPOSITION(44, "ImeComposition", "ImeComposition"),

	/**
	 * The '<em><b>Orientation Change</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ORIENTATION_CHANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ORIENTATION_CHANGE(45, "OrientationChange", "OrientationChange"),

	/**
	 * The '<em><b>Skin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIN_VALUE
	 * @generated
	 * @ordered
	 */
	SKIN(46, "Skin", "Skin"),

	/**
	 * The '<em><b>Open Document</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_DOCUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN_DOCUMENT(47, "OpenDocument", "OpenDocument"),

	/**
	 * The '<em><b>Touch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCH_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCH(48, "Touch", "Touch"),

	/**
	 * The '<em><b>Gesture</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE(49, "Gesture", "Gesture"),

	/**
	 * The '<em><b>Segments</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEGMENTS_VALUE
	 * @generated
	 * @ordered
	 */
	SEGMENTS(50, "Segments", "Segments"),

	/**
	 * The '<em><b>Pre Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_EVENT(51, "PreEvent", "PreEvent"),

	/**
	 * The '<em><b>Post Event</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_EVENT_VALUE
	 * @generated
	 * @ordered
	 */
	POST_EVENT(52, "PostEvent", "PostEvent"),

	/**
	 * The '<em><b>Pre External Event Dispatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRE_EXTERNAL_EVENT_DISPATCH_VALUE
	 * @generated
	 * @ordered
	 */
	PRE_EXTERNAL_EVENT_DISPATCH(53, "PreExternalEventDispatch", "PreExternalEventDispatch"),

	/**
	 * The '<em><b>Post External Event Dispatch</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POST_EXTERNAL_EVENT_DISPATCH_VALUE
	 * @generated
	 * @ordered
	 */
	POST_EXTERNAL_EVENT_DISPATCH(54, "PostExternalEventDispatch", "PostExternalEventDispatch"),

	/**
	 * The '<em><b>Sleep</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SLEEP_VALUE
	 * @generated
	 * @ordered
	 */
	SLEEP(55, "Sleep", "Sleep"),

	/**
	 * The '<em><b>Wakeup</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WAKEUP_VALUE
	 * @generated
	 * @ordered
	 */
	WAKEUP(56, "Wakeup", "Wakeup"),

	/**
	 * The '<em><b>COMPOSITION CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION_CHANGED(57, "COMPOSITION_CHANGED", "COMPOSITION_CHANGED"),

	/**
	 * The '<em><b>COMPOSITION OFFSET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_OFFSET_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION_OFFSET(58, "COMPOSITION_OFFSET", "COMPOSITION_OFFSET"),

	/**
	 * The '<em><b>COMPOSITION SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOSITION_SELECTION(59, "COMPOSITION_SELECTION", "COMPOSITION_SELECTION"),

	/**
	 * The '<em><b>DRAG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAG_VALUE
	 * @generated
	 * @ordered
	 */
	DRAG(60, "DRAG", "DRAG"),

	/**
	 * The '<em><b>SELECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	SELECTED(61, "SELECTED", "SELECTED"),

	/**
	 * The '<em><b>FOCUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOCUSED_VALUE
	 * @generated
	 * @ordered
	 */
	FOCUSED(62, "FOCUSED", "FOCUSED"),

	/**
	 * The '<em><b>BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	BACKGROUND(63, "BACKGROUND", "BACKGROUND"),

	/**
	 * The '<em><b>FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	FOREGROUND(64, "FOREGROUND", "FOREGROUND"),

	/**
	 * The '<em><b>HOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOT_VALUE
	 * @generated
	 * @ordered
	 */
	HOT(65, "HOT", "HOT"),

	/**
	 * The '<em><b>TRAVERSE NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_NONE(66, "TRAVERSE_NONE", "TRAVERSE_NONE"),

	/**
	 * The '<em><b>TRAVERSE ESCAPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ESCAPE_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_ESCAPE(67, "TRAVERSE_ESCAPE", "TRAVERSE_ESCAPE"),

	/**
	 * The '<em><b>TRAVERSE RETURN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_RETURN_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_RETURN(68, "TRAVERSE_RETURN", "TRAVERSE_RETURN"),

	/**
	 * The '<em><b>TRAVERSE TAB PREVIOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_TAB_PREVIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_TAB_PREVIOUS(69, "TRAVERSE_TAB_PREVIOUS", "TRAVERSE_TAB_PREVIOUS"),

	/**
	 * The '<em><b>TRAVERSE TAB NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_TAB_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_TAB_NEXT(70, "TRAVERSE_TAB_NEXT", "TRAVERSE_TAB_NEXT"),

	/**
	 * The '<em><b>TRAVERSE ARROW PREVIOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ARROW_PREVIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_ARROW_PREVIOUS(71, "TRAVERSE_ARROW_PREVIOUS", "TRAVERSE_ARROW_PREVIOUS"),

	/**
	 * The '<em><b>TRAVERSE ARROW NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ARROW_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_ARROW_NEXT(72, "TRAVERSE_ARROW_NEXT", "TRAVERSE_ARROW_NEXT"),

	/**
	 * The '<em><b>TRAVERSE MNEMONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_MNEMONIC_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_MNEMONIC(73, "TRAVERSE_MNEMONIC", "TRAVERSE_MNEMONIC"),

	/**
	 * The '<em><b>TRAVERSE PAGE PREVIOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_PAGE_PREVIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_PAGE_PREVIOUS(74, "TRAVERSE_PAGE_PREVIOUS", "TRAVERSE_PAGE_PREVIOUS"),

	/**
	 * The '<em><b>TRAVERSE PAGE NEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_PAGE_NEXT_VALUE
	 * @generated
	 * @ordered
	 */
	TRAVERSE_PAGE_NEXT(75, "TRAVERSE_PAGE_NEXT", "TRAVERSE_PAGE_NEXT"),

	/**
	 * The '<em><b>GESTURE BEGIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_BEGIN_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_BEGIN(76, "GESTURE_BEGIN", "GESTURE_BEGIN"),

	/**
	 * The '<em><b>GESTURE END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_END_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_END(77, "GESTURE_END", "GESTURE_END"),

	/**
	 * The '<em><b>GESTURE ROTATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_ROTATE_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_ROTATE(78, "GESTURE_ROTATE", "GESTURE_ROTATE"),

	/**
	 * The '<em><b>GESTURE SWIPE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_SWIPE_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_SWIPE(79, "GESTURE_SWIPE", "GESTURE_SWIPE"),

	/**
	 * The '<em><b>GESTURE MAGNIFY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_MAGNIFY_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_MAGNIFY(80, "GESTURE_MAGNIFY", "GESTURE_MAGNIFY"),

	/**
	 * The '<em><b>GESTURE PAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GESTURE_PAN_VALUE
	 * @generated
	 * @ordered
	 */
	GESTURE_PAN(81, "GESTURE_PAN", "GESTURE_PAN"),

	/**
	 * The '<em><b>TOUCHSTATE DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCHSTATE_DOWN(82, "TOUCHSTATE_DOWN", "TOUCHSTATE_DOWN"),

	/**
	 * The '<em><b>TOUCHSTATE MOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCHSTATE_MOVE(83, "TOUCHSTATE_MOVE", "TOUCHSTATE_MOVE"),

	/**
	 * The '<em><b>TOUCHSTATE UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	TOUCHSTATE_UP(84, "TOUCHSTATE_UP", "TOUCHSTATE_UP"),

	/**
	 * The '<em><b>MENU MOUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_MOUSE_VALUE
	 * @generated
	 * @ordered
	 */
	MENU_MOUSE(85, "MENU_MOUSE", "MENU_MOUSE"),

	/**
	 * The '<em><b>MENU KEYBOARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_KEYBOARD_VALUE
	 * @generated
	 * @ordered
	 */
	MENU_KEYBOARD(86, "MENU_KEYBOARD", "MENU_KEYBOARD"),

	/**
	 * The '<em><b>CHANGED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGED_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGED(87, "CHANGED", "CHANGED"),

	/**
	 * The '<em><b>DEFER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFER_VALUE
	 * @generated
	 * @ordered
	 */
	DEFER(88, "DEFER", "DEFER"),

	/**
	 * The '<em><b>NULL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NULL_VALUE
	 * @generated
	 * @ordered
	 */
	NULL(90, "NULL", "NULL"),

	/**
	 * The '<em><b>DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	DEFAULT(91, "DEFAULT", "DEFAULT"),

	/**
	 * The '<em><b>OFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OFF_VALUE
	 * @generated
	 * @ordered
	 */
	OFF(92, "OFF", "OFF"),

	/**
	 * The '<em><b>ON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_VALUE
	 * @generated
	 * @ordered
	 */
	ON(93, "ON", "ON"),

	/**
	 * The '<em><b>LOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOW_VALUE
	 * @generated
	 * @ordered
	 */
	LOW(94, "LOW", "LOW"),

	/**
	 * The '<em><b>HIGH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIGH_VALUE
	 * @generated
	 * @ordered
	 */
	HIGH(95, "HIGH", "HIGH"),

	/**
	 * The '<em><b>BAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BAR_VALUE
	 * @generated
	 * @ordered
	 */
	BAR(96, "BAR", "BAR"),

	/**
	 * The '<em><b>DROP DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DROP_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DROP_DOWN(97, "DROP_DOWN", "DROP_DOWN"),

	/**
	 * The '<em><b>POP UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP_UP_VALUE
	 * @generated
	 * @ordered
	 */
	POP_UP(98, "POP_UP", "POP_UP"),

	/**
	 * The '<em><b>SEPARATOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATOR(99, "SEPARATOR", "SEPARATOR"),

	/**
	 * The '<em><b>SEPARATOR FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_FILL_VALUE
	 * @generated
	 * @ordered
	 */
	SEPARATOR_FILL(100, "SEPARATOR_FILL", "SEPARATOR_FILL"),

	/**
	 * The '<em><b>TOGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	TOGGLE(101, "TOGGLE", "TOGGLE"),

	/**
	 * The '<em><b>ARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW(102, "ARROW", "ARROW"),

	/**
	 * The '<em><b>PUSH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PUSH_VALUE
	 * @generated
	 * @ordered
	 */
	PUSH(103, "PUSH", "PUSH"),

	/**
	 * The '<em><b>RADIO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RADIO_VALUE
	 * @generated
	 * @ordered
	 */
	RADIO(104, "RADIO", "RADIO"),

	/**
	 * The '<em><b>CHECK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHECK_VALUE
	 * @generated
	 * @ordered
	 */
	CHECK(105, "CHECK", "CHECK"),

	/**
	 * The '<em><b>CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	CASCADE(106, "CASCADE", "CASCADE"),

	/**
	 * The '<em><b>MULTI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTI_VALUE
	 * @generated
	 * @ordered
	 */
	MULTI(107, "MULTI", "MULTI"),

	/**
	 * The '<em><b>SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	SINGLE(108, "SINGLE", "SINGLE"),

	/**
	 * The '<em><b>READ ONLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY_VALUE
	 * @generated
	 * @ordered
	 */
	READ_ONLY(109, "READ_ONLY", "READ_ONLY"),

	/**
	 * The '<em><b>WRAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WRAP_VALUE
	 * @generated
	 * @ordered
	 */
	WRAP(110, "WRAP", "WRAP"),

	/**
	 * The '<em><b>SEARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	SEARCH(111, "SEARCH", "SEARCH"),

	/**
	 * The '<em><b>SIMPLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIMPLE_VALUE
	 * @generated
	 * @ordered
	 */
	SIMPLE(112, "SIMPLE", "SIMPLE"),

	/**
	 * The '<em><b>PASSWORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASSWORD_VALUE
	 * @generated
	 * @ordered
	 */
	PASSWORD(113, "PASSWORD", "PASSWORD"),

	/**
	 * The '<em><b>SHADOW IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_IN_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_IN(114, "SHADOW_IN", "SHADOW_IN"),

	/**
	 * The '<em><b>SHADOW OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_OUT(115, "SHADOW_OUT", "SHADOW_OUT"),

	/**
	 * The '<em><b>SHADOW ETCHED IN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_ETCHED_IN_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_ETCHED_IN(116, "SHADOW_ETCHED_IN", "SHADOW_ETCHED_IN"),

	/**
	 * The '<em><b>SHADOW ETCHED OUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_ETCHED_OUT_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_ETCHED_OUT(117, "SHADOW_ETCHED_OUT", "SHADOW_ETCHED_OUT"),

	/**
	 * The '<em><b>SHADOW NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHADOW_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	SHADOW_NONE(118, "SHADOW_NONE", "SHADOW_NONE"),

	/**
	 * The '<em><b>INDETERMINATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDETERMINATE_VALUE
	 * @generated
	 * @ordered
	 */
	INDETERMINATE(119, "INDETERMINATE", "INDETERMINATE"),

	/**
	 * The '<em><b>TOOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOOL_VALUE
	 * @generated
	 * @ordered
	 */
	TOOL(120, "TOOL", "TOOL"),

	/**
	 * The '<em><b>NO TRIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_TRIM_VALUE
	 * @generated
	 * @ordered
	 */
	NO_TRIM(121, "NO_TRIM", "NO_TRIM"),

	/**
	 * The '<em><b>TITLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TITLE_VALUE
	 * @generated
	 * @ordered
	 */
	TITLE(123, "TITLE", "TITLE"),

	/**
	 * The '<em><b>MENU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MENU_VALUE
	 * @generated
	 * @ordered
	 */
	MENU(125, "MENU", "MENU"),

	/**
	 * The '<em><b>MIN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIN_VALUE
	 * @generated
	 * @ordered
	 */
	MIN(126, "MIN", "MIN"),

	/**
	 * The '<em><b>MAX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAX_VALUE
	 * @generated
	 * @ordered
	 */
	MAX(127, "MAX", "MAX"),

	/**
	 * The '<em><b>NO MOVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_MOVE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_MOVE(128, "NO_MOVE", "NO_MOVE"),

	/**
	 * The '<em><b>HSCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HSCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	HSCROLL(129, "H_SCROLL", "H_SCROLL"),

	/**
	 * The '<em><b>VSCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VSCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	VSCROLL(130, "V_SCROLL", "V_SCROLL"),

	/**
	 * The '<em><b>NO SCROLL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_SCROLL_VALUE
	 * @generated
	 * @ordered
	 */
	NO_SCROLL(131, "NO_SCROLL", "NO_SCROLL"),

	/**
	 * The '<em><b>BORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER(132, "BORDER", "BORDER"),

	/**
	 * The '<em><b>CLIP CHILDREN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIP_CHILDREN_VALUE
	 * @generated
	 * @ordered
	 */
	CLIP_CHILDREN(133, "CLIP_CHILDREN", "CLIP_CHILDREN"),

	/**
	 * The '<em><b>CLIP SIBLINGS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIP_SIBLINGS_VALUE
	 * @generated
	 * @ordered
	 */
	CLIP_SIBLINGS(134, "CLIP_SIBLINGS", "CLIP_SIBLINGS"),

	/**
	 * The '<em><b>ON TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ON_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	ON_TOP(135, "ON_TOP", "ON_TOP"),

	/**
	 * The '<em><b>SHEET</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHEET_VALUE
	 * @generated
	 * @ordered
	 */
	SHEET(136, "SHEET", "SHEET"),

	/**
	 * The '<em><b>SHELL TRIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHELL_TRIM_VALUE
	 * @generated
	 * @ordered
	 */
	SHELL_TRIM(137, "SHELL_TRIM", "SHELL_TRIM"),

	/**
	 * The '<em><b>DIALOG TRIM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DIALOG_TRIM_VALUE
	 * @generated
	 * @ordered
	 */
	DIALOG_TRIM(138, "DIALOG_TRIM", "DIALOG_TRIM"),

	/**
	 * The '<em><b>MODELESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODELESS_VALUE
	 * @generated
	 * @ordered
	 */
	MODELESS(139, "MODELESS", "MODELESS"),

	/**
	 * The '<em><b>PRIMARY MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
	PRIMARY_MODAL(140, "PRIMARY_MODAL", "PRIMARY_MODAL"),

	/**
	 * The '<em><b>APPLICATION MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
	APPLICATION_MODAL(141, "APPLICATION_MODAL", "APPLICATION_MODAL"),

	/**
	 * The '<em><b>SYSTEM MODAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_MODAL_VALUE
	 * @generated
	 * @ordered
	 */
	SYSTEM_MODAL(142, "SYSTEM_MODAL", "SYSTEM_MODAL"),

	/**
	 * The '<em><b>HIDE SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HIDE_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	HIDE_SELECTION(143, "HIDE_SELECTION", "HIDE_SELECTION"),

	/**
	 * The '<em><b>FULL SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FULL_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FULL_SELECTION(144, "FULL_SELECTION", "FULL_SELECTION"),

	/**
	 * The '<em><b>FLAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	FLAT(145, "FLAT", "FLAT"),

	/**
	 * The '<em><b>SMOOTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOOTH_VALUE
	 * @generated
	 * @ordered
	 */
	SMOOTH(146, "SMOOTH", "SMOOTH"),

	/**
	 * The '<em><b>NO BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	NO_BACKGROUND(147, "NO_BACKGROUND", "NO_BACKGROUND"),

	/**
	 * The '<em><b>NO FOCUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_FOCUS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_FOCUS(148, "NO_FOCUS", "NO_FOCUS"),

	/**
	 * The '<em><b>NO REDRAW RESIZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_REDRAW_RESIZE_VALUE
	 * @generated
	 * @ordered
	 */
	NO_REDRAW_RESIZE(149, "NO_REDRAW_RESIZE", "NO_REDRAW_RESIZE"),

	/**
	 * The '<em><b>NO MERGE PAINTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_MERGE_PAINTS_VALUE
	 * @generated
	 * @ordered
	 */
	NO_MERGE_PAINTS(150, "NO_MERGE_PAINTS", "NO_MERGE_PAINTS"),

	/**
	 * The '<em><b>NO RADIO GROUP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_RADIO_GROUP_VALUE
	 * @generated
	 * @ordered
	 */
	NO_RADIO_GROUP(151, "NO_RADIO_GROUP", "NO_RADIO_GROUP"),

	/**
	 * The '<em><b>LEFT TO RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT_TO_RIGHT(152, "LEFT_TO_RIGHT", "LEFT_TO_RIGHT"),

	/**
	 * The '<em><b>RIGHT TO LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT_TO_LEFT(153, "RIGHT_TO_LEFT", "RIGHT_TO_LEFT"),

	/**
	 * The '<em><b>MIRRORED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MIRRORED_VALUE
	 * @generated
	 * @ordered
	 */
	MIRRORED(154, "MIRRORED", "MIRRORED"),

	/**
	 * The '<em><b>EMBEDDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED_VALUE
	 * @generated
	 * @ordered
	 */
	EMBEDDED(155, "EMBEDDED", "EMBEDDED"),

	/**
	 * The '<em><b>VIRTUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL_VALUE
	 * @generated
	 * @ordered
	 */
	VIRTUAL(156, "VIRTUAL", "VIRTUAL"),

	/**
	 * The '<em><b>DOUBLE BUFFERED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BUFFERED_VALUE
	 * @generated
	 * @ordered
	 */
	DOUBLE_BUFFERED(157, "DOUBLE_BUFFERED", "DOUBLE_BUFFERED"),

	/**
	 * The '<em><b>TRANSPARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENT(158, "TRANSPARENT", "TRANSPARENT"),

	/**
	 * The '<em><b>FLIP TEXT DIRECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLIP_TEXT_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	FLIP_TEXT_DIRECTION(159, "FLIP_TEXT_DIRECTION", "FLIP_TEXT_DIRECTION"),

	/**
	 * The '<em><b>AUTO TEXT DIRECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AUTO_TEXT_DIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	AUTO_TEXT_DIRECTION(160, "AUTO_TEXT_DIRECTION", "AUTO_TEXT_DIRECTION"),

	/**
	 * The '<em><b>UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UP_VALUE
	 * @generated
	 * @ordered
	 */
	UP(161, "UP", "UP"),

	/**
	 * The '<em><b>UNDERLINE SINGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_SINGLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE_SINGLE(162, "UNDERLINE_SINGLE", "UNDERLINE_SINGLE"),

	/**
	 * The '<em><b>UNDERLINE DOUBLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_DOUBLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE_DOUBLE(163, "UNDERLINE_DOUBLE", "UNDERLINE_DOUBLE"),

	/**
	 * The '<em><b>UNDERLINE ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE_ERROR(164, "UNDERLINE_ERROR", "UNDERLINE_ERROR"),

	/**
	 * The '<em><b>UNDERLINE SQUIGGLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_SQUIGGLE_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE_SQUIGGLE(165, "UNDERLINE_SQUIGGLE", "UNDERLINE_SQUIGGLE"),

	/**
	 * The '<em><b>UNDERLINE LINK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_LINK_VALUE
	 * @generated
	 * @ordered
	 */
	UNDERLINE_LINK(166, "UNDERLINE_LINK", "UNDERLINE_LINK"),

	/**
	 * The '<em><b>BORDER SOLID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER_SOLID(167, "BORDER_SOLID", "BORDER_SOLID"),

	/**
	 * The '<em><b>BORDER DASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_DASH_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER_DASH(168, "BORDER_DASH", "BORDER_DASH"),

	/**
	 * The '<em><b>BORDER DOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BORDER_DOT_VALUE
	 * @generated
	 * @ordered
	 */
	BORDER_DOT(169, "BORDER_DOT", "BORDER_DOT"),

	/**
	 * The '<em><b>TOP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TOP_VALUE
	 * @generated
	 * @ordered
	 */
	TOP(170, "TOP", "TOP"),

	/**
	 * The '<em><b>DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	DOWN(171, "DOWN", "DOWN"),

	/**
	 * The '<em><b>BOTTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	BOTTOM(172, "BOTTOM", "BOTTOM"),

	/**
	 * The '<em><b>LEAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEAD_VALUE
	 * @generated
	 * @ordered
	 */
	LEAD(173, "LEAD", "LEAD"),

	/**
	 * The '<em><b>LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	LEFT(174, "LEFT", "LEFT"),

	/**
	 * The '<em><b>TRAIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRAIL_VALUE
	 * @generated
	 * @ordered
	 */
	TRAIL(175, "TRAIL", "TRAIL"),

	/**
	 * The '<em><b>RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	RIGHT(176, "RIGHT", "RIGHT"),

	/**
	 * The '<em><b>CENTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CENTER_VALUE
	 * @generated
	 * @ordered
	 */
	CENTER(177, "CENTER", "CENTER"),

	/**
	 * The '<em><b>HORIZONTAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL_VALUE
	 * @generated
	 * @ordered
	 */
	HORIZONTAL(178, "HORIZONTAL", "HORIZONTAL"),

	/**
	 * The '<em><b>VERTICAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VERTICAL_VALUE
	 * @generated
	 * @ordered
	 */
	VERTICAL(179, "VERTICAL", "VERTICAL"),

	/**
	 * The '<em><b>DATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DATE_VALUE
	 * @generated
	 * @ordered
	 */
	DATE(180, "DATE", "DATE"),

	/**
	 * The '<em><b>TIME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TIME_VALUE
	 * @generated
	 * @ordered
	 */
	TIME(181, "TIME", "TIME"),

	/**
	 * The '<em><b>CALENDAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CALENDAR_VALUE
	 * @generated
	 * @ordered
	 */
	CALENDAR(182, "CALENDAR", "CALENDAR"),

	/**
	 * The '<em><b>SHORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHORT_VALUE
	 * @generated
	 * @ordered
	 */
	SHORT(183, "SHORT", "SHORT"),

	/**
	 * The '<em><b>MEDIUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDIUM_VALUE
	 * @generated
	 * @ordered
	 */
	MEDIUM(184, "MEDIUM", "MEDIUM"),

	/**
	 * The '<em><b>LONG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LONG_VALUE
	 * @generated
	 * @ordered
	 */
	LONG(185, "LONG", "LONG"),

	/**
	 * The '<em><b>MOZILLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOZILLA_VALUE
	 * @generated
	 * @ordered
	 */
	MOZILLA(186, "MOZILLA", "MOZILLA"),

	/**
	 * The '<em><b>WEBKIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WEBKIT_VALUE
	 * @generated
	 * @ordered
	 */
	WEBKIT(187, "WEBKIT", "WEBKIT"),

	/**
	 * The '<em><b>BALLOON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BALLOON_VALUE
	 * @generated
	 * @ordered
	 */
	BALLOON(188, "BALLOON", "BALLOON"),

	/**
	 * The '<em><b>BEGINNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEGINNING_VALUE
	 * @generated
	 * @ordered
	 */
	BEGINNING(189, "BEGINNING", "BEGINNING"),

	/**
	 * The '<em><b>FILL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_VALUE
	 * @generated
	 * @ordered
	 */
	FILL(190, "FILL", "FILL"),

	/**
	 * The '<em><b>DBCS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DBCS_VALUE
	 * @generated
	 * @ordered
	 */
	DBCS(191, "DBCS", "DBCS"),

	/**
	 * The '<em><b>ALPHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	ALPHA(192, "ALPHA", "ALPHA"),

	/**
	 * The '<em><b>NATIVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	NATIVE(193, "NATIVE", "NATIVE"),

	/**
	 * The '<em><b>PHONETIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHONETIC_VALUE
	 * @generated
	 * @ordered
	 */
	PHONETIC(194, "PHONETIC", "PHONETIC"),

	/**
	 * The '<em><b>ROMAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROMAN_VALUE
	 * @generated
	 * @ordered
	 */
	ROMAN(195, "ROMAN", "ROMAN"),

	/**
	 * The '<em><b>BS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BS_VALUE
	 * @generated
	 * @ordered
	 */
	BS(196, "BS", "BS"),

	/**
	 * The '<em><b>CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CR_VALUE
	 * @generated
	 * @ordered
	 */
	CR(197, "CR", "CR"),

	/**
	 * The '<em><b>DEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DEL_VALUE
	 * @generated
	 * @ordered
	 */
	DEL(198, "DEL", "DEL"),

	/**
	 * The '<em><b>ESC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ESC_VALUE
	 * @generated
	 * @ordered
	 */
	ESC(199, "ESC", "ESC"),

	/**
	 * The '<em><b>LF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LF_VALUE
	 * @generated
	 * @ordered
	 */
	LF(200, "LF", "LF"),

	/**
	 * The '<em><b>TAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAB_VALUE
	 * @generated
	 * @ordered
	 */
	TAB(201, "TAB", "TAB"),

	/**
	 * The '<em><b>SPACE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPACE_VALUE
	 * @generated
	 * @ordered
	 */
	SPACE(202, "SPACE", "SPACE"),

	/**
	 * The '<em><b>ALT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALT_VALUE
	 * @generated
	 * @ordered
	 */
	ALT(203, "ALT", "ALT"),

	/**
	 * The '<em><b>SHIFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SHIFT_VALUE
	 * @generated
	 * @ordered
	 */
	SHIFT(204, "SHIFT", "SHIFT"),

	/**
	 * The '<em><b>CTRL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CTRL_VALUE
	 * @generated
	 * @ordered
	 */
	CTRL(205, "CTRL", "CTRL"),

	/**
	 * The '<em><b>CONTROL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTROL_VALUE
	 * @generated
	 * @ordered
	 */
	CONTROL(206, "CONTROL", "CONTROL"),

	/**
	 * The '<em><b>COMMAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMMAND_VALUE
	 * @generated
	 * @ordered
	 */
	COMMAND(207, "COMMAND", "COMMAND"),

	/**
	 * The '<em><b>MODIFIER MASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MODIFIER_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	MODIFIER_MASK(208, "MODIFIER_MASK", "MODIFIER_MASK"),

	/**
	 * The '<em><b>BUTTON1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON1_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON1(209, "BUTTON1", "BUTTON1"),

	/**
	 * The '<em><b>BUTTON2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON2_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON2(210, "BUTTON2", "BUTTON2"),

	/**
	 * The '<em><b>BUTTON3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON3_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON3(211, "BUTTON3", "BUTTON3"),

	/**
	 * The '<em><b>BUTTON4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON4_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON4(212, "BUTTON4", "BUTTON4"),

	/**
	 * The '<em><b>BUTTON5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON5_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON5(213, "BUTTON5", "BUTTON5"),

	/**
	 * The '<em><b>BUTTON MASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BUTTON_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	BUTTON_MASK(214, "BUTTON_MASK", "BUTTON_MASK"),

	/**
	 * The '<em><b>MOD1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD1_VALUE
	 * @generated
	 * @ordered
	 */
	MOD1(215, "MOD1", "MOD1"),

	/**
	 * The '<em><b>MOD2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD2_VALUE
	 * @generated
	 * @ordered
	 */
	MOD2(216, "MOD2", "MOD2"),

	/**
	 * The '<em><b>MOD3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD3_VALUE
	 * @generated
	 * @ordered
	 */
	MOD3(217, "MOD3", "MOD3"),

	/**
	 * The '<em><b>MOD4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOD4_VALUE
	 * @generated
	 * @ordered
	 */
	MOD4(218, "MOD4", "MOD4"),

	/**
	 * The '<em><b>SCROLL LINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_LINE_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL_LINE(219, "SCROLL_LINE", "SCROLL_LINE"),

	/**
	 * The '<em><b>SCROLL PAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_PAGE_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL_PAGE(220, "SCROLL_PAGE", "SCROLL_PAGE"),

	/**
	 * The '<em><b>KEYCODE BIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYCODE_BIT_VALUE
	 * @generated
	 * @ordered
	 */
	KEYCODE_BIT(221, "KEYCODE_BIT", "KEYCODE_BIT"),

	/**
	 * The '<em><b>KEY MASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEY_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	KEY_MASK(222, "KEY_MASK", "KEY_MASK"),

	/**
	 * The '<em><b>ARROW UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_UP_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_UP(223, "ARROW_UP", "ARROW_UP"),

	/**
	 * The '<em><b>ARROW DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_DOWN(224, "ARROW_DOWN", "ARROW_DOWN"),

	/**
	 * The '<em><b>ARROW LEFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_LEFT(225, "ARROW_LEFT", "ARROW_LEFT"),

	/**
	 * The '<em><b>ARROW RIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW_RIGHT(226, "ARROW_RIGHT", "ARROW_RIGHT"),

	/**
	 * The '<em><b>PAGE UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_UP_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_UP(227, "PAGE_UP", "PAGE_UP"),

	/**
	 * The '<em><b>PAGE DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAGE_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	PAGE_DOWN(228, "PAGE_DOWN", "PAGE_DOWN"),

	/**
	 * The '<em><b>HOME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOME_VALUE
	 * @generated
	 * @ordered
	 */
	HOME(229, "HOME", "HOME"),

	/**
	 * The '<em><b>END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #END_VALUE
	 * @generated
	 * @ordered
	 */
	END(230, "END", "END"),

	/**
	 * The '<em><b>INSERT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INSERT_VALUE
	 * @generated
	 * @ordered
	 */
	INSERT(231, "INSERT", "INSERT"),

	/**
	 * The '<em><b>F1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F1_VALUE
	 * @generated
	 * @ordered
	 */
	F1(232, "F1", "F1"),

	/**
	 * The '<em><b>F2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F2_VALUE
	 * @generated
	 * @ordered
	 */
	F2(233, "F2", "F2"),

	/**
	 * The '<em><b>F3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F3_VALUE
	 * @generated
	 * @ordered
	 */
	F3(234, "F3", "F3"),

	/**
	 * The '<em><b>F4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F4_VALUE
	 * @generated
	 * @ordered
	 */
	F4(235, "F4", "F4"),

	/**
	 * The '<em><b>F5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F5_VALUE
	 * @generated
	 * @ordered
	 */
	F5(236, "F5", "F5"),

	/**
	 * The '<em><b>F6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F6_VALUE
	 * @generated
	 * @ordered
	 */
	F6(237, "F6", "F6"),

	/**
	 * The '<em><b>F7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F7_VALUE
	 * @generated
	 * @ordered
	 */
	F7(238, "F7", "F7"),

	/**
	 * The '<em><b>F8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F8_VALUE
	 * @generated
	 * @ordered
	 */
	F8(239, "F8", "F8"),

	/**
	 * The '<em><b>F9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F9_VALUE
	 * @generated
	 * @ordered
	 */
	F9(240, "F9", "F9"),

	/**
	 * The '<em><b>F10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F10_VALUE
	 * @generated
	 * @ordered
	 */
	F10(241, "F10", "F10"),

	/**
	 * The '<em><b>F11</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F11_VALUE
	 * @generated
	 * @ordered
	 */
	F11(242, "F11", "F11"),

	/**
	 * The '<em><b>F12</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F12_VALUE
	 * @generated
	 * @ordered
	 */
	F12(243, "F12", "F12"),

	/**
	 * The '<em><b>F13</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F13_VALUE
	 * @generated
	 * @ordered
	 */
	F13(244, "F13", "F13"),

	/**
	 * The '<em><b>F14</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F14_VALUE
	 * @generated
	 * @ordered
	 */
	F14(245, "F14", "F14"),

	/**
	 * The '<em><b>F15</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F15_VALUE
	 * @generated
	 * @ordered
	 */
	F15(246, "F15", "F15"),

	/**
	 * The '<em><b>F16</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F16_VALUE
	 * @generated
	 * @ordered
	 */
	F16(247, "F16", "F16"),

	/**
	 * The '<em><b>F17</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F17_VALUE
	 * @generated
	 * @ordered
	 */
	F17(248, "F17", "F17"),

	/**
	 * The '<em><b>F18</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F18_VALUE
	 * @generated
	 * @ordered
	 */
	F18(249, "F18", "F18"),

	/**
	 * The '<em><b>F19</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F19_VALUE
	 * @generated
	 * @ordered
	 */
	F19(250, "F19", "F19"),

	/**
	 * The '<em><b>F20</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #F20_VALUE
	 * @generated
	 * @ordered
	 */
	F20(251, "F20", "F20"),

	/**
	 * The '<em><b>KEYPAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD(252, "KEYPAD", "KEYPAD"),

	/**
	 * The '<em><b>KEYPAD MULTIPLY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_MULTIPLY_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_MULTIPLY(253, "KEYPAD_MULTIPLY", "KEYPAD_MULTIPLY"),

	/**
	 * The '<em><b>KEYPAD ADD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_ADD_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_ADD(254, "KEYPAD_ADD", "KEYPAD_ADD"),

	/**
	 * The '<em><b>KEYPAD SUBTRACT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_SUBTRACT_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_SUBTRACT(255, "KEYPAD_SUBTRACT", "KEYPAD_SUBTRACT"),

	/**
	 * The '<em><b>KEYPAD DECIMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_DECIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_DECIMAL(256, "KEYPAD_DECIMAL", "KEYPAD_DECIMAL"),

	/**
	 * The '<em><b>KEYPAD DIVIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_DIVIDE_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_DIVIDE(257, "KEYPAD_DIVIDE", "KEYPAD_DIVIDE"),

	/**
	 * The '<em><b>KEYPAD 0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_0_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_0(258, "KEYPAD_0", "KEYPAD_0"),

	/**
	 * The '<em><b>KEYPAD 1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_1_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_1(259, "KEYPAD_1", "KEYPAD_1"),

	/**
	 * The '<em><b>KEYPAD 2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_2_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_2(260, "KEYPAD_2", "KEYPAD_2"),

	/**
	 * The '<em><b>KEYPAD 3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_3_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_3(261, "KEYPAD_3", "KEYPAD_3"),

	/**
	 * The '<em><b>KEYPAD 4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_4_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_4(262, "KEYPAD_4", "KEYPAD_4"),

	/**
	 * The '<em><b>KEYPAD 5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_5_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_5(263, "KEYPAD_5", "KEYPAD_5"),

	/**
	 * The '<em><b>KEYPAD 6</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_6_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_6(264, "KEYPAD_6", "KEYPAD_6"),

	/**
	 * The '<em><b>KEYPAD 7</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_7_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_7(265, "KEYPAD_7", "KEYPAD_7"),

	/**
	 * The '<em><b>KEYPAD 8</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_8_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_8(266, "KEYPAD_8", "KEYPAD_8"),

	/**
	 * The '<em><b>KEYPAD 9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_9_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_9(267, "KEYPAD_9", "KEYPAD_9"),

	/**
	 * The '<em><b>KEYPAD EQUAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_EQUAL_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_EQUAL(268, "KEYPAD_EQUAL", "KEYPAD_EQUAL"),

	/**
	 * The '<em><b>KEYPAD CR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_CR_VALUE
	 * @generated
	 * @ordered
	 */
	KEYPAD_CR(269, "KEYPAD_CR", "KEYPAD_CR"),

	/**
	 * The '<em><b>CAPS LOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAPS_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	CAPS_LOCK(271, "CAPS_LOCK", "CAPS_LOCK"),

	/**
	 * The '<em><b>NUM LOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUM_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	NUM_LOCK(272, "NUM_LOCK", "NUM_LOCK"),

	/**
	 * The '<em><b>SCROLL LOCK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLL_LOCK_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLL_LOCK(273, "SCROLL_LOCK", "SCROLL_LOCK"),

	/**
	 * The '<em><b>PAUSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSE_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSE(274, "PAUSE", "PAUSE"),

	/**
	 * The '<em><b>BREAK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BREAK_VALUE
	 * @generated
	 * @ordered
	 */
	BREAK(275, "BREAK", "BREAK"),

	/**
	 * The '<em><b>PRINT SCREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRINT_SCREEN_VALUE
	 * @generated
	 * @ordered
	 */
	PRINT_SCREEN(276, "PRINT_SCREEN", "PRINT_SCREEN"),

	/**
	 * The '<em><b>ICON ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_ERROR(277, "ICON_ERROR", "ICON_ERROR"),

	/**
	 * The '<em><b>ICON INFORMATION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_INFORMATION_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_INFORMATION(278, "ICON_INFORMATION", "ICON_INFORMATION"),

	/**
	 * The '<em><b>ICON QUESTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_QUESTION_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_QUESTION(279, "ICON_QUESTION", "ICON_QUESTION"),

	/**
	 * The '<em><b>ICON WARNING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_WARNING_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_WARNING(280, "ICON_WARNING", "ICON_WARNING"),

	/**
	 * The '<em><b>ICON WORKING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_WORKING_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_WORKING(281, "ICON_WORKING", "ICON_WORKING"),

	/**
	 * The '<em><b>ICON SEARCH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_SEARCH_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_SEARCH(282, "ICON_SEARCH", "ICON_SEARCH"),

	/**
	 * The '<em><b>ICON CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	ICON_CANCEL(283, "ICON_CANCEL", "ICON_CANCEL"),

	/**
	 * The '<em><b>OK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OK_VALUE
	 * @generated
	 * @ordered
	 */
	OK(284, "OK", "OK"),

	/**
	 * The '<em><b>YES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #YES_VALUE
	 * @generated
	 * @ordered
	 */
	YES(285, "YES", "YES"),

	/**
	 * The '<em><b>NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_VALUE
	 * @generated
	 * @ordered
	 */
	NO(286, "NO", "NO"),

	/**
	 * The '<em><b>CANCEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CANCEL_VALUE
	 * @generated
	 * @ordered
	 */
	CANCEL(287, "CANCEL", "CANCEL"),

	/**
	 * The '<em><b>ABORT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABORT_VALUE
	 * @generated
	 * @ordered
	 */
	ABORT(288, "ABORT", "ABORT"),

	/**
	 * The '<em><b>RETRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RETRY_VALUE
	 * @generated
	 * @ordered
	 */
	RETRY(289, "RETRY", "RETRY"),

	/**
	 * The '<em><b>IGNORE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IGNORE_VALUE
	 * @generated
	 * @ordered
	 */
	IGNORE(290, "IGNORE", "IGNORE"),

	/**
	 * The '<em><b>OPEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OPEN_VALUE
	 * @generated
	 * @ordered
	 */
	OPEN(291, "OPEN", "OPEN"),

	/**
	 * The '<em><b>SAVE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SAVE_VALUE
	 * @generated
	 * @ordered
	 */
	SAVE(292, "SAVE", "SAVE"),

	/**
	 * The '<em><b>INHERIT NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT_NONE(293, "INHERIT_NONE", "INHERIT_NONE"),

	/**
	 * The '<em><b>INHERIT DEFAULT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT_DEFAULT(294, "INHERIT_DEFAULT", "INHERIT_DEFAULT"),

	/**
	 * The '<em><b>INHERIT FORCE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INHERIT_FORCE_VALUE
	 * @generated
	 * @ordered
	 */
	INHERIT_FORCE(295, "INHERIT_FORCE", "INHERIT_FORCE"),

	/**
	 * The '<em><b>COLOR WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WHITE(296, "COLOR_WHITE", "COLOR_WHITE"),

	/**
	 * The '<em><b>COLOR BLACK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BLACK_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_BLACK(297, "COLOR_BLACK", "COLOR_BLACK"),

	/**
	 * The '<em><b>COLOR RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_RED_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_RED(298, "COLOR_RED", "COLOR_RED"),

	/**
	 * The '<em><b>COLOR DARK RED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_RED_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_RED(299, "COLOR_DARK_RED", "COLOR_DARK_RED"),

	/**
	 * The '<em><b>COLOR GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_GREEN(300, "COLOR_GREEN", "COLOR_GREEN"),

	/**
	 * The '<em><b>COLOR DARK GREEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_GREEN_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_GREEN(301, "COLOR_DARK_GREEN", "COLOR_DARK_GREEN"),

	/**
	 * The '<em><b>COLOR YELLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_YELLOW(302, "COLOR_YELLOW", "COLOR_YELLOW"),

	/**
	 * The '<em><b>COLOR DARK YELLOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_YELLOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_YELLOW(303, "COLOR_DARK_YELLOW", "COLOR_DARK_YELLOW"),

	/**
	 * The '<em><b>COLOR BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_BLUE(304, "COLOR_BLUE", "COLOR_BLUE"),

	/**
	 * The '<em><b>COLOR DARK BLUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_BLUE_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_BLUE(305, "COLOR_DARK_BLUE", "COLOR_DARK_BLUE"),

	/**
	 * The '<em><b>COLOR MAGENTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_MAGENTA(306, "COLOR_MAGENTA", "COLOR_MAGENTA"),

	/**
	 * The '<em><b>COLOR DARK MAGENTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_MAGENTA_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_MAGENTA(307, "COLOR_DARK_MAGENTA", "COLOR_DARK_MAGENTA"),

	/**
	 * The '<em><b>COLOR CYAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_CYAN(308, "COLOR_CYAN", "COLOR_CYAN"),

	/**
	 * The '<em><b>COLOR DARK CYAN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_CYAN_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_CYAN(309, "COLOR_DARK_CYAN", "COLOR_DARK_CYAN"),

	/**
	 * The '<em><b>COLOR GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_GRAY(310, "COLOR_GRAY", "COLOR_GRAY"),

	/**
	 * The '<em><b>COLOR DARK GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_DARK_GRAY(311, "COLOR_DARK_GRAY", "COLOR_DARK_GRAY"),

	/**
	 * The '<em><b>COLOR WIDGET DARK SHADOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_DARK_SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_DARK_SHADOW(312, "COLOR_WIDGET_DARK_SHADOW", "COLOR_WIDGET_DARK_SHADOW"),

	/**
	 * The '<em><b>COLOR WIDGET NORMAL SHADOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_NORMAL_SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_NORMAL_SHADOW(313, "COLOR_WIDGET_NORMAL_SHADOW", "COLOR_WIDGET_NORMAL_SHADOW"),

	/**
	 * The '<em><b>COLOR WIDGET LIGHT SHADOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_LIGHT_SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_LIGHT_SHADOW(314, "COLOR_WIDGET_LIGHT_SHADOW", "COLOR_WIDGET_LIGHT_SHADOW"),

	/**
	 * The '<em><b>COLOR WIDGET HIGHLIGHT SHADOW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_HIGHLIGHT_SHADOW_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_HIGHLIGHT_SHADOW(315, "COLOR_WIDGET_HIGHLIGHT_SHADOW", "COLOR_WIDGET_HIGHLIGHT_SHADOW"),

	/**
	 * The '<em><b>COLOR WIDGET FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_FOREGROUND(316, "COLOR_WIDGET_FOREGROUND", "COLOR_WIDGET_FOREGROUND"),

	/**
	 * The '<em><b>COLOR WIDGET BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_BACKGROUND(317, "COLOR_WIDGET_BACKGROUND", "COLOR_WIDGET_BACKGROUND"),

	/**
	 * The '<em><b>COLOR WIDGET BORDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_BORDER_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_WIDGET_BORDER(318, "COLOR_WIDGET_BORDER", "COLOR_WIDGET_BORDER"),

	/**
	 * The '<em><b>COLOR LIST FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_LIST_FOREGROUND(319, "COLOR_LIST_FOREGROUND", "COLOR_LIST_FOREGROUND"),

	/**
	 * The '<em><b>COLOR LIST BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_LIST_BACKGROUND(320, "COLOR_LIST_BACKGROUND", "COLOR_LIST_BACKGROUND"),

	/**
	 * The '<em><b>COLOR LIST SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_LIST_SELECTION(321, "COLOR_LIST_SELECTION", "COLOR_LIST_SELECTION"),

	/**
	 * The '<em><b>COLOR LIST SELECTION TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_SELECTION_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_LIST_SELECTION_TEXT(322, "COLOR_LIST_SELECTION_TEXT", "COLOR_LIST_SELECTION_TEXT"),

	/**
	 * The '<em><b>COLOR INFO FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_INFO_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_INFO_FOREGROUND(323, "COLOR_INFO_FOREGROUND", "COLOR_INFO_FOREGROUND"),

	/**
	 * The '<em><b>COLOR INFO BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_INFO_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_INFO_BACKGROUND(324, "COLOR_INFO_BACKGROUND", "COLOR_INFO_BACKGROUND"),

	/**
	 * The '<em><b>COLOR TITLE FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_FOREGROUND(325, "COLOR_TITLE_FOREGROUND", "COLOR_TITLE_FOREGROUND"),

	/**
	 * The '<em><b>COLOR TITLE BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_BACKGROUND(326, "COLOR_TITLE_BACKGROUND", "COLOR_TITLE_BACKGROUND"),

	/**
	 * The '<em><b>COLOR TITLE BACKGROUND GRADIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_BACKGROUND_GRADIENT_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_BACKGROUND_GRADIENT(327, "COLOR_TITLE_BACKGROUND_GRADIENT", "COLOR_TITLE_BACKGROUND_GRADIENT"),

	/**
	 * The '<em><b>COLOR TITLE INACTIVE FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_INACTIVE_FOREGROUND(328, "COLOR_TITLE_INACTIVE_FOREGROUND", "COLOR_TITLE_INACTIVE_FOREGROUND"),

	/**
	 * The '<em><b>COLOR TITLE INACTIVE BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_INACTIVE_BACKGROUND(329, "COLOR_TITLE_INACTIVE_BACKGROUND", "COLOR_TITLE_INACTIVE_BACKGROUND"),

	/**
	 * The '<em><b>COLOR TITLE INACTIVE BACKGROUND GRADIENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT(330, "COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT", "COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT"),

	/**
	 * The '<em><b>COLOR LINK FOREGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_LINK_FOREGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_LINK_FOREGROUND(331, "COLOR_LINK_FOREGROUND", "COLOR_LINK_FOREGROUND"),

	/**
	 * The '<em><b>COLOR TRANSPARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COLOR_TRANSPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	COLOR_TRANSPARENT(332, "COLOR_TRANSPARENT", "COLOR_TRANSPARENT"),

	/**
	 * The '<em><b>DRAW TRANSPARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW_TRANSPARENT_VALUE
	 * @generated
	 * @ordered
	 */
	DRAW_TRANSPARENT(333, "DRAW_TRANSPARENT", "DRAW_TRANSPARENT"),

	/**
	 * The '<em><b>DRAW DELIMITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW_DELIMITER_VALUE
	 * @generated
	 * @ordered
	 */
	DRAW_DELIMITER(334, "DRAW_DELIMITER", "DRAW_DELIMITER"),

	/**
	 * The '<em><b>DRAW TAB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW_TAB_VALUE
	 * @generated
	 * @ordered
	 */
	DRAW_TAB(335, "DRAW_TAB", "DRAW_TAB"),

	/**
	 * The '<em><b>DRAW MNEMONIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRAW_MNEMONIC_VALUE
	 * @generated
	 * @ordered
	 */
	DRAW_MNEMONIC(336, "DRAW_MNEMONIC", "DRAW_MNEMONIC"),

	/**
	 * The '<em><b>DELIMITER SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DELIMITER_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	DELIMITER_SELECTION(337, "DELIMITER_SELECTION", "DELIMITER_SELECTION"),

	/**
	 * The '<em><b>LAST LINE SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LAST_LINE_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	LAST_LINE_SELECTION(338, "LAST_LINE_SELECTION", "LAST_LINE_SELECTION"),

	/**
	 * The '<em><b>ERROR UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_UNSPECIFIED(339, "ERROR_UNSPECIFIED", "ERROR_UNSPECIFIED"),

	/**
	 * The '<em><b>ERROR NO HANDLES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_HANDLES_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_NO_HANDLES(340, "ERROR_NO_HANDLES", "ERROR_NO_HANDLES"),

	/**
	 * The '<em><b>ERROR NO MORE CALLBACKS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_MORE_CALLBACKS_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_NO_MORE_CALLBACKS(341, "ERROR_NO_MORE_CALLBACKS", "ERROR_NO_MORE_CALLBACKS"),

	/**
	 * The '<em><b>ERROR NULL ARGUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_NULL_ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_NULL_ARGUMENT(342, "ERROR_NULL_ARGUMENT", "ERROR_NULL_ARGUMENT"),

	/**
	 * The '<em><b>ERROR INVALID ARGUMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_ARGUMENT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_ARGUMENT(343, "ERROR_INVALID_ARGUMENT", "ERROR_INVALID_ARGUMENT"),

	/**
	 * The '<em><b>ERROR INVALID RANGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_RANGE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_RANGE(344, "ERROR_INVALID_RANGE", "ERROR_INVALID_RANGE"),

	/**
	 * The '<em><b>ERROR CANNOT BE ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_BE_ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_BE_ZERO(345, "ERROR_CANNOT_BE_ZERO", "ERROR_CANNOT_BE_ZERO"),

	/**
	 * The '<em><b>ERROR CANNOT GET ITEM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_ITEM(346, "ERROR_CANNOT_GET_ITEM", "ERROR_CANNOT_GET_ITEM"),

	/**
	 * The '<em><b>ERROR CANNOT GET SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_SELECTION(347, "ERROR_CANNOT_GET_SELECTION", "ERROR_CANNOT_GET_SELECTION"),

	/**
	 * The '<em><b>ERROR CANNOT INVERT MATRIX</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_INVERT_MATRIX_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_INVERT_MATRIX(348, "ERROR_CANNOT_INVERT_MATRIX", "ERROR_CANNOT_INVERT_MATRIX"),

	/**
	 * The '<em><b>ERROR CANNOT GET ITEM HEIGHT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ITEM_HEIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_ITEM_HEIGHT(349, "ERROR_CANNOT_GET_ITEM_HEIGHT", "ERROR_CANNOT_GET_ITEM_HEIGHT"),

	/**
	 * The '<em><b>ERROR CANNOT GET TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_TEXT(350, "ERROR_CANNOT_GET_TEXT", "ERROR_CANNOT_GET_TEXT"),

	/**
	 * The '<em><b>ERROR CANNOT SET TEXT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_SET_TEXT(351, "ERROR_CANNOT_SET_TEXT", "ERROR_CANNOT_SET_TEXT"),

	/**
	 * The '<em><b>ERROR ITEM NOT ADDED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_ITEM_NOT_ADDED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_ITEM_NOT_ADDED(352, "ERROR_ITEM_NOT_ADDED", "ERROR_ITEM_NOT_ADDED"),

	/**
	 * The '<em><b>ERROR ITEM NOT REMOVED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_ITEM_NOT_REMOVED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_ITEM_NOT_REMOVED(353, "ERROR_ITEM_NOT_REMOVED", "ERROR_ITEM_NOT_REMOVED"),

	/**
	 * The '<em><b>ERROR NO GRAPHICS LIBRARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_GRAPHICS_LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_NO_GRAPHICS_LIBRARY(354, "ERROR_NO_GRAPHICS_LIBRARY", "ERROR_NO_GRAPHICS_LIBRARY"),

	/**
	 * The '<em><b>ERROR NOT IMPLEMENTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_NOT_IMPLEMENTED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_NOT_IMPLEMENTED(355, "ERROR_NOT_IMPLEMENTED", "ERROR_NOT_IMPLEMENTED"),

	/**
	 * The '<em><b>ERROR MENU NOT DROP DOWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_DROP_DOWN_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_MENU_NOT_DROP_DOWN(356, "ERROR_MENU_NOT_DROP_DOWN", "ERROR_MENU_NOT_DROP_DOWN"),

	/**
	 * The '<em><b>ERROR THREAD INVALID ACCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_THREAD_INVALID_ACCESS_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_THREAD_INVALID_ACCESS(357, "ERROR_THREAD_INVALID_ACCESS", "ERROR_THREAD_INVALID_ACCESS"),

	/**
	 * The '<em><b>ERROR WIDGET DISPOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_WIDGET_DISPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_WIDGET_DISPOSED(358, "ERROR_WIDGET_DISPOSED", "ERROR_WIDGET_DISPOSED"),

	/**
	 * The '<em><b>ERROR MENUITEM NOT CASCADE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENUITEM_NOT_CASCADE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_MENUITEM_NOT_CASCADE(359, "ERROR_MENUITEM_NOT_CASCADE", "ERROR_MENUITEM_NOT_CASCADE"),

	/**
	 * The '<em><b>ERROR CANNOT SET SELECTION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_SELECTION_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_SET_SELECTION(360, "ERROR_CANNOT_SET_SELECTION", "ERROR_CANNOT_SET_SELECTION"),

	/**
	 * The '<em><b>ERROR CANNOT SET MENU</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_MENU_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_SET_MENU(361, "ERROR_CANNOT_SET_MENU", "ERROR_CANNOT_SET_MENU"),

	/**
	 * The '<em><b>ERROR CANNOT SET ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_SET_ENABLED(362, "ERROR_CANNOT_SET_ENABLED", "ERROR_CANNOT_SET_ENABLED"),

	/**
	 * The '<em><b>ERROR CANNOT GET ENABLED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ENABLED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_ENABLED(363, "ERROR_CANNOT_GET_ENABLED", "ERROR_CANNOT_GET_ENABLED"),

	/**
	 * The '<em><b>ERROR INVALID PARENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_PARENT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_PARENT(364, "ERROR_INVALID_PARENT", "ERROR_INVALID_PARENT"),

	/**
	 * The '<em><b>ERROR MENU NOT BAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_BAR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_MENU_NOT_BAR(365, "ERROR_MENU_NOT_BAR", "ERROR_MENU_NOT_BAR"),

	/**
	 * The '<em><b>ERROR CANNOT GET COUNT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_COUNT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_CANNOT_GET_COUNT(366, "ERROR_CANNOT_GET_COUNT", "ERROR_CANNOT_GET_COUNT"),

	/**
	 * The '<em><b>ERROR MENU NOT POP UP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_POP_UP_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_MENU_NOT_POP_UP(367, "ERROR_MENU_NOT_POP_UP", "ERROR_MENU_NOT_POP_UP"),

	/**
	 * The '<em><b>ERROR UNSUPPORTED DEPTH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSUPPORTED_DEPTH_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_UNSUPPORTED_DEPTH(368, "ERROR_UNSUPPORTED_DEPTH", "ERROR_UNSUPPORTED_DEPTH"),

	/**
	 * The '<em><b>ERROR IO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_IO_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_IO(369, "ERROR_IO", "ERROR_IO"),

	/**
	 * The '<em><b>ERROR INVALID IMAGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_IMAGE(370, "ERROR_INVALID_IMAGE", "ERROR_INVALID_IMAGE"),

	/**
	 * The '<em><b>ERROR UNSUPPORTED FORMAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSUPPORTED_FORMAT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_UNSUPPORTED_FORMAT(371, "ERROR_UNSUPPORTED_FORMAT", "ERROR_UNSUPPORTED_FORMAT"),

	/**
	 * The '<em><b>ERROR INVALID SUBCLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_SUBCLASS_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_SUBCLASS(372, "ERROR_INVALID_SUBCLASS", "ERROR_INVALID_SUBCLASS"),

	/**
	 * The '<em><b>ERROR GRAPHIC DISPOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_GRAPHIC_DISPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_GRAPHIC_DISPOSED(373, "ERROR_GRAPHIC_DISPOSED", "ERROR_GRAPHIC_DISPOSED"),

	/**
	 * The '<em><b>ERROR DEVICE DISPOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_DEVICE_DISPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_DEVICE_DISPOSED(374, "ERROR_DEVICE_DISPOSED", "ERROR_DEVICE_DISPOSED"),

	/**
	 * The '<em><b>ERROR FAILED EXEC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_EXEC_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_FAILED_EXEC(375, "ERROR_FAILED_EXEC", "ERROR_FAILED_EXEC"),

	/**
	 * The '<em><b>ERROR FAILED LOAD LIBRARY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_LOAD_LIBRARY_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_FAILED_LOAD_LIBRARY(376, "ERROR_FAILED_LOAD_LIBRARY", "ERROR_FAILED_LOAD_LIBRARY"),

	/**
	 * The '<em><b>ERROR INVALID FONT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_FONT_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_FONT(377, "ERROR_INVALID_FONT", "ERROR_INVALID_FONT"),

	/**
	 * The '<em><b>ERROR FUNCTION DISPOSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_FUNCTION_DISPOSED_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_FUNCTION_DISPOSED(378, "ERROR_FUNCTION_DISPOSED", "ERROR_FUNCTION_DISPOSED"),

	/**
	 * The '<em><b>ERROR FAILED EVALUATE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_EVALUATE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_FAILED_EVALUATE(379, "ERROR_FAILED_EVALUATE", "ERROR_FAILED_EVALUATE"),

	/**
	 * The '<em><b>ERROR INVALID RETURN VALUE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_RETURN_VALUE_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR_INVALID_RETURN_VALUE(380, "ERROR_INVALID_RETURN_VALUE", "ERROR_INVALID_RETURN_VALUE"),

	/**
	 * The '<em><b>BITMAP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BITMAP_VALUE
	 * @generated
	 * @ordered
	 */
	BITMAP(381, "BITMAP", "BITMAP"),

	/**
	 * The '<em><b>ICON</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ICON_VALUE
	 * @generated
	 * @ordered
	 */
	ICON(382, "ICON", "ICON"),

	/**
	 * The '<em><b>IMAGE COPY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_COPY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_COPY(383, "IMAGE_COPY", "IMAGE_COPY"),

	/**
	 * The '<em><b>IMAGE DISABLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DISABLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_DISABLE(384, "IMAGE_DISABLE", "IMAGE_DISABLE"),

	/**
	 * The '<em><b>IMAGE GRAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GRAY_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GRAY(385, "IMAGE_GRAY", "IMAGE_GRAY"),

	/**
	 * The '<em><b>ERROR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ERROR_VALUE
	 * @generated
	 * @ordered
	 */
	ERROR(386, "ERROR", "ERROR"),

	/**
	 * The '<em><b>PAUSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAUSED_VALUE
	 * @generated
	 * @ordered
	 */
	PAUSED(387, "PAUSED", "PAUSED"),

	/**
	 * The '<em><b>NORMAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	NORMAL(388, "NORMAL", "NORMAL"),

	/**
	 * The '<em><b>BOLD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BOLD_VALUE
	 * @generated
	 * @ordered
	 */
	BOLD(389, "BOLD", "BOLD"),

	/**
	 * The '<em><b>ITALIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ITALIC_VALUE
	 * @generated
	 * @ordered
	 */
	ITALIC(390, "ITALIC", "ITALIC"),

	/**
	 * The '<em><b>CURSOR ARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_ARROW(391, "CURSOR_ARROW", "CURSOR_ARROW"),

	/**
	 * The '<em><b>CURSOR WAIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_WAIT_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_WAIT(392, "CURSOR_WAIT", "CURSOR_WAIT"),

	/**
	 * The '<em><b>CURSOR CROSS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_CROSS_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_CROSS(393, "CURSOR_CROSS", "CURSOR_CROSS"),

	/**
	 * The '<em><b>CURSOR APPSTARTING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_APPSTARTING_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_APPSTARTING(394, "CURSOR_APPSTARTING", "CURSOR_APPSTARTING"),

	/**
	 * The '<em><b>CURSOR HELP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_HELP_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_HELP(395, "CURSOR_HELP", "CURSOR_HELP"),

	/**
	 * The '<em><b>CURSOR SIZEALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEALL_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZEALL(396, "CURSOR_SIZEALL", "CURSOR_SIZEALL"),

	/**
	 * The '<em><b>CURSOR SIZENESW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENESW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZENESW(397, "CURSOR_SIZENESW", "CURSOR_SIZENESW"),

	/**
	 * The '<em><b>CURSOR SIZENS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENS_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZENS(398, "CURSOR_SIZENS", "CURSOR_SIZENS"),

	/**
	 * The '<em><b>CURSOR SIZENWSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENWSE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZENWSE(399, "CURSOR_SIZENWSE", "CURSOR_SIZENWSE"),

	/**
	 * The '<em><b>CURSOR SIZEWE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEWE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZEWE(400, "CURSOR_SIZEWE", "CURSOR_SIZEWE"),

	/**
	 * The '<em><b>CURSOR SIZEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEN_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZEN(401, "CURSOR_SIZEN", "CURSOR_SIZEN"),

	/**
	 * The '<em><b>CURSOR SIZES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZES_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZES(402, "CURSOR_SIZES", "CURSOR_SIZES"),

	/**
	 * The '<em><b>CURSOR SIZEE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZEE(403, "CURSOR_SIZEE", "CURSOR_SIZEE"),

	/**
	 * The '<em><b>CURSOR SIZEW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZEW(404, "CURSOR_SIZEW", "CURSOR_SIZEW"),

	/**
	 * The '<em><b>CURSOR SIZENE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZENE(405, "CURSOR_SIZENE", "CURSOR_SIZENE"),

	/**
	 * The '<em><b>CURSOR SIZESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZESE_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZESE(406, "CURSOR_SIZESE", "CURSOR_SIZESE"),

	/**
	 * The '<em><b>CURSOR SIZESW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZESW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZESW(407, "CURSOR_SIZESW", "CURSOR_SIZESW"),

	/**
	 * The '<em><b>CURSOR SIZENW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_SIZENW(408, "CURSOR_SIZENW", "CURSOR_SIZENW"),

	/**
	 * The '<em><b>CURSOR UPARROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_UPARROW_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_UPARROW(409, "CURSOR_UPARROW", "CURSOR_UPARROW"),

	/**
	 * The '<em><b>CURSOR IBEAM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_IBEAM_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_IBEAM(410, "CURSOR_IBEAM", "CURSOR_IBEAM"),

	/**
	 * The '<em><b>CURSOR NO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_NO_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_NO(411, "CURSOR_NO", "CURSOR_NO"),

	/**
	 * The '<em><b>CURSOR HAND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CURSOR_HAND_VALUE
	 * @generated
	 * @ordered
	 */
	CURSOR_HAND(412, "CURSOR_HAND", "CURSOR_HAND"),

	/**
	 * The '<em><b>CAP FLAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAP_FLAT_VALUE
	 * @generated
	 * @ordered
	 */
	CAP_FLAT(413, "CAP_FLAT", "CAP_FLAT"),

	/**
	 * The '<em><b>CAP ROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAP_ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	CAP_ROUND(414, "CAP_ROUND", "CAP_ROUND"),

	/**
	 * The '<em><b>CAP SQUARE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CAP_SQUARE_VALUE
	 * @generated
	 * @ordered
	 */
	CAP_SQUARE(415, "CAP_SQUARE", "CAP_SQUARE"),

	/**
	 * The '<em><b>JOIN MITER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_MITER_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN_MITER(416, "JOIN_MITER", "JOIN_MITER"),

	/**
	 * The '<em><b>JOIN ROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN_ROUND(417, "JOIN_ROUND", "JOIN_ROUND"),

	/**
	 * The '<em><b>JOIN BEVEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JOIN_BEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	JOIN_BEVEL(418, "JOIN_BEVEL", "JOIN_BEVEL"),

	/**
	 * The '<em><b>LINE SOLID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_SOLID_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_SOLID(419, "LINE_SOLID", "LINE_SOLID"),

	/**
	 * The '<em><b>LINE DASH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASH_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DASH(420, "LINE_DASH", "LINE_DASH"),

	/**
	 * The '<em><b>LINE DOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DOT_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DOT(421, "LINE_DOT", "LINE_DOT"),

	/**
	 * The '<em><b>LINE DASHDOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOT_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DASHDOT(422, "LINE_DASHDOT", "LINE_DASHDOT"),

	/**
	 * The '<em><b>LINE DASHDOTDOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOTDOT_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_DASHDOTDOT(423, "LINE_DASHDOTDOT", "LINE_DASHDOTDOT"),

	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LINE_CUSTOM_VALUE
	 * @generated
	 * @ordered
	 */
	LINE_CUSTOM(424, "LINE_CUSTOM", "LINE_CUSTOM"),

	/**
	 * The '<em><b>PATH MOVE TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_MOVE_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_MOVE_TO(425, "PATH_MOVE_TO", "PATH_MOVE_TO"),

	/**
	 * The '<em><b>PATH LINE TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_LINE_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_LINE_TO(426, "PATH_LINE_TO", "PATH_LINE_TO"),

	/**
	 * The '<em><b>PATH QUAD TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_QUAD_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_QUAD_TO(427, "PATH_QUAD_TO", "PATH_QUAD_TO"),

	/**
	 * The '<em><b>PATH CUBIC TO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_CUBIC_TO_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_CUBIC_TO(428, "PATH_CUBIC_TO", "PATH_CUBIC_TO"),

	/**
	 * The '<em><b>PATH CLOSE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PATH_CLOSE_VALUE
	 * @generated
	 * @ordered
	 */
	PATH_CLOSE(429, "PATH_CLOSE", "PATH_CLOSE"),

	/**
	 * The '<em><b>FILL EVEN ODD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_EVEN_ODD_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_EVEN_ODD(430, "FILL_EVEN_ODD", "FILL_EVEN_ODD"),

	/**
	 * The '<em><b>FILL WINDING</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_WINDING_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_WINDING(431, "FILL_WINDING", "FILL_WINDING"),

	/**
	 * The '<em><b>IMAGE UNDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_UNDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_UNDEFINED(432, "IMAGE_UNDEFINED", "IMAGE_UNDEFINED"),

	/**
	 * The '<em><b>IMAGE BMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_BMP_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_BMP(433, "IMAGE_BMP", "IMAGE_BMP"),

	/**
	 * The '<em><b>IMAGE BMP RLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_BMP_RLE_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_BMP_RLE(434, "IMAGE_BMP_RLE", "IMAGE_BMP_RLE"),

	/**
	 * The '<em><b>IMAGE GIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_GIF(435, "IMAGE_GIF", "IMAGE_GIF"),

	/**
	 * The '<em><b>IMAGE ICO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_ICO_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_ICO(436, "IMAGE_ICO", "IMAGE_ICO"),

	/**
	 * The '<em><b>IMAGE JPEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_JPEG(437, "IMAGE_JPEG", "IMAGE_JPEG"),

	/**
	 * The '<em><b>IMAGE PNG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_PNG(438, "IMAGE_PNG", "IMAGE_PNG"),

	/**
	 * The '<em><b>IMAGE TIFF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_TIFF(439, "IMAGE_TIFF", "IMAGE_TIFF"),

	/**
	 * The '<em><b>IMAGE OS2 BMP</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IMAGE_OS2_BMP_VALUE
	 * @generated
	 * @ordered
	 */
	IMAGE_OS2_BMP(440, "IMAGE_OS2_BMP", "IMAGE_OS2_BMP"),

	/**
	 * The '<em><b>DM UNSPECIFIED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_UNSPECIFIED_VALUE
	 * @generated
	 * @ordered
	 */
	DM_UNSPECIFIED(441, "DM_UNSPECIFIED", "DM_UNSPECIFIED"),

	/**
	 * The '<em><b>DM FILL NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	DM_FILL_NONE(442, "DM_FILL_NONE", "DM_FILL_NONE"),

	/**
	 * The '<em><b>DM FILL BACKGROUND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_BACKGROUND_VALUE
	 * @generated
	 * @ordered
	 */
	DM_FILL_BACKGROUND(443, "DM_FILL_BACKGROUND", "DM_FILL_BACKGROUND"),

	/**
	 * The '<em><b>DM FILL PREVIOUS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_PREVIOUS_VALUE
	 * @generated
	 * @ordered
	 */
	DM_FILL_PREVIOUS(444, "DM_FILL_PREVIOUS", "DM_FILL_PREVIOUS"),

	/**
	 * The '<em><b>TRANSPARENCY NONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_NONE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENCY_NONE(445, "TRANSPARENCY_NONE", "TRANSPARENCY_NONE"),

	/**
	 * The '<em><b>TRANSPARENCY ALPHA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_ALPHA_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENCY_ALPHA(446, "TRANSPARENCY_ALPHA", "TRANSPARENCY_ALPHA"),

	/**
	 * The '<em><b>TRANSPARENCY MASK</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_MASK_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENCY_MASK(447, "TRANSPARENCY_MASK", "TRANSPARENCY_MASK"),

	/**
	 * The '<em><b>TRANSPARENCY PIXEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_PIXEL_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSPARENCY_PIXEL(448, "TRANSPARENCY_PIXEL", "TRANSPARENCY_PIXEL"),

	/**
	 * The '<em><b>MOVEMENT CHAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_CHAR_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_CHAR(449, "MOVEMENT_CHAR", "MOVEMENT_CHAR"),

	/**
	 * The '<em><b>MOVEMENT CLUSTER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_CLUSTER_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_CLUSTER(450, "MOVEMENT_CLUSTER", "MOVEMENT_CLUSTER"),

	/**
	 * The '<em><b>MOVEMENT WORD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_WORD(451, "MOVEMENT_WORD", "MOVEMENT_WORD"),

	/**
	 * The '<em><b>MOVEMENT WORD END</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD_END_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_WORD_END(452, "MOVEMENT_WORD_END", "MOVEMENT_WORD_END"),

	/**
	 * The '<em><b>MOVEMENT WORD START</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD_START_VALUE
	 * @generated
	 * @ordered
	 */
	MOVEMENT_WORD_START(453, "MOVEMENT_WORD_START", "MOVEMENT_WORD_START"),

	/**
	 * The '<em><b>ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ALL(454, "ALL", "ALL"),

	/**
	 * The '<em><b>ID ABOUT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_ABOUT_VALUE
	 * @generated
	 * @ordered
	 */
	ID_ABOUT(455, "ID_ABOUT", "ID_ABOUT"),

	/**
	 * The '<em><b>ID PREFERENCES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_PREFERENCES_VALUE
	 * @generated
	 * @ordered
	 */
	ID_PREFERENCES(456, "ID_PREFERENCES", "ID_PREFERENCES"),

	/**
	 * The '<em><b>ID HIDE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_HIDE_VALUE
	 * @generated
	 * @ordered
	 */
	ID_HIDE(457, "ID_HIDE", "ID_HIDE"),

	/**
	 * The '<em><b>ID HIDE OTHERS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_HIDE_OTHERS_VALUE
	 * @generated
	 * @ordered
	 */
	ID_HIDE_OTHERS(458, "ID_HIDE_OTHERS", "ID_HIDE_OTHERS"),

	/**
	 * The '<em><b>ID SHOW ALL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_SHOW_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	ID_SHOW_ALL(459, "ID_SHOW_ALL", "ID_SHOW_ALL"),

	/**
	 * The '<em><b>ID QUIT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ID_QUIT_VALUE
	 * @generated
	 * @ordered
	 */
	ID_QUIT(460, "ID_QUIT", "ID_QUIT"),

	/**
	 * The '<em><b>SKIN CLASS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SKIN_CLASS_VALUE
	 * @generated
	 * @ordered
	 */
	SKIN_CLASS(461, "SKIN_CLASS", "SKIN_CLASS"),

	/**
	 * The '<em><b>SCROLLBAR OVERLAY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SCROLLBAR_OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	SCROLLBAR_OVERLAY(463, "SCROLLBAR_OVERLAY", "SCROLLBAR_OVERLAY");

	/**
	 * The '<em><b>None</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>None</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NONE
	 * @model name="None"
	 * @generated
	 * @ordered
	 */
	public static final int NONE_VALUE = 0;

	/**
	 * The '<em><b>Key Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Key Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY_DOWN
	 * @model name="KeyDown"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_DOWN_VALUE = 1;

	/**
	 * The '<em><b>Key Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Key Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY_UP
	 * @model name="KeyUp"
	 * @generated
	 * @ordered
	 */
	public static final int KEY_UP_VALUE = 2;

	/**
	 * The '<em><b>Mouse Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_DOWN
	 * @model name="MouseDown"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_DOWN_VALUE = 3;

	/**
	 * The '<em><b>Mouse Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_UP
	 * @model name="MouseUp"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_UP_VALUE = 4;

	/**
	 * The '<em><b>Mouse Move</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Move</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_MOVE
	 * @model name="MouseMove"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_MOVE_VALUE = 5;

	/**
	 * The '<em><b>Mouse Enter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Enter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_ENTER
	 * @model name="MouseEnter"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_ENTER_VALUE = 6;

	/**
	 * The '<em><b>Mouse Exit</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Exit</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_EXIT
	 * @model name="MouseExit"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_EXIT_VALUE = 7;

	/**
	 * The '<em><b>Mouse Double Click</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Double Click</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_DOUBLE_CLICK
	 * @model name="MouseDoubleClick"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_DOUBLE_CLICK_VALUE = 8;

	/**
	 * The '<em><b>Paint</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paint</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAINT
	 * @model name="Paint"
	 * @generated
	 * @ordered
	 */
	public static final int PAINT_VALUE = 9;

	/**
	 * The '<em><b>Move</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Move</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVE
	 * @model name="Move"
	 * @generated
	 * @ordered
	 */
	public static final int MOVE_VALUE = 10;

	/**
	 * The '<em><b>Resize</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Resize</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RESIZE
	 * @model name="Resize"
	 * @generated
	 * @ordered
	 */
	public static final int RESIZE_VALUE = 11;

	/**
	 * The '<em><b>Dispose</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispose</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPOSE
	 * @model name="Dispose"
	 * @generated
	 * @ordered
	 */
	public static final int DISPOSE_VALUE = 12;

	/**
	 * The '<em><b>Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Selection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTION
	 * @model name="Selection"
	 * @generated
	 * @ordered
	 */
	public static final int SELECTION_VALUE = 13;

	/**
	 * The '<em><b>Default Selection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Default Selection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT_SELECTION
	 * @model name="DefaultSelection"
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_SELECTION_VALUE = 14;

	/**
	 * The '<em><b>Focus In</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Focus In</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOCUS_IN
	 * @model name="FocusIn"
	 * @generated
	 * @ordered
	 */
	public static final int FOCUS_IN_VALUE = 15;

	/**
	 * The '<em><b>Focus Out</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Focus Out</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOCUS_OUT
	 * @model name="FocusOut"
	 * @generated
	 * @ordered
	 */
	public static final int FOCUS_OUT_VALUE = 16;

	/**
	 * The '<em><b>Expand</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Expand</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EXPAND
	 * @model name="Expand"
	 * @generated
	 * @ordered
	 */
	public static final int EXPAND_VALUE = 17;

	/**
	 * The '<em><b>Collapse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Collapse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLLAPSE
	 * @model name="Collapse"
	 * @generated
	 * @ordered
	 */
	public static final int COLLAPSE_VALUE = 18;

	/**
	 * The '<em><b>Iconify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Iconify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICONIFY
	 * @model name="Iconify"
	 * @generated
	 * @ordered
	 */
	public static final int ICONIFY_VALUE = 19;

	/**
	 * The '<em><b>Deiconify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deiconify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEICONIFY
	 * @model name="Deiconify"
	 * @generated
	 * @ordered
	 */
	public static final int DEICONIFY_VALUE = 20;

	/**
	 * The '<em><b>Close</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Close</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLOSE
	 * @model name="Close"
	 * @generated
	 * @ordered
	 */
	public static final int CLOSE_VALUE = 21;

	/**
	 * The '<em><b>Show</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Show</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHOW
	 * @model name="Show"
	 * @generated
	 * @ordered
	 */
	public static final int SHOW_VALUE = 22;

	/**
	 * The '<em><b>Hide</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hide</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDE
	 * @model name="Hide"
	 * @generated
	 * @ordered
	 */
	public static final int HIDE_VALUE = 23;

	/**
	 * The '<em><b>Modify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Modify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFY
	 * @model name="Modify"
	 * @generated
	 * @ordered
	 */
	public static final int MODIFY_VALUE = 24;

	/**
	 * The '<em><b>Verify</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Verify</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERIFY
	 * @model name="Verify"
	 * @generated
	 * @ordered
	 */
	public static final int VERIFY_VALUE = 25;

	/**
	 * The '<em><b>Activate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Activate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ACTIVATE
	 * @model name="Activate"
	 * @generated
	 * @ordered
	 */
	public static final int ACTIVATE_VALUE = 26;

	/**
	 * The '<em><b>Deactivate</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Deactivate</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEACTIVATE
	 * @model name="Deactivate"
	 * @generated
	 * @ordered
	 */
	public static final int DEACTIVATE_VALUE = 27;

	/**
	 * The '<em><b>Help</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Help</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HELP
	 * @model name="Help"
	 * @generated
	 * @ordered
	 */
	public static final int HELP_VALUE = 28;

	/**
	 * The '<em><b>Drag Detect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drag Detect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAG_DETECT
	 * @model name="DragDetect"
	 * @generated
	 * @ordered
	 */
	public static final int DRAG_DETECT_VALUE = 29;

	/**
	 * The '<em><b>Arm</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arm</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARM
	 * @model name="Arm"
	 * @generated
	 * @ordered
	 */
	public static final int ARM_VALUE = 30;

	/**
	 * The '<em><b>Traverse</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Traverse</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE
	 * @model name="Traverse"
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_VALUE = 31;

	/**
	 * The '<em><b>Mouse Hover</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Hover</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_HOVER
	 * @model name="MouseHover"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_HOVER_VALUE = 32;

	/**
	 * The '<em><b>Hard Key Down</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hard Key Down</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARD_KEY_DOWN
	 * @model name="HardKeyDown"
	 * @generated
	 * @ordered
	 */
	public static final int HARD_KEY_DOWN_VALUE = 33;

	/**
	 * The '<em><b>Hard Key Up</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hard Key Up</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HARD_KEY_UP
	 * @model name="HardKeyUp"
	 * @generated
	 * @ordered
	 */
	public static final int HARD_KEY_UP_VALUE = 34;

	/**
	 * The '<em><b>Menu Detect</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Menu Detect</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU_DETECT
	 * @model name="MenuDetect"
	 * @generated
	 * @ordered
	 */
	public static final int MENU_DETECT_VALUE = 35;

	/**
	 * The '<em><b>Set Data</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Set Data</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SET_DATA
	 * @model name="SetData"
	 * @generated
	 * @ordered
	 */
	public static final int SET_DATA_VALUE = 36;

	/**
	 * The '<em><b>Mouse Vertical Wheel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Vertical Wheel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_VERTICAL_WHEEL
	 * @model name="MouseVerticalWheel"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_VERTICAL_WHEEL_VALUE = 37;

	/**
	 * The '<em><b>Mouse Horizontal Wheel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Horizontal Wheel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_HORIZONTAL_WHEEL
	 * @model name="MouseHorizontalWheel"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_HORIZONTAL_WHEEL_VALUE = 38;

	/**
	 * The '<em><b>Mouse Wheel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Mouse Wheel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOUSE_WHEEL
	 * @model name="MouseWheel"
	 * @generated
	 * @ordered
	 */
	public static final int MOUSE_WHEEL_VALUE = 39;

	/**
	 * The '<em><b>Settings</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Settings</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SETTINGS
	 * @model name="Settings"
	 * @generated
	 * @ordered
	 */
	public static final int SETTINGS_VALUE = 40;

	/**
	 * The '<em><b>Erase Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Erase Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERASE_ITEM
	 * @model name="EraseItem"
	 * @generated
	 * @ordered
	 */
	public static final int ERASE_ITEM_VALUE = 41;

	/**
	 * The '<em><b>Measure Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measure Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASURE_ITEM
	 * @model name="MeasureItem"
	 * @generated
	 * @ordered
	 */
	public static final int MEASURE_ITEM_VALUE = 42;

	/**
	 * The '<em><b>Paint Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Paint Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAINT_ITEM
	 * @model name="PaintItem"
	 * @generated
	 * @ordered
	 */
	public static final int PAINT_ITEM_VALUE = 43;

	/**
	 * The '<em><b>Ime Composition</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Ime Composition</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IME_COMPOSITION
	 * @model name="ImeComposition"
	 * @generated
	 * @ordered
	 */
	public static final int IME_COMPOSITION_VALUE = 44;

	/**
	 * The '<em><b>Orientation Change</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Orientation Change</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ORIENTATION_CHANGE
	 * @model name="OrientationChange"
	 * @generated
	 * @ordered
	 */
	public static final int ORIENTATION_CHANGE_VALUE = 45;

	/**
	 * The '<em><b>Skin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Skin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKIN
	 * @model name="Skin"
	 * @generated
	 * @ordered
	 */
	public static final int SKIN_VALUE = 46;

	/**
	 * The '<em><b>Open Document</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Open Document</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN_DOCUMENT
	 * @model name="OpenDocument"
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_DOCUMENT_VALUE = 47;

	/**
	 * The '<em><b>Touch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Touch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCH
	 * @model name="Touch"
	 * @generated
	 * @ordered
	 */
	public static final int TOUCH_VALUE = 48;

	/**
	 * The '<em><b>Gesture</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Gesture</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE
	 * @model name="Gesture"
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_VALUE = 49;

	/**
	 * The '<em><b>Segments</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Segments</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEGMENTS
	 * @model name="Segments"
	 * @generated
	 * @ordered
	 */
	public static final int SEGMENTS_VALUE = 50;

	/**
	 * The '<em><b>Pre Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_EVENT
	 * @model name="PreEvent"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_EVENT_VALUE = 51;

	/**
	 * The '<em><b>Post Event</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post Event</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_EVENT
	 * @model name="PostEvent"
	 * @generated
	 * @ordered
	 */
	public static final int POST_EVENT_VALUE = 52;

	/**
	 * The '<em><b>Pre External Event Dispatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pre External Event Dispatch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRE_EXTERNAL_EVENT_DISPATCH
	 * @model name="PreExternalEventDispatch"
	 * @generated
	 * @ordered
	 */
	public static final int PRE_EXTERNAL_EVENT_DISPATCH_VALUE = 53;

	/**
	 * The '<em><b>Post External Event Dispatch</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Post External Event Dispatch</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POST_EXTERNAL_EVENT_DISPATCH
	 * @model name="PostExternalEventDispatch"
	 * @generated
	 * @ordered
	 */
	public static final int POST_EXTERNAL_EVENT_DISPATCH_VALUE = 54;

	/**
	 * The '<em><b>Sleep</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sleep</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SLEEP
	 * @model name="Sleep"
	 * @generated
	 * @ordered
	 */
	public static final int SLEEP_VALUE = 55;

	/**
	 * The '<em><b>Wakeup</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Wakeup</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WAKEUP
	 * @model name="Wakeup"
	 * @generated
	 * @ordered
	 */
	public static final int WAKEUP_VALUE = 56;

	/**
	 * The '<em><b>COMPOSITION CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOSITION CHANGED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_CHANGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_CHANGED_VALUE = 57;

	/**
	 * The '<em><b>COMPOSITION OFFSET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOSITION OFFSET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_OFFSET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_OFFSET_VALUE = 58;

	/**
	 * The '<em><b>COMPOSITION SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPOSITION SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOSITION_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPOSITION_SELECTION_VALUE = 59;

	/**
	 * The '<em><b>DRAG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAG_VALUE = 60;

	/**
	 * The '<em><b>SELECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SELECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SELECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SELECTED_VALUE = 61;

	/**
	 * The '<em><b>FOCUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOCUSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOCUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOCUSED_VALUE = 62;

	/**
	 * The '<em><b>BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BACKGROUND_VALUE = 63;

	/**
	 * The '<em><b>FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FOREGROUND_VALUE = 64;

	/**
	 * The '<em><b>HOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOT_VALUE = 65;

	/**
	 * The '<em><b>TRAVERSE NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_NONE_VALUE = 66;

	/**
	 * The '<em><b>TRAVERSE ESCAPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE ESCAPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ESCAPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_ESCAPE_VALUE = 67;

	/**
	 * The '<em><b>TRAVERSE RETURN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE RETURN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_RETURN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_RETURN_VALUE = 68;

	/**
	 * The '<em><b>TRAVERSE TAB PREVIOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE TAB PREVIOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_TAB_PREVIOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_TAB_PREVIOUS_VALUE = 69;

	/**
	 * The '<em><b>TRAVERSE TAB NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE TAB NEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_TAB_NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_TAB_NEXT_VALUE = 70;

	/**
	 * The '<em><b>TRAVERSE ARROW PREVIOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE ARROW PREVIOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ARROW_PREVIOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_ARROW_PREVIOUS_VALUE = 71;

	/**
	 * The '<em><b>TRAVERSE ARROW NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE ARROW NEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_ARROW_NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_ARROW_NEXT_VALUE = 72;

	/**
	 * The '<em><b>TRAVERSE MNEMONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE MNEMONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_MNEMONIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_MNEMONIC_VALUE = 73;

	/**
	 * The '<em><b>TRAVERSE PAGE PREVIOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE PAGE PREVIOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_PAGE_PREVIOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_PAGE_PREVIOUS_VALUE = 74;

	/**
	 * The '<em><b>TRAVERSE PAGE NEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAVERSE PAGE NEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAVERSE_PAGE_NEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAVERSE_PAGE_NEXT_VALUE = 75;

	/**
	 * The '<em><b>GESTURE BEGIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE BEGIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_BEGIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_BEGIN_VALUE = 76;

	/**
	 * The '<em><b>GESTURE END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_END_VALUE = 77;

	/**
	 * The '<em><b>GESTURE ROTATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE ROTATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_ROTATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_ROTATE_VALUE = 78;

	/**
	 * The '<em><b>GESTURE SWIPE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE SWIPE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_SWIPE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_SWIPE_VALUE = 79;

	/**
	 * The '<em><b>GESTURE MAGNIFY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE MAGNIFY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_MAGNIFY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_MAGNIFY_VALUE = 80;

	/**
	 * The '<em><b>GESTURE PAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GESTURE PAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GESTURE_PAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GESTURE_PAN_VALUE = 81;

	/**
	 * The '<em><b>TOUCHSTATE DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCHSTATE DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCHSTATE_DOWN_VALUE = 82;

	/**
	 * The '<em><b>TOUCHSTATE MOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCHSTATE MOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_MOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCHSTATE_MOVE_VALUE = 83;

	/**
	 * The '<em><b>TOUCHSTATE UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOUCHSTATE UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOUCHSTATE_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOUCHSTATE_UP_VALUE = 84;

	/**
	 * The '<em><b>MENU MOUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENU MOUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU_MOUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENU_MOUSE_VALUE = 85;

	/**
	 * The '<em><b>MENU KEYBOARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENU KEYBOARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU_KEYBOARD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENU_KEYBOARD_VALUE = 86;

	/**
	 * The '<em><b>CHANGED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHANGED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHANGED_VALUE = 87;

	/**
	 * The '<em><b>DEFER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFER_VALUE = 88;

	/**
	 * The '<em><b>NULL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NULL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NULL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NULL_VALUE = 90;

	/**
	 * The '<em><b>DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEFAULT_VALUE = 91;

	/**
	 * The '<em><b>OFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OFF_VALUE = 92;

	/**
	 * The '<em><b>ON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_VALUE = 93;

	/**
	 * The '<em><b>LOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LOW_VALUE = 94;

	/**
	 * The '<em><b>HIGH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIGH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIGH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIGH_VALUE = 95;

	/**
	 * The '<em><b>BAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BAR_VALUE = 96;

	/**
	 * The '<em><b>DROP DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DROP DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DROP_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DROP_DOWN_VALUE = 97;

	/**
	 * The '<em><b>POP UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POP UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POP_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int POP_UP_VALUE = 98;

	/**
	 * The '<em><b>SEPARATOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATOR_VALUE = 99;

	/**
	 * The '<em><b>SEPARATOR FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEPARATOR FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEPARATOR_FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEPARATOR_FILL_VALUE = 100;

	/**
	 * The '<em><b>TOGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOGGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOGGLE_VALUE = 101;

	/**
	 * The '<em><b>ARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_VALUE = 102;

	/**
	 * The '<em><b>PUSH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PUSH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PUSH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PUSH_VALUE = 103;

	/**
	 * The '<em><b>RADIO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RADIO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RADIO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RADIO_VALUE = 104;

	/**
	 * The '<em><b>CHECK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHECK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHECK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CHECK_VALUE = 105;

	/**
	 * The '<em><b>CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CASCADE_VALUE = 106;

	/**
	 * The '<em><b>MULTI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MULTI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTI
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MULTI_VALUE = 107;

	/**
	 * The '<em><b>SINGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SINGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SINGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SINGLE_VALUE = 108;

	/**
	 * The '<em><b>READ ONLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>READ ONLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #READ_ONLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int READ_ONLY_VALUE = 109;

	/**
	 * The '<em><b>WRAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WRAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WRAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WRAP_VALUE = 110;

	/**
	 * The '<em><b>SEARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SEARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SEARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SEARCH_VALUE = 111;

	/**
	 * The '<em><b>SIMPLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIMPLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIMPLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIMPLE_VALUE = 112;

	/**
	 * The '<em><b>PASSWORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASSWORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASSWORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PASSWORD_VALUE = 113;

	/**
	 * The '<em><b>SHADOW IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_IN_VALUE = 114;

	/**
	 * The '<em><b>SHADOW OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_OUT_VALUE = 115;

	/**
	 * The '<em><b>SHADOW ETCHED IN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW ETCHED IN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_ETCHED_IN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_ETCHED_IN_VALUE = 116;

	/**
	 * The '<em><b>SHADOW ETCHED OUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW ETCHED OUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_ETCHED_OUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_ETCHED_OUT_VALUE = 117;

	/**
	 * The '<em><b>SHADOW NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHADOW NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHADOW_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHADOW_NONE_VALUE = 118;

	/**
	 * The '<em><b>INDETERMINATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDETERMINATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDETERMINATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDETERMINATE_VALUE = 119;

	/**
	 * The '<em><b>TOOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOOL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOOL_VALUE = 120;

	/**
	 * The '<em><b>NO TRIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO TRIM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_TRIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_TRIM_VALUE = 121;

	/**
	 * The '<em><b>TITLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TITLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TITLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TITLE_VALUE = 123;

	/**
	 * The '<em><b>MENU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MENU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MENU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MENU_VALUE = 125;

	/**
	 * The '<em><b>MIN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIN_VALUE = 126;

	/**
	 * The '<em><b>MAX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MAX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MAX_VALUE = 127;

	/**
	 * The '<em><b>NO MOVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO MOVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_MOVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_MOVE_VALUE = 128;

	/**
	 * The '<em><b>HSCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HSCROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HSCROLL
	 * @model name="H_SCROLL"
	 * @generated
	 * @ordered
	 */
	public static final int HSCROLL_VALUE = 129;

	/**
	 * The '<em><b>VSCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VSCROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VSCROLL
	 * @model name="V_SCROLL"
	 * @generated
	 * @ordered
	 */
	public static final int VSCROLL_VALUE = 130;

	/**
	 * The '<em><b>NO SCROLL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO SCROLL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_SCROLL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_SCROLL_VALUE = 131;

	/**
	 * The '<em><b>BORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BORDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_VALUE = 132;

	/**
	 * The '<em><b>CLIP CHILDREN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIP CHILDREN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIP_CHILDREN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIP_CHILDREN_VALUE = 133;

	/**
	 * The '<em><b>CLIP SIBLINGS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CLIP SIBLINGS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIP_SIBLINGS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CLIP_SIBLINGS_VALUE = 134;

	/**
	 * The '<em><b>ON TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ON TOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ON_TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ON_TOP_VALUE = 135;

	/**
	 * The '<em><b>SHEET</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHEET</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHEET
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHEET_VALUE = 136;

	/**
	 * The '<em><b>SHELL TRIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHELL TRIM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHELL_TRIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHELL_TRIM_VALUE = 137;

	/**
	 * The '<em><b>DIALOG TRIM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIALOG TRIM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DIALOG_TRIM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DIALOG_TRIM_VALUE = 138;

	/**
	 * The '<em><b>MODELESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODELESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODELESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODELESS_VALUE = 139;

	/**
	 * The '<em><b>PRIMARY MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRIMARY MODAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIMARY_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRIMARY_MODAL_VALUE = 140;

	/**
	 * The '<em><b>APPLICATION MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>APPLICATION MODAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #APPLICATION_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int APPLICATION_MODAL_VALUE = 141;

	/**
	 * The '<em><b>SYSTEM MODAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYSTEM MODAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYSTEM_MODAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SYSTEM_MODAL_VALUE = 142;

	/**
	 * The '<em><b>HIDE SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HIDE SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HIDE_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HIDE_SELECTION_VALUE = 143;

	/**
	 * The '<em><b>FULL SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FULL SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FULL_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FULL_SELECTION_VALUE = 144;

	/**
	 * The '<em><b>FLAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLAT_VALUE = 145;

	/**
	 * The '<em><b>SMOOTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SMOOTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOOTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SMOOTH_VALUE = 146;

	/**
	 * The '<em><b>NO BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_BACKGROUND_VALUE = 147;

	/**
	 * The '<em><b>NO FOCUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO FOCUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_FOCUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_FOCUS_VALUE = 148;

	/**
	 * The '<em><b>NO REDRAW RESIZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO REDRAW RESIZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_REDRAW_RESIZE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_REDRAW_RESIZE_VALUE = 149;

	/**
	 * The '<em><b>NO MERGE PAINTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO MERGE PAINTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_MERGE_PAINTS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_MERGE_PAINTS_VALUE = 150;

	/**
	 * The '<em><b>NO RADIO GROUP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO RADIO GROUP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_RADIO_GROUP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_RADIO_GROUP_VALUE = 151;

	/**
	 * The '<em><b>LEFT TO RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT TO RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT_TO_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_TO_RIGHT_VALUE = 152;

	/**
	 * The '<em><b>RIGHT TO LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT TO LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT_TO_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_TO_LEFT_VALUE = 153;

	/**
	 * The '<em><b>MIRRORED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MIRRORED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MIRRORED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MIRRORED_VALUE = 154;

	/**
	 * The '<em><b>EMBEDDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>EMBEDDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EMBEDDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int EMBEDDED_VALUE = 155;

	/**
	 * The '<em><b>VIRTUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIRTUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIRTUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VIRTUAL_VALUE = 156;

	/**
	 * The '<em><b>DOUBLE BUFFERED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOUBLE BUFFERED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOUBLE_BUFFERED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOUBLE_BUFFERED_VALUE = 157;

	/**
	 * The '<em><b>TRANSPARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENT_VALUE = 158;

	/**
	 * The '<em><b>FLIP TEXT DIRECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLIP TEXT DIRECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLIP_TEXT_DIRECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FLIP_TEXT_DIRECTION_VALUE = 159;

	/**
	 * The '<em><b>AUTO TEXT DIRECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AUTO TEXT DIRECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AUTO_TEXT_DIRECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AUTO_TEXT_DIRECTION_VALUE = 160;

	/**
	 * The '<em><b>UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UP_VALUE = 161;

	/**
	 * The '<em><b>UNDERLINE SINGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLINE SINGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_SINGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_SINGLE_VALUE = 162;

	/**
	 * The '<em><b>UNDERLINE DOUBLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLINE DOUBLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_DOUBLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_DOUBLE_VALUE = 163;

	/**
	 * The '<em><b>UNDERLINE ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLINE ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_ERROR_VALUE = 164;

	/**
	 * The '<em><b>UNDERLINE SQUIGGLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLINE SQUIGGLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_SQUIGGLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_SQUIGGLE_VALUE = 165;

	/**
	 * The '<em><b>UNDERLINE LINK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNDERLINE LINK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNDERLINE_LINK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int UNDERLINE_LINK_VALUE = 166;

	/**
	 * The '<em><b>BORDER SOLID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BORDER SOLID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORDER_SOLID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_SOLID_VALUE = 167;

	/**
	 * The '<em><b>BORDER DASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BORDER DASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORDER_DASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_DASH_VALUE = 168;

	/**
	 * The '<em><b>BORDER DOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BORDER DOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BORDER_DOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BORDER_DOT_VALUE = 169;

	/**
	 * The '<em><b>TOP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TOP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TOP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TOP_VALUE = 170;

	/**
	 * The '<em><b>DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DOWN_VALUE = 171;

	/**
	 * The '<em><b>BOTTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOTTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOTTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOTTOM_VALUE = 172;

	/**
	 * The '<em><b>LEAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEAD_VALUE = 173;

	/**
	 * The '<em><b>LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LEFT_VALUE = 174;

	/**
	 * The '<em><b>TRAIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRAIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRAIL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRAIL_VALUE = 175;

	/**
	 * The '<em><b>RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RIGHT_VALUE = 176;

	/**
	 * The '<em><b>CENTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CENTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CENTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CENTER_VALUE = 177;

	/**
	 * The '<em><b>HORIZONTAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HORIZONTAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HORIZONTAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HORIZONTAL_VALUE = 178;

	/**
	 * The '<em><b>VERTICAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VERTICAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VERTICAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int VERTICAL_VALUE = 179;

	/**
	 * The '<em><b>DATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DATE_VALUE = 180;

	/**
	 * The '<em><b>TIME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TIME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TIME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TIME_VALUE = 181;

	/**
	 * The '<em><b>CALENDAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CALENDAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CALENDAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CALENDAR_VALUE = 182;

	/**
	 * The '<em><b>SHORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHORT_VALUE = 183;

	/**
	 * The '<em><b>MEDIUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEDIUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDIUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MEDIUM_VALUE = 184;

	/**
	 * The '<em><b>LONG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LONG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LONG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LONG_VALUE = 185;

	/**
	 * The '<em><b>MOZILLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOZILLA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOZILLA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOZILLA_VALUE = 186;

	/**
	 * The '<em><b>WEBKIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WEBKIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WEBKIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int WEBKIT_VALUE = 187;

	/**
	 * The '<em><b>BALLOON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BALLOON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BALLOON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BALLOON_VALUE = 188;

	/**
	 * The '<em><b>BEGINNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEGINNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEGINNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BEGINNING_VALUE = 189;

	/**
	 * The '<em><b>FILL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_VALUE = 190;

	/**
	 * The '<em><b>DBCS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DBCS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DBCS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DBCS_VALUE = 191;

	/**
	 * The '<em><b>ALPHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALPHA_VALUE = 192;

	/**
	 * The '<em><b>NATIVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NATIVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NATIVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NATIVE_VALUE = 193;

	/**
	 * The '<em><b>PHONETIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PHONETIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHONETIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PHONETIC_VALUE = 194;

	/**
	 * The '<em><b>ROMAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROMAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROMAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROMAN_VALUE = 195;

	/**
	 * The '<em><b>BS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BS_VALUE = 196;

	/**
	 * The '<em><b>CR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CR_VALUE = 197;

	/**
	 * The '<em><b>DEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DEL_VALUE = 198;

	/**
	 * The '<em><b>ESC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ESC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ESC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ESC_VALUE = 199;

	/**
	 * The '<em><b>LF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LF_VALUE = 200;

	/**
	 * The '<em><b>TAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TAB_VALUE = 201;

	/**
	 * The '<em><b>SPACE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPACE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPACE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SPACE_VALUE = 202;

	/**
	 * The '<em><b>ALT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALT_VALUE = 203;

	/**
	 * The '<em><b>SHIFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SHIFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SHIFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SHIFT_VALUE = 204;

	/**
	 * The '<em><b>CTRL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CTRL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CTRL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CTRL_VALUE = 205;

	/**
	 * The '<em><b>CONTROL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTROL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTROL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTROL_VALUE = 206;

	/**
	 * The '<em><b>COMMAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMMAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMMAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMMAND_VALUE = 207;

	/**
	 * The '<em><b>MODIFIER MASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MODIFIER MASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MODIFIER_MASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MODIFIER_MASK_VALUE = 208;

	/**
	 * The '<em><b>BUTTON1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON1_VALUE = 209;

	/**
	 * The '<em><b>BUTTON2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON2_VALUE = 210;

	/**
	 * The '<em><b>BUTTON3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON3_VALUE = 211;

	/**
	 * The '<em><b>BUTTON4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON4_VALUE = 212;

	/**
	 * The '<em><b>BUTTON5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON5_VALUE = 213;

	/**
	 * The '<em><b>BUTTON MASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BUTTON MASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BUTTON_MASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BUTTON_MASK_VALUE = 214;

	/**
	 * The '<em><b>MOD1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD1_VALUE = 215;

	/**
	 * The '<em><b>MOD2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD2_VALUE = 216;

	/**
	 * The '<em><b>MOD3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD3_VALUE = 217;

	/**
	 * The '<em><b>MOD4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOD4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOD4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOD4_VALUE = 218;

	/**
	 * The '<em><b>SCROLL LINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLL LINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL_LINE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_LINE_VALUE = 219;

	/**
	 * The '<em><b>SCROLL PAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLL PAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL_PAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_PAGE_VALUE = 220;

	/**
	 * The '<em><b>KEYCODE BIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYCODE BIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYCODE_BIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYCODE_BIT_VALUE = 221;

	/**
	 * The '<em><b>KEY MASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEY MASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEY_MASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEY_MASK_VALUE = 222;

	/**
	 * The '<em><b>ARROW UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_UP_VALUE = 223;

	/**
	 * The '<em><b>ARROW DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_DOWN_VALUE = 224;

	/**
	 * The '<em><b>ARROW LEFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW LEFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_LEFT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_LEFT_VALUE = 225;

	/**
	 * The '<em><b>ARROW RIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ARROW RIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW_RIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_RIGHT_VALUE = 226;

	/**
	 * The '<em><b>PAGE UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_UP_VALUE = 227;

	/**
	 * The '<em><b>PAGE DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAGE DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAGE_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAGE_DOWN_VALUE = 228;

	/**
	 * The '<em><b>HOME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HOME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOME
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int HOME_VALUE = 229;

	/**
	 * The '<em><b>END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int END_VALUE = 230;

	/**
	 * The '<em><b>INSERT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INSERT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INSERT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INSERT_VALUE = 231;

	/**
	 * The '<em><b>F1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F1_VALUE = 232;

	/**
	 * The '<em><b>F2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F2_VALUE = 233;

	/**
	 * The '<em><b>F3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F3_VALUE = 234;

	/**
	 * The '<em><b>F4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F4_VALUE = 235;

	/**
	 * The '<em><b>F5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F5_VALUE = 236;

	/**
	 * The '<em><b>F6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F6_VALUE = 237;

	/**
	 * The '<em><b>F7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F7_VALUE = 238;

	/**
	 * The '<em><b>F8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F8_VALUE = 239;

	/**
	 * The '<em><b>F9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F9_VALUE = 240;

	/**
	 * The '<em><b>F10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F10
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F10_VALUE = 241;

	/**
	 * The '<em><b>F11</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F11</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F11
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F11_VALUE = 242;

	/**
	 * The '<em><b>F12</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F12</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F12
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F12_VALUE = 243;

	/**
	 * The '<em><b>F13</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F13</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F13
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F13_VALUE = 244;

	/**
	 * The '<em><b>F14</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F14</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F14
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F14_VALUE = 245;

	/**
	 * The '<em><b>F15</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F15</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F15
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F15_VALUE = 246;

	/**
	 * The '<em><b>F16</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F16</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F16
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F16_VALUE = 247;

	/**
	 * The '<em><b>F17</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F17</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F17
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F17_VALUE = 248;

	/**
	 * The '<em><b>F18</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F18</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F18
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F18_VALUE = 249;

	/**
	 * The '<em><b>F19</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F19</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F19
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F19_VALUE = 250;

	/**
	 * The '<em><b>F20</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>F20</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #F20
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int F20_VALUE = 251;

	/**
	 * The '<em><b>KEYPAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_VALUE = 252;

	/**
	 * The '<em><b>KEYPAD MULTIPLY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD MULTIPLY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_MULTIPLY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_MULTIPLY_VALUE = 253;

	/**
	 * The '<em><b>KEYPAD ADD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD ADD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_ADD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_ADD_VALUE = 254;

	/**
	 * The '<em><b>KEYPAD SUBTRACT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD SUBTRACT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_SUBTRACT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_SUBTRACT_VALUE = 255;

	/**
	 * The '<em><b>KEYPAD DECIMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD DECIMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_DECIMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_DECIMAL_VALUE = 256;

	/**
	 * The '<em><b>KEYPAD DIVIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD DIVIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_DIVIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_DIVIDE_VALUE = 257;

	/**
	 * The '<em><b>KEYPAD 0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_0
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_0_VALUE = 258;

	/**
	 * The '<em><b>KEYPAD 1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_1
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_1_VALUE = 259;

	/**
	 * The '<em><b>KEYPAD 2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_2
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_2_VALUE = 260;

	/**
	 * The '<em><b>KEYPAD 3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_3
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_3_VALUE = 261;

	/**
	 * The '<em><b>KEYPAD 4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_4
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_4_VALUE = 262;

	/**
	 * The '<em><b>KEYPAD 5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_5
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_5_VALUE = 263;

	/**
	 * The '<em><b>KEYPAD 6</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 6</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_6
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_6_VALUE = 264;

	/**
	 * The '<em><b>KEYPAD 7</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 7</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_7
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_7_VALUE = 265;

	/**
	 * The '<em><b>KEYPAD 8</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 8</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_8
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_8_VALUE = 266;

	/**
	 * The '<em><b>KEYPAD 9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD 9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_9
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_9_VALUE = 267;

	/**
	 * The '<em><b>KEYPAD EQUAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD EQUAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_EQUAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_EQUAL_VALUE = 268;

	/**
	 * The '<em><b>KEYPAD CR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEYPAD CR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEYPAD_CR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int KEYPAD_CR_VALUE = 269;

	/**
	 * The '<em><b>CAPS LOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAPS LOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAPS_LOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAPS_LOCK_VALUE = 271;

	/**
	 * The '<em><b>NUM LOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NUM LOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUM_LOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NUM_LOCK_VALUE = 272;

	/**
	 * The '<em><b>SCROLL LOCK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLL LOCK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLL_LOCK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLL_LOCK_VALUE = 273;

	/**
	 * The '<em><b>PAUSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAUSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSE_VALUE = 274;

	/**
	 * The '<em><b>BREAK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BREAK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BREAK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BREAK_VALUE = 275;

	/**
	 * The '<em><b>PRINT SCREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PRINT SCREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRINT_SCREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PRINT_SCREEN_VALUE = 276;

	/**
	 * The '<em><b>ICON ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_ERROR_VALUE = 277;

	/**
	 * The '<em><b>ICON INFORMATION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON INFORMATION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_INFORMATION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_INFORMATION_VALUE = 278;

	/**
	 * The '<em><b>ICON QUESTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON QUESTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_QUESTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_QUESTION_VALUE = 279;

	/**
	 * The '<em><b>ICON WARNING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON WARNING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_WARNING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_WARNING_VALUE = 280;

	/**
	 * The '<em><b>ICON WORKING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON WORKING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_WORKING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_WORKING_VALUE = 281;

	/**
	 * The '<em><b>ICON SEARCH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON SEARCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_SEARCH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_SEARCH_VALUE = 282;

	/**
	 * The '<em><b>ICON CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON_CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_CANCEL_VALUE = 283;

	/**
	 * The '<em><b>OK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OK_VALUE = 284;

	/**
	 * The '<em><b>YES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>YES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #YES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int YES_VALUE = 285;

	/**
	 * The '<em><b>NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NO_VALUE = 286;

	/**
	 * The '<em><b>CANCEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CANCEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CANCEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CANCEL_VALUE = 287;

	/**
	 * The '<em><b>ABORT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABORT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABORT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABORT_VALUE = 288;

	/**
	 * The '<em><b>RETRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RETRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RETRY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int RETRY_VALUE = 289;

	/**
	 * The '<em><b>IGNORE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IGNORE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IGNORE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IGNORE_VALUE = 290;

	/**
	 * The '<em><b>OPEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OPEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int OPEN_VALUE = 291;

	/**
	 * The '<em><b>SAVE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SAVE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SAVE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SAVE_VALUE = 292;

	/**
	 * The '<em><b>INHERIT NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERIT NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_NONE_VALUE = 293;

	/**
	 * The '<em><b>INHERIT DEFAULT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERIT DEFAULT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT_DEFAULT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_DEFAULT_VALUE = 294;

	/**
	 * The '<em><b>INHERIT FORCE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INHERIT FORCE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INHERIT_FORCE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INHERIT_FORCE_VALUE = 295;

	/**
	 * The '<em><b>COLOR WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WHITE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WHITE_VALUE = 296;

	/**
	 * The '<em><b>COLOR BLACK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR BLACK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_BLACK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_BLACK_VALUE = 297;

	/**
	 * The '<em><b>COLOR RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR RED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_RED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_RED_VALUE = 298;

	/**
	 * The '<em><b>COLOR DARK RED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK RED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_RED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_RED_VALUE = 299;

	/**
	 * The '<em><b>COLOR GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_GREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_GREEN_VALUE = 300;

	/**
	 * The '<em><b>COLOR DARK GREEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK GREEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_GREEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_GREEN_VALUE = 301;

	/**
	 * The '<em><b>COLOR YELLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR YELLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_YELLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_YELLOW_VALUE = 302;

	/**
	 * The '<em><b>COLOR DARK YELLOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK YELLOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_YELLOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_YELLOW_VALUE = 303;

	/**
	 * The '<em><b>COLOR BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_BLUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_BLUE_VALUE = 304;

	/**
	 * The '<em><b>COLOR DARK BLUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK BLUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_BLUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_BLUE_VALUE = 305;

	/**
	 * The '<em><b>COLOR MAGENTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR MAGENTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_MAGENTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_MAGENTA_VALUE = 306;

	/**
	 * The '<em><b>COLOR DARK MAGENTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK MAGENTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_MAGENTA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_MAGENTA_VALUE = 307;

	/**
	 * The '<em><b>COLOR CYAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR CYAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_CYAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_CYAN_VALUE = 308;

	/**
	 * The '<em><b>COLOR DARK CYAN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK CYAN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_CYAN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_CYAN_VALUE = 309;

	/**
	 * The '<em><b>COLOR GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_GRAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_GRAY_VALUE = 310;

	/**
	 * The '<em><b>COLOR DARK GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR DARK GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_DARK_GRAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_DARK_GRAY_VALUE = 311;

	/**
	 * The '<em><b>COLOR WIDGET DARK SHADOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET DARK SHADOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_DARK_SHADOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_DARK_SHADOW_VALUE = 312;

	/**
	 * The '<em><b>COLOR WIDGET NORMAL SHADOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET NORMAL SHADOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_NORMAL_SHADOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_NORMAL_SHADOW_VALUE = 313;

	/**
	 * The '<em><b>COLOR WIDGET LIGHT SHADOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET LIGHT SHADOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_LIGHT_SHADOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_LIGHT_SHADOW_VALUE = 314;

	/**
	 * The '<em><b>COLOR WIDGET HIGHLIGHT SHADOW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET HIGHLIGHT SHADOW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_HIGHLIGHT_SHADOW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_HIGHLIGHT_SHADOW_VALUE = 315;

	/**
	 * The '<em><b>COLOR WIDGET FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_FOREGROUND_VALUE = 316;

	/**
	 * The '<em><b>COLOR WIDGET BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_BACKGROUND_VALUE = 317;

	/**
	 * The '<em><b>COLOR WIDGET BORDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR WIDGET BORDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_WIDGET_BORDER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_WIDGET_BORDER_VALUE = 318;

	/**
	 * The '<em><b>COLOR LIST FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR LIST FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_LIST_FOREGROUND_VALUE = 319;

	/**
	 * The '<em><b>COLOR LIST BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR LIST BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_LIST_BACKGROUND_VALUE = 320;

	/**
	 * The '<em><b>COLOR LIST SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR LIST SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_LIST_SELECTION_VALUE = 321;

	/**
	 * The '<em><b>COLOR LIST SELECTION TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR LIST SELECTION TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_LIST_SELECTION_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_LIST_SELECTION_TEXT_VALUE = 322;

	/**
	 * The '<em><b>COLOR INFO FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR INFO FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_INFO_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_INFO_FOREGROUND_VALUE = 323;

	/**
	 * The '<em><b>COLOR INFO BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR INFO BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_INFO_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_INFO_BACKGROUND_VALUE = 324;

	/**
	 * The '<em><b>COLOR TITLE FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_FOREGROUND_VALUE = 325;

	/**
	 * The '<em><b>COLOR TITLE BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_BACKGROUND_VALUE = 326;

	/**
	 * The '<em><b>COLOR TITLE BACKGROUND GRADIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE BACKGROUND GRADIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_BACKGROUND_GRADIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_BACKGROUND_GRADIENT_VALUE = 327;

	/**
	 * The '<em><b>COLOR TITLE INACTIVE FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE INACTIVE FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_INACTIVE_FOREGROUND_VALUE = 328;

	/**
	 * The '<em><b>COLOR TITLE INACTIVE BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE INACTIVE BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_INACTIVE_BACKGROUND_VALUE = 329;

	/**
	 * The '<em><b>COLOR TITLE INACTIVE BACKGROUND GRADIENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TITLE INACTIVE BACKGROUND GRADIENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT_VALUE = 330;

	/**
	 * The '<em><b>COLOR LINK FOREGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR LINK FOREGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_LINK_FOREGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_LINK_FOREGROUND_VALUE = 331;

	/**
	 * The '<em><b>COLOR TRANSPARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COLOR TRANSPARENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COLOR_TRANSPARENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COLOR_TRANSPARENT_VALUE = 332;

	/**
	 * The '<em><b>DRAW TRANSPARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAW TRANSPARENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAW_TRANSPARENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAW_TRANSPARENT_VALUE = 333;

	/**
	 * The '<em><b>DRAW DELIMITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAW DELIMITER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAW_DELIMITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAW_DELIMITER_VALUE = 334;

	/**
	 * The '<em><b>DRAW TAB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAW TAB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAW_TAB
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAW_TAB_VALUE = 335;

	/**
	 * The '<em><b>DRAW MNEMONIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DRAW MNEMONIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRAW_MNEMONIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DRAW_MNEMONIC_VALUE = 336;

	/**
	 * The '<em><b>DELIMITER SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DELIMITER SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DELIMITER_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DELIMITER_SELECTION_VALUE = 337;

	/**
	 * The '<em><b>LAST LINE SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LAST LINE SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LAST_LINE_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LAST_LINE_SELECTION_VALUE = 338;

	/**
	 * The '<em><b>ERROR UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR UNSPECIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_UNSPECIFIED_VALUE = 339;

	/**
	 * The '<em><b>ERROR NO HANDLES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR NO HANDLES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_HANDLES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_NO_HANDLES_VALUE = 340;

	/**
	 * The '<em><b>ERROR NO MORE CALLBACKS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR NO MORE CALLBACKS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_MORE_CALLBACKS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_NO_MORE_CALLBACKS_VALUE = 341;

	/**
	 * The '<em><b>ERROR NULL ARGUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR NULL ARGUMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_NULL_ARGUMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_NULL_ARGUMENT_VALUE = 342;

	/**
	 * The '<em><b>ERROR INVALID ARGUMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID ARGUMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_ARGUMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_ARGUMENT_VALUE = 343;

	/**
	 * The '<em><b>ERROR INVALID RANGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID RANGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_RANGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_RANGE_VALUE = 344;

	/**
	 * The '<em><b>ERROR CANNOT BE ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT BE ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_BE_ZERO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_BE_ZERO_VALUE = 345;

	/**
	 * The '<em><b>ERROR CANNOT GET ITEM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET ITEM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ITEM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_ITEM_VALUE = 346;

	/**
	 * The '<em><b>ERROR CANNOT GET SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_SELECTION_VALUE = 347;

	/**
	 * The '<em><b>ERROR CANNOT INVERT MATRIX</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT INVERT MATRIX</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_INVERT_MATRIX
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_INVERT_MATRIX_VALUE = 348;

	/**
	 * The '<em><b>ERROR CANNOT GET ITEM HEIGHT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET ITEM HEIGHT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ITEM_HEIGHT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_ITEM_HEIGHT_VALUE = 349;

	/**
	 * The '<em><b>ERROR CANNOT GET TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_TEXT_VALUE = 350;

	/**
	 * The '<em><b>ERROR CANNOT SET TEXT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT SET TEXT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_TEXT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_SET_TEXT_VALUE = 351;

	/**
	 * The '<em><b>ERROR ITEM NOT ADDED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR ITEM NOT ADDED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_ITEM_NOT_ADDED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_ITEM_NOT_ADDED_VALUE = 352;

	/**
	 * The '<em><b>ERROR ITEM NOT REMOVED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR ITEM NOT REMOVED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_ITEM_NOT_REMOVED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_ITEM_NOT_REMOVED_VALUE = 353;

	/**
	 * The '<em><b>ERROR NO GRAPHICS LIBRARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR NO GRAPHICS LIBRARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_NO_GRAPHICS_LIBRARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_NO_GRAPHICS_LIBRARY_VALUE = 354;

	/**
	 * The '<em><b>ERROR NOT IMPLEMENTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR NOT IMPLEMENTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_NOT_IMPLEMENTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_NOT_IMPLEMENTED_VALUE = 355;

	/**
	 * The '<em><b>ERROR MENU NOT DROP DOWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR MENU NOT DROP DOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_DROP_DOWN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_MENU_NOT_DROP_DOWN_VALUE = 356;

	/**
	 * The '<em><b>ERROR THREAD INVALID ACCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR THREAD INVALID ACCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_THREAD_INVALID_ACCESS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_THREAD_INVALID_ACCESS_VALUE = 357;

	/**
	 * The '<em><b>ERROR WIDGET DISPOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR WIDGET DISPOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_WIDGET_DISPOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_WIDGET_DISPOSED_VALUE = 358;

	/**
	 * The '<em><b>ERROR MENUITEM NOT CASCADE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR MENUITEM NOT CASCADE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENUITEM_NOT_CASCADE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_MENUITEM_NOT_CASCADE_VALUE = 359;

	/**
	 * The '<em><b>ERROR CANNOT SET SELECTION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT SET SELECTION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_SELECTION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_SET_SELECTION_VALUE = 360;

	/**
	 * The '<em><b>ERROR CANNOT SET MENU</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT SET MENU</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_MENU
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_SET_MENU_VALUE = 361;

	/**
	 * The '<em><b>ERROR CANNOT SET ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT SET ENABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_SET_ENABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_SET_ENABLED_VALUE = 362;

	/**
	 * The '<em><b>ERROR CANNOT GET ENABLED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET ENABLED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_ENABLED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_ENABLED_VALUE = 363;

	/**
	 * The '<em><b>ERROR INVALID PARENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID PARENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_PARENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_PARENT_VALUE = 364;

	/**
	 * The '<em><b>ERROR MENU NOT BAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR MENU NOT BAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_BAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_MENU_NOT_BAR_VALUE = 365;

	/**
	 * The '<em><b>ERROR CANNOT GET COUNT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR CANNOT GET COUNT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_CANNOT_GET_COUNT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_CANNOT_GET_COUNT_VALUE = 366;

	/**
	 * The '<em><b>ERROR MENU NOT POP UP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR MENU NOT POP UP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_MENU_NOT_POP_UP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_MENU_NOT_POP_UP_VALUE = 367;

	/**
	 * The '<em><b>ERROR UNSUPPORTED DEPTH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR UNSUPPORTED DEPTH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSUPPORTED_DEPTH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_UNSUPPORTED_DEPTH_VALUE = 368;

	/**
	 * The '<em><b>ERROR IO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR IO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_IO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_IO_VALUE = 369;

	/**
	 * The '<em><b>ERROR INVALID IMAGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID IMAGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_IMAGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_IMAGE_VALUE = 370;

	/**
	 * The '<em><b>ERROR UNSUPPORTED FORMAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR UNSUPPORTED FORMAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_UNSUPPORTED_FORMAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_UNSUPPORTED_FORMAT_VALUE = 371;

	/**
	 * The '<em><b>ERROR INVALID SUBCLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID SUBCLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_SUBCLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_SUBCLASS_VALUE = 372;

	/**
	 * The '<em><b>ERROR GRAPHIC DISPOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR GRAPHIC DISPOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_GRAPHIC_DISPOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_GRAPHIC_DISPOSED_VALUE = 373;

	/**
	 * The '<em><b>ERROR DEVICE DISPOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR DEVICE DISPOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_DEVICE_DISPOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_DEVICE_DISPOSED_VALUE = 374;

	/**
	 * The '<em><b>ERROR FAILED EXEC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR FAILED EXEC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_EXEC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_FAILED_EXEC_VALUE = 375;

	/**
	 * The '<em><b>ERROR FAILED LOAD LIBRARY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR FAILED LOAD LIBRARY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_LOAD_LIBRARY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_FAILED_LOAD_LIBRARY_VALUE = 376;

	/**
	 * The '<em><b>ERROR INVALID FONT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID FONT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_FONT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_FONT_VALUE = 377;

	/**
	 * The '<em><b>ERROR FUNCTION DISPOSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR FUNCTION DISPOSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_FUNCTION_DISPOSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_FUNCTION_DISPOSED_VALUE = 378;

	/**
	 * The '<em><b>ERROR FAILED EVALUATE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR FAILED EVALUATE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_FAILED_EVALUATE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_FAILED_EVALUATE_VALUE = 379;

	/**
	 * The '<em><b>ERROR INVALID RETURN VALUE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR INVALID RETURN VALUE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR_INVALID_RETURN_VALUE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_INVALID_RETURN_VALUE_VALUE = 380;

	/**
	 * The '<em><b>BITMAP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BITMAP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BITMAP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BITMAP_VALUE = 381;

	/**
	 * The '<em><b>ICON</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ICON</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ICON
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ICON_VALUE = 382;

	/**
	 * The '<em><b>IMAGE COPY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE COPY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_COPY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_COPY_VALUE = 383;

	/**
	 * The '<em><b>IMAGE DISABLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE DISABLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_DISABLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_DISABLE_VALUE = 384;

	/**
	 * The '<em><b>IMAGE GRAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE GRAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GRAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GRAY_VALUE = 385;

	/**
	 * The '<em><b>ERROR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ERROR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ERROR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ERROR_VALUE = 386;

	/**
	 * The '<em><b>PAUSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PAUSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAUSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PAUSED_VALUE = 387;

	/**
	 * The '<em><b>NORMAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NORMAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NORMAL_VALUE = 388;

	/**
	 * The '<em><b>BOLD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BOLD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BOLD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int BOLD_VALUE = 389;

	/**
	 * The '<em><b>ITALIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ITALIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ITALIC
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ITALIC_VALUE = 390;

	/**
	 * The '<em><b>CURSOR ARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR ARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_ARROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_ARROW_VALUE = 391;

	/**
	 * The '<em><b>CURSOR WAIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR WAIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_WAIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_WAIT_VALUE = 392;

	/**
	 * The '<em><b>CURSOR CROSS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR CROSS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_CROSS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_CROSS_VALUE = 393;

	/**
	 * The '<em><b>CURSOR APPSTARTING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR APPSTARTING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_APPSTARTING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_APPSTARTING_VALUE = 394;

	/**
	 * The '<em><b>CURSOR HELP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR HELP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_HELP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_HELP_VALUE = 395;

	/**
	 * The '<em><b>CURSOR SIZEALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZEALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZEALL_VALUE = 396;

	/**
	 * The '<em><b>CURSOR SIZENESW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZENESW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENESW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZENESW_VALUE = 397;

	/**
	 * The '<em><b>CURSOR SIZENS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZENS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZENS_VALUE = 398;

	/**
	 * The '<em><b>CURSOR SIZENWSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZENWSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENWSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZENWSE_VALUE = 399;

	/**
	 * The '<em><b>CURSOR SIZEWE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZEWE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEWE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZEWE_VALUE = 400;

	/**
	 * The '<em><b>CURSOR SIZEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEN
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZEN_VALUE = 401;

	/**
	 * The '<em><b>CURSOR SIZES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZES_VALUE = 402;

	/**
	 * The '<em><b>CURSOR SIZEE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZEE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZEE_VALUE = 403;

	/**
	 * The '<em><b>CURSOR SIZEW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZEW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZEW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZEW_VALUE = 404;

	/**
	 * The '<em><b>CURSOR SIZENE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZENE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZENE_VALUE = 405;

	/**
	 * The '<em><b>CURSOR SIZESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZESE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZESE_VALUE = 406;

	/**
	 * The '<em><b>CURSOR SIZESW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZESW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZESW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZESW_VALUE = 407;

	/**
	 * The '<em><b>CURSOR SIZENW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR SIZENW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_SIZENW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_SIZENW_VALUE = 408;

	/**
	 * The '<em><b>CURSOR UPARROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR UPARROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_UPARROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_UPARROW_VALUE = 409;

	/**
	 * The '<em><b>CURSOR IBEAM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR IBEAM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_IBEAM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_IBEAM_VALUE = 410;

	/**
	 * The '<em><b>CURSOR NO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR NO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_NO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_NO_VALUE = 411;

	/**
	 * The '<em><b>CURSOR HAND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CURSOR HAND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CURSOR_HAND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CURSOR_HAND_VALUE = 412;

	/**
	 * The '<em><b>CAP FLAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAP FLAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAP_FLAT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAP_FLAT_VALUE = 413;

	/**
	 * The '<em><b>CAP ROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAP ROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAP_ROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAP_ROUND_VALUE = 414;

	/**
	 * The '<em><b>CAP SQUARE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CAP SQUARE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CAP_SQUARE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CAP_SQUARE_VALUE = 415;

	/**
	 * The '<em><b>JOIN MITER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN MITER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN_MITER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_MITER_VALUE = 416;

	/**
	 * The '<em><b>JOIN ROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN ROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN_ROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_ROUND_VALUE = 417;

	/**
	 * The '<em><b>JOIN BEVEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JOIN BEVEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JOIN_BEVEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JOIN_BEVEL_VALUE = 418;

	/**
	 * The '<em><b>LINE SOLID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE SOLID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_SOLID
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_SOLID_VALUE = 419;

	/**
	 * The '<em><b>LINE DASH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASH
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASH_VALUE = 420;

	/**
	 * The '<em><b>LINE DOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DOT_VALUE = 421;

	/**
	 * The '<em><b>LINE DASHDOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASHDOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASHDOT_VALUE = 422;

	/**
	 * The '<em><b>LINE DASHDOTDOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE DASHDOTDOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_DASHDOTDOT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_DASHDOTDOT_VALUE = 423;

	/**
	 * The '<em><b>LINE CUSTOM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LINE CUSTOM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LINE_CUSTOM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int LINE_CUSTOM_VALUE = 424;

	/**
	 * The '<em><b>PATH MOVE TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATH MOVE TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_MOVE_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_MOVE_TO_VALUE = 425;

	/**
	 * The '<em><b>PATH LINE TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATH LINE TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_LINE_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_LINE_TO_VALUE = 426;

	/**
	 * The '<em><b>PATH QUAD TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATH QUAD TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_QUAD_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_QUAD_TO_VALUE = 427;

	/**
	 * The '<em><b>PATH CUBIC TO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATH CUBIC TO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_CUBIC_TO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_CUBIC_TO_VALUE = 428;

	/**
	 * The '<em><b>PATH CLOSE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PATH CLOSE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PATH_CLOSE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PATH_CLOSE_VALUE = 429;

	/**
	 * The '<em><b>FILL EVEN ODD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL EVEN ODD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_EVEN_ODD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_EVEN_ODD_VALUE = 430;

	/**
	 * The '<em><b>FILL WINDING</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FILL WINDING</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_WINDING
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int FILL_WINDING_VALUE = 431;

	/**
	 * The '<em><b>IMAGE UNDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE UNDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_UNDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_UNDEFINED_VALUE = 432;

	/**
	 * The '<em><b>IMAGE BMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE BMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_BMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_BMP_VALUE = 433;

	/**
	 * The '<em><b>IMAGE BMP RLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE BMP RLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_BMP_RLE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_BMP_RLE_VALUE = 434;

	/**
	 * The '<em><b>IMAGE GIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE GIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_GIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_GIF_VALUE = 435;

	/**
	 * The '<em><b>IMAGE ICO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE ICO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_ICO
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_ICO_VALUE = 436;

	/**
	 * The '<em><b>IMAGE JPEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE JPEG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_JPEG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_JPEG_VALUE = 437;

	/**
	 * The '<em><b>IMAGE PNG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE PNG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_PNG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_PNG_VALUE = 438;

	/**
	 * The '<em><b>IMAGE TIFF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE TIFF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_TIFF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_TIFF_VALUE = 439;

	/**
	 * The '<em><b>IMAGE OS2 BMP</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IMAGE OS2 BMP</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IMAGE_OS2_BMP
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IMAGE_OS2_BMP_VALUE = 440;

	/**
	 * The '<em><b>DM UNSPECIFIED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DM UNSPECIFIED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_UNSPECIFIED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DM_UNSPECIFIED_VALUE = 441;

	/**
	 * The '<em><b>DM FILL NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DM FILL NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DM_FILL_NONE_VALUE = 442;

	/**
	 * The '<em><b>DM FILL BACKGROUND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DM FILL BACKGROUND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_BACKGROUND
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DM_FILL_BACKGROUND_VALUE = 443;

	/**
	 * The '<em><b>DM FILL PREVIOUS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DM FILL PREVIOUS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DM_FILL_PREVIOUS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int DM_FILL_PREVIOUS_VALUE = 444;

	/**
	 * The '<em><b>TRANSPARENCY NONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENCY NONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_NONE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENCY_NONE_VALUE = 445;

	/**
	 * The '<em><b>TRANSPARENCY ALPHA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENCY ALPHA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_ALPHA
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENCY_ALPHA_VALUE = 446;

	/**
	 * The '<em><b>TRANSPARENCY MASK</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENCY MASK</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_MASK
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENCY_MASK_VALUE = 447;

	/**
	 * The '<em><b>TRANSPARENCY PIXEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>TRANSPARENCY PIXEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSPARENCY_PIXEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int TRANSPARENCY_PIXEL_VALUE = 448;

	/**
	 * The '<em><b>MOVEMENT CHAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT CHAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_CHAR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_CHAR_VALUE = 449;

	/**
	 * The '<em><b>MOVEMENT CLUSTER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT CLUSTER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_CLUSTER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_CLUSTER_VALUE = 450;

	/**
	 * The '<em><b>MOVEMENT WORD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT WORD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_WORD_VALUE = 451;

	/**
	 * The '<em><b>MOVEMENT WORD END</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT WORD END</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD_END
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_WORD_END_VALUE = 452;

	/**
	 * The '<em><b>MOVEMENT WORD START</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MOVEMENT WORD START</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MOVEMENT_WORD_START
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int MOVEMENT_WORD_START_VALUE = 453;

	/**
	 * The '<em><b>ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ALL_VALUE = 454;

	/**
	 * The '<em><b>ID ABOUT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID ABOUT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_ABOUT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_ABOUT_VALUE = 455;

	/**
	 * The '<em><b>ID PREFERENCES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID PREFERENCES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_PREFERENCES
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_PREFERENCES_VALUE = 456;

	/**
	 * The '<em><b>ID HIDE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID HIDE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_HIDE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_HIDE_VALUE = 457;

	/**
	 * The '<em><b>ID HIDE OTHERS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID HIDE OTHERS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_HIDE_OTHERS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_HIDE_OTHERS_VALUE = 458;

	/**
	 * The '<em><b>ID SHOW ALL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID SHOW ALL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_SHOW_ALL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_SHOW_ALL_VALUE = 459;

	/**
	 * The '<em><b>ID QUIT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ID QUIT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ID_QUIT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ID_QUIT_VALUE = 460;

	/**
	 * The '<em><b>SKIN CLASS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SKIN CLASS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SKIN_CLASS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SKIN_CLASS_VALUE = 461;

	/**
	 * The '<em><b>SCROLLBAR OVERLAY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SCROLLBAR OVERLAY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SCROLLBAR_OVERLAY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SCROLLBAR_OVERLAY_VALUE = 463;

	/**
	 * An array of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Style[] VALUES_ARRAY =
		new Style[] {
			NONE,
			KEY_DOWN,
			KEY_UP,
			MOUSE_DOWN,
			MOUSE_UP,
			MOUSE_MOVE,
			MOUSE_ENTER,
			MOUSE_EXIT,
			MOUSE_DOUBLE_CLICK,
			PAINT,
			MOVE,
			RESIZE,
			DISPOSE,
			SELECTION,
			DEFAULT_SELECTION,
			FOCUS_IN,
			FOCUS_OUT,
			EXPAND,
			COLLAPSE,
			ICONIFY,
			DEICONIFY,
			CLOSE,
			SHOW,
			HIDE,
			MODIFY,
			VERIFY,
			ACTIVATE,
			DEACTIVATE,
			HELP,
			DRAG_DETECT,
			ARM,
			TRAVERSE,
			MOUSE_HOVER,
			HARD_KEY_DOWN,
			HARD_KEY_UP,
			MENU_DETECT,
			SET_DATA,
			MOUSE_VERTICAL_WHEEL,
			MOUSE_HORIZONTAL_WHEEL,
			MOUSE_WHEEL,
			SETTINGS,
			ERASE_ITEM,
			MEASURE_ITEM,
			PAINT_ITEM,
			IME_COMPOSITION,
			ORIENTATION_CHANGE,
			SKIN,
			OPEN_DOCUMENT,
			TOUCH,
			GESTURE,
			SEGMENTS,
			PRE_EVENT,
			POST_EVENT,
			PRE_EXTERNAL_EVENT_DISPATCH,
			POST_EXTERNAL_EVENT_DISPATCH,
			SLEEP,
			WAKEUP,
			COMPOSITION_CHANGED,
			COMPOSITION_OFFSET,
			COMPOSITION_SELECTION,
			DRAG,
			SELECTED,
			FOCUSED,
			BACKGROUND,
			FOREGROUND,
			HOT,
			TRAVERSE_NONE,
			TRAVERSE_ESCAPE,
			TRAVERSE_RETURN,
			TRAVERSE_TAB_PREVIOUS,
			TRAVERSE_TAB_NEXT,
			TRAVERSE_ARROW_PREVIOUS,
			TRAVERSE_ARROW_NEXT,
			TRAVERSE_MNEMONIC,
			TRAVERSE_PAGE_PREVIOUS,
			TRAVERSE_PAGE_NEXT,
			GESTURE_BEGIN,
			GESTURE_END,
			GESTURE_ROTATE,
			GESTURE_SWIPE,
			GESTURE_MAGNIFY,
			GESTURE_PAN,
			TOUCHSTATE_DOWN,
			TOUCHSTATE_MOVE,
			TOUCHSTATE_UP,
			MENU_MOUSE,
			MENU_KEYBOARD,
			CHANGED,
			DEFER,
			NULL,
			DEFAULT,
			OFF,
			ON,
			LOW,
			HIGH,
			BAR,
			DROP_DOWN,
			POP_UP,
			SEPARATOR,
			SEPARATOR_FILL,
			TOGGLE,
			ARROW,
			PUSH,
			RADIO,
			CHECK,
			CASCADE,
			MULTI,
			SINGLE,
			READ_ONLY,
			WRAP,
			SEARCH,
			SIMPLE,
			PASSWORD,
			SHADOW_IN,
			SHADOW_OUT,
			SHADOW_ETCHED_IN,
			SHADOW_ETCHED_OUT,
			SHADOW_NONE,
			INDETERMINATE,
			TOOL,
			NO_TRIM,
			TITLE,
			MENU,
			MIN,
			MAX,
			NO_MOVE,
			HSCROLL,
			VSCROLL,
			NO_SCROLL,
			BORDER,
			CLIP_CHILDREN,
			CLIP_SIBLINGS,
			ON_TOP,
			SHEET,
			SHELL_TRIM,
			DIALOG_TRIM,
			MODELESS,
			PRIMARY_MODAL,
			APPLICATION_MODAL,
			SYSTEM_MODAL,
			HIDE_SELECTION,
			FULL_SELECTION,
			FLAT,
			SMOOTH,
			NO_BACKGROUND,
			NO_FOCUS,
			NO_REDRAW_RESIZE,
			NO_MERGE_PAINTS,
			NO_RADIO_GROUP,
			LEFT_TO_RIGHT,
			RIGHT_TO_LEFT,
			MIRRORED,
			EMBEDDED,
			VIRTUAL,
			DOUBLE_BUFFERED,
			TRANSPARENT,
			FLIP_TEXT_DIRECTION,
			AUTO_TEXT_DIRECTION,
			UP,
			UNDERLINE_SINGLE,
			UNDERLINE_DOUBLE,
			UNDERLINE_ERROR,
			UNDERLINE_SQUIGGLE,
			UNDERLINE_LINK,
			BORDER_SOLID,
			BORDER_DASH,
			BORDER_DOT,
			TOP,
			DOWN,
			BOTTOM,
			LEAD,
			LEFT,
			TRAIL,
			RIGHT,
			CENTER,
			HORIZONTAL,
			VERTICAL,
			DATE,
			TIME,
			CALENDAR,
			SHORT,
			MEDIUM,
			LONG,
			MOZILLA,
			WEBKIT,
			BALLOON,
			BEGINNING,
			FILL,
			DBCS,
			ALPHA,
			NATIVE,
			PHONETIC,
			ROMAN,
			BS,
			CR,
			DEL,
			ESC,
			LF,
			TAB,
			SPACE,
			ALT,
			SHIFT,
			CTRL,
			CONTROL,
			COMMAND,
			MODIFIER_MASK,
			BUTTON1,
			BUTTON2,
			BUTTON3,
			BUTTON4,
			BUTTON5,
			BUTTON_MASK,
			MOD1,
			MOD2,
			MOD3,
			MOD4,
			SCROLL_LINE,
			SCROLL_PAGE,
			KEYCODE_BIT,
			KEY_MASK,
			ARROW_UP,
			ARROW_DOWN,
			ARROW_LEFT,
			ARROW_RIGHT,
			PAGE_UP,
			PAGE_DOWN,
			HOME,
			END,
			INSERT,
			F1,
			F2,
			F3,
			F4,
			F5,
			F6,
			F7,
			F8,
			F9,
			F10,
			F11,
			F12,
			F13,
			F14,
			F15,
			F16,
			F17,
			F18,
			F19,
			F20,
			KEYPAD,
			KEYPAD_MULTIPLY,
			KEYPAD_ADD,
			KEYPAD_SUBTRACT,
			KEYPAD_DECIMAL,
			KEYPAD_DIVIDE,
			KEYPAD_0,
			KEYPAD_1,
			KEYPAD_2,
			KEYPAD_3,
			KEYPAD_4,
			KEYPAD_5,
			KEYPAD_6,
			KEYPAD_7,
			KEYPAD_8,
			KEYPAD_9,
			KEYPAD_EQUAL,
			KEYPAD_CR,
			CAPS_LOCK,
			NUM_LOCK,
			SCROLL_LOCK,
			PAUSE,
			BREAK,
			PRINT_SCREEN,
			ICON_ERROR,
			ICON_INFORMATION,
			ICON_QUESTION,
			ICON_WARNING,
			ICON_WORKING,
			ICON_SEARCH,
			ICON_CANCEL,
			OK,
			YES,
			NO,
			CANCEL,
			ABORT,
			RETRY,
			IGNORE,
			OPEN,
			SAVE,
			INHERIT_NONE,
			INHERIT_DEFAULT,
			INHERIT_FORCE,
			COLOR_WHITE,
			COLOR_BLACK,
			COLOR_RED,
			COLOR_DARK_RED,
			COLOR_GREEN,
			COLOR_DARK_GREEN,
			COLOR_YELLOW,
			COLOR_DARK_YELLOW,
			COLOR_BLUE,
			COLOR_DARK_BLUE,
			COLOR_MAGENTA,
			COLOR_DARK_MAGENTA,
			COLOR_CYAN,
			COLOR_DARK_CYAN,
			COLOR_GRAY,
			COLOR_DARK_GRAY,
			COLOR_WIDGET_DARK_SHADOW,
			COLOR_WIDGET_NORMAL_SHADOW,
			COLOR_WIDGET_LIGHT_SHADOW,
			COLOR_WIDGET_HIGHLIGHT_SHADOW,
			COLOR_WIDGET_FOREGROUND,
			COLOR_WIDGET_BACKGROUND,
			COLOR_WIDGET_BORDER,
			COLOR_LIST_FOREGROUND,
			COLOR_LIST_BACKGROUND,
			COLOR_LIST_SELECTION,
			COLOR_LIST_SELECTION_TEXT,
			COLOR_INFO_FOREGROUND,
			COLOR_INFO_BACKGROUND,
			COLOR_TITLE_FOREGROUND,
			COLOR_TITLE_BACKGROUND,
			COLOR_TITLE_BACKGROUND_GRADIENT,
			COLOR_TITLE_INACTIVE_FOREGROUND,
			COLOR_TITLE_INACTIVE_BACKGROUND,
			COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT,
			COLOR_LINK_FOREGROUND,
			COLOR_TRANSPARENT,
			DRAW_TRANSPARENT,
			DRAW_DELIMITER,
			DRAW_TAB,
			DRAW_MNEMONIC,
			DELIMITER_SELECTION,
			LAST_LINE_SELECTION,
			ERROR_UNSPECIFIED,
			ERROR_NO_HANDLES,
			ERROR_NO_MORE_CALLBACKS,
			ERROR_NULL_ARGUMENT,
			ERROR_INVALID_ARGUMENT,
			ERROR_INVALID_RANGE,
			ERROR_CANNOT_BE_ZERO,
			ERROR_CANNOT_GET_ITEM,
			ERROR_CANNOT_GET_SELECTION,
			ERROR_CANNOT_INVERT_MATRIX,
			ERROR_CANNOT_GET_ITEM_HEIGHT,
			ERROR_CANNOT_GET_TEXT,
			ERROR_CANNOT_SET_TEXT,
			ERROR_ITEM_NOT_ADDED,
			ERROR_ITEM_NOT_REMOVED,
			ERROR_NO_GRAPHICS_LIBRARY,
			ERROR_NOT_IMPLEMENTED,
			ERROR_MENU_NOT_DROP_DOWN,
			ERROR_THREAD_INVALID_ACCESS,
			ERROR_WIDGET_DISPOSED,
			ERROR_MENUITEM_NOT_CASCADE,
			ERROR_CANNOT_SET_SELECTION,
			ERROR_CANNOT_SET_MENU,
			ERROR_CANNOT_SET_ENABLED,
			ERROR_CANNOT_GET_ENABLED,
			ERROR_INVALID_PARENT,
			ERROR_MENU_NOT_BAR,
			ERROR_CANNOT_GET_COUNT,
			ERROR_MENU_NOT_POP_UP,
			ERROR_UNSUPPORTED_DEPTH,
			ERROR_IO,
			ERROR_INVALID_IMAGE,
			ERROR_UNSUPPORTED_FORMAT,
			ERROR_INVALID_SUBCLASS,
			ERROR_GRAPHIC_DISPOSED,
			ERROR_DEVICE_DISPOSED,
			ERROR_FAILED_EXEC,
			ERROR_FAILED_LOAD_LIBRARY,
			ERROR_INVALID_FONT,
			ERROR_FUNCTION_DISPOSED,
			ERROR_FAILED_EVALUATE,
			ERROR_INVALID_RETURN_VALUE,
			BITMAP,
			ICON,
			IMAGE_COPY,
			IMAGE_DISABLE,
			IMAGE_GRAY,
			ERROR,
			PAUSED,
			NORMAL,
			BOLD,
			ITALIC,
			CURSOR_ARROW,
			CURSOR_WAIT,
			CURSOR_CROSS,
			CURSOR_APPSTARTING,
			CURSOR_HELP,
			CURSOR_SIZEALL,
			CURSOR_SIZENESW,
			CURSOR_SIZENS,
			CURSOR_SIZENWSE,
			CURSOR_SIZEWE,
			CURSOR_SIZEN,
			CURSOR_SIZES,
			CURSOR_SIZEE,
			CURSOR_SIZEW,
			CURSOR_SIZENE,
			CURSOR_SIZESE,
			CURSOR_SIZESW,
			CURSOR_SIZENW,
			CURSOR_UPARROW,
			CURSOR_IBEAM,
			CURSOR_NO,
			CURSOR_HAND,
			CAP_FLAT,
			CAP_ROUND,
			CAP_SQUARE,
			JOIN_MITER,
			JOIN_ROUND,
			JOIN_BEVEL,
			LINE_SOLID,
			LINE_DASH,
			LINE_DOT,
			LINE_DASHDOT,
			LINE_DASHDOTDOT,
			LINE_CUSTOM,
			PATH_MOVE_TO,
			PATH_LINE_TO,
			PATH_QUAD_TO,
			PATH_CUBIC_TO,
			PATH_CLOSE,
			FILL_EVEN_ODD,
			FILL_WINDING,
			IMAGE_UNDEFINED,
			IMAGE_BMP,
			IMAGE_BMP_RLE,
			IMAGE_GIF,
			IMAGE_ICO,
			IMAGE_JPEG,
			IMAGE_PNG,
			IMAGE_TIFF,
			IMAGE_OS2_BMP,
			DM_UNSPECIFIED,
			DM_FILL_NONE,
			DM_FILL_BACKGROUND,
			DM_FILL_PREVIOUS,
			TRANSPARENCY_NONE,
			TRANSPARENCY_ALPHA,
			TRANSPARENCY_MASK,
			TRANSPARENCY_PIXEL,
			MOVEMENT_CHAR,
			MOVEMENT_CLUSTER,
			MOVEMENT_WORD,
			MOVEMENT_WORD_END,
			MOVEMENT_WORD_START,
			ALL,
			ID_ABOUT,
			ID_PREFERENCES,
			ID_HIDE,
			ID_HIDE_OTHERS,
			ID_SHOW_ALL,
			ID_QUIT,
			SKIN_CLASS,
			SCROLLBAR_OVERLAY,
		};

	/**
	 * A public read-only list of all the '<em><b>Style</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Style> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Style result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Style</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Style get(int value) {
		switch (value) {
			case NONE_VALUE: return NONE;
			case KEY_DOWN_VALUE: return KEY_DOWN;
			case KEY_UP_VALUE: return KEY_UP;
			case MOUSE_DOWN_VALUE: return MOUSE_DOWN;
			case MOUSE_UP_VALUE: return MOUSE_UP;
			case MOUSE_MOVE_VALUE: return MOUSE_MOVE;
			case MOUSE_ENTER_VALUE: return MOUSE_ENTER;
			case MOUSE_EXIT_VALUE: return MOUSE_EXIT;
			case MOUSE_DOUBLE_CLICK_VALUE: return MOUSE_DOUBLE_CLICK;
			case PAINT_VALUE: return PAINT;
			case MOVE_VALUE: return MOVE;
			case RESIZE_VALUE: return RESIZE;
			case DISPOSE_VALUE: return DISPOSE;
			case SELECTION_VALUE: return SELECTION;
			case DEFAULT_SELECTION_VALUE: return DEFAULT_SELECTION;
			case FOCUS_IN_VALUE: return FOCUS_IN;
			case FOCUS_OUT_VALUE: return FOCUS_OUT;
			case EXPAND_VALUE: return EXPAND;
			case COLLAPSE_VALUE: return COLLAPSE;
			case ICONIFY_VALUE: return ICONIFY;
			case DEICONIFY_VALUE: return DEICONIFY;
			case CLOSE_VALUE: return CLOSE;
			case SHOW_VALUE: return SHOW;
			case HIDE_VALUE: return HIDE;
			case MODIFY_VALUE: return MODIFY;
			case VERIFY_VALUE: return VERIFY;
			case ACTIVATE_VALUE: return ACTIVATE;
			case DEACTIVATE_VALUE: return DEACTIVATE;
			case HELP_VALUE: return HELP;
			case DRAG_DETECT_VALUE: return DRAG_DETECT;
			case ARM_VALUE: return ARM;
			case TRAVERSE_VALUE: return TRAVERSE;
			case MOUSE_HOVER_VALUE: return MOUSE_HOVER;
			case HARD_KEY_DOWN_VALUE: return HARD_KEY_DOWN;
			case HARD_KEY_UP_VALUE: return HARD_KEY_UP;
			case MENU_DETECT_VALUE: return MENU_DETECT;
			case SET_DATA_VALUE: return SET_DATA;
			case MOUSE_VERTICAL_WHEEL_VALUE: return MOUSE_VERTICAL_WHEEL;
			case MOUSE_HORIZONTAL_WHEEL_VALUE: return MOUSE_HORIZONTAL_WHEEL;
			case MOUSE_WHEEL_VALUE: return MOUSE_WHEEL;
			case SETTINGS_VALUE: return SETTINGS;
			case ERASE_ITEM_VALUE: return ERASE_ITEM;
			case MEASURE_ITEM_VALUE: return MEASURE_ITEM;
			case PAINT_ITEM_VALUE: return PAINT_ITEM;
			case IME_COMPOSITION_VALUE: return IME_COMPOSITION;
			case ORIENTATION_CHANGE_VALUE: return ORIENTATION_CHANGE;
			case SKIN_VALUE: return SKIN;
			case OPEN_DOCUMENT_VALUE: return OPEN_DOCUMENT;
			case TOUCH_VALUE: return TOUCH;
			case GESTURE_VALUE: return GESTURE;
			case SEGMENTS_VALUE: return SEGMENTS;
			case PRE_EVENT_VALUE: return PRE_EVENT;
			case POST_EVENT_VALUE: return POST_EVENT;
			case PRE_EXTERNAL_EVENT_DISPATCH_VALUE: return PRE_EXTERNAL_EVENT_DISPATCH;
			case POST_EXTERNAL_EVENT_DISPATCH_VALUE: return POST_EXTERNAL_EVENT_DISPATCH;
			case SLEEP_VALUE: return SLEEP;
			case WAKEUP_VALUE: return WAKEUP;
			case COMPOSITION_CHANGED_VALUE: return COMPOSITION_CHANGED;
			case COMPOSITION_OFFSET_VALUE: return COMPOSITION_OFFSET;
			case COMPOSITION_SELECTION_VALUE: return COMPOSITION_SELECTION;
			case DRAG_VALUE: return DRAG;
			case SELECTED_VALUE: return SELECTED;
			case FOCUSED_VALUE: return FOCUSED;
			case BACKGROUND_VALUE: return BACKGROUND;
			case FOREGROUND_VALUE: return FOREGROUND;
			case HOT_VALUE: return HOT;
			case TRAVERSE_NONE_VALUE: return TRAVERSE_NONE;
			case TRAVERSE_ESCAPE_VALUE: return TRAVERSE_ESCAPE;
			case TRAVERSE_RETURN_VALUE: return TRAVERSE_RETURN;
			case TRAVERSE_TAB_PREVIOUS_VALUE: return TRAVERSE_TAB_PREVIOUS;
			case TRAVERSE_TAB_NEXT_VALUE: return TRAVERSE_TAB_NEXT;
			case TRAVERSE_ARROW_PREVIOUS_VALUE: return TRAVERSE_ARROW_PREVIOUS;
			case TRAVERSE_ARROW_NEXT_VALUE: return TRAVERSE_ARROW_NEXT;
			case TRAVERSE_MNEMONIC_VALUE: return TRAVERSE_MNEMONIC;
			case TRAVERSE_PAGE_PREVIOUS_VALUE: return TRAVERSE_PAGE_PREVIOUS;
			case TRAVERSE_PAGE_NEXT_VALUE: return TRAVERSE_PAGE_NEXT;
			case GESTURE_BEGIN_VALUE: return GESTURE_BEGIN;
			case GESTURE_END_VALUE: return GESTURE_END;
			case GESTURE_ROTATE_VALUE: return GESTURE_ROTATE;
			case GESTURE_SWIPE_VALUE: return GESTURE_SWIPE;
			case GESTURE_MAGNIFY_VALUE: return GESTURE_MAGNIFY;
			case GESTURE_PAN_VALUE: return GESTURE_PAN;
			case TOUCHSTATE_DOWN_VALUE: return TOUCHSTATE_DOWN;
			case TOUCHSTATE_MOVE_VALUE: return TOUCHSTATE_MOVE;
			case TOUCHSTATE_UP_VALUE: return TOUCHSTATE_UP;
			case MENU_MOUSE_VALUE: return MENU_MOUSE;
			case MENU_KEYBOARD_VALUE: return MENU_KEYBOARD;
			case CHANGED_VALUE: return CHANGED;
			case DEFER_VALUE: return DEFER;
			case NULL_VALUE: return NULL;
			case DEFAULT_VALUE: return DEFAULT;
			case OFF_VALUE: return OFF;
			case ON_VALUE: return ON;
			case LOW_VALUE: return LOW;
			case HIGH_VALUE: return HIGH;
			case BAR_VALUE: return BAR;
			case DROP_DOWN_VALUE: return DROP_DOWN;
			case POP_UP_VALUE: return POP_UP;
			case SEPARATOR_VALUE: return SEPARATOR;
			case SEPARATOR_FILL_VALUE: return SEPARATOR_FILL;
			case TOGGLE_VALUE: return TOGGLE;
			case ARROW_VALUE: return ARROW;
			case PUSH_VALUE: return PUSH;
			case RADIO_VALUE: return RADIO;
			case CHECK_VALUE: return CHECK;
			case CASCADE_VALUE: return CASCADE;
			case MULTI_VALUE: return MULTI;
			case SINGLE_VALUE: return SINGLE;
			case READ_ONLY_VALUE: return READ_ONLY;
			case WRAP_VALUE: return WRAP;
			case SEARCH_VALUE: return SEARCH;
			case SIMPLE_VALUE: return SIMPLE;
			case PASSWORD_VALUE: return PASSWORD;
			case SHADOW_IN_VALUE: return SHADOW_IN;
			case SHADOW_OUT_VALUE: return SHADOW_OUT;
			case SHADOW_ETCHED_IN_VALUE: return SHADOW_ETCHED_IN;
			case SHADOW_ETCHED_OUT_VALUE: return SHADOW_ETCHED_OUT;
			case SHADOW_NONE_VALUE: return SHADOW_NONE;
			case INDETERMINATE_VALUE: return INDETERMINATE;
			case TOOL_VALUE: return TOOL;
			case NO_TRIM_VALUE: return NO_TRIM;
			case TITLE_VALUE: return TITLE;
			case MENU_VALUE: return MENU;
			case MIN_VALUE: return MIN;
			case MAX_VALUE: return MAX;
			case NO_MOVE_VALUE: return NO_MOVE;
			case HSCROLL_VALUE: return HSCROLL;
			case VSCROLL_VALUE: return VSCROLL;
			case NO_SCROLL_VALUE: return NO_SCROLL;
			case BORDER_VALUE: return BORDER;
			case CLIP_CHILDREN_VALUE: return CLIP_CHILDREN;
			case CLIP_SIBLINGS_VALUE: return CLIP_SIBLINGS;
			case ON_TOP_VALUE: return ON_TOP;
			case SHEET_VALUE: return SHEET;
			case SHELL_TRIM_VALUE: return SHELL_TRIM;
			case DIALOG_TRIM_VALUE: return DIALOG_TRIM;
			case MODELESS_VALUE: return MODELESS;
			case PRIMARY_MODAL_VALUE: return PRIMARY_MODAL;
			case APPLICATION_MODAL_VALUE: return APPLICATION_MODAL;
			case SYSTEM_MODAL_VALUE: return SYSTEM_MODAL;
			case HIDE_SELECTION_VALUE: return HIDE_SELECTION;
			case FULL_SELECTION_VALUE: return FULL_SELECTION;
			case FLAT_VALUE: return FLAT;
			case SMOOTH_VALUE: return SMOOTH;
			case NO_BACKGROUND_VALUE: return NO_BACKGROUND;
			case NO_FOCUS_VALUE: return NO_FOCUS;
			case NO_REDRAW_RESIZE_VALUE: return NO_REDRAW_RESIZE;
			case NO_MERGE_PAINTS_VALUE: return NO_MERGE_PAINTS;
			case NO_RADIO_GROUP_VALUE: return NO_RADIO_GROUP;
			case LEFT_TO_RIGHT_VALUE: return LEFT_TO_RIGHT;
			case RIGHT_TO_LEFT_VALUE: return RIGHT_TO_LEFT;
			case MIRRORED_VALUE: return MIRRORED;
			case EMBEDDED_VALUE: return EMBEDDED;
			case VIRTUAL_VALUE: return VIRTUAL;
			case DOUBLE_BUFFERED_VALUE: return DOUBLE_BUFFERED;
			case TRANSPARENT_VALUE: return TRANSPARENT;
			case FLIP_TEXT_DIRECTION_VALUE: return FLIP_TEXT_DIRECTION;
			case AUTO_TEXT_DIRECTION_VALUE: return AUTO_TEXT_DIRECTION;
			case UP_VALUE: return UP;
			case UNDERLINE_SINGLE_VALUE: return UNDERLINE_SINGLE;
			case UNDERLINE_DOUBLE_VALUE: return UNDERLINE_DOUBLE;
			case UNDERLINE_ERROR_VALUE: return UNDERLINE_ERROR;
			case UNDERLINE_SQUIGGLE_VALUE: return UNDERLINE_SQUIGGLE;
			case UNDERLINE_LINK_VALUE: return UNDERLINE_LINK;
			case BORDER_SOLID_VALUE: return BORDER_SOLID;
			case BORDER_DASH_VALUE: return BORDER_DASH;
			case BORDER_DOT_VALUE: return BORDER_DOT;
			case TOP_VALUE: return TOP;
			case DOWN_VALUE: return DOWN;
			case BOTTOM_VALUE: return BOTTOM;
			case LEAD_VALUE: return LEAD;
			case LEFT_VALUE: return LEFT;
			case TRAIL_VALUE: return TRAIL;
			case RIGHT_VALUE: return RIGHT;
			case CENTER_VALUE: return CENTER;
			case HORIZONTAL_VALUE: return HORIZONTAL;
			case VERTICAL_VALUE: return VERTICAL;
			case DATE_VALUE: return DATE;
			case TIME_VALUE: return TIME;
			case CALENDAR_VALUE: return CALENDAR;
			case SHORT_VALUE: return SHORT;
			case MEDIUM_VALUE: return MEDIUM;
			case LONG_VALUE: return LONG;
			case MOZILLA_VALUE: return MOZILLA;
			case WEBKIT_VALUE: return WEBKIT;
			case BALLOON_VALUE: return BALLOON;
			case BEGINNING_VALUE: return BEGINNING;
			case FILL_VALUE: return FILL;
			case DBCS_VALUE: return DBCS;
			case ALPHA_VALUE: return ALPHA;
			case NATIVE_VALUE: return NATIVE;
			case PHONETIC_VALUE: return PHONETIC;
			case ROMAN_VALUE: return ROMAN;
			case BS_VALUE: return BS;
			case CR_VALUE: return CR;
			case DEL_VALUE: return DEL;
			case ESC_VALUE: return ESC;
			case LF_VALUE: return LF;
			case TAB_VALUE: return TAB;
			case SPACE_VALUE: return SPACE;
			case ALT_VALUE: return ALT;
			case SHIFT_VALUE: return SHIFT;
			case CTRL_VALUE: return CTRL;
			case CONTROL_VALUE: return CONTROL;
			case COMMAND_VALUE: return COMMAND;
			case MODIFIER_MASK_VALUE: return MODIFIER_MASK;
			case BUTTON1_VALUE: return BUTTON1;
			case BUTTON2_VALUE: return BUTTON2;
			case BUTTON3_VALUE: return BUTTON3;
			case BUTTON4_VALUE: return BUTTON4;
			case BUTTON5_VALUE: return BUTTON5;
			case BUTTON_MASK_VALUE: return BUTTON_MASK;
			case MOD1_VALUE: return MOD1;
			case MOD2_VALUE: return MOD2;
			case MOD3_VALUE: return MOD3;
			case MOD4_VALUE: return MOD4;
			case SCROLL_LINE_VALUE: return SCROLL_LINE;
			case SCROLL_PAGE_VALUE: return SCROLL_PAGE;
			case KEYCODE_BIT_VALUE: return KEYCODE_BIT;
			case KEY_MASK_VALUE: return KEY_MASK;
			case ARROW_UP_VALUE: return ARROW_UP;
			case ARROW_DOWN_VALUE: return ARROW_DOWN;
			case ARROW_LEFT_VALUE: return ARROW_LEFT;
			case ARROW_RIGHT_VALUE: return ARROW_RIGHT;
			case PAGE_UP_VALUE: return PAGE_UP;
			case PAGE_DOWN_VALUE: return PAGE_DOWN;
			case HOME_VALUE: return HOME;
			case END_VALUE: return END;
			case INSERT_VALUE: return INSERT;
			case F1_VALUE: return F1;
			case F2_VALUE: return F2;
			case F3_VALUE: return F3;
			case F4_VALUE: return F4;
			case F5_VALUE: return F5;
			case F6_VALUE: return F6;
			case F7_VALUE: return F7;
			case F8_VALUE: return F8;
			case F9_VALUE: return F9;
			case F10_VALUE: return F10;
			case F11_VALUE: return F11;
			case F12_VALUE: return F12;
			case F13_VALUE: return F13;
			case F14_VALUE: return F14;
			case F15_VALUE: return F15;
			case F16_VALUE: return F16;
			case F17_VALUE: return F17;
			case F18_VALUE: return F18;
			case F19_VALUE: return F19;
			case F20_VALUE: return F20;
			case KEYPAD_VALUE: return KEYPAD;
			case KEYPAD_MULTIPLY_VALUE: return KEYPAD_MULTIPLY;
			case KEYPAD_ADD_VALUE: return KEYPAD_ADD;
			case KEYPAD_SUBTRACT_VALUE: return KEYPAD_SUBTRACT;
			case KEYPAD_DECIMAL_VALUE: return KEYPAD_DECIMAL;
			case KEYPAD_DIVIDE_VALUE: return KEYPAD_DIVIDE;
			case KEYPAD_0_VALUE: return KEYPAD_0;
			case KEYPAD_1_VALUE: return KEYPAD_1;
			case KEYPAD_2_VALUE: return KEYPAD_2;
			case KEYPAD_3_VALUE: return KEYPAD_3;
			case KEYPAD_4_VALUE: return KEYPAD_4;
			case KEYPAD_5_VALUE: return KEYPAD_5;
			case KEYPAD_6_VALUE: return KEYPAD_6;
			case KEYPAD_7_VALUE: return KEYPAD_7;
			case KEYPAD_8_VALUE: return KEYPAD_8;
			case KEYPAD_9_VALUE: return KEYPAD_9;
			case KEYPAD_EQUAL_VALUE: return KEYPAD_EQUAL;
			case KEYPAD_CR_VALUE: return KEYPAD_CR;
			case CAPS_LOCK_VALUE: return CAPS_LOCK;
			case NUM_LOCK_VALUE: return NUM_LOCK;
			case SCROLL_LOCK_VALUE: return SCROLL_LOCK;
			case PAUSE_VALUE: return PAUSE;
			case BREAK_VALUE: return BREAK;
			case PRINT_SCREEN_VALUE: return PRINT_SCREEN;
			case ICON_ERROR_VALUE: return ICON_ERROR;
			case ICON_INFORMATION_VALUE: return ICON_INFORMATION;
			case ICON_QUESTION_VALUE: return ICON_QUESTION;
			case ICON_WARNING_VALUE: return ICON_WARNING;
			case ICON_WORKING_VALUE: return ICON_WORKING;
			case ICON_SEARCH_VALUE: return ICON_SEARCH;
			case ICON_CANCEL_VALUE: return ICON_CANCEL;
			case OK_VALUE: return OK;
			case YES_VALUE: return YES;
			case NO_VALUE: return NO;
			case CANCEL_VALUE: return CANCEL;
			case ABORT_VALUE: return ABORT;
			case RETRY_VALUE: return RETRY;
			case IGNORE_VALUE: return IGNORE;
			case OPEN_VALUE: return OPEN;
			case SAVE_VALUE: return SAVE;
			case INHERIT_NONE_VALUE: return INHERIT_NONE;
			case INHERIT_DEFAULT_VALUE: return INHERIT_DEFAULT;
			case INHERIT_FORCE_VALUE: return INHERIT_FORCE;
			case COLOR_WHITE_VALUE: return COLOR_WHITE;
			case COLOR_BLACK_VALUE: return COLOR_BLACK;
			case COLOR_RED_VALUE: return COLOR_RED;
			case COLOR_DARK_RED_VALUE: return COLOR_DARK_RED;
			case COLOR_GREEN_VALUE: return COLOR_GREEN;
			case COLOR_DARK_GREEN_VALUE: return COLOR_DARK_GREEN;
			case COLOR_YELLOW_VALUE: return COLOR_YELLOW;
			case COLOR_DARK_YELLOW_VALUE: return COLOR_DARK_YELLOW;
			case COLOR_BLUE_VALUE: return COLOR_BLUE;
			case COLOR_DARK_BLUE_VALUE: return COLOR_DARK_BLUE;
			case COLOR_MAGENTA_VALUE: return COLOR_MAGENTA;
			case COLOR_DARK_MAGENTA_VALUE: return COLOR_DARK_MAGENTA;
			case COLOR_CYAN_VALUE: return COLOR_CYAN;
			case COLOR_DARK_CYAN_VALUE: return COLOR_DARK_CYAN;
			case COLOR_GRAY_VALUE: return COLOR_GRAY;
			case COLOR_DARK_GRAY_VALUE: return COLOR_DARK_GRAY;
			case COLOR_WIDGET_DARK_SHADOW_VALUE: return COLOR_WIDGET_DARK_SHADOW;
			case COLOR_WIDGET_NORMAL_SHADOW_VALUE: return COLOR_WIDGET_NORMAL_SHADOW;
			case COLOR_WIDGET_LIGHT_SHADOW_VALUE: return COLOR_WIDGET_LIGHT_SHADOW;
			case COLOR_WIDGET_HIGHLIGHT_SHADOW_VALUE: return COLOR_WIDGET_HIGHLIGHT_SHADOW;
			case COLOR_WIDGET_FOREGROUND_VALUE: return COLOR_WIDGET_FOREGROUND;
			case COLOR_WIDGET_BACKGROUND_VALUE: return COLOR_WIDGET_BACKGROUND;
			case COLOR_WIDGET_BORDER_VALUE: return COLOR_WIDGET_BORDER;
			case COLOR_LIST_FOREGROUND_VALUE: return COLOR_LIST_FOREGROUND;
			case COLOR_LIST_BACKGROUND_VALUE: return COLOR_LIST_BACKGROUND;
			case COLOR_LIST_SELECTION_VALUE: return COLOR_LIST_SELECTION;
			case COLOR_LIST_SELECTION_TEXT_VALUE: return COLOR_LIST_SELECTION_TEXT;
			case COLOR_INFO_FOREGROUND_VALUE: return COLOR_INFO_FOREGROUND;
			case COLOR_INFO_BACKGROUND_VALUE: return COLOR_INFO_BACKGROUND;
			case COLOR_TITLE_FOREGROUND_VALUE: return COLOR_TITLE_FOREGROUND;
			case COLOR_TITLE_BACKGROUND_VALUE: return COLOR_TITLE_BACKGROUND;
			case COLOR_TITLE_BACKGROUND_GRADIENT_VALUE: return COLOR_TITLE_BACKGROUND_GRADIENT;
			case COLOR_TITLE_INACTIVE_FOREGROUND_VALUE: return COLOR_TITLE_INACTIVE_FOREGROUND;
			case COLOR_TITLE_INACTIVE_BACKGROUND_VALUE: return COLOR_TITLE_INACTIVE_BACKGROUND;
			case COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT_VALUE: return COLOR_TITLE_INACTIVE_BACKGROUND_GRADIENT;
			case COLOR_LINK_FOREGROUND_VALUE: return COLOR_LINK_FOREGROUND;
			case COLOR_TRANSPARENT_VALUE: return COLOR_TRANSPARENT;
			case DRAW_TRANSPARENT_VALUE: return DRAW_TRANSPARENT;
			case DRAW_DELIMITER_VALUE: return DRAW_DELIMITER;
			case DRAW_TAB_VALUE: return DRAW_TAB;
			case DRAW_MNEMONIC_VALUE: return DRAW_MNEMONIC;
			case DELIMITER_SELECTION_VALUE: return DELIMITER_SELECTION;
			case LAST_LINE_SELECTION_VALUE: return LAST_LINE_SELECTION;
			case ERROR_UNSPECIFIED_VALUE: return ERROR_UNSPECIFIED;
			case ERROR_NO_HANDLES_VALUE: return ERROR_NO_HANDLES;
			case ERROR_NO_MORE_CALLBACKS_VALUE: return ERROR_NO_MORE_CALLBACKS;
			case ERROR_NULL_ARGUMENT_VALUE: return ERROR_NULL_ARGUMENT;
			case ERROR_INVALID_ARGUMENT_VALUE: return ERROR_INVALID_ARGUMENT;
			case ERROR_INVALID_RANGE_VALUE: return ERROR_INVALID_RANGE;
			case ERROR_CANNOT_BE_ZERO_VALUE: return ERROR_CANNOT_BE_ZERO;
			case ERROR_CANNOT_GET_ITEM_VALUE: return ERROR_CANNOT_GET_ITEM;
			case ERROR_CANNOT_GET_SELECTION_VALUE: return ERROR_CANNOT_GET_SELECTION;
			case ERROR_CANNOT_INVERT_MATRIX_VALUE: return ERROR_CANNOT_INVERT_MATRIX;
			case ERROR_CANNOT_GET_ITEM_HEIGHT_VALUE: return ERROR_CANNOT_GET_ITEM_HEIGHT;
			case ERROR_CANNOT_GET_TEXT_VALUE: return ERROR_CANNOT_GET_TEXT;
			case ERROR_CANNOT_SET_TEXT_VALUE: return ERROR_CANNOT_SET_TEXT;
			case ERROR_ITEM_NOT_ADDED_VALUE: return ERROR_ITEM_NOT_ADDED;
			case ERROR_ITEM_NOT_REMOVED_VALUE: return ERROR_ITEM_NOT_REMOVED;
			case ERROR_NO_GRAPHICS_LIBRARY_VALUE: return ERROR_NO_GRAPHICS_LIBRARY;
			case ERROR_NOT_IMPLEMENTED_VALUE: return ERROR_NOT_IMPLEMENTED;
			case ERROR_MENU_NOT_DROP_DOWN_VALUE: return ERROR_MENU_NOT_DROP_DOWN;
			case ERROR_THREAD_INVALID_ACCESS_VALUE: return ERROR_THREAD_INVALID_ACCESS;
			case ERROR_WIDGET_DISPOSED_VALUE: return ERROR_WIDGET_DISPOSED;
			case ERROR_MENUITEM_NOT_CASCADE_VALUE: return ERROR_MENUITEM_NOT_CASCADE;
			case ERROR_CANNOT_SET_SELECTION_VALUE: return ERROR_CANNOT_SET_SELECTION;
			case ERROR_CANNOT_SET_MENU_VALUE: return ERROR_CANNOT_SET_MENU;
			case ERROR_CANNOT_SET_ENABLED_VALUE: return ERROR_CANNOT_SET_ENABLED;
			case ERROR_CANNOT_GET_ENABLED_VALUE: return ERROR_CANNOT_GET_ENABLED;
			case ERROR_INVALID_PARENT_VALUE: return ERROR_INVALID_PARENT;
			case ERROR_MENU_NOT_BAR_VALUE: return ERROR_MENU_NOT_BAR;
			case ERROR_CANNOT_GET_COUNT_VALUE: return ERROR_CANNOT_GET_COUNT;
			case ERROR_MENU_NOT_POP_UP_VALUE: return ERROR_MENU_NOT_POP_UP;
			case ERROR_UNSUPPORTED_DEPTH_VALUE: return ERROR_UNSUPPORTED_DEPTH;
			case ERROR_IO_VALUE: return ERROR_IO;
			case ERROR_INVALID_IMAGE_VALUE: return ERROR_INVALID_IMAGE;
			case ERROR_UNSUPPORTED_FORMAT_VALUE: return ERROR_UNSUPPORTED_FORMAT;
			case ERROR_INVALID_SUBCLASS_VALUE: return ERROR_INVALID_SUBCLASS;
			case ERROR_GRAPHIC_DISPOSED_VALUE: return ERROR_GRAPHIC_DISPOSED;
			case ERROR_DEVICE_DISPOSED_VALUE: return ERROR_DEVICE_DISPOSED;
			case ERROR_FAILED_EXEC_VALUE: return ERROR_FAILED_EXEC;
			case ERROR_FAILED_LOAD_LIBRARY_VALUE: return ERROR_FAILED_LOAD_LIBRARY;
			case ERROR_INVALID_FONT_VALUE: return ERROR_INVALID_FONT;
			case ERROR_FUNCTION_DISPOSED_VALUE: return ERROR_FUNCTION_DISPOSED;
			case ERROR_FAILED_EVALUATE_VALUE: return ERROR_FAILED_EVALUATE;
			case ERROR_INVALID_RETURN_VALUE_VALUE: return ERROR_INVALID_RETURN_VALUE;
			case BITMAP_VALUE: return BITMAP;
			case ICON_VALUE: return ICON;
			case IMAGE_COPY_VALUE: return IMAGE_COPY;
			case IMAGE_DISABLE_VALUE: return IMAGE_DISABLE;
			case IMAGE_GRAY_VALUE: return IMAGE_GRAY;
			case ERROR_VALUE: return ERROR;
			case PAUSED_VALUE: return PAUSED;
			case NORMAL_VALUE: return NORMAL;
			case BOLD_VALUE: return BOLD;
			case ITALIC_VALUE: return ITALIC;
			case CURSOR_ARROW_VALUE: return CURSOR_ARROW;
			case CURSOR_WAIT_VALUE: return CURSOR_WAIT;
			case CURSOR_CROSS_VALUE: return CURSOR_CROSS;
			case CURSOR_APPSTARTING_VALUE: return CURSOR_APPSTARTING;
			case CURSOR_HELP_VALUE: return CURSOR_HELP;
			case CURSOR_SIZEALL_VALUE: return CURSOR_SIZEALL;
			case CURSOR_SIZENESW_VALUE: return CURSOR_SIZENESW;
			case CURSOR_SIZENS_VALUE: return CURSOR_SIZENS;
			case CURSOR_SIZENWSE_VALUE: return CURSOR_SIZENWSE;
			case CURSOR_SIZEWE_VALUE: return CURSOR_SIZEWE;
			case CURSOR_SIZEN_VALUE: return CURSOR_SIZEN;
			case CURSOR_SIZES_VALUE: return CURSOR_SIZES;
			case CURSOR_SIZEE_VALUE: return CURSOR_SIZEE;
			case CURSOR_SIZEW_VALUE: return CURSOR_SIZEW;
			case CURSOR_SIZENE_VALUE: return CURSOR_SIZENE;
			case CURSOR_SIZESE_VALUE: return CURSOR_SIZESE;
			case CURSOR_SIZESW_VALUE: return CURSOR_SIZESW;
			case CURSOR_SIZENW_VALUE: return CURSOR_SIZENW;
			case CURSOR_UPARROW_VALUE: return CURSOR_UPARROW;
			case CURSOR_IBEAM_VALUE: return CURSOR_IBEAM;
			case CURSOR_NO_VALUE: return CURSOR_NO;
			case CURSOR_HAND_VALUE: return CURSOR_HAND;
			case CAP_FLAT_VALUE: return CAP_FLAT;
			case CAP_ROUND_VALUE: return CAP_ROUND;
			case CAP_SQUARE_VALUE: return CAP_SQUARE;
			case JOIN_MITER_VALUE: return JOIN_MITER;
			case JOIN_ROUND_VALUE: return JOIN_ROUND;
			case JOIN_BEVEL_VALUE: return JOIN_BEVEL;
			case LINE_SOLID_VALUE: return LINE_SOLID;
			case LINE_DASH_VALUE: return LINE_DASH;
			case LINE_DOT_VALUE: return LINE_DOT;
			case LINE_DASHDOT_VALUE: return LINE_DASHDOT;
			case LINE_DASHDOTDOT_VALUE: return LINE_DASHDOTDOT;
			case LINE_CUSTOM_VALUE: return LINE_CUSTOM;
			case PATH_MOVE_TO_VALUE: return PATH_MOVE_TO;
			case PATH_LINE_TO_VALUE: return PATH_LINE_TO;
			case PATH_QUAD_TO_VALUE: return PATH_QUAD_TO;
			case PATH_CUBIC_TO_VALUE: return PATH_CUBIC_TO;
			case PATH_CLOSE_VALUE: return PATH_CLOSE;
			case FILL_EVEN_ODD_VALUE: return FILL_EVEN_ODD;
			case FILL_WINDING_VALUE: return FILL_WINDING;
			case IMAGE_UNDEFINED_VALUE: return IMAGE_UNDEFINED;
			case IMAGE_BMP_VALUE: return IMAGE_BMP;
			case IMAGE_BMP_RLE_VALUE: return IMAGE_BMP_RLE;
			case IMAGE_GIF_VALUE: return IMAGE_GIF;
			case IMAGE_ICO_VALUE: return IMAGE_ICO;
			case IMAGE_JPEG_VALUE: return IMAGE_JPEG;
			case IMAGE_PNG_VALUE: return IMAGE_PNG;
			case IMAGE_TIFF_VALUE: return IMAGE_TIFF;
			case IMAGE_OS2_BMP_VALUE: return IMAGE_OS2_BMP;
			case DM_UNSPECIFIED_VALUE: return DM_UNSPECIFIED;
			case DM_FILL_NONE_VALUE: return DM_FILL_NONE;
			case DM_FILL_BACKGROUND_VALUE: return DM_FILL_BACKGROUND;
			case DM_FILL_PREVIOUS_VALUE: return DM_FILL_PREVIOUS;
			case TRANSPARENCY_NONE_VALUE: return TRANSPARENCY_NONE;
			case TRANSPARENCY_ALPHA_VALUE: return TRANSPARENCY_ALPHA;
			case TRANSPARENCY_MASK_VALUE: return TRANSPARENCY_MASK;
			case TRANSPARENCY_PIXEL_VALUE: return TRANSPARENCY_PIXEL;
			case MOVEMENT_CHAR_VALUE: return MOVEMENT_CHAR;
			case MOVEMENT_CLUSTER_VALUE: return MOVEMENT_CLUSTER;
			case MOVEMENT_WORD_VALUE: return MOVEMENT_WORD;
			case MOVEMENT_WORD_END_VALUE: return MOVEMENT_WORD_END;
			case MOVEMENT_WORD_START_VALUE: return MOVEMENT_WORD_START;
			case ALL_VALUE: return ALL;
			case ID_ABOUT_VALUE: return ID_ABOUT;
			case ID_PREFERENCES_VALUE: return ID_PREFERENCES;
			case ID_HIDE_VALUE: return ID_HIDE;
			case ID_HIDE_OTHERS_VALUE: return ID_HIDE_OTHERS;
			case ID_SHOW_ALL_VALUE: return ID_SHOW_ALL;
			case ID_QUIT_VALUE: return ID_QUIT;
			case SKIN_CLASS_VALUE: return SKIN_CLASS;
			case SCROLLBAR_OVERLAY_VALUE: return SCROLLBAR_OVERLAY;
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
	private Style(int value, String name, String literal) {
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
	
} //Style
