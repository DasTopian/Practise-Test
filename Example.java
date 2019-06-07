package com.lti.Day6;
class A{
	A(int x, int y) {
		System.out.println("it");
	}
	
	A(){}
	
	void display() {
		System.out.println("hello");
	}
}
class B extends A{
	B(int x, int y) {
		System.out.println("overriden");
	}
	

	
	
}

public class Example {
	public static void main(String[] args) {
		B b=new B();
		b.display();
	}
	

}
