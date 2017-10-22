package com.capitalone.daointerfaces;

import java.sql.Date;

public interface ErsReimbursementUpdateDaoInterface {
	
	public void updateReimbursement(int reimbId, int reimbResolver, int reimbStatusId, Date reimbResolved);

}
