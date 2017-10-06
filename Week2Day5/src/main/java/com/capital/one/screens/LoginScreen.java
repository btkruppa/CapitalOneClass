package com.capital.one.screens;

import java.util.Scanner;

import com.capital.one.beans.User;
import com.capital.one.daos.UserDao;
import com.capital.one.daos.UserDaoJDBC;

public class LoginScreen {
	private static Scanner scan = new Scanner(System.in);
	private static UserDao ud = new UserDaoJDBC();

	public static void main(String[] args) {

		System.out.println("Please enter a username: ");
		String username = scan.nextLine();
		System.out.println("Please enter a password: ");
		String password = scan.nextLine();
		
		// allows sql injection
//		User user = ud.findByUsernameAndPassword(username, password);
		
		User user = ud.betterFindByUsernameAndPassword(username, password);
		
		if(user != null) {
			System.out.println("successfully logged in user details " + user);
		} else {
			System.out.println("invalid credentials");
		}

	}
}
