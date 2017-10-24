package com.capitalone.reimbursementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
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

public class ManagerActionOnReqDAOImpl implements ManagerActionOnReqDAO{
	
	private String queryPending1;
	private String queryPending2;
	private String queryPending;
	public int reimb_id;
	public String decision;
	
	//Creating a DB connection to execute queries to view all pending requests and take an action accordingly
	DAOUtilities util = new DAOUtilities();
	Connection connection = util.getConnection();

	public List<ReimbReq> viewMyEmpPendReq(HttpServletRequest req, HttpServletResponse res) {
		User ul = DAOUtilities.getUser();
		ul = (User) req.getSession().getAttribute("User");
		List<ReimbReq> empPending = new ArrayList<ReimbReq>();
		queryPending1 = "select * from ers_reimbursement a join ers_reimbursement_status b on a.reimb_status_id = b.reimb_status_id";
		queryPending2 = " where b.reimb_status=\'Pending\' AND reimb_resolver ="+ ul.getUserId();
		queryPending = queryPending1 + queryPending2;
		
		try {
			Statement stmt = connection.createStatement();			
			ResultSet rsMyempReq = stmt.executeQuery(queryPending);
			while(rsMyempReq.next()) {
				empPending.add(new ReimbReq(rsMyempReq.getInt("reimb_id"), rsMyempReq.getInt("reimb_amount"), rsMyempReq.getTimestamp("reimb_submitted"), rsMyempReq.getTimestamp("reimb_resolved"), 
						rsMyempReq.getString("reimb_description"),null, rsMyempReq.getInt("reimb_status_id"),0,rsMyempReq.getString("reimb_status")));

			}
			req.getSession(false).setAttribute("pendingreq", empPending);
			return empPending;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return null;
	}	
	
	public int takeAction(HttpServletRequest req) throws SQLException {
		decision = req.getParameter("decision");
		reimb_id = Integer.parseInt(req.getParameter("reimb_id"));
		PreparedStatement ps = connection.prepareStatement("UPDATE ers_reimbursement a set reimb_status_id = b.reimb_status_id, reimb_resolved = current_timestamp from (select * from ers_reimbursement_status where reimb_status = \'" + decision + "\') b where a.reimb_id =  "+ reimb_id);
		return ps.executeUpdate();				
	}
}
