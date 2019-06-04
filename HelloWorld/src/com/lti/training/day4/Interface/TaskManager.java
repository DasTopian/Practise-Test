package com.lti.training.day4.Interface;

/**
 * an in-built task manager 
 * @author Google LLC
 *
 */

public class TaskManager {
	
	private MobileApplication[] runningApps;
	private int count;
	
	public TaskManager() {
		runningApps = new MobileApplication[9999];
	}
	
	public void inform(MobileApplication mobileApp) {
		runningApps[count++]=mobileApp;
	}
	
	

	public int getCount() {
		return count;
	}

	public void clearAll() {
		for(int i=0; i<count; i++) {
			runningApps[i].stop();
			
		}
			
	}

}
