package com.capital.one.week1hw.Q13;

public class NumberTriangle {
	 public static void main (String [] args){
		 int i, j;
		 for(i = 1; i <= 4; i++)
		 {
		     for(j = 1; j <= i; j++)  
		     {  if (j%2 == 0){        
		         System.out.print("1"); 
		     } else
		    	 System.out.print("0"); 
		     }      
		     System.out.print("\n");        
		}
	}
}
