package com.lti.training.day4.InnerClassLambda;

interface Printer{
	void print(String document);
}



public class ExampleOnInnerClassAndLambda {
		class DotMatrixPrinter implements Printer{					//error if not INNER CLASS; Package level visibility if not INNER CLASS; Can't be public if not INNER CLASS because there can only be one public class in a file which should match the name of the file
		
		@Override
		public void print(String document) {
			System.out.println("Currently printing" + document);
		}

	}
	
	public static void main(String[] args) {
		//This is also an inner class
		/*class A{
			
		}*/
		
		class DeskjetPrinter implements Printer{
			@Override
			public void print(String document) {
				System.out.println("Now Painting"+ document);
				
			}
		}
		
		Printer p = new DeskjetPrinter();
		p.print("abc.text");
		
		//anonymous inner class
		Printer sp = new Printer() {								
			
			@Override
			public void print(String document) {							
				System.out.println("Now Printing"+document);
				
			}
		};
		
		sp.print("xyz.txt");
		
		//anonymous functions - a.k.a lambda expressions
		//lambda expressions are nothing but anonymous inner classses in other 
		//Only works with interfaces with one abstract method
		//Printer pr = (String document) ->{};
		//Printer pt = doc -> System.out.println("Now Printing" + doc);
		Printer pr = (document) -> {
			System.out.println("Now Printing" + document);
		};
		
		pr.print("hello.txt");
		
		
		
		
		
	}
	
	

}
