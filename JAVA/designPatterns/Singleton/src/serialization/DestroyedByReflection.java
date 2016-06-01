package serialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DestroyedByReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		SerializedSingleton instance2 = null;
		@SuppressWarnings("unchecked")
		Constructor<SerializedSingleton>[] constructors = (Constructor<SerializedSingleton>[]) SerializedSingleton.class.getDeclaredConstructors();
		for (Constructor<SerializedSingleton> constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = constructor.newInstance();
			break;
		}
		System.out.println("instance1: " + instance1.hashCode());
		System.out.println("instance2: " + instance2.hashCode());
		System.out.println(instance1.equals(instance2));	//false
	}

}
