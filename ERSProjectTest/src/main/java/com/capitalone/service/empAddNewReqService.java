package com.capitalone.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.com.reimbursement.bean.ReimbType;
import com.capitalone.reimbursementsystem.dao.EmpAddNewReqDAOImpl;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseDAOImpl;



public class empAddNewReqService {
	public void addNewReimb(HttpServletRequest req, HttpServletResponse resp) {
		ReimbReq newReimb = DAOUtilities.getReimbReq();
		ReimbType reimbType = DAOUtilities.getReimbType();
		EmpAddNewReqDAOImpl newReqImpl = ReuseDAOImpl.getAddNewDAO();
		newReimb.setReimb_amount(Integer.parseInt(req.getParameter("amount")));		
		newReimb.setReimb_desc(req.getParameter("desc"));
		reimbType.setReimbType(req.getParameter("reimbType"));
		req.getSession().setAttribute("newReimb", newReimb);
		req.getSession().setAttribute("reimbType", reimbType);
		newReqImpl.addNewReimb(req,resp);
	}
}
