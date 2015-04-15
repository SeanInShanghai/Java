package Adapter;

public class Adapter extends Target {
	Adaptee at = new Adaptee();
	
	@Override
	public void Request(){
		System.out.println("Calling Adaptee");
		at.Tool();
	}
}
