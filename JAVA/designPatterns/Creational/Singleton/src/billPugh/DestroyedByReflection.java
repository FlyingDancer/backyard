package billPugh;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class DestroyedByReflection {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		BillPughSingleton instance1 = BillPughSingleton.getInstance();
		BillPughSingleton instance2 = null;
		
		@SuppressWarnings("unchecked")
		Constructor<BillPughSingleton>[] constructors = (Constructor<BillPughSingleton>[]) BillPughSingleton.class.getDeclaredConstructors();
		for (Constructor<BillPughSingleton> constructor : constructors) {
			constructor.setAccessible(true);
			instance2 = (BillPughSingleton) constructor.newInstance();
			break;
		}
		
		System.out.println("instance1: " + instance1.hashCode());
		System.out.println("instance2: " + instance2.hashCode());
		System.out.println(instance1.equals(instance2));	//false
	}

}
