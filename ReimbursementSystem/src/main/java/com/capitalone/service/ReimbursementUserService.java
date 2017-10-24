package com.capitalone.service;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementUserDaoImpl;

public class ReimbursementUserService {
	
	ErsReimbursementUserDaoImpl ersReimbursementDaoImpl = new ErsReimbursementUserDaoImpl();
	
	public ErsReimbursement getReimbursementUserService(String username) {
		System.out.println("reimbursement service");
		return ersReimbursementDaoImpl.getReimbursementByUser(username);
		
	}
	
	public static void main(String[] args) {
		ReimbursementUserService us = new ReimbursementUserService();
		us.getReimbursementUserService("mike");
	}

}
