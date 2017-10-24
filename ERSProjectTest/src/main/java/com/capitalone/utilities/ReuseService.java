package com.capitalone.utilities;


import com.capitalone.service.LoginService;
import com.capitalone.service.ManagerActionService;
import com.capitalone.service.ViewEmpReqService;
import com.capitalone.service.empAddNewReqService;
import com.capitalone.service.empReimbHistoryService;

public class ReuseService {

	private static ViewEmpReqService viewHistory;
	private static ManagerActionService act;
	private static LoginService ls;
	private static empAddNewReqService newReq;
	private static empReimbHistoryService empHistory;

	public static synchronized ViewEmpReqService getViewEmpServ() {
		if (viewHistory == null) {
			viewHistory = new ViewEmpReqService();
		}
		return viewHistory;
	}
	
	public static synchronized ManagerActionService getManageActServ() {
		if (act == null) {
			act = new ManagerActionService();
		}
		return act;
	}
	
	public static synchronized LoginService getLoginServ() {
		if (ls == null) {
			ls = new LoginService();
		}
		return ls;
	}
	
	public static synchronized empAddNewReqService getAddNewServ() {
		if (newReq == null) {
			newReq = new empAddNewReqService();
		}
		return newReq;
	}
	
	public static synchronized empReimbHistoryService getReimHisServ() {
		if (empHistory == null) {
			empHistory = new empReimbHistoryService();
		}
		return empHistory;
	}
	
}
