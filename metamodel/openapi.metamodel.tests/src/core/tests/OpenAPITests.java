/**
 */
package core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>core</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class OpenAPITests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new OpenAPITests("core Tests");
		suite.addTestSuite(APITest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(SchemaTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpenAPITests(String name) {
		super(name);
	}

} //OpenAPITests
