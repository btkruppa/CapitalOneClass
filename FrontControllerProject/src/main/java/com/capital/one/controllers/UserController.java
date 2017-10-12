package com.capital.one.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capital.one.beans.User;
import com.capital.one.service.UserService;

public class UserController {
	private Logger log = Logger.getRootLogger();
	private UserService us = new UserService();

	public void processGetRequests(HttpServletRequest req, HttpServletResponse resp) {

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {

		// get all users
		case "/users":
			List<User> users = us.getAllUser(req);
			break;

		// /users/{id}
		default:
			User user = us.findById(requestUrl.substring(7), resp);
			log.trace("user from default: " + user);
			break;
		}
	}

	public void processPostRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/users/login":
			login(req, resp);
			break;

		default:
			break;
		}
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		if (us.login(req)) {
			resp.sendRedirect("/FrontControllerProject/static/index.html");
		} else {
			resp.sendRedirect("/FrontControllerProject/static/loginPage.html");
		}
	}
}
