/**
 */
package core.impl;

import core.OpenAPIPackage;
import core.SecurityContext;
import core.SecurityRequirement;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SecurityContextImpl#getSecurityRequirements <em>Security Requirements</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SecurityContextImpl extends MinimalEObjectImpl.Container implements SecurityContext {
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
	public EList<SecurityRequirement> getSecurityRequirements() {
		if (securityRequirements == null) {
			securityRequirements = new EObjectContainmentEList<SecurityRequirement>(SecurityRequirement.class, this, OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS);
		}
		return securityRequirements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS:
				return ((InternalEList<?>)getSecurityRequirements()).basicRemove(otherEnd, msgs);
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS:
				return getSecurityRequirements();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
				getSecurityRequirements().addAll((Collection<? extends SecurityRequirement>)newValue);
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS:
				getSecurityRequirements().clear();
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
			case OpenAPIPackage.SECURITY_CONTEXT__SECURITY_REQUIREMENTS:
				return securityRequirements != null && !securityRequirements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SecurityContextImpl
