package com.capitalone.service;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;

import com.capitalone.bean.ERSUser;
import com.capitalone.bean.ERSUserRole;
import com.capitalone.dao.ERSUserLoginDao;
import com.capitalone.dao.ERSUserRoleDao;

public class LoginService {

	ERSUserLoginDao loginDao = new ERSUserLoginDao();
	ERSUserRoleDao userRoleDao = new ERSUserRoleDao();
	Logger log = Logger.getRootLogger();

	public boolean login(HttpServletRequest req) {

		String userName = req.getParameter("UserId");
		String password = req.getParameter("Password");
		log.debug("User " + userName + " is trying to login");

		ERSUser ersUser = loginDao.userLogin(userName, password);

		if (ersUser != null) {
			req.getSession().setAttribute("UserName", ersUser.getErsUserName());
			req.getSession().setAttribute("UserId", ersUser.getErsUserID());
			req.getSession().setAttribute("UserRoleID", ersUser.getUserRoleId());
			log.info("User " + userName + " successfully loggedin");
			return true;
		}
		return false;
	}

	public ERSUserRole userRole(int userRoleID) {
		log.debug("Trying to find the User Role");
		ERSUserRole ersUserRole = userRoleDao.userRole(userRoleID);
		return ersUserRole;
	}

}
