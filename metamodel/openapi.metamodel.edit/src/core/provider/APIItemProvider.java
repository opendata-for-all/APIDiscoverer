/**
 */
package core.provider;


import core.API;
import core.OpenAPIFactory;
import core.OpenAPIPackage;

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
 * This is the item provider adapter for a {@link core.API} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class APIItemProvider extends ParamterDeclaringContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIItemProvider(AdapterFactory adapterFactory) {
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
			addSecurityRequirementPropertyDescriptor(object);
			addParametersPropertyDescriptor(object);
			addSwaggerPropertyDescriptor(object);
			addHostPropertyDescriptor(object);
			addBasePathPropertyDescriptor(object);
			addSchemesPropertyDescriptor(object);
			addConsumesPropertyDescriptor(object);
			addProducesPropertyDescriptor(object);
			addDefinitionsPropertyDescriptor(object);
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
	 * This adds a property descriptor for the Security Requirement feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurityRequirementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_SecurityContext_securityRequirement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_SecurityContext_securityRequirement_feature", "_UI_SecurityContext_type"),
				 OpenAPIPackage.Literals.SECURITY_CONTEXT__SECURITY_REQUIREMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Parameters feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addParametersPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ParameterContext_parameters_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ParameterContext_parameters_feature", "_UI_ParameterContext_type"),
				 OpenAPIPackage.Literals.PARAMETER_CONTEXT__PARAMETERS,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Swagger feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSwaggerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_swagger_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_swagger_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__SWAGGER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Host feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addHostPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_host_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_host_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__HOST,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBasePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_basePath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_basePath_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__BASE_PATH,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schemes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchemesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_schemes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_schemes_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__SCHEMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Consumes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConsumesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_consumes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_consumes_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__CONSUMES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Produces feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProducesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_produces_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_produces_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__PRODUCES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Definitions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefinitionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_API_definitions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_API_definitions_feature", "_UI_API_type"),
				 OpenAPIPackage.Literals.API__DEFINITIONS,
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
			childrenFeatures.add(OpenAPIPackage.Literals.API__INFO);
			childrenFeatures.add(OpenAPIPackage.Literals.API__PATHS);
			childrenFeatures.add(OpenAPIPackage.Literals.API__RESPONSES);
			childrenFeatures.add(OpenAPIPackage.Literals.API__SECURITY_DEFINITIONS);
			childrenFeatures.add(OpenAPIPackage.Literals.API__TAGS);
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
	 * This returns API.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/API"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((API)object).getRef();
		return label == null || label.length() == 0 ?
			getString("_UI_API_type") :
			getString("_UI_API_type") + " " + label;
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

		switch (notification.getFeatureID(API.class)) {
			case OpenAPIPackage.API__REF:
			case OpenAPIPackage.API__SWAGGER:
			case OpenAPIPackage.API__HOST:
			case OpenAPIPackage.API__BASE_PATH:
			case OpenAPIPackage.API__SCHEMES:
			case OpenAPIPackage.API__CONSUMES:
			case OpenAPIPackage.API__PRODUCES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenAPIPackage.API__EXTERNAL_DOCS:
			case OpenAPIPackage.API__INFO:
			case OpenAPIPackage.API__PATHS:
			case OpenAPIPackage.API__RESPONSES:
			case OpenAPIPackage.API__SECURITY_DEFINITIONS:
			case OpenAPIPackage.API__TAGS:
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
				(OpenAPIPackage.Literals.API__INFO,
				 OpenAPIFactory.eINSTANCE.createInfo()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.API__PATHS,
				 OpenAPIFactory.eINSTANCE.createPath()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.API__RESPONSES,
				 OpenAPIFactory.eINSTANCE.createResponse()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.API__SECURITY_DEFINITIONS,
				 OpenAPIFactory.eINSTANCE.createSecuritySchema()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.API__TAGS,
				 OpenAPIFactory.eINSTANCE.createTag()));
	}

}
