/**
 */
package RootElement.Server;

import RootElement.Client.ReceiveMessage;
import RootElement.Client.SendMessage;
import RootElement.Client.UserData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Send Message Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.SendMessageRequest#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Server.SendMessageRequest#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.SendMessageRequest#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link RootElement.Server.SendMessageRequest#getReceivemessage <em>Receivemessage</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getSendMessageRequest()
 * @model
 * @generated
 */
public interface SendMessageRequest extends EObject {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(SendMessage)
	 * @see RootElement.Server.ServerPackage#getSendMessageRequest_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SendMessage getMessage();

	/**
	 * Sets the value of the '{@link RootElement.Server.SendMessageRequest#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(SendMessage value);

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
	 * @see RootElement.Server.ServerPackage#getSendMessageRequest_Client()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getClient();

	/**
	 * Sets the value of the '{@link RootElement.Server.SendMessageRequest#getClient <em>Client</em>}' reference.
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
	 * @see RootElement.Server.ServerPackage#getSendMessageRequest_Userdata()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getUserdata();

	/**
	 * Sets the value of the '{@link RootElement.Server.SendMessageRequest#getUserdata <em>Userdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userdata</em>' reference.
	 * @see #getUserdata()
	 * @generated
	 */
	void setUserdata(UserData value);

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
	 * @see RootElement.Server.ServerPackage#getSendMessageRequest_Receivemessage()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ReceiveMessage getReceivemessage();

	/**
	 * Sets the value of the '{@link RootElement.Server.SendMessageRequest#getReceivemessage <em>Receivemessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receivemessage</em>' reference.
	 * @see #getReceivemessage()
	 * @generated
	 */
	void setReceivemessage(ReceiveMessage value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model successRequired="true" successOrdered="false"
	 * @generated
	 */
	void sent(boolean success);

} // SendMessageRequest
