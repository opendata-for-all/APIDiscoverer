/**
 */
package core;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JSON Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.JSONPointer#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see core.OpenAPIPackage#getJSONPointer()
 * @model abstract="true"
 * @generated
 */
public interface JSONPointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' attribute.
	 * @see core.OpenAPIPackage#getJSONPointer_Ref()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	String getRef();

} // JSONPointer
