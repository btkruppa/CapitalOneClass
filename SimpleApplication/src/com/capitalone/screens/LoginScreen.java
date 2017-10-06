package com.capitalone.screens;

import java.util.Scanner;

import com.capitalone.beans.User;
import com.capitalone.eceptions.InvalidCredentialException;
import com.cpitalone.utilities.UserSerializerUtility;

public class LoginScreen implements Screen {
	private Scanner scan = new Scanner(System.in);
	private UserSerializerUtility us = new UserSerializerUtility();

	@Override
	public Screen run() {
		System.out.println("Enter 1 to login or enter 2 to create an accoutn");
		String input = scan.nextLine();
		if ("1".equals(input)) {
			try {
				return loginPrompt();

			} catch (InvalidCredentialException e) {
				e.printStackTrace();
				System.out.println("failed to login");
			}
		} else if ("2".equals(input)) {
			return new RegistrationScreen();
		}

		return null;
	}

	private Screen loginPrompt() throws InvalidCredentialException {

		// get user credentials
		String username;
		String password;
		System.out.println("Enter username:");
		username = scan.nextLine();
		System.out.println("Enter password:");
		password = scan.nextLine();

		// read the user from file based on credentials
		User userFromFile = us.deserializeUser(username);

		// determine if credentials are valid
		System.out.println(userFromFile);
		if (username.equals(userFromFile.getUsername()) && password.equals(userFromFile.getPassword())) {
			return new HomeScreen();
		}
		throw new InvalidCredentialException();

	}

}
