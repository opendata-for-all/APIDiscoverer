/**
 */
package core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Items</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Items#getType <em>Type</em>}</li>
 *   <li>{@link core.Items#getFormat <em>Format</em>}</li>
 *   <li>{@link core.Items#getItems <em>Items</em>}</li>
 *   <li>{@link core.Items#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link core.Items#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link core.Items#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link core.Items#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link core.Items#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link core.Items#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link core.Items#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link core.Items#getPattern <em>Pattern</em>}</li>
 *   <li>{@link core.Items#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link core.Items#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link core.Items#isUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link core.Items#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link core.Items#getDefault <em>Default</em>}</li>
 *   <li>{@link core.Items#getEnum <em>Enum</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getItems()
 * @model
 * @generated
 */
public interface Items extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link core.JsonDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see core.JsonDataType
	 * @see #setType(JsonDataType)
	 * @see core.CorePackage#getItems_Type()
	 * @model
	 * @generated
	 */
	JsonDataType getType();

	/**
	 * Sets the value of the '{@link core.Items#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see core.JsonDataType
	 * @see #getType()
	 * @generated
	 */
	void setType(JsonDataType value);

	/**
	 * Returns the value of the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Format</em>' attribute.
	 * @see #setFormat(String)
	 * @see core.CorePackage#getItems_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link core.Items#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Items</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference.
	 * @see #setItems(Items)
	 * @see core.CorePackage#getItems_Items()
	 * @model containment="true"
	 * @generated
	 */
	Items getItems();

	/**
	 * Sets the value of the '{@link core.Items#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Items value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link core.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see core.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see core.CorePackage#getItems_CollectionFormat()
	 * @model
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link core.Items#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see core.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

	/**
	 * Returns the value of the '<em><b>Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum</em>' attribute.
	 * @see #setMaximum(int)
	 * @see core.CorePackage#getItems_Maximum()
	 * @model
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link core.Items#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #setExclusiveMaximum(boolean)
	 * @see core.CorePackage#getItems_ExclusiveMaximum()
	 * @model
	 * @generated
	 */
	boolean isExclusiveMaximum();

	/**
	 * Sets the value of the '{@link core.Items#isExclusiveMaximum <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Maximum</em>' attribute.
	 * @see #isExclusiveMaximum()
	 * @generated
	 */
	void setExclusiveMaximum(boolean value);

	/**
	 * Returns the value of the '<em><b>Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum</em>' attribute.
	 * @see #setMinimum(int)
	 * @see core.CorePackage#getItems_Minimum()
	 * @model
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link core.Items#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

	/**
	 * Returns the value of the '<em><b>Exclusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusive Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #setExclusiveMinimum(boolean)
	 * @see core.CorePackage#getItems_ExclusiveMinimum()
	 * @model
	 * @generated
	 */
	boolean isExclusiveMinimum();

	/**
	 * Sets the value of the '{@link core.Items#isExclusiveMinimum <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exclusive Minimum</em>' attribute.
	 * @see #isExclusiveMinimum()
	 * @generated
	 */
	void setExclusiveMinimum(boolean value);

	/**
	 * Returns the value of the '<em><b>Max Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Length</em>' attribute.
	 * @see #setMaxLength(int)
	 * @see core.CorePackage#getItems_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link core.Items#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

	/**
	 * Returns the value of the '<em><b>Min Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Length</em>' attribute.
	 * @see #setMinLength(int)
	 * @see core.CorePackage#getItems_MinLength()
	 * @model
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link core.Items#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see core.CorePackage#getItems_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link core.Items#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Max Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Items</em>' attribute.
	 * @see #setMaxItems(int)
	 * @see core.CorePackage#getItems_MaxItems()
	 * @model
	 * @generated
	 */
	int getMaxItems();

	/**
	 * Sets the value of the '{@link core.Items#getMaxItems <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Items</em>' attribute.
	 * @see #getMaxItems()
	 * @generated
	 */
	void setMaxItems(int value);

	/**
	 * Returns the value of the '<em><b>Min Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Min Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Min Items</em>' attribute.
	 * @see #setMinItems(int)
	 * @see core.CorePackage#getItems_MinItems()
	 * @model
	 * @generated
	 */
	int getMinItems();

	/**
	 * Sets the value of the '{@link core.Items#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(int value);

	/**
	 * Returns the value of the '<em><b>Unique Items</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Items</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Items</em>' attribute.
	 * @see #setUniqueItems(boolean)
	 * @see core.CorePackage#getItems_UniqueItems()
	 * @model default="false"
	 * @generated
	 */
	boolean isUniqueItems();

	/**
	 * Sets the value of the '{@link core.Items#isUniqueItems <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Items</em>' attribute.
	 * @see #isUniqueItems()
	 * @generated
	 */
	void setUniqueItems(boolean value);

	/**
	 * Returns the value of the '<em><b>Multiple Of</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Of</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Of</em>' attribute.
	 * @see #setMultipleOf(int)
	 * @see core.CorePackage#getItems_MultipleOf()
	 * @model
	 * @generated
	 */
	int getMultipleOf();

	/**
	 * Sets the value of the '{@link core.Items#getMultipleOf <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Of</em>' attribute.
	 * @see #getMultipleOf()
	 * @generated
	 */
	void setMultipleOf(int value);

	/**
	 * Returns the value of the '<em><b>Default</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default</em>' attribute.
	 * @see #setDefault(String)
	 * @see core.CorePackage#getItems_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link core.Items#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Enum</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enum</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enum</em>' attribute list.
	 * @see core.CorePackage#getItems_Enum()
	 * @model
	 * @generated
	 */
	EList<String> getEnum();

} // Items
