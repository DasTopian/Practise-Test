package com.lti.Day_4;


	/**
	 * Inbuilt launcher
	 * for launching mobile apps
	 *@author Google Inc
	 */
public class Launcher {
	
	private static TaskManager t1= new TaskManager(); //------------------------------only once the object is created for task manager
	  public void launch(MobileApplication mobileApp) {
		  
		  mobileApp.start();
		    t1.inform(mobileApp);
		  
		  //mobileApp.pause();
		  //mobileApp.stop();
		  
	  }
	  
	  public int count() {
		//  t1.runningApps();
		  return t1.runningApps();
	  }
	   public void closeAllRunningApps() {

	         t1.clearAll();
	       
	   }
	
}
