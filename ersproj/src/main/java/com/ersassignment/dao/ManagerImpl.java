package com.ersassignment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.utilities.ConnectionUtil;

public class ManagerImpl implements ManagerReimbursementDAO {

	private ConnectionUtil conUtil = new ConnectionUtil();
	List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();

	@Override
	public List<Ers_reimbursement> findAllRequests() {
		List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			java.sql.Statement stmt = conn.createStatement();
			// Ers_reimbursement rei_au = new Ers_reimbursement();

			String sqlString1 = "select * from ers_reimbursement order by reimb_id ";
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
	public List<Ers_reimbursement> findByStatus() {
		List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			java.sql.Statement stmt = conn.createStatement();
			// Ers_reimbursement rei_au = new Ers_reimbursement();

			String sqlString1 = "select * from ers_reimbursement where reimb_status_id<3 order by reimb_id";
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
	public List<Ers_reimbursement> approveRequest(int reimb_id) {
		System.out.println(reimb_id);
		System.out.println("Inside Approve DAO");
		List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			java.sql.Statement stmt = conn.createStatement();
			Ers_reimbursement id = new Ers_reimbursement();
			id.setReimb_id(reimb_id);
			// String SQL="update ers_reimbursement set reimb_status_id=3 where
			// reimb_status_id=? AND reimb_id=? ";
			String SQL = "update ers_reimbursement set reimb_status_id=3 where reimb_status_id=? AND reimb_id=?";

			PreparedStatement pstmt = conn.prepareStatement(SQL);
			// get it from the front UI thru the obj.get field
			pstmt.setInt(1, 1);
			pstmt.setInt(2, reimb_id);

			int numberRowsUpdated = pstmt.executeUpdate();
			System.out.println(numberRowsUpdated + " rows APPROVED");

			ResultSet rs = pstmt.getGeneratedKeys();
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

	public List<Ers_reimbursement> denyRequest(int reimb_id) {
		System.out.println(reimb_id);
		System.out.println("Inside DENY DAO");
		List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
		try (Connection conn = conUtil.getConnection()) {
			java.sql.Statement stmt = conn.createStatement();
			Ers_reimbursement id = new Ers_reimbursement();
			id.setReimb_id(reimb_id);
			// String SQL="update ers_reimbursement set reimb_status_id=3 where
			// reimb_status_id=? AND reimb_id=? ";
			String SQL = "update ers_reimbursement set reimb_status_id=4 where reimb_status_id=? AND reimb_id=?";

			PreparedStatement pstmt = conn.prepareStatement(SQL);
			// get it from the front UI thru the obj.get field
			pstmt.setInt(1, 1);
			pstmt.setInt(2, reimb_id);

			int numberRowsUpdated = pstmt.executeUpdate();
			System.out.println(numberRowsUpdated + " rows DENIED");

			ResultSet rs = pstmt.getGeneratedKeys();
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

}
