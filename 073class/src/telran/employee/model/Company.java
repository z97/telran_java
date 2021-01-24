package telran.employee.model;

public class Company {
	private long companyId;
	private String name;
	private Employee[] employees;
	private int size;

	public Company(long companyId, String name, int capacity) {
		this.companyId = companyId;
		this.name = name;
		employees = new Employee[capacity];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getCompanyId() {
		return companyId;
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public int getSize() {
		return size;
	}

	public boolean addEmployee(Employee employee) {
		if (size == employees.length || findEmployee(employee.getId()) != null) {
			return false;
		}
		employees[size] = employee;
		size++;
		return true;
	}

	public Employee removeEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if (employees[i].getId() == id) {
				Employee victim = employees[i];
				employees[i] = employees[size - 1];
				size--;
				return victim;
			}
		}
		return null;
	}

	public Employee findEmployee(int id) {
		for (int i = 0; i < size; i++) {
			if (employees[i].getId() == id) {
				return employees[i];
			}
		}
		return null;
	}

	public double totalSalary() {
		double sum = 0;
		for (int i = 0; i < size; i++) {
			sum += employees[i].getSalary();
		}
		return sum;
	}

	public void printCompany() {
		for (int i = 0; i < size; i++) {
			System.out.println(employees[i]);
		}
	}

}
