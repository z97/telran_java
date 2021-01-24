package telran.computer.model;

public class Laptop extends Computer{
	//Computer is super class for Laptop
	// Fields==========================
	private double weight;
	private int battery;
	
	//Constructors=====================
	public Laptop(int ram, int hdd, String cpu, String brand, double weight, int battery) {
		super(ram, hdd, cpu, brand);
		this.weight = weight;
		this.battery = battery;
	}
	
	//Getters and Setters==============
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
		return brand + "(Laptop)";
	}
	
	//Methods=============================
	public String toString() {
		return super.toString() + " Weight = " + weight +
				" Battery = " + battery;
	}
	
	public boolean equals(Laptop other) {
		return super.equals(other) && weight == other.weight && battery == other.battery;
	}
}
