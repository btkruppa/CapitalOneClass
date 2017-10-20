package com.capitalone.service;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementManagerDaoImpl;
public class ReimbursementManagerService {

	ErsReimbursementManagerDaoImpl ersReimbursementManagerDaoImpl = new ErsReimbursementManagerDaoImpl();
	
	public ErsReimbursement getReimbursementManagerService() {
		return ersReimbursementManagerDaoImpl.getReimbursementByManager();
	}	
}
