/**
 */
package core.impl;

import core.APIOperation;
import core.APIParameter;
import core.CorePackage;
import core.ExternalDocs;
import core.Response;
import core.SchemeType;
import core.SecurityRequirement;

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
 * An implementation of the model object '<em><b>API Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.APIOperationImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link core.impl.APIOperationImpl#getSecurity <em>Security</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIOperationImpl extends MinimalEObjectImpl.Container implements APIOperation {
	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tags;

	/**
	 * The default value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected static final String SUMMARY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSummary() <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSummary()
	 * @generated
	 * @ordered
	 */
	protected String summary = SUMMARY_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The default value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATION_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperationId() <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationId()
	 * @generated
	 * @ordered
	 */
	protected String operationId = OPERATION_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getSchemes() <em>Schemes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemes()
	 * @generated
	 * @ordered
	 */
	protected EList<SchemeType> schemes;

	/**
	 * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeprecated()
	 * @generated
	 * @ordered
	 */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.API_OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTags() {
		if (tags == null) {
			tags = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API_OPERATION__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSummary() {
		return summary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSummary(String newSummary) {
		String oldSummary = summary;
		summary = newSummary;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__SUMMARY, oldSummary, summary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__DESCRIPTION, oldDescription, description));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.API_OPERATION__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.API_OPERATION__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOperationId() {
		return operationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationId(String newOperationId) {
		String oldOperationId = operationId;
		operationId = newOperationId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API_OPERATION__CONSUMES);
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
			produces = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API_OPERATION__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<APIParameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<APIParameter>(APIParameter.class, this, CorePackage.API_OPERATION__PARAMETERS);
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
			responses = new EObjectContainmentEList<Response>(Response.class, this, CorePackage.API_OPERATION__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SchemeType> getSchemes() {
		if (schemes == null) {
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, CorePackage.API_OPERATION__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(boolean newDeprecated) {
		boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_OPERATION__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityRequirement> getSecurity() {
		if (security == null) {
			security = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, CorePackage.API_OPERATION__SECURITY);
		}
		return security;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.API_OPERATION__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case CorePackage.API_OPERATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case CorePackage.API_OPERATION__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
			case CorePackage.API_OPERATION__SECURITY:
				return ((InternalEList<?>)getSecurity()).basicRemove(otherEnd, msgs);
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
			case CorePackage.API_OPERATION__TAGS:
				return getTags();
			case CorePackage.API_OPERATION__SUMMARY:
				return getSummary();
			case CorePackage.API_OPERATION__DESCRIPTION:
				return getDescription();
			case CorePackage.API_OPERATION__EXTERNAL_DOCS:
				return getExternalDocs();
			case CorePackage.API_OPERATION__OPERATION_ID:
				return getOperationId();
			case CorePackage.API_OPERATION__CONSUMES:
				return getConsumes();
			case CorePackage.API_OPERATION__PRODUCES:
				return getProduces();
			case CorePackage.API_OPERATION__PARAMETERS:
				return getParameters();
			case CorePackage.API_OPERATION__RESPONSES:
				return getResponses();
			case CorePackage.API_OPERATION__SCHEMES:
				return getSchemes();
			case CorePackage.API_OPERATION__DEPRECATED:
				return isDeprecated();
			case CorePackage.API_OPERATION__SECURITY:
				return getSecurity();
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
			case CorePackage.API_OPERATION__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API_OPERATION__SUMMARY:
				setSummary((String)newValue);
				return;
			case CorePackage.API_OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.API_OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case CorePackage.API_OPERATION__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case CorePackage.API_OPERATION__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API_OPERATION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API_OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends APIParameter>)newValue);
				return;
			case CorePackage.API_OPERATION__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case CorePackage.API_OPERATION__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case CorePackage.API_OPERATION__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case CorePackage.API_OPERATION__SECURITY:
				getSecurity().clear();
				getSecurity().addAll((Collection<? extends SecurityRequirement>)newValue);
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
			case CorePackage.API_OPERATION__TAGS:
				getTags().clear();
				return;
			case CorePackage.API_OPERATION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CorePackage.API_OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.API_OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case CorePackage.API_OPERATION__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case CorePackage.API_OPERATION__CONSUMES:
				getConsumes().clear();
				return;
			case CorePackage.API_OPERATION__PRODUCES:
				getProduces().clear();
				return;
			case CorePackage.API_OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.API_OPERATION__RESPONSES:
				getResponses().clear();
				return;
			case CorePackage.API_OPERATION__SCHEMES:
				getSchemes().clear();
				return;
			case CorePackage.API_OPERATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case CorePackage.API_OPERATION__SECURITY:
				getSecurity().clear();
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
			case CorePackage.API_OPERATION__TAGS:
				return tags != null && !tags.isEmpty();
			case CorePackage.API_OPERATION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CorePackage.API_OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.API_OPERATION__EXTERNAL_DOCS:
				return externalDocs != null;
			case CorePackage.API_OPERATION__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case CorePackage.API_OPERATION__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case CorePackage.API_OPERATION__PRODUCES:
				return produces != null && !produces.isEmpty();
			case CorePackage.API_OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.API_OPERATION__RESPONSES:
				return responses != null && !responses.isEmpty();
			case CorePackage.API_OPERATION__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case CorePackage.API_OPERATION__DEPRECATED:
				return deprecated != DEPRECATED_EDEFAULT;
			case CorePackage.API_OPERATION__SECURITY:
				return security != null && !security.isEmpty();
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
		result.append(" (tags: ");
		result.append(tags);
		result.append(", summary: ");
		result.append(summary);
		result.append(", description: ");
		result.append(description);
		result.append(", operationId: ");
		result.append(operationId);
		result.append(", consumes: ");
		result.append(consumes);
		result.append(", produces: ");
		result.append(produces);
		result.append(", schemes: ");
		result.append(schemes);
		result.append(", deprecated: ");
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //APIOperationImpl
