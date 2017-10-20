package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.xml.transform.Result;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementDaoImpl implements ErsReimbursementDaoInterface {

	private Logger log = Logger.getRootLogger();

	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public List<ErsReimbursement> getReimbursementByUser(String username) {

		Connection conn = ersConUtil.getConnection();

		log.debug("DB connection successful");

		try {
			PreparedStatement reimbursement = conn.prepareStatement(
					"SELECT * FROM ers_reimbursement JOIN ers_users ON (ers_reimbursement.reimb_author = ers_users.ers_users_id) "
					+ "								JOIN ers_reimbursement_status ON (ers_reimbursement.reimb_status_id = ers_reimbursement_status.reimb_status_id) "
					+ "								JOIN ers_reimbursement_type ON (ers_reimbursement.reimb_type_id = ers_reimbursement_type.reimb_type_id) WHERE ers_username = ? ");
			reimbursement.setString(1, username);
			ResultSet rs = reimbursement.executeQuery();
			log.debug(rs.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static void main(String[] args) {
		ErsReimbursementDaoImpl er = new ErsReimbursementDaoImpl();
		er.getReimbursementByUser("devi");
	}

}
