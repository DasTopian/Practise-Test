package com.lti.training.day3.inheritance.assigncopy;

public class Products {
	private String proName;
	private int proID;
	private int stock;
	private double price;
	private String desc;
	
	
	
	
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void discount() {
		
	}
	
	public void display() {
		System.out.println();
	}
	
	

}
