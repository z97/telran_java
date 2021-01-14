package telran.bank.controller;

import telran.bank.model.BankAccount;

public class BankAppl {

	public static void main(String[] args) {
		//int[] numbers = new int[4];
		BankAccount[] bank = new BankAccount[4];
		bank[0] = new BankAccount(1000, "Peter", "Prime", 123, 100);
		bank[1] = new BankAccount(2000, "Maria", "Prime", 123);
		bank[2] = new BankAccount(3000, "Pupkin and sons", 999, 1_000_000);
		bank[3] = new BankAccount(4000, "Pupkin and sons", 999);		
		for (int i = 0; i < bank.length; i++) {
			bank[i].display();
		}
	}
}
