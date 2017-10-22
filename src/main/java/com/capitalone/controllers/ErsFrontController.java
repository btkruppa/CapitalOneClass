package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.capitalone.beans.ErsUsers;

public class ErsFrontController extends DefaultServlet {

	private Logger log = Logger.getRootLogger();

	private UserLoginController userController = new UserLoginController();	
	private AddReimbursementController addReimbursementController = new AddReimbursementController();
	private ReimbursementUserController reimbursementUserController = new ReimbursementUserController();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("view employee" + requestUrl);
		if (requestUrl.startsWith("/viewEmployeeClaims")) {
//			System.out.println(reimbursementUserController.getReimbursementUserController(request, response));
			response.getWriter().write(reimbursementUserController.getReimbursementUserController(request, response));
			
		}else		
		super.doGet(request, response);
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println("front cntorller" + requestUrl);
		HttpSession session = req.getSession(true);

		if (requestUrl.startsWith("/login")) {
			ErsUsers ersUser = userController.processLoginPostRequest(req, res);
			
			if(ersUser != null) {
				session.setAttribute("user", ersUser);
				String role = ersUser.getUserRole();
				log.debug(role);
				System.out.println(role);
				if(role.equals("manager")) {					
					res.sendRedirect("/ExpenseReimbursementSystem/static/manager.html");
				}else if (role.equals("employee")) {
					res.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
					
				}
			}else {
				res.sendRedirect("/ExpenseReimbursementSystem/static/login-error.html");
				
			}
			
		}else if(requestUrl.startsWith("/static/registration")) {
					addReimbursementController.addReimbursementController(req, res);
					System.out.println("submit page");
					res.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
			
		}

	}

}
