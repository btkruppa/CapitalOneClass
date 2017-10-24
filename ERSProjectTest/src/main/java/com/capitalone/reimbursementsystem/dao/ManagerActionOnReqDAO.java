package com.capitalone.reimbursementsystem.dao;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;


public interface ManagerActionOnReqDAO {
	//Manager to view all the pending requests and take appropriate action (approve or deny)
	public List<ReimbReq> viewMyEmpPendReq(HttpServletRequest req, HttpServletResponse res);
}
