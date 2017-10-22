package com.capitalone.controllers;

import java.util.List;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.ReimbursementManagerService;

public class ReimbursementManagerController {
	
	ReimbursementManagerService reimbursementManagerService = new ReimbursementManagerService();
	
	public List<ErsReimbursement> getReimbursementManagerController() {
		return reimbursementManagerService.getReimbursementManagerService();
	}
	
}
