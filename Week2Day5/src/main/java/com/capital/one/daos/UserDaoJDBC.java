package com.capital.one.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.capital.one.beans.BankAccount;
import com.capital.one.beans.User;

public class UserDaoJDBC implements UserDao {
	BankAccountDao bd = new BankAccountDaoJDBC();

	public User findByUsernameAndPassword(String username, String password) {
		try (Connection conn = DriverManager.getConnection(
				"jdbc:postgresql://localhost:5432/postgres?currentSchema=week2day3", "postgres", "bondstone")) {

			String sqlString = "SELECT * FROM users WHERE username = '" + username + "' AND password = '" + password
					+ "'";
			System.out.println("SQL String for loggin in");
			System.out.println(sqlString);

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlString);
			User user = null;
			if (rs.next()) {
				List<BankAccount> accounts = bd.findByUserId(rs.getInt("id"));
				user = new User(rs.getInt("id"), rs.getString("username"), rs.getString("password"), accounts);
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean addNewUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean updateUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

}
