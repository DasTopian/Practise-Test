package com.lti.Day6;

import java.util.HashSet;
import java.util.Set;

public class ExampleOnSet {
	public static void main(String[] args) {
		Set<String> set1= new HashSet<String>();
		set1.add("Java");
		set1.add("Oracle");
		set1.add("PHP");
		set1.add(".NET");
		set1.add("Java");
		
		for (String str : set1)
			System.out.println(str);
		
		
	Set<Person2> setOfPersons = new HashSet<Person2>();
	setOfPersons.add(new Person2("Nikhil",99));
	setOfPersons.add(new Person2("Dinesh",99));
	setOfPersons.add(new Person2("Santosh",99));
	setOfPersons.add(new Person2("Gaurav",99));
	setOfPersons.add(new Person2("Nikhil",99));
	
	for (Person2 pr : setOfPersons) 
		pr.display();
	
	
	}

}
