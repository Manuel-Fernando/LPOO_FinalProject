/**
 */
package RootElement.Server;

import RootElement.Client.SendMessage;
import RootElement.Client.UserData;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Receive Message Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.ReceiveMessageRequest#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Server.ReceiveMessageRequest#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.ReceiveMessageRequest#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link RootElement.Server.ReceiveMessageRequest#getSendmessagerequest <em>Sendmessagerequest</em>}</li>
 * </ul>
 *
 * @see RootElement.Server.ServerPackage#getReceiveMessageRequest()
 * @model
 * @generated
 */
public interface ReceiveMessageRequest extends EObject {
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
	 * @see RootElement.Server.ServerPackage#getReceiveMessageRequest_Message()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SendMessage getMessage();

	/**
	 * Sets the value of the '{@link RootElement.Server.ReceiveMessageRequest#getMessage <em>Message</em>}' reference.
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
	 * @see RootElement.Server.ServerPackage#getReceiveMessageRequest_Client()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getClient();

	/**
	 * Sets the value of the '{@link RootElement.Server.ReceiveMessageRequest#getClient <em>Client</em>}' reference.
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
	 * @see RootElement.Server.ServerPackage#getReceiveMessageRequest_Userdata()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	UserData getUserdata();

	/**
	 * Sets the value of the '{@link RootElement.Server.ReceiveMessageRequest#getUserdata <em>Userdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userdata</em>' reference.
	 * @see #getUserdata()
	 * @generated
	 */
	void setUserdata(UserData value);

	/**
	 * Returns the value of the '<em><b>Sendmessagerequest</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sendmessagerequest</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sendmessagerequest</em>' reference.
	 * @see #setSendmessagerequest(SendMessageRequest)
	 * @see RootElement.Server.ServerPackage#getReceiveMessageRequest_Sendmessagerequest()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	SendMessageRequest getSendmessagerequest();

	/**
	 * Sets the value of the '{@link RootElement.Server.ReceiveMessageRequest#getSendmessagerequest <em>Sendmessagerequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sendmessagerequest</em>' reference.
	 * @see #getSendmessagerequest()
	 * @generated
	 */
	void setSendmessagerequest(SendMessageRequest value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean received();

} // ReceiveMessageRequest
