package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsUsers;
import com.capitalone.daointerfaces.ErsUserDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsUserDaoImpl implements ErsUserDaoInterface {
	
	private Logger log = Logger.getRootLogger();
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public ErsUsers findByUserName(String username, String password) {
		log.debug("Trying to find username and password");
		
		Connection conn = ersConUtil.getConnection();
		
		try {
			PreparedStatement usersPreparedStatement = conn.prepareStatement("SELECT * FROM ers_users JOIN ers_user_roles ON (ers_users.user_role_id = ers_user_roles.ers_user_role_id ) WHERE ers_username = ? AND ers_password = ?");
			usersPreparedStatement.setString(1, username);
			usersPreparedStatement.setString(2, password);
			
			ResultSet rs = usersPreparedStatement.executeQuery();
			
			ErsUsers user = null;
			log.debug("prepared");
			if(rs.next()) {
				user = new ErsUsers(rs.getInt("ers_users_id"), 
									rs.getString("ers_username"), 
									rs.getString("ers_password"), 
									rs.getString("user_first_name"),
									rs.getString("user_last_name"),
									rs.getString("user_email"),
									rs.getString("user_role"));
				log.debug("successfully retreived");
				System.out.println(user.toString());
			}
			return user;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
