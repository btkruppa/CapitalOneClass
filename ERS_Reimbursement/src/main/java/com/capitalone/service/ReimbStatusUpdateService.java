package com.capitalone.service;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.capitalone.dao.ReimbUpdateStatusDao;

public class ReimbStatusUpdateService {
	
	Logger log = Logger.getRootLogger();
	ReimbUpdateStatusDao updateStatusDao = new ReimbUpdateStatusDao();
	
	public boolean accept(HttpServletRequest req) {
		
		log.debug("In Service request");

		String reimbId = req.getParameter("id");
		
		System.out.println("In accepting Service for:" + reimbId);
		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("UserId");
		System.out.println("User Role:" + userId);
		Date updateDate = new java.sql.Date(System.currentTimeMillis());
		int reimbStatusId = 3;
		log.debug("Manger " + userId + "is trying to update the Reimb Id: " + reimbId);
		

		if (updateStatusDao.reimbStatusUpdate(Integer.parseInt(reimbId), (java.sql.Date) updateDate , userId, reimbStatusId)) {
			
			return true;
		}
		return false;
	}
	
	public boolean decline(HttpServletRequest req) {
		
		log.debug("In Service request");

		String reimbId = req.getParameter("id");
		
		System.out.println("In deline Service for: " + reimbId);
		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("UserId");
		System.out.println("User Role:" + userId);
		Date updateDate = new java.sql.Date(System.currentTimeMillis());
		int reimbStatusId = 4;
		log.debug("Manger " + userId + "is trying to update the Reimb Id: " + reimbId);
		

		if (updateStatusDao.reimbStatusUpdate(Integer.parseInt(reimbId), (java.sql.Date) updateDate , userId, reimbStatusId)) {
			
			return true;
		}
		return false;
	}
	
}

