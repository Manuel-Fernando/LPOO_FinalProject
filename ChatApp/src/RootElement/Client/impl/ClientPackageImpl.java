/**
 */
package RootElement.Client.impl;

import RootElement.Client.Class1;
import RootElement.Client.ClientFactory;
import RootElement.Client.ClientPackage;
import RootElement.Client.FriendData;
import RootElement.Client.Friends;
import RootElement.Client.LogIn;
import RootElement.Client.LogOut;
import RootElement.Client.ReceiveMessage;
import RootElement.Client.Register;
import RootElement.Client.SendMessage;
import RootElement.Client.UserData;

import RootElement.Server.ServerPackage;

import RootElement.Server.impl.ServerPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.types.impl.TypesPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ClientPackageImpl extends EPackageImpl implements ClientPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logInEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass friendDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass friendsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass class1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userDataEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see RootElement.Client.ClientPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ClientPackageImpl() {
		super(eNS_URI, ClientFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ClientPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ClientPackage init() {
		if (isInited) return (ClientPackage)EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI);

		// Obtain or create and register package
		ClientPackageImpl theClientPackage = (ClientPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ClientPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ClientPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ServerPackageImpl theServerPackage = (ServerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI) instanceof ServerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI) : ServerPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theClientPackage.createPackageContents();
		theServerPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theClientPackage.initializePackageContents();
		theServerPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theClientPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ClientPackage.eNS_URI, theClientPackage);
		return theClientPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegister() {
		return registerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegister_User() {
		return (EReference)registerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegister__RegisterRequest() {
		return registerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogIn() {
		return logInEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogIn_User() {
		return (EReference)logInEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogIn__LogInRequest() {
		return logInEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessage() {
		return sendMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendMessage_Message() {
		return (EAttribute)sendMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessage_Friend() {
		return (EReference)sendMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessage_Receivemessagerequest() {
		return (EReference)sendMessageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendMessage__Send() {
		return sendMessageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFriendData() {
		return friendDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFriendData_Name() {
		return (EAttribute)friendDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFriendData_Email() {
		return (EAttribute)friendDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendData_Receivemessage() {
		return (EReference)friendDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendData_Sendmessage() {
		return (EReference)friendDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriendData_Friends() {
		return (EReference)friendDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMessage() {
		return receiveMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveMessage_Message() {
		return (EAttribute)receiveMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessage_Friend() {
		return (EReference)receiveMessageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveMessage__Receive() {
		return receiveMessageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFriends() {
		return friendsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFriends_FriendsList() {
		return (EReference)friendsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFriends__AddFriend__FriendData() {
		return friendsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFriends__RemoveFriend__FriendData() {
		return friendsEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogOut() {
		return logOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogOut_User() {
		return (EReference)logOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogOut__LogOutRequest() {
		return logOutEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClass1() {
		return class1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserData() {
		return userDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_Email() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_UserName() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserData_Password() {
		return (EAttribute)userDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Logout() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Login() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserData_Register() {
		return (EReference)userDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientFactory getClientFactory() {
		return (ClientFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		registerEClass = createEClass(REGISTER);
		createEReference(registerEClass, REGISTER__USER);
		createEOperation(registerEClass, REGISTER___REGISTER_REQUEST);

		logInEClass = createEClass(LOG_IN);
		createEReference(logInEClass, LOG_IN__USER);
		createEOperation(logInEClass, LOG_IN___LOG_IN_REQUEST);

		sendMessageEClass = createEClass(SEND_MESSAGE);
		createEAttribute(sendMessageEClass, SEND_MESSAGE__MESSAGE);
		createEReference(sendMessageEClass, SEND_MESSAGE__FRIEND);
		createEReference(sendMessageEClass, SEND_MESSAGE__RECEIVEMESSAGEREQUEST);
		createEOperation(sendMessageEClass, SEND_MESSAGE___SEND);

		friendDataEClass = createEClass(FRIEND_DATA);
		createEAttribute(friendDataEClass, FRIEND_DATA__NAME);
		createEAttribute(friendDataEClass, FRIEND_DATA__EMAIL);
		createEReference(friendDataEClass, FRIEND_DATA__RECEIVEMESSAGE);
		createEReference(friendDataEClass, FRIEND_DATA__SENDMESSAGE);
		createEReference(friendDataEClass, FRIEND_DATA__FRIENDS);

		receiveMessageEClass = createEClass(RECEIVE_MESSAGE);
		createEAttribute(receiveMessageEClass, RECEIVE_MESSAGE__MESSAGE);
		createEReference(receiveMessageEClass, RECEIVE_MESSAGE__FRIEND);
		createEOperation(receiveMessageEClass, RECEIVE_MESSAGE___RECEIVE);

		friendsEClass = createEClass(FRIENDS);
		createEReference(friendsEClass, FRIENDS__FRIENDS_LIST);
		createEOperation(friendsEClass, FRIENDS___ADD_FRIEND__FRIENDDATA);
		createEOperation(friendsEClass, FRIENDS___REMOVE_FRIEND__FRIENDDATA);

		logOutEClass = createEClass(LOG_OUT);
		createEReference(logOutEClass, LOG_OUT__USER);
		createEOperation(logOutEClass, LOG_OUT___LOG_OUT_REQUEST);

		class1EClass = createEClass(CLASS1);

		userDataEClass = createEClass(USER_DATA);
		createEAttribute(userDataEClass, USER_DATA__EMAIL);
		createEAttribute(userDataEClass, USER_DATA__USER_NAME);
		createEAttribute(userDataEClass, USER_DATA__PASSWORD);
		createEReference(userDataEClass, USER_DATA__LOGOUT);
		createEReference(userDataEClass, USER_DATA__LOGIN);
		createEReference(userDataEClass, USER_DATA__REGISTER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ServerPackage theServerPackage = (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(registerEClass, Register.class, "Register", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegister_User(), this.getUserData(), null, "user", null, 1, 1, Register.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRegister__RegisterRequest(), ecorePackage.getEBoolean(), "RegisterRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(logInEClass, LogIn.class, "LogIn", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogIn_User(), this.getUserData(), null, "user", null, 1, 1, LogIn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLogIn__LogInRequest(), ecorePackage.getEBoolean(), "LogInRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sendMessageEClass, SendMessage.class, "SendMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSendMessage_Message(), ecorePackage.getEString(), "message", null, 1, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendMessage_Friend(), this.getFriendData(), null, "friend", null, 1, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendMessage_Receivemessagerequest(), theServerPackage.getReceiveMessageRequest(), null, "receivemessagerequest", null, 1, 1, SendMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getSendMessage__Send(), ecorePackage.getEBoolean(), "send", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(friendDataEClass, FriendData.class, "FriendData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFriendData_Name(), ecorePackage.getEString(), "name", null, 1, 1, FriendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getFriendData_Email(), ecorePackage.getEString(), "email", null, 1, 1, FriendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFriendData_Receivemessage(), this.getReceiveMessage(), null, "receivemessage", null, 1, 1, FriendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFriendData_Sendmessage(), this.getSendMessage(), null, "sendmessage", null, 1, 1, FriendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFriendData_Friends(), this.getFriends(), null, "friends", null, 0, -1, FriendData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(receiveMessageEClass, ReceiveMessage.class, "ReceiveMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReceiveMessage_Message(), ecorePackage.getEString(), "message", null, 1, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceiveMessage_Friend(), this.getFriendData(), null, "friend", null, 1, 1, ReceiveMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReceiveMessage__Receive(), ecorePackage.getEBoolean(), "receive", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(friendsEClass, Friends.class, "Friends", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFriends_FriendsList(), this.getFriendData(), null, "friendsList", null, 0, -1, Friends.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getFriends__AddFriend__FriendData(), null, "addFriend", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFriendData(), "friend", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = initEOperation(getFriends__RemoveFriend__FriendData(), null, "removeFriend", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, this.getFriendData(), "friend", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(logOutEClass, LogOut.class, "LogOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogOut_User(), this.getUserData(), null, "user", null, 1, 1, LogOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLogOut__LogOutRequest(), ecorePackage.getEBoolean(), "logOutRequest", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(class1EClass, Class1.class, "Class1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userDataEClass, UserData.class, "UserData", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUserData_Email(), theTypesPackage.getString(), "email", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserData_UserName(), theTypesPackage.getString(), "userName", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getUserData_Password(), theTypesPackage.getString(), "password", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserData_Logout(), this.getLogOut(), null, "logout", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserData_Login(), this.getLogIn(), null, "login", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getUserData_Register(), this.getRegister(), null, "register", null, 1, 1, UserData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ClientPackageImpl
