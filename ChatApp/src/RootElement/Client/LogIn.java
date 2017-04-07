/**
 */
package RootElement.Client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Log In</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.LogIn#getUser <em>User</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getLogIn()
 * @model
 * @generated
 */
public interface LogIn extends EObject {
	/**
	 * Returns the value of the '<em><b>User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User</em>' reference.
	 * @see #setUser(UserData)
	 * @see RootElement.Client.ClientPackage#getLogIn_User()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getUser();

	/**
	 * Sets the value of the '{@link RootElement.Client.LogIn#getUser <em>User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User</em>' reference.
	 * @see #getUser()
	 * @generated
	 */
	void setUser(UserData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean LogInRequest();

} // LogIn
