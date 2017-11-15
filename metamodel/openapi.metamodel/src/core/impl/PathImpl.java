/**
 */
package core.impl;

import core.OpenAPIPackage;
import core.Operation;
import core.Parameter;
import core.ParameterContext;
import core.Path;

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
 * An implementation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link core.impl.PathImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link core.impl.PathImpl#getPattern <em>Pattern</em>}</li>
 *   <li>{@link core.impl.PathImpl#getGet <em>Get</em>}</li>
 *   <li>{@link core.impl.PathImpl#getPut <em>Put</em>}</li>
 *   <li>{@link core.impl.PathImpl#getPost <em>Post</em>}</li>
 *   <li>{@link core.impl.PathImpl#getDelete <em>Delete</em>}</li>
 *   <li>{@link core.impl.PathImpl#getOptions <em>Options</em>}</li>
 *   <li>{@link core.impl.PathImpl#getHead <em>Head</em>}</li>
 *   <li>{@link core.impl.PathImpl#getPatch <em>Patch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathImpl extends ParamterDeclaringContextImpl implements Path {
	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> parameters;

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
	 * The cached value of the '{@link #getGet() <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGet()
	 * @generated
	 * @ordered
	 */
	protected Operation get;

	/**
	 * The cached value of the '{@link #getPut() <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPut()
	 * @generated
	 * @ordered
	 */
	protected Operation put;

	/**
	 * The cached value of the '{@link #getPost() <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPost()
	 * @generated
	 * @ordered
	 */
	protected Operation post;

	/**
	 * The cached value of the '{@link #getDelete() <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelete()
	 * @generated
	 * @ordered
	 */
	protected Operation delete;

	/**
	 * The cached value of the '{@link #getOptions() <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected Operation options;

	/**
	 * The cached value of the '{@link #getHead() <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHead()
	 * @generated
	 * @ordered
	 */
	protected Operation head;

	/**
	 * The cached value of the '{@link #getPatch() <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatch()
	 * @generated
	 * @ordered
	 */
	protected Operation patch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OpenAPIPackage.Literals.PATH;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__PATTERN, oldPattern, pattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectResolvingEList<Parameter>(Parameter.class, this, OpenAPIPackage.PATH__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getGet() {
		return get;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGet(Operation newGet, NotificationChain msgs) {
		Operation oldGet = get;
		get = newGet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__GET, oldGet, newGet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGet(Operation newGet) {
		if (newGet != get) {
			NotificationChain msgs = null;
			if (get != null)
				msgs = ((InternalEObject)get).eInverseRemove(this, OpenAPIPackage.OPERATION__PATH, Operation.class, msgs);
			if (newGet != null)
				msgs = ((InternalEObject)newGet).eInverseAdd(this, OpenAPIPackage.OPERATION__PATH, Operation.class, msgs);
			msgs = basicSetGet(newGet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__GET, newGet, newGet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPut() {
		return put;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPut(Operation newPut, NotificationChain msgs) {
		Operation oldPut = put;
		put = newPut;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__PUT, oldPut, newPut);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPut(Operation newPut) {
		if (newPut != put) {
			NotificationChain msgs = null;
			if (put != null)
				msgs = ((InternalEObject)put).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__PUT, null, msgs);
			if (newPut != null)
				msgs = ((InternalEObject)newPut).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__PUT, null, msgs);
			msgs = basicSetPut(newPut, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__PUT, newPut, newPut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPost() {
		return post;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPost(Operation newPost, NotificationChain msgs) {
		Operation oldPost = post;
		post = newPost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__POST, oldPost, newPost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPost(Operation newPost) {
		if (newPost != post) {
			NotificationChain msgs = null;
			if (post != null)
				msgs = ((InternalEObject)post).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__POST, null, msgs);
			if (newPost != null)
				msgs = ((InternalEObject)newPost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__POST, null, msgs);
			msgs = basicSetPost(newPost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__POST, newPost, newPost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getDelete() {
		return delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelete(Operation newDelete, NotificationChain msgs) {
		Operation oldDelete = delete;
		delete = newDelete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__DELETE, oldDelete, newDelete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelete(Operation newDelete) {
		if (newDelete != delete) {
			NotificationChain msgs = null;
			if (delete != null)
				msgs = ((InternalEObject)delete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__DELETE, null, msgs);
			if (newDelete != null)
				msgs = ((InternalEObject)newDelete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__DELETE, null, msgs);
			msgs = basicSetDelete(newDelete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__DELETE, newDelete, newDelete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getOptions() {
		return options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOptions(Operation newOptions, NotificationChain msgs) {
		Operation oldOptions = options;
		options = newOptions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__OPTIONS, oldOptions, newOptions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptions(Operation newOptions) {
		if (newOptions != options) {
			NotificationChain msgs = null;
			if (options != null)
				msgs = ((InternalEObject)options).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__OPTIONS, null, msgs);
			if (newOptions != null)
				msgs = ((InternalEObject)newOptions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__OPTIONS, null, msgs);
			msgs = basicSetOptions(newOptions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__OPTIONS, newOptions, newOptions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getHead() {
		return head;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHead(Operation newHead, NotificationChain msgs) {
		Operation oldHead = head;
		head = newHead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__HEAD, oldHead, newHead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHead(Operation newHead) {
		if (newHead != head) {
			NotificationChain msgs = null;
			if (head != null)
				msgs = ((InternalEObject)head).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__HEAD, null, msgs);
			if (newHead != null)
				msgs = ((InternalEObject)newHead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__HEAD, null, msgs);
			msgs = basicSetHead(newHead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__HEAD, newHead, newHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getPatch() {
		return patch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatch(Operation newPatch, NotificationChain msgs) {
		Operation oldPatch = patch;
		patch = newPatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__PATCH, oldPatch, newPatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatch(Operation newPatch) {
		if (newPatch != patch) {
			NotificationChain msgs = null;
			if (patch != null)
				msgs = ((InternalEObject)patch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__PATCH, null, msgs);
			if (newPatch != null)
				msgs = ((InternalEObject)newPatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__PATCH, null, msgs);
			msgs = basicSetPatch(newPatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OpenAPIPackage.PATH__PATCH, newPatch, newPatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.PATH__GET:
				if (get != null)
					msgs = ((InternalEObject)get).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - OpenAPIPackage.PATH__GET, null, msgs);
				return basicSetGet((Operation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case OpenAPIPackage.PATH__GET:
				return basicSetGet(null, msgs);
			case OpenAPIPackage.PATH__PUT:
				return basicSetPut(null, msgs);
			case OpenAPIPackage.PATH__POST:
				return basicSetPost(null, msgs);
			case OpenAPIPackage.PATH__DELETE:
				return basicSetDelete(null, msgs);
			case OpenAPIPackage.PATH__OPTIONS:
				return basicSetOptions(null, msgs);
			case OpenAPIPackage.PATH__HEAD:
				return basicSetHead(null, msgs);
			case OpenAPIPackage.PATH__PATCH:
				return basicSetPatch(null, msgs);
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
			case OpenAPIPackage.PATH__PARAMETERS:
				return getParameters();
			case OpenAPIPackage.PATH__PATTERN:
				return getPattern();
			case OpenAPIPackage.PATH__GET:
				return getGet();
			case OpenAPIPackage.PATH__PUT:
				return getPut();
			case OpenAPIPackage.PATH__POST:
				return getPost();
			case OpenAPIPackage.PATH__DELETE:
				return getDelete();
			case OpenAPIPackage.PATH__OPTIONS:
				return getOptions();
			case OpenAPIPackage.PATH__HEAD:
				return getHead();
			case OpenAPIPackage.PATH__PATCH:
				return getPatch();
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
			case OpenAPIPackage.PATH__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
				return;
			case OpenAPIPackage.PATH__PATTERN:
				setPattern((String)newValue);
				return;
			case OpenAPIPackage.PATH__GET:
				setGet((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__PUT:
				setPut((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__POST:
				setPost((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__DELETE:
				setDelete((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__OPTIONS:
				setOptions((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__HEAD:
				setHead((Operation)newValue);
				return;
			case OpenAPIPackage.PATH__PATCH:
				setPatch((Operation)newValue);
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
			case OpenAPIPackage.PATH__PARAMETERS:
				getParameters().clear();
				return;
			case OpenAPIPackage.PATH__PATTERN:
				setPattern(PATTERN_EDEFAULT);
				return;
			case OpenAPIPackage.PATH__GET:
				setGet((Operation)null);
				return;
			case OpenAPIPackage.PATH__PUT:
				setPut((Operation)null);
				return;
			case OpenAPIPackage.PATH__POST:
				setPost((Operation)null);
				return;
			case OpenAPIPackage.PATH__DELETE:
				setDelete((Operation)null);
				return;
			case OpenAPIPackage.PATH__OPTIONS:
				setOptions((Operation)null);
				return;
			case OpenAPIPackage.PATH__HEAD:
				setHead((Operation)null);
				return;
			case OpenAPIPackage.PATH__PATCH:
				setPatch((Operation)null);
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
			case OpenAPIPackage.PATH__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case OpenAPIPackage.PATH__PATTERN:
				return PATTERN_EDEFAULT == null ? pattern != null : !PATTERN_EDEFAULT.equals(pattern);
			case OpenAPIPackage.PATH__GET:
				return get != null;
			case OpenAPIPackage.PATH__PUT:
				return put != null;
			case OpenAPIPackage.PATH__POST:
				return post != null;
			case OpenAPIPackage.PATH__DELETE:
				return delete != null;
			case OpenAPIPackage.PATH__OPTIONS:
				return options != null;
			case OpenAPIPackage.PATH__HEAD:
				return head != null;
			case OpenAPIPackage.PATH__PATCH:
				return patch != null;
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
		if (baseClass == ParameterContext.class) {
			switch (derivedFeatureID) {
				case OpenAPIPackage.PATH__PARAMETERS: return OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS;
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
		if (baseClass == ParameterContext.class) {
			switch (baseFeatureID) {
				case OpenAPIPackage.PARAMETER_CONTEXT__PARAMETERS: return OpenAPIPackage.PATH__PARAMETERS;
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
		result.append(" (pattern: ");
		result.append(pattern);
		result.append(')');
		return result.toString();
	}

} //PathImpl
