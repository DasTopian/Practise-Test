package com.lti.training.day3.inheritance.assignment;

public class Toy extends Product{
	public Toy(String name, int stockInHand, double price, String description, String age) {
		super(name, stockInHand, price, description);
		this.age = age;   
		
	}
	String age;
	@Override
	public double calculateDiscount() {
		if(age.equals("2-4"))
			return .15*getPrice();
		else if(age.equals("4-5"))
			return 0.05*getPrice();
		else 
			return 0;
	}

}
