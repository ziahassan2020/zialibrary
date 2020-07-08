package com.database;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleTypes;

public class RefCursorExample {

	public static void main(String[] args) {		 
		RefCursorExample obj = new RefCursorExample();
	//	obj.getData();
		obj.createProcedure();
	}
	public void createProcedure() {		
				
		String createSP = "CREATE OR REPLACE PROCEDURE get_employee_by_name( "
                + " p_name IN VARCHAR2, "
                + " o_c_dbuser OUT SYS_REFCURSOR) "
                + " AS \r\n"
                + " BEGIN \r\n"
                + "     OPEN o_c_dbuser FOR \r\n"
                + "     SELECT * FROM EMPLOYEES WHERE LAST_NAME LIKE p_name || '%'; \r\n"
                + " END; \r\n";
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			Statement statement = connection.createStatement();
			statement.execute(createSP);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		System.out.println("Procedure created successfully");
		
	}
	public void getData() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
		try {
			Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl", "hr", "hr");
			String runProcedure = "{ call get_employee_info(?,?) }";
			Statement statement = connection.createStatement();
			CallableStatement cs = connection.prepareCall(runProcedure);
			cs.setString(1,"D");
			cs.registerOutParameter(2, OracleTypes.CURSOR);
			cs.execute();
			ResultSet rs = (ResultSet) cs.getObject(2);
			while(rs.next()) {
				System.out.print("EMP ID= "+rs.getString(1));
				System.out.print(" First Name= "+rs.getString(2));
				System.out.print(" LasNameID= "+rs.getString(3));
				System.out.println();
			}
		} catch (SQLException e) {			
			e.printStackTrace();
		}	
	}

}
