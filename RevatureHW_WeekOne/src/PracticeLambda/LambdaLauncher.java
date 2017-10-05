package PracticeLambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <String> li = new ArrayList<String>();
		li.add("Hello");
		li.add("longer string");
		li.add("s");
		li.add("goodbye");
		
		System.out.println(li);
		
		Collections.sort(li, (a,b)->a.length()-b.length());
		
		
		System.out.println(li);

	}

}
