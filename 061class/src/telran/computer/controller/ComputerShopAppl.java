package telran.computer.controller;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.Smartphone;

public class ComputerShopAppl {

	public static void main(String[] args) {
		Computer[] computers = new Computer[3];
		computers[0] = new Computer(6, 320, "i5", "Dell"); // uppercasting
		computers[1] = new Laptop(8, 512, "i7", "Acer", 2.1, 120); // uppercasting
		computers[2] = new Smartphone(6, 64, "smap", "Samsung", 0.150, 180, 12345867);// uppercasting

		printShops(computers);
		if (computers[1] instanceof Laptop) {
			Laptop lapt = (Laptop) computers[1]; // downcasting
			System.out.println(lapt.getBattery());
		}

		int res = getNumbersOfSmartphones(computers);
		System.out.println(res);
		System.out.println(computers[1]);
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
