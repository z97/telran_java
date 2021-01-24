package telran.computer.controller;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.Smartphone;

public class ComputerShopAppl {

	public static void main(String[] args) {
		Computer[] computers = new Computer[3];
		computers[0] = new Computer(6, 320, "i5", "Dell");
		computers[1] = new Laptop(8, 512, "i7", "Acer", 2.1, 120);
		computers[2] = new Smartphone(6, 64, "Snapdragon", "Samsung", 0.150, 180, 1234567890l);

		printShops(computers);
		if (computers[0] instanceof Laptop) {
			Laptop lapt = (Laptop) computers[0];
			System.out.println(lapt.getBattery());
		}

		int res = getNumbersOfSmartphones(computers);
		System.out.println(res);
		System.out.println(computers[1].getBrand());
		System.out.println(computers[2].getBrand());
		System.out.println("=================");
		Computer comp = new Computer(6, 320, "i5", "Dell");
		boolean check = comp.equals(computers[0]);
		System.out.println(check);
	}

	private static int getNumbersOfSmartphones(Computer[] computers) {
		int count = 0;
		for (int i = 0; i < computers.length; i++) {
			if (computers[i] instanceof Smartphone) {
				count++;
			}
		}
		return count;
	}

	private static void printShops(Computer[] computers) {
		for (int i = 0; i < computers.length; i++) {
			System.out.println(computers[i]);
		}

	}

}
