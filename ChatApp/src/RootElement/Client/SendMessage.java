/**
 */
package RootElement.Client;

import RootElement.Server.ReceiveMessageRequest;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.SendMessage#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Client.SendMessage#getFriend <em>Friend</em>}</li>
 *   <li>{@link RootElement.Client.SendMessage#getReceivemessagerequest <em>Receivemessagerequest</em>}</li>
 * </ul>
 *
 * @see RootElement.Client.ClientPackage#getSendMessage()
 * @model
 * @generated
 */
public interface SendMessage extends EObject {
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
	 * @see RootElement.Client.ClientPackage#getSendMessage_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link RootElement.Client.SendMessage#getMessage <em>Message</em>}' attribute.
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
	 * @see RootElement.Client.ClientPackage#getSendMessage_Friend()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	FriendData getFriend();

	/**
	 * Sets the value of the '{@link RootElement.Client.SendMessage#getFriend <em>Friend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Friend</em>' reference.
	 * @see #getFriend()
	 * @generated
	 */
	void setFriend(FriendData value);

	/**
	 * Returns the value of the '<em><b>Receivemessagerequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receivemessagerequest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receivemessagerequest</em>' reference.
	 * @see #setReceivemessagerequest(ReceiveMessageRequest)
	 * @see RootElement.Client.ClientPackage#getSendMessage_Receivemessagerequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceiveMessageRequest getReceivemessagerequest();

	/**
	 * Sets the value of the '{@link RootElement.Client.SendMessage#getReceivemessagerequest <em>Receivemessagerequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivemessagerequest</em>' reference.
	 * @see #getReceivemessagerequest()
	 * @generated
	 */
	void setReceivemessagerequest(ReceiveMessageRequest value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean send();

} // SendMessage
