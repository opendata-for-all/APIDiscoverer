/**
 */
package core.impl;

import core.CorePackage;
import core.ExternalDocs;
import core.JsonDataType;
import core.Schema;
import core.XMLElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SchemaImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMultipleOf <em>Multiple Of</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMaximum <em>Maximum</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#isExclusiveMaximum <em>Exclusive Maximum</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMaxLength <em>Max Length</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMinLength <em>Min Length</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#isExclusiveMinimum <em>Exclusive Minimum</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMaxItems <em>Max Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMinItems <em>Min Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#isUniqueItems <em>Unique Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getType <em>Type</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getEnum <em>Enum</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getExternaldocs <em>Externaldocs</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#isReadOnly <em>Read Only</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends MinimalEObjectImpl.Container implements Schema {
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
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

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
	 * The default value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int MAX_PROPERTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected int maxProperties = MAX_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected static final int MIN_PROPERTIES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected int minProperties = MIN_PROPERTIES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<String> required;

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
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> properties;

	/**
	 * The default value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected static final String EXAMPLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExample() <em>Example</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExample()
	 * @generated
	 * @ordered
	 */
	protected String example = EXAMPLE_EDEFAULT;

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
	 * The cached value of the '{@link #getExternaldocs() <em>Externaldocs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternaldocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externaldocs;

	/**
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> allOf;

	/**
	 * The default value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected static final String REF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected String ref = REF_EDEFAULT;

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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected Schema items;

	/**
	 * The cached value of the '{@link #getAdditonalProperties() <em>Additonal Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditonalProperties()
	 * @generated
	 * @ordered
	 */
	protected Schema additonalProperties;

	/**
	 * The default value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected static final String DISCRIMINATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiscriminator() <em>Discriminator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminator()
	 * @generated
	 * @ordered
	 */
	protected String discriminator = DISCRIMINATOR_EDEFAULT;

	/**
	 * The default value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean READ_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean readOnly = READ_ONLY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected XMLElement xml;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SchemaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.SCHEMA;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__TITLE, oldTitle, title));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MULTIPLE_OF, oldMultipleOf, multipleOf));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MAXIMUM, oldMaximum, maximum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXCLUSIVE_MAXIMUM, oldExclusiveMaximum, exclusiveMaximum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MAX_LENGTH, oldMaxLength, maxLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MIN_LENGTH, oldMinLength, minLength));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__PATTERN, oldPattern, pattern));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MINIMUM, oldMinimum, minimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXCLUSIVE_MINIMUM, oldExclusiveMinimum, exclusiveMinimum));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MAX_ITEMS, oldMaxItems, maxItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MIN_ITEMS, oldMinItems, minItems));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__UNIQUE_ITEMS, oldUniqueItems, uniqueItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxProperties(int newMaxProperties) {
		int oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinProperties(int newMinProperties) {
		int oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MIN_PROPERTIES, oldMinProperties, minProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getRequired() {
		if (required == null) {
			required = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.SCHEMA__REQUIRED);
		}
		return required;
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Schema>(Schema.class, this, CorePackage.SCHEMA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExample() {
		return example;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExample(String newExample) {
		String oldExample = example;
		example = newExample;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXAMPLE, oldExample, example));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getEnum() {
		if (enum_ == null) {
			enum_ = new EDataTypeUniqueEList<String>(String.class, this, CorePackage.SCHEMA__ENUM);
		}
		return enum_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs getExternaldocs() {
		return externaldocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternaldocs(ExternalDocs newExternaldocs, NotificationChain msgs) {
		ExternalDocs oldExternaldocs = externaldocs;
		externaldocs = newExternaldocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXTERNALDOCS, oldExternaldocs, newExternaldocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternaldocs(ExternalDocs newExternaldocs) {
		if (newExternaldocs != externaldocs) {
			NotificationChain msgs = null;
			if (externaldocs != null)
				msgs = ((InternalEObject)externaldocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__EXTERNALDOCS, null, msgs);
			if (newExternaldocs != null)
				msgs = ((InternalEObject)newExternaldocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__EXTERNALDOCS, null, msgs);
			msgs = basicSetExternaldocs(newExternaldocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXTERNALDOCS, newExternaldocs, newExternaldocs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getAllOf() {
		if (allOf == null) {
			allOf = new EObjectContainmentEList<Schema>(Schema.class, this, CorePackage.SCHEMA__ALL_OF);
		}
		return allOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRef(String newRef) {
		String oldRef = ref;
		ref = newRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__REF, oldRef, ref));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__DEFAULT, oldDefault, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getItems() {
		if (items != null && items.eIsProxy()) {
			InternalEObject oldItems = (InternalEObject)items;
			items = (Schema)eResolveProxy(oldItems);
			if (items != oldItems) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SCHEMA__ITEMS, oldItems, items));
			}
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItems(Schema newItems) {
		Schema oldItems = items;
		items = newItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__ITEMS, oldItems, items));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getAdditonalProperties() {
		return additonalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditonalProperties(Schema newAdditonalProperties, NotificationChain msgs) {
		Schema oldAdditonalProperties = additonalProperties;
		additonalProperties = newAdditonalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, newAdditonalProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditonalProperties(Schema newAdditonalProperties) {
		if (newAdditonalProperties != additonalProperties) {
			NotificationChain msgs = null;
			if (additonalProperties != null)
				msgs = ((InternalEObject)additonalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__ADDITONAL_PROPERTIES, null, msgs);
			if (newAdditonalProperties != null)
				msgs = ((InternalEObject)newAdditonalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__ADDITONAL_PROPERTIES, null, msgs);
			msgs = basicSetAdditonalProperties(newAdditonalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__ADDITONAL_PROPERTIES, newAdditonalProperties, newAdditonalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiscriminator() {
		return discriminator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminator(String newDiscriminator) {
		String oldDiscriminator = discriminator;
		discriminator = newDiscriminator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(boolean newReadOnly) {
		boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLElement getXml() {
		return xml;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXml(XMLElement newXml, NotificationChain msgs) {
		XMLElement oldXml = xml;
		xml = newXml;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__XML, oldXml, newXml);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXml(XMLElement newXml) {
		if (newXml != xml) {
			NotificationChain msgs = null;
			if (xml != null)
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__XML, newXml, newXml));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SCHEMA__EXTERNALDOCS:
				return basicSetExternaldocs(null, msgs);
			case CorePackage.SCHEMA__ALL_OF:
				return ((InternalEList<?>)getAllOf()).basicRemove(otherEnd, msgs);
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				return basicSetAdditonalProperties(null, msgs);
			case CorePackage.SCHEMA__XML:
				return basicSetXml(null, msgs);
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
			case CorePackage.SCHEMA__FORMAT:
				return getFormat();
			case CorePackage.SCHEMA__TITLE:
				return getTitle();
			case CorePackage.SCHEMA__DESCRIPTION:
				return getDescription();
			case CorePackage.SCHEMA__MULTIPLE_OF:
				return getMultipleOf();
			case CorePackage.SCHEMA__MAXIMUM:
				return getMaximum();
			case CorePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return isExclusiveMaximum();
			case CorePackage.SCHEMA__MAX_LENGTH:
				return getMaxLength();
			case CorePackage.SCHEMA__MIN_LENGTH:
				return getMinLength();
			case CorePackage.SCHEMA__PATTERN:
				return getPattern();
			case CorePackage.SCHEMA__MINIMUM:
				return getMinimum();
			case CorePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return isExclusiveMinimum();
			case CorePackage.SCHEMA__MAX_ITEMS:
				return getMaxItems();
			case CorePackage.SCHEMA__MIN_ITEMS:
				return getMinItems();
			case CorePackage.SCHEMA__UNIQUE_ITEMS:
				return isUniqueItems();
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case CorePackage.SCHEMA__REQUIRED:
				return getRequired();
			case CorePackage.SCHEMA__TYPE:
				return getType();
			case CorePackage.SCHEMA__PROPERTIES:
				return getProperties();
			case CorePackage.SCHEMA__EXAMPLE:
				return getExample();
			case CorePackage.SCHEMA__ENUM:
				return getEnum();
			case CorePackage.SCHEMA__EXTERNALDOCS:
				return getExternaldocs();
			case CorePackage.SCHEMA__ALL_OF:
				return getAllOf();
			case CorePackage.SCHEMA__REF:
				return getRef();
			case CorePackage.SCHEMA__DEFAULT:
				return getDefault();
			case CorePackage.SCHEMA__ITEMS:
				if (resolve) return getItems();
				return basicGetItems();
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				return getAdditonalProperties();
			case CorePackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case CorePackage.SCHEMA__READ_ONLY:
				return isReadOnly();
			case CorePackage.SCHEMA__XML:
				return getXml();
			case CorePackage.SCHEMA__NAME:
				return getName();
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
			case CorePackage.SCHEMA__FORMAT:
				setFormat((String)newValue);
				return;
			case CorePackage.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case CorePackage.SCHEMA__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CorePackage.SCHEMA__MULTIPLE_OF:
				setMultipleOf((Integer)newValue);
				return;
			case CorePackage.SCHEMA__MAXIMUM:
				setMaximum((Integer)newValue);
				return;
			case CorePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum((Boolean)newValue);
				return;
			case CorePackage.SCHEMA__MAX_LENGTH:
				setMaxLength((Integer)newValue);
				return;
			case CorePackage.SCHEMA__MIN_LENGTH:
				setMinLength((Integer)newValue);
				return;
			case CorePackage.SCHEMA__PATTERN:
				setPattern((String)newValue);
				return;
			case CorePackage.SCHEMA__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case CorePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum((Boolean)newValue);
				return;
			case CorePackage.SCHEMA__MAX_ITEMS:
				setMaxItems((Integer)newValue);
				return;
			case CorePackage.SCHEMA__MIN_ITEMS:
				setMinItems((Integer)newValue);
				return;
			case CorePackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems((Boolean)newValue);
				return;
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case CorePackage.SCHEMA__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.SCHEMA__TYPE:
				setType((JsonDataType)newValue);
				return;
			case CorePackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case CorePackage.SCHEMA__ENUM:
				getEnum().clear();
				getEnum().addAll((Collection<? extends String>)newValue);
				return;
			case CorePackage.SCHEMA__EXTERNALDOCS:
				setExternaldocs((ExternalDocs)newValue);
				return;
			case CorePackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.SCHEMA__REF:
				setRef((String)newValue);
				return;
			case CorePackage.SCHEMA__DEFAULT:
				setDefault((String)newValue);
				return;
			case CorePackage.SCHEMA__ITEMS:
				setItems((Schema)newValue);
				return;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)newValue);
				return;
			case CorePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case CorePackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case CorePackage.SCHEMA__XML:
				setXml((XMLElement)newValue);
				return;
			case CorePackage.SCHEMA__NAME:
				setName((String)newValue);
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
			case CorePackage.SCHEMA__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case CorePackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorePackage.SCHEMA__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MULTIPLE_OF:
				setMultipleOf(MULTIPLE_OF_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
				return;
			case CorePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				setExclusiveMaximum(EXCLUSIVE_MAXIMUM_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MAX_LENGTH:
				setMaxLength(MAX_LENGTH_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MIN_LENGTH:
				setMinLength(MIN_LENGTH_EDEFAULT);
				return;
			case CorePackage.SCHEMA__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case CorePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				setExclusiveMinimum(EXCLUSIVE_MINIMUM_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MAX_ITEMS:
				setMaxItems(MAX_ITEMS_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MIN_ITEMS:
				setMinItems(MIN_ITEMS_EDEFAULT);
				return;
			case CorePackage.SCHEMA__UNIQUE_ITEMS:
				setUniqueItems(UNIQUE_ITEMS_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case CorePackage.SCHEMA__REQUIRED:
				getRequired().clear();
				return;
			case CorePackage.SCHEMA__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case CorePackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case CorePackage.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case CorePackage.SCHEMA__ENUM:
				getEnum().clear();
				return;
			case CorePackage.SCHEMA__EXTERNALDOCS:
				setExternaldocs((ExternalDocs)null);
				return;
			case CorePackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				return;
			case CorePackage.SCHEMA__REF:
				setRef(REF_EDEFAULT);
				return;
			case CorePackage.SCHEMA__DEFAULT:
				setDefault(DEFAULT_EDEFAULT);
				return;
			case CorePackage.SCHEMA__ITEMS:
				setItems((Schema)null);
				return;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)null);
				return;
			case CorePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case CorePackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CorePackage.SCHEMA__XML:
				setXml((XMLElement)null);
				return;
			case CorePackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
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
			case CorePackage.SCHEMA__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case CorePackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.SCHEMA__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CorePackage.SCHEMA__MULTIPLE_OF:
				return multipleOf != MULTIPLE_OF_EDEFAULT;
			case CorePackage.SCHEMA__MAXIMUM:
				return maximum != MAXIMUM_EDEFAULT;
			case CorePackage.SCHEMA__EXCLUSIVE_MAXIMUM:
				return exclusiveMaximum != EXCLUSIVE_MAXIMUM_EDEFAULT;
			case CorePackage.SCHEMA__MAX_LENGTH:
				return maxLength != MAX_LENGTH_EDEFAULT;
			case CorePackage.SCHEMA__MIN_LENGTH:
				return minLength != MIN_LENGTH_EDEFAULT;
			case CorePackage.SCHEMA__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case CorePackage.SCHEMA__MINIMUM:
				return minimum != MINIMUM_EDEFAULT;
			case CorePackage.SCHEMA__EXCLUSIVE_MINIMUM:
				return exclusiveMinimum != EXCLUSIVE_MINIMUM_EDEFAULT;
			case CorePackage.SCHEMA__MAX_ITEMS:
				return maxItems != MAX_ITEMS_EDEFAULT;
			case CorePackage.SCHEMA__MIN_ITEMS:
				return minItems != MIN_ITEMS_EDEFAULT;
			case CorePackage.SCHEMA__UNIQUE_ITEMS:
				return uniqueItems != UNIQUE_ITEMS_EDEFAULT;
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				return maxProperties != MAX_PROPERTIES_EDEFAULT;
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				return minProperties != MIN_PROPERTIES_EDEFAULT;
			case CorePackage.SCHEMA__REQUIRED:
				return required != null && !required.isEmpty();
			case CorePackage.SCHEMA__TYPE:
				return type != TYPE_EDEFAULT;
			case CorePackage.SCHEMA__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CorePackage.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case CorePackage.SCHEMA__ENUM:
				return enum_ != null && !enum_.isEmpty();
			case CorePackage.SCHEMA__EXTERNALDOCS:
				return externaldocs != null;
			case CorePackage.SCHEMA__ALL_OF:
				return allOf != null && !allOf.isEmpty();
			case CorePackage.SCHEMA__REF:
				return REF_EDEFAULT == null ? ref != null : !REF_EDEFAULT.equals(ref);
			case CorePackage.SCHEMA__DEFAULT:
				return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
			case CorePackage.SCHEMA__ITEMS:
				return items != null;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				return additonalProperties != null;
			case CorePackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case CorePackage.SCHEMA__READ_ONLY:
				return readOnly != READ_ONLY_EDEFAULT;
			case CorePackage.SCHEMA__XML:
				return xml != null;
			case CorePackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (format: ");
		result.append(format);
		result.append(", title: ");
		result.append(title);
		result.append(", description: ");
		result.append(description);
		result.append(", multipleOf: ");
		result.append(multipleOf);
		result.append(", maximum: ");
		result.append(maximum);
		result.append(", exclusiveMaximum: ");
		result.append(exclusiveMaximum);
		result.append(", maxLength: ");
		result.append(maxLength);
		result.append(", minLength: ");
		result.append(minLength);
		result.append(", pattern: ");
		result.append(pattern);
		result.append(", minimum: ");
		result.append(minimum);
		result.append(", ExclusiveMinimum: ");
		result.append(exclusiveMinimum);
		result.append(", maxItems: ");
		result.append(maxItems);
		result.append(", minItems: ");
		result.append(minItems);
		result.append(", uniqueItems: ");
		result.append(uniqueItems);
		result.append(", maxProperties: ");
		result.append(maxProperties);
		result.append(", minProperties: ");
		result.append(minProperties);
		result.append(", required: ");
		result.append(required);
		result.append(", type: ");
		result.append(type);
		result.append(", example: ");
		result.append(example);
		result.append(", enum: ");
		result.append(enum_);
		result.append(", ref: ");
		result.append(ref);
		result.append(", default: ");
		result.append(default_);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
