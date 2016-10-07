package PS3;
import java.util.Date;

public class Account {
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account() {
		super();
	}

	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
	}
	
	public int getID() {
		return id;
	}
	
	public void setId() {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreate() {
		return getDateCreate();	
	}
	
	public double getMonthlyInterestRate(double Interest){
		double monthly = Interest/12;
		return monthly;
	}
	
	public double withdraw(double total) {
		balance -= total;
		return balance;
	}
	
	public double deposit(double total) {
		balance += total;
		return balance;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}

