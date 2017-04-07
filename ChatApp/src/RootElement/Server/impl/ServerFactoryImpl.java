/**
 */
package RootElement.Server.impl;

import RootElement.Server.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ServerFactoryImpl extends EFactoryImpl implements ServerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ServerFactory init() {
		try {
			ServerFactory theServerFactory = (ServerFactory)EPackage.Registry.INSTANCE.getEFactory(ServerPackage.eNS_URI);
			if (theServerFactory != null) {
				return theServerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ServerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ServerPackage.ACCEPT_CLIENTS: return createAcceptClients();
			case ServerPackage.RECEIVE_MESSAGE_REQUEST: return createReceiveMessageRequest();
			case ServerPackage.SEND_MESSAGE_REQUEST: return createSendMessageRequest();
			case ServerPackage.REGISTER_REQUEST: return createRegisterRequest();
			case ServerPackage.LOG_IN_REQUEST: return createLogInRequest();
			case ServerPackage.SQL_INFORMATIONS: return createSQLInformations();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AcceptClients createAcceptClients() {
		AcceptClientsImpl acceptClients = new AcceptClientsImpl();
		return acceptClients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageRequest createReceiveMessageRequest() {
		ReceiveMessageRequestImpl receiveMessageRequest = new ReceiveMessageRequestImpl();
		return receiveMessageRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageRequest createSendMessageRequest() {
		SendMessageRequestImpl sendMessageRequest = new SendMessageRequestImpl();
		return sendMessageRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterRequest createRegisterRequest() {
		RegisterRequestImpl registerRequest = new RegisterRequestImpl();
		return registerRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogInRequest createLogInRequest() {
		LogInRequestImpl logInRequest = new LogInRequestImpl();
		return logInRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SQLInformations createSQLInformations() {
		SQLInformationsImpl sqlInformations = new SQLInformationsImpl();
		return sqlInformations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerPackage getServerPackage() {
		return (ServerPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ServerPackage getPackage() {
		return ServerPackage.eINSTANCE;
	}

} //ServerFactoryImpl
