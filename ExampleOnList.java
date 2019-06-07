package com.lti.Day6;

import java.util.ArrayList;
import java.util.List;

public class ExampleOnList {
	public static void main(String[] args) {
		
	
	
	//<> is called generic in java
	List<String> list1= new ArrayList<String>();
	List<String> list2=new ArrayList<String>();
	list2.add("monkey");
	list2.add("lion");
	list1.add("Java");
	list2.add("Pumpkin");
//	list1.add(0, "helo");
	list1.add("Oracle");
	list1.add(".net");
	list1.add("python");
	list1.add("Java");
	list1.remove(1);
	
	/*for(int i=0;i<list1.size();i++){
		String str=list1.get(i);
		System.out.println(str);
	}
	for(String str:list1) {		//for each loop ....replacement for the first method
		System.out.println(str);
	}
	System.out.println("Lambda for each");//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~swimming pool ahead~~~~~~~
	list1.forEach(str->System.out.println(str));
	
	System.out.println();*/
	//list1.addAll(list2);
	//list1.forEach(str->System.out.println(str));
	list2=list1.subList(0, 3);
	list2.removeAll(list1);
	//list1.forEach(str->System.out.println(str));
	
	
	List<Person>listOfPersons=new ArrayList<Person>();
	Person p1=new Person();
	p1.setNo(1);
	p1.setName("aladdin");
	Person p2=new Person();
	p2.setNo(2);
	p2.setName("jasmine");
	listOfPersons.add(p1);
	listOfPersons.add(p2);
	
	//listOfPersons.forEach(str->System.out.println("Name :"+str.getName()+"\nNumber :"+str.getNo())); //Lambda Expression
	for (Person str: listOfPersons) {
		System.out.println(str.getNo());   //foreach
		System.out.println(str.getName());
	}
	
	
	
	
	
	
	}
	
	
	
	
}

