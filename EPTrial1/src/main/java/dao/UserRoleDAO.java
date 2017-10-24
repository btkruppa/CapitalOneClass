package dao;

import com.ers.reimbursement.model.Users;

public interface UserRoleDAO {
	
	//select * from reimbursement."ers_user_roles"
	Users  empOrManager(String username);

}
