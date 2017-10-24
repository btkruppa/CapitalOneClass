package com.capitalone.servlets;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.capitalone.utilities.ReuseServlets;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ERSFrontController extends DefaultServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		LoginController lc = ReuseServlets.getLoginCntr();
		EmpActionController empHistory = ReuseServlets.getEmpActCntr();
		EmpNewReqController empNew = ReuseServlets.getEmpNewReqCntr();
		ViewEmpHistoryController viewHistory = ReuseServlets.getViewEmpHisCntr();
		ManagerActionController act = ReuseServlets.getManageActCntr();
		Logger log = Logger.getLogger("ERSFrontController");
		
		
		if (requestUrl.startsWith("/static")) {
			super.doGet(req, res);
			return;
		}
		if (requestUrl.startsWith("/loginmain")) {
			log.trace("calling loginControl");
			lc.loginControl(req, res);
		}
		if (requestUrl.startsWith("/employee")) {
			empHistory.employeeAction(req, res);
		}
		if (requestUrl.startsWith("/newReq")) {
			empNew.empNewReq(req, res);
		}
		if (requestUrl.startsWith("/managerviewhistory")) {
			viewHistory.viewEmpHistory(req, res);
		}
		if (requestUrl.startsWith("/pendreq")) {
			act.viewMyEmpPendReq(req, res);
		}
		if (requestUrl.startsWith("/approve")) {
			try {
				act.takeAction(req,res);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (requestUrl.startsWith("/deny")) {
			try {
				act.takeAction(req,res);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (requestUrl.startsWith("/retrievehistory")) {
			if (req.getSession().getAttribute("reimbursement") != null) {
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(req.getSession().getAttribute("reimbursement"));
				res.getWriter().println(json);
			}

		}

		if (requestUrl.startsWith("/manageractionpend")) {
			if (!(req.getSession().getAttribute("pendingreq").equals(null))) {
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(req.getSession().getAttribute("pendingreq"));
				res.getWriter().println(json);
			}

		}

		if (requestUrl.startsWith("/retrieveemp")) {
			if (req.getSession().getAttribute("empreimbursement") != null) {
				ObjectMapper om = new ObjectMapper();
				String json = om.writeValueAsString(req.getSession().getAttribute("empreimbursement"));
				res.getWriter().println(json);
			}

		}
		if (requestUrl.startsWith("/logout")) {
			req.getSession().setAttribute("User", null);
			req.getSession().removeAttribute("empreimbursement");
			req.getSession().removeAttribute("userRole");
			req.getSession().removeAttribute("reimbursement");
			req.getSession().invalidate();
			res.sendRedirect("/ERSProjectTest/static/loginmain.html");
		}

	}
}
