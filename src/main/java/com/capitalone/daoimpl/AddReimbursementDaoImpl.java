package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.log4j.Logger;

import com.capitalone.daointerfaces.AddReimbursementDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class AddReimbursementDaoImpl implements AddReimbursementDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();
	private Logger log = Logger.getRootLogger();
	
	@Override
	public void addReimbursement(float reimbAmount, Date reimbSubmitted, String reimbDesc, String reimbReceipt,
            int reimbAuthor, int reimbStatus, int reimbType) {
			log.debug("Add Reimbursement Dao Implementation");
		try(Connection conn = ersConUtil.getConnection()) {
			PreparedStatement addReimbursement = conn.prepareStatement(
					"INSERT INTO ers_reimbursement (reimb_amount,  reimb_submitted, reimb_description, reimb_receipt, reimb_author, reimb_status_id, reimb_type_id) VALUES (?, ?, ?, ?, ?, ?, ?)");
//			  Byte receipt = Byte.valueOf(reimbReceipt);
			
//			Blob b =  conn.createBlob();
//			b.setBytes(1, reimbDesc.getBytes());
//			
			addReimbursement.setFloat(1, reimbAmount);
			addReimbursement.setDate(2, reimbSubmitted);
			addReimbursement.setString(3, reimbDesc);
			addReimbursement.setString(4, reimbReceipt);
			addReimbursement.setInt(5, reimbAuthor);
			addReimbursement.setInt(6, reimbStatus);
			addReimbursement.setInt(7, reimbType);
			
			addReimbursement.execute();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
