/**
 */
package core.impl;

import core.API;
import core.OpenAPIPackage;
import core.Parameter;
import core.Response;
import core.Root;
import core.Schema;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.RootImpl#getApi <em>Api</em>}</li>
 *   <li>{@link core.impl.RootImpl#getParamters <em>Paramters</em>}</li>
 *   <li>{@link core.impl.RootImpl#getSchemas <em>Schemas</em>}</li>
 *   <li>{@link core.impl.RootImpl#getResponses <em>Responses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RootImpl extends MinimalEObjectImpl.Container implements Root {
	/**
	 * The cached value of the '{@link #getApi() <em>Api</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApi()
	 * @generated
	 * @ordered
	 */
	protected API api;

	/**
	 * The cached value of the '{@link #getParamters() <em>Paramters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> paramters;

	/**
	 * The cached value of the '{@link #getSchemas() <em>Schemas</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemas()
	 * @generated
	 * @ordered
	 */
	protected EList<Schema> schemas;

	/**
	 * The cached value of the '{@link #getResponses() <em>Responses</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponses()
	 * @generated
	 * @ordered
	 */
	protected EList<Response> responses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.ROOT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		return api;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		API oldApi = api;
		api = newApi;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.ROOT__API, oldApi, newApi);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != api) {
			NotificationChain msgs = null;
			if (api != null)
				msgs = ((InternalEObject)api).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.ROOT__API, null, msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.ROOT__API, null, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.ROOT__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParamters() {
		if (paramters == null) {
			paramters = new EObjectContainmentEList<Parameter>(Parameter.class, this, OpenAPIPackage.ROOT__PARAMTERS);
		}
		return paramters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Schema> getSchemas() {
		if (schemas == null) {
			schemas = new EObjectContainmentEList<Schema>(Schema.class, this, OpenAPIPackage.ROOT__SCHEMAS);
		}
		return schemas;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Response> getResponses() {
		if (responses == null) {
			responses = new EObjectContainmentEList<Response>(Response.class, this, OpenAPIPackage.ROOT__RESPONSES);
		}
		return responses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.ROOT__API:
				return basicSetApi(null, msgs);
			case OpenAPIPackage.ROOT__PARAMTERS:
				return ((InternalEList<?>)getParamters()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.ROOT__SCHEMAS:
				return ((InternalEList<?>)getSchemas()).basicRemove(otherEnd, msgs);
			case OpenAPIPackage.ROOT__RESPONSES:
				return ((InternalEList<?>)getResponses()).basicRemove(otherEnd, msgs);
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
			case OpenAPIPackage.ROOT__API:
				return getApi();
			case OpenAPIPackage.ROOT__PARAMTERS:
				return getParamters();
			case OpenAPIPackage.ROOT__SCHEMAS:
				return getSchemas();
			case OpenAPIPackage.ROOT__RESPONSES:
				return getResponses();
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
			case OpenAPIPackage.ROOT__API:
				setApi((API)newValue);
				return;
			case OpenAPIPackage.ROOT__PARAMTERS:
				getParamters().clear();
				getParamters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OpenAPIPackage.ROOT__SCHEMAS:
				getSchemas().clear();
				getSchemas().addAll((Collection<? extends Schema>)newValue);
				return;
			case OpenAPIPackage.ROOT__RESPONSES:
				getResponses().clear();
				getResponses().addAll((Collection<? extends Response>)newValue);
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
			case OpenAPIPackage.ROOT__API:
				setApi((API)null);
				return;
			case OpenAPIPackage.ROOT__PARAMTERS:
				getParamters().clear();
				return;
			case OpenAPIPackage.ROOT__SCHEMAS:
				getSchemas().clear();
				return;
			case OpenAPIPackage.ROOT__RESPONSES:
				getResponses().clear();
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
			case OpenAPIPackage.ROOT__API:
				return api != null;
			case OpenAPIPackage.ROOT__PARAMTERS:
				return paramters != null && !paramters.isEmpty();
			case OpenAPIPackage.ROOT__SCHEMAS:
				return schemas != null && !schemas.isEmpty();
			case OpenAPIPackage.ROOT__RESPONSES:
				return responses != null && !responses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RootImpl
