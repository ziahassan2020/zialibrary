package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SelectData {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		String query = "Select * from employees";
		Connection connection = SelectData.connectDB();
		SelectData.runQuery(connection, query);
	}
	public static Connection connectDB() throws Throwable {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
		return connection;				
	}
	public static void runQuery(Connection conn, String query) throws Throwable {
		Statement stmt=conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery(query);		
		List<String> list = new ArrayList<>();
		try {
			while(rs.next()) {				
				System.out.print("ID: "+rs.getString(1));
				System.out.print(" Last Name: "+rs.getString(2));
				System.out.println(" First Name: "+rs.getString(3));
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		} finally {
			try {
				if(stmt!=null) {
					conn.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}
	}

}
