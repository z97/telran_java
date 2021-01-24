package telran.employee.controller;

import telran.employee.model.Company;
import telran.employee.model.Employee;

public class CompanyAppl {

	public static void main(String[] args) {
		Company firm1 = new Company(397952147925l, "Ann and Co", 5);
		firm1.addEmployee(new Employee(1000, "John", 5000, 2.25, true));
		firm1.addEmployee(new Employee(2000, "Peter", 5500, 2.25, true));
		firm1.addEmployee(new Employee(3000, "Ann", 20000, 2.75, false));
		System.out.println(firm1.getSize());
		firm1.printCompany();
		double totalSalary = firm1.totalSalary();
		System.out.println("Total salary = " + totalSalary);
		Employee employee = firm1.findEmployee(3000);
		System.out.println(employee);
		System.out.println(firm1.addEmployee(new Employee(1000, "John", 5000, 2.25, true)));
		System.out.println(firm1.getSize());
		System.out.println(firm1.addEmployee(new Employee(4000, "Tigran", 5000, 2.25, true)));
		System.out.println(firm1.getSize());
		System.out.println(firm1.addEmployee(new Employee(5000, "Patrik", 5000, 2.25, true)));
		System.out.println(firm1.addEmployee(new Employee(6000, "Mary", 5000, 2.75, false)));
		firm1.printCompany();
		employee = firm1.removeEmployee(2000);
		System.out.println(employee);
		System.out.println(firm1.getSize());
		firm1.printCompany();
		employee = firm1.findEmployee(3000);
		System.out.println(employee.getTaxIsrael());

	}

}
