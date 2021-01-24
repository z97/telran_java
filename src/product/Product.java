package product;

public class Product {
	// Fields================
	private String name;
	private double price;
	private long barcode;

	// Constructors==========
	public Product() {

	}

	public Product(String name, double price, long barcode) {
		setName(name);
		setPrice(price);
		setBarcode(barcode);
	}

	// Getters and Setters===
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price can`t be negative");
			this.price = -1;
		}
	}

	public long getBarcode() {
		return barcode;
	}

	public void setBarcode(long barcode) {
		if (checkControlSum(barcode) == true) {
			this.barcode = barcode;
		} else {
			System.out.println("Barcode " + barcode + " is not valide");
			this.barcode = -1;
		}
	}

	// Methods===============
	public String toString() {
		return "Name: " + name + " Price: " + price + " Barcode: " + barcode;
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
