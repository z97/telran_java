package telran.employee.controller;

import telran.employee.model.Company;
import telran.employee.model.Employee;

public class CompanyAppl {

	public static void main(String[] args) {
		Company firm1 = new Company(397877664L, "Ann and co", 5);
		firm1.addEmployee(new Employee(1000, "John", 5000, 2.25, true));
		firm1.addEmployee(new Employee(2000, "Peter", 5500, 2.25, true));
		firm1.addEmployee(new Employee(3000, "Ann", 20000, 2.25, false));
		System.out.println(firm1.getSize());
		firm1.printCompany();
	}
}
