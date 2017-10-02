package Q19Arraylist;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> i = new ArrayList<Integer>(11); 
		for (int x=1;x<11;x++){
			i.add(x);
			System.out.println(i);
		}
		System.out.println("Adding Even numbers");
		int even =0;
		for(int ele:i){	
			if(ele%2==0){		
				 even=even+ele;
				System.out.println(even);
				
			}
		}
		
		System.out.println("Adding odd numbers");
		int odd=0;
		for(int ele:i){	
			if(ele%2!=0){		
				 odd=odd+ele;
				System.out.println(odd);
			}

		}
		
	}
	
}
