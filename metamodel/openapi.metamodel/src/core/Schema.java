/**
 */
package core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Schema#getName <em>Name</em>}</li>
 *   <li>{@link core.Schema#getTitle <em>Title</em>}</li>
 *   <li>{@link core.Schema#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link core.Schema#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link core.Schema#getRequired <em>Required</em>}</li>
 *   <li>{@link core.Schema#getExample <em>Example</em>}</li>
 *   <li>{@link core.Schema#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link core.Schema#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link core.Schema#getProperties <em>Properties</em>}</li>
 *   <li>{@link core.Schema#getAllOf <em>All Of</em>}</li>
 *   <li>{@link core.Schema#getItems <em>Items</em>}</li>
 *   <li>{@link core.Schema#getXml <em>Xml</em>}</li>
 *   <li>{@link core.Schema#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link core.Schema#getDeclaringContext <em>Declaring Context</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getSchema()
 * @model
 * @generated
 */
public interface Schema extends JSONSchemaSubset, SchemaDeclaringContext, JSONPointer, ExternalDocsContext {
	/**
	 * Returns the value of the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' attribute.
	 * @see #setTitle(String)
	 * @see core.CorePackage#getSchema_Title()
	 * @model
	 * @generated
	 */
	String getTitle();

	/**
	 * Sets the value of the '{@link core.Schema#getTitle <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' attribute.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(String value);

	/**
	 * Returns the value of the '<em><b>Max Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Properties</em>' attribute.
	 * @see #setMaxProperties(Integer)
	 * @see core.CorePackage#getSchema_MaxProperties()
	 * @model
	 * @generated
	 */
	Integer getMaxProperties();

	/**
	 * Sets the value of the '{@link core.Schema#getMaxProperties <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Properties</em>' attribute.
	 * @see #getMaxProperties()
	 * @generated
	 */
	void setMaxProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Min Properties</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Properties</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Properties</em>' attribute.
	 * @see #setMinProperties(Integer)
	 * @see core.CorePackage#getSchema_MinProperties()
	 * @model
	 * @generated
	 */
	Integer getMinProperties();

	/**
	 * Sets the value of the '{@link core.Schema#getMinProperties <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Properties</em>' attribute.
	 * @see #getMinProperties()
	 * @generated
	 */
	void setMinProperties(Integer value);

	/**
	 * Returns the value of the '<em><b>Required</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Required</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' attribute list.
	 * @see core.CorePackage#getSchema_Required()
	 * @model
	 * @generated
	 */
	EList<String> getRequired();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see core.CorePackage#getSchema_Properties()
	 * @model
	 * @generated
	 */
	EList<Schema> getProperties();

	/**
	 * Returns the value of the '<em><b>Example</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Example</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Example</em>' attribute.
	 * @see #setExample(String)
	 * @see core.CorePackage#getSchema_Example()
	 * @model
	 * @generated
	 */
	String getExample();

	/**
	 * Sets the value of the '{@link core.Schema#getExample <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Example</em>' attribute.
	 * @see #getExample()
	 * @generated
	 */
	void setExample(String value);

	/**
	 * Returns the value of the '<em><b>All Of</b></em>' reference list.
	 * The list contents are of type {@link core.Schema}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Of</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Of</em>' reference list.
	 * @see core.CorePackage#getSchema_AllOf()
	 * @model
	 * @generated
	 */
	EList<Schema> getAllOf();

	/**
	 * Returns the value of the '<em><b>Items</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' reference.
	 * @see #setItems(Schema)
	 * @see core.CorePackage#getSchema_Items()
	 * @model
	 * @generated
	 */
	Schema getItems();

	/**
	 * Sets the value of the '{@link core.Schema#getItems <em>Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Schema value);

	/**
	 * Returns the value of the '<em><b>Additonal Properties</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additonal Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additonal Properties</em>' reference.
	 * @see #setAdditonalProperties(Schema)
	 * @see core.CorePackage#getSchema_AdditonalProperties()
	 * @model
	 * @generated
	 */
	Schema getAdditonalProperties();

	/**
	 * Sets the value of the '{@link core.Schema#getAdditonalProperties <em>Additonal Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additonal Properties</em>' reference.
	 * @see #getAdditonalProperties()
	 * @generated
	 */
	void setAdditonalProperties(Schema value);

	/**
	 * Returns the value of the '<em><b>Discriminator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discriminator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discriminator</em>' attribute.
	 * @see #setDiscriminator(String)
	 * @see core.CorePackage#getSchema_Discriminator()
	 * @model
	 * @generated
	 */
	String getDiscriminator();

	/**
	 * Sets the value of the '{@link core.Schema#getDiscriminator <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discriminator</em>' attribute.
	 * @see #getDiscriminator()
	 * @generated
	 */
	void setDiscriminator(String value);

	/**
	 * Returns the value of the '<em><b>Read Only</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Read Only</em>' attribute.
	 * @see #setReadOnly(Boolean)
	 * @see core.CorePackage#getSchema_ReadOnly()
	 * @model
	 * @generated
	 */
	Boolean getReadOnly();

	/**
	 * Sets the value of the '{@link core.Schema#getReadOnly <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Read Only</em>' attribute.
	 * @see #getReadOnly()
	 * @generated
	 */
	void setReadOnly(Boolean value);

	/**
	 * Returns the value of the '<em><b>Xml</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Xml</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xml</em>' containment reference.
	 * @see #setXml(XMLElement)
	 * @see core.CorePackage#getSchema_Xml()
	 * @model containment="true"
	 * @generated
	 */
	XMLElement getXml();

	/**
	 * Sets the value of the '{@link core.Schema#getXml <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xml</em>' containment reference.
	 * @see #getXml()
	 * @generated
	 */
	void setXml(XMLElement value);

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
	 * @see core.CorePackage#getSchema_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link core.Schema#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Declaring Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaring Context</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaring Context</em>' reference.
	 * @see #setDeclaringContext(SchemaDeclaringContext)
	 * @see core.CorePackage#getSchema_DeclaringContext()
	 * @model
	 * @generated
	 */
	SchemaDeclaringContext getDeclaringContext();

	/**
	 * Sets the value of the '{@link core.Schema#getDeclaringContext <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaring Context</em>' reference.
	 * @see #getDeclaringContext()
	 * @generated
	 */
	void setDeclaringContext(SchemaDeclaringContext value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel body='if (getDeclaringContext() instanceof core.API) {\r\n\treturn ((core.API) getDeclaringContext()).getRef() + \"/definitions/\" + getName();\r\n\t} else if (getDeclaringContext() instanceof Schema) {\r\nSchema context = (Schema) getDeclaringContext();\t\r\nif (context.getProperties().contains(this))\r\n\treturn context.getRef() + \"/properties/\" + getName();\r\nelse if (context.getItems().equals(this))\r\n\treturn context.getRef() + \"/items\";\r\nelse if (context.getAdditonalProperties().equals(this))\r\n\treturn context.getRef() + \"/additionalProperties\";\r\n\t\t\t}\r\n\treturn \"\";'"
	 * @generated
	 */
	String getRef();

} // Schema
