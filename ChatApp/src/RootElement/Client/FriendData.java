/**
 */
package RootElement.Client;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Friend Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.FriendData#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.Client.FriendData#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Client.FriendData#getReceivemessage <em>Receivemessage</em>}</li>
 *   <li>{@link RootElement.Client.FriendData#getSendmessage <em>Sendmessage</em>}</li>
 *   <li>{@link RootElement.Client.FriendData#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getFriendData()
 * @model
 * @generated
 */
public interface FriendData extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see RootElement.Client.ClientPackage#getFriendData_Name()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link RootElement.Client.FriendData#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see RootElement.Client.ClientPackage#getFriendData_Email()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link RootElement.Client.FriendData#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Receivemessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivemessage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivemessage</em>' reference.
	 * @see #setReceivemessage(ReceiveMessage)
	 * @see RootElement.Client.ClientPackage#getFriendData_Receivemessage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceiveMessage getReceivemessage();

	/**
	 * Sets the value of the '{@link RootElement.Client.FriendData#getReceivemessage <em>Receivemessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivemessage</em>' reference.
	 * @see #getReceivemessage()
	 * @generated
	 */
	void setReceivemessage(ReceiveMessage value);

	/**
	 * Returns the value of the '<em><b>Sendmessage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendmessage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendmessage</em>' reference.
	 * @see #setSendmessage(SendMessage)
	 * @see RootElement.Client.ClientPackage#getFriendData_Sendmessage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SendMessage getSendmessage();

	/**
	 * Sets the value of the '{@link RootElement.Client.FriendData#getSendmessage <em>Sendmessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendmessage</em>' reference.
	 * @see #getSendmessage()
	 * @generated
	 */
	void setSendmessage(SendMessage value);

	/**
	 * Returns the value of the '<em><b>Friends</b></em>' reference list.
	 * The list contents are of type {@link RootElement.Client.Friends}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friends</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friends</em>' reference list.
	 * @see RootElement.Client.ClientPackage#getFriendData_Friends()
	 * @model ordered="false"
	 * @generated
	 */
	EList<Friends> getFriends();

} // FriendData
