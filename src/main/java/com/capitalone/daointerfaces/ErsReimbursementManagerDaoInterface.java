package com.capitalone.daointerfaces;

import java.util.List;

import com.capitalone.beans.ErsReimbursement;

public interface ErsReimbursementManagerDaoInterface {
	
	public List<ErsReimbursement> getReimbursementByManager();
	
}
