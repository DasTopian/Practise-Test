package com.lti.training.day3.inheritance.v1;

public class LogApp {
	public static void main(String[] args) {
		//testing our logger
		Logger l = new Logger();
		l.log("Some Message", LogLevel.INFO);
		l.log("Again some message", LogLevel.WARN);
		l.log("Some Critical Message", LogLevel.ERROR);
		l.log("App loaded successfully!!");
		
		
	}

}
