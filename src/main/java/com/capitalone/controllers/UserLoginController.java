package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.beans.ErsUsers;
import com.capitalone.service.UserLoginService;

public class UserLoginController {
	
	private Logger log = Logger.getRootLogger();
	
	UserLoginService userLoginService = new UserLoginService();

	public ErsUsers processLoginPostRequest(HttpServletRequest req, HttpServletResponse res) {
		log.debug("call made to User Login Controller");
		return userLoginService.processLogin(req.getParameter("user"), req.getParameter("password"));
	}

}
