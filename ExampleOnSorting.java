package com.lti.Day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class ExampleOnSorting {
	
	//for sorting we can use a dedicated sort method
	//alternatively treeset is a type of collection where data is by default sorted
	//for sorting data we need to implement Comparable/Comparator interface
	
	//if we need to store int/double/float or any other primitive value in collection, we need wrapper classes
	//primitive are not supported directly
	
	public static void main(String[] args) {
		
	
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(10);
		list1.add(50);
		list1.add(30);
		list1.add(20);
		list1.add(40);
		
		System.out.println("Before Sorting");	//unsorted data
		for (Integer no: list1)
			System.out.println(no);
		
		TreeSet<Integer> tr=new TreeSet<Integer>(list1);
		
		System.out.println("After sorting");				//sorting method 1
		for (Integer no: tr)
			System.out.println(no);
		
		Collections.sort(list1);									//sorting method 2
		for (Integer no: list1)
			System.out.println(no);
		
		List<Person> listOfPersons = new ArrayList<Person>();
		listOfPersons.add(new Person("Majrul",59));
		listOfPersons.add(new Person("Dinesh",79));
		listOfPersons.add(new Person("Santosh",89));
		listOfPersons.add(new Person("Gaurav",39));
		listOfPersons.add(new Person("Majrul",69)); //Collections.sort() won't work with objects
		
		//Write our own comparator
		
		Comparator<Person> c = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getName().compareTo(p2.getName());
			}
		};	
		
System.out.println("----------------------By Name---------------------------");
		
		Collections.sort(listOfPersons, c);
		for (Person p : listOfPersons) {
			System.out.println(p.getName());
			System.out.println(p.getNo());
		}
		
Comparator<Person> c2 = new Comparator<Person>() {
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getNo() - p2.getNo();
			}
		};	
		
		
		System.out.println("--------------------By Number-------------------");
			
		Collections.sort(listOfPersons, c2);
		for (Person pn : listOfPersons) {
			System.out.println(pn.getName());
			System.out.println(pn.getNo());
		}
		
	}
}
