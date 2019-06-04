package com.lti.training.day3.inheritance.assignment;

public class BillApp {
	
	public static void main(String[] args) {
		
		Book b1 = new Book("Java Handbook",99,500,"A Classic Book On Java");
		Book b2 = new Book("Java Unleashed",99,400,"A classic book on Java");
		
		Toy t1 = new Toy("RC Car",99,2500,"RC Car","4-5");
		Toy t2 = new Toy("Superhero",99,500,"Action Figure","5+");
		
		int quantity=100;
		
		
		if (b1.getStockInHand()>quantity) {
		double bill1 = b1.generateBill(quantity);
		System.out.println("Total bill amount for ordering 40 copies of Java Handbook is"+ bill1);
		}
		else {
			System.out.println("Stocks are empty");
		}
		
	}

}
