package service;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;


import com.ers.reimbursement.model.Users;


import dao.UsersDAOImpl;

public class UserService {
	
	UsersDAOImpl udi = new UsersDAOImpl();
	Logger log = Logger.getRootLogger();
	
	public Users login(HttpServletRequest req) {
		String username = req.getParameter("user_name");
		String password = req.getParameter("user_password");
		log.debug("user " + username + " is trying to login");
		System.out.println("user " + username + " is trying to login");
		Users user;
		//call getUsername method
		user = udi.getUserName(username, password);
		if (user != null) {
			
			req.getSession().setAttribute("currentUser", user);
			log.info("user " + username + " succesfully logged in");
			System.out.println("user " + username + " succesfully logged in");			
		}
		//System.out.println(user.getErsUsername());
		return user;	
	}
}
