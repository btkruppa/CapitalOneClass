package com.ersassignment.dao;

import java.util.List;

import com.ersassignment.model.Ers_reimbursement;

public interface ReimbursementDAO {

	// users view past tickets
	List<Ers_reimbursement> findByReimb_author(int reimb_author);

	// users add reimbursement tickets
	void addRequest(Ers_reimbursement acc);

}
