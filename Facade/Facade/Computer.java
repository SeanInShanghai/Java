package Facade;
import SubComponent.*;
public class Computer {
	CPU cpu;
	Memory memory;
	HardDrive harddrive;
	public Computer(){
		cpu = new CPU();
		memory = new Memory();
		harddrive = new HardDrive();
	}
	
	public void start(){
		if(cpu.start() && memory.start() && harddrive.start())
		{
			System.out.println("Computer started");
		}else{
			System.out.println("Computer start failed");
		}
	}
	
}
