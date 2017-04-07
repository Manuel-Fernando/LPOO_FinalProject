/**
 */
package RootElement.Server;

import RootElement.Client.UserData;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SQL Informations</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.SQLInformations#getOnlineUsers <em>Online Users</em>}</li>
 *   <li>{@link RootElement.Server.SQLInformations#getUserdata <em>Userdata</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getSQLInformations()
 * @model
 * @generated
 */
public interface SQLInformations extends EObject {
	/**
	 * Returns the value of the '<em><b>Online Users</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Client.UserData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Online Users</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Online Users</em>' reference list.
	 * @see RootElement.Server.ServerPackage#getSQLInformations_OnlineUsers()
	 * @model ordered="false"
	 * @generated
	 */
	EList<UserData> getOnlineUsers();

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
	 * @see RootElement.Server.ServerPackage#getSQLInformations_Userdata()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getUserdata();

	/**
	 * Sets the value of the '{@link RootElement.Server.SQLInformations#getUserdata <em>Userdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userdata</em>' reference.
	 * @see #getUserdata()
	 * @generated
	 */
	void setUserdata(UserData value);

} // SQLInformations
