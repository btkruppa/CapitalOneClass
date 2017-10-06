package com.capital.one.screens;

import java.util.Scanner;

import com.capital.one.beans.User;
import com.capital.one.daos.UserDao;
import com.capital.one.daos.UserDaoJDBC;

public class RegistrationScreen {
	private static Scanner scan = new Scanner(System.in);
	private static UserDao ud = new UserDaoJDBC();
	public static void main(String[] args) {
		
		System.out.println("Enter new user username");
		String username = scan.nextLine();
		System.out.println("Enter your password");
		String password = scan.nextLine();
		ud.addNewUser(new User(0, username, password, null));
		
		
		
	}
}	
