/**
 */
package RootElement.Server.impl;

import RootElement.Client.UserData;

import RootElement.Server.SQLInformations;
import RootElement.Server.ServerPackage;

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
 * An implementation of the model object '<em><b>SQL Informations</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.impl.SQLInformationsImpl#getOnlineUsers <em>Online Users</em>}</li>
 *   <li>{@link RootElement.Server.impl.SQLInformationsImpl#getUserdata <em>Userdata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SQLInformationsImpl extends MinimalEObjectImpl.Container implements SQLInformations {
	/**
	 * The cached value of the '{@link #getOnlineUsers() <em>Online Users</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlineUsers()
	 * @generated
	 * @ordered
	 */
	protected EList<UserData> onlineUsers;

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
	protected SQLInformationsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.SQL_INFORMATIONS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<UserData> getOnlineUsers() {
		if (onlineUsers == null) {
			onlineUsers = new EObjectResolvingEList<UserData>(UserData.class, this, ServerPackage.SQL_INFORMATIONS__ONLINE_USERS);
		}
		return onlineUsers;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.SQL_INFORMATIONS__USERDATA, oldUserdata, userdata));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.SQL_INFORMATIONS__USERDATA, oldUserdata, userdata));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServerPackage.SQL_INFORMATIONS__ONLINE_USERS:
				return getOnlineUsers();
			case ServerPackage.SQL_INFORMATIONS__USERDATA:
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
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServerPackage.SQL_INFORMATIONS__ONLINE_USERS:
				getOnlineUsers().clear();
				getOnlineUsers().addAll((Collection<? extends UserData>)newValue);
				return;
			case ServerPackage.SQL_INFORMATIONS__USERDATA:
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
			case ServerPackage.SQL_INFORMATIONS__ONLINE_USERS:
				getOnlineUsers().clear();
				return;
			case ServerPackage.SQL_INFORMATIONS__USERDATA:
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
			case ServerPackage.SQL_INFORMATIONS__ONLINE_USERS:
				return onlineUsers != null && !onlineUsers.isEmpty();
			case ServerPackage.SQL_INFORMATIONS__USERDATA:
				return userdata != null;
		}
		return super.eIsSet(featureID);
	}

} //SQLInformationsImpl
