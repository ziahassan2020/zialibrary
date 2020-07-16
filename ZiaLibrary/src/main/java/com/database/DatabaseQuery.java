package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseQuery {
	public Connection connectDB() {
		Connection connection=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");			
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		return connection;
	}
	
	public void selectQuery(Connection connection, String query) throws Throwable {
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery(query);
	
		try {
			while(rs.next()) {
				System.out.println(rs.getString(1));
				//rs.getString
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				connection.close();
			} catch (SQLException e) {				
				e.printStackTrace();
			}
		}			
	}
	
	public void selectWithColumnName(Connection connection, String query) throws Throwable {
		Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = stmt.executeQuery(query);
		
		ResultSetMetaData rsMetaData = rs.getMetaData();
		System.out.println("============================================================="
				+ "======================================================================"
				+ "======================================================================");		
		for(int i=1; i<=rsMetaData.getColumnCount();i++) {
			System.out.format("|| %-14s ", rsMetaData.getColumnLabel(i));
		}
		System.out.println();
		System.out.println("============================================================="
				+ "======================================================================"
				+ "======================================================================");
		while(rs.next()) {
			for(int i=1; i<=rs.getMetaData().getColumnCount();i++) {
				System.out.format("| %-16s", rs.getString(i));
			}
			System.out.println();
		}		
		
	}
	public void executeStatement(Connection connection, String query) {
		PreparedStatement stmt = null;
		try {
			stmt = connection.prepareStatement(query);
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		try {
			stmt.execute();
			stmt.close();
			System.out.println("Statement executed successfully");
		} catch (SQLException e) {			
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		String query = "Select login_name, password from employees";
		DatabaseQuery dbquery = new DatabaseQuery();
		Connection connection = dbquery.connectDB();
		try {
			//dbquery.selectQuery(connection, query);
			dbquery.selectWithColumnName(connection, query);
		} catch (Throwable e) {			
			e.printStackTrace();
		}
		
	}
	
}
