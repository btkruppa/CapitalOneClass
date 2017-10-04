package com.capital.one.week1hw.Q14;

import java.time.LocalDate;

public class DemoSwitchCases {

	public static void main(String[] args) {
					
				int x =81;
				String myString = "I am learning core java";
				String[] newString;
				int y =3;
				
				switch (y) {
				case 1:
					System.out.println("Square Root of "  + x + "is" + Math.sqrt(x));
					
					break;

				case 2:
					System.out.println("Local date " +LocalDate.now() );
					
					break;
					
				case 3:

					newString = myString.split(" ");
					System.out.println("Splitted String: " );
					for(int i=0;i<newString.length;i++) {
						System.out.println( newString[i]);
					};

					break;
					
				}
				
			}



	}


