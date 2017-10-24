package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.ReimbursementUserService;

public class ReimbursementUserController {
	
	ReimbursementUserService reimbursementUserService = new ReimbursementUserService();
	
	public ErsReimbursement getReimbursementUserController(HttpServletRequest req, HttpServletResponse res) {
		return reimbursementUserService.getReimbursementUserService(req.getParameter("username"));
	}
}
