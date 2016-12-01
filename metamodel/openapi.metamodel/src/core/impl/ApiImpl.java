/**
 */
package core.impl;

import core.API;
import core.CorePackage;
import core.ExternalDocs;
import core.ExternalDocsContext;
import core.Info;
import core.JSONPointer;
import core.Parameter;
import core.ParameterContext;
import core.Path;
import core.Response;
import core.ResponseContext;
import core.Schema;
import core.SchemaDeclaringContext;
import core.SchemeType;
import core.SecurityContext;
import core.SecuritySchema;
import core.SecurityScope;
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
 *   <li>{@link core.impl.APIImpl#getSecurityRequirement <em>Security Requirement</em>}</li>
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
	 * The cached value of the '{@link #getSecurityRequirement() <em>Security Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScope> securityRequirement;

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
		return CorePackage.Literals.API;
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
	public EList<SecurityScope> getSecurityRequirement() {
		if (securityRequirement == null) {
			securityRequirement = new EObjectResolvingEList<SecurityScope>(SecurityScope.class, this, CorePackage.API__SECURITY_REQUIREMENT);
		}
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, CorePackage.API__PARAMETERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.API__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__SWAGGER, oldSwagger, swagger));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.API__INFO, oldInfo, newInfo);
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
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__INFO, newInfo, newInfo));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__HOST, oldHost, host));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__BASE_PATH, oldBasePath, basePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, CorePackage.API__SCHEMES);
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
			consumes = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API__CONSUMES);
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
			produces = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API__PRODUCES);
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
			paths = new EObjectContainmentEList.Unsettable<Path>(Path.class, this, CorePackage.API__PATHS);
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
			definitions = new EObjectResolvingEList<Schema>(Schema.class, this, CorePackage.API__DEFINITIONS);
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
			responses = new EObjectContainmentEList<Response>(Response.class, this, CorePackage.API__RESPONSES);
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
			securityDefinitions = new EObjectContainmentEList<SecuritySchema>(SecuritySchema.class, this, CorePackage.API__SECURITY_DEFINITIONS);
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
			tags = new EObjectContainmentEList<Tag>(Tag.class, this, CorePackage.API__TAGS);
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
			case CorePackage.API__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case CorePackage.API__INFO:
				return basicSetInfo(null, msgs);
			case CorePackage.API__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case CorePackage.API__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case CorePackage.API__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
			case CorePackage.API__TAGS:
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
			case CorePackage.API__REF:
				return getRef();
			case CorePackage.API__SECURITY_REQUIREMENT:
				return getSecurityRequirement();
			case CorePackage.API__PARAMETERS:
				return getParameters();
			case CorePackage.API__EXTERNAL_DOCS:
				return getExternalDocs();
			case CorePackage.API__SWAGGER:
				return getSwagger();
			case CorePackage.API__INFO:
				return getInfo();
			case CorePackage.API__HOST:
				return getHost();
			case CorePackage.API__BASE_PATH:
				return getBasePath();
			case CorePackage.API__SCHEMES:
				return getSchemes();
			case CorePackage.API__CONSUMES:
				return getConsumes();
			case CorePackage.API__PRODUCES:
				return getProduces();
			case CorePackage.API__PATHS:
				return getPaths();
			case CorePackage.API__DEFINITIONS:
				return getDefinitions();
			case CorePackage.API__RESPONSES:
				return getResponses();
			case CorePackage.API__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case CorePackage.API__TAGS:
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
			case CorePackage.API__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
				getSecurityRequirement().addAll((Collection<? extends SecurityScope>)newValue);
				return;
			case CorePackage.API__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case CorePackage.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case CorePackage.API__SWAGGER:
				setSwagger((String)newValue);
				return;
			case CorePackage.API__INFO:
				setInfo((Info)newValue);
				return;
			case CorePackage.API__HOST:
				setHost((String)newValue);
				return;
			case CorePackage.API__BASE_PATH:
				setBasePath((String)newValue);
				return;
			case CorePackage.API__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case CorePackage.API__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API__PATHS:
				getPaths().clear();
				getPaths().addAll((Collection<? extends Path>)newValue);
				return;
			case CorePackage.API__DEFINITIONS:
				getDefinitions().clear();
				getDefinitions().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.API__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case CorePackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				getSecurityDefinitions().addAll((Collection<? extends SecuritySchema>)newValue);
				return;
			case CorePackage.API__TAGS:
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
			case CorePackage.API__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
				return;
			case CorePackage.API__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.API__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case CorePackage.API__SWAGGER:
				setSwagger(SWAGGER_EDEFAULT);
				return;
			case CorePackage.API__INFO:
				setInfo((Info)null);
				return;
			case CorePackage.API__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case CorePackage.API__BASE_PATH:
				setBasePath(BASE_PATH_EDEFAULT);
				return;
			case CorePackage.API__SCHEMES:
				getSchemes().clear();
				return;
			case CorePackage.API__CONSUMES:
				getConsumes().clear();
				return;
			case CorePackage.API__PRODUCES:
				getProduces().clear();
				return;
			case CorePackage.API__PATHS:
				unsetPaths();
				return;
			case CorePackage.API__DEFINITIONS:
				getDefinitions().clear();
				return;
			case CorePackage.API__RESPONSES:
				getResponses().clear();
				return;
			case CorePackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
			case CorePackage.API__TAGS:
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
			case CorePackage.API__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case CorePackage.API__SECURITY_REQUIREMENT:
				return securityRequirement != null && !securityRequirement.isEmpty();
			case CorePackage.API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.API__EXTERNAL_DOCS:
				return externalDocs != null;
			case CorePackage.API__SWAGGER:
				return SWAGGER_EDEFAULT == null ? swagger != null : !SWAGGER_EDEFAULT.equals(swagger);
			case CorePackage.API__INFO:
				return info != null;
			case CorePackage.API__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case CorePackage.API__BASE_PATH:
				return BASE_PATH_EDEFAULT == null ? basePath != null : !BASE_PATH_EDEFAULT.equals(basePath);
			case CorePackage.API__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case CorePackage.API__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case CorePackage.API__PRODUCES:
				return produces != null && !produces.isEmpty();
			case CorePackage.API__PATHS:
				return isSetPaths();
			case CorePackage.API__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case CorePackage.API__RESPONSES:
				return responses != null && !responses.isEmpty();
			case CorePackage.API__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
			case CorePackage.API__TAGS:
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
		if (baseClass == ResponseContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SchemaDeclaringContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case CorePackage.API__REF: return CorePackage.JSON_POINTER__REF;
				default: return -1;
			}
		}
		if (baseClass == SecurityContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.API__SECURITY_REQUIREMENT: return CorePackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.API__PARAMETERS: return CorePackage.PARAMETER_CONTEXT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.API__EXTERNAL_DOCS: return CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
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
		if (baseClass == ResponseContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SchemaDeclaringContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case CorePackage.JSON_POINTER__REF: return CorePackage.API__REF;
				default: return -1;
			}
		}
		if (baseClass == SecurityContext.class) {
			switch (baseFeatureID) {
				case CorePackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT: return CorePackage.API__SECURITY_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case CorePackage.PARAMETER_CONTEXT__PARAMETERS: return CorePackage.API__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return CorePackage.API__EXTERNAL_DOCS;
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
			case CorePackage.API___PATHS_IS_SET:
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
