package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.service.EmployeeReimbListService;
import com.fasterxml.jackson.databind.ObjectMapper;

public class EmployeeReimbListController {

	private Logger log = Logger.getRootLogger();
	EmployeeReimbListService empReimbList = new EmployeeReimbListService();

	public void processGetRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.trace("processGetRequest in Employee Controller");
		System.out.println("request URL is " + requestUrl);
		if (requestUrl.startsWith("/empViewAll")) {
			pullEmpReimbList(req, resp);

		}
	}

	private void pullEmpReimbList(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
			ObjectMapper om = new ObjectMapper();
			String json = om.writeValueAsString(empReimbList.listOfReImb(req));
			System.out.println(json);
			resp.getWriter().println(json);			
	}

}
