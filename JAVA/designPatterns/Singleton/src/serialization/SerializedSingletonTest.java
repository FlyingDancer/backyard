package serialization;

public class SerializedSingletonTest {

	public static void main(String[] args) {
		SerializedSingleton instance1 = SerializedSingleton.getInstance();
		SerializedSingleton instance2 = SerializedSingleton.getInstance();
		System.out.println(instance1.equals(instance2));	//true
	}
}
