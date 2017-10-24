package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementManagerDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementManagerDaoImpl implements ErsReimbursementManagerDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	
	List<ErsReimbursement> ersReimbursement = null;
	Logger log = Logger.getLogger("ErsReimbursementManagerDaoImpl");
	private String allReimbursement = "SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
			+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
			+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id)"
			+ "order by ers_reimbursement.reimb_id ";
	
	private String approvedtickets = "SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
			+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
			+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id) "
			+ "WHERE ers_reimbursement.reimb_status_id = 1 "
			+ "order by ers_reimbursement.reimb_id ";
	private String pendingtickets = "SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
			+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
			+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id) "
			+ "WHERE ers_reimbursement.reimb_status_id = 2 "
			+ "order by ers_reimbursement.reimb_id ";
	private String declinedtickets = "SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
			+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
			+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id) "
			+ "WHERE ers_reimbursement.reimb_status_id = 3 "
			+ "order by ers_reimbursement.reimb_id ";
	
	@Override
	public List<ErsReimbursement> getReimbursementByManager (HttpServletRequest req, String type) {
		
		
		Connection conn = ersConUtil.getConnection();
		String sql = null;
		switch (type) {
		case "All":sql = allReimbursement;
			break;
			
		case "pending":sql = pendingtickets;
		break;
		
		case "declined":sql = declinedtickets;
		break;

		case "approved":sql = approvedtickets;
		break;
		default:
			break;
		}
		
		try {
			PreparedStatement reimbursementStmtManager = conn.prepareStatement(sql);
			
			ResultSet rsManager = reimbursementStmtManager.executeQuery();
			ersReimbursement = new ArrayList<ErsReimbursement>();
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
			
			req.getSession().setAttribute("reimbursement",ersReimbursement);
			log.debug("We are at the DAO and our list should be :" + ersReimbursement);
			return ersReimbursement;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
//                  public static void main(String[] args) {
//                   ErsReimbursementManagerDaoImpl ep = new ErsReimbursementManagerDaoImpl();
//                     System.out.println(ep.getReimbursementByManager(null));
//	}
}
