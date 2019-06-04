package com.lti.training.day4.practice;

public class Employee {
	//Instance variables
	private int empno;
	private String name;
	
	private static double salary; //class variable; access it by the name of the class
	public static final String companyName="LTI"; //constant variable; cannot be changed

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

	public static double getSalary() {
		return salary;
	}

	public static void setSalary(double salary) {
		Employee.salary = salary;
	}
	
	

}
