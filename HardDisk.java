package harddisk;

public class HardDisk {
	int amount;
	String Brand;
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount=amount;
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	
	
	if(amount>0&&amount<300) {
		amount=amount;
	}
	else{
		System.out.println("ÈÝÁ¿²»¹»Error");
		
		}
	}
}
