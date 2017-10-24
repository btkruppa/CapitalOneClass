package com.ersassignment.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtil {
	public Connection getConnection() {
		Properties dbProps = new Properties();
		try {
			dbProps.load(new FileInputStream(
					"/Users/miu834/Documents/workspace/java/ersproj/src/main/resources/dbers.properties"));
			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection(dbProps.getProperty("url"), dbProps.getProperty("username"),
					dbProps.getProperty("password"));

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
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
