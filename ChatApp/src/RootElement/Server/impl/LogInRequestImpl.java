/**
 */
package RootElement.Server.impl;

import RootElement.Client.LogIn;

import RootElement.Server.LogInRequest;
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
 * An implementation of the model object '<em><b>Log In Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Server.impl.LogInRequestImpl#getClient <em>Client</em>}</li>
 *   <li>{@link RootElement.Server.impl.LogInRequestImpl#getLogin <em>Login</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogInRequestImpl extends MinimalEObjectImpl.Container implements LogInRequest {
	/**
	 * The cached value of the '{@link #getClient() <em>Client</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClient()
	 * @generated
	 * @ordered
	 */
	protected LogIn client;

	/**
	 * The cached value of the '{@link #getLogin() <em>Login</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogin()
	 * @generated
	 * @ordered
	 */
	protected LogIn login;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogInRequestImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServerPackage.Literals.LOG_IN_REQUEST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogIn getClient() {
		if (client != null && client.eIsProxy()) {
			InternalEObject oldClient = (InternalEObject)client;
			client = (LogIn)eResolveProxy(oldClient);
			if (client != oldClient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.LOG_IN_REQUEST__CLIENT, oldClient, client));
			}
		}
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogIn basicGetClient() {
		return client;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClient(LogIn newClient) {
		LogIn oldClient = client;
		client = newClient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.LOG_IN_REQUEST__CLIENT, oldClient, client));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogIn getLogin() {
		if (login != null && login.eIsProxy()) {
			InternalEObject oldLogin = (InternalEObject)login;
			login = (LogIn)eResolveProxy(oldLogin);
			if (login != oldLogin) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServerPackage.LOG_IN_REQUEST__LOGIN, oldLogin, login));
			}
		}
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogIn basicGetLogin() {
		return login;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogin(LogIn newLogin) {
		LogIn oldLogin = login;
		login = newLogin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServerPackage.LOG_IN_REQUEST__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean logInAccepted() {
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
			case ServerPackage.LOG_IN_REQUEST__CLIENT:
				if (resolve) return getClient();
				return basicGetClient();
			case ServerPackage.LOG_IN_REQUEST__LOGIN:
				if (resolve) return getLogin();
				return basicGetLogin();
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
			case ServerPackage.LOG_IN_REQUEST__CLIENT:
				setClient((LogIn)newValue);
				return;
			case ServerPackage.LOG_IN_REQUEST__LOGIN:
				setLogin((LogIn)newValue);
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
			case ServerPackage.LOG_IN_REQUEST__CLIENT:
				setClient((LogIn)null);
				return;
			case ServerPackage.LOG_IN_REQUEST__LOGIN:
				setLogin((LogIn)null);
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
			case ServerPackage.LOG_IN_REQUEST__CLIENT:
				return client != null;
			case ServerPackage.LOG_IN_REQUEST__LOGIN:
				return login != null;
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
			case ServerPackage.LOG_IN_REQUEST___LOG_IN_ACCEPTED:
				return logInAccepted();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LogInRequestImpl
