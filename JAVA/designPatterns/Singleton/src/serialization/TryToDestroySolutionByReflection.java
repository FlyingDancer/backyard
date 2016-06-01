package serialization;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class TryToDestroySolutionByReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SerializedSingletonSolution instance1 = SerializedSingletonSolution.getInstance();
		SerializedSingletonSolution instance2 = null;
		@SuppressWarnings("unchecked")
		Constructor<SerializedSingletonSolution>[] constructors = (Constructor<SerializedSingletonSolution>[]) SerializedSingletonSolution.class.getDeclaredConstructors();
		for (Constructor<SerializedSingletonSolution> constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = constructor.newInstance();		//Exception in thread "main" java.lang.IllegalArgumentException: wrong number of arguments
			break;
		}
		System.out.println("instance1: " + instance1.hashCode());
		System.out.println("instance2: " + instance2.hashCode());
		System.out.println(instance1.equals(instance2));
	}
}
