package com.capital.one.SAX;

import com.capital.one.DOM.DOMParser;

public class Launcher {
	public static void main(String[] args) {
		SAXParser sp = new SAXParser();
//		sp.readAccounts("./src/main/resources/accounts.xml");
		
		DOMParser dp = new DOMParser();
		System.out.println(dp.readAccounts("./src/main/resources/accounts.xml"));
	}
}
