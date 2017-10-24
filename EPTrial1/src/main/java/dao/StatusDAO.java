package dao;

import com.ers.reimbursement.model.ReimbursementStatus;

public interface StatusDAO {
	
	ReimbursementStatus getReimbStatus(String inputStatus);

}
