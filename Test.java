package test;

import cpu.Cpu;
import harddisk.HardDisk;
import pc.Pc;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cpu cpu=new Cpu();
		HardDisk HD=new HardDisk();
		cpu.setSpeed(2200);
		HD.setAmount(200);
		cpu.setPrice(1000);
		HD.setBrand("БЄПл");
		Pc pc=new Pc();
		pc.setCPU(cpu);
		pc.setHardDisk(HD);
		pc.show();

	}

}
