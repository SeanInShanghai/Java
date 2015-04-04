package AbstractFactory;

public class IntelCpu implements Cpu {
	public int pins = 0;
	public IntelCpu(int pins){
		this.pins = pins;
	}
	
	@Override
	public void calculate(){
		System.out.println("Intel cpu's pins number:" + pins);
	}
}
