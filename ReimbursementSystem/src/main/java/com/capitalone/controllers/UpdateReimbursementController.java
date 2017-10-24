package com.capitalone.controllers;

import com.capitalone.service.UpdateReimbursementService;

public class UpdateReimbursementController {
	
	UpdateReimbursementService  updateReimbursementService = new UpdateReimbursementService();
	
	public void updateReimbursementSerController(String username, String reimbStatus) {
		System.out.println("UpdateReimbursementController");
		updateReimbursementService.updateReimbursementService(username, reimbStatus);
		
	}
	
}
