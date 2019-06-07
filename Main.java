package com.lti.Day_4;

public class Main {
   public static void main(String args[]) {
	   Launcher l = new Launcher();
	   MyMobileApplication1 app1= new MyMobileApplication1();
	   
	   l.launch(app1);
	   
	   MyMobileApplication2 app2= new MyMobileApplication2();
	   l.launch(app2);
	   
	  int c=  l.count();
	  System.out.println("Number of apps running:"+c);
	   l.closeAllRunningApps();
	   
	   //-----------to call a non-abstract method we use the class that is implementing the interface
	   app1.version();
   }
}
