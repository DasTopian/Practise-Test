package com.lti.training.day4.exceptionhandling;

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
	
	public double withdraw(double amount) throws AccountException{
		if (amount>balance) {
			AccountException e = new AccountException("Insufficient balance!");
			throw e;
		}
		
		else {
			balance -= amount;
			return balance;
			}
		}
	public static void main(String[] args) {
		
		//BankAccount bankAcc = new BankAccount(1234,"SDG",5000);
		BankAccount bankAcc=null;
		try {
			double balance = bankAcc.withdraw(6000);
			System.out.println("Balance Left:"+balance);
		}
		
		catch(AccountException e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("finally is always executed");
		}
		
	}
	}
