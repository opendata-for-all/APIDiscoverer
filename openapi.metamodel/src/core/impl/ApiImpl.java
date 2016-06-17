/**
 */
package core.impl;

import core.APIParameter;
import core.Api;
import core.CorePackage;
import core.ExternalDocs;
import core.Info;
import core.Path;
import core.Response;
import core.Schema;
import core.SchemeType;
import core.SecurityRequirement;
import core.SecuritySchema;
import core.Tag;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.ApiImpl#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getHost <em>Host</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getSecurity <em>Security</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getExternaldocs <em>Externaldocs</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getTag <em>Tag</em>}</li>
 *   <li>{@link core.impl.ApiImpl#getPrimitiveDefinitions <em>Primitive Definitions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ApiImpl extends MinimalEObjectImpl.Container implements Api {
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
	 * The cached value of the '{@link #getDefinitions() <em>Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> definitions;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<APIParameter> parameters;

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
	 * The cached value of the '{@link #getSecurity() <em>Security</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityRequirement> security;

	/**
	 * The cached value of the '{@link #getExternaldocs() <em>Externaldocs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternaldocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externaldocs;

	/**
	 * The cached value of the '{@link #getTag() <em>Tag</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected EList<Tag> tag;

	/**
	 * The cached value of the '{@link #getPrimitiveDefinitions() <em>Primitive Definitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveDefinitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> primitiveDefinitions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApiImpl() {
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
			paths = new EObjectContainmentEList<Path>(Path.class, this, CorePackage.API__PATHS);
		}
		return paths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getDefinitions() {
		if (definitions == null) {
			definitions = new EObjectContainmentEList<Schema>(Schema.class, this, CorePackage.API__DEFINITIONS);
		}
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<APIParameter>(APIParameter.class, this, CorePackage.API__PARAMETERS);
		}
		return parameters;
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
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, CorePackage.API__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs getExternaldocs() {
		return externaldocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternaldocs(ExternalDocs newExternaldocs, NotificationChain msgs) {
		ExternalDocs oldExternaldocs = externaldocs;
		externaldocs = newExternaldocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.API__EXTERNALDOCS, oldExternaldocs, newExternaldocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternaldocs(ExternalDocs newExternaldocs) {
		if (newExternaldocs != externaldocs) {
			NotificationChain msgs = null;
			if (externaldocs != null)
				msgs = ((InternalEObject)externaldocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__EXTERNALDOCS, null, msgs);
			if (newExternaldocs != null)
				msgs = ((InternalEObject)newExternaldocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.API__EXTERNALDOCS, null, msgs);
			msgs = basicSetExternaldocs(newExternaldocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API__EXTERNALDOCS, newExternaldocs, newExternaldocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Tag> getTag() {
		if (tag == null) {
			tag = new EObjectContainmentEList<Tag>(Tag.class, this, CorePackage.API__TAG);
		}
		return tag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getPrimitiveDefinitions() {
		if (primitiveDefinitions == null) {
			primitiveDefinitions = new EObjectContainmentEList<Schema>(Schema.class, this, CorePackage.API__PRIMITIVE_DEFINITIONS);
		}
		return primitiveDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.API__INFO:
				return basicSetInfo(null, msgs);
			case CorePackage.API__PATHS:
				return ((InternalEList<?>)getPaths()).basicRemove(otherEnd, msgs);
			case CorePackage.API__DEFINITIONS:
				return ((InternalEList<?>)getDefinitions()).basicRemove(otherEnd, msgs);
			case CorePackage.API__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CorePackage.API__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case CorePackage.API__SECURITY_DEFINITIONS:
				return ((InternalEList<?>)getSecurityDefinitions()).basicRemove(otherEnd, msgs);
			case CorePackage.API__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
			case CorePackage.API__EXTERNALDOCS:
				return basicSetExternaldocs(null, msgs);
			case CorePackage.API__TAG:
				return ((InternalEList<?>)getTag()).basicRemove(otherEnd, msgs);
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				return ((InternalEList<?>)getPrimitiveDefinitions()).basicRemove(otherEnd, msgs);
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
			case CorePackage.API__PARAMETERS:
				return getParameters();
			case CorePackage.API__RESPONSES:
				return getResponses();
			case CorePackage.API__SECURITY_DEFINITIONS:
				return getSecurityDefinitions();
			case CorePackage.API__SECURITY:
				return getSecurity();
			case CorePackage.API__EXTERNALDOCS:
				return getExternaldocs();
			case CorePackage.API__TAG:
				return getTag();
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				return getPrimitiveDefinitions();
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
			case CorePackage.API__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends APIParameter>)newValue);
				return;
			case CorePackage.API__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case CorePackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				getSecurityDefinitions().addAll((Collection<? extends SecuritySchema>)newValue);
				return;
			case CorePackage.API__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
				return;
			case CorePackage.API__EXTERNALDOCS:
				setExternaldocs((ExternalDocs)newValue);
				return;
			case CorePackage.API__TAG:
				getTag().clear();
				getTag().addAll((Collection<? extends Tag>)newValue);
				return;
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				getPrimitiveDefinitions().clear();
				getPrimitiveDefinitions().addAll((Collection<? extends Schema>)newValue);
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
				getPaths().clear();
				return;
			case CorePackage.API__DEFINITIONS:
				getDefinitions().clear();
				return;
			case CorePackage.API__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.API__RESPONSES:
				getResponses().clear();
				return;
			case CorePackage.API__SECURITY_DEFINITIONS:
				getSecurityDefinitions().clear();
				return;
			case CorePackage.API__SECURITY:
				getSecurity().clear();
				return;
			case CorePackage.API__EXTERNALDOCS:
				setExternaldocs((ExternalDocs)null);
				return;
			case CorePackage.API__TAG:
				getTag().clear();
				return;
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				getPrimitiveDefinitions().clear();
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
				return paths != null && !paths.isEmpty();
			case CorePackage.API__DEFINITIONS:
				return definitions != null && !definitions.isEmpty();
			case CorePackage.API__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.API__RESPONSES:
				return responses != null && !responses.isEmpty();
			case CorePackage.API__SECURITY_DEFINITIONS:
				return securityDefinitions != null && !securityDefinitions.isEmpty();
			case CorePackage.API__SECURITY:
				return security != null && !security.isEmpty();
			case CorePackage.API__EXTERNALDOCS:
				return externaldocs != null;
			case CorePackage.API__TAG:
				return tag != null && !tag.isEmpty();
			case CorePackage.API__PRIMITIVE_DEFINITIONS:
				return primitiveDefinitions != null && !primitiveDefinitions.isEmpty();
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

} //ApiImpl
