/**
 */
package core.impl;

import core.CorePackage;
import core.ExternalDocs;
import core.ExternalDocsContext;
import core.Operation;
import core.Parameter;
import core.ParameterContext;
import core.Path;
import core.Response;
import core.ResponseContext;
import core.ResponseDeclaringContext;
import core.SchemeType;
import core.SecurityContext;
import core.SecurityScope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.OperationImpl#getSecurityRequirement <em>Security Requirement</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getSummary <em>Summary</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link core.impl.OperationImpl#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperationImpl extends ParamterDeclaringContextImpl implements Operation {
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
	 * The cached value of the '{@link #getTagReferences() <em>Tag References</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTagReferences()
	 * @generated
	 * @ordered
	 */
	protected EList<String> tagReferences;

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
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' reference list.
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
	 * The default value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DEPRECATED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecated() <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecated()
	 * @generated
	 * @ordered
	 */
	protected Boolean deprecated = DEPRECATED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.OPERATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityScope> getSecurityRequirement() {
		if (securityRequirement == null) {
			securityRequirement = new EObjectResolvingEList<SecurityScope>(SecurityScope.class, this, CorePackage.OPERATION__SECURITY_REQUIREMENT);
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
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, CorePackage.OPERATION__PARAMETERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.OPERATION__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getTagReferences() {
		if (tagReferences == null) {
			tagReferences = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.OPERATION__TAG_REFERENCES);
		}
		return tagReferences;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__SUMMARY, oldSummary, summary));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__OPERATION_ID, oldOperationId, operationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getConsumes() {
		if (consumes == null) {
			consumes = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.OPERATION__CONSUMES);
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
			produces = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.OPERATION__PRODUCES);
		}
		return produces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectResolvingEList<Response>(Response.class, this, CorePackage.OPERATION__RESPONSES);
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
			schemes = new EDataTypeUniqueEList<SchemeType>(SchemeType.class, this, CorePackage.OPERATION__SCHEMES);
		}
		return schemes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getDeprecated() {
		return deprecated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeprecated(Boolean newDeprecated) {
		Boolean oldDeprecated = deprecated;
		deprecated = newDeprecated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__DEPRECATED, oldDeprecated, deprecated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Path getPath() {
		if (eContainerFeatureID() != CorePackage.OPERATION__PATH) return null;
		return (Path)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(Path newPath, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPath, CorePackage.OPERATION__PATH, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(Path newPath) {
		if (newPath != eInternalContainer() || (eContainerFeatureID() != CorePackage.OPERATION__PATH && newPath != null)) {
			if (EcoreUtil.isAncestor(this, newPath))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, CorePackage.PATH__GET, Path.class, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.OPERATION__PATH, newPath, newPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OPERATION__PATH:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPath((Path)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.OPERATION__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case CorePackage.OPERATION__PATH:
				return basicSetPath(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.OPERATION__PATH:
				return eInternalContainer().eInverseRemove(this, CorePackage.PATH__GET, Path.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.OPERATION__SECURITY_REQUIREMENT:
				return getSecurityRequirement();
			case CorePackage.OPERATION__PARAMETERS:
				return getParameters();
			case CorePackage.OPERATION__EXTERNAL_DOCS:
				return getExternalDocs();
			case CorePackage.OPERATION__TAG_REFERENCES:
				return getTagReferences();
			case CorePackage.OPERATION__SUMMARY:
				return getSummary();
			case CorePackage.OPERATION__DESCRIPTION:
				return getDescription();
			case CorePackage.OPERATION__OPERATION_ID:
				return getOperationId();
			case CorePackage.OPERATION__CONSUMES:
				return getConsumes();
			case CorePackage.OPERATION__PRODUCES:
				return getProduces();
			case CorePackage.OPERATION__RESPONSES:
				return getResponses();
			case CorePackage.OPERATION__SCHEMES:
				return getSchemes();
			case CorePackage.OPERATION__DEPRECATED:
				return getDeprecated();
			case CorePackage.OPERATION__PATH:
				return getPath();
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
			case CorePackage.OPERATION__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
				getSecurityRequirement().addAll((Collection<? extends SecurityScope>)newValue);
				return;
			case CorePackage.OPERATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case CorePackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case CorePackage.OPERATION__TAG_REFERENCES:
				getTagReferences().clear();
				getTagReferences().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.OPERATION__SUMMARY:
				setSummary((String)newValue);
				return;
			case CorePackage.OPERATION__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.OPERATION__OPERATION_ID:
				setOperationId((String)newValue);
				return;
			case CorePackage.OPERATION__CONSUMES:
				getConsumes().clear();
				getConsumes().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.OPERATION__PRODUCES:
				getProduces().clear();
				getProduces().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.OPERATION__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
				return;
			case CorePackage.OPERATION__SCHEMES:
				getSchemes().clear();
				getSchemes().addAll((Collection<? extends SchemeType>)newValue);
				return;
			case CorePackage.OPERATION__DEPRECATED:
				setDeprecated((Boolean)newValue);
				return;
			case CorePackage.OPERATION__PATH:
				setPath((Path)newValue);
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
			case CorePackage.OPERATION__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
				return;
			case CorePackage.OPERATION__PARAMETERS:
				getParameters().clear();
				return;
			case CorePackage.OPERATION__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case CorePackage.OPERATION__TAG_REFERENCES:
				getTagReferences().clear();
				return;
			case CorePackage.OPERATION__SUMMARY:
				setSummary(SUMMARY_EDEFAULT);
				return;
			case CorePackage.OPERATION__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.OPERATION__OPERATION_ID:
				setOperationId(OPERATION_ID_EDEFAULT);
				return;
			case CorePackage.OPERATION__CONSUMES:
				getConsumes().clear();
				return;
			case CorePackage.OPERATION__PRODUCES:
				getProduces().clear();
				return;
			case CorePackage.OPERATION__RESPONSES:
				getResponses().clear();
				return;
			case CorePackage.OPERATION__SCHEMES:
				getSchemes().clear();
				return;
			case CorePackage.OPERATION__DEPRECATED:
				setDeprecated(DEPRECATED_EDEFAULT);
				return;
			case CorePackage.OPERATION__PATH:
				setPath((Path)null);
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
			case CorePackage.OPERATION__SECURITY_REQUIREMENT:
				return securityRequirement != null && !securityRequirement.isEmpty();
			case CorePackage.OPERATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case CorePackage.OPERATION__EXTERNAL_DOCS:
				return externalDocs != null;
			case CorePackage.OPERATION__TAG_REFERENCES:
				return tagReferences != null && !tagReferences.isEmpty();
			case CorePackage.OPERATION__SUMMARY:
				return SUMMARY_EDEFAULT == null ? summary != null : !SUMMARY_EDEFAULT.equals(summary);
			case CorePackage.OPERATION__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.OPERATION__OPERATION_ID:
				return OPERATION_ID_EDEFAULT == null ? operationId != null : !OPERATION_ID_EDEFAULT.equals(operationId);
			case CorePackage.OPERATION__CONSUMES:
				return consumes != null && !consumes.isEmpty();
			case CorePackage.OPERATION__PRODUCES:
				return produces != null && !produces.isEmpty();
			case CorePackage.OPERATION__RESPONSES:
				return responses != null && !responses.isEmpty();
			case CorePackage.OPERATION__SCHEMES:
				return schemes != null && !schemes.isEmpty();
			case CorePackage.OPERATION__DEPRECATED:
				return DEPRECATED_EDEFAULT == null ? deprecated != null : !DEPRECATED_EDEFAULT.equals(deprecated);
			case CorePackage.OPERATION__PATH:
				return getPath() != null;
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
		if (baseClass == SecurityContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.OPERATION__SECURITY_REQUIREMENT: return CorePackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.OPERATION__PARAMETERS: return CorePackage.PARAMETER_CONTEXT__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.OPERATION__EXTERNAL_DOCS: return CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
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
		if (baseClass == ResponseContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == SecurityContext.class) {
			switch (baseFeatureID) {
				case CorePackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT: return CorePackage.OPERATION__SECURITY_REQUIREMENT;
				default: return -1;
			}
		}
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case CorePackage.PARAMETER_CONTEXT__PARAMETERS: return CorePackage.OPERATION__PARAMETERS;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return CorePackage.OPERATION__EXTERNAL_DOCS;
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
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (tagReferences: ");
		result.append(tagReferences);
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

} //OperationImpl
