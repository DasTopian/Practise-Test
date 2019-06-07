package com.lti.Day_4;
//------------------------------The Name Of This File Can be only LambdaInnerClassInterface
//-------------------------------while implementing interface and multiple classes!!!!!!!!!!!!!!!!!!!
interface Printer{
	void print(String document);
}

        class DotMatrixPrinter implements Printer{      
        @Override
        public void print(String document) {
	    System.out.println("Currently printing" + document);
}   
}
	

    public class LambdaInnerClassInterface { 
	      private class ABC{                                                  //PRIVATE INNER CLASS
}

	    /*class DotMatrixPrinter implements Printer{           //inner class in a class
		@Override
		public void print(String document) {
	    System.out.println("Currently printing" + document);
		}   */

    public static void main(String args[]) {
		// class A {                                                                  //inner class inside a function
	   // }        
    class DeskjetPrinter implements Printer{
    	
    	public void print(String document) {
    	    System.out.println("Currently printing" + document);
       }
    }
    Printer p = new DeskjetPrinter();
    p.print("abc.txt");
    
    
    //anonymous inner class
     Printer sp = new Printer() {
		
		@Override
		public void print(String document) {
			// TODO Auto-generated method stub
			System.out.println("Now printing"+document);
		}
	};
     
    sp.print("xyz.txt");
    //------------Anonymous function
    //lamda expressions are nothing  but anonymous inner classes in other 
        //Printer pr = (document)-> {
        	Printer pt= doc-> System.out.println("Now printing"+doc);
        
        	pt.print("hello.txt");
        };
    
        
        
    }
   