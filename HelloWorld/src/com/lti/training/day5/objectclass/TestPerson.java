package com.lti.training.day5.objectclass;

public class TestPerson {

	public static void main(String[] args) {

		Person p1=new Person("A",12);
		//System.out.println(p1);
		Person p2=new Person("A",12);
		System.out.println(p1.equals(p2));	//still comparing references like p1 == p2; by default reference comparison; only works in string because it's been overriden in the String class
		/*System.out.println(p1.hashCode());                                                                                   
		System.out.println(p2.hashCode());*/                                                                                     
		                                      
			try {
				Person p3=(Person) p1.clone();		// protected method not public ..hence cannot be called like this
				System.out.println(p3);
			} catch (CloneNotSupportedException e) {
				
				e.printStackTrace();
			}	
			
			p1=null;
			p2=null;
			System.gc();
		
		
		}
	

}
