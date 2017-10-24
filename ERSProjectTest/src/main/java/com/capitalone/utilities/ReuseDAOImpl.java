package com.capitalone.utilities;

import com.capitalone.reimbursementsystem.dao.EmpAddNewReqDAOImpl;
import com.capitalone.reimbursementsystem.dao.EmpReimbHistoryDAOImpl;
import com.capitalone.reimbursementsystem.dao.LoginDAOImpl;
import com.capitalone.reimbursementsystem.dao.ManagerActionOnReqDAOImpl;
import com.capitalone.reimbursementsystem.dao.ManagerViewAllReqDAOImpl;


public class ReuseDAOImpl {

	private static ManagerViewAllReqDAOImpl viewHistory;
	private static ManagerActionOnReqDAOImpl act;
	private static LoginDAOImpl logindaoimp;
	private static EmpReimbHistoryDAOImpl empReimbInfo;
	private static EmpAddNewReqDAOImpl newReqImpl;

	
	public static synchronized ManagerViewAllReqDAOImpl getViewAllDAO() {
		if (viewHistory == null) {
			viewHistory = new ManagerViewAllReqDAOImpl();
		}
		return viewHistory;
	}
	
	public static synchronized ManagerActionOnReqDAOImpl getActOnReqDAO() {
		if (act == null) {
			act = new ManagerActionOnReqDAOImpl();
		}
		return act;
	}
	
	public static synchronized LoginDAOImpl getLoginDAO() {
		if (logindaoimp == null) {
			logindaoimp = new LoginDAOImpl();
		}
		return logindaoimp;
	}
	
	public static synchronized EmpReimbHistoryDAOImpl getHistoryDAO() {
		if (empReimbInfo == null) {
			empReimbInfo = new EmpReimbHistoryDAOImpl(); 
		}
		return empReimbInfo;
	}
	
	public static synchronized EmpAddNewReqDAOImpl getAddNewDAO() {
		if (newReqImpl == null) {
			newReqImpl = new EmpAddNewReqDAOImpl();
		}
		return newReqImpl;
	}
	
}
