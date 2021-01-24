package telran.computer.controller;

import telran.computer.model.Computer;
import telran.computer.model.Laptop;
import telran.computer.model.Smartphone;

public class ComputerAppl {

	public static void main(String[] args) {
		Computer comp1 = new Computer(6, 320, "i5", "Dell");
		Laptop lapt1 = new Laptop(8, 512, "i7", "Acer", 2.1, 120);

		comp1.display();
		System.out.println();
		lapt1.display();
		System.out.println();
		lapt1.setRam(12);
		System.out.println(lapt1.getRam());
		System.out.println(comp1.getRam());
		
		Computer comp2 = new Computer();
		comp2.setCpu("i7");
		comp2.setRam(24);
		comp2.setHdd(2048);
		comp2.setBrand("Pupkin");
		comp2.display();
		System.out.println();
		
		Smartphone smart1 = new Smartphone(6, 64, "smap", "Samsung", 0.150, 180, 12345867);
		smart1.display();
		System.out.println();
		System.out.println(comp1);
		System.out.println(lapt1);
		System.out.println(smart1);
	}
}
