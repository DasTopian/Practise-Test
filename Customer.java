package com.lti.training.day2.oop.basics;

public class Customer {
	
	private String name;
	private String email;
	
	private Address add; //has-a relationship
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}

		public void display() {
			System.out.println("DISPLAYING CUSTOMER DETAILS");
			System.out.println("STATE :"+add.getState());
			System.out.println(" Name :"+getName());
			System.out.println("Email :"+getEmail());
			System.out.println("City :"+add.getCity());
			System.out.println("Pincode :"+add.getPincode());
		}

	
}
