package com.capitalone.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.capitalone.service.ReimburseFormSubmission;

public class NewReimbRequest {
	
	ReimburseFormSubmission reimbSubmit = new ReimburseFormSubmission();

	public void processNewReimbRequest(HttpServletRequest req, HttpServletResponse resp) {
		
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		System.out.println(requestUrl);
		
		if(requestUrl.equals("/static/reimbursement_registration_form")) {
			
			try {
				submitReqForm(req, resp);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

	private void submitReqForm(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		if (reimbSubmit.formSubmission(req)) {	
				resp.sendRedirect("/ERS_Reimbursement/static/employee.html");
			} else
				resp.sendRedirect("/ERS_Reimbursement/static/reimbursement_registration_form.html");

	}

}
