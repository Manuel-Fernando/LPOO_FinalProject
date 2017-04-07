/**
 */
package RootElement.Client;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friends</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.Friends#getFriendsList <em>Friends List</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getFriends()
 * @model
 * @generated
 */
public interface Friends extends EObject {
	/**
	 * Returns the value of the '<em><b>Friends List</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Client.FriendData}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends List</em>' reference list.
	 * @see RootElement.Client.ClientPackage#getFriends_FriendsList()
	 * @model ordered="false"
	 * @generated
	 */
	EList<FriendData> getFriendsList();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model friendRequired="true" friendOrdered="false"
	 * @generated
	 */
	void addFriend(FriendData friend);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model friendRequired="true" friendOrdered="false"
	 * @generated
	 */
	void removeFriend(FriendData friend);

} // Friends
