package com.capitalone.daointerfaces;

import java.util.Date;

public interface ErsReimbursementUpdateDaoInterface {
	
	public void updateReimbursement(String username, String reimbStatus, Date reimbResolved);

}
