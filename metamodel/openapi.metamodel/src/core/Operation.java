/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Operation#getTagReferences <em>Tag References</em>}</li>
 *   <li>{@link core.Operation#getSummary <em>Summary</em>}</li>
 *   <li>{@link core.Operation#getDescription <em>Description</em>}</li>
 *   <li>{@link core.Operation#getOperationId <em>Operation Id</em>}</li>
 *   <li>{@link core.Operation#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.Operation#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.Operation#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.Operation#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.Operation#getDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link core.Operation#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see core.OpenAPIPackage#getOperation()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='oneBodyParameterAllowed oneFormDataParameterAllowed hasUniqueParameters xorFormAndBody requiredResponses'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL oneBodyParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_body\') -&gt; size() &lt;= 1' oneFormDataParameterAllowed='self.parameters-&gt; select(e | e.location = ParameterLocation::\'_formData\') -&gt; size() &lt;= 1' hasUniqueParameters='self.parameters -&gt; collect(t | Tuple{name : String = t.name,location : ParameterLocation = t.location})-&gt;asSet() -&gt; size() = self.parameters -&gt; size()' xorFormAndBody='(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=1 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=1)\r\n\tor \r\n\t(parameters-&gt; select(e | e.location =  ParameterLocation::_\'body\') -&gt; size()=0 and parameters-&gt; select(e | e.location =  ParameterLocation::_\'formData\') -&gt; size()=0)\r\n\t' requiredResponses='self.responses -&gt; size() &lt;&gt; 0'"
 * @generated
 */
public interface Operation extends ParamterDeclaringContext, SecurityContext, ParameterContext, ExternalDocsContext, ResponseDeclaringContext {
	/**
	 * Returns the value of the '<em><b>Tag References</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag References</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag References</em>' attribute list.
	 * @see core.OpenAPIPackage#getOperation_TagReferences()
	 * @model
	 * @generated
	 */
	EList<String> getTagReferences();

	/**
	 * Returns the value of the '<em><b>Summary</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Summary</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Summary</em>' attribute.
	 * @see #setSummary(String)
	 * @see core.OpenAPIPackage#getOperation_Summary()
	 * @model
	 * @generated
	 */
	String getSummary();

	/**
	 * Sets the value of the '{@link core.Operation#getSummary <em>Summary</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Summary</em>' attribute.
	 * @see #getSummary()
	 * @generated
	 */
	void setSummary(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see core.OpenAPIPackage#getOperation_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link core.Operation#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Operation Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Operation Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation Id</em>' attribute.
	 * @see #setOperationId(String)
	 * @see core.OpenAPIPackage#getOperation_OperationId()
	 * @model
	 * @generated
	 */
	String getOperationId();

	/**
	 * Sets the value of the '{@link core.Operation#getOperationId <em>Operation Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operation Id</em>' attribute.
	 * @see #getOperationId()
	 * @generated
	 */
	void setOperationId(String value);

	/**
	 * Returns the value of the '<em><b>Consumes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Consumes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Consumes</em>' attribute list.
	 * @see core.OpenAPIPackage#getOperation_Consumes()
	 * @model
	 * @generated
	 */
	EList<String> getConsumes();

	/**
	 * Returns the value of the '<em><b>Produces</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Produces</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Produces</em>' attribute list.
	 * @see core.OpenAPIPackage#getOperation_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' reference list.
	 * The list contents are of type {@link core.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' reference list.
	 * @see core.OpenAPIPackage#getOperation_Responses()
	 * @model required="true"
	 * @generated
	 */
	EList<Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Schemes</b></em>' attribute list.
	 * The list contents are of type {@link core.SchemeType}.
	 * The literals are from the enumeration {@link core.SchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Schemes</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schemes</em>' attribute list.
	 * @see core.SchemeType
	 * @see core.OpenAPIPackage#getOperation_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(Boolean)
	 * @see core.OpenAPIPackage#getOperation_Deprecated()
	 * @model
	 * @generated
	 */
	Boolean getDeprecated();

	/**
	 * Sets the value of the '{@link core.Operation#getDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #getDeprecated()
	 * @generated
	 */
	void setDeprecated(Boolean value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link core.Path#getGet <em>Get</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' container reference.
	 * @see #setPath(Path)
	 * @see core.OpenAPIPackage#getOperation_Path()
	 * @see core.Path#getGet
	 * @model opposite="get" transient="false"
	 * @generated
	 */
	Path getPath();

	/**
	 * Sets the value of the '{@link core.Operation#getPath <em>Path</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' container reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Path value);

} // Operation
