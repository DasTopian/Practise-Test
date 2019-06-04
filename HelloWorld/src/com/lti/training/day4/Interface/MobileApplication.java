package com.lti.training.day4.Interface;

/**
 * 
 * @author Google LLC
 *
 */

public interface MobileApplication {
	
	String INFO = "Developed by Google";
	public void start();
	public void pause();
	public void stop();
	
	//non abstract & static methods allowed from 8 onwards; default has to be used
	public default void version() {
		System.out.println(INFO + "Version is 1.0");
	}
	
	

}
