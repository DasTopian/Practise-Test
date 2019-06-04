package com.lti.training.day4.Interface;

/**
 * Inbuilt launcher
 * for launching mobile applications
 * @author Google LLC
 *
 */

public class Launcher {
	
	static TaskManager taskManager = new TaskManager();
	
	public void launch(MobileApplication mobileApp) {
		mobileApp.start();
		//mobileApp.pause();
		//mobileApp.stop();
		
		taskManager.inform(mobileApp);
		
	}
	
	public void closeAllRunningApp() {
		taskManager.clearAll();
	}
	
	public int countRun() {
		return taskManager.getCount();
	}
	
	

}
