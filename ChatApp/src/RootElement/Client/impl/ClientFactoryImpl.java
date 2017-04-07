/**
 */
package RootElement.Client.impl;

import RootElement.Client.*;

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
public class ClientFactoryImpl extends EFactoryImpl implements ClientFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientFactory init() {
		try {
			ClientFactory theClientFactory = (ClientFactory)EPackage.Registry.INSTANCE.getEFactory(ClientPackage.eNS_URI);
			if (theClientFactory != null) {
				return theClientFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ClientFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientFactoryImpl() {
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
			case ClientPackage.REGISTER: return createRegister();
			case ClientPackage.LOG_IN: return createLogIn();
			case ClientPackage.SEND_MESSAGE: return createSendMessage();
			case ClientPackage.FRIEND_DATA: return createFriendData();
			case ClientPackage.RECEIVE_MESSAGE: return createReceiveMessage();
			case ClientPackage.FRIENDS: return createFriends();
			case ClientPackage.LOG_OUT: return createLogOut();
			case ClientPackage.CLASS1: return createClass1();
			case ClientPackage.USER_DATA: return createUserData();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register createRegister() {
		RegisterImpl register = new RegisterImpl();
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogIn createLogIn() {
		LogInImpl logIn = new LogInImpl();
		return logIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage createSendMessage() {
		SendMessageImpl sendMessage = new SendMessageImpl();
		return sendMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendData createFriendData() {
		FriendDataImpl friendData = new FriendDataImpl();
		return friendData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage createReceiveMessage() {
		ReceiveMessageImpl receiveMessage = new ReceiveMessageImpl();
		return receiveMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Friends createFriends() {
		FriendsImpl friends = new FriendsImpl();
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogOut createLogOut() {
		LogOutImpl logOut = new LogOutImpl();
		return logOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class1 createClass1() {
		Class1Impl class1 = new Class1Impl();
		return class1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData createUserData() {
		UserDataImpl userData = new UserDataImpl();
		return userData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientPackage getClientPackage() {
		return (ClientPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ClientPackage getPackage() {
		return ClientPackage.eINSTANCE;
	}

} //ClientFactoryImpl
