package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.ers.reimbursement.model.Reimbursement;
import com.ers.reimbursement.model.Users;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

import service.ReimbursementService;
import service.UserService;

public class LoginController {
					
		public void processPostRequests(HttpServletRequest request, HttpServletResponse response) throws IOException{
			System.out.println("LoginController: processPostRequests method");
			String requestUrl = request.getRequestURI().substring(request.getContextPath().length());
			switch(requestUrl){
			case "/Login":
				System.out.println("2nd step");
				findRole(request, response);
				break;
			case "/Employee":
				findRole(request, response);
				break;
			case "/Manager":
				findRole(request, response);
				break;
			case "/ManagerEdit":
				System.out.println("ManagerEdit");
				findRole(request, response);
				break;
			case "/addReimbursement":
				findRole(request, response);
				break;
			case "/ManagerReimbursement":
				findRole(request, response);
				break;
				
				default:
					break;
			}
		}
		
		
	public void updateReimursement(HttpServletRequest request, HttpServletResponse response)throws IOException{
			System.out.println("LoginController: updateReimursement method");
			ReimbursementService rs = new ReimbursementService();
			rs.managerIsUpdatingReimbursement(request);
		}
		
	public void addReimursement(HttpServletRequest request, HttpServletResponse response)throws IOException{
		System.out.println("LoginController: addReimursement method");
		ReimbursementService rs = new ReimbursementService();
		rs.empIsAddingReimbursement(request);
		
//		Users logInUser = (Users) request.getSession().getAttribute("currentUser");
//		int logInUserId = logInUser.getErsUsersId();
//		int amountInt = Integer.parseInt(request.getParameter("amount"));
//		String description = request.getParameter("description");
		//String reimb_type = request.getParameter("reimb_type");
//		int reimbTypeInt = Integer.parseInt(request.getParameter("reimb_type"));
//		System.out.println(logInUserId);
//		System.out.println(amountInt);
//		System.out.println(description);
//		System.out.println(reimb_type);
//		System.out.println(reimbTypeInt);
		}
	
	public void findRole(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findRole method");
		//System.out.println(request.getParameter("user_name"));
		UserService us = new UserService();
		Users usr = new Users();
		usr = us.login(request);
		//join Users table and roles table in DAO. we should not hard code as 100
		if (usr == null) {
            response.sendRedirect("/EPTrial1/static/loginRetry.html");
		}
		else if(usr.getUserRoleId() == 100){
			System.out.println("Navigate to Employee page");
			response.sendRedirect(request.getContextPath() + "/static/Employee1.html");	
		}
		else{
			System.out.println("Navigate to Manager page");
			response.sendRedirect(request.getContextPath() + "/static/Manager.html");
			//System.out.println(request.getContextPath());
		}
		//super.doPost(request, response);
	}
	
	public void findPastEmpTickets(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findPastEmpTickets method");
		
		ReimbursementService rs = new ReimbursementService();
		List<Reimbursement> allReimbForAUser = new ArrayList<Reimbursement>();
		
		allReimbForAUser = rs.getEmployeePastTickets(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(allReimbForAUser);
		
		//
		response.getWriter().print(json);	
	}
	
	public void findAllReimbursements(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findAllReimbursements method");
		ReimbursementService rs = new ReimbursementService();
		List<Reimbursement> allReimbsForAMgr = new ArrayList<Reimbursement>();
		allReimbsForAMgr = rs.getAllReimbForManager(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(allReimbsForAMgr);
		response.getWriter().print(json);
	}
	
	public void findAllReimbursementsPending(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findAllReimbursementsPending method");
		ReimbursementService rs = new ReimbursementService();
		List<Reimbursement> allReimbsForAMgr = new ArrayList<Reimbursement>();
		allReimbsForAMgr = rs.getAllReimbForManagerPending(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(allReimbsForAMgr);
		response.getWriter().print(json);
	}
	
	public void findAllReimbursementsDenied(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findAllReimbursementsDenied method");
		ReimbursementService rs = new ReimbursementService();
		List<Reimbursement> allReimbsForAMgr = new ArrayList<Reimbursement>();
		allReimbsForAMgr = rs.getAllReimbForManagerDenied(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(allReimbsForAMgr);
		response.getWriter().print(json);
	}
	
	public void findAllReimbursementsApproved(HttpServletRequest request, HttpServletResponse response) throws IOException{
		System.out.println("LoginController: findAllReimbursementsApproved method");
		ReimbursementService rs = new ReimbursementService();
		List<Reimbursement> allReimbsForAMgr = new ArrayList<Reimbursement>();
		allReimbsForAMgr = rs.getAllReimbForManagerApproved(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(allReimbsForAMgr);
		response.getWriter().print(json);
	}
	
	public void fetchSingleReimbursement(HttpServletRequest request, HttpServletResponse response) throws IOException {
		//System.out.println("LoginController: fetchSingleReimbursement method begin");
		ReimbursementService rs = new ReimbursementService();
		Reimbursement reimb;
		reimb = rs.getSingleReimbursement(request);
		ObjectMapper om = new ObjectMapper();
		ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
		String json = ow.writeValueAsString(reimb);
		response.getWriter().print(json);
		response.sendRedirect(request.getContextPath() + "/static/EditReimbursement.html");
		System.out.println("In LoginController fetching single reimb id:" + reimb);
	}
	
}
