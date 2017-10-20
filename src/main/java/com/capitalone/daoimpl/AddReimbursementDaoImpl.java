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
	public ErsReimbursement addReimbursement(ErsReimbursement ersReimbursement) {
		Connection conn = ersConUtil.getConnection();
		log.debug("DB Connection");
		try {
			PreparedStatement addReimbursement = conn.prepareStatement("INSERT * FROM ers_user_roles WHERE ers_user_role_id = ?");
//			addReimbursement.set
			ResultSet rs = addReimbursement.executeQuery();
			log.debug(addReimbursement);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
