package com.capitalone.controllers;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.ReimbursementManagerService;

public class ReimbursementManagerController {
	
	ReimbursementManagerService reimbursementManagerService = new ReimbursementManagerService();
	
	public ErsReimbursement getReimbursementManagerController() {
		return reimbursementManagerService.getReimbursementManagerService();
	}
}
