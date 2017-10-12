package com.capital.one.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capital.one.beans.User;
import com.capital.one.utilities.ConnectionUtility;

public class UserDao {
	private Logger log = Logger.getRootLogger();
	ConnectionUtility conUtil = new ConnectionUtility();

	public User findByUsername(String username, String password) {
		log.debug("attempting to find User by username and password");
		try (Connection conn = conUtil.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();
			User user = null;
			if (rs.next()) {
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				log.debug("successfully retreived user by id");
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public User findById(int id) {
		log.debug("attempting to find User by id");
		try (Connection conn = conUtil.getConnection()) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id=?");
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			User user = null;
			if (rs.next()) {
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"));
				log.debug("successfully retreived user by credentials");
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
