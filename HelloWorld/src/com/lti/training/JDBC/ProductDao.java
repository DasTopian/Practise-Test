package com.lti.training.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//data access object
//create table in sql TBL_PRODUCT id pk,name,price,quantity
public class ProductDao {
	
	public void add(Product product) {		//add data in database
		
		Connection conn=null;	//manages the connection between app and database
		PreparedStatement stmt=null;		//prepare a statement
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	//loading driver
			
			//Establish Connection with the database
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			String sql="insert into TBL_PRODUCT values(?,?,?,?)";
			
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1,product.getId());
			stmt.setString(2, product.getName());
			stmt.setDouble(3, product.getPrice());
			stmt.setInt(4, product.getQuantity());
			stmt.executeUpdate();				//any DML statement
			
			
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
	
	public List<Product> fetchAll() {		//extract data from database
		
		Connection conn=null;	//manages the connection between app and database
		PreparedStatement stmt=null;		//prepare a statement
		ResultSet rs=null;							//helps us in fetching the result from the database
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");	//loading driver
			
			//Establish Connection with the database
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","hr","hr");
			String sql="select * from TBL_PRODUCT where quantity>=? ";
			
			stmt=conn.prepareStatement(sql);
			
			stmt.setInt(1,10);
			
			rs=stmt.executeQuery();				//executing statement and storing result in rs
			
			List<Product> products=new ArrayList<Product>();
			while(rs.next()) {
				Product p=new Product();
				p.setId(rs.getInt(1));
				p.setName(rs.getString(2));
				p.setPrice(rs.getDouble(3));
				p.setQuantity(rs.getInt(4));
				products.add(p);
				
			}
			return products;
			
			
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
		
		return null;
		
		
		
		
		
	}

	
	
	

}
