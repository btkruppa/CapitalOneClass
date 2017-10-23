package com.capitalone.dao;

import java.lang.reflect.Array;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capitalone.bean.ReImbursementList;
import com.capitalone.utilities.ConnectionUtility;


public class EmployeeReimbListDao implements ReimburseList {

	private ConnectionUtility conUtil = new ConnectionUtility();
	
	public List<ReImbursementList> reimbList(int reimbAuthor) {
		
		List<ReImbursementList> reimbList = new ArrayList<ReImbursementList>();

		PreparedStatement preparedStmt;

		try (Connection con = conUtil.getConnection()) {
			preparedStmt = con.prepareStatement(
					"SELECT a.reimb_id as \"Reimb_ID\", a.reimb_amount as \"Reimb_Amount\", a.reimb_submitted as \"Submited_Time\", "
							+ "a.reimb_resolved as \"Resolved_Time\", a.reimb_description as \"Description\", a.reimb_receipt as \"Receipt\", "
							+ "b.user_first_name as \"RequestedUserName\", e.user_first_name as \"Resolver\", c.reimb_status as \"Reimb_Status\", d.reimb_type as \"Reimb_Type\" "
							+ "FROM ers_reimbursement a JOIN ers_users b ON (a.reimb_author = b.ers_users_id)"
							+ "JOIN ers_reimbursement_status c ON (a.reimb_status_id = c.reimb_status_id)"
							+ "JOIN ers_reimbursement_type d ON (a.reimb_type_id = d.reimb_type_id)"
							+ "LEFT JOIN ers_users e ON (a.reimb_resolver = e.ers_users_id)"
							+ "WHERE a.reimb_author = ?");

			preparedStmt.setInt(1, reimbAuthor);
			ResultSet rs = preparedStmt.executeQuery();
			
			while (rs.next()) {

				ReImbursementList list = new ReImbursementList(rs.getInt("Reimb_ID"), rs.getFloat("Reimb_Amount"),
						rs.getDate("Submited_Time"), rs.getDate("Resolved_Time"), rs.getString("Description"),
						rs.getString("Receipt"), rs.getString("RequestedUserName"), rs.getString("Resolver"),
						rs.getString("Reimb_Status"), rs.getString("Reimb_Type"));
				
				reimbList.add(list);

				}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return reimbList;
		
	}

}
