/**
 */
package som.swagger.core;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link som.swagger.core.Header#getDescription <em>Description</em>}</li>
 *   <li>{@link som.swagger.core.Header#getType <em>Type</em>}</li>
 *   <li>{@link som.swagger.core.Header#getFormat <em>Format</em>}</li>
 *   <li>{@link som.swagger.core.Header#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link som.swagger.core.Header#getItems <em>Items</em>}</li>
 *   <li>{@link som.swagger.core.Header#getDefault <em>Default</em>}</li>
 *   <li>{@link som.swagger.core.Header#isExlusiveMinimum <em>Exlusive Minimum</em>}</li>
 *   <li>{@link som.swagger.core.Header#getEnum <em>Enum</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMaxIntems <em>Max Intems</em>}</li>
 *   <li>{@link som.swagger.core.Header#isUniqueItem <em>Unique Item</em>}</li>
 *   <li>{@link som.swagger.core.Header#getPattern <em>Pattern</em>}</li>
 *   <li>{@link som.swagger.core.Header#isExlusiveMaximum <em>Exlusive Maximum</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link som.swagger.core.Header#getMultipleOF <em>Multiple OF</em>}</li>
 * </ul>
 *
 * @see som.swagger.core.CorePackage#getHeader()
 * @model
 * @generated
 */
public interface Header extends EObject {
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
	 * @see som.swagger.core.CorePackage#getHeader_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link som.swagger.core.JsonDataType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see som.swagger.core.JsonDataType
	 * @see #setType(JsonDataType)
	 * @see som.swagger.core.CorePackage#getHeader_Type()
	 * @model
	 * @generated
	 */
	JsonDataType getType();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see som.swagger.core.JsonDataType
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
	 * @see som.swagger.core.CorePackage#getHeader_Format()
	 * @model
	 * @generated
	 */
	String getFormat();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getFormat <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Format</em>' attribute.
	 * @see #getFormat()
	 * @generated
	 */
	void setFormat(String value);

	/**
	 * Returns the value of the '<em><b>Collection Format</b></em>' attribute.
	 * The literals are from the enumeration {@link som.swagger.core.CollectionFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Collection Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Collection Format</em>' attribute.
	 * @see som.swagger.core.CollectionFormat
	 * @see #setCollectionFormat(CollectionFormat)
	 * @see som.swagger.core.CorePackage#getHeader_CollectionFormat()
	 * @model
	 * @generated
	 */
	CollectionFormat getCollectionFormat();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getCollectionFormat <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Collection Format</em>' attribute.
	 * @see som.swagger.core.CollectionFormat
	 * @see #getCollectionFormat()
	 * @generated
	 */
	void setCollectionFormat(CollectionFormat value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Items()
	 * @model containment="true"
	 * @generated
	 */
	Items getItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getItems <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Items</em>' containment reference.
	 * @see #getItems()
	 * @generated
	 */
	void setItems(Items value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Default()
	 * @model
	 * @generated
	 */
	String getDefault();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getDefault <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default</em>' attribute.
	 * @see #getDefault()
	 * @generated
	 */
	void setDefault(String value);

	/**
	 * Returns the value of the '<em><b>Exlusive Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exlusive Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exlusive Minimum</em>' attribute.
	 * @see #setExlusiveMinimum(boolean)
	 * @see som.swagger.core.CorePackage#getHeader_ExlusiveMinimum()
	 * @model
	 * @generated
	 */
	boolean isExlusiveMinimum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#isExlusiveMinimum <em>Exlusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exlusive Minimum</em>' attribute.
	 * @see #isExlusiveMinimum()
	 * @generated
	 */
	void setExlusiveMinimum(boolean value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Enum()
	 * @model
	 * @generated
	 */
	EList<String> getEnum();

	/**
	 * Returns the value of the '<em><b>Max Intems</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Max Intems</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max Intems</em>' attribute.
	 * @see #setMaxIntems(int)
	 * @see som.swagger.core.CorePackage#getHeader_MaxIntems()
	 * @model
	 * @generated
	 */
	int getMaxIntems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMaxIntems <em>Max Intems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Intems</em>' attribute.
	 * @see #getMaxIntems()
	 * @generated
	 */
	void setMaxIntems(int value);

	/**
	 * Returns the value of the '<em><b>Unique Item</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique Item</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique Item</em>' attribute.
	 * @see #setUniqueItem(boolean)
	 * @see som.swagger.core.CorePackage#getHeader_UniqueItem()
	 * @model
	 * @generated
	 */
	boolean isUniqueItem();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#isUniqueItem <em>Unique Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique Item</em>' attribute.
	 * @see #isUniqueItem()
	 * @generated
	 */
	void setUniqueItem(boolean value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Exlusive Maximum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exlusive Maximum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exlusive Maximum</em>' attribute.
	 * @see #setExlusiveMaximum(boolean)
	 * @see som.swagger.core.CorePackage#getHeader_ExlusiveMaximum()
	 * @model
	 * @generated
	 */
	boolean isExlusiveMaximum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#isExlusiveMaximum <em>Exlusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exlusive Maximum</em>' attribute.
	 * @see #isExlusiveMaximum()
	 * @generated
	 */
	void setExlusiveMaximum(boolean value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Minimum()
	 * @model
	 * @generated
	 */
	int getMinimum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMinimum <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum</em>' attribute.
	 * @see #getMinimum()
	 * @generated
	 */
	void setMinimum(int value);

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
	 * @see som.swagger.core.CorePackage#getHeader_MinLength()
	 * @model
	 * @generated
	 */
	int getMinLength();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMinLength <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Length</em>' attribute.
	 * @see #getMinLength()
	 * @generated
	 */
	void setMinLength(int value);

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
	 * @see som.swagger.core.CorePackage#getHeader_MaxLength()
	 * @model
	 * @generated
	 */
	int getMaxLength();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMaxLength <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Max Length</em>' attribute.
	 * @see #getMaxLength()
	 * @generated
	 */
	void setMaxLength(int value);

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
	 * @see som.swagger.core.CorePackage#getHeader_MinItems()
	 * @model
	 * @generated
	 */
	int getMinItems();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMinItems <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Items</em>' attribute.
	 * @see #getMinItems()
	 * @generated
	 */
	void setMinItems(int value);

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
	 * @see som.swagger.core.CorePackage#getHeader_Maximum()
	 * @model
	 * @generated
	 */
	int getMaximum();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMaximum <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum</em>' attribute.
	 * @see #getMaximum()
	 * @generated
	 */
	void setMaximum(int value);

	/**
	 * Returns the value of the '<em><b>Multiple OF</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple OF</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple OF</em>' attribute.
	 * @see #setMultipleOF(int)
	 * @see som.swagger.core.CorePackage#getHeader_MultipleOF()
	 * @model
	 * @generated
	 */
	int getMultipleOF();

	/**
	 * Sets the value of the '{@link som.swagger.core.Header#getMultipleOF <em>Multiple OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple OF</em>' attribute.
	 * @see #getMultipleOF()
	 * @generated
	 */
	void setMultipleOF(int value);

} // Header
