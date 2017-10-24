package impl;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import dao.ReimbursementUsersDAO;
import utilities.DBConnectionUtility;

public class ImplementUsersDAO implements ReimbursementUsersDAO{
	
	private DBConnectionUtility connUtil = new DBConnectionUtility();

	public void getUsers() {
		try(Connection conn = connUtil.getConnection()){
			
			//We have provided the url, username and password in properties file.
//			Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres?currentSchema=reimbursement",
//				"postgres","Welcome9");
			
			PreparedStatement preparedStmt;
			//select worked
			//preparedStmt = conn.prepareStatement("SELECT * FROM reimbursement.ERS_USER_ROLES where ERS_USER_ROLES_ID = '100'");
			preparedStmt = conn.prepareStatement("insert into ERS_USERS(ERS_USERS_ID, ERS_USERNAME, ERS_PASSWORD, USER_FIRST_NAME, USER_LAST_NAME, USER_EMAIL, USER_ROLE_ID) values (?, ?, ?, ?, ?, ?, ?");
			preparedStmt.setInt(1, 7);
			preparedStmt.setString(2, "sunlight7");
			preparedStmt.setString(3, "abcd1234");
			preparedStmt.setString(4, "John");
			preparedStmt.setString(5, "Hudak");
			preparedStmt.setString(6, "jh@gmail.com");
			preparedStmt.setInt(7, 101);
			
			
			//ResultSet rs = preparedStmt.executeQuery();
			preparedStmt.executeUpdate();
			ResultSet rs = preparedStmt.getGeneratedKeys();
		    while (rs.next()) {
		    	System.out.println(rs.getString("ERS_USER_ROLES_ID") + " " + rs.getString("USER_ROLE"));
		        }
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}


}
