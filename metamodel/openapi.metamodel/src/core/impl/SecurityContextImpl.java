/**
 */
package core.impl;

import core.OpenAPIPackage;
import core.SecurityContext;
import core.SecurityScope;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SecurityContextImpl#getSecurityRequirement <em>Security Requirement</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SecurityContextImpl extends MinimalEObjectImpl.Container implements SecurityContext {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SecurityContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.SECURITY_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SecurityScope> getSecurityRequirement() {
		if (securityRequirement == null) {
			securityRequirement = new EObjectResolvingEList<SecurityScope>(SecurityScope.class, this, OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT);
		}
		return securityRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT:
				return getSecurityRequirement();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
				getSecurityRequirement().addAll((Collection<? extends SecurityScope>)newValue);
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT:
				getSecurityRequirement().clear();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENT:
				return securityRequirement != null && !securityRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityContextImpl
