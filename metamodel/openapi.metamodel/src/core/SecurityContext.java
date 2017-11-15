/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.SecurityContext#getSecurityRequirement <em>Security Requirement</em>}</li>
 * </ul>
 *
 * @see core.OpenAPIPackage#getSecurityContext()
 * @model abstract="true"
 * @generated
 */
public interface SecurityContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Security Requirement</b></em>' reference list.
	 * The list contents are of type {@link core.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Requirement</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Requirement</em>' reference list.
	 * @see core.OpenAPIPackage#getSecurityContext_SecurityRequirement()
	 * @model
	 * @generated
	 */
	EList<SecurityScope> getSecurityRequirement();

} // SecurityContext
