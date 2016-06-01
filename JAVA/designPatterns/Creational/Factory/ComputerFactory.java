package factory;

/**
 * Benefits of Factory Pattern:<p>
 * 1. Code for interface rather than implementation.
 * 2. More robust, less coupled and easy to extend.
 * 3. Provides abstraction between implementation and client classes through inheritance.
 * @author gale
 *
 */
public class ComputerFactory {

	public static Computer getComputer(String type, String ram, String hdd, String cpu) {
		if (ComputerTypes.PC.equals(type)) {
			return new PC(ram, hdd, cpu);
		} else if(ComputerTypes.SERVER.equals(type)) {
			return new Server(ram, hdd, cpu);
		}
		return null;
	}
}
