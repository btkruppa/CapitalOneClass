package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementUpdateDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementUpdateDaoImpl implements ErsReimbursementUpdateDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public ErsReimbursement updateReimbursement(String username) {
		Connection conn = ersConUtil.getConnection();
		try {
			PreparedStatement reimbursementType = conn.prepareStatement("UPDATE * FROM ers_reimbursement_type WHERE reimb_type_id = ?");
			reimbursementType.setString(1, username);
			ResultSet rs = reimbursementType.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return null;
	}
	
}
