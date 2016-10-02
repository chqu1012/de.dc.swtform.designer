/**
 */
package de.dc.swtform.layout.model.util;

import de.dc.swtform.layout.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.swtform.layout.model.ModelPackage
 * @generated
 */
public class ModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelSwitch<Adapter> modelSwitch =
		new ModelSwitch<Adapter>() {
			@Override
			public Adapter caseXLayoutElement(XLayoutElement object) {
				return createXLayoutElementAdapter();
			}
			@Override
			public Adapter caseXLayoutDataElement(XLayoutDataElement object) {
				return createXLayoutDataElementAdapter();
			}
			@Override
			public Adapter caseXLayoutData(XLayoutData object) {
				return createXLayoutDataAdapter();
			}
			@Override
			public Adapter caseXLayout(XLayout object) {
				return createXLayoutAdapter();
			}
			@Override
			public Adapter caseXGridData(XGridData object) {
				return createXGridDataAdapter();
			}
			@Override
			public Adapter caseXFillData(XFillData object) {
				return createXFillDataAdapter();
			}
			@Override
			public Adapter caseXRowData(XRowData object) {
				return createXRowDataAdapter();
			}
			@Override
			public Adapter caseXGridLayout(XGridLayout object) {
				return createXGridLayoutAdapter();
			}
			@Override
			public Adapter caseXFillLayout(XFillLayout object) {
				return createXFillLayoutAdapter();
			}
			@Override
			public Adapter caseXRowLayout(XRowLayout object) {
				return createXRowLayoutAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayoutElement <em>XLayout Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayoutElement
	 * @generated
	 */
	public Adapter createXLayoutElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayoutDataElement <em>XLayout Data Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayoutDataElement
	 * @generated
	 */
	public Adapter createXLayoutDataElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayoutData <em>XLayout Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayoutData
	 * @generated
	 */
	public Adapter createXLayoutDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XLayout <em>XLayout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XLayout
	 * @generated
	 */
	public Adapter createXLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XGridData <em>XGrid Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XGridData
	 * @generated
	 */
	public Adapter createXGridDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XFillData <em>XFill Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XFillData
	 * @generated
	 */
	public Adapter createXFillDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XRowData <em>XRow Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XRowData
	 * @generated
	 */
	public Adapter createXRowDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XGridLayout <em>XGrid Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XGridLayout
	 * @generated
	 */
	public Adapter createXGridLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XFillLayout <em>XFill Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XFillLayout
	 * @generated
	 */
	public Adapter createXFillLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.swtform.layout.model.XRowLayout <em>XRow Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.swtform.layout.model.XRowLayout
	 * @generated
	 */
	public Adapter createXRowLayoutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //ModelAdapterFactory
