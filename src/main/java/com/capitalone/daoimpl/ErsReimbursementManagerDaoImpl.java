package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementManagerDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementManagerDaoImpl implements ErsReimbursementManagerDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	
	List<ErsReimbursement> ersReimbursement = new ArrayList<ErsReimbursement>();
	
	@Override
	public List<ErsReimbursement> getReimbursementByManager() {
		
		
		Connection conn = ersConUtil.getConnection();
		
		try {
			PreparedStatement reimbursementStmtManager = conn.prepareStatement(
					"SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
					+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
					+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id)");
			
			ResultSet rsManager = reimbursementStmtManager.executeQuery();
			
//			ErsReimbursement reimbursementManager = null;
			while(rsManager.next()) {
				 ersReimbursement.add(new ErsReimbursement(rsManager.getInt("reimb_id"),
															rsManager.getFloat("reimb_amount"),
															rsManager.getDate("reimb_submitted"),
															rsManager.getDate("reimb_resolved"),
															rsManager.getString("reimb_description"),
															rsManager.getString("reimb_receipt"),
															rsManager.getString("user_first_name"),
															rsManager.getString("user_last_name"),
															rsManager.getString("reimb_status"),
															rsManager.getString("reimb_type")));
			}
			return ersReimbursement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
