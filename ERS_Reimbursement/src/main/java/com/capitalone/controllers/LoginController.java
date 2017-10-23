package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.capitalone.service.LoginService;

public class LoginController {

	private Logger log = Logger.getRootLogger();
	LoginService loginService = new LoginService();

	public void processGetRequest(HttpServletRequest req, HttpServletResponse resp) {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		switch (requestUrl) {
		case ("/user/"):
			loginService.login(req);
			break;

		default:
			break;
		}
	}

	public void processPostRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(requestUrl);
		switch (requestUrl) {
		case "/static/login":
			login(req, resp);
			break;

		default:
			break;
		}

	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		if (loginService.login(req)) {	
			HttpSession session = req.getSession();
			int userRoleID = (int) session.getAttribute("UserRoleID");
			String userRole = loginService.userRole(userRoleID).getUser_role();
			if (userRole.equals("FINANCE MANAGER")) {
				resp.sendRedirect("/ERS_Reimbursement/static/manager.html");
			} else
				resp.sendRedirect("/ERS_Reimbursement/static/employee.html");

		} else {
			resp.sendRedirect("/ERS_Reimbursement/static/login.html");
		}
	}

}
