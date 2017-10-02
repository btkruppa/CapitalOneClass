package com.capitalone.q14;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Logic {
	
	public double findSquare(double num) {
		double square = Math.sqrt(num);
		return square;
	}

	public LocalDate currentDate() {
		LocalDate dt;
		dt = LocalDate.now();
		return dt;
	}
	
	public List<String> splitstr(String inputstr) {	

    List<String> strSplit = new ArrayList<String>();
    int end_indx = inputstr.indexOf(' ');
    int begin_indx = 0;
    do
     {
    	 
    	 strSplit.add(inputstr.substring(begin_indx, end_indx));
    	 begin_indx = end_indx;
    	 end_indx = inputstr.indexOf(' ', begin_indx + 1);
    	 if(end_indx == -1)
    	 {
    		 end_indx = inputstr.length();
    	 }
    	 
     }while ( begin_indx < end_indx);
    
	return strSplit;
	}
}
