package com.capitalone.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.reimbursementsystem.dao.EmpReimbHistoryDAO;
import com.capitalone.utilities.ReuseDAOImpl;

public class empReimbHistoryService {
	ReimbReq reimbReq = new ReimbReq();
	public ReimbReq listAllReimbursement(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		EmpReimbHistoryDAO empReimbInfo = ReuseDAOImpl.getHistoryDAO();
		reimbReq = empReimbInfo.listAllReimbursement(req,resp);
		return reimbReq;
	}
}
