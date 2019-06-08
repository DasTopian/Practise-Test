package com.lti.training.JDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		ProductDao dao=new ProductDao();
		Product p=new Product();
		Scanner sc = new Scanner(System.in);
		/*
		p.setId(sc.nextInt());
		p.setName(sc.next());
		p.setPrice(sc.nextDouble());
		p.setQuantity(sc.nextInt());
		
		dao.add(p);
		sc.close();*/
		List<Product> prod=new ArrayList<Product>();
		//prod=dao.fetchAll();
		for(Product m:dao.fetchAll()) {
			System.out.println("ID"+m.getId());
			System.out.println("NAME"+m.getName());
			System.out.println("PRICE"+m.getPrice());
			System.out.println("QUANTITY"+m.getQuantity());
			
		}
	}

}
