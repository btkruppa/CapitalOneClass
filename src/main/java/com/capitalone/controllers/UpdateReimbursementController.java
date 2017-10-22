package com.capitalone.controllers;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.service.UpdateReimbursementService;

public class UpdateReimbursementController {
	
	UpdateReimbursementService  updateReimbursementService = new UpdateReimbursementService();
	
	public void updateReimbursementSerController(HttpServletRequest req, HttpServletResponse res) {
		System.out.println("UpdateReimbursementController");
		updateReimbursementService.updateReimbursementService(req);
		
	}
	
}
