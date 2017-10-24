package com.capitalone.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.service.ReimbursementManagerService;

public class ReimbursementManagerController {
	
	ReimbursementManagerService reimbursementManagerService = new ReimbursementManagerService(); //creating an object
	private Logger log = Logger.getRootLogger();
	
	public List<ErsReimbursement> getReimbursementManagerController(HttpServletRequest req, String type) {
		log.debug("Manager Controller");
		return reimbursementManagerService.getReimbursementManagerService(req, type); // calling service with method

	}
	
	public int updateReimbursementStatus(String userRole, int reimbStatus, int reimbId){
		log.debug("Manager Controller :: updateReimbursementStatus");
		return reimbursementManagerService.updateReimbursementStatus(userRole, reimbStatus, reimbId);
		
	}
	
}
