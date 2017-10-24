package com.capitalone.reimbursementsystem.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.com.reimbursement.bean.User;
import com.capitalone.utilities.DAOUtilities;


public class EmpReimbHistoryDAOImpl implements EmpReimbHistoryDAO{
	String queryAllReimb;
	
	//Creating a DB connection to execute queries to view the past history of reimbursement requests
	DAOUtilities util = new DAOUtilities();
	Connection connection = util.getConnection();

	public ReimbReq listAllReimbursement(HttpServletRequest req, HttpServletResponse resp) throws IOException {	
		System.out.println("in DAO");
		User ul = DAOUtilities.getUser();
		ReimbReq reimbReq = DAOUtilities.getReimbReq();
		ul = (User) req.getSession().getAttribute("User");
		List<ReimbReq> allReimbReq = new ArrayList<ReimbReq>();
		queryAllReimb = "SELECT * FROM ers_reimbursement a join ers_reimbursement_status b on a.reimb_status_id = b.reimb_status_id WHERE reimb_author = "+ ul.getUserId();
		try {
			Statement stmt = connection.createStatement();
			ResultSet rsAllReimb = stmt.executeQuery(queryAllReimb);
			while(rsAllReimb.next()) {
				reimbReq.setReimb_id(rsAllReimb.getInt("reimb_id"));
				reimbReq.setReimb_amount(rsAllReimb.getInt("reimb_amount"));
				reimbReq.setReimb_submitted(rsAllReimb.getTimestamp("reimb_submitted"));
				reimbReq.setReimb_resolved(rsAllReimb.getTimestamp("reimb_resolved"));
				reimbReq.setReimb_desc(rsAllReimb.getString("reimb_description"));
				reimbReq.setReimb_status(rsAllReimb.getString("reimb_status"));
				allReimbReq.add(new ReimbReq(rsAllReimb.getInt("reimb_id"), rsAllReimb.getInt("reimb_amount"), rsAllReimb.getTimestamp("reimb_submitted"), rsAllReimb.getTimestamp("reimb_resolved"), 
						rsAllReimb.getString("reimb_description"),null, rsAllReimb.getInt("reimb_status_id"),0,rsAllReimb.getString("reimb_status")));
			}
			req.getSession(false).setAttribute("reimbursement", allReimbReq);
			return reimbReq;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}		
}
