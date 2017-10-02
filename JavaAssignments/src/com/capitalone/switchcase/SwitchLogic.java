package com.capitalone.switchcase;


import java.time.LocalDateTime;


public class SwitchLogic {
	String[] strNew;
	public void switchCase(int num, int number) {
		switch(num) {
		case 1 : {
			System.out.println(Math.sqrt(number));
			break;
		}
		case 2 : {
			System.out.println(LocalDateTime.now());
			break;
		}
		case 3 : {
			String str = "I am learning Core Java";
			strNew = str.split(" ");
			for(int i=0;i<strNew.length;i++) {
				System.out.println(strNew[i]);
			}
			break;
		}
		
		}
	}
}
