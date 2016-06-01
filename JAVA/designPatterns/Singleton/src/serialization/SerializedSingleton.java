package serialization;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3727828823473611732L;

	private SerializedSingleton(){}
	
	private static class SingletonHelper{
		private static SerializedSingleton INSTANCE = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
