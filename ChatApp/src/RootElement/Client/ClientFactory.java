/**
 */
package RootElement.Client;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Client.ClientPackage
 * @generated
 */
public interface ClientFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ClientFactory eINSTANCE = RootElement.Client.impl.ClientFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Register</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register</em>'.
	 * @generated
	 */
	Register createRegister();

	/**
	 * Returns a new object of class '<em>Log In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log In</em>'.
	 * @generated
	 */
	LogIn createLogIn();

	/**
	 * Returns a new object of class '<em>Send Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message</em>'.
	 * @generated
	 */
	SendMessage createSendMessage();

	/**
	 * Returns a new object of class '<em>Friend Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friend Data</em>'.
	 * @generated
	 */
	FriendData createFriendData();

	/**
	 * Returns a new object of class '<em>Receive Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message</em>'.
	 * @generated
	 */
	ReceiveMessage createReceiveMessage();

	/**
	 * Returns a new object of class '<em>Friends</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Friends</em>'.
	 * @generated
	 */
	Friends createFriends();

	/**
	 * Returns a new object of class '<em>Log Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Out</em>'.
	 * @generated
	 */
	LogOut createLogOut();

	/**
	 * Returns a new object of class '<em>Class1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Class1</em>'.
	 * @generated
	 */
	Class1 createClass1();

	/**
	 * Returns a new object of class '<em>User Data</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Data</em>'.
	 * @generated
	 */
	UserData createUserData();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ClientPackage getClientPackage();

} //ClientFactory
