package com.capitalone.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capitalone.utilities.ConnectionUtility;

public class ReimbFormDao implements FormSubmission {

	private ConnectionUtility conUtil = new ConnectionUtility();

	@Override
	public boolean reimbList(BigDecimal reimbAmount, Date reimbSubmitted, String reimbDesc, String reimbReceipt,
			int reimbAuthor, int reimbStatus, int reimbType) {
		PreparedStatement preparedStmt;

		try (Connection con = conUtil.getConnection()) {

			preparedStmt = con.prepareStatement(
					"INSERT INTO ers_reimbursement (reimb_amount,  reimb_submitted, reimb_description, reimb_receipt, reimb_author, reimb_status_id, reimb_type_id)"
							+ " VALUES (?, ?, ?, ?, ?, ?, ?)");

			preparedStmt.setBigDecimal(1, reimbAmount);
			preparedStmt.setDate(2, reimbSubmitted);
			preparedStmt.setString(3, reimbDesc);
			preparedStmt.setString(4, reimbReceipt);
			preparedStmt.setInt(5, reimbAuthor);
			preparedStmt.setInt(6, reimbStatus);
			preparedStmt.setInt(7, reimbType);
			int i = preparedStmt.executeUpdate();
			

			if (i > 0) {
				return true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;

	}

}
