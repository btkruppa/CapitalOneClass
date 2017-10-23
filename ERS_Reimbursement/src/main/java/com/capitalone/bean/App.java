package com.capitalone.bean;

import java.util.Scanner;

import com.capitalone.dao.ERSUserLoginDao;

public class App {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ERSUserLoginDao logIn = new ERSUserLoginDao();

		System.out.println("Enter ERS User Name");
		String ersUserName = sc.nextLine();
		System.out.println("Enter ERS User Password");
		String ersUserPassword = sc.nextLine();
		ERSUser ersUser = logIn.userLogin(ersUserName, ersUserPassword);

		if (ersUser != null) {
			System.out.println("Login Successfull");
		} else
			System.out.println("Login Failed");

	}
}
