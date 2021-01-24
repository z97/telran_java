package controller;

import model.Food;
import model.MeatFood;
import model.MilkFood;
import model.Product;
import model.Supermarket;

public class ProductShopAppl {
	public static void main(String[] args) {
		Supermarket point1 = new Supermarket(6453L, "Falafel", 11);
		point1.addProduct(new Product(45, "Prod1", 764577554L));
		point1.addProduct(new Food(34.8, "Food1", 645456675467L, true, "09/12/2022"));
		point1.addProduct(new Food(12, "Food2", 7290002331162L, false, "24/02/2025"));
		point1.addProduct(new MeatFood(18.5, "Meat Food 1", 7674135776L, true, "05/07/2019", "Norm"));
		point1.addProduct(new MeatFood(12.3, "Meat Food 2", 7674175776L, true, "05/08/2019", "Norm"));
		point1.addProduct(new MeatFood(14, "Meat Food 3", 767489749776L, true, "05/01/2019", "Norm"));
		point1.addProduct(new MilkFood(18.5, "Milk Food 1", 7674135778L, false, "05/09/2019", "Good", 7));
		point1.addProduct(new MilkFood(10.5, "Milk Food 2", 7677639776L, false, "05/08/2019", "Good", 2.3));
		point1.addProduct(new MilkFood(17, "Milk Food 3", 76778635576L, false, "05/07/2019", "Norm", 4));
		point1.addProduct(new MilkFood(15, "Milk Food 4", 786789774L, false, "05/07/2019", "Norm", 9));
		point1.printSupermarket();
		System.out.println("Sum price of all products in supermarket: " + point1.sumPriceProducts());
		System.out.println("Sum price of milk products in supermarket: " + point1.sumPriceMilk());
		System.out.println("Sum price of meat products in supermarket: " + point1.sumPriceMeat());
		point1.addProduct(new Food(10, "Food3", 64563453L, true, "07/11/2022"));
		System.out.println("Sum price of all products in supermarket after adding new product: " + point1.sumPriceProducts());
		System.out.println("Deleted product: " + point1.removeProduct(76778635576L));
		System.out.println("Sum price of all products in supermarket after removing product: " + point1.sumPriceProducts());
	}
}
