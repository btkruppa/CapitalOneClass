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
	private UpdateReimbursementController updateReimbursementController = new UpdateReimbursementController();

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());
		log.debug("view employee" + requestUrl);
		if (requestUrl.startsWith("/viewEmployeeClaims")) {
			response.getWriter().write(reimbursementUserController.getReimbursementUserController(request, response));
			
		}else if(requestUrl.startsWith("/static/decision")) {
				updateReimbursementController.updateReimbursementSerController(request, response);
			super.doPut(request, response);
		} else	
		super.doGet(request, response);
	}
	
	@Override
	protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());
		log.debug("Approve or decline" + requestUrl);
		if (requestUrl.startsWith("/static/decision")) {
			updateReimbursementController.updateReimbursementSerController(request, response);
		super.doPut(request, response);
	}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("front cntorller" + requestUrl);
		HttpSession session = req.getSession(true);

		if (requestUrl.startsWith("/login")) {
			ErsUsers ersUser = userController.processLoginPostRequest(req, res);
			
			if(ersUser != null) {
				session.setAttribute("user", ersUser);
				String role = ersUser.getUserRole();
				log.debug(role);
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
					log.debug("submit page");
					res.sendRedirect("/ExpenseReimbursementSystem/static/employee.html");
					
		}

	}

}
