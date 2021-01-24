package telran.computer.model;

public class Smartphone extends Laptop{
	//Fields========================
	private long imei;
	
	//Constructor===================
	public Smartphone(int ram, int hdd, String cpu, String brand, double weight, int battery, long imei) {
		super(ram, hdd, cpu, brand, weight, battery);
		this.imei = imei;
	}
	
	//Methods=======================
	public long getImei() {
		return imei;
	}
	
	public String toString() {
		return super.toString() + " IMEI = " + imei;
	}
}
