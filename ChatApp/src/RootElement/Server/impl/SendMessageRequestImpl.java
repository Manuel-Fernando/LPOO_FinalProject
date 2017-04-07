/**
 */
package RootElement.Server.impl;

import RootElement.Client.ReceiveMessage;
import RootElement.Client.SendMessage;
import RootElement.Client.UserData;

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
 * An implementation of the model object '<em><b>Send Message Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.impl.SendMessageRequestImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Server.impl.SendMessageRequestImpl#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.impl.SendMessageRequestImpl#getUserdata <em>Userdata</em>}</li>
 *   <li>{@link RootElement.Server.impl.SendMessageRequestImpl#getReceivemessage <em>Receivemessage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMessageRequestImpl extends MinimalEObjectImpl.Container implements SendMessageRequest {
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
	 * The cached value of the '{@link #getReceivemessage() <em>Receivemessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivemessage()
	 * @generated
	 * @ordered
	 */
	protected ReceiveMessage receivemessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.SEND_MESSAGE_REQUEST;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE, oldMessage, message));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE, oldMessage, message));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.SEND_MESSAGE_REQUEST__CLIENT, oldClient, client));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SEND_MESSAGE_REQUEST__CLIENT, oldClient, client));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.SEND_MESSAGE_REQUEST__USERDATA, oldUserdata, userdata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SEND_MESSAGE_REQUEST__USERDATA, oldUserdata, userdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage getReceivemessage() {
		if (receivemessage != null && receivemessage.eIsProxy()) {
			InternalEObject oldReceivemessage = (InternalEObject)receivemessage;
			receivemessage = (ReceiveMessage)eResolveProxy(oldReceivemessage);
			if (receivemessage != oldReceivemessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE, oldReceivemessage, receivemessage));
			}
		}
		return receivemessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessage basicGetReceivemessage() {
		return receivemessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivemessage(ReceiveMessage newReceivemessage) {
		ReceiveMessage oldReceivemessage = receivemessage;
		receivemessage = newReceivemessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE, oldReceivemessage, receivemessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sent(boolean success) {
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
			case ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE:
				if (resolve) return getMessage();
				return basicGetMessage();
			case ServerPackage.SEND_MESSAGE_REQUEST__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ServerPackage.SEND_MESSAGE_REQUEST__USERDATA:
				if (resolve) return getUserdata();
				return basicGetUserdata();
			case ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE:
				if (resolve) return getReceivemessage();
				return basicGetReceivemessage();
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
			case ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE:
				setMessage((SendMessage)newValue);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__CLIENT:
				setClient((UserData)newValue);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__USERDATA:
				setUserdata((UserData)newValue);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE:
				setReceivemessage((ReceiveMessage)newValue);
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
			case ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE:
				setMessage((SendMessage)null);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__CLIENT:
				setClient((UserData)null);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__USERDATA:
				setUserdata((UserData)null);
				return;
			case ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE:
				setReceivemessage((ReceiveMessage)null);
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
			case ServerPackage.SEND_MESSAGE_REQUEST__MESSAGE:
				return message != null;
			case ServerPackage.SEND_MESSAGE_REQUEST__CLIENT:
				return client != null;
			case ServerPackage.SEND_MESSAGE_REQUEST__USERDATA:
				return userdata != null;
			case ServerPackage.SEND_MESSAGE_REQUEST__RECEIVEMESSAGE:
				return receivemessage != null;
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
			case ServerPackage.SEND_MESSAGE_REQUEST___SENT__BOOLEAN:
				sent((Boolean)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //SendMessageRequestImpl
