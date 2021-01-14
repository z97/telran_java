package telran.employee.controller;

import telran.employee.model.Employee;

public class EmployeeAppl {
	public static void main(String[] args) {
		Employee john = new Employee(1000, "John", -10000, 2.25, true);
		Employee peter = new Employee(2000, "Peter", 10500, 2.25, true);
		john.setSalary(12000);
		john.display();
		peter.display();
		double totalSalary = john.getSalary() + peter.getSalary();
		System.out.println(totalSalary);
	}
}
