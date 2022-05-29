package com.utilitiespack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class JdbcOracle {
	
	
	public static ArrayList<String> getDataTableColumn(String SQLqyeries, String columnName) throws Exception {
		ResultSet rs = null;
		Connection connection = null;
		 String url = "jdbc:sqlserver://ARIF:1433;databaseName=DB24; encrypt=true; trustServerCertificate=true;";
	        String user = "arif";
	        String pass = "Abcd1234";

	         connection = DriverManager.getConnection(url,user,pass);
		
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orclpdb", "sys as sysdba", "Abcd1234");
			Statement stmt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
			rs = stmt.executeQuery(SQLqyeries);
	

		ArrayList<String> columnValue = new ArrayList<String>();

		
			while (rs.next()) {
				columnValue.add(rs.getString(columnName));

		

		
		// step5 close the connection object
			}
			System.out.println(columnValue);
			connection.close();
	
		return columnValue;

	}
	
	public static void main(String[] args) throws Exception {

		String Queries= "SELECT FirstName FROM Students";
		getDataTableColumn(Queries,"FirstName");
//		getDataTableColumn(Queries, "City");
		
		
	
	}

}
