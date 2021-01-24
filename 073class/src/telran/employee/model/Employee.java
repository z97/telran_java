package telran.employee.model;

public class Employee {
	//Fields======================
	private int id;
	private String name;
	private double salary;
	private double taxAllowance;
	private boolean gender;

	//Constructors=================
	public Employee(int id, String name, double salary, double taxAllowance, boolean gender) {
		this.id = id;
		this.name = name;
		setSalary(salary);
		setTaxAllowance(taxAllowance);
		this.gender = gender;
	}
	
	//Getters and Setters===========
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTaxAllowance() {
		return taxAllowance;
	}

	public void setTaxAllowance(double taxAllowance) {
		if (taxAllowance >= 0) {
			this.taxAllowance = taxAllowance;
		} else {
			System.out.println("Wrong value of tax allowance");
		}
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary = salary;
		} else {
			System.out.println("Wrong value of salary");
		}
	}
	
	//Methods=======================
	public double getTaxIsrael() {
		double tax = taxIsrael();
		return tax >= 0 ? tax : 0;
	}

	private double taxIsrael() {
		double tax = -taxAllowance * 219;
		double[] levels = { 0, 6330, 9080, 14580, 20260, 42160, 54300 };
		double[] rates = { 0.1, 0.14, 0.2, 0.31, 0.35, 0.47, 0.5 };
		for (int i = 0; i < levels.length - 1; i++) {
			if (salary > levels[i] && salary <= levels[i + 1]) {
				return tax + (salary - levels[i]) * rates[i];
			} else {
				tax = tax + (levels[i + 1] - levels[i]) * rates[i];
			}
		}
		return tax + (salary - levels[levels.length - 1]) * rates[rates.length - 1];
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", gender="
				+ (gender ? "male" : "female") + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) obj;
		if (id != other.id) {
			return false;
		}
		return true;
	}

}
