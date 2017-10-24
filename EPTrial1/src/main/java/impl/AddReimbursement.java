package impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ReimbursementTypeDAO;
import utilities.DBConnectionUtility;

public class AddReimbursement implements ReimbursementTypeDAO {

	DBConnectionUtility conUtil = new DBConnectionUtility();

	public void addReimbursement() {
		PreparedStatement pstmt = null;

		try {
			Connection conn = conUtil.getConnection();

//			String SQL = "INSERT INTO reimbursement.ERS_REIMBURSEMENT (REIMB_ID, REIMB_AMOUNT, REIMB_SUBMITTED, REIMB_DESCRIPTION, REIMB_RESOLVER ,REIMB_AUTHOR, REIMB_STATUS_ID,REIMB_TYPE_ID ) VALUES (?,?,?,?,?,?,?,?) ";
//			pstmt.setInt(1, 4);
//			pstmt.setInt(2, 400);
//			pstmt.setTimestamp(3, getCurrentTimeStamp());
//			pstmt.setString(4, "TRAVEL");
//			pstmt.setInt(5, 1);
//			pstmt.setInt(6, 1);
//			pstmt.setInt(7, 1);
//			pstmt.setInt(8, 1);
			
			String SQL = "INSERT INTO ERS_REIMBURSEMENT VALUES(?,?,?,?,?,?,?,?,?,?)";
			pstmt = conn.prepareStatement(SQL);
			//stmt.setString(2, animal.getName());

			
			
//			ResultSet rs = pstmt.executeUpdate(SQL);
//			while(rs.next()){
//				System.out.println("Inserted the row successfully in ERS_REIMBURSEMENT table: " rs.getString("REIMB_DESCRIPTION"));
//			}

			int numberOfRowsAffected = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();

			while (rs.next()) {
			System.out.println("num" + numberOfRowsAffected);
			System.out.println("rs are" + rs + "1   " + rs.getInt(1) + "2    " + rs.getInt(2));	
		}

			
		}

		catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void getReimbursement() {

	}

	private static java.sql.Timestamp getCurrentTimeStamp() {

		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

}
