/**
 */
package RootElement.Client;

import org.eclipse.emf.ecore.EAttribute;
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
 * @see RootElement.Client.ClientFactory
 * @model kind="package"
 * @generated
 */
public interface ClientPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Client";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///RootElement/Client.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "RootElement.Client";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClientPackage eINSTANCE = RootElement.Client.impl.ClientPackageImpl.init();

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.RegisterImpl <em>Register</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.RegisterImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getRegister()
	 * @generated
	 */
	int REGISTER = 0;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER__USER = 0;

	/**
	 * The number of structural features of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Register Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER___REGISTER_REQUEST = 0;

	/**
	 * The number of operations of the '<em>Register</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.LogInImpl <em>Log In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.LogInImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getLogIn()
	 * @generated
	 */
	int LOG_IN = 1;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN__USER = 0;

	/**
	 * The number of structural features of the '<em>Log In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Log In Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN___LOG_IN_REQUEST = 0;

	/**
	 * The number of operations of the '<em>Log In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_IN_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.SendMessageImpl <em>Send Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.SendMessageImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getSendMessage()
	 * @generated
	 */
	int SEND_MESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Friend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__FRIEND = 1;

	/**
	 * The feature id for the '<em><b>Receivemessagerequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE__RECEIVEMESSAGEREQUEST = 2;

	/**
	 * The number of structural features of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Send</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE___SEND = 0;

	/**
	 * The number of operations of the '<em>Send Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEND_MESSAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.FriendDataImpl <em>Friend Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.FriendDataImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getFriendData()
	 * @generated
	 */
	int FRIEND_DATA = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA__EMAIL = 1;

	/**
	 * The feature id for the '<em><b>Receivemessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA__RECEIVEMESSAGE = 2;

	/**
	 * The feature id for the '<em><b>Sendmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA__SENDMESSAGE = 3;

	/**
	 * The feature id for the '<em><b>Friends</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA__FRIENDS = 4;

	/**
	 * The number of structural features of the '<em>Friend Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Friend Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIEND_DATA_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.ReceiveMessageImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getReceiveMessage()
	 * @generated
	 */
	int RECEIVE_MESSAGE = 4;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__MESSAGE = 0;

	/**
	 * The feature id for the '<em><b>Friend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE__FRIEND = 1;

	/**
	 * The number of structural features of the '<em>Receive Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Receive</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE___RECEIVE = 0;

	/**
	 * The number of operations of the '<em>Receive Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RECEIVE_MESSAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.FriendsImpl <em>Friends</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.FriendsImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getFriends()
	 * @generated
	 */
	int FRIENDS = 5;

	/**
	 * The feature id for the '<em><b>Friends List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDS__FRIENDS_LIST = 0;

	/**
	 * The number of structural features of the '<em>Friends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDS_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Add Friend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDS___ADD_FRIEND__FRIENDDATA = 0;

	/**
	 * The operation id for the '<em>Remove Friend</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDS___REMOVE_FRIEND__FRIENDDATA = 1;

	/**
	 * The number of operations of the '<em>Friends</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FRIENDS_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.LogOutImpl <em>Log Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.LogOutImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getLogOut()
	 * @generated
	 */
	int LOG_OUT = 6;

	/**
	 * The feature id for the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OUT__USER = 0;

	/**
	 * The number of structural features of the '<em>Log Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OUT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Log Out Request</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OUT___LOG_OUT_REQUEST = 0;

	/**
	 * The number of operations of the '<em>Log Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_OUT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.Class1Impl <em>Class1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.Class1Impl
	 * @see RootElement.Client.impl.ClientPackageImpl#getClass1()
	 * @generated
	 */
	int CLASS1 = 7;

	/**
	 * The number of structural features of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Class1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS1_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link RootElement.Client.impl.UserDataImpl <em>User Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see RootElement.Client.impl.UserDataImpl
	 * @see RootElement.Client.impl.ClientPackageImpl#getUserData()
	 * @generated
	 */
	int USER_DATA = 8;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__EMAIL = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__PASSWORD = 2;

	/**
	 * The feature id for the '<em><b>Logout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__LOGOUT = 3;

	/**
	 * The feature id for the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__LOGIN = 4;

	/**
	 * The feature id for the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA__REGISTER = 5;

	/**
	 * The number of structural features of the '<em>User Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>User Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_DATA_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link RootElement.Client.Register <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Register</em>'.
	 * @see RootElement.Client.Register
	 * @generated
	 */
	EClass getRegister();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.Register#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see RootElement.Client.Register#getUser()
	 * @see #getRegister()
	 * @generated
	 */
	EReference getRegister_User();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.Register#RegisterRequest() <em>Register Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register Request</em>' operation.
	 * @see RootElement.Client.Register#RegisterRequest()
	 * @generated
	 */
	EOperation getRegister__RegisterRequest();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.LogIn <em>Log In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log In</em>'.
	 * @see RootElement.Client.LogIn
	 * @generated
	 */
	EClass getLogIn();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.LogIn#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see RootElement.Client.LogIn#getUser()
	 * @see #getLogIn()
	 * @generated
	 */
	EReference getLogIn_User();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.LogIn#LogInRequest() <em>Log In Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log In Request</em>' operation.
	 * @see RootElement.Client.LogIn#LogInRequest()
	 * @generated
	 */
	EOperation getLogIn__LogInRequest();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.SendMessage <em>Send Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Send Message</em>'.
	 * @see RootElement.Client.SendMessage
	 * @generated
	 */
	EClass getSendMessage();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.SendMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see RootElement.Client.SendMessage#getMessage()
	 * @see #getSendMessage()
	 * @generated
	 */
	EAttribute getSendMessage_Message();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.SendMessage#getFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Friend</em>'.
	 * @see RootElement.Client.SendMessage#getFriend()
	 * @see #getSendMessage()
	 * @generated
	 */
	EReference getSendMessage_Friend();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.SendMessage#getReceivemessagerequest <em>Receivemessagerequest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receivemessagerequest</em>'.
	 * @see RootElement.Client.SendMessage#getReceivemessagerequest()
	 * @see #getSendMessage()
	 * @generated
	 */
	EReference getSendMessage_Receivemessagerequest();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.SendMessage#send() <em>Send</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send</em>' operation.
	 * @see RootElement.Client.SendMessage#send()
	 * @generated
	 */
	EOperation getSendMessage__Send();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.FriendData <em>Friend Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friend Data</em>'.
	 * @see RootElement.Client.FriendData
	 * @generated
	 */
	EClass getFriendData();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.FriendData#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see RootElement.Client.FriendData#getName()
	 * @see #getFriendData()
	 * @generated
	 */
	EAttribute getFriendData_Name();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.FriendData#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see RootElement.Client.FriendData#getEmail()
	 * @see #getFriendData()
	 * @generated
	 */
	EAttribute getFriendData_Email();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.FriendData#getReceivemessage <em>Receivemessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Receivemessage</em>'.
	 * @see RootElement.Client.FriendData#getReceivemessage()
	 * @see #getFriendData()
	 * @generated
	 */
	EReference getFriendData_Receivemessage();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.FriendData#getSendmessage <em>Sendmessage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sendmessage</em>'.
	 * @see RootElement.Client.FriendData#getSendmessage()
	 * @see #getFriendData()
	 * @generated
	 */
	EReference getFriendData_Sendmessage();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Client.FriendData#getFriends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends</em>'.
	 * @see RootElement.Client.FriendData#getFriends()
	 * @see #getFriendData()
	 * @generated
	 */
	EReference getFriendData_Friends();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.ReceiveMessage <em>Receive Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Receive Message</em>'.
	 * @see RootElement.Client.ReceiveMessage
	 * @generated
	 */
	EClass getReceiveMessage();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.ReceiveMessage#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see RootElement.Client.ReceiveMessage#getMessage()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EAttribute getReceiveMessage_Message();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.ReceiveMessage#getFriend <em>Friend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Friend</em>'.
	 * @see RootElement.Client.ReceiveMessage#getFriend()
	 * @see #getReceiveMessage()
	 * @generated
	 */
	EReference getReceiveMessage_Friend();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.ReceiveMessage#receive() <em>Receive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Receive</em>' operation.
	 * @see RootElement.Client.ReceiveMessage#receive()
	 * @generated
	 */
	EOperation getReceiveMessage__Receive();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.Friends <em>Friends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Friends</em>'.
	 * @see RootElement.Client.Friends
	 * @generated
	 */
	EClass getFriends();

	/**
	 * Returns the meta object for the reference list '{@link RootElement.Client.Friends#getFriendsList <em>Friends List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Friends List</em>'.
	 * @see RootElement.Client.Friends#getFriendsList()
	 * @see #getFriends()
	 * @generated
	 */
	EReference getFriends_FriendsList();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.Friends#addFriend(RootElement.Client.FriendData) <em>Add Friend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Friend</em>' operation.
	 * @see RootElement.Client.Friends#addFriend(RootElement.Client.FriendData)
	 * @generated
	 */
	EOperation getFriends__AddFriend__FriendData();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.Friends#removeFriend(RootElement.Client.FriendData) <em>Remove Friend</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Friend</em>' operation.
	 * @see RootElement.Client.Friends#removeFriend(RootElement.Client.FriendData)
	 * @generated
	 */
	EOperation getFriends__RemoveFriend__FriendData();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.LogOut <em>Log Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Out</em>'.
	 * @see RootElement.Client.LogOut
	 * @generated
	 */
	EClass getLogOut();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.LogOut#getUser <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>User</em>'.
	 * @see RootElement.Client.LogOut#getUser()
	 * @see #getLogOut()
	 * @generated
	 */
	EReference getLogOut_User();

	/**
	 * Returns the meta object for the '{@link RootElement.Client.LogOut#logOutRequest() <em>Log Out Request</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Log Out Request</em>' operation.
	 * @see RootElement.Client.LogOut#logOutRequest()
	 * @generated
	 */
	EOperation getLogOut__LogOutRequest();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.Class1 <em>Class1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class1</em>'.
	 * @see RootElement.Client.Class1
	 * @generated
	 */
	EClass getClass1();

	/**
	 * Returns the meta object for class '{@link RootElement.Client.UserData <em>User Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Data</em>'.
	 * @see RootElement.Client.UserData
	 * @generated
	 */
	EClass getUserData();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.UserData#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see RootElement.Client.UserData#getEmail()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_Email();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.UserData#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see RootElement.Client.UserData#getUserName()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_UserName();

	/**
	 * Returns the meta object for the attribute '{@link RootElement.Client.UserData#getPassword <em>Password</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Password</em>'.
	 * @see RootElement.Client.UserData#getPassword()
	 * @see #getUserData()
	 * @generated
	 */
	EAttribute getUserData_Password();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.UserData#getLogout <em>Logout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Logout</em>'.
	 * @see RootElement.Client.UserData#getLogout()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Logout();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.UserData#getLogin <em>Login</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Login</em>'.
	 * @see RootElement.Client.UserData#getLogin()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Login();

	/**
	 * Returns the meta object for the reference '{@link RootElement.Client.UserData#getRegister <em>Register</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Register</em>'.
	 * @see RootElement.Client.UserData#getRegister()
	 * @see #getUserData()
	 * @generated
	 */
	EReference getUserData_Register();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	ClientFactory getClientFactory();

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
		 * The meta object literal for the '{@link RootElement.Client.impl.RegisterImpl <em>Register</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.RegisterImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getRegister()
		 * @generated
		 */
		EClass REGISTER = eINSTANCE.getRegister();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTER__USER = eINSTANCE.getRegister_User();

		/**
		 * The meta object literal for the '<em><b>Register Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation REGISTER___REGISTER_REQUEST = eINSTANCE.getRegister__RegisterRequest();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.LogInImpl <em>Log In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.LogInImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getLogIn()
		 * @generated
		 */
		EClass LOG_IN = eINSTANCE.getLogIn();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_IN__USER = eINSTANCE.getLogIn_User();

		/**
		 * The meta object literal for the '<em><b>Log In Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOG_IN___LOG_IN_REQUEST = eINSTANCE.getLogIn__LogInRequest();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.SendMessageImpl <em>Send Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.SendMessageImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getSendMessage()
		 * @generated
		 */
		EClass SEND_MESSAGE = eINSTANCE.getSendMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEND_MESSAGE__MESSAGE = eINSTANCE.getSendMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Friend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE__FRIEND = eINSTANCE.getSendMessage_Friend();

		/**
		 * The meta object literal for the '<em><b>Receivemessagerequest</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEND_MESSAGE__RECEIVEMESSAGEREQUEST = eINSTANCE.getSendMessage_Receivemessagerequest();

		/**
		 * The meta object literal for the '<em><b>Send</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SEND_MESSAGE___SEND = eINSTANCE.getSendMessage__Send();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.FriendDataImpl <em>Friend Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.FriendDataImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getFriendData()
		 * @generated
		 */
		EClass FRIEND_DATA = eINSTANCE.getFriendData();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIEND_DATA__NAME = eINSTANCE.getFriendData_Name();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FRIEND_DATA__EMAIL = eINSTANCE.getFriendData_Email();

		/**
		 * The meta object literal for the '<em><b>Receivemessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIEND_DATA__RECEIVEMESSAGE = eINSTANCE.getFriendData_Receivemessage();

		/**
		 * The meta object literal for the '<em><b>Sendmessage</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIEND_DATA__SENDMESSAGE = eINSTANCE.getFriendData_Sendmessage();

		/**
		 * The meta object literal for the '<em><b>Friends</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIEND_DATA__FRIENDS = eINSTANCE.getFriendData_Friends();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.ReceiveMessageImpl <em>Receive Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.ReceiveMessageImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getReceiveMessage()
		 * @generated
		 */
		EClass RECEIVE_MESSAGE = eINSTANCE.getReceiveMessage();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RECEIVE_MESSAGE__MESSAGE = eINSTANCE.getReceiveMessage_Message();

		/**
		 * The meta object literal for the '<em><b>Friend</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RECEIVE_MESSAGE__FRIEND = eINSTANCE.getReceiveMessage_Friend();

		/**
		 * The meta object literal for the '<em><b>Receive</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation RECEIVE_MESSAGE___RECEIVE = eINSTANCE.getReceiveMessage__Receive();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.FriendsImpl <em>Friends</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.FriendsImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getFriends()
		 * @generated
		 */
		EClass FRIENDS = eINSTANCE.getFriends();

		/**
		 * The meta object literal for the '<em><b>Friends List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FRIENDS__FRIENDS_LIST = eINSTANCE.getFriends_FriendsList();

		/**
		 * The meta object literal for the '<em><b>Add Friend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRIENDS___ADD_FRIEND__FRIENDDATA = eINSTANCE.getFriends__AddFriend__FriendData();

		/**
		 * The meta object literal for the '<em><b>Remove Friend</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FRIENDS___REMOVE_FRIEND__FRIENDDATA = eINSTANCE.getFriends__RemoveFriend__FriendData();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.LogOutImpl <em>Log Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.LogOutImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getLogOut()
		 * @generated
		 */
		EClass LOG_OUT = eINSTANCE.getLogOut();

		/**
		 * The meta object literal for the '<em><b>User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_OUT__USER = eINSTANCE.getLogOut_User();

		/**
		 * The meta object literal for the '<em><b>Log Out Request</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LOG_OUT___LOG_OUT_REQUEST = eINSTANCE.getLogOut__LogOutRequest();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.Class1Impl <em>Class1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.Class1Impl
		 * @see RootElement.Client.impl.ClientPackageImpl#getClass1()
		 * @generated
		 */
		EClass CLASS1 = eINSTANCE.getClass1();

		/**
		 * The meta object literal for the '{@link RootElement.Client.impl.UserDataImpl <em>User Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see RootElement.Client.impl.UserDataImpl
		 * @see RootElement.Client.impl.ClientPackageImpl#getUserData()
		 * @generated
		 */
		EClass USER_DATA = eINSTANCE.getUserData();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__EMAIL = eINSTANCE.getUserData_Email();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__USER_NAME = eINSTANCE.getUserData_UserName();

		/**
		 * The meta object literal for the '<em><b>Password</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER_DATA__PASSWORD = eINSTANCE.getUserData_Password();

		/**
		 * The meta object literal for the '<em><b>Logout</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__LOGOUT = eINSTANCE.getUserData_Logout();

		/**
		 * The meta object literal for the '<em><b>Login</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__LOGIN = eINSTANCE.getUserData_Login();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_DATA__REGISTER = eINSTANCE.getUserData_Register();

	}

} //ClientPackage
