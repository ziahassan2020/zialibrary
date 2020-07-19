package com.testng;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.database.SelectData;

public class DataProviderJDBC {
	
	@DataProvider
	public static String[][] methodJDBC() throws Throwable{	
		
		String[][] myData=null;
		int rowCount=0;
		int colCount=0;
		
		String query = "Select Employee_id, first_name, last_name from employees Where first_name like 'A%' order by first_name";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl","hr","hr");
		Statement stmt=connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=stmt.executeQuery(query);	
		
		//Get Column count
		ResultSetMetaData rsMetaData = rs.getMetaData();
		colCount=rsMetaData.getColumnCount();
		
		while(rs.next()) 
			rowCount++;
		myData=new String[rowCount][colCount];
		rs.beforeFirst();
		for(int i=0; i<rowCount;i++) {
			rs.next();
			for(int j=0;j<colCount;j++) {
				myData[i][j]=rs.getString(j+1);
			}			
		}
		stmt.close();
		connection.close();
		
		return myData;		
	}
	@Test(dataProvider="methodJDBC")
	public void getData(String a, String b, String c) {
		System.out.println("The values are: "+a+"  "+b+"    "+c);		
	}
			

}
