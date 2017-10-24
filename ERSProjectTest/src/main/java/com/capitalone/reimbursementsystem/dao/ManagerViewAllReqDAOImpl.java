package com.capitalone.reimbursementsystem.dao;

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

public class ManagerViewAllReqDAOImpl implements ManagerViewAllReqDAO{
	
	private String queryManager;
	
	//Creating a DB connection to execute queries to view all employees' requests
	DAOUtilities util = new DAOUtilities();
	Connection connection = util.getConnection();
	
	public ReimbReq viewMyEmpReq(HttpServletRequest req, HttpServletResponse res) {
		User ul = DAOUtilities.getUser();
		ul = (User) req.getSession().getAttribute("User");
		List<ReimbReq> empReimbReq = new ArrayList<ReimbReq>();
		ReimbReq empReimbRequest = DAOUtilities.getReimbReq();
		queryManager = "SELECT * FROM ers_reimbursement a join ers_reimbursement_status b on a.reimb_status_id = b.reimb_status_id WHERE reimb_resolver = "+ ul.getUserId();
		try {
			Statement stmt = connection.createStatement();			
			ResultSet rsMyempReq = stmt.executeQuery(queryManager);
			while(rsMyempReq.next()) {
				empReimbRequest.setReimb_id(rsMyempReq.getInt("reimb_id"));
				empReimbReq.add(new ReimbReq(rsMyempReq.getInt("reimb_id"), rsMyempReq.getInt("reimb_amount"), rsMyempReq.getTimestamp("reimb_submitted"), rsMyempReq.getTimestamp("reimb_resolved"), 
						rsMyempReq.getString("reimb_description"),null, rsMyempReq.getInt("reimb_status_id"),0,rsMyempReq.getString("reimb_status")));
			
			}
			req.getSession().setAttribute("empreimbursement", empReimbReq);
			return empReimbRequest;
		} catch (SQLException e) {
			e.printStackTrace();
		}	
		return null;
	}

		
}
