package com.capitalone.reimbursementsystem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.com.reimbursement.bean.ReimbType;
import com.capitalone.com.reimbursement.bean.User;
import com.capitalone.utilities.DAOUtilities;

public class EmpAddNewReqDAOImpl implements EmpAddNewReqDAO{
	
	public static int rowCount = 0;
	int resolver=0;
	int status=0;
	int type=0;

	//Creating a DB connection to execute queries to submit a new reimbursement requests
	DAOUtilities util = new DAOUtilities();
	Connection connection = util.getConnection();

	public void addNewReimb(HttpServletRequest req, HttpServletResponse resp) {
		
		try {
			ReimbReq reimbReq = DAOUtilities.getReimbReq();
			ReimbType reimbType = DAOUtilities.getReimbType();
			reimbReq = (ReimbReq) req.getSession().getAttribute("newReimb");
			reimbType = (ReimbType) req.getSession().getAttribute("reimbType");
			User ul = DAOUtilities.getUser();
			ul = (User) req.getSession().getAttribute("User");
			
			Statement stmt = connection.createStatement();
			ResultSet rsResolver = stmt.executeQuery("select ers_users_id from ers_users where user_role_id = (select ers_user_role_id from ers_user_roles where user_role = \'Manager\') order by random() limit 1");
			rsResolver.next();
			resolver=rsResolver.getInt("ers_users_id");
			ResultSet rsStatus = stmt.executeQuery("select reimb_status_id from ers_reimbursement_status where reimb_status=\'Pending\'");
			rsStatus.next();
			status=rsStatus.getInt("reimb_status_id");
			ResultSet rsType = stmt.executeQuery("select reimb_type_id from ers_reimbursement_type where lower(reimb_type)=lower(\'"+reimbType.getReimbType()+"\')");
			if (rsType.next()) {
				type=rsType.getInt("reimb_type_id");
			}
			else {
				ResultSet rsType1 = stmt.executeQuery("select reimb_type_id from ers_reimbursement_type where reimb_type=\'Unknown\'");
				rsType1.next();
				type=rsType1.getInt("reimb_type_id");
			}
			PreparedStatement ps = connection.prepareStatement("insert into ers_reimbursement (reimb_amount,reimb_submitted,reimb_resolved,reimb_description,reimb_receipt,reimb_author,reimb_resolver,reimb_status_id,reimb_type_id) values ("+reimbReq.getReimb_amount()+",current_timestamp,null,\'"+reimbReq.getReimb_desc()+"\',null,"+ul.getUserId()+","+resolver+","+status+","+type+")");
			rowCount = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
