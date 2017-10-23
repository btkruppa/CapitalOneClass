package com.capitalone.dao;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.capitalone.utilities.ConnectionUtility;

public class ReimbUpdateStatusDao implements ReimbUpdateStatus{
	
	private ConnectionUtility conUtil = new ConnectionUtility();

	public boolean reimbStatusUpdate(int id, Date date, int resolverId, int reimbStatusId) {
		
		PreparedStatement preparedStmt;

		try (Connection con = conUtil.getConnection()) {

			preparedStmt = con.prepareStatement(
					"UPDATE ers_reimbursement SET reimb_resolved=?, reimb_resolver=? , reimb_status_id=? WHERE reimb_id =?");

			preparedStmt.setInt(4, id);
			preparedStmt.setDate(1, date);
			preparedStmt.setInt(2, resolverId);
			preparedStmt.setInt(3, reimbStatusId);
			
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
