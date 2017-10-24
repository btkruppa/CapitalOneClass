package com.capitalone.service;

import com.capitalone.beans.ErsUsers;
import com.capitalone.daoimpl.ErsUserDaoImpl;

public class UserLoginService {
	
	ErsUserDaoImpl ersUserDaoImpl = new ErsUserDaoImpl();
	
	public ErsUsers processLogin(String username, String password) {
		
		return ersUserDaoImpl.findByUserName(username, password);
		
	}
	

}
