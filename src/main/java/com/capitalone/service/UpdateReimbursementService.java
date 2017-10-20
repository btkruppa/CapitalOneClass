package com.capitalone.service;

import com.capitalone.daoimpl.ErsReimbursementUpdateDaoImpl;

public class UpdateReimbursementService {
	
	ErsReimbursementUpdateDaoImpl ersReimbursementUpdateDaoImpl = new ErsReimbursementUpdateDaoImpl();
	
	public void updateReimbursementService(String username, String reimbStatus) {
		System.out.println("UpdateReimbursementService");
		ersReimbursementUpdateDaoImpl.updateReimbursement(username, reimbStatus);
	}

}
