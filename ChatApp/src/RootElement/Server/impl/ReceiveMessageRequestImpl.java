/**
 */
package RootElement.Server.impl;

import RootElement.Client.SendMessage;
import RootElement.Client.UserData;

import RootElement.Server.ReceiveMessageRequest;
import RootElement.Server.SendMessageRequest;
import RootElement.Server.ServerPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Receive Message Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.impl.ReceiveMessageRequestImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Server.impl.ReceiveMessageRequestImpl#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.impl.ReceiveMessageRequestImpl#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link RootElement.Server.impl.ReceiveMessageRequestImpl#getSendmessagerequest <em>Sendmessagerequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReceiveMessageRequestImpl extends MinimalEObjectImpl.Container implements ReceiveMessageRequest {
	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected SendMessage message;

	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected UserData client;

	/**
	 * The cached value of the '{@link #getUserdata() <em>Userdata</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserdata()
	 * @generated
	 * @ordered
	 */
	protected UserData userdata;

	/**
	 * The cached value of the '{@link #getSendmessagerequest() <em>Sendmessagerequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendmessagerequest()
	 * @generated
	 * @ordered
	 */
	protected SendMessageRequest sendmessagerequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReceiveMessageRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.RECEIVE_MESSAGE_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage getMessage() {
		if (message != null && message.eIsProxy()) {
			InternalEObject oldMessage = (InternalEObject)message;
			message = (SendMessage)eResolveProxy(oldMessage);
			if (message != oldMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE, oldMessage, message));
			}
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage basicGetMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(SendMessage newMessage) {
		SendMessage oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (UserData)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(UserData newClient) {
		UserData oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData getUserdata() {
		if (userdata != null && userdata.eIsProxy()) {
			InternalEObject oldUserdata = (InternalEObject)userdata;
			userdata = (UserData)eResolveProxy(oldUserdata);
			if (userdata != oldUserdata) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA, oldUserdata, userdata));
			}
		}
		return userdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserData basicGetUserdata() {
		return userdata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserdata(UserData newUserdata) {
		UserData oldUserdata = userdata;
		userdata = newUserdata;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA, oldUserdata, userdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageRequest getSendmessagerequest() {
		if (sendmessagerequest != null && sendmessagerequest.eIsProxy()) {
			InternalEObject oldSendmessagerequest = (InternalEObject)sendmessagerequest;
			sendmessagerequest = (SendMessageRequest)eResolveProxy(oldSendmessagerequest);
			if (sendmessagerequest != oldSendmessagerequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST, oldSendmessagerequest, sendmessagerequest));
			}
		}
		return sendmessagerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessageRequest basicGetSendmessagerequest() {
		return sendmessagerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendmessagerequest(SendMessageRequest newSendmessagerequest) {
		SendMessageRequest oldSendmessagerequest = sendmessagerequest;
		sendmessagerequest = newSendmessagerequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST, oldSendmessagerequest, sendmessagerequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean received() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA:
				if (resolve) return getUserdata();
				return basicGetUserdata();
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST:
				if (resolve) return getSendmessagerequest();
				return basicGetSendmessagerequest();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE:
				setMessage((SendMessage)newValue);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT:
				setClient((UserData)newValue);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA:
				setUserdata((UserData)newValue);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST:
				setSendmessagerequest((SendMessageRequest)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE:
				setMessage((SendMessage)null);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT:
				setClient((UserData)null);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA:
				setUserdata((UserData)null);
				return;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST:
				setSendmessagerequest((SendMessageRequest)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__MESSAGE:
				return message != null;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__CLIENT:
				return client != null;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__USERDATA:
				return userdata != null;
			case ServerPackage.RECEIVE_MESSAGE_REQUEST__SENDMESSAGEREQUEST:
				return sendmessagerequest != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ServerPackage.RECEIVE_MESSAGE_REQUEST___RECEIVED:
				return received();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReceiveMessageRequestImpl
