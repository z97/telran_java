package model;

public class Product {
	// Fields=========================
	protected double price;
	protected String name;
	protected long barcode;

	// Constructors===================
	public Product() {

	}

	public Product(double price, String name, long barcode) {
		this.price = price;
		this.name = name;
		this.barcode = barcode;
	}

	// Setters and Getters==============
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		this.barcode = barcode;
	}

	// Methods===========================
	public String toString() {
		return "Price = " + price + "nis., Name = " + name + ", Barcode = " + barcode + (checkControlSum(barcode) ? ", barcode is valid " : ", barcode is not valid ");
	}

	public boolean equals(Product other) {
		return price == other.price && name.equals(other.name) && barcode == other.barcode;
	}

	public boolean checkControlSum(long num) {
		long sum = 0;
		long x = 0;
		long controlSum1 = num % 10;
		long controlSum2 = 0;
		num /= 10;
		for (int i = 0; i < 6; i++) {
			sum += num % 10 * 3;
			num /= 10;
			sum += num % 10 * 1;
			num /= 10;
		}
		if (sum % 10 == 0) {
			controlSum2 = 0;
		} else {
			x = (sum / 10 + 1) * 10;
			controlSum2 = x - sum;
		}
		if (controlSum2 == controlSum1) {
			return true;
		} else {
			return false;
		}
	}
}
