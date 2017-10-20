package com.capitalone.service;

import java.util.List;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementManagerDaoImpl;
public class ReimbursementManagerService {

	ErsReimbursementManagerDaoImpl ersReimbursementManagerDaoImpl = new ErsReimbursementManagerDaoImpl();
	
	public List<ErsReimbursement> getReimbursementManagerService() {
		return ersReimbursementManagerDaoImpl.getReimbursementByManager();
	}	
}
