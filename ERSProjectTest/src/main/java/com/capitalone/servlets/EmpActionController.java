package com.capitalone.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.service.empReimbHistoryService;
import com.capitalone.utilities.DAOUtilities;
import com.capitalone.utilities.ReuseService;

public class EmpActionController {
	public void employeeAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		ReimbReq reimbReq = DAOUtilities.getReimbReq();
		empReimbHistoryService empHistory = ReuseService.getReimHisServ();
			reimbReq = empHistory.listAllReimbursement(req,res);	
			if(reimbReq!=null && reimbReq.getReimb_id()!=0)
				req.getRequestDispatcher("/static/viewHistory.html").forward(req, res);	
			else
				res.sendRedirect("/ERSProjectTest/static/nohistory.html");

	}
}
