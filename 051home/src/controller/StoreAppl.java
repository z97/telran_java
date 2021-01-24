package controller;

import product.Product;
import product.food.meatfood.MeatFood;
import product.food.milkfood.MilkFood;

public class StoreAppl {

	public static void main(String[] args) {
		Product dentalFloss = new Product("Oral B Essential floss", 12, 5010622005012l);
		System.out.println(dentalFloss);
		System.out.println();

		Product something = new Product("abc", -55, 736785);
		System.out.println(something);
		System.out.println();

		Product water = new Product("Water", 12, 7290013038432l);
		System.out.println(water);
		System.out.println();

		MeatFood food1 = new MeatFood("abcd", 55, 6554433, false, "03/04/2023", "meat");
		System.out.println(food1);
		System.out.println();

		MilkFood butter = new MilkFood("Butter", 5, 7290000043111l, true, "07/09/2021", "butter", 8.5);
		System.out.println(butter);
		System.out.println();
	}

}
