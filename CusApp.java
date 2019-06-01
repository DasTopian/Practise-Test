package com.lti.training.day2.oop.basics;

public class CusApp {

	public static void main(String[] args) {
		Customer c = new Customer();
		
		Address a=new Address();
		
		
		
		
		c.setEmail("email@email.com");
		c.setName("Hezal");
		
		a.setCity("delhi");
		a.setPincode(110010);
		a.setState("delhi");
		
		c.setAdd(a);
		
		c.display();
		
		
	}

}
