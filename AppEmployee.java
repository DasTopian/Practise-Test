package com.lti.training.day2.oop.basics;

public class AppEmployee {

	public static void main(String[] args) {

		Employee e1=new Employee(); //Emp
		e1.setEmpno(1);
		e1.setName("radheshyam");
		e1.setDateOfJoining("12/12/12");
		e1.setSalary(10000);
		
		Passport p1=new Passport(); //Passport
		
		p1.setPassportNo("p1234");
		p1.setNameOfThePerson("radheshyam");
		p1.setIssueDate("11/11/11");
		p1.setExpiryDate("14/14/14"); 
		
		e1.setPassport(p1); //return
		
		AadharCard ad1=new AadharCard(); //Aadhar
		
		ad1.setAadharNo(1234);
		ad1.setName("radheshyam");
		ad1.setAddress("Mumbai"); 
		
		e1.setAadharCard(ad1); 
		
		e1.displayDetails();
		
		System.out.println();
		
	}

}
