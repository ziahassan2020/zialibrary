
package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SimpleJDBCExample {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String query = "Select last_name, first_name from employees";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
		Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery(query);		
		List<String> lastName = new ArrayList<>();
		List<String> firstName = new ArrayList<>();
				
		while(rs.next()) {				
	//		System.out.print("ID: "+rs.getString(1));
	//		System.out.print(" Last Name: "+rs.getString(1));
	//		System.out.println(" First Name: "+rs.getString(2));
			lastName.add(rs.getString(1));
			firstName.add(rs.getString("first_name"));
		} 
		for(int i=0; i<lastName.size();i++) {
//			System.out.println(lastName.get(i).toString());
		}
		for(int i=0; i<firstName.size();i++) {
			System.out.println(firstName.get(i).toString());
		}

	}

}
