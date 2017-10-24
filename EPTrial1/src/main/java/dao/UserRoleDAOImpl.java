package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ers.reimbursement.model.Users;

import utilities.DBConnectionUtility;

public class UserRoleDAOImpl implements UserRoleDAO{

	DBConnectionUtility conUtil = new DBConnectionUtility();
	
	//select "user_role_id" from reimbursement."ers_users" where "ers_username" = 'sunlight1'
	@Override
	public Users empOrManager(String username) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		Users user = new Users();
		String SQL = "select user_role_id from reimbursement.ers_users where ers_username = ?";
					
			return null;


			


}
}

