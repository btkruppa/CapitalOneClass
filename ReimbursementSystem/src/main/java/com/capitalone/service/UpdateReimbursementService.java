package com.capitalone.service;

import org.apache.log4j.Logger;

import com.capitalone.daoimpl.ErsReimbursementUpdateDaoImpl;

public class UpdateReimbursementService {
	
	ErsReimbursementUpdateDaoImpl ersReimbursementUpdateDaoImpl = new ErsReimbursementUpdateDaoImpl();
	Logger log = Logger.getRootLogger();
	public void updateReimbursementService(String username, String reimbStatus) {
		log.debug("Update Service");
		System.out.println("UpdateReimbursementService");
		ersReimbursementUpdateDaoImpl.updateReimbursement(username, reimbStatus);
	}

}
