/**
 */
package core.impl;

import core.OpenAPIPackage;
import core.SecurityRequirement;
import core.SecuritySchema;
import core.SecurityScope;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SecurityRequirementImpl#getSecurityScopes <em>Security Scopes</em>}</li>
 *   <li>{@link core.impl.SecurityRequirementImpl#getSecuritySchema <em>Security Schema</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SecurityRequirementImpl extends MinimalEObjectImpl.Container implements SecurityRequirement {
	/**
	 * The cached value of the '{@link #getSecurityScopes() <em>Security Scopes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityScopes()
	 * @generated
	 * @ordered
	 */
	protected EList<SecurityScope> securityScopes;

	/**
	 * The cached value of the '{@link #getSecuritySchema() <em>Security Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecuritySchema()
	 * @generated
	 * @ordered
	 */
	protected SecuritySchema securitySchema;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.SECURITY_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityScope> getSecurityScopes() {
		if (securityScopes == null) {
			securityScopes = new EObjectResolvingEList<SecurityScope>(SecurityScope.class, this, OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCOPES);
		}
		return securityScopes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchema getSecuritySchema() {
		if (securitySchema != null && securitySchema.eIsProxy()) {
			InternalEObject oldSecuritySchema = (InternalEObject)securitySchema;
			securitySchema = (SecuritySchema)eResolveProxy(oldSecuritySchema);
			if (securitySchema != oldSecuritySchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA, oldSecuritySchema, securitySchema));
			}
		}
		return securitySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecuritySchema basicGetSecuritySchema() {
		return securitySchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecuritySchema(SecuritySchema newSecuritySchema) {
		SecuritySchema oldSecuritySchema = securitySchema;
		securitySchema = newSecuritySchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA, oldSecuritySchema, securitySchema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				return getSecurityScopes();
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA:
				if (resolve) return getSecuritySchema();
				return basicGetSecuritySchema();
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
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				getSecurityScopes().clear();
				getSecurityScopes().addAll((Collection<? extends SecurityScope>)newValue);
				return;
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA:
				setSecuritySchema((SecuritySchema)newValue);
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
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				getSecurityScopes().clear();
				return;
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA:
				setSecuritySchema((SecuritySchema)null);
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
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCOPES:
				return securityScopes != null && !securityScopes.isEmpty();
			case OpenAPIPackage.SECURITY_REQUIREMENT__SECURITY_SCHEMA:
				return securitySchema != null;
		}
		return super.eIsSet(featureID);
	}

} //SecurityRequirementImpl
