/**
 */
package RootElement.Server;

import RootElement.Client.Register;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Register Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.RegisterRequest#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.RegisterRequest#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getRegisterRequest()
 * @model
 * @generated
 */
public interface RegisterRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(Register)
	 * @see RootElement.Server.ServerPackage#getRegisterRequest_Client()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Register getClient();

	/**
	 * Sets the value of the '{@link RootElement.Server.RegisterRequest#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(Register value);

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
	 * @see RootElement.Server.ServerPackage#getRegisterRequest_Register()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Register getRegister();

	/**
	 * Sets the value of the '{@link RootElement.Server.RegisterRequest#getRegister <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register</em>' reference.
	 * @see #getRegister()
	 * @generated
	 */
	void setRegister(Register value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean regist();

} // RegisterRequest
