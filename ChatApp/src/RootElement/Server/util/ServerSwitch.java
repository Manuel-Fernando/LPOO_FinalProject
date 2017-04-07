/**
 */
package RootElement.Server.util;

import RootElement.Server.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see RootElement.Server.ServerPackage
 * @generated
 */
public class ServerSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static ServerPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServerSwitch() {
		if (modelPackage == null) {
			modelPackage = ServerPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case ServerPackage.ACCEPT_CLIENTS: {
				AcceptClients acceptClients = (AcceptClients)theEObject;
				T result = caseAcceptClients(acceptClients);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServerPackage.RECEIVE_MESSAGE_REQUEST: {
				ReceiveMessageRequest receiveMessageRequest = (ReceiveMessageRequest)theEObject;
				T result = caseReceiveMessageRequest(receiveMessageRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServerPackage.SEND_MESSAGE_REQUEST: {
				SendMessageRequest sendMessageRequest = (SendMessageRequest)theEObject;
				T result = caseSendMessageRequest(sendMessageRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServerPackage.REGISTER_REQUEST: {
				RegisterRequest registerRequest = (RegisterRequest)theEObject;
				T result = caseRegisterRequest(registerRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServerPackage.LOG_IN_REQUEST: {
				LogInRequest logInRequest = (LogInRequest)theEObject;
				T result = caseLogInRequest(logInRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case ServerPackage.SQL_INFORMATIONS: {
				SQLInformations sqlInformations = (SQLInformations)theEObject;
				T result = caseSQLInformations(sqlInformations);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Accept Clients</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Accept Clients</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAcceptClients(AcceptClients object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Receive Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Receive Message Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReceiveMessageRequest(ReceiveMessageRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Send Message Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Send Message Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSendMessageRequest(SendMessageRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Register Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Register Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisterRequest(RegisterRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log In Request</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log In Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogInRequest(LogInRequest object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SQL Informations</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SQL Informations</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSQLInformations(SQLInformations object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //ServerSwitch
