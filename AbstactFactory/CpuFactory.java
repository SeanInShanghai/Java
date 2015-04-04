package AbstractFactory;

public class CpuFactory {
	public static Cpu createCpu(int type){
		Cpu cpu = null;
		if(1 == type){
			cpu = new IntelCpu(755);
		}else if(2 == type){
			cpu = new AmdCpu(938);
		}
		
		return cpu;
	}
}
