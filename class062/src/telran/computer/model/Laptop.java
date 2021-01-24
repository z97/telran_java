package telran.computer.model;

public class Laptop extends Computer {
	private double weight;
	private int battery;

	public Laptop(int ram, int hdd, String cpu, String brand, double weight, int battery) {
		super(ram, hdd, cpu, brand);
		this.weight = weight;
		this.battery = battery;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}
	
	public String getBrand() {
		return brand + " (Laptop)";
	}

	public String toString() {
		return super.toString() + ", weight=" + weight + ", battery=" + battery;
	}
	
	public boolean equals(Laptop other) {
		return super.equals(other) && weight == other.weight
				&& battery == other.battery;
	}

}
