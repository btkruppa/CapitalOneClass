package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ers.reimbursement.model.ReimbursementStatus;


import utilities.DBConnectionUtility;

public class StatusDAOImpl implements StatusDAO {

	DBConnectionUtility conUtil = new DBConnectionUtility();

	//select * from reimbursement."ers_reimbursement_status" where "reimb_status" = 'Approved'
	@Override
	public ReimbursementStatus getReimbStatus(String inputStatus) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ReimbursementStatus rStatus = null;
		try {
			conn = conUtil.getConnection();
			String sql = "SELECT * FROM reimbursement.ers_reimbursement_status where reimb_status = ?";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, inputStatus);

			ResultSet rs = pstmt.executeQuery();

			if (rs.next()) {
				rStatus = new ReimbursementStatus();
				rStatus.setReimbStatusId(rs.getInt("reimb_status_id"));
				rStatus.setReimbStatus(rs.getString("reimb_status"));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rStatus;
	}

}
