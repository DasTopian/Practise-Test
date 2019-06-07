package com.lti.Day_4;

public class Employee {
	
	 private int empno;
	 private String name;
	 public static final String comName="LTI";
	 public static  double salary;

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

	public  double getSalary() {
		return salary;
	}

	public  void setSalary(double salary) {
		Employee.salary = salary;
	}


public static void main(String args[]) {
       
	Employee emp1 = new Employee();
	emp1.setEmpno(1001);
	emp1.setName("Jerry");
	emp1.setSalary(10000);
	
	   
		Employee emp2 = new Employee();
		emp2.setEmpno(1002);
		emp2.setName("Mickey");
		emp2.setSalary(2000);
		
		System.out.println("Emp no is"+emp1.getEmpno()+"Employee name is:"+emp1.getName()+"   "+Employee.comName+"Emp salary is"+emp1.getSalary());
	//	System.out.println("Emp no is"+emp2.getEmpno()+"Employee name is:"+emp2.getName()+"Emp salary is"+emp2.getSalary());
		
}
}