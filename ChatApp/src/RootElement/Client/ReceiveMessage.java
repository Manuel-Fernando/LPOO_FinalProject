/**
 */
package RootElement.Client;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.ReceiveMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Client.ReceiveMessage#getFriend <em>Friend</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getReceiveMessage()
 * @model
 * @generated
 */
public interface ReceiveMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see RootElement.Client.ClientPackage#getReceiveMessage_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link RootElement.Client.ReceiveMessage#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Friend</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Friend</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Friend</em>' reference.
	 * @see #setFriend(FriendData)
	 * @see RootElement.Client.ClientPackage#getReceiveMessage_Friend()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FriendData getFriend();

	/**
	 * Sets the value of the '{@link RootElement.Client.ReceiveMessage#getFriend <em>Friend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friend</em>' reference.
	 * @see #getFriend()
	 * @generated
	 */
	void setFriend(FriendData value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean receive();

} // ReceiveMessage
