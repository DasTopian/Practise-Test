package com.lti.training.day3.inheritance.v2;

/**
 * A simple custom logger implementation
 * @author SDGSB
 * @version 1.0
 * 
 */
public abstract class Logger {
	
	public abstract void log(String msg, LogLevel level);
	
	public void log(String msg) {
		//System.out.println("[INFO]["+ LocalDateTime.now()+ "]" + msg);
		log(msg,LogLevel.INFO);
		
	}

}
