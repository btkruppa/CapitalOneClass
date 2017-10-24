package com.capitalone.reimbursementsystem.dao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;


public interface EmpReimbHistoryDAO {
	//Method declaration to list all reimbursement requests by an emaployee so far
	public ReimbReq listAllReimbursement(HttpServletRequest req, HttpServletResponse resp) throws IOException;
}
