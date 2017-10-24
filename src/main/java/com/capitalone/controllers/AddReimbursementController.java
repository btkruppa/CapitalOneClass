package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.service.AddReimbursementService;

public class AddReimbursementController {
	
	private Logger log = Logger.getRootLogger();
	
	AddReimbursementService addReimbursementService = new AddReimbursementService();
	
	public void addReimbursementController(HttpServletRequest req, HttpServletResponse res) {
		log.debug("Add Reimbursement Service");
		addReimbursementService.addReimbursementService(req);
		
	}

}
