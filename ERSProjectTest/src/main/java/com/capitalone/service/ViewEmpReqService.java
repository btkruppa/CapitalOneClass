package com.capitalone.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.reimbursementsystem.dao.ManagerViewAllReqDAOImpl;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseDAOImpl;

public class ViewEmpReqService {
	public ReimbReq viewAllReimbursement (HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ReimbReq empReimbRequest = DAOUtilities.getReimbReq();
		ManagerViewAllReqDAOImpl viewHistory = ReuseDAOImpl.getViewAllDAO();
		empReimbRequest = viewHistory.viewMyEmpReq(req, res);
		return empReimbRequest;
	}		
}
