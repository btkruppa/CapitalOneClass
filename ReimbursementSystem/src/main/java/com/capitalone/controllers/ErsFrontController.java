package com.capitalone.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.beans.ErsUsers;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ErsFrontController extends DefaultServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Logger log = Logger.getLogger("ErsFrontController");

	private UserLoginController userController = new UserLoginController();
	private ReimbursementUserController reimbursementUserController = new ReimbursementUserController();
	private ReimbursementManagerController reimbursementManagerController = new ReimbursementManagerController();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
			throws IOException, ServletException {
		// super.doGet(request, response);
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		HttpSession session = req.getSession(true);
		log.info("The requestUrl is " + requestUrl);
		if (requestUrl.startsWith("/static/retrievehistory")) {
			reimbursementManagerController.getReimbursementManagerController(req,"All");
			System.out.println("test" + req.getRequestURI());
			if (session.getAttribute("reimbursement") != null) {
				log.debug("writing list to the response");
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(session.getAttribute("reimbursement"));
				res.getWriter().print(json);
				res.getWriter().close();
				session.removeAttribute("reimbursement");
				//res.sendRedirect("ReimbursementSystem/static/view-allclaims.html");
			}
			//DONT NEED to go anywhere...response was written to so javascript should have it.
		} else if (requestUrl.startsWith("/static/pendingtickets")) {
			reimbursementManagerController.getReimbursementManagerController(req,"pending");
			System.out.println("test" + req.getRequestURI());
			if (session.getAttribute("reimbursement") != null) {
				log.debug("writing list to the response");
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(session.getAttribute("reimbursement"));
				System.out.println("pending requests :" + json);
				res.getWriter().print(json);
				res.getWriter().close();
				session.removeAttribute("reimbursement");
		}
		} else if (requestUrl.startsWith("/static/viewdeclined")) {
			reimbursementManagerController.getReimbursementManagerController(req,"declined");
			System.out.println("test" + req.getRequestURI());
			if (session.getAttribute("reimbursement") != null) {
				log.debug("writing list to the response");
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(session.getAttribute("reimbursement"));
				System.out.println("pending requests :" + json);
				res.getWriter().print(json);
				res.getWriter().close();
				session.removeAttribute("reimbursement");
		}
		}
		else if (requestUrl.startsWith("/static/approvedtickets")) {
			reimbursementManagerController.getReimbursementManagerController(req,"approved");
			System.out.println("test" + req.getRequestURI());
			if (session.getAttribute("reimbursement") != null) {
				log.debug("writing list to the response");
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(session.getAttribute("reimbursement"));
				System.out.println("pending requests :" + json);
				res.getWriter().print(json);
				res.getWriter().close();
				session.removeAttribute("reimbursement");
		}
		}
		else{
			super.doGet(req, res);
		}
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		HttpSession session = req.getSession(false);
		log.info("The requestUrl is " + requestUrl);
		ErsUsers ersUser = null;

		if (requestUrl.startsWith("/login")) {
			ersUser = userController.processLoginPostRequest(req, res);
			log.debug("The ersUser we got back is" + ersUser);
			if (ersUser != null) {
				session.setAttribute("user", ersUser);
				String role = ersUser.getUserRole();
				System.out.println(role);
				if ("Manager".equals(role)) {
					res.sendRedirect("/ReimbursementSystem/static/manager.html");
					return;
				} else if ("Employee".equals(role)) {
					res.sendRedirect("/ReimbursementSystem/static/employee.html");
					return;

				} else {
				res.sendRedirect("/ReimbursementSystem/static/login-error.html");
				return;
				}
			}
			//want to redirect or forward here
		}
//		if (requestUrl.startsWith("/manager")) {
//			List<ErsReimbursement> ersrmb = reimbursementManagerController.getReimbursementManagerController(req);
//			//want to write the reimbursements to Session, also to the response;
//			//probably DONT want to redirect/forward--response should be available to javascript
//		}


		if (requestUrl.startsWith("/static/approve")) {
			String reimbId = requestUrl.substring((requestUrl.length()-1), requestUrl.length());
			int reimbId_int = Integer.parseInt(reimbId);
			ReimbursementManagerController managerController = new ReimbursementManagerController();
			session = req.getSession();
			ersUser = (ErsUsers) session.getAttribute("user");
			managerController.updateReimbursementStatus(ersUser.getUserRole(), 1, reimbId_int);
			System.out.println("Approve page, reimbId="+reimbId);
			res.sendRedirect("/ReimbursementSystem/static/approve.html");
			return;
			
//			res.sendRedirect("/static/approvedtickets");
			
		}else if(requestUrl.startsWith("/static/deny")){
			String reimbId = requestUrl.substring((requestUrl.length()-1), requestUrl.length());
			int reimbId_int = Integer.parseInt(reimbId);
			ReimbursementManagerController managerController = new ReimbursementManagerController();
			session = req.getSession();
			ersUser = (ErsUsers) session.getAttribute("user");
			managerController.updateReimbursementStatus(ersUser.getUserRole(), 3, reimbId_int);
			System.out.println("Approve page, reimbId="+reimbId);
			
			
		}
	}
}
