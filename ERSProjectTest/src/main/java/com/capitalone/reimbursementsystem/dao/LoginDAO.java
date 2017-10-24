package com.capitalone.reimbursementsystem.dao;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface LoginDAO {
	
	//login authentication method declaration
	public void userAuthentication(HttpServletRequest req,HttpServletResponse res) throws IOException;
}
