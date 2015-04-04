package AbstractFactory;

public class IntelMainBoard implements MainBoard{
	private int cpuHoles = 0;
	public IntelMainBoard(int cpuHoles){
		this.cpuHoles = cpuHoles;
	}
	
	@Override
	public void installCPU(){
		System.out.println("Intel Main borad's cpu holes :" + this.cpuHoles);
	}
	
}
