package AbstractFactory;

public class ComputerEngineer {
	private Cpu cpu = null;
	private MainBoard mainboard = null;
	public void makeComputer(int cpuType, int mainboardType){
		prepareHardWare(cpuType, mainboardType);
	}
	
	private void prepareHardWare(int cpuType, int mainboardType){
		this.cpu = CpuFactory.createCpu(cpuType);
		this.mainboard = MainBoardFactory.createMainBorad(mainboardType);
		
		this.cpu.calculate();
		this.mainboard.installCPU();
	}
}
