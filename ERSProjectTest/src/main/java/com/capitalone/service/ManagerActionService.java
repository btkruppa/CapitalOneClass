package com.capitalone.service;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.reimbursementsystem.dao.ManagerActionOnReqDAOImpl;
import com.capitalone.utilities.ReuseDAOImpl;

public class ManagerActionService {
	List<ReimbReq> empReimbReq = new ArrayList<ReimbReq>();
	ManagerActionOnReqDAOImpl act = ReuseDAOImpl.getActOnReqDAO();

	public List<ReimbReq> viewMyEmpPendReq(HttpServletRequest req, HttpServletResponse res) {
		empReimbReq = act.viewMyEmpPendReq(req,res);
		return empReimbReq;
	}
	public int takeAction(HttpServletRequest req) throws SQLException {		
		return act.takeAction(req);				
	}
}
