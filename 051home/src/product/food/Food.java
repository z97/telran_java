package product.food;

import product.Product;

public class Food extends Product {
	// Fields================
	private boolean kosher;
	private String expDate;

	// Constructors==========
	public Food() {

	}

	public Food(String name, double price, long barcode, boolean kosher, String expDate) {
		super(name, price, barcode);
		setKosher(kosher);
		setExpDate(expDate);
	}

	// Getters and setters===
	public boolean isKosher() {
		return kosher;
	}

	public void setKosher(boolean kosher) {
		if (kosher == true) {
			System.out.println("Yes " + getName() + " is kosher");
			this.kosher = kosher;
		} else {
			System.out.println("No kosher");
			this.kosher = kosher;
		}
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	// Methods===============
	public String toString() {
		return super.toString() + " Kosher:" + kosher + " Exp. date: " + expDate;
	}
}
