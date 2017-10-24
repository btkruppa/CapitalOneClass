package com.capitalone.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daointerfaces.ErsReimbursementUpdateDaoInterface;
import com.capitalone.utilities.ErsConnectionUtility;

public class ErsReimbursementUpdateDaoImpl implements ErsReimbursementUpdateDaoInterface {
	
	private ErsConnectionUtility ersConUtil = new ErsConnectionUtility();

	@Override
	public int updateReimbursement(String userRole, int reimbStatus, int reimbId) {
		System.out.println("method");
		Connection conn = ersConUtil.getConnection();
		int rows=0;
		try {
			System.out.println("test");
			PreparedStatement update = conn.prepareStatement("UPDATE ers.ers_reimbursement SET reimb_status_id=?, reimb_resolved=?, reimb_resolver=? WHERE reimb_id = ?");
			update.setInt(1, reimbStatus);
			update.setTimestamp(2, new Timestamp(Calendar.getInstance().getTimeInMillis()));
//			int resolverRole = Integer.parseInt(userRole);
			update.setInt(3, 2);
			update.setInt(4, reimbId );
			rows = update.executeUpdate();
			System.out.println("Completed Update");
			update.close();
		} 
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
		}
		return rows;
	}
	
	
}
