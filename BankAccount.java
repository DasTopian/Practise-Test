package com.lti.Day_4;

public class BankAccount {
	
	private int acno;
	private String name;
	private double balance;
	public BankAccount(int acno, String name, double balance) {
		super();
		this.acno = acno;
		this.name = name;
		this.balance = balance;
	}
	
	public double withdraw(double amount) throws Exception{
		if(amount>balance) {
			Exception e = new Exception("Insufficient Balance");
			throw e;
	}
	
	else {
		balance -= amount;
		return balance;
    }
	

}
    public static void main(String args[]) {
	BankAccount bankAcc = new BankAccount(113, "rima", 456789);
	try {
		double balance = bankAcc.withdraw(579056);
		System.out.println("balance left:" + balance);
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
}