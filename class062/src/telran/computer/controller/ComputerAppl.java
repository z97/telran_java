package telran.computer.controller;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.Smartphone;

public class ComputerAppl {

	public static void main(String[] args) {
		Computer comp1 = new Computer(6, 320, "i5", "Dell");
		Computer lapt1 = new Laptop(8, 512, "i7", "Acer", 2.1, 120);
		Computer smart1 = new Smartphone(6, 64, "Snapdragon", "Samsung", 0.150, 180, 1234567890l);
		System.out.println(comp1);
		System.out.println(lapt1);
		System.out.println(smart1);
		System.out.println("===============");
		Computer comp2 = comp1;
		comp1.setRam(12);
		System.out.println(comp2);
		System.out.println(comp2.getRam());
		System.out.println(comp1.getRam());
		System.out.println("===============");
		
			
	}

}
