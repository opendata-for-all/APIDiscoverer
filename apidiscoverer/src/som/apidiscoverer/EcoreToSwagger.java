package som.apidiscoverer;

import java.util.HashMap;
import java.util.Map;


import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import core.Api;
import core.CoreFactory;
import core.CorePackage;
import core.JsonDataType;
import core.Schema;

public class EcoreToSwagger {

	public static Api getSchemaFromEcore(EPackage ePackage) {
		CorePackage.eINSTANCE.eClass();
		CoreFactory coreFactory = CoreFactory.eINSTANCE;
		Map<EClass, Schema> map = new HashMap<EClass, Schema>();
		Api api = coreFactory.createApi();
		for (EObject object : ePackage.getEClassifiers()) {
			if (object instanceof EClass) {
				EClass eClass = (EClass) object;
				Schema schema = coreFactory.createSchema();
				schema.setName(eClass.getName());
				schema.setType(JsonDataType.OBJECT);
				map.put(eClass, schema);
				api.getDefinitions().add(schema);
				for (EAttribute eAttribute : eClass.getEAttributes()) {
					if (eAttribute.getUpperBound() == 1) {
						Schema property = coreFactory.createSchema();
						property.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
						property.setName(eAttribute.getName());
						api.getPrimitiveDefinitions().add(property);
						schema.getProperties().add(property);
					} else {
						Schema arrayProperty = coreFactory.createSchema();
						arrayProperty.setName(eAttribute.getName());
						arrayProperty.setType(JsonDataType.ARRAY);
						Schema items = coreFactory.createSchema();
						items.setType(getJsonTypeFromECoreType(eAttribute.getEAttributeType()));
						arrayProperty.setItems(arrayProperty);
						api.getPrimitiveDefinitions().add(arrayProperty);
						schema.getProperties().add(arrayProperty);
					}
				}

			}

		}
		// resolving references
		for (EObject object : ePackage.getEClassifiers()) {
			if (object instanceof EClass) {
				EClass eClass = (EClass) object;
				Schema schema = map.get(eClass);
				for (EReference eReference : eClass.getEReferences()) {
					if (eReference.getUpperBound() == 1) {
						Schema property = map.get((EClass) eReference.getEType());
						System.out.println(property.getName());
						schema.getProperties().add(property);
					} else {
						Schema arrayProperty = coreFactory.createSchema();
						arrayProperty.setType(JsonDataType.ARRAY);
					api.getPrimitiveDefinitions().add(arrayProperty);
						Schema items = map.get((EClass) eReference.getEType());
						System.out.println(items.getName());
						arrayProperty.setItems(items);
					}

				}
			}

		}
		return api;
	}

	private static JsonDataType getJsonTypeFromECoreType(EDataType eAttributeType) {
		if (eAttributeType.getName().equals("EString"))
			return JsonDataType.STRING;
		if (eAttributeType.getName().equals("EInt"))
			return JsonDataType.INTEGER;
		return null;
	}
}
