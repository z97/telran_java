package telran.bank.model;

public class BankAccount {
	private long account;
	private String owner;
	private String bank;
	private int branch;
	private double amount;

	public BankAccount(long account, String owner, String bank, int branch, double amount) {
		this.account = account;
		this.owner = owner;
		this.bank = bank;
		this.branch = branch;
		this.amount = amount;
	}

	public BankAccount(long account, String bank, int branch, double amount) {
		this.account = account;
		this.bank = bank;
		this.branch = branch;
		this.amount = amount;
	}

	public BankAccount(long account, String owner, String bank, int branch) {
		this.account = account;
		this.owner = owner;
		this.bank = bank;
		this.branch = branch;
	}
	
	public BankAccount(long account, String bank, int branch) {
		this.account = account;
		this.bank = bank;
		this.branch = branch;
	}
	// Getters, setters ========================
	
	
	public long getAccount() {
		return account;
	}

	public void setAccount(long account) {
		this.account = account;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getBranch() {
		return branch;
	}

	public void setBranch(int branch) {
		this.branch = branch;
	}

	public double getAmount() {
		return amount;
	}

	// Methods===========================
	public void debet(double sum) {
		amount += sum;
	}

	public boolean credit(double sum) {
		if (sum <= amount) {
			amount -= sum;
			return true;
		}
		return false;
	}
	
	public void display() {
		System.out.println("owner = " + (owner != null ? owner : "anonimus") + 
				"account = " + account +
				"amount = " + amount + 
				"Bank = " + bank +
				"Branch = " + branch);
	}
}
