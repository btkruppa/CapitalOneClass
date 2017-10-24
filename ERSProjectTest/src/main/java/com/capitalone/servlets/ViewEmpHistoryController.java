package com.capitalone.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.service.ViewEmpReqService;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseService;

public class ViewEmpHistoryController {
	
	public void viewEmpHistory(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ReimbReq empReimbRequest = DAOUtilities.getReimbReq();
		ViewEmpReqService viewHistory = ReuseService.getViewEmpServ();
		empReimbRequest = viewHistory.viewAllReimbursement(req,res);	
		if(empReimbRequest!=null && empReimbRequest.getReimb_id()!=0)
		req.getRequestDispatcher("/static/viewEmpHistory.html").forward(req, res);	
		else
			res.sendRedirect("/ERSProjectTest/static/nohistory.html");
	}
}
