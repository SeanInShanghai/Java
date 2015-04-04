package AbstractFactory;

public class AmdCpu implements Cpu {
	public int pins;
	public AmdCpu(int pins){
		this.pins = pins;
	}
	
	@Override
	public void calculate(){
		System.out.println("Amd Cpu's pins number:" + pins);
	}
}
