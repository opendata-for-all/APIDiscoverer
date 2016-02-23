/**
 */
package som.swagger.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import som.swagger.core.CollectionFormat;
import som.swagger.core.CorePackage;
import som.swagger.core.Header;
import som.swagger.core.Items;
import som.swagger.core.JsonDataType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Header</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getType <em>Type</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getCollectionFormat <em>Collection Format</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getItems <em>Items</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#isExlusiveMinimum <em>Exlusive Minimum</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMaxIntems <em>Max Intems</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#isUniqueItem <em>Unique Item</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#isExlusiveMaximum <em>Exlusive Maximum</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link som.swagger.core.impl.HeaderImpl#getMultipleOF <em>Multiple OF</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HeaderImpl extends MinimalEObjectImpl.Container implements Header {
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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Items items;

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
	 * The default value of the '{@link #isExlusiveMinimum() <em>Exlusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExlusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXLUSIVE_MINIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExlusiveMinimum() <em>Exlusive Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExlusiveMinimum()
	 * @generated
	 * @ordered
	 */
	protected boolean exlusiveMinimum = EXLUSIVE_MINIMUM_EDEFAULT;

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
	 * The default value of the '{@link #getMaxIntems() <em>Max Intems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIntems()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_INTEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxIntems() <em>Max Intems</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxIntems()
	 * @generated
	 * @ordered
	 */
	protected int maxIntems = MAX_INTEMS_EDEFAULT;

	/**
	 * The default value of the '{@link #isUniqueItem() <em>Unique Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItem()
	 * @generated
	 * @ordered
	 */
	protected static final boolean UNIQUE_ITEM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUniqueItem() <em>Unique Item</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUniqueItem()
	 * @generated
	 * @ordered
	 */
	protected boolean uniqueItem = UNIQUE_ITEM_EDEFAULT;

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
	 * The default value of the '{@link #isExlusiveMaximum() <em>Exlusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExlusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EXLUSIVE_MAXIMUM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExlusiveMaximum() <em>Exlusive Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExlusiveMaximum()
	 * @generated
	 * @ordered
	 */
	protected boolean exlusiveMaximum = EXLUSIVE_MAXIMUM_EDEFAULT;

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
	 * The default value of the '{@link #getMultipleOF() <em>Multiple OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOF()
	 * @generated
	 * @ordered
	 */
	protected static final int MULTIPLE_OF_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMultipleOF() <em>Multiple OF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleOF()
	 * @generated
	 * @ordered
	 */
	protected int multipleOF = MULTIPLE_OF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HeaderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.HEADER;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__TYPE, oldType, type));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__FORMAT, oldFormat, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__COLLECTION_FORMAT, oldCollectionFormat, collectionFormat));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__ITEMS, oldItems, newItems);
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
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.HEADER__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.HEADER__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__ITEMS, newItems, newItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExlusiveMinimum() {
		return exlusiveMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExlusiveMinimum(boolean newExlusiveMinimum) {
		boolean oldExlusiveMinimum = exlusiveMinimum;
		exlusiveMinimum = newExlusiveMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__EXLUSIVE_MINIMUM, oldExlusiveMinimum, exlusiveMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.HEADER__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxIntems() {
		return maxIntems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxIntems(int newMaxIntems) {
		int oldMaxIntems = maxIntems;
		maxIntems = newMaxIntems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MAX_INTEMS, oldMaxIntems, maxIntems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUniqueItem() {
		return uniqueItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueItem(boolean newUniqueItem) {
		boolean oldUniqueItem = uniqueItem;
		uniqueItem = newUniqueItem;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__UNIQUE_ITEM, oldUniqueItem, uniqueItem));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExlusiveMaximum() {
		return exlusiveMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExlusiveMaximum(boolean newExlusiveMaximum) {
		boolean oldExlusiveMaximum = exlusiveMaximum;
		exlusiveMaximum = newExlusiveMaximum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__EXLUSIVE_MAXIMUM, oldExlusiveMaximum, exlusiveMaximum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MIN_LENGTH, oldMinLength, minLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MIN_ITEMS, oldMinItems, minItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MAXIMUM, oldMaximum, maximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMultipleOF() {
		return multipleOF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleOF(int newMultipleOF) {
		int oldMultipleOF = multipleOF;
		multipleOF = newMultipleOF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.HEADER__MULTIPLE_OF, oldMultipleOF, multipleOF));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.HEADER__ITEMS:
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
			case CorePackage.HEADER__DESCRIPTION:
				return getDescription();
			case CorePackage.HEADER__TYPE:
				return getType();
			case CorePackage.HEADER__FORMAT:
				return getFormat();
			case CorePackage.HEADER__COLLECTION_FORMAT:
				return getCollectionFormat();
			case CorePackage.HEADER__ITEMS:
				return getItems();
			case CorePackage.HEADER__DEFAULT:
				return getDefault();
			case CorePackage.HEADER__EXLUSIVE_MINIMUM:
				return isExlusiveMinimum();
			case CorePackage.HEADER__ENUM:
				return getEnum();
			case CorePackage.HEADER__MAX_INTEMS:
				return getMaxIntems();
			case CorePackage.HEADER__UNIQUE_ITEM:
				return isUniqueItem();
			case CorePackage.HEADER__PATTERN:
				return getPattern();
			case CorePackage.HEADER__EXLUSIVE_MAXIMUM:
				return isExlusiveMaximum();
			case CorePackage.HEADER__MINIMUM:
				return getMinimum();
			case CorePackage.HEADER__MIN_LENGTH:
				return getMinLength();
			case CorePackage.HEADER__MAX_LENGTH:
				return getMaxLength();
			case CorePackage.HEADER__MIN_ITEMS:
				return getMinItems();
			case CorePackage.HEADER__MAXIMUM:
				return getMaximum();
			case CorePackage.HEADER__MULTIPLE_OF:
				return getMultipleOF();
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
			case CorePackage.HEADER__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.HEADER__TYPE:
				setType((JsonDataType)newValue);
				return;
			case CorePackage.HEADER__FORMAT:
				setFormat((String)newValue);
				return;
			case CorePackage.HEADER__COLLECTION_FORMAT:
				setCollectionFormat((CollectionFormat)newValue);
				return;
			case CorePackage.HEADER__ITEMS:
				setItems((Items)newValue);
				return;
			case CorePackage.HEADER__DEFAULT:
				setDefault((String)newValue);
				return;
			case CorePackage.HEADER__EXLUSIVE_MINIMUM:
				setExlusiveMinimum((Boolean)newValue);
				return;
			case CorePackage.HEADER__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.HEADER__MAX_INTEMS:
				setMaxIntems((Integer)newValue);
				return;
			case CorePackage.HEADER__UNIQUE_ITEM:
				setUniqueItem((Boolean)newValue);
				return;
			case CorePackage.HEADER__PATTERN:
				setPattern((String)newValue);
				return;
			case CorePackage.HEADER__EXLUSIVE_MAXIMUM:
				setExlusiveMaximum((Boolean)newValue);
				return;
			case CorePackage.HEADER__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case CorePackage.HEADER__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case CorePackage.HEADER__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case CorePackage.HEADER__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case CorePackage.HEADER__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case CorePackage.HEADER__MULTIPLE_OF:
				setMultipleOF((Integer)newValue);
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
			case CorePackage.HEADER__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.HEADER__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.HEADER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case CorePackage.HEADER__COLLECTION_FORMAT:
				setCollectionFormat(COLLECTION_FORMAT_EDEFAULT);
				return;
			case CorePackage.HEADER__ITEMS:
				setItems((Items)null);
				return;
			case CorePackage.HEADER__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case CorePackage.HEADER__EXLUSIVE_MINIMUM:
				setExlusiveMinimum(EXLUSIVE_MINIMUM_EDEFAULT);
				return;
			case CorePackage.HEADER__ENUM:
				getEnum().clear();
				return;
			case CorePackage.HEADER__MAX_INTEMS:
				setMaxIntems(MAX_INTEMS_EDEFAULT);
				return;
			case CorePackage.HEADER__UNIQUE_ITEM:
				setUniqueItem(UNIQUE_ITEM_EDEFAULT);
				return;
			case CorePackage.HEADER__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CorePackage.HEADER__EXLUSIVE_MAXIMUM:
				setExlusiveMaximum(EXLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case CorePackage.HEADER__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case CorePackage.HEADER__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case CorePackage.HEADER__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CorePackage.HEADER__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case CorePackage.HEADER__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case CorePackage.HEADER__MULTIPLE_OF:
				setMultipleOF(MULTIPLE_OF_EDEFAULT);
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
			case CorePackage.HEADER__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.HEADER__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.HEADER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case CorePackage.HEADER__COLLECTION_FORMAT:
				return collectionFormat != COLLECTION_FORMAT_EDEFAULT;
			case CorePackage.HEADER__ITEMS:
				return items != null;
			case CorePackage.HEADER__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case CorePackage.HEADER__EXLUSIVE_MINIMUM:
				return exlusiveMinimum != EXLUSIVE_MINIMUM_EDEFAULT;
			case CorePackage.HEADER__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case CorePackage.HEADER__MAX_INTEMS:
				return maxIntems != MAX_INTEMS_EDEFAULT;
			case CorePackage.HEADER__UNIQUE_ITEM:
				return uniqueItem != UNIQUE_ITEM_EDEFAULT;
			case CorePackage.HEADER__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CorePackage.HEADER__EXLUSIVE_MAXIMUM:
				return exlusiveMaximum != EXLUSIVE_MAXIMUM_EDEFAULT;
			case CorePackage.HEADER__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case CorePackage.HEADER__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case CorePackage.HEADER__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case CorePackage.HEADER__MIN_ITEMS:
				return minItems != MIN_ITEMS_EDEFAULT;
			case CorePackage.HEADER__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case CorePackage.HEADER__MULTIPLE_OF:
				return multipleOF != MULTIPLE_OF_EDEFAULT;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", type: ");
		result.append(type);
		result.append(", format: ");
		result.append(format);
		result.append(", collectionFormat: ");
		result.append(collectionFormat);
		result.append(", default: ");
		result.append(default_);
		result.append(", exlusiveMinimum: ");
		result.append(exlusiveMinimum);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", maxIntems: ");
		result.append(maxIntems);
		result.append(", uniqueItem: ");
		result.append(uniqueItem);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", exlusiveMaximum: ");
		result.append(exlusiveMaximum);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", multipleOF: ");
		result.append(multipleOF);
		result.append(')');
		return result.toString();
	}

} //HeaderImpl
