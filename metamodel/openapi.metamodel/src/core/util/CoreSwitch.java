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
			case CorePackage.JSON_SCHEMA_SUBSET: {
				JSONSchemaSubset jsonSchemaSubset = (JSONSchemaSubset)theEObject;
				T result = caseJSONSchemaSubset(jsonSchemaSubset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ROOT: {
				Root root = (Root)theEObject;
				T result = caseRoot(root);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.API: {
				API api = (API)theEObject;
				T result = caseAPI(api);
				if (result == null) result = caseParamterDeclaringContext(api);
				if (result == null) result = caseResponseContext(api);
				if (result == null) result = caseSchemaDeclaringContext(api);
				if (result == null) result = caseJSONPointer(api);
				if (result == null) result = caseSecurityContext(api);
				if (result == null) result = caseParameterContext(api);
				if (result == null) result = caseExternalDocsContext(api);
				if (result == null) result = caseResponseDeclaringContext(api);
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
				if (result == null) result = caseParamterDeclaringContext(path);
				if (result == null) result = caseParameterContext(path);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.OPERATION: {
				Operation operation = (Operation)theEObject;
				T result = caseOperation(operation);
				if (result == null) result = caseParamterDeclaringContext(operation);
				if (result == null) result = caseResponseContext(operation);
				if (result == null) result = caseSecurityContext(operation);
				if (result == null) result = caseParameterContext(operation);
				if (result == null) result = caseExternalDocsContext(operation);
				if (result == null) result = caseResponseDeclaringContext(operation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_DOCS: {
				ExternalDocs externalDocs = (ExternalDocs)theEObject;
				T result = caseExternalDocs(externalDocs);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = caseSchemaDeclaringContext(parameter);
				if (result == null) result = caseSchemaContext(parameter);
				if (result == null) result = caseJSONSchemaSubset(parameter);
				if (result == null) result = caseJSONPointer(parameter);
				if (result == null) result = caseArrayContext(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ITEMS_DEFINITION: {
				ItemsDefinition itemsDefinition = (ItemsDefinition)theEObject;
				T result = caseItemsDefinition(itemsDefinition);
				if (result == null) result = caseJSONSchemaSubset(itemsDefinition);
				if (result == null) result = caseArrayContext(itemsDefinition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA: {
				Schema schema = (Schema)theEObject;
				T result = caseSchema(schema);
				if (result == null) result = caseJSONSchemaSubset(schema);
				if (result == null) result = caseSchemaDeclaringContext(schema);
				if (result == null) result = caseJSONPointer(schema);
				if (result == null) result = caseExternalDocsContext(schema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = caseSchemaDeclaringContext(response);
				if (result == null) result = caseSchemaContext(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.HEADER: {
				Header header = (Header)theEObject;
				T result = caseHeader(header);
				if (result == null) result = caseJSONSchemaSubset(header);
				if (result == null) result = caseArrayContext(header);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.TAG: {
				Tag tag = (Tag)theEObject;
				T result = caseTag(tag);
				if (result == null) result = caseExternalDocsContext(tag);
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
			case CorePackage.SECURITY_SCOPE: {
				SecurityScope securityScope = (SecurityScope)theEObject;
				T result = caseSecurityScope(securityScope);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMTER_DECLARING_CONTEXT: {
				ParamterDeclaringContext paramterDeclaringContext = (ParamterDeclaringContext)theEObject;
				T result = caseParamterDeclaringContext(paramterDeclaringContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_CONTEXT: {
				ResponseContext responseContext = (ResponseContext)theEObject;
				T result = caseResponseContext(responseContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA_DECLARING_CONTEXT: {
				SchemaDeclaringContext schemaDeclaringContext = (SchemaDeclaringContext)theEObject;
				T result = caseSchemaDeclaringContext(schemaDeclaringContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.JSON_POINTER: {
				JSONPointer jsonPointer = (JSONPointer)theEObject;
				T result = caseJSONPointer(jsonPointer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SECURITY_CONTEXT: {
				SecurityContext securityContext = (SecurityContext)theEObject;
				T result = caseSecurityContext(securityContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.PARAMETER_CONTEXT: {
				ParameterContext parameterContext = (ParameterContext)theEObject;
				T result = caseParameterContext(parameterContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.SCHEMA_CONTEXT: {
				SchemaContext schemaContext = (SchemaContext)theEObject;
				T result = caseSchemaContext(schemaContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.EXTERNAL_DOCS_CONTEXT: {
				ExternalDocsContext externalDocsContext = (ExternalDocsContext)theEObject;
				T result = caseExternalDocsContext(externalDocsContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.ARRAY_CONTEXT: {
				ArrayContext arrayContext = (ArrayContext)theEObject;
				T result = caseArrayContext(arrayContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CorePackage.RESPONSE_DECLARING_CONTEXT: {
				ResponseDeclaringContext responseDeclaringContext = (ResponseDeclaringContext)theEObject;
				T result = caseResponseDeclaringContext(responseDeclaringContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Schema Subset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Schema Subset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONSchemaSubset(JSONSchemaSubset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoot(Root object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>API</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAPI(API object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Operation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOperation(Operation object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Items Definition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Items Definition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemsDefinition(ItemsDefinition object) {
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
	 * Returns the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Scope</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityScope(SecurityScope object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paramter Declaring Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paramter Declaring Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamterDeclaringContext(ParamterDeclaringContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterContext(ParameterContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseContext(ResponseContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Declaring Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Declaring Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaDeclaringContext(SchemaDeclaringContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Schema Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Schema Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSchemaContext(SchemaContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>External Docs Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>External Docs Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExternalDocsContext(ExternalDocsContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Array Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Array Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArrayContext(ArrayContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Declaring Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Declaring Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDeclaringContext(ResponseDeclaringContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>JSON Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JSON Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJSONPointer(JSONPointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Security Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Security Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSecurityContext(SecurityContext object) {
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
