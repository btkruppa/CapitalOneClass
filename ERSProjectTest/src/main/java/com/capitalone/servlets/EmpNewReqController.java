package com.capitalone.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.reimbursementsystem.dao.EmpAddNewReqDAOImpl;
import com.capitalone.service.empAddNewReqService;
import com.capitalone.utilities.ReuseService;

public class EmpNewReqController {
	public void empNewReq(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		empAddNewReqService newReq = ReuseService.getAddNewServ();
		newReq.addNewReimb(req, res);
		if(EmpAddNewReqDAOImpl.rowCount!=0)
			req.getRequestDispatcher("/static/addedSucess.html").forward(req, res);
	
	}
}
