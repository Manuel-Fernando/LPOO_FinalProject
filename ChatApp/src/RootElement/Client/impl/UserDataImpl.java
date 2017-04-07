/**
 */
package RootElement.Client.impl;

import RootElement.Client.ClientPackage;
import RootElement.Client.LogIn;
import RootElement.Client.LogOut;
import RootElement.Client.Register;
import RootElement.Client.UserData;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getPassword <em>Password</em>}</li>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getLogout <em>Logout</em>}</li>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getLogin <em>Login</em>}</li>
 *   <li>{@link RootElement.Client.impl.UserDataImpl#getRegister <em>Register</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UserDataImpl extends MinimalEObjectImpl.Container implements UserData {
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
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLogout() <em>Logout</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLogout()
	 * @generated
	 * @ordered
	 */
	protected LogOut logout;

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
	 * The cached value of the '{@link #getRegister() <em>Register</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegister()
	 * @generated
	 * @ordered
	 */
	protected Register register;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UserDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ClientPackage.Literals.USER_DATA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__PASSWORD, oldPassword, password));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogOut getLogout() {
		if (logout != null && logout.eIsProxy()) {
			InternalEObject oldLogout = (InternalEObject)logout;
			logout = (LogOut)eResolveProxy(oldLogout);
			if (logout != oldLogout) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.USER_DATA__LOGOUT, oldLogout, logout));
			}
		}
		return logout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogOut basicGetLogout() {
		return logout;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLogout(LogOut newLogout) {
		LogOut oldLogout = logout;
		logout = newLogout;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__LOGOUT, oldLogout, logout));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.USER_DATA__LOGIN, oldLogin, login));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__LOGIN, oldLogin, login));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register getRegister() {
		if (register != null && register.eIsProxy()) {
			InternalEObject oldRegister = (InternalEObject)register;
			register = (Register)eResolveProxy(oldRegister);
			if (register != oldRegister) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ClientPackage.USER_DATA__REGISTER, oldRegister, register));
			}
		}
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Register basicGetRegister() {
		return register;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegister(Register newRegister) {
		Register oldRegister = register;
		register = newRegister;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ClientPackage.USER_DATA__REGISTER, oldRegister, register));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ClientPackage.USER_DATA__EMAIL:
				return getEmail();
			case ClientPackage.USER_DATA__USER_NAME:
				return getUserName();
			case ClientPackage.USER_DATA__PASSWORD:
				return getPassword();
			case ClientPackage.USER_DATA__LOGOUT:
				if (resolve) return getLogout();
				return basicGetLogout();
			case ClientPackage.USER_DATA__LOGIN:
				if (resolve) return getLogin();
				return basicGetLogin();
			case ClientPackage.USER_DATA__REGISTER:
				if (resolve) return getRegister();
				return basicGetRegister();
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
			case ClientPackage.USER_DATA__EMAIL:
				setEmail((String)newValue);
				return;
			case ClientPackage.USER_DATA__USER_NAME:
				setUserName((String)newValue);
				return;
			case ClientPackage.USER_DATA__PASSWORD:
				setPassword((String)newValue);
				return;
			case ClientPackage.USER_DATA__LOGOUT:
				setLogout((LogOut)newValue);
				return;
			case ClientPackage.USER_DATA__LOGIN:
				setLogin((LogIn)newValue);
				return;
			case ClientPackage.USER_DATA__REGISTER:
				setRegister((Register)newValue);
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
			case ClientPackage.USER_DATA__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case ClientPackage.USER_DATA__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case ClientPackage.USER_DATA__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
			case ClientPackage.USER_DATA__LOGOUT:
				setLogout((LogOut)null);
				return;
			case ClientPackage.USER_DATA__LOGIN:
				setLogin((LogIn)null);
				return;
			case ClientPackage.USER_DATA__REGISTER:
				setRegister((Register)null);
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
			case ClientPackage.USER_DATA__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case ClientPackage.USER_DATA__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case ClientPackage.USER_DATA__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
			case ClientPackage.USER_DATA__LOGOUT:
				return logout != null;
			case ClientPackage.USER_DATA__LOGIN:
				return login != null;
			case ClientPackage.USER_DATA__REGISTER:
				return register != null;
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
		result.append(" (email: ");
		result.append(email);
		result.append(", userName: ");
		result.append(userName);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

} //UserDataImpl
