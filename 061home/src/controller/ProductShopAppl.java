package controller;

import model.Food;
import model.MeatFood;
import model.MilkFood;
import model.Product;

public class ProductShopAppl {
	public static void main(String[] args) {
		Product[] products = new Product[10];
		products[0] = new Product(45.8, "Prod1", 76434577554L);
		products[1] = new Food(34.86, "Food1", 645456675467L, true, "09/12/2022");
		products[2] = new Food(12, "Food2", 7290002331162L, false, "24/02/2025");
		products[3] = new MeatFood(18.5, "Meat Food 1", 7674135776L, true, "05/07/2019", "Norm");
		products[4] = new MeatFood(12.3, "Meat Food 2", 7674135776L, true, "05/08/2019", "Norm");
		products[5] = new MeatFood(14, "Meat Food 3", 767489789776L, true, "05/01/2019", "Norm");
		products[6] = new MilkFood(18.5, "Milk Food 1", 7674135776L, false, "05/09/2019", "Good", 7);
		products[7] = new MilkFood(10.5, "Milk Food 2", 7677635776L, false, "05/08/2019", "Good", 2.3);
		products[8] = new MilkFood(17, "Milk Food 3", 76778635776L, false, "05/07/2019", "Norm", 4);
		products[9] = new MilkFood(15, "Milk Food 4", 786785776L, false, "05/07/2019", "Norm", 9);
		printShops(products);
		System.out.println("Sum price of milk: " + sumPriceMilk(products) + "nis.");
		System.out.println("Sum price of meat: " + sumPriceMeat(products) + "nis.");
	}
	
	//Methods=========================
	private static void printShops(Product[] products) {
		for (int i = 0; i < products.length; i++) {
			System.out.println(products[i]);
		}
	}

	private static double sumPriceMilk(Product[] products) {
		double sumPrice = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] instanceof MilkFood) {
				sumPrice += products[i].getPrice();
			}
		}
		return sumPrice;
	}

	private static double sumPriceMeat(Product[] products) {
		double sumPrice = 0;
		for (int i = 0; i < products.length; i++) {
			if (products[i] instanceof MeatFood) {
				sumPrice += products[i].getPrice();
			}
		}
		return sumPrice;
	}

}
