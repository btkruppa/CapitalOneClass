package com.capitalone.controllers;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

public class FrontController extends DefaultServlet {

	private Logger log = Logger.getRootLogger();
	private LoginController loginController = new LoginController();
	private EmployeeReimbListController empList = new EmployeeReimbListController();
	private NewReimbRequest newReimbReq = new NewReimbRequest();
	private ManagerViewAllReimburseList mgrViewAll = new ManagerViewAllReimburseList();
	private ReimbStatusUpdate statusUpdate = new ReimbStatusUpdate();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		log.trace("full URL: " + req.getRequestURI());
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		req.getParameterValues("id");

		log.debug("Get request made with url: " + requestUrl);

		// route static content normally
		if (requestUrl.startsWith("/static/")) {
			super.doGet(req, resp);

		} else if (requestUrl.equals("/empViewAll")) {
			log.debug("Get Employee request for ViewAll Reimbursements: " + requestUrl);
			empList.processGetRequest(req, resp);

		} else if (requestUrl.equals("/viewAll")) {
			log.debug("Get Manager request for ViewAll Reimbursements: " + requestUrl);
			mgrViewAll.processGetRequest(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("post request made with url: " + requestUrl);
		req.getParameterValues("id");

		if (requestUrl.startsWith("/static/login")) {

			log.debug("Login POST request with UserId: " + req.getParameter("UserId"));
			loginController.processPostRequest(req, resp);

		} else if (requestUrl.startsWith("/static/reimbursement_registration_form")) {

			log.debug("Employee new Reimbursement POST request");
			newReimbReq.processNewReimbRequest(req, resp);

		}
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("PUT request made with url: " + requestUrl);

		if (requestUrl.startsWith("/approve")) {

			// Read from request
			Map<String, String[]> map = req.getParameterMap();

			for (String paramName : map.keySet()) {
				String[] paramValues = map.get(paramName);

				// Get Values of Param Name
				for (String valueOfParam : paramValues) {
					// Output the Values
					log.debug("Value of reimb ID parameter with value " + paramName + ": " + valueOfParam);
					
					statusUpdate.processPutRequest(req, resp);
				}
			}

		} else if (requestUrl.startsWith("/decline")) {

			// Read from request
			Map<String, String[]> map = req.getParameterMap();

			for (String paramName : map.keySet()) {
				String[] paramValues = map.get(paramName);

				// Get Values of Param Name
				for (String valueOfParam : paramValues) {
					// Output the Values
					log.debug("Value of reimb ID parameter with value " + paramName + ": " + valueOfParam);
					
					statusUpdate.processPutRequest(req, resp);
				}
			}

		}

	}

}
