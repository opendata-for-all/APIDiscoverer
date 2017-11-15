/**
 */
package core.provider;


import core.OpenAPIFactory;
import core.OpenAPIPackage;
import core.Path;

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
 * This is the item provider adapter for a {@link core.Path} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PathItemProvider extends ParamterDeclaringContextItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathItemProvider(AdapterFactory adapterFactory) {
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

			addParametersPropertyDescriptor(object);
			addPatternPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
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
	 * This adds a property descriptor for the Pattern feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Path_pattern_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Path_pattern_feature", "_UI_Path_type"),
				 OpenAPIPackage.Literals.PATH__PATTERN,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__GET);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__PUT);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__POST);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__DELETE);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__OPTIONS);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__HEAD);
			childrenFeatures.add(OpenAPIPackage.Literals.PATH__PATCH);
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
	 * This returns Path.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Path"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Path)object).getPattern();
		return label == null || label.length() == 0 ?
			getString("_UI_Path_type") :
			getString("_UI_Path_type") + " " + label;
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

		switch (notification.getFeatureID(Path.class)) {
			case OpenAPIPackage.PATH__PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case OpenAPIPackage.PATH__GET:
			case OpenAPIPackage.PATH__PUT:
			case OpenAPIPackage.PATH__POST:
			case OpenAPIPackage.PATH__DELETE:
			case OpenAPIPackage.PATH__OPTIONS:
			case OpenAPIPackage.PATH__HEAD:
			case OpenAPIPackage.PATH__PATCH:
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
				(OpenAPIPackage.Literals.PATH__GET,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__PUT,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__POST,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__DELETE,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__OPTIONS,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__HEAD,
				 OpenAPIFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(OpenAPIPackage.Literals.PATH__PATCH,
				 OpenAPIFactory.eINSTANCE.createOperation()));
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
			childFeature == OpenAPIPackage.Literals.PATH__GET ||
			childFeature == OpenAPIPackage.Literals.PATH__PUT ||
			childFeature == OpenAPIPackage.Literals.PATH__POST ||
			childFeature == OpenAPIPackage.Literals.PATH__DELETE ||
			childFeature == OpenAPIPackage.Literals.PATH__OPTIONS ||
			childFeature == OpenAPIPackage.Literals.PATH__HEAD ||
			childFeature == OpenAPIPackage.Literals.PATH__PATCH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
