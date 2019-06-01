package com.lti.training.day2.oop.basics;

public class Employee {
	private int empno;
	private String name;
	private String dateOfJoining;
	private double salary;
	
	//has-a relationship
	//association
	//one-to-one association
	private Passport passport;
	private AadharCard aadharCard;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Passport getPassport() {
		return passport;
	}
	public void setPassport(Passport passport) {
		this.passport = passport;
	}
	public AadharCard getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(AadharCard aadharCard) {
		this.aadharCard = aadharCard;
	}
	
	public void displayDetails(){
		System.out.println("Employee number :"+this.getEmpno());	//employee details
		System.out.println("Employee Name :"+this.getName());
		System.out.println("Salary : "+this.getSalary());
		System.out.println("Joined on :"+this.getDateOfJoining());
		System.out.println("Passport number :"+this.getPassport().getPassportNo());	 //passport details
		System.out.println("Expity date :"+this.getPassport().getExpiryDate());
		System.out.println("Adhaar number :"+this.getAadharCard().getAadharNo());//adhaar details
		System.out.println("address :"+this.getAadharCard().getAddress());
		
	}
	
	

}
