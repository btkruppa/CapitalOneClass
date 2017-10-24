package com.ersassignment.screens;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;
import org.apache.log4j.Logger;

import com.ersassignment.services.ManagerServices;

public class FrontController extends DefaultServlet {
	private Logger log = Logger.getRootLogger();
	private LoginScreen usercontroller = new LoginScreen();
	private LaunchManager mgcontroller = new LaunchManager();
	private ManagerServices managerServices = new ManagerServices();

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println(" DO GET in  FC  " + req.getRequestURI());
		log.trace("full url: " + req.getRequestURI());
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("get request made with url: " + requestUrl);

		// route static content normally
		if (requestUrl.startsWith("/static")) {
			System.out.println("In get method of front controller to direct static page");
			super.doGet(req, resp);
			return;
		}

		// route to user controller
		if (requestUrl.startsWith("/user/")) {
			// System.out.println("get USER ");
			usercontroller.processGetRequests(req, resp);
		}

		if (requestUrl.startsWith("/manager")) {
			mgcontroller.processGetRequests(req, resp);
		}
		if (requestUrl.startsWith("/manager/approve/")) {
			// mgcontroller.processGetRequests(req, resp);
			managerServices.doaction(req, resp);

		}

		if (requestUrl.startsWith("/manager/deny/")) {
			// mgcontroller.processGetRequests(req, resp);
			managerServices.doaction1(req, resp);
		}
		// throw new unMatchedException();

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		log.debug("post request made with url: " + requestUrl);

		if (requestUrl.startsWith("/user/")) {
			usercontroller.processPostRequests(req, resp);
		}

		if (requestUrl.startsWith("/manager")) {
			mgcontroller.processPostRequests(req, resp);
		}

		// throw new unMatchedException();
	}

}
