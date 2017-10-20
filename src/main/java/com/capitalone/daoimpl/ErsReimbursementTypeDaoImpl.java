package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursementType;
import com.capitalone.daointerfaces.ErsReimbursementTypeDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementTypeDaoImpl implements ErsReimbursementTypeDaoInterface {
	
	private Logger log = Logger.getRootLogger();
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public ErsReimbursementType findByreimbTypeId(int reimbTypeId) {
		Connection conn = ersConUtil.getConnection();
		try {
			PreparedStatement reimbursementType = conn.prepareStatement("SELECT * FROM ers_reimbursement_type WHERE reimb_type_id = ?");
			reimbursementType.setInt(1, reimbTypeId);
			ResultSet rs = reimbursementType.executeQuery();
			log.debug(reimbursementType);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}

	public static void main(String[] args) {
		ErsReimbursementTypeDaoImpl er = new ErsReimbursementTypeDaoImpl();
		er.findByreimbTypeId(1);
	}
}
