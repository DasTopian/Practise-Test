package com.lti.training.day3.inheritance.v2;

import java.io.*;
import java.time.LocalDateTime;

public class FileLogger extends Logger{
	public void log(String msg, LogLevel level) {
		try(FileWriter fw = new FileWriter("app.log", true)){ //True is for append, without it, the file will be completely overwritten
			switch(level) {
			case INFO:
				fw.write("[INFO]["+ LocalDateTime.now()+ "]" + msg);
				break;
			case WARN:
				fw.write("[WARNING][" + LocalDateTime.now() + "]" + msg);
				break;
			case ERROR:
				fw.write("[ERROR]["+LocalDateTime.now()+ "]" + msg);
				
			}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
