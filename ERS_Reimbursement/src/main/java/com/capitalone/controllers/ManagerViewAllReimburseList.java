package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capitalone.service.ManagerViewAll;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ManagerViewAllReimburseList {

	private Logger log = Logger.getRootLogger();
	ManagerViewAll mgrViewList =new ManagerViewAll();

	public void processGetRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.trace("processGetRequest in Employee Controller");
		System.out.println("request URL is " + requestUrl);
		if (requestUrl.startsWith("/viewAll")) {
			pullMgrReimbViewAll(req, resp);

		}
	}

	private void pullMgrReimbViewAll(HttpServletRequest req, HttpServletResponse resp) throws JsonProcessingException {
		ObjectMapper om = new ObjectMapper();
		String json;
		try {
			json = om.writeValueAsString(mgrViewList.listOfReImb(req));
			System.out.println(json);
			resp.getWriter().println(json);
		} catch (IOException e1) {
			log.trace("IO exception");
			e1.printStackTrace();
		}
	}
}
