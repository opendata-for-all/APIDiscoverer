/**
 */
package core.provider;


import core.CoreFactory;
import core.CorePackage;
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
				 CorePackage.Literals.PARAMETER_CONTEXT__PARAMETERS,
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
				 CorePackage.Literals.PATH__PATTERN,
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
			childrenFeatures.add(CorePackage.Literals.PATH__GET);
			childrenFeatures.add(CorePackage.Literals.PATH__PUT);
			childrenFeatures.add(CorePackage.Literals.PATH__POST);
			childrenFeatures.add(CorePackage.Literals.PATH__DELETE);
			childrenFeatures.add(CorePackage.Literals.PATH__OPTIONS);
			childrenFeatures.add(CorePackage.Literals.PATH__HEAD);
			childrenFeatures.add(CorePackage.Literals.PATH__PATCH);
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
			case CorePackage.PATH__PATTERN:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case CorePackage.PATH__GET:
			case CorePackage.PATH__PUT:
			case CorePackage.PATH__POST:
			case CorePackage.PATH__DELETE:
			case CorePackage.PATH__OPTIONS:
			case CorePackage.PATH__HEAD:
			case CorePackage.PATH__PATCH:
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
				(CorePackage.Literals.PATH__GET,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__PUT,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__POST,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__DELETE,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__OPTIONS,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__HEAD,
				 CoreFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add
			(createChildParameter
				(CorePackage.Literals.PATH__PATCH,
				 CoreFactory.eINSTANCE.createOperation()));
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
			childFeature == CorePackage.Literals.PATH__GET ||
			childFeature == CorePackage.Literals.PATH__PUT ||
			childFeature == CorePackage.Literals.PATH__POST ||
			childFeature == CorePackage.Literals.PATH__DELETE ||
			childFeature == CorePackage.Literals.PATH__OPTIONS ||
			childFeature == CorePackage.Literals.PATH__HEAD ||
			childFeature == CorePackage.Literals.PATH__PATCH;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
