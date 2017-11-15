/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Security Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.SecuritySchema#getType <em>Type</em>}</li>
 *   <li>{@link core.SecuritySchema#getDescription <em>Description</em>}</li>
 *   <li>{@link core.SecuritySchema#getName <em>Name</em>}</li>
 *   <li>{@link core.SecuritySchema#getLocation <em>Location</em>}</li>
 *   <li>{@link core.SecuritySchema#getFlow <em>Flow</em>}</li>
 *   <li>{@link core.SecuritySchema#getAuthorizationUrl <em>Authorization Url</em>}</li>
 *   <li>{@link core.SecuritySchema#getTokenUrl <em>Token Url</em>}</li>
 *   <li>{@link core.SecuritySchema#getGlobalName <em>Global Name</em>}</li>
 *   <li>{@link core.SecuritySchema#getScopes <em>Scopes</em>}</li>
 * </ul>
 *
 * @see core.OpenAPIPackage#getSecuritySchema()
 * @model
 * @generated
 */
public interface SecuritySchema extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link core.SecuritySchemeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see core.SecuritySchemeType
	 * @see #setType(SecuritySchemeType)
	 * @see core.OpenAPIPackage#getSecuritySchema_Type()
	 * @model
	 * @generated
	 */
	SecuritySchemeType getType();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see core.SecuritySchemeType
	 * @see #getType()
	 * @generated
	 */
	void setType(SecuritySchemeType value);

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
	 * @see core.OpenAPIPackage#getSecuritySchema_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see core.OpenAPIPackage#getSecuritySchema_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * The literals are from the enumeration {@link core.APIKeyLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see core.APIKeyLocation
	 * @see #setLocation(APIKeyLocation)
	 * @see core.OpenAPIPackage#getSecuritySchema_Location()
	 * @model
	 * @generated
	 */
	APIKeyLocation getLocation();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see core.APIKeyLocation
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(APIKeyLocation value);

	/**
	 * Returns the value of the '<em><b>Flow</b></em>' attribute.
	 * The literals are from the enumeration {@link core.OAuth2FlowType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flow</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flow</em>' attribute.
	 * @see core.OAuth2FlowType
	 * @see #setFlow(OAuth2FlowType)
	 * @see core.OpenAPIPackage#getSecuritySchema_Flow()
	 * @model
	 * @generated
	 */
	OAuth2FlowType getFlow();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getFlow <em>Flow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flow</em>' attribute.
	 * @see core.OAuth2FlowType
	 * @see #getFlow()
	 * @generated
	 */
	void setFlow(OAuth2FlowType value);

	/**
	 * Returns the value of the '<em><b>Authorization Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Url</em>' attribute.
	 * @see #setAuthorizationUrl(String)
	 * @see core.OpenAPIPackage#getSecuritySchema_AuthorizationUrl()
	 * @model
	 * @generated
	 */
	String getAuthorizationUrl();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getAuthorizationUrl <em>Authorization Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorization Url</em>' attribute.
	 * @see #getAuthorizationUrl()
	 * @generated
	 */
	void setAuthorizationUrl(String value);

	/**
	 * Returns the value of the '<em><b>Token Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Token Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token Url</em>' attribute.
	 * @see #setTokenUrl(String)
	 * @see core.OpenAPIPackage#getSecuritySchema_TokenUrl()
	 * @model
	 * @generated
	 */
	String getTokenUrl();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getTokenUrl <em>Token Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token Url</em>' attribute.
	 * @see #getTokenUrl()
	 * @generated
	 */
	void setTokenUrl(String value);

	/**
	 * Returns the value of the '<em><b>Global Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Global Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Global Name</em>' attribute.
	 * @see #setGlobalName(String)
	 * @see core.OpenAPIPackage#getSecuritySchema_GlobalName()
	 * @model
	 * @generated
	 */
	String getGlobalName();

	/**
	 * Sets the value of the '{@link core.SecuritySchema#getGlobalName <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Global Name</em>' attribute.
	 * @see #getGlobalName()
	 * @generated
	 */
	void setGlobalName(String value);

	/**
	 * Returns the value of the '<em><b>Scopes</b></em>' containment reference list.
	 * The list contents are of type {@link core.SecurityScope}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scopes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scopes</em>' containment reference list.
	 * @see core.OpenAPIPackage#getSecuritySchema_Scopes()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecurityScope> getScopes();

} // SecuritySchema
