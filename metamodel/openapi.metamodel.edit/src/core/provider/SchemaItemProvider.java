/**
 */
package core.provider;


import core.OpenAPIFactory;
import core.OpenAPIPackage;
import core.Schema;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link core.Schema} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class SchemaItemProvider extends JSONSchemaSubsetItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addRefPropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addTitlePropertyDescriptor(object);
			addMaxPropertiesPropertyDescriptor(object);
			addMinPropertiesPropertyDescriptor(object);
			addExamplePropertyDescriptor(object);
			addDiscriminatorPropertyDescriptor(object);
			addReadOnlyPropertyDescriptor(object);
			addPropertiesPropertyDescriptor(object);
			addItemsPropertyDescriptor(object);
			addDeclaringContextPropertyDescriptor(object);
			addRequiredPropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addAdditonalPropertiesAllowedPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Ref feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JSONPointer_ref_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JSONPointer_ref_feature", "_UI_JSONPointer_type"),
				 OpenAPIPackage.Literals.JSON_POINTER__REF,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_name_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Title feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTitlePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_title_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_title_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__TITLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Max Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMaxPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_maxProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_maxProperties_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__MAX_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Min Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMinPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_minProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_minProperties_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__MIN_PROPERTIES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Required feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRequiredPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_required_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_required_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__REQUIRED,
				 true,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_value_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__VALUE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Additonal Properties Allowed feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditonalPropertiesAllowedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_additonalPropertiesAllowed_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_additonalPropertiesAllowed_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Example feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExamplePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_example_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_example_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__EXAMPLE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discriminator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscriminatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_discriminator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_discriminator_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__DISCRIMINATOR,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Read Only feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReadOnlyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_readOnly_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_readOnly_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__READ_ONLY,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_properties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_properties_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__PROPERTIES,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Items feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addItemsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_items_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_items_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__ITEMS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declaring Context feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaringContextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Schema_declaringContext_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Schema_declaringContext_feature", "_UI_Schema_type"),
				 OpenAPIPackage.Literals.SCHEMA__DECLARING_CONTEXT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(OpenAPIPackage.Literals.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS);
			childrenFeatures.add(OpenAPIPackage.Literals.SCHEMA__ALL_OF);
			childrenFeatures.add(OpenAPIPackage.Literals.SCHEMA__XML);
			childrenFeatures.add(OpenAPIPackage.Literals.SCHEMA__ADDITONAL_PROPERTIES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Schema.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Schema"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Schema)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Schema_type") :
			getString("_UI_Schema_type") + " " + label;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Schema.class)) {
			case OpenAPIPackage.SCHEMA__REF:
			case OpenAPIPackage.SCHEMA__NAME:
			case OpenAPIPackage.SCHEMA__TITLE:
			case OpenAPIPackage.SCHEMA__MAX_PROPERTIES:
			case OpenAPIPackage.SCHEMA__MIN_PROPERTIES:
			case OpenAPIPackage.SCHEMA__EXAMPLE:
			case OpenAPIPackage.SCHEMA__DISCRIMINATOR:
			case OpenAPIPackage.SCHEMA__READ_ONLY:
			case OpenAPIPackage.SCHEMA__REQUIRED:
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES_ALLOWED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenAPIPackage.SCHEMA__EXTERNAL_DOCS:
			case OpenAPIPackage.SCHEMA__ALL_OF:
			case OpenAPIPackage.SCHEMA__XML:
			case OpenAPIPackage.SCHEMA__ADDITONAL_PROPERTIES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.EXTERNAL_DOCS_CONTEXT__EXTERNAL_DOCS,
				 OpenAPIFactory.eINSTANCE.createExternalDocs()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.SCHEMA__ALL_OF,
				 OpenAPIFactory.eINSTANCE.createSchema()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.SCHEMA__XML,
				 OpenAPIFactory.eINSTANCE.createXMLElement()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.SCHEMA__ADDITONAL_PROPERTIES,
				 OpenAPIFactory.eINSTANCE.createSchema()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == OpenAPIPackage.Literals.SCHEMA__ALL_OF ||
			childFeature == OpenAPIPackage.Literals.SCHEMA__ADDITONAL_PROPERTIES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
