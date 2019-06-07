package com.lti.Day_4;
/** My dummy mob_App
 * @author Rima, Riya
 *
 */
public class MyMobileApplication2 implements MobileApplication {

	@Override
	public void start() {
		System.out.println("My awesome Mobile Application2 Started!!!!!!!!");
		
		
	}

	@Override
	public void pause() {
		
		System.out.println("My awesome Mobile Application2 Paused.......");
	}

	@Override
	public void stop() {
		
		System.out.println("My awesome Mobile Application2 Stopped ####");
	}
      
	  
}
