/**
 */
package RootElement.Server;

import RootElement.Client.LogIn;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log In Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.LogInRequest#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.LogInRequest#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getLogInRequest()
 * @model
 * @generated
 */
public interface LogInRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(LogIn)
	 * @see RootElement.Server.ServerPackage#getLogInRequest_Client()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogIn getClient();

	/**
	 * Sets the value of the '{@link RootElement.Server.LogInRequest#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(LogIn value);

	/**
	 * Returns the value of the '<em><b>Login</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Login</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Login</em>' reference.
	 * @see #setLogin(LogIn)
	 * @see RootElement.Server.ServerPackage#getLogInRequest_Login()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogIn getLogin();

	/**
	 * Sets the value of the '{@link RootElement.Server.LogInRequest#getLogin <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' reference.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(LogIn value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean logInAccepted();

} // LogInRequest
