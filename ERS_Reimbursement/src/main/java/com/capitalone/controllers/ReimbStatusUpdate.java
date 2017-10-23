package com.capitalone.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.service.ReimbStatusUpdateService;

public class ReimbStatusUpdate {

	ReimbStatusUpdateService reimbUpdateStatus = new ReimbStatusUpdateService();

	public void processPutRequest(HttpServletRequest req, HttpServletResponse resp) {

		System.out.println("Process Put Request");
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		switch (requestUrl) {
		case ("/approve"):
			System.out.println("Approve process");
			reimbUpdateStatus.accept(req);
			break;

		case ("/decline"):
			System.out.println("decline process");
			reimbUpdateStatus.decline(req);
			break;

		default:
			break;
		}
	}

}
