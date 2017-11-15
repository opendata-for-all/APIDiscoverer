/**
 */
package core.impl;

import core.ExternalDocs;
import core.ExternalDocsContext;
import core.JSONPointer;
import core.OpenAPIPackage;
import core.Schema;
import core.SchemaDeclaringContext;
import core.XMLElement;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Schema</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.SchemaImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getExternalDocs <em>External Docs</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getName <em>Name</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMaxProperties <em>Max Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getMinProperties <em>Min Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDeclaringContext <em>Declaring Context</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getValue <em>Value</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#isAdditonalPropertiesAllowed <em>Additonal Properties Allowed</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SchemaImpl extends JSONSchemaSubsetImpl implements Schema {
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
	 * The cached value of the '{@link #getExternalDocs() <em>External Docs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExternalDocs()
	 * @generated
	 * @ordered
	 */
	protected ExternalDocs externalDocs;

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
	 * The default value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxProperties() <em>Max Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer maxProperties = MAX_PROPERTIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinProperties() <em>Min Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinProperties()
	 * @generated
	 * @ordered
	 */
	protected Integer minProperties = MIN_PROPERTIES_EDEFAULT;

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
	 * The default value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean READ_ONLY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReadOnly() <em>Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReadOnly()
	 * @generated
	 * @ordered
	 */
	protected Boolean readOnly = READ_ONLY_EDEFAULT;

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
	 * The cached value of the '{@link #getAllOf() <em>All Of</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllOf()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> allOf;

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
	 * The cached value of the '{@link #getXml() <em>Xml</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXml()
	 * @generated
	 * @ordered
	 */
	protected XMLElement xml;

	/**
	 * The cached value of the '{@link #getAdditonalProperties() <em>Additonal Properties</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditonalProperties()
	 * @generated
	 * @ordered
	 */
	protected Schema additonalProperties;

	/**
	 * The cached value of the '{@link #getDeclaringContext() <em>Declaring Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeclaringContext()
	 * @generated
	 * @ordered
	 */
	protected SchemaDeclaringContext declaringContext;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> required;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected Schema value;

	/**
	 * The default value of the '{@link #isAdditonalPropertiesAllowed() <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditonalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdditonalPropertiesAllowed() <em>Additonal Properties Allowed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdditonalPropertiesAllowed()
	 * @generated
	 * @ordered
	 */
	protected boolean additonalPropertiesAllowed = ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT;

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
		return OpenAPIPackage.Literals.SCHEMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRef() {
		if (getDeclaringContext() instanceof core.API) {
			return ((core.API) getDeclaringContext()).getRef() + "/definitions/" + getName();
			} else if (getDeclaringContext() instanceof Schema) {
		Schema context = (Schema) getDeclaringContext();	
		if (context.getProperties().contains(this))
			return context.getRef() + "/properties/" + getName();
		else if (context.getItems().equals(this))
			return context.getRef() + "/items";
		else if (context.getAdditonalProperties().equals(this))
			return context.getRef() + "/additionalProperties";
					}
			return "";
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalDocs getExternalDocs() {
		return externalDocs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExternalDocs(ExternalDocs newExternalDocs, NotificationChain msgs) {
		ExternalDocs oldExternalDocs = externalDocs;
		externalDocs = newExternalDocs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExternalDocs(ExternalDocs newExternalDocs) {
		if (newExternalDocs != externalDocs) {
			NotificationChain msgs = null;
			if (externalDocs != null)
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxProperties() {
		return maxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxProperties(Integer newMaxProperties) {
		Integer oldMaxProperties = maxProperties;
		maxProperties = newMaxProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinProperties() {
		return minProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinProperties(Integer newMinProperties) {
		Integer oldMinProperties = minProperties;
		minProperties = newMinProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__MIN_PROPERTIES, oldMinProperties, minProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getRequired() {
		if (required == null) {
			required = new EObjectResolvingEList<Schema>(Schema.class, this, OpenAPIPackage.SCHEMA__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getValue() {
		if (value != null && value.eIsProxy()) {
			InternalEObject oldValue = (InternalEObject)value;
			value = (Schema)eResolveProxy(oldValue);
			if (value != oldValue) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.SCHEMA__VALUE, oldValue, value));
			}
		}
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(Schema newValue) {
		Schema oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdditonalPropertiesAllowed() {
		return additonalPropertiesAllowed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditonalPropertiesAllowed(boolean newAdditonalPropertiesAllowed) {
		boolean oldAdditonalPropertiesAllowed = additonalPropertiesAllowed;
		additonalPropertiesAllowed = newAdditonalPropertiesAllowed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED, oldAdditonalPropertiesAllowed, additonalPropertiesAllowed));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__EXAMPLE, oldExample, example));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__DISCRIMINATOR, oldDiscriminator, discriminator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getReadOnly() {
		return readOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReadOnly(Boolean newReadOnly) {
		Boolean oldReadOnly = readOnly;
		readOnly = newReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getProperties() {
		if (properties == null) {
			properties = new EObjectResolvingEList<Schema>(Schema.class, this, OpenAPIPackage.SCHEMA__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getAllOf() {
		if (allOf == null) {
			allOf = new EObjectResolvingEList<Schema>(Schema.class, this, OpenAPIPackage.SCHEMA__ALL_OF);
		}
		return allOf;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.SCHEMA__ITEMS, oldItems, items));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__ITEMS, oldItems, items));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__XML, oldXml, newXml);
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
				msgs = ((InternalEObject)xml).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.SCHEMA__XML, null, msgs);
			if (newXml != null)
				msgs = ((InternalEObject)newXml).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.SCHEMA__XML, null, msgs);
			msgs = basicSetXml(newXml, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__XML, newXml, newXml));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema getAdditonalProperties() {
		if (additonalProperties != null && additonalProperties.eIsProxy()) {
			InternalEObject oldAdditonalProperties = (InternalEObject)additonalProperties;
			additonalProperties = (Schema)eResolveProxy(oldAdditonalProperties);
			if (additonalProperties != oldAdditonalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
			}
		}
		return additonalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Schema basicGetAdditonalProperties() {
		return additonalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditonalProperties(Schema newAdditonalProperties) {
		Schema oldAdditonalProperties = additonalProperties;
		additonalProperties = newAdditonalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDeclaringContext getDeclaringContext() {
		if (declaringContext != null && declaringContext.eIsProxy()) {
			InternalEObject oldDeclaringContext = (InternalEObject)declaringContext;
			declaringContext = (SchemaDeclaringContext)eResolveProxy(oldDeclaringContext);
			if (declaringContext != oldDeclaringContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, OpenAPIPackage.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
			}
		}
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaDeclaringContext basicGetDeclaringContext() {
		return declaringContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaringContext(SchemaDeclaringContext newDeclaringContext) {
		SchemaDeclaringContext oldDeclaringContext = declaringContext;
		declaringContext = newDeclaringContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
			case OpenAPIPackage.SCHEMA__XML:
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
			case OpenAPIPackage.SCHEMA__REF:
				return getRef();
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
				return getExternalDocs();
			case OpenAPIPackage.SCHEMA__NAME:
				return getName();
			case OpenAPIPackage.SCHEMA__TITLE:
				return getTitle();
			case OpenAPIPackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case OpenAPIPackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case OpenAPIPackage.SCHEMA__EXAMPLE:
				return getExample();
			case OpenAPIPackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case OpenAPIPackage.SCHEMA__READ_ONLY:
				return getReadOnly();
			case OpenAPIPackage.SCHEMA__PROPERTIES:
				return getProperties();
			case OpenAPIPackage.SCHEMA__ALL_OF:
				return getAllOf();
			case OpenAPIPackage.SCHEMA__ITEMS:
				if (resolve) return getItems();
				return basicGetItems();
			case OpenAPIPackage.SCHEMA__XML:
				return getXml();
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES:
				if (resolve) return getAdditonalProperties();
				return basicGetAdditonalProperties();
			case OpenAPIPackage.SCHEMA__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
			case OpenAPIPackage.SCHEMA__REQUIRED:
				return getRequired();
			case OpenAPIPackage.SCHEMA__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				return isAdditonalPropertiesAllowed();
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
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case OpenAPIPackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case OpenAPIPackage.SCHEMA__TITLE:
				setTitle((String)newValue);
				return;
			case OpenAPIPackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties((Integer)newValue);
				return;
			case OpenAPIPackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties((Integer)newValue);
				return;
			case OpenAPIPackage.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case OpenAPIPackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case OpenAPIPackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case OpenAPIPackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPIPackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPIPackage.SCHEMA__ITEMS:
				setItems((Schema)newValue);
				return;
			case OpenAPIPackage.SCHEMA__XML:
				setXml((XMLElement)newValue);
				return;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)newValue);
				return;
			case OpenAPIPackage.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaDeclaringContext)newValue);
				return;
			case OpenAPIPackage.SCHEMA__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPIPackage.SCHEMA__VALUE:
				setValue((Schema)newValue);
				return;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				setAdditonalPropertiesAllowed((Boolean)newValue);
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
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case OpenAPIPackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__MAX_PROPERTIES:
				setMaxProperties(MAX_PROPERTIES_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__MIN_PROPERTIES:
				setMinProperties(MIN_PROPERTIES_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case OpenAPIPackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case OpenAPIPackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				return;
			case OpenAPIPackage.SCHEMA__ITEMS:
				setItems((Schema)null);
				return;
			case OpenAPIPackage.SCHEMA__XML:
				setXml((XMLElement)null);
				return;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)null);
				return;
			case OpenAPIPackage.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaDeclaringContext)null);
				return;
			case OpenAPIPackage.SCHEMA__REQUIRED:
				getRequired().clear();
				return;
			case OpenAPIPackage.SCHEMA__VALUE:
				setValue((Schema)null);
				return;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				setAdditonalPropertiesAllowed(ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT);
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
			case OpenAPIPackage.SCHEMA__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
				return externalDocs != null;
			case OpenAPIPackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case OpenAPIPackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case OpenAPIPackage.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? maxProperties != null : !MAX_PROPERTIES_EDEFAULT.equals(maxProperties);
			case OpenAPIPackage.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? minProperties != null : !MIN_PROPERTIES_EDEFAULT.equals(minProperties);
			case OpenAPIPackage.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case OpenAPIPackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case OpenAPIPackage.SCHEMA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case OpenAPIPackage.SCHEMA__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case OpenAPIPackage.SCHEMA__ALL_OF:
				return allOf != null && !allOf.isEmpty();
			case OpenAPIPackage.SCHEMA__ITEMS:
				return items != null;
			case OpenAPIPackage.SCHEMA__XML:
				return xml != null;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES:
				return additonalProperties != null;
			case OpenAPIPackage.SCHEMA__DECLARING_CONTEXT:
				return declaringContext != null;
			case OpenAPIPackage.SCHEMA__REQUIRED:
				return required != null && !required.isEmpty();
			case OpenAPIPackage.SCHEMA__VALUE:
				return value != null;
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				return additonalPropertiesAllowed != ADDITONAL_PROPERTIES_ALLOWED_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaDeclaringContext.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.SCHEMA__REF: return OpenAPIPackage.JSON_POINTER__REF;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS: return OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == SchemaDeclaringContext.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		if (baseClass == JSONPointer.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.JSON_POINTER__REF: return OpenAPIPackage.SCHEMA__REF;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return OpenAPIPackage.SCHEMA__EXTERNAL_DOCS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(", title: ");
		result.append(title);
		result.append(", maxProperties: ");
		result.append(maxProperties);
		result.append(", minProperties: ");
		result.append(minProperties);
		result.append(", example: ");
		result.append(example);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(", additonalPropertiesAllowed: ");
		result.append(additonalPropertiesAllowed);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
