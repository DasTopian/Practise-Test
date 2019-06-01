package com.lti.training.day2.oop.basics;

public class App {
	public static void main(String[] args) {
		//creating object of  student class
		Student[] student1 = new Student[10];
		student1[0] = new Student();
		student1[0].name = "Sharman";
		student1[0].college = "SGS";
		student1[0].doj = "12/12/12";
		System.out.println(student1[0].name + " graduated from " + student1[0].college + " on " + student1[0].doj);
		
		
		Passport pass = new Passport();
		pass.setPassportNo("1234");
		pass.setNameOfThePerson("Rajan");
		pass.setIssueDate("12/12/12");
		pass.setExpiryDate("13/13/13");
		String h = pass.getPassportNo();
		System.out.println(h);
		System.out.println(pass.getNameOfThePerson());
		System.out.println(pass.getIssueDate());
		System.out.println(pass.getExpiryDate());
		
		
		AadharCard aadhar = new AadharCard(1212121212,"asmita","Karnataka");
		System.out.println(aadhar.getAadharNo());
		System.out.println(aadhar.getName());
		System.out.println(aadhar.getAddress());
		
		
	}

}
