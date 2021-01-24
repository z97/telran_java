package model;

public class MeatFood extends Food {
	// Fields===========================
	private String meatType;

	// Constructors=====================
	public MeatFood(double price, String name, long barcode, boolean kosher, String expDate, String meatType) {
		super(price, name, barcode, kosher, expDate);
		this.meatType = meatType;
	}

	// Getters and Setters===============
	public String getMeatType() {
		return meatType;
	}

	public void setMeatType(String meatType) {
		this.meatType = meatType;
	}

	// Methods===========================
	public String toString() {
		return super.toString() + ", Meat Type: " + meatType;
	}

	public boolean equals(MeatFood other) {
		return super.equals(other) && meatType.equals(other.meatType);
	}

}
