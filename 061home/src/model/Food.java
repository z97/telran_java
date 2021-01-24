package model;

public class Food extends Product {
	// Fields==================
	private boolean kosher;
	private String expDate;

	// Constructors============
	public Food(double price, String name, long barcode, boolean kosher, String expDate) {
		super(price, name, barcode);
		this.kosher = kosher;
		this.expDate = expDate;
	}

	// Setters and Getters======
	public boolean isKosher() {
		return kosher;
	}

	public void setKosher(boolean kosher) {
		this.kosher = kosher;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	// Methods===================
	public String toString() {
		return super.toString() + (kosher ? ", kosher" : ", not kosher") + ", Exp Date = " + expDate;
	}

	public boolean equals(Food other) {
		return super.equals(other) && kosher == other.kosher && expDate.equals(other.expDate);
	}
}
