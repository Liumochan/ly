package pc;

import cpu.Cpu;
import harddisk.HardDisk;

public class Pc {
	Cpu cpu;
	HardDisk HD;
	public void setCPU(Cpu cpu) {
		this.cpu=cpu;
	}
	public void setHardDisk(HardDisk HD) {
		this.HD=HD;
		
	}
	public void show() {
		System.out.println("CPU速度: "+cpu.getSpeed());
		System.out.println("硬盘容量: "+HD.getAmount());
		System.out.println("CPU价格: "+cpu.getPrice());
		System.out.println("硬盘品牌: "+HD.getBrand());
	}

}
