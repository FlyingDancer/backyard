package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class TryToDestroySolutionByDeserilization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		SerializedSingletonSolution instance1 = SerializedSingletonSolution.getInstance();
		SerializedSingletonSolution instance2 = null;
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("SerializedSingleton.seri"));
		out.writeObject(instance1);
		out.close();
		
		ObjectInput in = new ObjectInputStream(new FileInputStream("SerializedSingleton.seri"));
		instance2 = (SerializedSingletonSolution) in.readObject();
		in.close();
		
		System.out.println("instance1: " + instance1.hashCode());
		System.out.println("instance2: " + instance2.hashCode());
		System.out.println(instance1.equals(instance2));	//true
	}
}
