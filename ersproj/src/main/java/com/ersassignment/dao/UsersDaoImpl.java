package com.ersassignment.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import java.util.logging.LogManager;

import org.apache.log4j.Logger;

import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.model.Users_ERS;
import com.ersassignment.utilities.ConnectionUtil;

public class UsersDaoImpl implements UsersDAO, ReimbursementDAO {

	// private Logger log = LogManager.getRootLogger();
	private ConnectionUtil conUtil = new ConnectionUtil();
	List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();

	private static UsersDaoImpl ud = new UsersDaoImpl();

	@Override
	public Users_ERS findByUsernameAndPassword(String username, String password) {
		// log.debug("attempting to find User by username and password");
		// try (Connection conn = DriverManager.getConnection(
		// "jdbc:postgresql://localhost:5432/postgres?currentSchema=ers",
		// "postgres", "password")) {
		try (Connection conn = conUtil.getConnection()) {
			String sqlString = "SELECT * FROM ers_users WHERE ers_usersname = '" + username + "' AND ers_password = '"
					+ password + "'";

			// log.trace("SQL String for loggin in");
			// log.trace(sqlString);

			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlString);
			Users_ERS user = new Users_ERS();
			if (rs.next()) {
				// List<Ers_reimbursement> reimb = ud.findByReimb_author(5);
				user = new Users_ERS(rs.getInt("ers_users_Id"), rs.getString("ers_usersname"),
						rs.getString("ers_password"), rs.getString("user_firstName"), rs.getString("user_lastName"),
						rs.getString("user_email"), rs.getInt("user_role_id"), reimb);
				// log.debug("successfully retreived user by credentials");
			}
			return user;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

	@Override
	public List<Ers_reimbursement> findByReimb_author(int reimb_author) {
		List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			java.sql.Statement stmt = conn.createStatement();
			Ers_reimbursement rei_au = new Ers_reimbursement();
			rei_au.setReimb_author(reimb_author);
			reimb_author = 2;
			String sqlString1 = "select * from ers_reimbursement as er join ers_users as eu on (er.reimb_author=eu.ers_users_id) "
					+ "where er.reimb_author='" + rei_au.getReimb_author() + "'";
			ResultSet rs = stmt.executeQuery(sqlString1);
			while (rs.next()) {
				{
					reimb.add(new Ers_reimbursement(rs.getInt("reimb_id"), rs.getDouble("reimb_amount"), null, null,
							rs.getString("reimb_description"), rs.getInt("reimb_author"), rs.getInt("reimb_resolver"),
							rs.getInt("reimb_status_id"), rs.getInt("reimb_type_id")));

				}

			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reimb;
	}

	@Override
	public void addRequest(Ers_reimbursement ersreim) {

		try (Connection conn = conUtil.getConnection()) {
			String SQL = "INSERT INTO ers_reimbursement ( reimb_amount, reimb_submitted, reimb_description ,reimb_resolver ,reimb_author, reimb_status_id,reimb_type_id ) "
					+ "VALUES (?,?,?,?,?,?,?) ";

			PreparedStatement pstmt = conn.prepareStatement(SQL);

			pstmt.setDouble(1, ersreim.getReimb_amount());
			pstmt.setTimestamp(2, getCurrentTimestamp());
			pstmt.setString(3, ersreim.getReimb_description());

			pstmt.setInt(4, 2);
			pstmt.setInt(5, 2);
			// Users_ERS user = null;
			// pstmt.setInt(5, user.getErs_users_Id());
			// pstmt.setInt(5, ersreim.getReimb_author());
			// System.out.println(pstmt.setInt(5, user.getErs_users_Id()));
			pstmt.setInt(6, 2);
			pstmt.setInt(7, ersreim.getReimb_type_id());
			// pstmt.setInt(7, 1);

			int numberOfRowsAffected = pstmt.executeUpdate();
			ResultSet rs = pstmt.getGeneratedKeys();

			if (rs.next()) {
				System.out.println(("generated id is " +
				// rs.getInt("reimb_id") +
						rs.getDouble("reimb_amount") + rs.getTimestamp("reimb_submitted")
						+ rs.getTimestamp("reimb_resolved") + rs.getInt("reimb_author") + rs.getInt("reimb_resolver")
						+ rs.getInt("reimb_status_id") + rs.getInt("reimb_type_id")));
			}
			System.out.println("Record Inserted");
			return;

		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
			return;
		}

	}
	/*
	 * my old DAO PreparedStatement preparedStmt; preparedStmt =
	 * conn.prepareStatement("INSERT INTO ers_reimbursement " +
	 * "(reimb_id,reimb_amount,reimb_submitted,reimb_resolved,reimb_description,reimb_author,reimb_resolver,reimb_status_id,reimb_type_id) "
	 * + "VALUES (?,?,?,?,?,?,?,?)");
	 * 
	 * //preparedStmt.setInt(1, acc.getReimb_id()); //
	 * System.out.println(ersreim.getReimb_id()); preparedStmt.setDouble(2,
	 * acc.getReimb_amount()); //System.out.println(ersreim.getReimb_amount());
	 * 
	 * preparedStmt.setTimestamp(3, getCurrentTimestamp());
	 * //System.out.println(getReimb_submitted()); preparedStmt.setTimestamp(4,
	 * getCurrentTimestamp()); //System.out.println(22);
	 * //preparedStmt.setBlob(5,ersreim.getReimb_receipt);
	 * preparedStmt.setString(5, acc.getReimb_description()); //
	 * System.out.println(ersreim.getReimb_description());
	 * preparedStmt.setInt(6, acc.getReimb_author()); //
	 * System.out.println(ersreim.getReimb_author()); preparedStmt.setInt(7,
	 * acc.getReimb_resolver()); //
	 * System.out.println(ersreim.getReimb_resolver()); preparedStmt.setInt(8,
	 * acc.getReimb_status_id()); //
	 * System.out.println(ersreim.getReimb_status_id()); preparedStmt.setInt(9,
	 * acc.getReimb_type_id()); //preparedStmt.setInt(9,
	 * ersreim.getReimb_type_id()); int success = 0; success =
	 * preparedStmt.executeUpdate();
	 * 
	 * System.out.println(success + " row inserted"); // get the columns that
	 * were actually saved in the database ResultSet rs =
	 * preparedStmt.getGeneratedKeys();
	 * 
	 * if (rs.next()) { System.out.println(("generated id is " +
	 * rs.getInt("reimb_id") + rs.getDouble("reimb_amount")+
	 * rs.getTimestamp("reimb_submitted")+ rs.getTimestamp("reimb_resolved")+
	 * rs.getInt("reimb_author")+ rs.getInt("reimb_resolver")+
	 * rs.getInt("reimb_status_id")+ rs.getInt("reimb_type_id"))); }
	 * 
	 * } catch (SQLException e) { System.out.println("error");
	 * e.printStackTrace();
	 * 
	 * }
	 * 
	 * 
	 * 
	 * }
	 */

	public Timestamp getCurrentTimestamp() {
		java.util.Date today = new java.util.Date();
		return new java.sql.Timestamp(today.getTime());

	}

	@Override
	public Users_ERS findUserOrMgr(String username, String password) {
		// "jdbc:postgresql://localhost:5432/postgres?currentSchema=ers",
		// "postgres", "password")) {
		try (Connection conn = conUtil.getConnection()) {
			// select * from "ers_users" as eu
			// join "ers_user_roles"as er
			// on (er."ers_user_role_id"=1)
			String sqlString = "SELECT * FROM ers_users join ers_user_roles as er on (er.ers_user_role_id=1) WHERE ers_usersname = '"
					+ username + "' AND ers_password = '" + password + "'";
			java.sql.Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlString);
			Users_ERS user = null;
			if (rs.next()) {
				// List<Ers_reimbursement> reimb = ud.findByReimb_author(5);
				/*
				 * user = new Users_ERS(rs.getInt("ers_users_Id"),
				 * rs.getString("ers_usersname"), rs.getString("ers_password"),
				 * rs.getString("user_firstName"),rs.getString("user_lastName"),
				 * rs.getString("user_email"),rs.getInt("user_role_id"),reimb);
				 */
				if (rs.getInt("user_role_id") == 1) {
					System.out.println("You are a User");
				} else if (rs.getInt("user_role_id") == 2) {
					System.out.println("You are NOT a User");
				} else {
					System.out.println("Cud be others");
				}

				// log.debug("successfully retreived user by credentials");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
