package com.ersassignment.dao;

import java.util.List;

import com.ersassignment.model.Ers_reimbursement;

public interface ManagerReimbursementDAO {

	// ***Viewing all requests as mgr
	List<Ers_reimbursement> findAllRequests();

	// *** view requests by status id
	List<Ers_reimbursement> findByStatus();

	// ***Approve
	List<Ers_reimbursement> approveRequest(int reimb_id);

	// ***Deny
	List<Ers_reimbursement> denyRequest(int reimb_id);

}
