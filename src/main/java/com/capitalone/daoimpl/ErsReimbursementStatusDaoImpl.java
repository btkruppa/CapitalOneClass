package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursementStatus;
import com.capitalone.daointerfaces.ErsReimbursementStatusDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementStatusDaoImpl implements ErsReimbursementStatusDaoInterface {

	private Logger log = Logger.getRootLogger();
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	
	@Override
	public ErsReimbursementStatus findByReimbStatusId(int reimbStatusId) {
		log.debug("in method");
		
		Connection conn = ersConUtil.getConnection();
		
		log.debug("DB connection successful");
		
		try {
			PreparedStatement reimbursementStatus = conn.prepareStatement("SELECT * FROM ers_reimbursement_status WHERE reimb_status_id = ?");
			reimbursementStatus.setInt(1, reimbStatusId);
			ResultSet rs = reimbursementStatus.executeQuery();
			log.debug(reimbursementStatus);
			log.debug("Query");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] args) {
		ErsReimbursementStatusDaoImpl ers = new ErsReimbursementStatusDaoImpl();
		ers.findByReimbStatusId(1);
	}

}
