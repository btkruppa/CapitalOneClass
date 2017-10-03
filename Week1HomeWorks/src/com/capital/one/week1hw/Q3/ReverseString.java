package com.capital.one.week1hw.Q3;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		String reverse = "life is beautiful!!";
		String reversedString=new String();
		
		for (int i = reverse.length(); i>0;i--)
		{
			reversedString=reversedString+reverse.charAt(i-1);
		
		}
		System.out.println(reversedString);
	}

}
