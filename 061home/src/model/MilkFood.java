package model;

public class MilkFood extends Food {
	// Fields==========================
	private String milkType;
	private double fat;

	// Constructors====================
	public MilkFood(double price, String name, long barcode, boolean kosher, String expDate, String milkType,
			double fat) {
		super(price, name, barcode, kosher, expDate);
		this.milkType = milkType;
		this.fat = fat;
	}

	// Getters and Setters=============
	public String getMilkType() {
		return milkType;
	}

	public void setMilkType(String milkType) {
		this.milkType = milkType;
	}

	public double getFat() {
		return fat;
	}

	public void setFat(double fat) {
		this.fat = fat;
	}

	// Methods==========================
	public String toString() {
		return super.toString() + ", Milk Type:" + milkType + ", Fat: " + fat + "%";
	}

	public boolean equals(MilkFood other) {
		return super.equals(other) && milkType.equals(other.milkType) && fat == other.fat;
	}
}
