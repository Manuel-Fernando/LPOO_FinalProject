/**
 */
package RootElement.Client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.UserData#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Client.UserData#getUserName <em>User Name</em>}</li>
 *   <li>{@link RootElement.Client.UserData#getPassword <em>Password</em>}</li>
 *   <li>{@link RootElement.Client.UserData#getLogout <em>Logout</em>}</li>
 *   <li>{@link RootElement.Client.UserData#getLogin <em>Login</em>}</li>
 *   <li>{@link RootElement.Client.UserData#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getUserData()
 * @model
 * @generated
 */
public interface UserData extends EObject {
	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Email</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see RootElement.Client.ClientPackage#getUserData_Email()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Name</em>' attribute.
	 * @see #setUserName(String)
	 * @see RootElement.Client.ClientPackage#getUserData_UserName()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getUserName();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getUserName <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Name</em>' attribute.
	 * @see #getUserName()
	 * @generated
	 */
	void setUserName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see RootElement.Client.ClientPackage#getUserData_Password()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Logout</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Logout</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Logout</em>' reference.
	 * @see #setLogout(LogOut)
	 * @see RootElement.Client.ClientPackage#getUserData_Logout()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogOut getLogout();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getLogout <em>Logout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Logout</em>' reference.
	 * @see #getLogout()
	 * @generated
	 */
	void setLogout(LogOut value);

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
	 * @see RootElement.Client.ClientPackage#getUserData_Login()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LogIn getLogin();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getLogin <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Login</em>' reference.
	 * @see #getLogin()
	 * @generated
	 */
	void setLogin(LogIn value);

	/**
	 * Returns the value of the '<em><b>Register</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register</em>' reference.
	 * @see #setRegister(Register)
	 * @see RootElement.Client.ClientPackage#getUserData_Register()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Register getRegister();

	/**
	 * Sets the value of the '{@link RootElement.Client.UserData#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(Register value);

} // UserData
