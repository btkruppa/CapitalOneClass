package com.capitalone.servlets;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.com.reimbursement.bean.ReimbReq;
import com.capitalone.service.ManagerActionService;
import com.capitalone.utilities.ReuseService;

public class ManagerActionController {
	List<ReimbReq> empReimbReq = new ArrayList<ReimbReq>();
	ManagerActionService act = ReuseService.getManageActServ();
	public void viewMyEmpPendReq(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		empReimbReq = act.viewMyEmpPendReq(req, res);
		if(empReimbReq!=null)
			req.getRequestDispatcher("/static/actTaken.html").forward(req, res);
		else
			res.sendRedirect("/ERSProjectTest/static/nohistory.html");
	}
	public void takeAction(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException, SQLException {
		if(act.takeAction(req)!=0)
			res.sendRedirect("/ERSProjectTest/static/actTakensuccess.html");
	}
}
