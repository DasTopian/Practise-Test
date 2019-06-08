package com.lti.training.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDB {
	public static void main(String[] args) {
		
		Connection conn=null;
		try {
			
			//Loading the JDBC driver
			Class.forName("oracle.jdbc.driver.OracleDriver");	//something with reflection api
			
			//Establish Connection with the database
			String url="jdbc:oracle:thin:@localhost:1521:XE";
			String user="hr";
			String pass="hr";
			conn=DriverManager.getConnection(url,user,pass);
			
			System.out.println("Connected Successfully !!!");
			
			
			
		}
		catch(ClassNotFoundException e){
			
			System.out.println("JDBC driver not found");
			
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			}
			catch(Exception e) {
				
			}
		}
	}

}
