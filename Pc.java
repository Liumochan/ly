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
		System.out.println("CPU�ٶ�: "+cpu.getSpeed());
		System.out.println("Ӳ������: "+HD.getAmount());
		System.out.println("CPU�۸�: "+cpu.getPrice());
		System.out.println("Ӳ��Ʒ��: "+HD.getBrand());
	}

}
