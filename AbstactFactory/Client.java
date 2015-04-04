package AbstractFactory;

public class Client {
	public static void main(String[] args)
	{
		ComputerEngineer ce = new ComputerEngineer();
		ce.makeComputer(1, 2);
	}
}
