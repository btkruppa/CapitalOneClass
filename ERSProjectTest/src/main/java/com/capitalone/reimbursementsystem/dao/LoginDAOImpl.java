package com.capitalone.reimbursementsystem.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.com.reimbursement.bean.User;
import com.capitalone.com.reimbursement.bean.UserRole;
import com.capitalone.utilities.DAOUtilities;

public class LoginDAOImpl implements LoginDAO {

	String queryRole;
	String queryAuth;
	String usersRole;

	// Creating a DB connection to execute queries to authenticate an user and find
	// out the role
	DAOUtilities util = new DAOUtilities();
	Connection connection = util.getConnection();

	// Authenticate the user inputs against stored values in DB using user name and
	// password
	public void userAuthentication(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Logger log = Logger.getLogger("LoginDAOImpl");
		try {
			User user = DAOUtilities.getUser();
			UserRole ur = DAOUtilities.getUserRole();
			user = (User) req.getSession().getAttribute("user");
			queryAuth = "SELECT * FROM ers_users where ers_username=\'" + user.getUserName() + "\' AND ers_password=\'"
					+ user.getPassword() + "\'";
			Statement stmt = connection.createStatement();
			ResultSet rsAuth = stmt.executeQuery(queryAuth);
			while (rsAuth.next()) {
				findUserRole(rsAuth.getInt("user_role_id"), ur);
				user.setUserId(rsAuth.getInt("ers_users_id"));
			}
			req.getSession().setAttribute("userRole", ur);
			req.getSession().setAttribute("User", user);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// Find if the user is an employee and manager
	public void findUserRole(int roleId, UserRole ur) {
		queryRole = "SELECT user_role FROM ers_user_roles WHERE ers_user_role_id = " + roleId;
		try {
			Statement stmt = connection.createStatement();
			ResultSet rsRole = stmt.executeQuery(queryRole);
			while (rsRole.next()) {
				ur.setUserRole(rsRole.getString("user_role"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
