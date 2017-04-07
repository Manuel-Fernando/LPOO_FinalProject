/**
 */
package RootElement.Server.util;

import RootElement.Server.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Server.ServerPackage
 * @generated
 */
public class ServerAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServerPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = ServerPackage.eINSTANCE;
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
	protected ServerSwitch<Adapter> modelSwitch =
		new ServerSwitch<Adapter>() {
			@Override
			public Adapter caseAcceptClients(AcceptClients object) {
				return createAcceptClientsAdapter();
			}
			@Override
			public Adapter caseReceiveMessageRequest(ReceiveMessageRequest object) {
				return createReceiveMessageRequestAdapter();
			}
			@Override
			public Adapter caseSendMessageRequest(SendMessageRequest object) {
				return createSendMessageRequestAdapter();
			}
			@Override
			public Adapter caseRegisterRequest(RegisterRequest object) {
				return createRegisterRequestAdapter();
			}
			@Override
			public Adapter caseLogInRequest(LogInRequest object) {
				return createLogInRequestAdapter();
			}
			@Override
			public Adapter caseSQLInformations(SQLInformations object) {
				return createSQLInformationsAdapter();
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
	 * Creates a new adapter for an object of class '{@link RootElement.Server.AcceptClients <em>Accept Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.AcceptClients
	 * @generated
	 */
	public Adapter createAcceptClientsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Server.ReceiveMessageRequest <em>Receive Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.ReceiveMessageRequest
	 * @generated
	 */
	public Adapter createReceiveMessageRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Server.SendMessageRequest <em>Send Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.SendMessageRequest
	 * @generated
	 */
	public Adapter createSendMessageRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Server.RegisterRequest <em>Register Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.RegisterRequest
	 * @generated
	 */
	public Adapter createRegisterRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Server.LogInRequest <em>Log In Request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.LogInRequest
	 * @generated
	 */
	public Adapter createLogInRequestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link RootElement.Server.SQLInformations <em>SQL Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see RootElement.Server.SQLInformations
	 * @generated
	 */
	public Adapter createSQLInformationsAdapter() {
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

} //ServerAdapterFactory
