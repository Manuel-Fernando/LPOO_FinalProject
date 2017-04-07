/**
 */
package RootElement.Server.impl;

import RootElement.Client.ClientPackage;

import RootElement.Client.impl.ClientPackageImpl;

import RootElement.Server.AcceptClients;
import RootElement.Server.LogInRequest;
import RootElement.Server.ReceiveMessageRequest;
import RootElement.Server.RegisterRequest;
import RootElement.Server.SQLInformations;
import RootElement.Server.SendMessageRequest;
import RootElement.Server.ServerFactory;
import RootElement.Server.ServerPackage;

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
public class ServerPackageImpl extends EPackageImpl implements ServerPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass acceptClientsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveMessageRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendMessageRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logInRequestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sqlInformationsEClass = null;

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
	 * @see RootElement.Server.ServerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ServerPackageImpl() {
		super(eNS_URI, ServerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link ServerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ServerPackage init() {
		if (isInited) return (ServerPackage)EPackage.Registry.INSTANCE.getEPackage(ServerPackage.eNS_URI);

		// Obtain or create and register package
		ServerPackageImpl theServerPackage = (ServerPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ServerPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ServerPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		ClientPackageImpl theClientPackage = (ClientPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI) instanceof ClientPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI) : ClientPackage.eINSTANCE);
		TypesPackageImpl theTypesPackage = (TypesPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) instanceof TypesPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI) : TypesPackage.eINSTANCE);

		// Create package meta-data objects
		theServerPackage.createPackageContents();
		theClientPackage.createPackageContents();
		theTypesPackage.createPackageContents();

		// Initialize created meta-data
		theServerPackage.initializePackageContents();
		theClientPackage.initializePackageContents();
		theTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theServerPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ServerPackage.eNS_URI, theServerPackage);
		return theServerPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAcceptClients() {
		return acceptClientsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptClients_Client() {
		return (EReference)acceptClientsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAcceptClients_Userdata() {
		return (EReference)acceptClientsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAcceptClients__Accepted() {
		return acceptClientsEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveMessageRequest() {
		return receiveMessageRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessageRequest_Message() {
		return (EReference)receiveMessageRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessageRequest_Client() {
		return (EReference)receiveMessageRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessageRequest_Userdata() {
		return (EReference)receiveMessageRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveMessageRequest_Sendmessagerequest() {
		return (EReference)receiveMessageRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveMessageRequest__Received() {
		return receiveMessageRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendMessageRequest() {
		return sendMessageRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessageRequest_Message() {
		return (EReference)sendMessageRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessageRequest_Client() {
		return (EReference)sendMessageRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessageRequest_Userdata() {
		return (EReference)sendMessageRequestEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendMessageRequest_Receivemessage() {
		return (EReference)sendMessageRequestEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendMessageRequest__Sent__boolean() {
		return sendMessageRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterRequest() {
		return registerRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterRequest_Client() {
		return (EReference)registerRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisterRequest_Register() {
		return (EReference)registerRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getRegisterRequest__Regist() {
		return registerRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogInRequest() {
		return logInRequestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogInRequest_Client() {
		return (EReference)logInRequestEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogInRequest_Login() {
		return (EReference)logInRequestEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLogInRequest__LogInAccepted() {
		return logInRequestEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSQLInformations() {
		return sqlInformationsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLInformations_OnlineUsers() {
		return (EReference)sqlInformationsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSQLInformations_Userdata() {
		return (EReference)sqlInformationsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerFactory getServerFactory() {
		return (ServerFactory)getEFactoryInstance();
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
		acceptClientsEClass = createEClass(ACCEPT_CLIENTS);
		createEReference(acceptClientsEClass, ACCEPT_CLIENTS__CLIENT);
		createEReference(acceptClientsEClass, ACCEPT_CLIENTS__USERDATA);
		createEOperation(acceptClientsEClass, ACCEPT_CLIENTS___ACCEPTED);

		receiveMessageRequestEClass = createEClass(RECEIVE_MESSAGE_REQUEST);
		createEReference(receiveMessageRequestEClass, RECEIVE_MESSAGE_REQUEST__MESSAGE);
		createEReference(receiveMessageRequestEClass, RECEIVE_MESSAGE_REQUEST__CLIENT);
		createEReference(receiveMessageRequestEClass, RECEIVE_MESSAGE_REQUEST__USERDATA);
		createEReference(receiveMessageRequestEClass, RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST);
		createEOperation(receiveMessageRequestEClass, RECEIVE_MESSAGE_REQUEST___RECEIVED);

		sendMessageRequestEClass = createEClass(SEND_MESSAGE_REQUEST);
		createEReference(sendMessageRequestEClass, SEND_MESSAGE_REQUEST__MESSAGE);
		createEReference(sendMessageRequestEClass, SEND_MESSAGE_REQUEST__CLIENT);
		createEReference(sendMessageRequestEClass, SEND_MESSAGE_REQUEST__USERDATA);
		createEReference(sendMessageRequestEClass, SEND_MESSAGE_REQUEST__RECEIVEMESSAGE);
		createEOperation(sendMessageRequestEClass, SEND_MESSAGE_REQUEST___SENT__BOOLEAN);

		registerRequestEClass = createEClass(REGISTER_REQUEST);
		createEReference(registerRequestEClass, REGISTER_REQUEST__CLIENT);
		createEReference(registerRequestEClass, REGISTER_REQUEST__REGISTER);
		createEOperation(registerRequestEClass, REGISTER_REQUEST___REGIST);

		logInRequestEClass = createEClass(LOG_IN_REQUEST);
		createEReference(logInRequestEClass, LOG_IN_REQUEST__CLIENT);
		createEReference(logInRequestEClass, LOG_IN_REQUEST__LOGIN);
		createEOperation(logInRequestEClass, LOG_IN_REQUEST___LOG_IN_ACCEPTED);

		sqlInformationsEClass = createEClass(SQL_INFORMATIONS);
		createEReference(sqlInformationsEClass, SQL_INFORMATIONS__ONLINE_USERS);
		createEReference(sqlInformationsEClass, SQL_INFORMATIONS__USERDATA);
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
		ClientPackage theClientPackage = (ClientPackage)EPackage.Registry.INSTANCE.getEPackage(ClientPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(acceptClientsEClass, AcceptClients.class, "AcceptClients", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAcceptClients_Client(), theClientPackage.getUserData(), null, "client", null, 1, 1, AcceptClients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAcceptClients_Userdata(), theClientPackage.getUserData(), null, "userdata", null, 1, 1, AcceptClients.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getAcceptClients__Accepted(), ecorePackage.getEBoolean(), "accepted", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(receiveMessageRequestEClass, ReceiveMessageRequest.class, "ReceiveMessageRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReceiveMessageRequest_Message(), theClientPackage.getSendMessage(), null, "message", null, 1, 1, ReceiveMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceiveMessageRequest_Client(), theClientPackage.getUserData(), null, "client", null, 1, 1, ReceiveMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceiveMessageRequest_Userdata(), theClientPackage.getUserData(), null, "userdata", null, 1, 1, ReceiveMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getReceiveMessageRequest_Sendmessagerequest(), this.getSendMessageRequest(), null, "sendmessagerequest", null, 1, 1, ReceiveMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getReceiveMessageRequest__Received(), ecorePackage.getEBoolean(), "received", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sendMessageRequestEClass, SendMessageRequest.class, "SendMessageRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSendMessageRequest_Message(), theClientPackage.getSendMessage(), null, "message", null, 1, 1, SendMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendMessageRequest_Client(), theClientPackage.getUserData(), null, "client", null, 1, 1, SendMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendMessageRequest_Userdata(), theClientPackage.getUserData(), null, "userdata", null, 1, 1, SendMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSendMessageRequest_Receivemessage(), theClientPackage.getReceiveMessage(), null, "receivemessage", null, 1, 1, SendMessageRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = initEOperation(getSendMessageRequest__Sent__boolean(), null, "sent", 1, 1, IS_UNIQUE, !IS_ORDERED);
		addEParameter(op, ecorePackage.getEBoolean(), "success", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(registerRequestEClass, RegisterRequest.class, "RegisterRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRegisterRequest_Client(), theClientPackage.getRegister(), null, "client", null, 1, 1, RegisterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRegisterRequest_Register(), theClientPackage.getRegister(), null, "register", null, 1, 1, RegisterRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getRegisterRequest__Regist(), ecorePackage.getEBoolean(), "regist", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(logInRequestEClass, LogInRequest.class, "LogInRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogInRequest_Client(), theClientPackage.getLogIn(), null, "client", null, 1, 1, LogInRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getLogInRequest_Login(), theClientPackage.getLogIn(), null, "login", null, 1, 1, LogInRequest.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getLogInRequest__LogInAccepted(), ecorePackage.getEBoolean(), "logInAccepted", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(sqlInformationsEClass, SQLInformations.class, "SQLInformations", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSQLInformations_OnlineUsers(), theClientPackage.getUserData(), null, "onlineUsers", null, 0, -1, SQLInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSQLInformations_Userdata(), theClientPackage.getUserData(), null, "userdata", null, 1, 1, SQLInformations.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //ServerPackageImpl
