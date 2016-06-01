package serialization;

import java.io.Serializable;

public class SerializedSingletonSolution implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5386764984741024220L;

	private SerializedSingletonSolution(){}
	
	private static class SingletonHelper{
		private static SerializedSingletonSolution INSTANCE = new SerializedSingletonSolution();
	}
	
	/**
	 * Referencing form {@link java.io.Serializable}<p>
	 * Classes that need to designate a replacement when an instance of it
	 * is read from the stream should implement this special method with the
	 * exact signature.
	 * @return
	 */
	protected Object readResolve() {
		return getInstance();
	}
	
	public static SerializedSingletonSolution getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
