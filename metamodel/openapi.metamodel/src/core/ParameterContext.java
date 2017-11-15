/**
 */
package core;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.ParameterContext#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see core.OpenAPIPackage#getParameterContext()
 * @model abstract="true"
 * @generated
 */
public interface ParameterContext extends EObject {

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link core.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see core.OpenAPIPackage#getParameterContext_Parameters()
	 * @model
	 * @generated
	 */
	EList<Parameter> getParameters();
} // ParameterContext
