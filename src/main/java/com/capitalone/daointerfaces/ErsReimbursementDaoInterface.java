package com.capitalone.daointerfaces;

import java.util.List;

import com.capitalone.beans.ErsReimbursement;

public interface ErsReimbursementDaoInterface {

	public List<ErsReimbursement> getReimbursementByUser(String username);
}
