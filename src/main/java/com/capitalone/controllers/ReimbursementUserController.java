package com.capitalone.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.capitalone.beans.ErsReimbursement;
import com.capitalone.beans.ErsUsers;
import com.capitalone.service.ReimbursementUserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ReimbursementUserController {
	
	ReimbursementUserService reimbursementUserService = new ReimbursementUserService();

	
	public String getReimbursementUserController(HttpServletRequest req, HttpServletResponse res) {
		ObjectMapper om = new ObjectMapper();
		
		HttpSession session = req.getSession();
        ErsUsers ersUser =  (ErsUsers) session.getAttribute("user");
        String ersUsername = ersUser.getErsUsername();
        System.out.println("username in view user controller :" + ersUsername);
		
		List<ErsReimbursement> ersReimbursement = reimbursementUserService.getReimbursementUserService(ersUsername);
		String ersReimbursementJson = null;
		try {
			ersReimbursementJson = om.writeValueAsString(ersReimbursement);
			return ersReimbursementJson;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return ersReimbursementJson;
	}
	
	public static void main(String[] args) {
		ReimbursementUserService reimbursementUserService = new ReimbursementUserService();
		ObjectMapper om = new ObjectMapper();
		List<ErsReimbursement> ersReimbursement = reimbursementUserService.getReimbursementUserService("devi");
		String ersReimbursementJson = null;
		try {
			System.out.println(ersReimbursementJson = om.writeValueAsString(ersReimbursement));
///		return ersReimbursementJson;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
