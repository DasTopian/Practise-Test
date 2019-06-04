package com.lti.training.day4.Interface;

public class MyMobileApplication2 implements MobileApplication {
	
	public void start() {
		System.out.println("My awesome application2 started");
		
		
	}
	
	public void pause() {
		System.out.println("My awesome application2 paused");
	}

	@Override
	public void stop() {
		System.out.println("My awesome application2 stopped");
		
	
		
	}


}
