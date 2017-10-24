package com.capitalone.reimbursementsystem.dao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public interface EmpAddNewReqDAO {
	//Method declaration to add & submit a new reimbursement form
	public void addNewReimb(HttpServletRequest req, HttpServletResponse resp);
}
