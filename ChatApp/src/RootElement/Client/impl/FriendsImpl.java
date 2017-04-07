/**
 */
package RootElement.Client.impl;

import RootElement.Client.ClientPackage;
import RootElement.Client.FriendData;
import RootElement.Client.Friends;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Friends</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.impl.FriendsImpl#getFriendsList <em>Friends List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FriendsImpl extends MinimalEObjectImpl.Container implements Friends {
	/**
	 * The cached value of the '{@link #getFriendsList() <em>Friends List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFriendsList()
	 * @generated
	 * @ordered
	 */
	protected EList<FriendData> friendsList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FriendsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientPackage.Literals.FRIENDS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FriendData> getFriendsList() {
		if (friendsList == null) {
			friendsList = new EObjectResolvingEList<FriendData>(FriendData.class, this, ClientPackage.FRIENDS__FRIENDS_LIST);
		}
		return friendsList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addFriend(FriendData friend) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeFriend(FriendData friend) {
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
			case ClientPackage.FRIENDS__FRIENDS_LIST:
				return getFriendsList();
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
			case ClientPackage.FRIENDS__FRIENDS_LIST:
				getFriendsList().clear();
				getFriendsList().addAll((Collection<? extends FriendData>)newValue);
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
			case ClientPackage.FRIENDS__FRIENDS_LIST:
				getFriendsList().clear();
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
			case ClientPackage.FRIENDS__FRIENDS_LIST:
				return friendsList != null && !friendsList.isEmpty();
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
			case ClientPackage.FRIENDS___ADD_FRIEND__FRIENDDATA:
				addFriend((FriendData)arguments.get(0));
				return null;
			case ClientPackage.FRIENDS___REMOVE_FRIEND__FRIENDDATA:
				removeFriend((FriendData)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FriendsImpl
