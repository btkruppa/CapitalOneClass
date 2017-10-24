package com.capitalone.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementManagerDaoImpl;
import com.capitalone.daoimpl.ErsReimbursementUpdateDaoImpl;
public class ReimbursementManagerService {
    Logger log = Logger.getRootLogger();
	ErsReimbursementManagerDaoImpl ersReimbursementManagerDaoImpl = new ErsReimbursementManagerDaoImpl();
	ErsReimbursementUpdateDaoImpl ersReimbursementUpdateDaoImpl = new ErsReimbursementUpdateDaoImpl();
	
	public List<ErsReimbursement> getReimbursementManagerService(HttpServletRequest req, String type) {
		
		
		log.debug("Service call for  Manager");
		
		return ersReimbursementManagerDaoImpl.getReimbursementByManager(req, type);
	}	
	
	public int updateReimbursementStatus(String userRole, int reimbStatus, int reimbId){
		return ersReimbursementUpdateDaoImpl.updateReimbursement(userRole, reimbStatus, reimbId);
	}
}
