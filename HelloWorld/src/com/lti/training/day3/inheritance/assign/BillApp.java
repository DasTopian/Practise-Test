package com.lti.training.day3.inheritance.assign;

public class BillApp {
	public static void main(String[] args) {
		
		
		//ordering a book
	Books b = new Books("Narnia",5);
	b.setProID(100);
	b.setPrice(1000);
	b.setDesc("Good product cheap price bhaiya");
	
	
	double newPriceb = b.discount(1000);
	
	
	
	
	
	
	
	
	
	
	/*Toys t = new Toys();
	double newPricet = t.discount(1200);
	
	p.display();
	
	p.setProName("Oreo");
	p.setPrice(30);
	*/

	
	}

}
