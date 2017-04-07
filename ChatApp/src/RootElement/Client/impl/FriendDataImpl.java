/**
 */
package RootElement.Client.impl;

import RootElement.Client.ClientPackage;
import RootElement.Client.FriendData;
import RootElement.Client.Friends;
import RootElement.Client.ReceiveMessage;
import RootElement.Client.SendMessage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friend Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.impl.FriendDataImpl#getName <em>Name</em>}</li>
 *   <li>{@link RootElement.Client.impl.FriendDataImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Client.impl.FriendDataImpl#getReceivemessage <em>Receivemessage</em>}</li>
 *   <li>{@link RootElement.Client.impl.FriendDataImpl#getSendmessage <em>Sendmessage</em>}</li>
 *   <li>{@link RootElement.Client.impl.FriendDataImpl#getFriends <em>Friends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FriendDataImpl extends MinimalEObjectImpl.Container implements FriendData {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

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
	 * The cached value of the '{@link #getSendmessage() <em>Sendmessage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendmessage()
	 * @generated
	 * @ordered
	 */
	protected SendMessage sendmessage;

	/**
	 * The cached value of the '{@link #getFriends() <em>Friends</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriends()
	 * @generated
	 * @ordered
	 */
	protected EList<Friends> friends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FriendDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientPackage.Literals.FRIEND_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.FRIEND_DATA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.FRIEND_DATA__EMAIL, oldEmail, email));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.FRIEND_DATA__RECEIVEMESSAGE, oldReceivemessage, receivemessage));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.FRIEND_DATA__RECEIVEMESSAGE, oldReceivemessage, receivemessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage getSendmessage() {
		if (sendmessage != null && sendmessage.eIsProxy()) {
			InternalEObject oldSendmessage = (InternalEObject)sendmessage;
			sendmessage = (SendMessage)eResolveProxy(oldSendmessage);
			if (sendmessage != oldSendmessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.FRIEND_DATA__SENDMESSAGE, oldSendmessage, sendmessage));
			}
		}
		return sendmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendMessage basicGetSendmessage() {
		return sendmessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendmessage(SendMessage newSendmessage) {
		SendMessage oldSendmessage = sendmessage;
		sendmessage = newSendmessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.FRIEND_DATA__SENDMESSAGE, oldSendmessage, sendmessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Friends> getFriends() {
		if (friends == null) {
			friends = new EObjectResolvingEList<Friends>(Friends.class, this, ClientPackage.FRIEND_DATA__FRIENDS);
		}
		return friends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientPackage.FRIEND_DATA__NAME:
				return getName();
			case ClientPackage.FRIEND_DATA__EMAIL:
				return getEmail();
			case ClientPackage.FRIEND_DATA__RECEIVEMESSAGE:
				if (resolve) return getReceivemessage();
				return basicGetReceivemessage();
			case ClientPackage.FRIEND_DATA__SENDMESSAGE:
				if (resolve) return getSendmessage();
				return basicGetSendmessage();
			case ClientPackage.FRIEND_DATA__FRIENDS:
				return getFriends();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ClientPackage.FRIEND_DATA__NAME:
				setName((String)newValue);
				return;
			case ClientPackage.FRIEND_DATA__EMAIL:
				setEmail((String)newValue);
				return;
			case ClientPackage.FRIEND_DATA__RECEIVEMESSAGE:
				setReceivemessage((ReceiveMessage)newValue);
				return;
			case ClientPackage.FRIEND_DATA__SENDMESSAGE:
				setSendmessage((SendMessage)newValue);
				return;
			case ClientPackage.FRIEND_DATA__FRIENDS:
				getFriends().clear();
				getFriends().addAll((Collection<? extends Friends>)newValue);
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
			case ClientPackage.FRIEND_DATA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ClientPackage.FRIEND_DATA__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClientPackage.FRIEND_DATA__RECEIVEMESSAGE:
				setReceivemessage((ReceiveMessage)null);
				return;
			case ClientPackage.FRIEND_DATA__SENDMESSAGE:
				setSendmessage((SendMessage)null);
				return;
			case ClientPackage.FRIEND_DATA__FRIENDS:
				getFriends().clear();
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
			case ClientPackage.FRIEND_DATA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ClientPackage.FRIEND_DATA__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClientPackage.FRIEND_DATA__RECEIVEMESSAGE:
				return receivemessage != null;
			case ClientPackage.FRIEND_DATA__SENDMESSAGE:
				return sendmessage != null;
			case ClientPackage.FRIEND_DATA__FRIENDS:
				return friends != null && !friends.isEmpty();
		}
		return super.eIsSet(featureID);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", email: ");
		result.append(email);
		result.append(')');
		return result.toString();
	}

} //FriendDataImpl
