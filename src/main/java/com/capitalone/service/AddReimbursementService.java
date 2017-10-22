package com.capitalone.service;

import java.math.BigDecimal;
import java.sql.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.capitalone.beans.ErsUsers;
import com.capitalone.daoimpl.AddReimbursementDaoImpl;

public class AddReimbursementService {
	
	AddReimbursementDaoImpl addReimbursementDaoImpl = new AddReimbursementDaoImpl();
	
	public void addReimbursementService(HttpServletRequest req) {
		float amount = Float.valueOf(req.getParameter("amount"));
        Date date = new java.sql.Date(System.currentTimeMillis());

        String description = req.getParameter("description");
        String receipt = req.getParameter("receipt");
        int reimbType = 0;
        
        System.out.println("AddReimbursementService");

        if (req.getParameter("reimbType").equals("Lodging")) {
                        reimbType = 1;
                        System.out.println(reimbType);
        } else if (req.getParameter("reimbType").equals("Travel")) {
                        reimbType = 2;
        } else if (req.getParameter("reimbType").equals("Food")) {
                        reimbType = 3;
        } else
                        reimbType = 4;

        HttpSession session = req.getSession();
        ErsUsers ersUser =  (ErsUsers) session.getAttribute("user");
        int ersUsersId = ersUser.getErsUsersId();

        addReimbursementDaoImpl.addReimbursement(amount, date, description, receipt, ersUsersId, 1, reimbType);

	}
}


