package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.AddReimbursementDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class AddReimbursementDaoImpl implements AddReimbursementDaoInterface {
	
	private Logger log = Logger.getRootLogger();
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	
	@Override
	public ErsReimbursement addReimbursement(String username) {
		Connection conn = ersConUtil.getConnection();
		log.debug("DB Connection");
		try {
			PreparedStatement userRole = conn.prepareStatement("INSERT * FROM ers_user_roles WHERE ers_user_role_id = ?");
			userRole.setString(1, username);
			ResultSet rs = userRole.executeQuery();
			log.debug(userRole);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
