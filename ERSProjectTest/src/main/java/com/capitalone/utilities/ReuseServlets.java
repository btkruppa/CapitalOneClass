package com.capitalone.utilities;

import com.capitalone.servlets.EmpActionController;
import com.capitalone.servlets.EmpNewReqController;
import com.capitalone.servlets.LoginController;
import com.capitalone.servlets.ManagerActionController;
import com.capitalone.servlets.ViewEmpHistoryController;

public class ReuseServlets {
	
	private static LoginController lc;
	private static EmpActionController empHistory;
	private static EmpNewReqController empNew;
	private static ViewEmpHistoryController viewHistory;
	private static ManagerActionController act;
	
	public static synchronized LoginController getLoginCntr() {
		if (lc == null) {
			lc = new LoginController();
		}
		return lc;
	}
	
	public static synchronized EmpActionController getEmpActCntr() {
		if (empHistory == null) {
			empHistory = new EmpActionController();
		}
		return empHistory;
	}
	
	public static synchronized EmpNewReqController getEmpNewReqCntr() {
		if (empNew == null) {
			empNew = new EmpNewReqController();
		}
		return empNew;
	}
	
	public static synchronized ViewEmpHistoryController getViewEmpHisCntr() {
		if (viewHistory == null) {
			viewHistory = new ViewEmpHistoryController();
		}
		return viewHistory;
	}
	
	public static synchronized ManagerActionController getManageActCntr() {
		if (act == null) {
			act = new ManagerActionController();
		}
		return act;
	}
	

}
