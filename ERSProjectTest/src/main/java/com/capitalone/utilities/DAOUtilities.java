package com.capitalone.utilities;


import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.com.reimbursement.bean.ReimbType;
import com.capitalone.com.reimbursement.bean.User;
import com.capitalone.com.reimbursement.bean.UserRole;


public class DAOUtilities {
	
	private static User user;
	private static UserRole userRole;
	private static ReimbReq reimbReq;
	private static ReimbType reimbType;

	public static synchronized User getUser() {
		if (user == null) {
			user = new User();
		}
		return user;
	}
	public static synchronized UserRole getUserRole() {
		if (userRole == null) {
			userRole = new UserRole();
		}
		return userRole;
	}
	public static synchronized ReimbReq getReimbReq() {
		if (reimbReq == null) {
			reimbReq = new ReimbReq();
		}
		return reimbReq;
	}
	public static synchronized ReimbType getReimbType() {
		if (reimbType == null) {
			reimbType = new ReimbType();
		}
		return reimbType;
	}
	public Connection getConnection() {		
		//Refer to the property file to derive the data source
		Properties dbprops = new Properties();
		try {
			dbprops.load(new FileInputStream("/Users/oki600/Desktop/AnnaiBootCamp/MyEclipseProjects/ERSProject/src/main/resources/empReimDB.properties"));
			Class.forName("org.postgresql.Driver");
			return DriverManager.getConnection(dbprops.getProperty("url"), dbprops.getProperty("username"),
					dbprops.getProperty("password"));
		} catch (IOException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
