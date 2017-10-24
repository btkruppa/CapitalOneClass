package com.capitalone.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ErsConnectionUtility {
	
	public Connection getConnection() {
		Properties dbProperties = new Properties();
		try  {
			dbProperties.load(new FileInputStream("/Users/gqu827/Documents/workspace/ReimbursementSystem/src/main/resources/database.properties"));
			Class.forName("org.postgresql.Driver");
			
			return DriverManager.getConnection(dbProperties.getProperty("url"), 
											   dbProperties.getProperty("username"), 
											   dbProperties.getProperty("password"));
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	

	

}
