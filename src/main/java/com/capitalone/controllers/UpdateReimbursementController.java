package com.capitalone.controllers;

import java.util.Date;

import com.capitalone.service.UpdateReimbursementService;

public class UpdateReimbursementController {
	
	UpdateReimbursementService  updateReimbursementService = new UpdateReimbursementService();
	
	public void updateReimbursementSerController(String username, String reimbStatus, Date reimbResolved) {
		System.out.println("UpdateReimbursementController");
		updateReimbursementService.updateReimbursementService(username, reimbStatus, reimbResolved);
		
	}
	
}
