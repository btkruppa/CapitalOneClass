package com.capitalone.service;

import java.sql.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.daoimpl.ErsReimbursementUpdateDaoImpl;

public class UpdateReimbursementService {
	
	private Logger log = Logger.getRootLogger();
	private ErsReimbursementUpdateDaoImpl ersReimbursementUpdateDaoImpl = new ErsReimbursementUpdateDaoImpl();
	
	public void updateReimbursementService(HttpServletRequest req) {
		System.out.println("UpdateReimbursementService");
		 Date date = new java.sql.Date(System.currentTimeMillis());
		 int reimbId = Integer.valueOf(req.getParameter("reimbId"));
		 
		//String s = req.getParameter("reimbId");
		 int reimbResolver = Integer.valueOf(req.getParameter("reimbResolver"));
		int  reimbStatusId = Integer.valueOf(req.getParameter("reimbStatusId"));
		log.debug("Update Reimbursement Service Called");
		
		ersReimbursementUpdateDaoImpl.updateReimbursement(reimbId, reimbResolver, reimbStatusId, date);
	}

}
