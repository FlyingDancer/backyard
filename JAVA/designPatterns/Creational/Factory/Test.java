package factory;

public class Test {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(ComputerTypes.PC, "2 GB", "500 GB", "2.4 GHz");
		Computer server = ComputerFactory.getComputer(ComputerTypes.SERVER, "16 GB", "1 TB", "3.4 GHz");
		
		System.out.println(pc.toString());
		System.out.println(server.toString());
	}
}
