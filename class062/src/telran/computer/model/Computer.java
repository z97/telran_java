package telran.computer.model;

public class Computer {
	protected int ram;
	protected int hdd;
	protected String cpu;
	protected String brand;

	public Computer() {
	}

	public Computer(int ram, int hdd, String cpu, String brand) {
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
		this.brand = brand;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getHdd() {
		return hdd;
	}

	public void setHdd(int hdd) {
		this.hdd = hdd;
	}

	public String getCpu() {
		return cpu;
	}

	public void setCpu(String cpu) {
		this.cpu = cpu;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String toString() {
		return "Brand=" + brand + ", CPU=" + cpu + ", RAM=" 
				+ ram + ", hard disk=" + hdd;
	}
	
	public boolean equals(Computer other) {
		return ram == other.ram && hdd == other.hdd 
				&& cpu.equals(other.cpu) && brand.equals(other.brand);
	}

}
