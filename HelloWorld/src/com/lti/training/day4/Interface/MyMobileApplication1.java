package com.lti.training.day4.Interface;

/**
 * My dummy mobile app
 * @author SDGSB
 *
 */

public class MyMobileApplication1 implements MobileApplication {

	@Override
	public void start() {
		System.out.println("My awesome application started");
		
		
	}
	
	public void pause() {
		System.out.println("My awesome application paused");
	}

	@Override
	public void stop() {
		System.out.println("My awesome application stopped");
		
	}


}
