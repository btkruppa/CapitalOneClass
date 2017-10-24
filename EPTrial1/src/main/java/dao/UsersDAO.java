package dao;

import com.ers.reimbursement.model.Users;

public interface UsersDAO {

	//select * from reimbursement."ers_users" where "ers_username" = 'sunlight2' and "ers_password" = 'abcd1234';
	Users getUserName(String username, String password);
	
	
	
}
