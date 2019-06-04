package com.lti.training.day4.practice;

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setEmpno(1001);
		emp1.setName("SDGSB");
		emp1.setSalary(10000); //Wrong output; Compiler warning; shows 20000.0 because salary is static; only one copy is generated in the memory because class is loaded only once along with which it is loaded
		
		
		Employee emp2 = new Employee();
		emp2.setEmpno(1002);
		emp2.setName("Damodar");
		emp2.setSalary(20000);
		
		System.out.println(Employee.companyName);
		
		System.out.println(emp1.getEmpno());
		System.out.println(emp1.getName());
		System.out.println(emp1.getSalary());
		
		System.out.println(emp2.getEmpno());
		System.out.println(emp2.getName());
		System.out.println(emp2.getSalary());
		
	}

}
