package com.capitalone.service;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsUsers;
import com.capitalone.daoimpl.ErsUserDaoImpl;

public class UserLoginService {
	
	private Logger log = Logger.getRootLogger();
	
	ErsUserDaoImpl ersUserDaoImpl = new ErsUserDaoImpl();
	
	public ErsUsers processLogin(String username, String password) {
		log.debug("User Login Service called");
		
		return ersUserDaoImpl.findByUserName(username, password);
		
	}
	

}
