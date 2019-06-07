package com.lti.Day_4;

/**
 * 
Contract for a mobile application 
* @author Google Inc
 *
 */
public interface MobileApplication {
     String INFO = "Developed by Google Inc";
	public void start();
	public void pause();
	public void stop();
	
	//-----non-abstract and static methods allowed from java8 onwards
	//bydefault public and abstract
	public default void version() {
		 
		System.out.println(INFO+ "Version is 1.0");
		
		
	}
	
	  
}
