package dao;

import java.sql.Timestamp;
import java.util.List;

import com.ers.reimbursement.model.Reimbursement;


public interface ReimbursementDAO {

	List<Reimbursement> getAllReimbursements();

	void addReimbursement(Reimbursement saveNewReimb) throws Exception;
	
	//select * from reimbursement."ers_reimbursement" where "reimb_author" = 2;
	List<Reimbursement> getAllTicketsForAUser(int ersUsersId);
	
	//select * from reimbursement."ers_reimbursement" where "reimb_status_id" = 1
	List<Reimbursement> filterReimbByStatus(int reimbStatusId);
	
	//select * from reimbursement."ers_reimbursement" where "reimb_id" = 1
	Reimbursement getSingleReimbData(int reimbId);
	
	//update reimbursement.ers_reimbursement
	//set "reimb_status_id" = 2, "reimb_resolved" = CURRENT_TIMESTAMP, "reimb_resolver" = 1 where "reimb_id" = 8;
	//void updateReimbursement(int reimbStatusId, Timestamp resolvedTime, int resolvedBy, int reimbId);
	void updateReimbursement(int reimbStatusId, int reimbId);
	
	
	
	
	
	
	
	

}
