package com.lti.Day_4;
/** My dummy mob_App
 * @author Rima, Riya
 *
 */
public class MyMobileApplication1 implements MobileApplication {

	@Override
	public void start() {
		System.out.println("My awesome Mobile Application-1 Started!!!!!!!!");
		
		
	}

	@Override
	public void pause() {
		
		System.out.println("My awesome Mobile Application-1 Paused.......");
	}

	@Override
	public void stop() {
		
		System.out.println("My awesome Mobile Application-1 Stopped##############");
	}
      
	  
}
