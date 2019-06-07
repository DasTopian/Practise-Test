package com.lti.Day6;
import java.util.*;

import javax.swing.SpringLayout.Constraints;

public class UserManager2 {

	private Map<String,String> users;
	
	public UserManager2() {
		
		users = new HashMap<String,String>();
		users.put("Mahesh","123");
		users.put("Dinesh","456");
		users.put("Suresh","789");
	}	
	
	 
	public boolean isValid(String username, String password) {
		
				
			if(users.containsKey(username) && users.get(username).equals(password)) {
				
				return true;
				
				
			}
			else {
				
			
		
		return false;
			}
	}
	
	public static void main(String[] args) {
		
		UserManager2 mgr = new UserManager2();
		boolean isValid = mgr.isValid("Mahh", "456");
		System.out.println(isValid);
		
	}
}
