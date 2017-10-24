package com.capitalone.service;

import java.util.List;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementUserDaoImpl;

public class ReimbursementUserService {
	
	private Logger log = Logger.getRootLogger();
	
	ErsReimbursementUserDaoImpl ersReimbursementDaoImpl = new ErsReimbursementUserDaoImpl();
	
	public List<ErsReimbursement> getReimbursementUserService(String username) {
		log.debug("Employee Reimbursement Service" + username);
		return ersReimbursementDaoImpl.getReimbursementByUser(username);
		
	}

}
