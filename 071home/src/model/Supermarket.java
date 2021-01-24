package model;

public class Supermarket {
	// Fields======================
	private long companyId;
	private String name;
	private Product[] products;
	private int size;
	
	//Constructors==================
	public Supermarket(long companyId, String name, int capacity) {
		this.companyId = companyId;
		this.name = name;
		products = new Product[capacity];
	}

	// Getters and Setters=========
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCompanyId() {
		return companyId;
	}

	public Product[] getProducts() {
		return products;
	}

	public int getSize() {
		return size;
	}

	// Methods=====================
	public boolean addProduct(Product product) {
		if (size == products.length || findProduct(product.getBarcode()) != null) {
			return false;
		}
		products[size] = product;
		size++;
		return true;
	}

	public Product findProduct(long barcode) {
		for (int i = 0; i < size; i++) {
			if (products[i].getBarcode() == barcode) {
				return products[i];
			}
		}
		return null;
	}

	public Product removeProduct(long barcode) {
		for (int i = 0; i < size; i++) {
			if (products[i].getBarcode() == barcode) {
				Product deletedProduct = products[i];
				products[i] = products[size - 1];
				size--;
				return deletedProduct;
			}
		}
		return null;
	}

	public void printSupermarket() {
		for (int i = 0; i < size; i++) {
			System.out.println(products[i]);
		}
	}

	public double sumPriceProducts() {
		double sumPrice = 0;
		for (int i = 0; i < size; i++) {
			if (products[i] instanceof Product) {
				sumPrice += products[i].price;
			}
		}
		return sumPrice;
	}

	public double sumPriceMilk() {
		double sumPrice = 0;
		for (int i = 0; i < size; i++) {
			if (products[i] instanceof MilkFood) {
				sumPrice += products[i].getPrice();
			}
		}
		return sumPrice;
	}

	public double sumPriceMeat() {
		double sumPrice = 0;
		for (int i = 0; i < size; i++) {
			if (products[i] instanceof MeatFood) {
				sumPrice += products[i].getPrice();
			}
		}
		return sumPrice;
	}
}
