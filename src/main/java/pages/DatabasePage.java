package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	
	Connection connection; 
	Statement statement; 
	ResultSet rs;
	String columnValue; 
	
	public String getDataFromDb(String ColumnName) {
		
		//set properties of mySQL
		
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			
			String sqlUrl = "jdbc:mysql://localhost:3306/december2021";
			String sqlUsername = "root";
			String sqlPassword = "root";
			String sqlQuery = "select * from users;";
			
			//create connection to the local database
			connection = DriverManager.getConnection(sqlUrl,sqlUsername,sqlPassword); 
			
			//Empower the connection reference variable to execute queries
			statement = connection.createStatement();
			rs= statement.executeQuery(sqlQuery);
	
			while(rs.next()) { 
				columnValue = rs.getString(ColumnName);
				return columnValue; 
			}
			
			
			} catch (ClassNotFoundException e) {
					
					e.printStackTrace();
		
	        } catch (SQLException e) {
				
				e.printStackTrace();
			} finally { 
	        	
	        	if (rs!=null) { 
	        		try {
						rs.close();
					} catch (SQLException e) {
						
						e.printStackTrace();
					}
	        		
	        	}
	        }
	
	return columnValue;
	
	}	
}
