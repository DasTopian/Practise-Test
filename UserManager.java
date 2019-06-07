package com.lti.Day6;
import java.util.ArrayList;
import java.util.List;

import javax.swing.SpringLayout.Constraints;

public class UserManager {
	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
		users.add(new User("Mahesh","123",false));
		users.add(new User("Dinesh","456",true));
		users.add(new User("Suresh","789",true));
	}	
	
	 
	public boolean isValid(String username, String password) {
		
		for(User str:users) {		
			if((str.getUsername().equals(username) )&& str.getPassword().equals(password)  && str.isActive()) {
				return true;
				
				
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		UserManager mgr = new UserManager();
		boolean isValid = mgr.isValid("Dinesh", "456");
		System.out.println(isValid);
		
	}
}
