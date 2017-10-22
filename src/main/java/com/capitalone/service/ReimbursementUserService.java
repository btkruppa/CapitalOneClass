package com.capitalone.service;

import java.util.List;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.daoimpl.ErsReimbursementUserDaoImpl;

public class ReimbursementUserService {
	
	ErsReimbursementUserDaoImpl ersReimbursementDaoImpl = new ErsReimbursementUserDaoImpl();
	
	public List<ErsReimbursement> getReimbursementUserService(String username) {
		System.out.println("reimbursement service" + username);
		return ersReimbursementDaoImpl.getReimbursementByUser(username);
		
	}
	
	public static void main(String[] args) {
		ReimbursementUserService us = new ReimbursementUserService();
		us.getReimbursementUserService("mike");
	}

}
