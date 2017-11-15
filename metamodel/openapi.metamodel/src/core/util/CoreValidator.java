/**
 */
package core.util;

import core.*;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see core.CorePackage
 * @generated
 */
public class CoreValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final CoreValidator INSTANCE = new CoreValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "core";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredSwaggerVersion</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint api_requiredSwaggerVersionInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>correctSwaggerVersion</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint api_correctSwaggerVersionInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredInfoReference</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint api_requiredInfoReferenceInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredPaths</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint api_requiredPathsInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredTitle</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint info_requiredTitleInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredAPIVerison</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint info_requiredAPIVerisonInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint license_requiredNameInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>oneBodyParameterAllowed</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint operation_oneBodyParameterAllowedInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>oneFormDataParameterAllowed</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint operation_oneFormDataParameterAllowedInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>hasUniqueParameters</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint operation_hasUniqueParametersInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>xorFormAndBody</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint operation_xorFormAndBodyInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredResponses</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint operation_requiredResponsesInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredURL</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint externalDocs_requiredURLInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredName</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint parameter_requiredNameInvOCL;

	/**
	 * The parsed OCL expression for the definition of the '<em>requiredLocation</em>' invariant constraint.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static Constraint parameter_requiredLocationInvOCL;

	private static final String OCL_ANNOTATION_SOURCE = "http://www.eclipse.org/emf/2002/Ecore/OCL";

	private static final OCL OCL_ENV = OCL.newInstance();

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoreValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return CorePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresonding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case CorePackage.JSON_SCHEMA_SUBSET:
				return validateJSONSchemaSubset((JSONSchemaSubset)value, diagnostics, context);
			case CorePackage.ROOT:
				return validateRoot((Root)value, diagnostics, context);
			case CorePackage.API:
				return validateAPI((API)value, diagnostics, context);
			case CorePackage.INFO:
				return validateInfo((Info)value, diagnostics, context);
			case CorePackage.CONTACT:
				return validateContact((Contact)value, diagnostics, context);
			case CorePackage.LICENSE:
				return validateLicense((License)value, diagnostics, context);
			case CorePackage.PATH:
				return validatePath((Path)value, diagnostics, context);
			case CorePackage.OPERATION:
				return validateOperation((Operation)value, diagnostics, context);
			case CorePackage.EXTERNAL_DOCS:
				return validateExternalDocs((ExternalDocs)value, diagnostics, context);
			case CorePackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case CorePackage.ITEMS_DEFINITION:
				return validateItemsDefinition((ItemsDefinition)value, diagnostics, context);
			case CorePackage.SCHEMA:
				return validateSchema((Schema)value, diagnostics, context);
			case CorePackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case CorePackage.HEADER:
				return validateHeader((Header)value, diagnostics, context);
			case CorePackage.TAG:
				return validateTag((Tag)value, diagnostics, context);
			case CorePackage.SECURITY_SCHEMA:
				return validateSecuritySchema((SecuritySchema)value, diagnostics, context);
			case CorePackage.EXAMPLE:
				return validateExample((Example)value, diagnostics, context);
			case CorePackage.XML_ELEMENT:
				return validateXMLElement((XMLElement)value, diagnostics, context);
			case CorePackage.SECURITY_SCOPE:
				return validateSecurityScope((SecurityScope)value, diagnostics, context);
			case CorePackage.PARAMTER_DECLARING_CONTEXT:
				return validateParamterDeclaringContext((ParamterDeclaringContext)value, diagnostics, context);
			case CorePackage.SCHEMA_DECLARING_CONTEXT:
				return validateSchemaDeclaringContext((SchemaDeclaringContext)value, diagnostics, context);
			case CorePackage.RESPONSE_DECLARING_CONTEXT:
				return validateResponseDeclaringContext((ResponseDeclaringContext)value, diagnostics, context);
			case CorePackage.JSON_POINTER:
				return validateJSONPointer((JSONPointer)value, diagnostics, context);
			case CorePackage.SECURITY_CONTEXT:
				return validateSecurityContext((SecurityContext)value, diagnostics, context);
			case CorePackage.PARAMETER_CONTEXT:
				return validateParameterContext((ParameterContext)value, diagnostics, context);
			case CorePackage.SCHEMA_CONTEXT:
				return validateSchemaContext((SchemaContext)value, diagnostics, context);
			case CorePackage.EXTERNAL_DOCS_CONTEXT:
				return validateExternalDocsContext((ExternalDocsContext)value, diagnostics, context);
			case CorePackage.ARRAY_CONTEXT:
				return validateArrayContext((ArrayContext)value, diagnostics, context);
			case CorePackage.SCHEME_TYPE:
				return validateSchemeType((SchemeType)value, diagnostics, context);
			case CorePackage.PARAMETER_LOCATION:
				return validateParameterLocation((ParameterLocation)value, diagnostics, context);
			case CorePackage.COLLECTION_FORMAT:
				return validateCollectionFormat((CollectionFormat)value, diagnostics, context);
			case CorePackage.OAUTH2_FLOW_TYPE:
				return validateOAuth2FlowType((OAuth2FlowType)value, diagnostics, context);
			case CorePackage.API_KEY_LOCATION:
				return validateAPIKeyLocation((APIKeyLocation)value, diagnostics, context);
			case CorePackage.SECURITY_SCHEME_TYPE:
				return validateSecuritySchemeType((SecuritySchemeType)value, diagnostics, context);
			case CorePackage.JSON_DATA_TYPE:
				return validateJSONDataType((JSONDataType)value, diagnostics, context);
			default: 
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONSchemaSubset(JSONSchemaSubset jsonSchemaSubset, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jsonSchemaSubset, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRoot(Root root, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(root, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPI_requiredSwaggerVersion(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPI_correctSwaggerVersion(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPI_requiredInfoReference(api, diagnostics, context);
		if (result || diagnostics != null) result &= validateAPI_requiredPaths(api, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredSwaggerVersion constraint of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI_requiredSwaggerVersion(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (api_requiredSwaggerVersionInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.API);
			
			EAnnotation ocl = CorePackage.Literals.API.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredSwaggerVersion");
			
			try {
				api_requiredSwaggerVersionInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(api_requiredSwaggerVersionInvOCL);
		
		if (!query.check(api)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredSwaggerVersion", getObjectLabel(api, context) }),
						 new Object[] { api }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the correctSwaggerVersion constraint of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI_correctSwaggerVersion(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (api_correctSwaggerVersionInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.API);
			
			EAnnotation ocl = CorePackage.Literals.API.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("correctSwaggerVersion");
			
			try {
				api_correctSwaggerVersionInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(api_correctSwaggerVersionInvOCL);
		
		if (!query.check(api)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "correctSwaggerVersion", getObjectLabel(api, context) }),
						 new Object[] { api }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredInfoReference constraint of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI_requiredInfoReference(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (api_requiredInfoReferenceInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.API);
			
			EAnnotation ocl = CorePackage.Literals.API.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredInfoReference");
			
			try {
				api_requiredInfoReferenceInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(api_requiredInfoReferenceInvOCL);
		
		if (!query.check(api)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredInfoReference", getObjectLabel(api, context) }),
						 new Object[] { api }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredPaths constraint of '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPI_requiredPaths(API api, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (api_requiredPathsInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.API);
			
			EAnnotation ocl = CorePackage.Literals.API.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredPaths");
			
			try {
				api_requiredPathsInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(api_requiredPathsInvOCL);
		
		if (!query.check(api)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredPaths", getObjectLabel(api, context) }),
						 new Object[] { api }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfo_requiredTitle(info, diagnostics, context);
		if (result || diagnostics != null) result &= validateInfo_requiredAPIVerison(info, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredTitle constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo_requiredTitle(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (info_requiredTitleInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.INFO);
			
			EAnnotation ocl = CorePackage.Literals.INFO.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredTitle");
			
			try {
				info_requiredTitleInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(info_requiredTitleInvOCL);
		
		if (!query.check(info)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredTitle", getObjectLabel(info, context) }),
						 new Object[] { info }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredAPIVerison constraint of '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInfo_requiredAPIVerison(Info info, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (info_requiredAPIVerisonInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.INFO);
			
			EAnnotation ocl = CorePackage.Literals.INFO.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredAPIVerison");
			
			try {
				info_requiredAPIVerisonInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(info_requiredAPIVerisonInvOCL);
		
		if (!query.check(info)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredAPIVerison", getObjectLabel(info, context) }),
						 new Object[] { info }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateContact(Contact contact, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(contact, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense(License license, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(license, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(license, diagnostics, context);
		if (result || diagnostics != null) result &= validateLicense_requiredName(license, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredName constraint of '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLicense_requiredName(License license, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (license_requiredNameInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.LICENSE);
			
			EAnnotation ocl = CorePackage.Literals.LICENSE.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredName");
			
			try {
				license_requiredNameInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(license_requiredNameInvOCL);
		
		if (!query.check(license)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredName", getObjectLabel(license, context) }),
						 new Object[] { license }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePath(Path path, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(path, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_oneBodyParameterAllowed(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_oneFormDataParameterAllowed(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_hasUniqueParameters(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_xorFormAndBody(operation, diagnostics, context);
		if (result || diagnostics != null) result &= validateOperation_requiredResponses(operation, diagnostics, context);
		return result;
	}

	/**
	 * Validates the oneBodyParameterAllowed constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_oneBodyParameterAllowed(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (operation_oneBodyParameterAllowedInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.OPERATION);
			
			EAnnotation ocl = CorePackage.Literals.OPERATION.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("oneBodyParameterAllowed");
			
			try {
				operation_oneBodyParameterAllowedInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(operation_oneBodyParameterAllowedInvOCL);
		
		if (!query.check(operation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "oneBodyParameterAllowed", getObjectLabel(operation, context) }),
						 new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the oneFormDataParameterAllowed constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_oneFormDataParameterAllowed(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (operation_oneFormDataParameterAllowedInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.OPERATION);
			
			EAnnotation ocl = CorePackage.Literals.OPERATION.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("oneFormDataParameterAllowed");
			
			try {
				operation_oneFormDataParameterAllowedInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(operation_oneFormDataParameterAllowedInvOCL);
		
		if (!query.check(operation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "oneFormDataParameterAllowed", getObjectLabel(operation, context) }),
						 new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the hasUniqueParameters constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_hasUniqueParameters(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (operation_hasUniqueParametersInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.OPERATION);
			
			EAnnotation ocl = CorePackage.Literals.OPERATION.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("hasUniqueParameters");
			
			try {
				operation_hasUniqueParametersInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(operation_hasUniqueParametersInvOCL);
		
		if (!query.check(operation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "hasUniqueParameters", getObjectLabel(operation, context) }),
						 new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the xorFormAndBody constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_xorFormAndBody(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (operation_xorFormAndBodyInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.OPERATION);
			
			EAnnotation ocl = CorePackage.Literals.OPERATION.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("xorFormAndBody");
			
			try {
				operation_xorFormAndBodyInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(operation_xorFormAndBodyInvOCL);
		
		if (!query.check(operation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "xorFormAndBody", getObjectLabel(operation, context) }),
						 new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredResponses constraint of '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperation_requiredResponses(Operation operation, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (operation_requiredResponsesInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.OPERATION);
			
			EAnnotation ocl = CorePackage.Literals.OPERATION.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredResponses");
			
			try {
				operation_requiredResponsesInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(operation_requiredResponsesInvOCL);
		
		if (!query.check(operation)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredResponses", getObjectLabel(operation, context) }),
						 new Object[] { operation }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocs(ExternalDocs externalDocs, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(externalDocs, diagnostics, context);
		if (result || diagnostics != null) result &= validateExternalDocs_requiredURL(externalDocs, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredURL constraint of '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocs_requiredURL(ExternalDocs externalDocs, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (externalDocs_requiredURLInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.EXTERNAL_DOCS);
			
			EAnnotation ocl = CorePackage.Literals.EXTERNAL_DOCS.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredURL");
			
			try {
				externalDocs_requiredURLInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(externalDocs_requiredURLInvOCL);
		
		if (!query.check(externalDocs)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredURL", getObjectLabel(externalDocs, context) }),
						 new Object[] { externalDocs }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_NoCircularContainment(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMultiplicityConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_requiredName(parameter, diagnostics, context);
		if (result || diagnostics != null) result &= validateParameter_requiredLocation(parameter, diagnostics, context);
		return result;
	}

	/**
	 * Validates the requiredName constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_requiredName(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (parameter_requiredNameInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.PARAMETER);
			
			EAnnotation ocl = CorePackage.Literals.PARAMETER.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredName");
			
			try {
				parameter_requiredNameInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(parameter_requiredNameInvOCL);
		
		if (!query.check(parameter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredName", getObjectLabel(parameter, context) }),
						 new Object[] { parameter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * Validates the requiredLocation constraint of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter_requiredLocation(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
        if (parameter_requiredLocationInvOCL == null) {
			OCL.Helper helper = OCL_ENV.createOCLHelper();
			helper.setContext(CorePackage.Literals.PARAMETER);
			
			EAnnotation ocl = CorePackage.Literals.PARAMETER.getEAnnotation(OCL_ANNOTATION_SOURCE);
			String expr = ocl.getDetails().get("requiredLocation");
			
			try {
				parameter_requiredLocationInvOCL = helper.createInvariant(expr);
			}
			catch (ParserException e) {
				throw new UnsupportedOperationException(e.getLocalizedMessage());
			}
		}
		
		Query<EClassifier, ?, ?> query = OCL_ENV.createQuery(parameter_requiredLocationInvOCL);
		
		if (!query.check(parameter)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 EcorePlugin.INSTANCE.getString("_UI_GenericConstraint_diagnostic", new Object[] { "requiredLocation", getObjectLabel(parameter, context) }),
						 new Object[] { parameter }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItemsDefinition(ItemsDefinition itemsDefinition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(itemsDefinition, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchema(Schema schema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHeader(Header header, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(header, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTag(Tag tag, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(tag, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchema(SecuritySchema securitySchema, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securitySchema, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExample(Example example, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(example, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXMLElement(XMLElement xmlElement, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xmlElement, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityScope(SecurityScope securityScope, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityScope, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParamterDeclaringContext(ParamterDeclaringContext paramterDeclaringContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(paramterDeclaringContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterContext(ParameterContext parameterContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaDeclaringContext(SchemaDeclaringContext schemaDeclaringContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaDeclaringContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemaContext(SchemaContext schemaContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(schemaContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExternalDocsContext(ExternalDocsContext externalDocsContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(externalDocsContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArrayContext(ArrayContext arrayContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arrayContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDeclaringContext(ResponseDeclaringContext responseDeclaringContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseDeclaringContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONPointer(JSONPointer jsonPointer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(jsonPointer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecurityContext(SecurityContext securityContext, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(securityContext, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSchemeType(SchemeType schemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterLocation(ParameterLocation parameterLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCollectionFormat(CollectionFormat collectionFormat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOAuth2FlowType(OAuth2FlowType oAuth2FlowType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAPIKeyLocation(APIKeyLocation apiKeyLocation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSecuritySchemeType(SecuritySchemeType securitySchemeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateJSONDataType(JSONDataType jsonDataType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

} //CoreValidator
