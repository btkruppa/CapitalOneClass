package com.capitalone.daointerfaces;

import java.sql.Date;


public interface AddReimbursementDaoInterface {
	
	public void addReimbursement(float reimbAmount, Date reimbSubmitted, String reimbDesc, String reimbReceipt,
            int reimbAuthor, int reimbStatus, int reimbType);

}
