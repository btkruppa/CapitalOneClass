package com.capitalone.service;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.AddReimbursementDaoImpl;

public class AddReimbursementService {
	
	AddReimbursementDaoImpl addReimbursementDaoImpl = new AddReimbursementDaoImpl();
	
	public void addReimbursementService(ErsReimbursement ersReimbursement) {
		addReimbursementDaoImpl.addReimbursement(ersReimbursement);
	}

}
