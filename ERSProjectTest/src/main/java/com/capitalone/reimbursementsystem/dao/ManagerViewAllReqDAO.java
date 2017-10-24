package com.capitalone.reimbursementsystem.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;

public interface ManagerViewAllReqDAO {
	public ReimbReq viewMyEmpReq(HttpServletRequest req, HttpServletResponse res);
}
