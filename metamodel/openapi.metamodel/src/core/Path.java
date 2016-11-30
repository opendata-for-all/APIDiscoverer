/**
 */
package core;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link core.Path#getPattern <em>Pattern</em>}</li>
 *   <li>{@link core.Path#getGet <em>Get</em>}</li>
 *   <li>{@link core.Path#getPut <em>Put</em>}</li>
 *   <li>{@link core.Path#getPost <em>Post</em>}</li>
 *   <li>{@link core.Path#getDelete <em>Delete</em>}</li>
 *   <li>{@link core.Path#getOptions <em>Options</em>}</li>
 *   <li>{@link core.Path#getHead <em>Head</em>}</li>
 *   <li>{@link core.Path#getPatch <em>Patch</em>}</li>
 * </ul>
 *
 * @see core.CorePackage#getPath()
 * @model
 * @generated
 */
public interface Path extends ParamterDeclaringContext, ParameterContext {
	/**
	 * Returns the value of the '<em><b>Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern</em>' attribute.
	 * @see #setPattern(String)
	 * @see core.CorePackage#getPath_Pattern()
	 * @model
	 * @generated
	 */
	String getPattern();

	/**
	 * Sets the value of the '{@link core.Path#getPattern <em>Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern</em>' attribute.
	 * @see #getPattern()
	 * @generated
	 */
	void setPattern(String value);

	/**
	 * Returns the value of the '<em><b>Get</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link core.APIOperation#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get</em>' containment reference.
	 * @see #setGet(APIOperation)
	 * @see core.CorePackage#getPath_Get()
	 * @see core.APIOperation#getPath
	 * @model opposite="path" containment="true"
	 * @generated
	 */
	APIOperation getGet();

	/**
	 * Sets the value of the '{@link core.Path#getGet <em>Get</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get</em>' containment reference.
	 * @see #getGet()
	 * @generated
	 */
	void setGet(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Put</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Put</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Put</em>' containment reference.
	 * @see #setPut(APIOperation)
	 * @see core.CorePackage#getPath_Put()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getPut();

	/**
	 * Sets the value of the '{@link core.Path#getPut <em>Put</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Put</em>' containment reference.
	 * @see #getPut()
	 * @generated
	 */
	void setPut(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Post</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(APIOperation)
	 * @see core.CorePackage#getPath_Post()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getPost();

	/**
	 * Sets the value of the '{@link core.Path#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' containment reference.
	 * @see #setDelete(APIOperation)
	 * @see core.CorePackage#getPath_Delete()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getDelete();

	/**
	 * Sets the value of the '{@link core.Path#getDelete <em>Delete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete</em>' containment reference.
	 * @see #getDelete()
	 * @generated
	 */
	void setDelete(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Options</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference.
	 * @see #setOptions(APIOperation)
	 * @see core.CorePackage#getPath_Options()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getOptions();

	/**
	 * Sets the value of the '{@link core.Path#getOptions <em>Options</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Options</em>' containment reference.
	 * @see #getOptions()
	 * @generated
	 */
	void setOptions(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Head</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Head</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Head</em>' containment reference.
	 * @see #setHead(APIOperation)
	 * @see core.CorePackage#getPath_Head()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getHead();

	/**
	 * Sets the value of the '{@link core.Path#getHead <em>Head</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Head</em>' containment reference.
	 * @see #getHead()
	 * @generated
	 */
	void setHead(APIOperation value);

	/**
	 * Returns the value of the '<em><b>Patch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patch</em>' containment reference.
	 * @see #setPatch(APIOperation)
	 * @see core.CorePackage#getPath_Patch()
	 * @model containment="true"
	 * @generated
	 */
	APIOperation getPatch();

	/**
	 * Sets the value of the '{@link core.Path#getPatch <em>Patch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patch</em>' containment reference.
	 * @see #getPatch()
	 * @generated
	 */
	void setPatch(APIOperation value);

} // Path
