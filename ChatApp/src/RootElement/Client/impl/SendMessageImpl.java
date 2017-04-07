/**
 */
package RootElement.Client.impl;

import RootElement.Client.ClientPackage;
import RootElement.Client.FriendData;
import RootElement.Client.SendMessage;

import RootElement.Server.ReceiveMessageRequest;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Send Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.impl.SendMessageImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link RootElement.Client.impl.SendMessageImpl#getFriend <em>Friend</em>}</li>
 *   <li>{@link RootElement.Client.impl.SendMessageImpl#getReceivemessagerequest <em>Receivemessagerequest</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SendMessageImpl extends MinimalEObjectImpl.Container implements SendMessage {
	/**
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFriend() <em>Friend</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriend()
	 * @generated
	 * @ordered
	 */
	protected FriendData friend;

	/**
	 * The cached value of the '{@link #getReceivemessagerequest() <em>Receivemessagerequest</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivemessagerequest()
	 * @generated
	 * @ordered
	 */
	protected ReceiveMessageRequest receivemessagerequest;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SendMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientPackage.Literals.SEND_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.SEND_MESSAGE__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendData getFriend() {
		if (friend != null && friend.eIsProxy()) {
			InternalEObject oldFriend = (InternalEObject)friend;
			friend = (FriendData)eResolveProxy(oldFriend);
			if (friend != oldFriend) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.SEND_MESSAGE__FRIEND, oldFriend, friend));
			}
		}
		return friend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FriendData basicGetFriend() {
		return friend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFriend(FriendData newFriend) {
		FriendData oldFriend = friend;
		friend = newFriend;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.SEND_MESSAGE__FRIEND, oldFriend, friend));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageRequest getReceivemessagerequest() {
		if (receivemessagerequest != null && receivemessagerequest.eIsProxy()) {
			InternalEObject oldReceivemessagerequest = (InternalEObject)receivemessagerequest;
			receivemessagerequest = (ReceiveMessageRequest)eResolveProxy(oldReceivemessagerequest);
			if (receivemessagerequest != oldReceivemessagerequest) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST, oldReceivemessagerequest, receivemessagerequest));
			}
		}
		return receivemessagerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveMessageRequest basicGetReceivemessagerequest() {
		return receivemessagerequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivemessagerequest(ReceiveMessageRequest newReceivemessagerequest) {
		ReceiveMessageRequest oldReceivemessagerequest = receivemessagerequest;
		receivemessagerequest = newReceivemessagerequest;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST, oldReceivemessagerequest, receivemessagerequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean send() {
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
			case ClientPackage.SEND_MESSAGE__MESSAGE:
				return getMessage();
			case ClientPackage.SEND_MESSAGE__FRIEND:
				if (resolve) return getFriend();
				return basicGetFriend();
			case ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST:
				if (resolve) return getReceivemessagerequest();
				return basicGetReceivemessagerequest();
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
			case ClientPackage.SEND_MESSAGE__MESSAGE:
				setMessage((String)newValue);
				return;
			case ClientPackage.SEND_MESSAGE__FRIEND:
				setFriend((FriendData)newValue);
				return;
			case ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST:
				setReceivemessagerequest((ReceiveMessageRequest)newValue);
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
			case ClientPackage.SEND_MESSAGE__MESSAGE:
				setMessage(MESSAGE_EDEFAULT);
				return;
			case ClientPackage.SEND_MESSAGE__FRIEND:
				setFriend((FriendData)null);
				return;
			case ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST:
				setReceivemessagerequest((ReceiveMessageRequest)null);
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
			case ClientPackage.SEND_MESSAGE__MESSAGE:
				return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
			case ClientPackage.SEND_MESSAGE__FRIEND:
				return friend != null;
			case ClientPackage.SEND_MESSAGE__RECEIVEMESSAGEREQUEST:
				return receivemessagerequest != null;
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
			case ClientPackage.SEND_MESSAGE___SEND:
				return send();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (message: ");
		result.append(message);
		result.append(')');
		return result.toString();
	}

} //SendMessageImpl
