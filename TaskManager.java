package com.lti.Day_4;
/**
 * 
 * an inbuilt task manager
 * @author Google Inc
 *
 */
public class TaskManager {
    
	private MobileApplication[] runningApps;
	private int count;
	
	public TaskManager() {
		runningApps = new MobileApplication[9999]; 
	}
			
	public void inform(MobileApplication mobileApp) {
		runningApps[count++] = mobileApp;
	}
	
	public int runningApps() {
		return count;
	}
	public void clearAll() {
		for(int i=0;i<count;i++)
			runningApps[i].stop();
		
		
		}
	}
	 
