package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementUserDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementUserDaoImpl implements ErsReimbursementUserDaoInterface {

	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	List<ErsReimbursement> ersReimbursement = new ArrayList<ErsReimbursement>();
	
	@Override
	public List<ErsReimbursement> getReimbursementByUser(String username) {
		
		Connection conn = ersConUtil.getConnection();
		
		try {
			PreparedStatement reimbursementStmtUser = conn.prepareStatement(
					"SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id) WHERE ers_username = ?");
			reimbursementStmtUser.setString(1, username);
			ResultSet rsUser = reimbursementStmtUser.executeQuery();
			
			System.out.println(rsUser.next());
			
			while(rsUser.next()) {
				 ersReimbursement.add(new ErsReimbursement(rsUser.getInt("reimb_id"),
						 									rsUser.getFloat("reimb_amount"),
						 									rsUser.getDate("reimb_submitted"),
						 									rsUser.getDate("reimb_resolved"),
						 									rsUser.getString("reimb_description"),
						 									rsUser.getString("reimb_receipt"),
						 									rsUser.getString("user_first_name"),
						 									rsUser.getString("user_last_name"),
						 									rsUser.getString("reimb_status"),
						 									rsUser.getString("reimb_type"),
						 									rsUser.getInt("reimb_author"),
						 									rsUser.getInt("reimb_Resolver"),
						 									rsUser.getInt("reimb_status_id"),
						 									rsUser.getInt("reimb_type_Id")));
			}
			return ersReimbursement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void main(String[] args) {
		ErsReimbursementUserDaoImpl ers = new ErsReimbursementUserDaoImpl();
		ers.getReimbursementByUser("devi");
	}
	
	
}
