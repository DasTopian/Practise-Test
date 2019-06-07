package com.lti.Day6;
import java.util.HashMap;
import java.util.Map;
public class ExampleOnMap {
	
	public static void main(String[] args) {
		
		Map<String, String> map1 = new HashMap<String,String>();
		map1.put("192.162.1.1", "mashesh");
		map1.put("192.162.1.5", "dines");
		map1.put("192.162.1.4", "ganesha");
		map1.put("192.162.1.3", "santos");
		
		String user = map1.get("192.162.1.3");
		System.out.println(user);
		
				
	}
	
	

}
