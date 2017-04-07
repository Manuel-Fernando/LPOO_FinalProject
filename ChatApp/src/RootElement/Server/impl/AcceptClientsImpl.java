/**
 */
package RootElement.Server.impl;

import RootElement.Client.UserData;

import RootElement.Server.AcceptClients;
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
 * An implementation of the model object '<em><b>Accept Clients</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.impl.AcceptClientsImpl#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.impl.AcceptClientsImpl#getUserdata <em>Userdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AcceptClientsImpl extends MinimalEObjectImpl.Container implements AcceptClients {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptClientsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.ACCEPT_CLIENTS;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.ACCEPT_CLIENTS__CLIENT, oldClient, client));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.ACCEPT_CLIENTS__CLIENT, oldClient, client));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.ACCEPT_CLIENTS__USERDATA, oldUserdata, userdata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.ACCEPT_CLIENTS__USERDATA, oldUserdata, userdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean accepted() {
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
			case ServerPackage.ACCEPT_CLIENTS__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ServerPackage.ACCEPT_CLIENTS__USERDATA:
				if (resolve) return getUserdata();
				return basicGetUserdata();
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
			case ServerPackage.ACCEPT_CLIENTS__CLIENT:
				setClient((UserData)newValue);
				return;
			case ServerPackage.ACCEPT_CLIENTS__USERDATA:
				setUserdata((UserData)newValue);
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
			case ServerPackage.ACCEPT_CLIENTS__CLIENT:
				setClient((UserData)null);
				return;
			case ServerPackage.ACCEPT_CLIENTS__USERDATA:
				setUserdata((UserData)null);
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
			case ServerPackage.ACCEPT_CLIENTS__CLIENT:
				return client != null;
			case ServerPackage.ACCEPT_CLIENTS__USERDATA:
				return userdata != null;
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
			case ServerPackage.ACCEPT_CLIENTS___ACCEPTED:
				return accepted();
		}
		return super.eInvoke(operationID, arguments);
	}

} //AcceptClientsImpl
