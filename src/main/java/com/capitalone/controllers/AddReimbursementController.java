package com.capitalone.controllers;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.AddReimbursementService;

public class AddReimbursementController {
	
	AddReimbursementService addReimbursementService = new AddReimbursementService();
	
	public void addReimbursementController(ErsReimbursement ersReimbursement) {
		addReimbursementService.addReimbursementService(ersReimbursement);
	}
	
	public static void main(String[] args) {
		AddReimbursementController ar = new AddReimbursementController();
		ar.addReimbursementController(null);
	}

}
