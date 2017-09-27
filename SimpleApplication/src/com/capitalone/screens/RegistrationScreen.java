package com.capitalone.screens;

import java.util.Scanner;

import com.capitalone.beans.User;
import com.cpitalone.utilities.UserSerializerUtility;

public class RegistrationScreen implements Screen {
	private UserSerializerUtility us = new UserSerializerUtility();
	private Scanner scan = new Scanner(System.in);

	@Override
	public Screen run() {
		User newUser = new User();

		System.out.println("To create an account, type username:");
		newUser.setUsername(scan.nextLine());

		System.out.println("Now enter password:");
		newUser.setPassword(scan.nextLine());

		System.out.println("Now enter email:");
		newUser.setEmail(scan.nextLine());

		us.serializeUser(newUser);
		return new LoginScreen();
	}

}
