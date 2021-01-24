package product.food.meatfood;

import product.food.Food;

public class MeatFood extends Food {
	// Fields================
	private String meatType;

	// Constructors==========
	public MeatFood() {

	}

	public MeatFood(String name, double price, long barcode, boolean kosher, String expDate, String meatType) {
		super(name, price, barcode, kosher, expDate);
		this.meatType = meatType;
	}

	// Getters and setters===
	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	// Methods===============
	public String toString() {
		return super.toString() + " Meat type: " + meatType;
	}
}
