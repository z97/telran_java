package product.food.milkfood;

import product.food.Food;

public class MilkFood extends Food {
	// Fields================
	private String milkType;
	private double fat;

	// Constructors==========
	public MilkFood() {

	}

	public MilkFood(String name, double price, long barcode, boolean kosher, String expDate, String milkType,
			double fat) {
		super(name, price, barcode, kosher, expDate);
		setMilkType(milkType);
		setFat(fat);
	}

	// Getters and setters===
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
		if (fat >= 0 && fat < 100) {
			this.fat = fat;
		} else {
			System.out.println("Percentage of fat can't be more chan 100");
			this.fat = -1;
		}
	}

	// Methods===============
	public String toStrinf() {
		return super.toString() + " Milk type: " + milkType + " Fat: " + fat;
	}
}
