package com.capitalone.service;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.User;
import com.capitalone.reimbursementsystem.dao.LoginDAOImpl;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseDAOImpl;

public class LoginService {
	public void loginService(HttpServletRequest req, HttpServletResponse res) throws IOException {
		LoginDAOImpl logindaoimp = ReuseDAOImpl.getLoginDAO();
		User ul = DAOUtilities.getUser();
		ul.setUserName((String) req.getParameter("userName"));	
		ul.setPassword((String) req.getParameter("password"));
		req.getSession().setAttribute("user", ul);
		logindaoimp.userAuthentication(req,res);		
	}
		
}
