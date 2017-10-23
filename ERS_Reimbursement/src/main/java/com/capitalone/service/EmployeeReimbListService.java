package com.capitalone.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;

import com.capitalone.bean.ReImbursementList;
import com.capitalone.dao.EmployeeReimbListDao;

public class EmployeeReimbListService {

	Logger log = Logger.getRootLogger();
	ReImbursementList reimbList = new ReImbursementList();
	EmployeeReimbListDao empReimbDao = new EmployeeReimbListDao();

	public List<ReImbursementList> listOfReImb(HttpServletRequest req) {
		
		HttpSession session = req.getSession();
		int userId = (int) session.getAttribute("UserId");
		List<ReImbursementList> reimbList = empReimbDao.reimbList(userId);
		System.out.println(reimbList);
		return reimbList;
	}

}
