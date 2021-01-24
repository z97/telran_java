package telran.computer.model;

public class Smartphone extends Laptop{
	private long imei;

	public Smartphone(int ram, int hdd, String cpu, String brand, double weight, int battery, long imei) {
		super(ram, hdd, cpu, brand, weight, battery);
		this.imei = imei;
	}

	public long getImei() {
		return imei;
	}
	
	public String getBrand() {
		return brand + " (Smartphone)";
	}

	public String toString() {
		return super.toString() + ", IMEI=" + imei;
	}
	
	public boolean equals(Smartphone other) {
		return imei == other.imei;
	}

}
