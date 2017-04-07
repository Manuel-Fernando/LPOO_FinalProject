/**
 */
package RootElement.Server;

import RootElement.Client.UserData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Accept Clients</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.AcceptClients#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.AcceptClients#getUserdata <em>Userdata</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getAcceptClients()
 * @model
 * @generated
 */
public interface AcceptClients extends EObject {
	/**
	 * Returns the value of the '<em><b>Client</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Client</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Client</em>' reference.
	 * @see #setClient(UserData)
	 * @see RootElement.Server.ServerPackage#getAcceptClients_Client()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getClient();

	/**
	 * Sets the value of the '{@link RootElement.Server.AcceptClients#getClient <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Client</em>' reference.
	 * @see #getClient()
	 * @generated
	 */
	void setClient(UserData value);

	/**
	 * Returns the value of the '<em><b>Userdata</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userdata</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userdata</em>' reference.
	 * @see #setUserdata(UserData)
	 * @see RootElement.Server.ServerPackage#getAcceptClients_Userdata()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getUserdata();

	/**
	 * Sets the value of the '{@link RootElement.Server.AcceptClients#getUserdata <em>Userdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userdata</em>' reference.
	 * @see #getUserdata()
	 * @generated
	 */
	void setUserdata(UserData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean accepted();

} // AcceptClients
