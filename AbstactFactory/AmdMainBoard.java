package AbstractFactory;

public class AmdMainBoard implements MainBoard{
	private int cpuHoles = 0;
	
	public AmdMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCPU(){
		System.out.println("Amd mainboard cpu holes :" + cpuHoles);
	}

}
