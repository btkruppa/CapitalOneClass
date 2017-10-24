package com.ersassignment.services;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.ersassignment.dao.UsersDaoImpl;
import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.model.Users_ERS;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class UserServices {
	UsersDaoImpl ud = new UsersDaoImpl();
	Logger log = Logger.getRootLogger();
	List<Ers_reimbursement> reimb = new ArrayList<Ers_reimbursement>();
	Ers_reimbursement add = new Ers_reimbursement();

	private int reimb_author;

	public Users_ERS login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(req.getParameter("username"));
		log.debug("user " + username + " is trying to login");

		Users_ERS user = ud.findByUsernameAndPassword(username, password);
		if (user != null) {
			req.getSession().setAttribute("currentUser", user);
			log.info("user " + username + " succesfully logged in");

		}
		return user;
	}

	public List<Ers_reimbursement> viewById(HttpServletResponse resp) throws JsonProcessingException {
		System.out.println("Inside userservices");
		reimb = ud.findByReimb_author(2);
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(reimb);
		System.out.println(json);
		System.out.println(reimb);
		try {
			resp.getWriter().println(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return reimb;

	}

	public void addrequest(HttpServletRequest req) {
		HttpSession sess = req.getSession(true);
		Users_ERS user = (Users_ERS) sess.getAttribute("currentUser");
		System.out.println("Inside add");
		add.setReimb_amount(Integer.parseInt(req.getParameter("number")));
		add.setReimb_description(req.getParameter("description"));
		add.setReimb_type_id(Integer.parseInt(req.getParameter("rtype")));

		// add.setReimb_amount(Integer.parseInt(req.getParameter("author")));
		// add.setReimb_amount(Integer.parseInt(req.getParameter("resolver")));
		// add.setReimb_type_id(req.getParameter("rtype"));

		ud.addRequest(add);

	}

}
