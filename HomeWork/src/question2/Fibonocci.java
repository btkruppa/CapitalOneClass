package question2;

public class Fibonocci {

	public static void main(String[] args) {
		
		int first = 0;
		int second = 1;
		int count = 25;
		int temp;
		
		for(int i=0; i<count; i++){
			System.out.print(first + " ");
			temp = first + second;
			first = second;
			second = temp;		
			
		}

	}

}
