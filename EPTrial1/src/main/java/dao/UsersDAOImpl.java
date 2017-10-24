package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ers.reimbursement.model.Users;

import utilities.DBConnectionUtility;

public class UsersDAOImpl implements UsersDAO{
	
	DBConnectionUtility conUtil = new DBConnectionUtility();

	//select * from reimbursement."ers_users" where "ers_username" = 'sunlight2' and "ers_password" = 'abcd1234';
	@Override
	public Users getUserName(String username, String password) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Users user = null;
		try {
			//System.out.println("attempting to login");
			conn = conUtil.getConnection();
			String sql = "SELECT * FROM reimbursement.ers_users where ers_username = ? and ers_password = ?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()){
				user = new Users();
				user.setErsUsersId(rs.getInt("ers_users_id"));
				user.setErsUsername(rs.getString("ers_username"));
				user.setErsPassword(rs.getString("ers_password"));
				user.setUserFirstName(rs.getString("user_first_name"));
				user.setUserLastName(rs.getString("user_last_name"));
				user.setUserEmail(rs.getString("user_email"));
				user.setUserRoleId(rs.getInt("user_role_id"));	
			} else {
				System.out.println("invalid credentials");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
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
		return user;
	}

}
