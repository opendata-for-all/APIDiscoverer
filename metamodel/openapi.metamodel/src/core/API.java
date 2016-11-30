/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.API#getSwagger <em>Swagger</em>}</li>
 *   <li>{@link core.API#getInfo <em>Info</em>}</li>
 *   <li>{@link core.API#getHost <em>Host</em>}</li>
 *   <li>{@link core.API#getBasePath <em>Base Path</em>}</li>
 *   <li>{@link core.API#getSchemes <em>Schemes</em>}</li>
 *   <li>{@link core.API#getConsumes <em>Consumes</em>}</li>
 *   <li>{@link core.API#getProduces <em>Produces</em>}</li>
 *   <li>{@link core.API#getPaths <em>Paths</em>}</li>
 *   <li>{@link core.API#getDefinitions <em>Definitions</em>}</li>
 *   <li>{@link core.API#getResponses <em>Responses</em>}</li>
 *   <li>{@link core.API#getSecurityDefinitions <em>Security Definitions</em>}</li>
 *   <li>{@link core.API#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getAPI()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='requiredSwaggerVersion correctSwaggerVersion requiredInfoReference requiredPaths'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL requiredSwaggerVersion='not self.swagger.oclIsUndefined()' requiredInfoReference='not self.info.oclIsUndefined()' correctSwaggerVersion='self.swagger = \'2.0\'' requiredPaths='pathsIsSet()'"
 *        extendedMetaData="name='API'"
 * @generated
 */
public interface API extends ParamterDeclaringContext, ResponseContext, SchemaDeclaringContext, JSONPointer, SecurityContext, ParameterContext, ExternalDocsContext {
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
	 * @see core.CorePackage#getAPI_Swagger()
	 * @model
	 * @generated
	 */
	String getSwagger();

	/**
	 * Sets the value of the '{@link core.API#getSwagger <em>Swagger</em>}' attribute.
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
	 * @see core.CorePackage#getAPI_Info()
	 * @model containment="true"
	 * @generated
	 */
	Info getInfo();

	/**
	 * Sets the value of the '{@link core.API#getInfo <em>Info</em>}' containment reference.
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
	 * @see core.CorePackage#getAPI_Host()
	 * @model
	 * @generated
	 */
	String getHost();

	/**
	 * Sets the value of the '{@link core.API#getHost <em>Host</em>}' attribute.
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
	 * @see core.CorePackage#getAPI_BasePath()
	 * @model
	 * @generated
	 */
	String getBasePath();

	/**
	 * Sets the value of the '{@link core.API#getBasePath <em>Base Path</em>}' attribute.
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
	 * @see core.CorePackage#getAPI_Schemes()
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
	 * @see core.CorePackage#getAPI_Consumes()
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
	 * @see core.CorePackage#getAPI_Produces()
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
	 * @see #isSetPaths()
	 * @see #unsetPaths()
	 * @see core.CorePackage#getAPI_Paths()
	 * @model containment="true" unsettable="true"
	 * @generated
	 */
	EList<Path> getPaths();

	/**
	 * Unsets the value of the '{@link core.API#getPaths <em>Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	void unsetPaths();

	/**
	 * Returns whether the value of the '{@link core.API#getPaths <em>Paths</em>}' containment reference list is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Paths</em>' containment reference list is set.
	 * @see #unsetPaths()
	 * @see #getPaths()
	 * @generated
	 */
	boolean isSetPaths();

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference list.
	 * The list contents are of type {@link core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference list.
	 * @see core.CorePackage#getAPI_Definitions()
	 * @model
	 * @generated
	 */
	EList<Schema> getDefinitions();

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
	 * @see core.CorePackage#getAPI_Responses()
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
	 * @see core.CorePackage#getAPI_SecurityDefinitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<SecuritySchema> getSecurityDefinitions();

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference list.
	 * The list contents are of type {@link core.Tag}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tags</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference list.
	 * @see core.CorePackage#getAPI_Tags()
	 * @model containment="true"
	 * @generated
	 */
	EList<Tag> getTags();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='return \"#\";'"
	 * @generated
	 */
	String getRef();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='return pathsIsSet();'"
	 * @generated
	 */
	boolean pathsIsSet();

} // API
