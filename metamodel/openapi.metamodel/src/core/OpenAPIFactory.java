/**
 */
package core;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see core.OpenAPIPackage
 * @generated
 */
public interface OpenAPIFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OpenAPIFactory eINSTANCE = core.impl.OpenAPIFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root</em>'.
	 * @generated
	 */
	Root createRoot();

	/**
	 * Returns a new object of class '<em>API</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>API</em>'.
	 * @generated
	 */
	API createAPI();

	/**
	 * Returns a new object of class '<em>Info</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Info</em>'.
	 * @generated
	 */
	Info createInfo();

	/**
	 * Returns a new object of class '<em>Contact</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Contact</em>'.
	 * @generated
	 */
	Contact createContact();

	/**
	 * Returns a new object of class '<em>License</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>License</em>'.
	 * @generated
	 */
	License createLicense();

	/**
	 * Returns a new object of class '<em>Path</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Path</em>'.
	 * @generated
	 */
	Path createPath();

	/**
	 * Returns a new object of class '<em>Operation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Operation</em>'.
	 * @generated
	 */
	Operation createOperation();

	/**
	 * Returns a new object of class '<em>External Docs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>External Docs</em>'.
	 * @generated
	 */
	ExternalDocs createExternalDocs();

	/**
	 * Returns a new object of class '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Parameter</em>'.
	 * @generated
	 */
	Parameter createParameter();

	/**
	 * Returns a new object of class '<em>Items Definition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Items Definition</em>'.
	 * @generated
	 */
	ItemsDefinition createItemsDefinition();

	/**
	 * Returns a new object of class '<em>Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Schema</em>'.
	 * @generated
	 */
	Schema createSchema();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Header</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Header</em>'.
	 * @generated
	 */
	Header createHeader();

	/**
	 * Returns a new object of class '<em>Tag</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Tag</em>'.
	 * @generated
	 */
	Tag createTag();

	/**
	 * Returns a new object of class '<em>Security Schema</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Schema</em>'.
	 * @generated
	 */
	SecuritySchema createSecuritySchema();

	/**
	 * Returns a new object of class '<em>Example</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Example</em>'.
	 * @generated
	 */
	Example createExample();

	/**
	 * Returns a new object of class '<em>XML Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>XML Element</em>'.
	 * @generated
	 */
	XMLElement createXMLElement();

	/**
	 * Returns a new object of class '<em>Security Scope</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Scope</em>'.
	 * @generated
	 */
	SecurityScope createSecurityScope();

	/**
	 * Returns a new object of class '<em>Security Requirement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Security Requirement</em>'.
	 * @generated
	 */
	SecurityRequirement createSecurityRequirement();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OpenAPIPackage getOpenAPIPackage();

} //OpenAPIFactory
