/**
 */
package RootElement.Server;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see RootElement.Server.ServerFactory
 * @model kind="package"
 * @generated
 */
public interface ServerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Server";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Server.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Server";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerPackage eINSTANCE = RootElement.Server.impl.ServerPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.AcceptClientsImpl <em>Accept Clients</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.AcceptClientsImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getAcceptClients()
	 * @generated
	 */
	int ACCEPT_CLIENTS = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLIENTS__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Userdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLIENTS__USERDATA = 1;

	/**
	 * The number of structural features of the '<em>Accept Clients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLIENTS_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Accepted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLIENTS___ACCEPTED = 0;

	/**
	 * The number of operations of the '<em>Accept Clients</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACCEPT_CLIENTS_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.ReceiveMessageRequestImpl <em>Receive Message Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.ReceiveMessageRequestImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getReceiveMessageRequest()
	 * @generated
	 */
	int RECEIVE_MESSAGE_REQUEST = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST__CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Userdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST__USERDATA = 2;

	/**
	 * The feature id for the '<em><b>Sendmessagerequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST = 3;

	/**
	 * The number of structural features of the '<em>Receive Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Received</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST___RECEIVED = 0;

	/**
	 * The number of operations of the '<em>Receive Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_REQUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.SendMessageRequestImpl <em>Send Message Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.SendMessageRequestImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getSendMessageRequest()
	 * @generated
	 */
	int SEND_MESSAGE_REQUEST = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST__CLIENT = 1;

	/**
	 * The feature id for the '<em><b>Userdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST__USERDATA = 2;

	/**
	 * The feature id for the '<em><b>Receivemessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST__RECEIVEMESSAGE = 3;

	/**
	 * The number of structural features of the '<em>Send Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Sent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST___SENT__BOOLEAN = 0;

	/**
	 * The number of operations of the '<em>Send Message Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_REQUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.RegisterRequestImpl <em>Register Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.RegisterRequestImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getRegisterRequest()
	 * @generated
	 */
	int REGISTER_REQUEST = 3;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_REQUEST__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_REQUEST__REGISTER = 1;

	/**
	 * The number of structural features of the '<em>Register Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Regist</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_REQUEST___REGIST = 0;

	/**
	 * The number of operations of the '<em>Register Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_REQUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.LogInRequestImpl <em>Log In Request</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.LogInRequestImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getLogInRequest()
	 * @generated
	 */
	int LOG_IN_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_REQUEST__CLIENT = 0;

	/**
	 * The feature id for the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_REQUEST__LOGIN = 1;

	/**
	 * The number of structural features of the '<em>Log In Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_REQUEST_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Log In Accepted</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_REQUEST___LOG_IN_ACCEPTED = 0;

	/**
	 * The number of operations of the '<em>Log In Request</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_REQUEST_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Server.impl.SQLInformationsImpl <em>SQL Informations</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Server.impl.SQLInformationsImpl
	 * @see RootElement.Server.impl.ServerPackageImpl#getSQLInformations()
	 * @generated
	 */
	int SQL_INFORMATIONS = 5;

	/**
	 * The feature id for the '<em><b>Online Users</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INFORMATIONS__ONLINE_USERS = 0;

	/**
	 * The feature id for the '<em><b>Userdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INFORMATIONS__USERDATA = 1;

	/**
	 * The number of structural features of the '<em>SQL Informations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INFORMATIONS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SQL Informations</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SQL_INFORMATIONS_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Server.AcceptClients <em>Accept Clients</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Accept Clients</em>'.
	 * @see RootElement.Server.AcceptClients
	 * @generated
	 */
	EClass getAcceptClients();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.AcceptClients#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see RootElement.Server.AcceptClients#getClient()
	 * @see #getAcceptClients()
	 * @generated
	 */
	EReference getAcceptClients_Client();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.AcceptClients#getUserdata <em>Userdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userdata</em>'.
	 * @see RootElement.Server.AcceptClients#getUserdata()
	 * @see #getAcceptClients()
	 * @generated
	 */
	EReference getAcceptClients_Userdata();

	/**
	 * Returns the meta object for the '{@link RootElement.Server.AcceptClients#accepted() <em>Accepted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Accepted</em>' operation.
	 * @see RootElement.Server.AcceptClients#accepted()
	 * @generated
	 */
	EOperation getAcceptClients__Accepted();

	/**
	 * Returns the meta object for class '{@link RootElement.Server.ReceiveMessageRequest <em>Receive Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message Request</em>'.
	 * @see RootElement.Server.ReceiveMessageRequest
	 * @generated
	 */
	EClass getReceiveMessageRequest();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.ReceiveMessageRequest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see RootElement.Server.ReceiveMessageRequest#getMessage()
	 * @see #getReceiveMessageRequest()
	 * @generated
	 */
	EReference getReceiveMessageRequest_Message();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.ReceiveMessageRequest#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see RootElement.Server.ReceiveMessageRequest#getClient()
	 * @see #getReceiveMessageRequest()
	 * @generated
	 */
	EReference getReceiveMessageRequest_Client();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.ReceiveMessageRequest#getUserdata <em>Userdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userdata</em>'.
	 * @see RootElement.Server.ReceiveMessageRequest#getUserdata()
	 * @see #getReceiveMessageRequest()
	 * @generated
	 */
	EReference getReceiveMessageRequest_Userdata();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.ReceiveMessageRequest#getSendmessagerequest <em>Sendmessagerequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sendmessagerequest</em>'.
	 * @see RootElement.Server.ReceiveMessageRequest#getSendmessagerequest()
	 * @see #getReceiveMessageRequest()
	 * @generated
	 */
	EReference getReceiveMessageRequest_Sendmessagerequest();

	/**
	 * Returns the meta object for the '{@link RootElement.Server.ReceiveMessageRequest#received() <em>Received</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Received</em>' operation.
	 * @see RootElement.Server.ReceiveMessageRequest#received()
	 * @generated
	 */
	EOperation getReceiveMessageRequest__Received();

	/**
	 * Returns the meta object for class '{@link RootElement.Server.SendMessageRequest <em>Send Message Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message Request</em>'.
	 * @see RootElement.Server.SendMessageRequest
	 * @generated
	 */
	EClass getSendMessageRequest();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.SendMessageRequest#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see RootElement.Server.SendMessageRequest#getMessage()
	 * @see #getSendMessageRequest()
	 * @generated
	 */
	EReference getSendMessageRequest_Message();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.SendMessageRequest#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see RootElement.Server.SendMessageRequest#getClient()
	 * @see #getSendMessageRequest()
	 * @generated
	 */
	EReference getSendMessageRequest_Client();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.SendMessageRequest#getUserdata <em>Userdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userdata</em>'.
	 * @see RootElement.Server.SendMessageRequest#getUserdata()
	 * @see #getSendMessageRequest()
	 * @generated
	 */
	EReference getSendMessageRequest_Userdata();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.SendMessageRequest#getReceivemessage <em>Receivemessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receivemessage</em>'.
	 * @see RootElement.Server.SendMessageRequest#getReceivemessage()
	 * @see #getSendMessageRequest()
	 * @generated
	 */
	EReference getSendMessageRequest_Receivemessage();

	/**
	 * Returns the meta object for the '{@link RootElement.Server.SendMessageRequest#sent(boolean) <em>Sent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sent</em>' operation.
	 * @see RootElement.Server.SendMessageRequest#sent(boolean)
	 * @generated
	 */
	EOperation getSendMessageRequest__Sent__boolean();

	/**
	 * Returns the meta object for class '{@link RootElement.Server.RegisterRequest <em>Register Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register Request</em>'.
	 * @see RootElement.Server.RegisterRequest
	 * @generated
	 */
	EClass getRegisterRequest();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.RegisterRequest#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see RootElement.Server.RegisterRequest#getClient()
	 * @see #getRegisterRequest()
	 * @generated
	 */
	EReference getRegisterRequest_Client();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.RegisterRequest#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register</em>'.
	 * @see RootElement.Server.RegisterRequest#getRegister()
	 * @see #getRegisterRequest()
	 * @generated
	 */
	EReference getRegisterRequest_Register();

	/**
	 * Returns the meta object for the '{@link RootElement.Server.RegisterRequest#regist() <em>Regist</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Regist</em>' operation.
	 * @see RootElement.Server.RegisterRequest#regist()
	 * @generated
	 */
	EOperation getRegisterRequest__Regist();

	/**
	 * Returns the meta object for class '{@link RootElement.Server.LogInRequest <em>Log In Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log In Request</em>'.
	 * @see RootElement.Server.LogInRequest
	 * @generated
	 */
	EClass getLogInRequest();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.LogInRequest#getClient <em>Client</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Client</em>'.
	 * @see RootElement.Server.LogInRequest#getClient()
	 * @see #getLogInRequest()
	 * @generated
	 */
	EReference getLogInRequest_Client();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.LogInRequest#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login</em>'.
	 * @see RootElement.Server.LogInRequest#getLogin()
	 * @see #getLogInRequest()
	 * @generated
	 */
	EReference getLogInRequest_Login();

	/**
	 * Returns the meta object for the '{@link RootElement.Server.LogInRequest#logInAccepted() <em>Log In Accepted</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In Accepted</em>' operation.
	 * @see RootElement.Server.LogInRequest#logInAccepted()
	 * @generated
	 */
	EOperation getLogInRequest__LogInAccepted();

	/**
	 * Returns the meta object for class '{@link RootElement.Server.SQLInformations <em>SQL Informations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SQL Informations</em>'.
	 * @see RootElement.Server.SQLInformations
	 * @generated
	 */
	EClass getSQLInformations();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Server.SQLInformations#getOnlineUsers <em>Online Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Online Users</em>'.
	 * @see RootElement.Server.SQLInformations#getOnlineUsers()
	 * @see #getSQLInformations()
	 * @generated
	 */
	EReference getSQLInformations_OnlineUsers();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Server.SQLInformations#getUserdata <em>Userdata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Userdata</em>'.
	 * @see RootElement.Server.SQLInformations#getUserdata()
	 * @see #getSQLInformations()
	 * @generated
	 */
	EReference getSQLInformations_Userdata();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ServerFactory getServerFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.AcceptClientsImpl <em>Accept Clients</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.AcceptClientsImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getAcceptClients()
		 * @generated
		 */
		EClass ACCEPT_CLIENTS = eINSTANCE.getAcceptClients();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CLIENTS__CLIENT = eINSTANCE.getAcceptClients_Client();

		/**
		 * The meta object literal for the '<em><b>Userdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACCEPT_CLIENTS__USERDATA = eINSTANCE.getAcceptClients_Userdata();

		/**
		 * The meta object literal for the '<em><b>Accepted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACCEPT_CLIENTS___ACCEPTED = eINSTANCE.getAcceptClients__Accepted();

		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.ReceiveMessageRequestImpl <em>Receive Message Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.ReceiveMessageRequestImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getReceiveMessageRequest()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE_REQUEST = eINSTANCE.getReceiveMessageRequest();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE_REQUEST__MESSAGE = eINSTANCE.getReceiveMessageRequest_Message();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE_REQUEST__CLIENT = eINSTANCE.getReceiveMessageRequest_Client();

		/**
		 * The meta object literal for the '<em><b>Userdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE_REQUEST__USERDATA = eINSTANCE.getReceiveMessageRequest_Userdata();

		/**
		 * The meta object literal for the '<em><b>Sendmessagerequest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST = eINSTANCE.getReceiveMessageRequest_Sendmessagerequest();

		/**
		 * The meta object literal for the '<em><b>Received</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_MESSAGE_REQUEST___RECEIVED = eINSTANCE.getReceiveMessageRequest__Received();

		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.SendMessageRequestImpl <em>Send Message Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.SendMessageRequestImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getSendMessageRequest()
		 * @generated
		 */
		EClass SEND_MESSAGE_REQUEST = eINSTANCE.getSendMessageRequest();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_REQUEST__MESSAGE = eINSTANCE.getSendMessageRequest_Message();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_REQUEST__CLIENT = eINSTANCE.getSendMessageRequest_Client();

		/**
		 * The meta object literal for the '<em><b>Userdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_REQUEST__USERDATA = eINSTANCE.getSendMessageRequest_Userdata();

		/**
		 * The meta object literal for the '<em><b>Receivemessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE_REQUEST__RECEIVEMESSAGE = eINSTANCE.getSendMessageRequest_Receivemessage();

		/**
		 * The meta object literal for the '<em><b>Sent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_MESSAGE_REQUEST___SENT__BOOLEAN = eINSTANCE.getSendMessageRequest__Sent__boolean();

		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.RegisterRequestImpl <em>Register Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.RegisterRequestImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getRegisterRequest()
		 * @generated
		 */
		EClass REGISTER_REQUEST = eINSTANCE.getRegisterRequest();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_REQUEST__CLIENT = eINSTANCE.getRegisterRequest_Client();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER_REQUEST__REGISTER = eINSTANCE.getRegisterRequest_Register();

		/**
		 * The meta object literal for the '<em><b>Regist</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTER_REQUEST___REGIST = eINSTANCE.getRegisterRequest__Regist();

		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.LogInRequestImpl <em>Log In Request</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.LogInRequestImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getLogInRequest()
		 * @generated
		 */
		EClass LOG_IN_REQUEST = eINSTANCE.getLogInRequest();

		/**
		 * The meta object literal for the '<em><b>Client</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_IN_REQUEST__CLIENT = eINSTANCE.getLogInRequest_Client();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_IN_REQUEST__LOGIN = eINSTANCE.getLogInRequest_Login();

		/**
		 * The meta object literal for the '<em><b>Log In Accepted</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOG_IN_REQUEST___LOG_IN_ACCEPTED = eINSTANCE.getLogInRequest__LogInAccepted();

		/**
		 * The meta object literal for the '{@link RootElement.Server.impl.SQLInformationsImpl <em>SQL Informations</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Server.impl.SQLInformationsImpl
		 * @see RootElement.Server.impl.ServerPackageImpl#getSQLInformations()
		 * @generated
		 */
		EClass SQL_INFORMATIONS = eINSTANCE.getSQLInformations();

		/**
		 * The meta object literal for the '<em><b>Online Users</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_INFORMATIONS__ONLINE_USERS = eINSTANCE.getSQLInformations_OnlineUsers();

		/**
		 * The meta object literal for the '<em><b>Userdata</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SQL_INFORMATIONS__USERDATA = eINSTANCE.getSQLInformations_Userdata();

	}

} //ServerPackage
