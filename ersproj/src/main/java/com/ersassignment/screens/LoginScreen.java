package com.ersassignment.screens;

import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.servlets.DefaultServlet;

import com.ersassignment.dao.ReimbursementDAO;
import com.ersassignment.dao.UsersDAO;
import com.ersassignment.dao.UsersDaoImpl;
import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.model.Users_ERS;
import com.ersassignment.services.UserServices;

import org.apache.log4j.Logger;

// private static int reimb_id;
public class LoginScreen extends DefaultServlet {
	// private static Scanner scan = new Scanner(System.in);
	private static UsersDaoImpl ud = new UsersDaoImpl();

	private Logger log = Logger.getRootLogger();
	private UserServices us = new UserServices();

	public void processGetRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/user/login":
			login(req, resp);
			break;

		case "/user/view":
			us.viewById(resp);
			break;

		case "/user/request":
			System.out.println("adding ticket");

			us.addrequest(req);
			break;

		default:
			break;
		}
	}

	public void processPostRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/user/login":
			login(req, resp);
			break;

		case "/user/view":
			viewById(resp);
			break;

		case "/user/addrequest":
			us.addrequest(req);
			addrequest(resp);
			break;

		default:
			break;
		}
	}

	private void login(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		Users_ERS user = us.login(req);
		System.out.println(user.getUser_role_id());
		if (user.getUser_role_id() == 1) {
			resp.sendRedirect("/ersproj/static/user.html");
		} else if (user.getUser_role_id() == 2) {
			resp.sendRedirect("/ersproj/static/manager.html");
		} else
			resp.sendRedirect("/ersproj/static/indexretry.html");
	}

	private void viewById(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("/ersproj/static/view.html");

	}

	private void addrequest(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("/ersproj/static/addsuccess.html");

	}

}

// ****findByUsernameAndPassword call

/*
 * System.out.println("Please enter a username: "); String username =
 * scan.nextLine(); System.out.println("Please enter a password: "); String
 * password = scan.nextLine(); Users_ERS user
 * =ud.findByUsernameAndPassword(username, password);
 * 
 * if(user != null) { System.out.println("successfully logged in user details "
 * + user); } else { System.out.println("invalid credentials"); }
 */

// **** user or MGR call

/*
 * System.out.println("Please enter a username: "); String username =
 * scan.nextLine(); System.out.println("Please enter a password: "); String
 * password = scan.nextLine(); Users_ERS user =ud.findUserOrMgr(username,
 * password);
 */

/*
 * /****Inserts a request
 * 
 * System.out.println("Enter your description"); String reimb_description =
 * scan.nextLine(); String reimb_description="food"; System.out.println(
 * "Enter your author who is submitting a request"); int reimb_author =
 * scan.nextInt(); System.out.println("Enter new user reimb id"); int reimb_id =
 * scan.nextInt(); // int reimb_id =11; System.out.println("Enter your amount");
 * Double reimb_amount = scan.nextDouble(); // Double reimb_amount=1212.12;
 * Timestamp reimb_submitted = ud.getCurrentTimestamp(); Timestamp
 * reimb_resolved = ud.getCurrentTimestamp(); //
 * System.out.println(reimb_submitted); // System.out.println(reimb_resolved);
 * //System.out.println("Enter your description"); // String
 * reimb_description="food"; //System.out.println(
 * "Enter your author who is submitting a request"); // int reimb_author =
 * scan.nextInt(); // int reimb_author=2; System.out.println(
 * "Enter your manager id to approve"); int reimb_resolver = scan.nextInt(); //
 * int reimb_resolver=2; System.out.println("Enter your Status id"); int
 * reimb_status_id = scan.nextInt(); // int reimb_status_id=1;
 * System.out.println("Enter your type id"); int reimb_type_id = scan.nextInt();
 * // int reimb_type_id=1;
 */

/*
 * ud.addRequest(new Ers_reimbursement(reimb_id, reimb_amount, reimb_submitted,
 * reimb_resolved, reimb_description, reimb_author, reimb_resolver,
 * reimb_status_id, reimb_type_id));
 */
// System.out.println("record inserted");*/
