package billPugh;

public class BillPughSingleton {

	private BillPughSingleton(){};
	
	private static class SingletonHleper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHleper.INSTANCE;
	}
}
