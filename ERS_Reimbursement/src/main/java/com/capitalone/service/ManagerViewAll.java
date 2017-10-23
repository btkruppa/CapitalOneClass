package com.capitalone.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.bean.ReImbursementList;
import com.capitalone.dao.MgrViewAllReimbListDao;

public class ManagerViewAll {

	Logger log = Logger.getRootLogger();
	ReImbursementList reimbList = new ReImbursementList();
	MgrViewAllReimbListDao mgrViewList = new MgrViewAllReimbListDao();

	public List<ReImbursementList> listOfReImb(HttpServletRequest req) {
		
		List<ReImbursementList> reimbList = mgrViewList.mgrReimbList();
		System.out.println(reimbList);
		return reimbList;
	}

}
