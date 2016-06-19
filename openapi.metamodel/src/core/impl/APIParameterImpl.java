/**
 */
package core.impl;

import core.APIParameter;
import core.CollectionFormat;
import core.CorePackage;
import core.Items;
import core.JsonDataType;
import core.ParameterLocation;
import core.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.APIParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getIn <em>In</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#isRequired <em>Required</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getType <em>Type</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#isAllowEmplyValue <em>Allow Emply Value</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getItems <em>Items</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#isUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getSchema <em>Schema</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link core.impl.APIParameterImpl#getGlobalName <em>Global Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class APIParameterImpl extends MinimalEObjectImpl.Container implements APIParameter {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected static final ParameterLocation IN_EDEFAULT = ParameterLocation.QUERY;

	/**
	 * The cached value of the '{@link #getIn() <em>In</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIn()
	 * @generated
	 * @ordered
	 */
	protected ParameterLocation in = IN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REQUIRED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRequired()
	 * @generated
	 * @ordered
	 */
	protected boolean required = REQUIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final JsonDataType TYPE_EDEFAULT = JsonDataType.INTEGER;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected JsonDataType type = TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_EMPLY_VALUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowEmplyValue() <em>Allow Emply Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowEmplyValue()
	 * @generated
	 * @ordered
	 */
	protected boolean allowEmplyValue = ALLOW_EMPLY_VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Items items;

	/**
	 * The default value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected static final CollectionFormat COLLECTION_FORMAT_EDEFAULT = CollectionFormat.CSV;

	/**
	 * The cached value of the '{@link #getCollectionFormat() <em>Collection Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCollectionFormat()
	 * @generated
	 * @ordered
	 */
	protected CollectionFormat collectionFormat = COLLECTION_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected int maximum = MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_MAXIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveMaximum() <em>Exclusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveMaximum = EXCLUSIVE_MAXIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected int minimum = MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #isExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXCLUSIVE_MINIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExclusiveMinimum() <em>Exclusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExclusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected boolean exclusiveMinimum = EXCLUSIVE_MINIMUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxLength() <em>Max Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxLength()
	 * @generated
	 * @ordered
	 */
	protected int maxLength = MAX_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_LENGTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinLength() <em>Min Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinLength()
	 * @generated
	 * @ordered
	 */
	protected int minLength = MIN_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPattern() <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPattern()
	 * @generated
	 * @ordered
	 */
	protected String pattern = PATTERN_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxItems() <em>Max Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxItems()
	 * @generated
	 * @ordered
	 */
	protected int maxItems = MAX_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinItems() <em>Min Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinItems()
	 * @generated
	 * @ordered
	 */
	protected int minItems = MIN_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_ITEMS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueItems() <em>Unique Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItems()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueItems = UNIQUE_ITEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLE_OF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultipleOf() <em>Multiple Of</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOf()
	 * @generated
	 * @ordered
	 */
	protected int multipleOf = MULTIPLE_OF_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSchema() <em>Schema</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchema()
	 * @generated
	 * @ordered
	 */
	protected Schema schema;

	/**
	 * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnum() <em>Enum</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnum()
	 * @generated
	 * @ordered
	 */
	protected EList<String> enum_;

	/**
	 * The default value of the '{@link #getGlobalName() <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalName()
	 * @generated
	 * @ordered
	 */
	protected static final String GLOBAL_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGlobalName() <em>Global Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlobalName()
	 * @generated
	 * @ordered
	 */
	protected String globalName = GLOBAL_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.API_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterLocation getIn() {
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIn(ParameterLocation newIn) {
		ParameterLocation oldIn = in;
		in = newIn == null ? IN_EDEFAULT : newIn;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__IN, oldIn, in));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(boolean newRequired) {
		boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JsonDataType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(JsonDataType newType) {
		JsonDataType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowEmplyValue() {
		return allowEmplyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowEmplyValue(boolean newAllowEmplyValue) {
		boolean oldAllowEmplyValue = allowEmplyValue;
		allowEmplyValue = newAllowEmplyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE, oldAllowEmplyValue, allowEmplyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Items getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(Items newItems, NotificationChain msgs) {
		Items oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__ITEMS, oldItems, newItems);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(Items newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.API_PARAMETER__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.API_PARAMETER__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionFormat getCollectionFormat() {
		return collectionFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCollectionFormat(CollectionFormat newCollectionFormat) {
		CollectionFormat oldCollectionFormat = collectionFormat;
		collectionFormat = newCollectionFormat == null ? COLLECTION_FORMAT_EDEFAULT : newCollectionFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximum() {
		return maximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(int newMaximum) {
		int oldMaximum = maximum;
		maximum = newMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveMaximum() {
		return exclusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMaximum(boolean newExclusiveMaximum) {
		boolean oldExclusiveMaximum = exclusiveMaximum;
		exclusiveMaximum = newExclusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimum() {
		return minimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(int newMinimum) {
		int oldMinimum = minimum;
		minimum = newMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MINIMUM, oldMinimum, minimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExclusiveMinimum() {
		return exclusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExclusiveMinimum(boolean newExclusiveMinimum) {
		boolean oldExclusiveMinimum = exclusiveMinimum;
		exclusiveMinimum = newExclusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxLength() {
		return maxLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxLength(int newMaxLength) {
		int oldMaxLength = maxLength;
		maxLength = newMaxLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MAX_LENGTH, oldMaxLength, maxLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinLength() {
		return minLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinLength(int newMinLength) {
		int oldMinLength = minLength;
		minLength = newMinLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MIN_LENGTH, oldMinLength, minLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPattern() {
		return pattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPattern(String newPattern) {
		String oldPattern = pattern;
		pattern = newPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxItems() {
		return maxItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxItems(int newMaxItems) {
		int oldMaxItems = maxItems;
		maxItems = newMaxItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MAX_ITEMS, oldMaxItems, maxItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinItems() {
		return minItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinItems(int newMinItems) {
		int oldMinItems = minItems;
		minItems = newMinItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MIN_ITEMS, oldMinItems, minItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueItems() {
		return uniqueItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueItems(boolean newUniqueItems) {
		boolean oldUniqueItems = uniqueItems;
		uniqueItems = newUniqueItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultipleOf() {
		return multipleOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleOf(int newMultipleOf) {
		int oldMultipleOf = multipleOf;
		multipleOf = newMultipleOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__MULTIPLE_OF, oldMultipleOf, multipleOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getSchema() {
		if (schema != null && schema.eIsProxy()) {
			InternalEObject oldSchema = (InternalEObject)schema;
			schema = (Schema)eResolveProxy(oldSchema);
			if (schema != oldSchema) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.API_PARAMETER__SCHEMA, oldSchema, schema));
			}
		}
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetSchema() {
		return schema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchema(Schema newSchema) {
		Schema oldSchema = schema;
		schema = newSchema;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__SCHEMA, oldSchema, schema));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(String newDefault) {
		String oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.API_PARAMETER__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGlobalName() {
		return globalName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlobalName(String newGlobalName) {
		String oldGlobalName = globalName;
		globalName = newGlobalName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.API_PARAMETER__GLOBAL_NAME, oldGlobalName, globalName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.API_PARAMETER__ITEMS:
				return basicSetItems(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.API_PARAMETER__NAME:
				return getName();
			case CorePackage.API_PARAMETER__IN:
				return getIn();
			case CorePackage.API_PARAMETER__DESCRIPTION:
				return getDescription();
			case CorePackage.API_PARAMETER__REQUIRED:
				return isRequired();
			case CorePackage.API_PARAMETER__TYPE:
				return getType();
			case CorePackage.API_PARAMETER__FORMAT:
				return getFormat();
			case CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE:
				return isAllowEmplyValue();
			case CorePackage.API_PARAMETER__ITEMS:
				return getItems();
			case CorePackage.API_PARAMETER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case CorePackage.API_PARAMETER__MAXIMUM:
				return getMaximum();
			case CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM:
				return isExclusiveMaximum();
			case CorePackage.API_PARAMETER__MINIMUM:
				return getMinimum();
			case CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM:
				return isExclusiveMinimum();
			case CorePackage.API_PARAMETER__MAX_LENGTH:
				return getMaxLength();
			case CorePackage.API_PARAMETER__MIN_LENGTH:
				return getMinLength();
			case CorePackage.API_PARAMETER__PATTERN:
				return getPattern();
			case CorePackage.API_PARAMETER__MAX_ITEMS:
				return getMaxItems();
			case CorePackage.API_PARAMETER__MIN_ITEMS:
				return getMinItems();
			case CorePackage.API_PARAMETER__UNIQUE_ITEMS:
				return isUniqueItems();
			case CorePackage.API_PARAMETER__MULTIPLE_OF:
				return getMultipleOf();
			case CorePackage.API_PARAMETER__SCHEMA:
				if (resolve) return getSchema();
				return basicGetSchema();
			case CorePackage.API_PARAMETER__DEFAULT:
				return getDefault();
			case CorePackage.API_PARAMETER__ENUM:
				return getEnum();
			case CorePackage.API_PARAMETER__GLOBAL_NAME:
				return getGlobalName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CorePackage.API_PARAMETER__NAME:
				setName((String)newValue);
				return;
			case CorePackage.API_PARAMETER__IN:
				setIn((ParameterLocation)newValue);
				return;
			case CorePackage.API_PARAMETER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.API_PARAMETER__REQUIRED:
				setRequired((Boolean)newValue);
				return;
			case CorePackage.API_PARAMETER__TYPE:
				setType((JsonDataType)newValue);
				return;
			case CorePackage.API_PARAMETER__FORMAT:
				setFormat((String)newValue);
				return;
			case CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue((Boolean)newValue);
				return;
			case CorePackage.API_PARAMETER__ITEMS:
				setItems((Items)newValue);
				return;
			case CorePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case CorePackage.API_PARAMETER__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case CorePackage.API_PARAMETER__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case CorePackage.API_PARAMETER__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__PATTERN:
				setPattern((String)newValue);
				return;
			case CorePackage.API_PARAMETER__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case CorePackage.API_PARAMETER__MULTIPLE_OF:
				setMultipleOf((Integer)newValue);
				return;
			case CorePackage.API_PARAMETER__SCHEMA:
				setSchema((Schema)newValue);
				return;
			case CorePackage.API_PARAMETER__DEFAULT:
				setDefault((String)newValue);
				return;
			case CorePackage.API_PARAMETER__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.API_PARAMETER__GLOBAL_NAME:
				setGlobalName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CorePackage.API_PARAMETER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__IN:
				setIn(IN_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE:
				setAllowEmplyValue(ALLOW_EMPLY_VALUE_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__ITEMS:
				setItems((Items)null);
				return;
			case CorePackage.API_PARAMETER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__SCHEMA:
				setSchema((Schema)null);
				return;
			case CorePackage.API_PARAMETER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case CorePackage.API_PARAMETER__ENUM:
				getEnum().clear();
				return;
			case CorePackage.API_PARAMETER__GLOBAL_NAME:
				setGlobalName(GLOBAL_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CorePackage.API_PARAMETER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.API_PARAMETER__IN:
				return in != IN_EDEFAULT;
			case CorePackage.API_PARAMETER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.API_PARAMETER__REQUIRED:
				return required != REQUIRED_EDEFAULT;
			case CorePackage.API_PARAMETER__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.API_PARAMETER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case CorePackage.API_PARAMETER__ALLOW_EMPLY_VALUE:
				return allowEmplyValue != ALLOW_EMPLY_VALUE_EDEFAULT;
			case CorePackage.API_PARAMETER__ITEMS:
				return items != null;
			case CorePackage.API_PARAMETER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case CorePackage.API_PARAMETER__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MAXIMUM:
				return exclusiveMaximum != EXCLUSIVE_MAXIMUM_EDEFAULT;
			case CorePackage.API_PARAMETER__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case CorePackage.API_PARAMETER__EXCLUSIVE_MINIMUM:
				return exclusiveMinimum != EXCLUSIVE_MINIMUM_EDEFAULT;
			case CorePackage.API_PARAMETER__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case CorePackage.API_PARAMETER__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case CorePackage.API_PARAMETER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CorePackage.API_PARAMETER__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorePackage.API_PARAMETER__MIN_ITEMS:
				return minItems != MIN_ITEMS_EDEFAULT;
			case CorePackage.API_PARAMETER__UNIQUE_ITEMS:
				return uniqueItems != UNIQUE_ITEMS_EDEFAULT;
			case CorePackage.API_PARAMETER__MULTIPLE_OF:
				return multipleOf != MULTIPLE_OF_EDEFAULT;
			case CorePackage.API_PARAMETER__SCHEMA:
				return schema != null;
			case CorePackage.API_PARAMETER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case CorePackage.API_PARAMETER__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case CorePackage.API_PARAMETER__GLOBAL_NAME:
				return GLOBAL_NAME_EDEFAULT == null ? globalName != null : !GLOBAL_NAME_EDEFAULT.equals(globalName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", in: ");
		result.append(in);
		result.append(", description: ");
		result.append(description);
		result.append(", required: ");
		result.append(required);
		result.append(", type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(", allowEmplyValue: ");
		result.append(allowEmplyValue);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", exclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", default: ");
		result.append(default_);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", globalName: ");
		result.append(globalName);
		result.append(')');
		return result.toString();
	}

} //APIParameterImpl
