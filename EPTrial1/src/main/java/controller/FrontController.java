package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.ers.reimbursement.model.Users;
import com.fasterxml.jackson.databind.ObjectMapper;

import exceptions.UrlNotMappedException;
import service.ReimbursementService;

public class FrontController extends DefaultServlet{
	
	private LoginController lc = new LoginController();
	private ReimbursementService rservice = new ReimbursementService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		System.out.println("Front Controller: This is a get method");
		String requrl = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(requrl);
		//super.doGet(request, response);
		if(requrl.startsWith("/static/")){
			super.doGet(request, response);
			return;
		}
		if(requrl.startsWith("/Employee")){
			lc.findPastEmpTickets(request, response);			
			return;
		}
		if(requrl.startsWith("/Manager")){
			String requesturl = request.getRequestURI().substring(request.getContextPath().length());
			String[] segments = requesturl.split("/");
			String statusString = segments[segments.length - 1];
			System.out.println("thi is for you!!!" + statusString);
//			System.out.println("Front Controller: rStatusId = " + rStatusId);
			System.out.println("thi is for you!!!");
			switch(statusString){
			case "Pending":
				System.out.println("2nd step");
				lc.findAllReimbursementsPending(request, response);
				break;
			case "Denied":
				System.out.println("2nd step");
				lc.findAllReimbursementsDenied(request, response);
				break;
			case "Approved":
				System.out.println("2nd step");
				lc.findAllReimbursementsApproved(request, response);
				break;
			case "Manager":
				System.out.println("2nd step");
				lc.findAllReimbursements(request, response);
				break;
			default:
				break;
			}
			return;
		}
		if(requrl.startsWith("/GetReimbursement/")){
			//lc.findAllReimbursements(request, response);
			System.out.println("Front Controller: /GetReimbursement/");
			String requesturl = request.getRequestURI().substring(request.getContextPath().length());
			String[] segments = requesturl.split("/");
			String rId = segments[segments.length - 1];
			System.out.println("Front Controller: reimbId = " + rId);
			lc.fetchSingleReimbursement(request, response);	
			return;
		}
		if(requrl.contains("/acceptReimbursement/")){
			System.out.println(request.getRequestURI());
			rservice.managerIsUpdatingReimbursement(request);			
			return;
		}		
		if(requrl.contains("/denyReimbursement/")){
			System.out.println("im here!!!!!!!" + request.getRequestURI());
			rservice.managerIsUpdatingReimbursement(request);			
			return;
		}
		else{
			throw new UrlNotMappedException();
		}		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		String requestUrl = request.getRequestURI().substring(request.getContextPath().length());
		if(requestUrl.startsWith("/Login")){
			System.out.println("im here!!!");
			lc.processPostRequests(request, response);
		} 
		else if(requestUrl.startsWith("/Employee")){
			System.out.println("Employee adding reimbursement");
			lc.addReimursement(request, response);
			response.sendRedirect("/EPTrial1/static/viewPastTickets.html");
		}
		else {
			super.doPost(request, response);
		}		
	}
}
