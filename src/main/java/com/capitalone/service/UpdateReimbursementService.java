package com.capitalone.service;

import java.util.Date;

import com.capitalone.daoimpl.ErsReimbursementUpdateDaoImpl;

public class UpdateReimbursementService {
	
	ErsReimbursementUpdateDaoImpl ersReimbursementUpdateDaoImpl = new ErsReimbursementUpdateDaoImpl();
	
	public void updateReimbursementService(String username, String reimbStatus, Date reimbResolved) {
		System.out.println("UpdateReimbursementService");
		ersReimbursementUpdateDaoImpl.updateReimbursement(username, reimbStatus, reimbResolved);
	}

}
