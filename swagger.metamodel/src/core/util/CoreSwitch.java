/**
 */
package core.util;

import core.*;

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
 * @see core.CorePackage
 * @generated
 */
public class CoreSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CorePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreSwitch() {
		if (modelPackage == null) {
			modelPackage = CorePackage.eINSTANCE;
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
			case CorePackage.API: {
				Api api = (Api)theEObject;
				T result = caseApi(api);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.INFO: {
				Info info = (Info)theEObject;
				T result = caseInfo(info);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.CONTACT: {
				Contact contact = (Contact)theEObject;
				T result = caseContact(contact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.LICENSE: {
				License license = (License)theEObject;
				T result = caseLicense(license);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PATH: {
				Path path = (Path)theEObject;
				T result = casePath(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.API_OPERATION: {
				APIOperation apiOperation = (APIOperation)theEObject;
				T result = caseAPIOperation(apiOperation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.API_PARAMETER: {
				APIParameter apiParameter = (APIParameter)theEObject;
				T result = caseAPIParameter(apiParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ITEMS: {
				Items items = (Items)theEObject;
				T result = caseItems(items);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECURITY_REQUIREMENT: {
				SecurityRequirement securityRequirement = (SecurityRequirement)theEObject;
				T result = caseSecurityRequirement(securityRequirement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECURITY_SCHEMA: {
				SecuritySchema securitySchema = (SecuritySchema)theEObject;
				T result = caseSecuritySchema(securitySchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXAMPLE: {
				Example example = (Example)theEObject;
				T result = caseExample(example);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.XML_ELEMENT: {
				XMLElement xmlElement = (XMLElement)theEObject;
				T result = caseXMLElement(xmlElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCOPE: {
				Scope scope = (Scope)theEObject;
				T result = caseScope(scope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApi(Api object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfo(Info object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Contact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContact(Contact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>License</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLicense(License object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Path</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePath(Path object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIOperation(APIOperation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocs(ExternalDocs object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPIParameter(APIParameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Items</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Items</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItems(Items object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchema(Schema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Requirement</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityRequirement(SecurityRequirement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Header</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHeader(Header object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tag</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTag(Tag object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecuritySchema(SecuritySchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExample(Example object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>XML Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>XML Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseXMLElement(XMLElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseScope(Scope object) {
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

} //CoreSwitch
