package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsUserRoles;
import com.capitalone.daointerfaces.ErsUserRolesDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsUserRolesDaoImpl implements ErsUserRolesDaoInterface {
	
	private Logger log = Logger.getRootLogger();
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	
	@Override
	public ErsUserRoles findByErsUserRoleId(int ersUserRoleId) {
		Connection conn = ersConUtil.getConnection();
		log.debug("DB Connection");
		try {
			PreparedStatement userRole = conn.prepareStatement("SELECT * FROM ers_user_roles WHERE ers_user_role_id = ?");
			userRole.setInt(1, ersUserRoleId);
//			ResultSet rs = userRole.executeQuery();
			log.debug(userRole);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		ErsUserRolesDaoImpl er = new ErsUserRolesDaoImpl();
		er.findByErsUserRoleId(1);
	}

}
