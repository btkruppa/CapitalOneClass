package com.capital.one.beans;

public class NumberTriangle {
	
	 public static void main (String [] args){
		 int i, j;
		 for(i = 1; i <= 10; i++)
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
