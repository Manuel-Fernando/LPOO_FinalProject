/**
 */
package RootElement.Server;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see RootElement.Server.ServerPackage
 * @generated
 */
public interface ServerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ServerFactory eINSTANCE = RootElement.Server.impl.ServerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Accept Clients</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Accept Clients</em>'.
	 * @generated
	 */
	AcceptClients createAcceptClients();

	/**
	 * Returns a new object of class '<em>Receive Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Receive Message Request</em>'.
	 * @generated
	 */
	ReceiveMessageRequest createReceiveMessageRequest();

	/**
	 * Returns a new object of class '<em>Send Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Send Message Request</em>'.
	 * @generated
	 */
	SendMessageRequest createSendMessageRequest();

	/**
	 * Returns a new object of class '<em>Register Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Register Request</em>'.
	 * @generated
	 */
	RegisterRequest createRegisterRequest();

	/**
	 * Returns a new object of class '<em>Log In Request</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log In Request</em>'.
	 * @generated
	 */
	LogInRequest createLogInRequest();

	/**
	 * Returns a new object of class '<em>SQL Informations</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SQL Informations</em>'.
	 * @generated
	 */
	SQLInformations createSQLInformations();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	ServerPackage getServerPackage();

} //ServerFactory
