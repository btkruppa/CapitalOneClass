package Q14switchcase;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Switch {
	
	private static int num =30;
	private static void switchEg(int i) {
		switch (i) {
		case 1:
			
			System.out.println("Sq root :"+Math.sqrt(num));
			break;
		case 2:
			date();
			break;
		case 3:
			myString();
			break;
		default:
			System.out.println("Default method");
		}

	}
	private static void myString() {
		String s=("I am core Java");
		String s1,s2,s3,s4,s5;
		s2=s.substring(2,4);
		s3=s.substring(5,9);
		s4=s.substring(10,14);
		s1=s.substring(0,2);
		String[] str=new String[4];
		str[0]=s1;
		str[1]=s2;
		str[2]=s3;
		str[3]=s4;
		for(String ele:str){
			System.out.println(ele);
		}

}
	private static void date() {
		  //getting current date and time using Date class
		DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
	     Date d = new Date(0);
	       System.out.println(df.format(d));
		return;
		
	}
	public static void main(String[] args) {
		switchEg(3); 
	}

}
