package com.capital.one.service;

import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.capital.one.beans.User;
import com.capital.one.daos.UserDao;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class UserService {
	UserDao ud = new UserDao();
	Logger log = Logger.getRootLogger();

	public List<User> getAllUser(HttpServletRequest req) {
		if (req.getAttribute("user") != null) {
			return null;
		}
		return null;
	}

	public boolean login(HttpServletRequest req) {
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		log.debug("user " + username + " is trying to login");

		User user = ud.findByUsername(username, password);
		if (user != null) {
			req.getSession().setAttribute("currentUser", user);
			log.info("user " + username + " succesfully logged in");
			return true;
		}
		return false;
	}

	public User findById(String id, HttpServletResponse resp) {
		try {
			// get the user
			User user = ud.findById(Integer.parseInt(id));
			
			// jackson code for converting to json
			ObjectMapper om = new ObjectMapper();
			ObjectWriter ow = om.writer().withDefaultPrettyPrinter();
			String json = ow.writeValueAsString(user);
			
			// write to response body
			resp.getWriter().print(json);
			return user;
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
