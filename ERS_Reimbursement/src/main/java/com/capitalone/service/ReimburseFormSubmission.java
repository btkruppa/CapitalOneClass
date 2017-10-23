package com.capitalone.service;

import java.math.BigDecimal;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.capitalone.dao.ReimbFormDao;

public class ReimburseFormSubmission {

	public boolean formSubmission(HttpServletRequest req) {

		ReimbFormDao reimbForm = new ReimbFormDao();

		String number = req.getParameter("amount");
		BigDecimal amount = new BigDecimal(number);
		// float amount = Float.parseFloat(number);
		Date date = new java.sql.Date(System.currentTimeMillis());

		String description = req.getParameter("description");
		String receipt = req.getParameter("receipt");
		int reimbType = 0;

		if (req.getParameter("reimbType").equals("Food")) {
			reimbType = 101;
		} else if (req.getParameter("reimbType").equals("Travel")) {
			reimbType = 201;
		} else if (req.getParameter("reimbType").equals("Lodging")) {
			reimbType = 301;
		} else
			reimbType = 401;

		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("UserId");

		if (reimbForm.reimbList(amount, (java.sql.Date) date, description, receipt, userId, 2, reimbType)) {

			return true;

		}

		return false;
	}

}
