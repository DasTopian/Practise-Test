package com.lti.training.day3.inheritance.v3;

public class LogApp {
	public static void main(String[] args) {
		//testing our logger
		//Logger l = new Logger();
		//ConsoleLogger l = new ConsoleLogger();
		//FileLogger l = new FileLogger();
		Logger l = LogFactory.getLoggerInstance(); //design pattern -> factory pattern : abstraction achieved
		l.log("Some Message", LogLevel.INFO);
		l.log("Again some message", LogLevel.WARN);
		l.log("Some Critical Message", LogLevel.ERROR);
		l.log("App loaded successfully!!");
		
		
	}

}
