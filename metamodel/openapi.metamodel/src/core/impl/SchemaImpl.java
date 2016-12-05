/**
 */
package core.impl;

import core.CorePackage;
import core.ExternalDocs;
import core.ExternalDocsContext;
import core.JSONPointer;
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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
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
 *   <li>{@link core.impl.SchemaImpl#getRequired <em>Required</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getExample <em>Example</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDiscriminator <em>Discriminator</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAllOf <em>All Of</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getItems <em>Items</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getXml <em>Xml</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getAdditonalProperties <em>Additonal Properties</em>}</li>
 *   <li>{@link core.impl.SchemaImpl#getDeclaringContext <em>Declaring Context</em>}</li>
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
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<String> required;

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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXTERNAL_DOCS, oldExternalDocs, newExternalDocs);
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
				msgs = ((InternalEObject)externalDocs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			if (newExternalDocs != null)
				msgs = ((InternalEObject)newExternalDocs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - CorePackage.SCHEMA__EXTERNAL_DOCS, null, msgs);
			msgs = basicSetExternalDocs(newExternalDocs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__EXTERNAL_DOCS, newExternalDocs, newExternalDocs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__MAX_PROPERTIES, oldMaxProperties, maxProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__READ_ONLY, oldReadOnly, readOnly));
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
	public EList<Schema> getAllOf() {
		if (allOf == null) {
			allOf = new EObjectResolvingEList<Schema>(Schema.class, this, CorePackage.SCHEMA__ALL_OF);
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
	public Schema getAdditonalProperties() {
		if (additonalProperties != null && additonalProperties.eIsProxy()) {
			InternalEObject oldAdditonalProperties = (InternalEObject)additonalProperties;
			additonalProperties = (Schema)eResolveProxy(oldAdditonalProperties);
			if (additonalProperties != oldAdditonalProperties) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__ADDITONAL_PROPERTIES, oldAdditonalProperties, additonalProperties));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CorePackage.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.SCHEMA__DECLARING_CONTEXT, oldDeclaringContext, declaringContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CorePackage.SCHEMA__EXTERNAL_DOCS:
				return basicSetExternalDocs(null, msgs);
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
			case CorePackage.SCHEMA__REF:
				return getRef();
			case CorePackage.SCHEMA__EXTERNAL_DOCS:
				return getExternalDocs();
			case CorePackage.SCHEMA__NAME:
				return getName();
			case CorePackage.SCHEMA__TITLE:
				return getTitle();
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				return getMaxProperties();
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				return getMinProperties();
			case CorePackage.SCHEMA__REQUIRED:
				return getRequired();
			case CorePackage.SCHEMA__EXAMPLE:
				return getExample();
			case CorePackage.SCHEMA__DISCRIMINATOR:
				return getDiscriminator();
			case CorePackage.SCHEMA__READ_ONLY:
				return getReadOnly();
			case CorePackage.SCHEMA__PROPERTIES:
				return getProperties();
			case CorePackage.SCHEMA__ALL_OF:
				return getAllOf();
			case CorePackage.SCHEMA__ITEMS:
				if (resolve) return getItems();
				return basicGetItems();
			case CorePackage.SCHEMA__XML:
				return getXml();
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				if (resolve) return getAdditonalProperties();
				return basicGetAdditonalProperties();
			case CorePackage.SCHEMA__DECLARING_CONTEXT:
				if (resolve) return getDeclaringContext();
				return basicGetDeclaringContext();
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
			case CorePackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)newValue);
				return;
			case CorePackage.SCHEMA__NAME:
				setName((String)newValue);
				return;
			case CorePackage.SCHEMA__TITLE:
				setTitle((String)newValue);
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
			case CorePackage.SCHEMA__EXAMPLE:
				setExample((String)newValue);
				return;
			case CorePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator((String)newValue);
				return;
			case CorePackage.SCHEMA__READ_ONLY:
				setReadOnly((Boolean)newValue);
				return;
			case CorePackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				getAllOf().addAll((Collection<? extends Schema>)newValue);
				return;
			case CorePackage.SCHEMA__ITEMS:
				setItems((Schema)newValue);
				return;
			case CorePackage.SCHEMA__XML:
				setXml((XMLElement)newValue);
				return;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)newValue);
				return;
			case CorePackage.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaDeclaringContext)newValue);
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
			case CorePackage.SCHEMA__EXTERNAL_DOCS:
				setExternalDocs((ExternalDocs)null);
				return;
			case CorePackage.SCHEMA__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.SCHEMA__TITLE:
				setTitle(TITLE_EDEFAULT);
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
			case CorePackage.SCHEMA__EXAMPLE:
				setExample(EXAMPLE_EDEFAULT);
				return;
			case CorePackage.SCHEMA__DISCRIMINATOR:
				setDiscriminator(DISCRIMINATOR_EDEFAULT);
				return;
			case CorePackage.SCHEMA__READ_ONLY:
				setReadOnly(READ_ONLY_EDEFAULT);
				return;
			case CorePackage.SCHEMA__PROPERTIES:
				getProperties().clear();
				return;
			case CorePackage.SCHEMA__ALL_OF:
				getAllOf().clear();
				return;
			case CorePackage.SCHEMA__ITEMS:
				setItems((Schema)null);
				return;
			case CorePackage.SCHEMA__XML:
				setXml((XMLElement)null);
				return;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				setAdditonalProperties((Schema)null);
				return;
			case CorePackage.SCHEMA__DECLARING_CONTEXT:
				setDeclaringContext((SchemaDeclaringContext)null);
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
			case CorePackage.SCHEMA__REF:
				return REF_EDEFAULT == null ? getRef() != null : !REF_EDEFAULT.equals(getRef());
			case CorePackage.SCHEMA__EXTERNAL_DOCS:
				return externalDocs != null;
			case CorePackage.SCHEMA__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.SCHEMA__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.SCHEMA__MAX_PROPERTIES:
				return MAX_PROPERTIES_EDEFAULT == null ? maxProperties != null : !MAX_PROPERTIES_EDEFAULT.equals(maxProperties);
			case CorePackage.SCHEMA__MIN_PROPERTIES:
				return MIN_PROPERTIES_EDEFAULT == null ? minProperties != null : !MIN_PROPERTIES_EDEFAULT.equals(minProperties);
			case CorePackage.SCHEMA__REQUIRED:
				return required != null && !required.isEmpty();
			case CorePackage.SCHEMA__EXAMPLE:
				return EXAMPLE_EDEFAULT == null ? example != null : !EXAMPLE_EDEFAULT.equals(example);
			case CorePackage.SCHEMA__DISCRIMINATOR:
				return DISCRIMINATOR_EDEFAULT == null ? discriminator != null : !DISCRIMINATOR_EDEFAULT.equals(discriminator);
			case CorePackage.SCHEMA__READ_ONLY:
				return READ_ONLY_EDEFAULT == null ? readOnly != null : !READ_ONLY_EDEFAULT.equals(readOnly);
			case CorePackage.SCHEMA__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case CorePackage.SCHEMA__ALL_OF:
				return allOf != null && !allOf.isEmpty();
			case CorePackage.SCHEMA__ITEMS:
				return items != null;
			case CorePackage.SCHEMA__XML:
				return xml != null;
			case CorePackage.SCHEMA__ADDITONAL_PROPERTIES:
				return additonalProperties != null;
			case CorePackage.SCHEMA__DECLARING_CONTEXT:
				return declaringContext != null;
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
				case CorePackage.SCHEMA__REF: return CorePackage.JSON_POINTER__REF;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (derivedFeatureID) {
				case CorePackage.SCHEMA__EXTERNAL_DOCS: return CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS;
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
				case CorePackage.JSON_POINTER__REF: return CorePackage.SCHEMA__REF;
				default: return -1;
			}
		}
		if (baseClass == ExternalDocsContext.class) {
			switch (baseFeatureID) {
				case CorePackage.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS: return CorePackage.SCHEMA__EXTERNAL_DOCS;
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
		result.append(", required: ");
		result.append(required);
		result.append(", example: ");
		result.append(example);
		result.append(", discriminator: ");
		result.append(discriminator);
		result.append(", readOnly: ");
		result.append(readOnly);
		result.append(')');
		return result.toString();
	}

} //SchemaImpl
