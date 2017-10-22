package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.AddReimbursementService;

public class AddReimbursementController {
	
	AddReimbursementService addReimbursementService = new AddReimbursementService();
	
	public void addReimbursementController(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("AddReimbursementController");
		addReimbursementService.addReimbursementService(req);
		
	}

}
