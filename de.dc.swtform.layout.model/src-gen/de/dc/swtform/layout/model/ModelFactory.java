/**
 */
package de.dc.swtform.layout.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.layout.model.ModelPackage
 * @generated
 */
public interface ModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ModelFactory eINSTANCE = de.dc.swtform.layout.model.impl.ModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>XGrid Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XGrid Data</em>'.
	 * @generated
	 */
	XGridData createXGridData();

	/**
	 * Returns a new object of class '<em>XFill Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XFill Data</em>'.
	 * @generated
	 */
	XFillData createXFillData();

	/**
	 * Returns a new object of class '<em>XRow Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRow Data</em>'.
	 * @generated
	 */
	XRowData createXRowData();

	/**
	 * Returns a new object of class '<em>XGrid Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XGrid Layout</em>'.
	 * @generated
	 */
	XGridLayout createXGridLayout();

	/**
	 * Returns a new object of class '<em>XFill Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XFill Layout</em>'.
	 * @generated
	 */
	XFillLayout createXFillLayout();

	/**
	 * Returns a new object of class '<em>XRow Layout</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XRow Layout</em>'.
	 * @generated
	 */
	XRowLayout createXRowLayout();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ModelPackage getModelPackage();

} //ModelFactory
