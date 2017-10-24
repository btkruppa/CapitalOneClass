package com.capitalone.daointerfaces;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.capitalone.beans.ErsReimbursement;

public interface ErsReimbursementManagerDaoInterface {
	
	public List<ErsReimbursement> getReimbursementByManager(HttpServletRequest req, String type);
	
}
