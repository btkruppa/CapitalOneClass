package com.ersassignment.services;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.ersassignment.dao.ManagerImpl;
import com.ersassignment.dao.UsersDaoImpl;
import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.model.Users_ERS;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class ManagerServices {
	ManagerImpl mr = new ManagerImpl();
	Logger log = Logger.getRootLogger();

	List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();

	// view all
	public List<Ers_reimbursement> viewall(HttpServletResponse resp) throws JsonProcessingException {
		reimb = mr.findAllRequests();
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(reimb);

		try {
			resp.getWriter().println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reimb;

	}

	// View by status
	public List<Ers_reimbursement> viewbystatus(HttpServletResponse resp) throws JsonProcessingException {
		System.out.println("status dao");
		reimb = mr.findByStatus();
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(reimb);
		System.out.println(json);

		try {
			resp.getWriter().println(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return reimb;

	}

	public void doaction(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		System.out.println("inside doaction");

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		String[] segments = requestUrl.split("/");
		String option = segments[segments.length - 1];
		Ers_reimbursement ers = new Ers_reimbursement();
		ers.setReimb_id(Integer.parseInt(option));

		System.out.println("option is " + option);

		System.out.println("!!!!!" + ers.getReimb_id());

		mr.approveRequest(ers.getReimb_id());
		// resp.sendRedirect("/ersproj/static/approve.html");
	}

	public void doaction1(HttpServletRequest req, HttpServletResponse resp) throws JsonProcessingException {
		System.out.println("inside doaction");

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		String[] segments = requestUrl.split("/");
		String option = segments[segments.length - 1];
		Ers_reimbursement ers = new Ers_reimbursement();
		ers.setReimb_id(Integer.parseInt(option));

		System.out.println("option is " + option);

		System.out.println("!!!!!" + ers.getReimb_id());
		// System.out.println(((Ers_reimbursement) ers).getReimb_type_id());
		mr.denyRequest(ers.getReimb_id());
		// resp.sendRedirect("/ersproj/static/approve.html");
	}

	// public void redirect(HttpServletResponse resp) throws IOException {
	// resp.sendRedirect("/ersproj/static/success.html");
	// }
}
