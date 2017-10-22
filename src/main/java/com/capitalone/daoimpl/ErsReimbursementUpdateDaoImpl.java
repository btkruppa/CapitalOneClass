package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.capitalone.daointerfaces.ErsReimbursementUpdateDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementUpdateDaoImpl implements ErsReimbursementUpdateDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public void updateReimbursement(int reimbId, int reimbResolver, int reimbStatusId, Date reimbResolved) {
		System.out.println("method");
		Connection conn = ersConUtil.getConnection();
		try {
			System.out.println("test");
			PreparedStatement update = conn.prepareStatement("UPDATE ers_reimbursement SET  reimb_resolver=?, reimb_status_id=?, reimb_resolved=?  WHERE reimb_id=?");
			update.setInt(1, reimbResolver);
			update.setInt(2, reimbStatusId );
			update.setDate(3, reimbResolved);
			update.setInt(4, reimbId);
			update.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
