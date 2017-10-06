package com.capital.one.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import org.apache.log4j.Logger;

import com.capital.one.beans.BankAccount;
import com.capital.one.beans.User;
import com.capital.one.utilities.ConnectionUtility;

public class UserDaoJDBC implements UserDao {
	private BankAccountDao bd = new BankAccountDaoJDBC();
	private Logger log = Logger.getRootLogger();
	private ConnectionUtility conUtil = new ConnectionUtility();

	@Override
	public User findByUsernameAndPassword(String username, String password) {
		log.debug("attempting to find User by username and password");
		try (Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=week2day3", "postgres", "bondstone")) {

			String sqlString = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password
					+ "'";

			log.trace("SQL String for loggin in");
			log.trace(sqlString);

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlString);
			User user = null;
			if (rs.next()) {
				List<BankAccount> accounts = bd.findByUserId(rs.getInt("id"));
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), accounts);
				log.debug("successfully retreived user by credentials");
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public User betterFindByUsernameAndPassword(String username, String password) {
		log.debug("attempting to find User by username and password");
		try (Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=week2day3", "postgres", "bondstone")) {

			PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE username = ? AND password = ?");
			stmt.setString(1, username);
			stmt.setString(2, password);

			ResultSet rs = stmt.executeQuery();
			User user = null;
			if (rs.next()) {
				List<BankAccount> accounts = bd.findByUserId(rs.getInt("id"));
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), accounts);
				log.debug("successfully retreived user by credentials");
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addNewUser(User user) {
		try (Connection conn = conUtil.getConnection()) {

			PreparedStatement preparedStmt;
			preparedStmt = conn.prepareStatement("INSERT INTO users (username, password) VALUES (?, ?)",
					new String[] { "password", "id" });

			preparedStmt.setString(1, user.getUsername());
			preparedStmt.setString(2, user.getPassword());

			int numberRowsAffected = preparedStmt.executeUpdate();
			log.debug(numberRowsAffected + " rows affected");

			// get the columns that were actually saved in the database
			ResultSet rs = preparedStmt.getGeneratedKeys();

			if (rs.next()) {
				log.debug("generated id is " + rs.getInt("id") + " and password is " + rs.getString("password"));
			}
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	@Override
	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
