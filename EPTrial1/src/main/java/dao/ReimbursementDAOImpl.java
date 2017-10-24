package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import com.ers.reimbursement.model.Reimbursement;

import utilities.DBConnectionUtility;

public class ReimbursementDAOImpl implements ReimbursementDAO {

	DBConnectionUtility conUtil = new DBConnectionUtility();

	@Override
	public List<Reimbursement> getAllReimbursements() {
		List<Reimbursement> reimbursements = new ArrayList<>();
		Connection conn = null;
		String SQL = "SELECT * FROM reimbursement.ers_reimbursement ORDER BY reimb_id";
//		String SQL = "SELECT T1.*,T2.*,T3.* from reimbursement.ers_reimbursement as T1 inner join reimbursement.ers_users as T2 "
//				+ "ON T1.reimb_author = T2.ers_users_id inner join reimbursement.ers_reimbursement_status as T3 "
//				+ "ON T1.reimb_status_id = T3.reimb_status_id ORDER BY T1.reimb_id";
		PreparedStatement pstmt = null;
		try {
			conn = conUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Reimbursement reimb = new Reimbursement();

				reimb.setReimbId(rs.getInt("reimb_id"));
				reimb.setReimbAmount(rs.getInt("reimb_amount"));
				reimb.setReimbSubmitted(rs.getTimestamp("reimb_submitted"));
				//reimb.setReimResolved(rs.getTimestamp("reimb_resolved"));
				reimb.setReimbDescription(rs.getString("reimb_description"));
				// add reimbReciept later
				reimb.setReimbAuthor(rs.getInt("reimb_author"));
				//reimb.setReimbAuthor(rs.getString("user_first_name"));
				//reimb.setReimbResolver(rs.getInt("reimb_resolver"));
				//reimb.setReimbStatusId(rs.getInt("reimb_status_id"));
				//reimb.setReimbTypeId(rs.getInt("reimb_type_id"));

				reimbursements.add(reimb);
			}
		} catch (SQLException e) {
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
		return reimbursements;
	}
	public List<Reimbursement> getAllReimbursementsByStatus(int statusID) {
		List<Reimbursement> reimbursements = new ArrayList<>();
		Connection conn = null;
		String SQL = "SELECT * FROM reimbursement.ers_reimbursement Where reimb_status_id = ? ORDER BY reimb_id";
//		String SQL = "SELECT T1.*,T2.*,T3.* from reimbursement.ers_reimbursement as T1 inner join reimbursement.ers_users as T2 "
//				+ "ON T1.reimb_author = T2.ers_users_id inner join reimbursement.ers_reimbursement_status as T3 "
//				+ "ON T1.reimb_status_id = T3.reimb_status_id ORDER BY T1.reimb_id";
		PreparedStatement pstmt = null;
		try {
			conn = conUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, statusID);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Reimbursement reimb = new Reimbursement();

				reimb.setReimbId(rs.getInt("reimb_id"));
				reimb.setReimbAmount(rs.getInt("reimb_amount"));
				reimb.setReimbSubmitted(rs.getTimestamp("reimb_submitted"));
				//reimb.setReimResolved(rs.getTimestamp("reimb_resolved"));
				reimb.setReimbDescription(rs.getString("reimb_description"));
				// add reimbReciept later
				reimb.setReimbAuthor(rs.getInt("reimb_author"));
				//reimb.setReimbAuthor(rs.getString("user_first_name"));
				//reimb.setReimbResolver(rs.getInt("reimb_resolver"));
				//reimb.setReimbStatusId(rs.getInt("reimb_status_id"));
				//reimb.setReimbTypeId(rs.getInt("reimb_type_id"));

				reimbursements.add(reimb);
			}
		} catch (SQLException e) {
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
		return reimbursements;
	}

	@Override
	public void addReimbursement(Reimbursement saveNewReimb) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		int success = 0;
		try {
			String SQL = "INSERT INTO ERS_REIMBURSEMENT (reimb_amount, reimb_submitted, reimb_resolved, reimb_description, reimb_author, "
					+ "reimb_status_id, reimb_type_id) VALUES(?,?,?,?,?,?,?)";
			conn = conUtil.getConnection();
			// Setup PreparedStatement
			pstmt = conn.prepareStatement(SQL);
			// Add parameters from Reimbursement into PreparedStatement
			//pstmt.setInt(1, saveNewReimb.getReimbId());
			pstmt.setInt(1, saveNewReimb.getReimbAmount());
			pstmt.setTimestamp(2, saveNewReimb.getReimbSubmitted());
			pstmt.setTimestamp(3, saveNewReimb.getReimResolved());
			pstmt.setString(4, saveNewReimb.getReimbDescription());
			// pstmt.set(for receipt)
			pstmt.setInt(5, saveNewReimb.getReimbAuthor());
			// pstmt.setInt(7, saveNewReimb.getReimbResolver());
			pstmt.setInt(6, saveNewReimb.getReimbStatusId());
			pstmt.setInt(7, saveNewReimb.getReimbTypeId());

			success = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (success == 0) {
			// then update didn't occur, throw an exception
			throw new Exception("Insert for reimbursement table failed: " + saveNewReimb);
		}
	}

	//select * from reimbursement."ers_reimbursement" where "reimb_author" = 2;
	@Override
	public List<Reimbursement> getAllTicketsForAUser(int ersUsersId) {
		List<Reimbursement> reimbursements = new ArrayList<>();
		Connection conn = null;
		String SQL = "SELECT * FROM reimbursement.ers_reimbursement WHERE reimb_author = ?";
		PreparedStatement pstmt = null;
		try {
			conn = conUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, ersUsersId);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Reimbursement reimb = new Reimbursement();

				//reimb.setReimbId(rs.getInt("reimb_id"));
				reimb.setReimbAmount(rs.getInt("reimb_amount"));
				reimb.setReimbSubmitted(rs.getTimestamp("reimb_submitted"));
				//reimb.setReimResolved(rs.getTimestamp("reimb_resolved"));
				reimb.setReimbDescription(rs.getString("reimb_description"));
				// add reimbReciept later
				reimb.setReimbAuthor(rs.getInt("reimb_author"));
				//reimb.setReimbResolver(rs.getInt("reimb_resolver"));
				//reimb.setReimbStatusId(rs.getInt("reimb_status_id"));
				//reimb.setReimbTypeId(rs.getInt("reimb_type_id"));

				reimbursements.add(reimb);
			}
		} catch (SQLException e) {
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
		return reimbursements;
	}

	//select * from reimbursement."ers_reimbursement" where "reimb_status_id" = 1
	@Override
	public List<Reimbursement> filterReimbByStatus(int reimbStatusId) {
		List<Reimbursement> reimbursements = new ArrayList<>();
		Connection conn = null;
		String SQL = "SELECT * FROM reimbursement.ers_reimbursement WHERE reimb_status_id = ?";
		PreparedStatement pstmt = null;
		try {
			conn = conUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, reimbStatusId);
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Reimbursement reimb = new Reimbursement();

				reimb.setReimbId(rs.getInt("reimb_id"));
				reimb.setReimbAmount(rs.getInt("reimb_amount"));
				reimb.setReimbSubmitted(rs.getTimestamp("reimb_submitted"));
				reimb.setReimResolved(rs.getTimestamp("reimb_resolved"));
				reimb.setReimbDescription(rs.getString("reimb_description"));
				// add reimbReciept later
				reimb.setReimbAuthor(rs.getInt("reimb_author"));
				reimb.setReimbResolver(rs.getInt("reimb_resolver"));
				reimb.setReimbStatusId(rs.getInt("reimb_status_id"));
				reimb.setReimbTypeId(rs.getInt("reimb_type_id"));

				reimbursements.add(reimb);
			}
		} catch (SQLException e) {
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
		return reimbursements;
	}
	
	//select * from reimbursement."ers_reimbursement" where "reimb_id" = 1
	@Override
	public Reimbursement getSingleReimbData(int reimbId) {
		
		System.out.println(" query to run accept/deny");
		Connection conn = null;
		String SQL = "select * from reimbursement.ers_reimbursement where reimb_id = ?";
		PreparedStatement pstmt = null;
		Reimbursement reimb = null;
		
		
		try {
			conn = conUtil.getConnection();
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, reimbId);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				reimb = new Reimbursement();
				reimb.setReimbId(rs.getInt("reimb_id"));
				reimb.setReimbAmount(rs.getInt("reimb_amount"));
				reimb.setReimbSubmitted(rs.getTimestamp("reimb_submitted"));
				reimb.setReimResolved(rs.getTimestamp("reimb_resolved"));
				reimb.setReimbDescription(rs.getString("reimb_description"));
				// add reimbReciept later
				reimb.setReimbAuthor(rs.getInt("reimb_author"));
				reimb.setReimbResolver(rs.getInt("reimb_resolver"));
				reimb.setReimbStatusId(rs.getInt("reimb_status_id"));
				reimb.setReimbTypeId(rs.getInt("reimb_type_id"));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
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
		return reimb;
	}

	//update reimbursement.ers_reimbursement set "reimb_status_id" = 2, "reimb_resolved" = CURRENT_TIMESTAMP, "reimb_resolver" = 1 where "reimb_id" = 8;
	//@Override
//	public void updateReimbursement(int reimbStatusId,  int reimbId) {
//		Connection conn = null;
//		PreparedStatement pstmt = null;
//		int success = 0;
//		String sql = "UPDATE reimbursement.ers_reimbursement set reimb_status_id = ? where reimb_id = ?;";
//				
//		try {
//			conn = conUtil.getConnection();
//			pstmt = conn.prepareStatement(sql);
//				pstmt.setInt(1, reimbStatusId);
//				//pstmt.setTimestamp(2, resolvedTime);
//			//	pstmt.setInt(2, resolvedBy);
//				pstmt.setInt(2, reimbId);
//				
//				success = pstmt.executeUpdate();
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		finally {
//			try {
//				if (pstmt != null)
//					pstmt.close();
//				if (conn != null)
//					conn.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//		if (success == 0) {
//			// then update didn't occur, throw an exception
//			try {
//				throw new Exception("Update for reimbursement table failed");
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
	
	public void updateReimbursement(int statusID, int reimbID) {
        Connection conn = conUtil.getConnection();
        Reimbursement reimb = new Reimbursement();
        System.out.println("im status" + reimbID);
       

        try {
                        String SQL = "UPDATE reimbursement.ers_reimbursement SET reimb_status_id=? WHERE reimb_id =?;";

                        PreparedStatement pstmt = conn.prepareStatement(SQL);
                        pstmt.setInt(1,statusID );
                        pstmt.setInt(2, reimbID);

                        int numberOfRowsAffected = pstmt.executeUpdate();
                        ResultSet rs = pstmt.getGeneratedKeys();
                        System.out.println("num " + numberOfRowsAffected);

        } catch (SQLException e) {

                        e.printStackTrace();
        }

}

}
