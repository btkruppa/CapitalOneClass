package com.ersassignment.screens;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.apache.catalina.servlets.DefaultServlet;

import com.ersassignment.dao.ManagerImpl;
import com.ersassignment.dao.UsersDaoImpl;
import com.ersassignment.model.Ers_reimbursement;
import com.ersassignment.services.ManagerServices;
import com.ersassignment.services.UserServices;
import com.fasterxml.jackson.databind.ObjectMapper;

public class LaunchManager extends DefaultServlet {
	private static ManagerImpl mr = new ManagerImpl();
	private ManagerServices ms = new ManagerServices();

	// public static void main(String[] args) {

	// *** view all requests as MGR
	/*
	 * System.out.println("Listing all requests for MGR");
	 * List<Ers_reimbursement> reimb=mr.findAllRequests();
	 */

	// *** view requests by status id
	// System.out.println("Listing all requests for MGR");
	// List<Ers_reimbursement> reimb=mr.findByStatus();

	public void processGetRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());

		switch (requestUrl) {
		case "/manager/viewall":
			ms.viewall(resp);
			break;

		case "/manager/viewbystatus":
			ms.viewbystatus(resp);
			break;

		default:
			break;
		}

	}

	public void processPostRequests(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String requestUrl = req.getRequestURI().substring(req.getContextPath().length());
		switch (requestUrl) {
		case "/manager/viewall":
			ms.viewall(resp);
			break;

		case "/manager/viewbystatus":
			ms.viewbystatus(resp);
			break;
		//
		// case "/manager/approve":
		// // ms.redirect(resp);
		// //resp.sendRedirect("/ersproj/static/success.html");
		// break;

		default:
			break;
		}

	}

	private void viewall(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("/ersproj/static/view1.html");

	}

	private void viewbystatus(HttpServletResponse resp) throws IOException {
		resp.sendRedirect("/ersproj/static/viewstatus.html");

	}

	// private void redirect(HttpServletResponse resp) throws IOException {
	// resp.sendRedirect("/ersproj/static/approve.html");

	/*
	 * Use this logic to direct the page if(reimb.getReimb_status_id()==3) {
	 * resp.sendRedirect("/ersproj/static/approve.html"); } else {
	 * resp.sendRedirect("/ersproj/static/deny.html"); }
	 */
	// }
}
