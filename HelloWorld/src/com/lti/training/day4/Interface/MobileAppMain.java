package com.lti.training.day4.Interface;

public class MobileAppMain {
	
	public static void main(String[] args) {
		Launcher launcher = new Launcher();
		
		
	MyMobileApplication1 app1 = new MyMobileApplication1();
	launcher.launch(app1);
	
	MyMobileApplication2 app2 = new MyMobileApplication2();
	launcher.launch(app2);
	
	System.out.println(launcher.countRun()); //Apps count
	
	launcher.closeAllRunningApp(); //Close all running apps
	
	app1.version();
	}

}
