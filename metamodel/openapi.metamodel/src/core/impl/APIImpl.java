/**
 */
package core.impl;

import core.API;
import core.ExternalDocs;
import core.ExternalDocsContext;
import core.Info;
import core.JSONPointer;
import core.OpenAPIPackage;
import core.Parameter;
import core.ParameterContext;
import core.Path;
import core.Response;
import core.ResponseDeclaringContext;
import core.Schema;
import core.SchemaDeclaringContext;
import core.SchemeType;
import core.SecurityContext;
import core.SecurityRequirement;
import core.SecuritySchema;
import core.Tag;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.APIImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link core.impl.APIImpl#getSecurityRequirements <em>Security Requirements</em>}</li>
 *   <li>{@link core.impl.APIImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.impl.APIImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link core.impl.APIImpl#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link core.impl.APIImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link core.impl.APIImpl#getHost <em>Host</em>}</li>
 *   <li>{@link core.impl.APIImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link core.impl.APIImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.impl.APIImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.impl.APIImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.impl.APIImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link core.impl.APIImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link core.impl.APIImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.impl.APIImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link core.impl.APIImpl#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIImpl extends ParamterDeclaringContextImpl implements API {
	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecurityRequirements() <em>Security Requirements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRequirements()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> securityRequirements;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

	/**
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

	/**
	 * The default value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected static final String SWAGGER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSwagger() <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwagger()
	 * @generated
	 * @ordered
	 */
	protected String swagger = SWAGGER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected Info info;

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBasePath() <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasePath()
	 * @generated
	 * @ordered
	 */
	protected String basePath = BASE_PATH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The cached value of the '{@link #getConsumes() <em>Consumes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsumes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> consumes;

	/**
	 * The cached value of the '{@link #getProduces() <em>Produces</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProduces()
	 * @generated
	 * @ordered
	 */
	protected EList<String> produces;

	/**
	 * The cached value of the '{@link #getPaths() <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Path> paths;

	/**
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> definitions;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> responses;

	/**
	 * The cached value of the '{@link #getSecurityDefinitions() <em>Security Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SecuritySchema> securityDefinitions;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tags;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return "#";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRequirement> getSecurityRequirements() {
		if (securityRequirements == null) {
			securityRequirements = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, OpenAPIPackage.API__SECURITY_REQUIREMENTS);
		}
		return securityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, OpenAPIPackage.API__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(ExternalDocs newExternalDocs, NotificationChain msgs) {
		ExternalDocs oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocs(ExternalDocs newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.API__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.API__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSwagger() {
		return swagger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwagger(String newSwagger) {
		String oldSwagger = swagger;
		swagger = newSwagger;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__SWAGGER, oldSwagger, swagger));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Info getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(Info newInfo, NotificationChain msgs) {
		Info oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(Info newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHost() {
		return host;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBasePath() {
		return basePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasePath(String newBasePath) {
		String oldBasePath = basePath;
		basePath = newBasePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.API__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, OpenAPIPackage.API__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIPackage.API__CONSUMES);
		}
		return consumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getProduces() {
		if (produces == null) {
			produces = new EDataTypeUniqueEList<String>(String.class, this, OpenAPIPackage.API__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Path> getPaths() {
		if (paths == null) {
			paths = new EObjectContainmentEList.Unsettable<Path>(Path.class, this, OpenAPIPackage.API__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPaths() {
		if (paths != null) ((InternalEList.Unsettable<?>)paths).unset();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPaths() {
		return paths != null && ((InternalEList.Unsettable<?>)paths).isSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectResolvingEList<Schema>(Schema.class, this, OpenAPIPackage.API__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectContainmentEList<Response>(Response.class, this, OpenAPIPackage.API__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecuritySchema> getSecurityDefinitions() {
		if (securityDefinitions == null) {
			securityDefinitions = new EObjectContainmentEList<SecuritySchema>(SecuritySchema.class, this, OpenAPIPackage.API__SECURITY_DEFINITIONS);
		}
		return securityDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, OpenAPIPackage.API__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean pathsIsSet() {
		return pathsIsSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.API__SECURITY_REQUIREMENTS:
				return ((InternalEList<?>)getSecurityRequirements()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.API__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenAPIPackage.API__INFO:
				return basicSetInfo(null, msgs);
			case OpenAPIPackage.API__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.API__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.API__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIPackage.API__REF:
				return getRef();
			case OpenAPIPackage.API__SECURITY_REQUIREMENTS:
				return getSecurityRequirements();
			case OpenAPIPackage.API__PARAMETERS:
				return getParameters();
			case OpenAPIPackage.API__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenAPIPackage.API__SWAGGER:
				return getSwagger();
			case OpenAPIPackage.API__INFO:
				return getInfo();
			case OpenAPIPackage.API__HOST:
				return getHost();
			case OpenAPIPackage.API__BASE_PATH:
				return getBasePath();
			case OpenAPIPackage.API__SCHEMES:
				return getSchemes();
			case OpenAPIPackage.API__CONSUMES:
				return getConsumes();
			case OpenAPIPackage.API__PRODUCES:
				return getProduces();
			case OpenAPIPackage.API__PATHS:
				return getPaths();
			case OpenAPIPackage.API__DEFINITIONS:
				return getDefinitions();
			case OpenAPIPackage.API__RESPONSES:
				return getResponses();
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case OpenAPIPackage.API__TAGS:
				return getTags();
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
			case OpenAPIPackage.API__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				getSecurityRequirements().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case OpenAPIPackage.API__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OpenAPIPackage.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenAPIPackage.API__SWAGGER:
				setSwagger((String)newValue);
				return;
			case OpenAPIPackage.API__INFO:
				setInfo((Info)newValue);
				return;
			case OpenAPIPackage.API__HOST:
				setHost((String)newValue);
				return;
			case OpenAPIPackage.API__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case OpenAPIPackage.API__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case OpenAPIPackage.API__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIPackage.API__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case OpenAPIPackage.API__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
				return;
			case OpenAPIPackage.API__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPIPackage.API__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				getSecurityDefinitions().addAll((Collection<? extends SecuritySchema>)newValue);
				return;
			case OpenAPIPackage.API__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends Tag>)newValue);
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
			case OpenAPIPackage.API__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				return;
			case OpenAPIPackage.API__PARAMETERS:
				getParameters().clear();
				return;
			case OpenAPIPackage.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenAPIPackage.API__SWAGGER:
				setSwagger(SWAGGER_EDEFAULT);
				return;
			case OpenAPIPackage.API__INFO:
				setInfo((Info)null);
				return;
			case OpenAPIPackage.API__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case OpenAPIPackage.API__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case OpenAPIPackage.API__SCHEMES:
				getSchemes().clear();
				return;
			case OpenAPIPackage.API__CONSUMES:
				getConsumes().clear();
				return;
			case OpenAPIPackage.API__PRODUCES:
				getProduces().clear();
				return;
			case OpenAPIPackage.API__PATHS:
				unsetPaths();
				return;
			case OpenAPIPackage.API__DEFINITIONS:
				getDefinitions().clear();
				return;
			case OpenAPIPackage.API__RESPONSES:
				getResponses().clear();
				return;
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
			case OpenAPIPackage.API__TAGS:
				getTags().clear();
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
			case OpenAPIPackage.API__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case OpenAPIPackage.API__SECURITY_REQUIREMENTS:
				return securityRequirements != null && !securityRequirements.isEmpty();
			case OpenAPIPackage.API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OpenAPIPackage.API__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenAPIPackage.API__SWAGGER:
				return SWAGGER_EDEFAULT == null ? swagger != null : !SWAGGER_EDEFAULT.equals(swagger);
			case OpenAPIPackage.API__INFO:
				return info != null;
			case OpenAPIPackage.API__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case OpenAPIPackage.API__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case OpenAPIPackage.API__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case OpenAPIPackage.API__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case OpenAPIPackage.API__PRODUCES:
				return produces != null && !produces.isEmpty();
			case OpenAPIPackage.API__PATHS:
				return isSetPaths();
			case OpenAPIPackage.API__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case OpenAPIPackage.API__RESPONSES:
				return responses != null && !responses.isEmpty();
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
			case OpenAPIPackage.API__TAGS:
				return tags != null && !tags.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaDeclaringContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.API__REF: return OpenAPIPackage.JSON_POINTER__REF;
				default: return -1;
			}
		}
		if (baseClass == SecurityContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.API__SECURITY_REQUIREMENTS: return OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.API__PARAMETERS: return OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.API__EXTERNAL_DOCS: return OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseDeclaringContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaDeclaringContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.JSON_POINTER__REF: return OpenAPIPackage.API__REF;
				default: return -1;
			}
		}
		if (baseClass == SecurityContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS: return OpenAPIPackage.API__SECURITY_REQUIREMENTS;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS: return OpenAPIPackage.API__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return OpenAPIPackage.API__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		if (baseClass == ResponseDeclaringContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case OpenAPIPackage.API___PATHS_IS_SET:
				return pathsIsSet();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (swagger: ");
		result.append(swagger);
		result.append(", host: ");
		result.append(host);
		result.append(", basePath: ");
		result.append(basePath);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", produces: ");
		result.append(produces);
		result.append(')');
		return result.toString();
	}

} //APIImpl
