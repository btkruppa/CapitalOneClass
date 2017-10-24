package com.capitalone.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.com.reimbursement.bean.UserRole;
import com.capitalone.service.LoginService;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseService;

public class LoginController {
	public void loginControl(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		Logger log = Logger.getLogger("LoginController");
		UserRole ur = DAOUtilities.getUserRole();
		LoginService ls = ReuseService.getLoginServ();
		ls.loginService(req,res);
		if((ur.getUserRole()) != null && (ur.getUserRole()).equals("Employee")) {
			req.getRequestDispatcher("/static/WelcomeERSEmp.html").forward(req, res);
		}
		else if((ur.getUserRole()) != null && (ur.getUserRole()).equals("Manager")) {
			req.getRequestDispatcher("/static/WelcomeERSManager.html").forward(req, res);
		}
		else 
			res.sendRedirect("/ERSProjectTest/static/errorpage.html");
		
		
	}
}
