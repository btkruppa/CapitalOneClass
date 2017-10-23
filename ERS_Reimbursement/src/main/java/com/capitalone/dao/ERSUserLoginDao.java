package com.capitalone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capitalone.bean.ERSUser;
import com.capitalone.utilities.ConnectionUtility;

public class ERSUserLoginDao implements LoginInfo {

	private ConnectionUtility conUtil = new ConnectionUtility();

	public ERSUser userLogin(String name, String password) {

		PreparedStatement preparedStmt;

		try (Connection con = conUtil.getConnection()) {
			preparedStmt = con.prepareStatement(
					"SELECT * FROM ers_users WHERE ers_username = ? AND ers_password = ?");
			preparedStmt.setString(1, name);
			preparedStmt.setString(2, password);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {
				if ((rs.getString("ers_username").equals(name)) && (rs.getString("ers_password").equals(password))) {

					ERSUser ersUser = new ERSUser(rs.getInt("ers_users_id"), rs.getString("ers_username"),
							rs.getString("ers_password"), rs.getString("user_first_name"), rs.getString("user_last_name"),
							rs.getString("user_email"), rs.getInt("user_role_id"));
					return ersUser;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
