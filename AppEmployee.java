package com.lti.training.day2.oop.basics;

public class AppEmployee {

	public static void main(String[] args) {

		Employee e1=new Employee(); //Emp
		e1.setEmpno(1);
		e1.setName("radheshyam");
		e1.setDateOfJoining("12/12/12");
		e1.setSalary(10000);
		
		//Passport p1=new Passport(); //Passport
		
		//p1.setPassportNo("p1234");
		//p1.setNameOfThePerson("radheshyam");
		//p1.setIssueDate("11/11/11");
		//p1.setExpiryDate("14/14/14"); 
		
		e1.Passport.setPassportNo("p123");
		
		AadharCard ad1=new AadharCard(); //Aadhar
		
		ad1.setAadharNo(1234);
		ad1.setName("radheshyam");
		ad1.setAddress("Mumbai"); 
		
		e1.setAadharCard(ad1);
		
	/*	System.out.println(ad1.getAadharNo();
		ad1.getAddress();
		ad1.getName();
		
		p1.getPassportNo();
		p1.getNameOfThePerson();
		p1.getIssueDate();
		p1.getExpiryDate();
		
		e1.getEmpno();
		e1.getName();
		e1.getDateOfJoining();
		e1.getSalary();*/
		System.out.println(e1.getPassport().getPassportNo());
		System.out.println(e1.getAadharCard().getAadharNo());
		
		System.out.println();
		
	}

}
