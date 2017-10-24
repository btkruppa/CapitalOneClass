package com.ersassignment.dao;

import java.util.List;

import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.model.Users_ERS;

public interface UsersDAO {

	Users_ERS findByUsernameAndPassword(String username, String password);

	Users_ERS findUserOrMgr(String username, String password);
}
