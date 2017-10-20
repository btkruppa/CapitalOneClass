package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.beans.ErsUsers;
import com.capitalone.service.UserLoginService;

public class UserLoginController {
	
	UserLoginService userLoginService = new UserLoginService();

	public ErsUsers processLoginPostRequest(HttpServletRequest req, HttpServletResponse res) {
		return userLoginService.processLogin(req.getParameter("user"), req.getParameter("password"));
	}

}
