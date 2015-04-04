package simplefactory;

public class Client {
	public static void main(String[] args){
		ButtonFactory bf = new ButtonFactory();
		char type = 'm';
		Button mybutton = bf.createButton(type);
		System.out.println(mybutton.buttontype());
	}
	
}
