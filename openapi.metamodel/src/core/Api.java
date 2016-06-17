/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Api#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link core.Api#getInfo <em>Info</em>}</li>
 *   <li>{@link core.Api#getHost <em>Host</em>}</li>
 *   <li>{@link core.Api#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link core.Api#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.Api#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.Api#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.Api#getPaths <em>Paths</em>}</li>
 *   <li>{@link core.Api#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link core.Api#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.Api#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.Api#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link core.Api#getSecurity <em>Security</em>}</li>
 *   <li>{@link core.Api#getExternaldocs <em>Externaldocs</em>}</li>
 *   <li>{@link core.Api#getTag <em>Tag</em>}</li>
 *   <li>{@link core.Api#getPrimitiveDefinitions <em>Primitive Definitions</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getApi()
 * @model
 * @generated
 */
public interface Api extends EObject {
	/**
	 * Returns the value of the '<em><b>Swagger</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swagger</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swagger</em>' attribute.
	 * @see #setSwagger(String)
	 * @see core.CorePackage#getApi_Swagger()
	 * @model
	 * @generated
	 */
	String getSwagger();

	/**
	 * Sets the value of the '{@link core.Api#getSwagger <em>Swagger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swagger</em>' attribute.
	 * @see #getSwagger()
	 * @generated
	 */
	void setSwagger(String value);

	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(Info)
	 * @see core.CorePackage#getApi_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link core.Api#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(Info value);

	/**
	 * Returns the value of the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Host</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Host</em>' attribute.
	 * @see #setHost(String)
	 * @see core.CorePackage#getApi_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link core.Api#getHost <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Host</em>' attribute.
	 * @see #getHost()
	 * @generated
	 */
	void setHost(String value);

	/**
	 * Returns the value of the '<em><b>Base Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Path</em>' attribute.
	 * @see #setBasePath(String)
	 * @see core.CorePackage#getApi_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link core.Api#getBasePath <em>Base Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Path</em>' attribute.
	 * @see #getBasePath()
	 * @generated
	 */
	void setBasePath(String value);

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
	 * @see core.CorePackage#getApi_Schemes()
	 * @model
	 * @generated
	 */
	EList<SchemeType> getSchemes();

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
	 * @see core.CorePackage#getApi_Consumes()
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
	 * @see core.CorePackage#getApi_Produces()
	 * @model
	 * @generated
	 */
	EList<String> getProduces();

	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference list.
	 * The list contents are of type {@link core.Path}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paths</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference list.
	 * @see core.CorePackage#getApi_Paths()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' containment reference list.
	 * @see core.CorePackage#getApi_Definitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getDefinitions();

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link core.APIParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see core.CorePackage#getApi_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<APIParameter> getParameters();

	/**
	 * Returns the value of the '<em><b>Responses</b></em>' containment reference list.
	 * The list contents are of type {@link core.Response}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Responses</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Responses</em>' containment reference list.
	 * @see core.CorePackage#getApi_Responses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Response> getResponses();

	/**
	 * Returns the value of the '<em><b>Security Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link core.SecuritySchema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security Definitions</em>' containment reference list.
	 * @see core.CorePackage#getApi_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecuritySchema> getSecurityDefinitions();

	/**
	 * Returns the value of the '<em><b>Security</b></em>' containment reference list.
	 * The list contents are of type {@link core.SecurityRequirement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Security</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Security</em>' containment reference list.
	 * @see core.CorePackage#getApi_Security()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityRequirement> getSecurity();

	/**
	 * Returns the value of the '<em><b>Externaldocs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Externaldocs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Externaldocs</em>' containment reference.
	 * @see #setExternaldocs(ExternalDocs)
	 * @see core.CorePackage#getApi_Externaldocs()
	 * @model containment="true"
	 * @generated
	 */
	ExternalDocs getExternaldocs();

	/**
	 * Sets the value of the '{@link core.Api#getExternaldocs <em>Externaldocs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Externaldocs</em>' containment reference.
	 * @see #getExternaldocs()
	 * @generated
	 */
	void setExternaldocs(ExternalDocs value);

	/**
	 * Returns the value of the '<em><b>Tag</b></em>' containment reference list.
	 * The list contents are of type {@link core.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tag</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tag</em>' containment reference list.
	 * @see core.CorePackage#getApi_Tag()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTag();

	/**
	 * Returns the value of the '<em><b>Primitive Definitions</b></em>' containment reference list.
	 * The list contents are of type {@link core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primitive Definitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primitive Definitions</em>' containment reference list.
	 * @see core.CorePackage#getApi_PrimitiveDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Schema> getPrimitiveDefinitions();

} // Api
