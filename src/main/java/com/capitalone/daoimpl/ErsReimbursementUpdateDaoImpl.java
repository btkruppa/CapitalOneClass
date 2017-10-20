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
	public void updateReimbursement(String username, String reimbStatus) {
		System.out.println("method");
		Connection conn = ersConUtil.getConnection();
		try {
			System.out.println("test");
			PreparedStatement update = conn.prepareStatement("UPDATE * FROM ers_reimbursement_type WHERE reimb_type_id = ?");
			update.setString(1, username);
			update.setString(1, reimbStatus );
			ResultSet rs = update.executeQuery();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
