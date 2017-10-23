package com.capitalone.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capitalone.bean.ERSUserRole;
import com.capitalone.utilities.ConnectionUtility;

public class ERSUserRoleDao implements UserRole {

	private ConnectionUtility conUtil = new ConnectionUtility();

	public ERSUserRole userRole(int role_id) {

		PreparedStatement preparedStmt;

		try (Connection con = conUtil.getConnection()) {
			preparedStmt = con.prepareStatement("SELECT * FROM ers_user_roles WHERE ers_user_role_id = ?");
			preparedStmt.setInt(1, role_id);
			ResultSet rs = preparedStmt.executeQuery();
			while (rs.next()) {
				if ((rs.getInt("ers_user_role_id")) == role_id) {

					ERSUserRole ersUserRole = new ERSUserRole(rs.getInt("ers_user_role_id"), rs.getString("user_role"));
					return ersUserRole;
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

}
