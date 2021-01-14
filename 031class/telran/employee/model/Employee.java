package telran.employee.model;

public class Employee {
	private int id;
	private String name;
	private double salary;
	private double taxAllowance;
	private boolean gender;
	
	public Employee(int id, 
			String name, 
			double salary, 
			double taxAllowance, 
			boolean gender) {
		this.id = id;
		this.name = name;
		setSalary(salary);
		setTaxAllowance(taxAllowance);
		this.gender = gender;
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
		if(taxAllowance >= 0) {
			this.taxAllowance = taxAllowance;
		}else {
			System.out.println("Wrong value of tax allowance");
		}
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public double getSalary(){
		return salary;
	}
	
	public void setSalary(double salary) {
		if(salary > 0) {
			this.salary = salary;
		}else {
			System.out.println("Wrong salary");
		}
	}
	
	public void display() {
		System.out.println("Id = " + id 
				+ ", name = " + name 
				+ ", salary = " + salary
				+ ", tax =" + taxAllowance
				+ ", gender = " + (gender ? "male" : "female"));
	}
}
