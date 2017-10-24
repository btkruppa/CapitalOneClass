package service;


import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ers.reimbursement.model.Reimbursement;
import com.ers.reimbursement.model.Users;

import dao.ReimbursementDAOImpl;



public class ReimbursementService {
	
	ReimbursementDAOImpl rdi = new ReimbursementDAOImpl();
	Logger log = Logger.getRootLogger();
	
	List<Reimbursement> allReimbForAUser;
	
	//To view Employees past tickets
	public List<Reimbursement> getEmployeePastTickets(HttpServletRequest req) {	
		Users logInUser = (Users) req.getSession().getAttribute("currentUser");
		int logInUserId = logInUser.getErsUsersId();	 
		//call getAllTicketsForAUser
		allReimbForAUser = rdi.getAllTicketsForAUser(logInUserId);
		System.out.println("getEmployeePastTickets = " + allReimbForAUser.size());
		return allReimbForAUser;
	}
	
	//To get all Reimbursement for Manager
	public List<Reimbursement> getAllReimbForManager(HttpServletRequest req){	
		allReimbForAUser = rdi.getAllReimbursements();
		System.out.println("getAllReimbForManager = " + allReimbForAUser.size());
		return allReimbForAUser;
	}
	
	public List<Reimbursement> getAllReimbForManagerPending(HttpServletRequest req){		
		int rStatusId = 1;
		allReimbForAUser = rdi.getAllReimbursementsByStatus(rStatusId);
		System.out.println("getAllReimbForManagerPending = " + allReimbForAUser.size());
		return allReimbForAUser;
	}
	
	public List<Reimbursement> getAllReimbForManagerDenied(HttpServletRequest req){	
		int rStatusId = 3;
		allReimbForAUser = rdi.getAllReimbursementsByStatus(rStatusId);
		System.out.println("getAllReimbForManagerDenied = " + allReimbForAUser.size());
		return allReimbForAUser;
	}
	
	public List<Reimbursement> getAllReimbForManagerApproved(HttpServletRequest req){	
		int rStatusId = 2;
		allReimbForAUser = rdi.getAllReimbursementsByStatus(rStatusId);
		System.out.println("getAllReimbForManagerApproved = " + allReimbForAUser.size());
		return allReimbForAUser;
	}
	
	public Reimbursement getSingleReimbursement(HttpServletRequest req){		
		String requesturl = req.getRequestURI().substring(req.getContextPath().length());
		String[] segments = requesturl.split("/");
		String rId = segments[segments.length - 1];
		int reimbId = Integer.parseInt(rId);
		
		Reimbursement ri = new Reimbursement();
		ri = rdi.getSingleReimbData(reimbId);
		if (ri != null) {
			req.getSession().setAttribute("currentReimbId", ri.getReimbId());
		}
		return ri;
	}
	
	public void empIsAddingReimbursement(HttpServletRequest req){
		Users logInUser = (Users) req.getSession().getAttribute("currentUser");
		int logInUserId = logInUser.getErsUsersId();
		int reimbStatus = 1; // initially it will be pending so it is hard coded here
		Reimbursement rAdd = new Reimbursement();
		Timestamp currentTimestamp = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		rAdd.setReimbAmount(Integer.parseInt(req.getParameter("amount")));
		rAdd.setReimbDescription(req.getParameter("description"));
		rAdd.setReimbTypeId(Integer.parseInt(req.getParameter("reimb_type")));
		rAdd.setReimbSubmitted(currentTimestamp);
		rAdd.setReimbStatusId(reimbStatus);
		rAdd.setReimbAuthor(logInUserId);
		try {
			rdi.addReimbursement(rAdd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void managerIsUpdatingReimbursement(HttpServletRequest req){
		Users logInMgr = (Users) req.getSession().getAttribute("currentUser");		
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
        String[] segments = requestUrl.split("/");
        String reimID = segments[segments.length - 1];
        if(requestUrl.contains("/acceptReimbursement/")){
        	rdi.updateReimbursement(2, Integer.parseInt(reimID));}
        if(requestUrl.contains("/denyReimbursement/")){
        	System.out.println(" delete !!!");
        	rdi.updateReimbursement(3, Integer.parseInt(reimID));}
	}
	
}
