package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.beans.ErsUsers;

public class ErsFrontController extends DefaultServlet {

	 private Logger log = Logger.getRootLogger();

	private UserLoginController userController = new UserLoginController();
	private ReimbursementUserController reimbursementUserController = new ReimbursementUserController();
	private ReimbursementManagerController reimbursementManagerController = new ReimbursementManagerController();
	

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		super.doGet(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		HttpSession session = req.getSession(true);

		if (requestUrl.startsWith("/login")) {
			ErsUsers ersUser = userController.processLoginPostRequest(req, res);
			
			if(ersUser != null) {
				session.setAttribute("user", ersUser);
				String role = ersUser.getUserRole();
				System.out.println(role);
				if(role.equals("manager")) {					
					res.sendRedirect("/ExpenseReimbursementSystem/static/manager.html");
				}else if (role.equals("employee")) {
					res.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
					
				}
			}else {
				res.sendRedirect("/ExpenseReimbursementSystem/static/login-error.html");
			}
			
		}else if(requestUrl.startsWith("/approve")) {
			System.out.println("Approve page");
			
		}

	}

}
