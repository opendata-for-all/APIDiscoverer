/**
 */
package core.impl;

import core.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPIFactoryImpl extends EFactoryImpl implements OpenAPIFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OpenAPIFactory init() {
		try {
			OpenAPIFactory theOpenAPIFactory = (OpenAPIFactory)EPackage.Registry.INSTANCE.getEFactory(OpenAPIPackage.eNS_URI);
			if (theOpenAPIFactory != null) {
				return theOpenAPIFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OpenAPIFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPIFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case OpenAPIPackage.ROOT: return createRoot();
			case OpenAPIPackage.API: return createAPI();
			case OpenAPIPackage.INFO: return createInfo();
			case OpenAPIPackage.CONTACT: return createContact();
			case OpenAPIPackage.LICENSE: return createLicense();
			case OpenAPIPackage.PATH: return createPath();
			case OpenAPIPackage.OPERATION: return createOperation();
			case OpenAPIPackage.EXTERNAL_DOCS: return createExternalDocs();
			case OpenAPIPackage.PARAMETER: return createParameter();
			case OpenAPIPackage.ITEMS_DEFINITION: return createItemsDefinition();
			case OpenAPIPackage.SCHEMA: return createSchema();
			case OpenAPIPackage.RESPONSE: return createResponse();
			case OpenAPIPackage.HEADER: return createHeader();
			case OpenAPIPackage.TAG: return createTag();
			case OpenAPIPackage.SECURITY_SCHEMA: return createSecuritySchema();
			case OpenAPIPackage.EXAMPLE: return createExample();
			case OpenAPIPackage.XML_ELEMENT: return createXMLElement();
			case OpenAPIPackage.SECURITY_SCOPE: return createSecurityScope();
			case OpenAPIPackage.SECURITY_REQUIREMENT: return createSecurityRequirement();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OpenAPIPackage.SCHEME_TYPE:
				return createSchemeTypeFromString(eDataType, initialValue);
			case OpenAPIPackage.PARAMETER_LOCATION:
				return createParameterLocationFromString(eDataType, initialValue);
			case OpenAPIPackage.COLLECTION_FORMAT:
				return createCollectionFormatFromString(eDataType, initialValue);
			case OpenAPIPackage.OAUTH2_FLOW_TYPE:
				return createOAuth2FlowTypeFromString(eDataType, initialValue);
			case OpenAPIPackage.API_KEY_LOCATION:
				return createAPIKeyLocationFromString(eDataType, initialValue);
			case OpenAPIPackage.SECURITY_SCHEME_TYPE:
				return createSecuritySchemeTypeFromString(eDataType, initialValue);
			case OpenAPIPackage.JSON_DATA_TYPE:
				return createJSONDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OpenAPIPackage.SCHEME_TYPE:
				return convertSchemeTypeToString(eDataType, instanceValue);
			case OpenAPIPackage.PARAMETER_LOCATION:
				return convertParameterLocationToString(eDataType, instanceValue);
			case OpenAPIPackage.COLLECTION_FORMAT:
				return convertCollectionFormatToString(eDataType, instanceValue);
			case OpenAPIPackage.OAUTH2_FLOW_TYPE:
				return convertOAuth2FlowTypeToString(eDataType, instanceValue);
			case OpenAPIPackage.API_KEY_LOCATION:
				return convertAPIKeyLocationToString(eDataType, instanceValue);
			case OpenAPIPackage.SECURITY_SCHEME_TYPE:
				return convertSecuritySchemeTypeToString(eDataType, instanceValue);
			case OpenAPIPackage.JSON_DATA_TYPE:
				return convertJSONDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Root createRoot() {
		RootImpl root = new RootImpl();
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API createAPI() {
		APIImpl api = new APIImpl();
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info createInfo() {
		InfoImpl info = new InfoImpl();
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Contact createContact() {
		ContactImpl contact = new ContactImpl();
		return contact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public License createLicense() {
		LicenseImpl license = new LicenseImpl();
		return license;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation createOperation() {
		OperationImpl operation = new OperationImpl();
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs createExternalDocs() {
		ExternalDocsImpl externalDocs = new ExternalDocsImpl();
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemsDefinition createItemsDefinition() {
		ItemsDefinitionImpl itemsDefinition = new ItemsDefinitionImpl();
		return itemsDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema createSchema() {
		SchemaImpl schema = new SchemaImpl();
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Header createHeader() {
		HeaderImpl header = new HeaderImpl();
		return header;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Tag createTag() {
		TagImpl tag = new TagImpl();
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchema createSecuritySchema() {
		SecuritySchemaImpl securitySchema = new SecuritySchemaImpl();
		return securitySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Example createExample() {
		ExampleImpl example = new ExampleImpl();
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLElement createXMLElement() {
		XMLElementImpl xmlElement = new XMLElementImpl();
		return xmlElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityScope createSecurityScope() {
		SecurityScopeImpl securityScope = new SecurityScopeImpl();
		return securityScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityRequirement createSecurityRequirement() {
		SecurityRequirementImpl securityRequirement = new SecurityRequirementImpl();
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemeType createSchemeTypeFromString(EDataType eDataType, String initialValue) {
		SchemeType result = SchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation createParameterLocationFromString(EDataType eDataType, String initialValue) {
		ParameterLocation result = ParameterLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat createCollectionFormatFromString(EDataType eDataType, String initialValue) {
		CollectionFormat result = CollectionFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCollectionFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OAuth2FlowType createOAuth2FlowTypeFromString(EDataType eDataType, String initialValue) {
		OAuth2FlowType result = OAuth2FlowType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOAuth2FlowTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIKeyLocation createAPIKeyLocationFromString(EDataType eDataType, String initialValue) {
		APIKeyLocation result = APIKeyLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAPIKeyLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchemeType createSecuritySchemeTypeFromString(EDataType eDataType, String initialValue) {
		SecuritySchemeType result = SecuritySchemeType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecuritySchemeTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONDataType createJSONDataTypeFromString(EDataType eDataType, String initialValue) {
		JSONDataType result = JSONDataType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONDataTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPIPackage getOpenAPIPackage() {
		return (OpenAPIPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OpenAPIPackage getPackage() {
		return OpenAPIPackage.eINSTANCE;
	}

} //OpenAPIFactoryImpl
