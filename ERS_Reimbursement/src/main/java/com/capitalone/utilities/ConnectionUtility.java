package com.capitalone.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionUtility {

	public Connection getConnection() {

		Properties dbProp = new Properties();

		try {
			dbProp.load(new FileInputStream("/Users/dvh533/Desktop/BootCamp/ERS_Reimbursement/src/main/resources/database.properties"));

			Class.forName("org.postgresql.Driver");

			return DriverManager.getConnection(dbProp.getProperty("url"), dbProp.getProperty("username"),
					dbProp.getProperty("password"));

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;

	}

}
