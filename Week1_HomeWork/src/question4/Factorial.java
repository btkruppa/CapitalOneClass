package question4;

public class Factorial {

	public static int fact(int temp) {
		int number = 1;
				for ( int i = 1; i <= temp; i++){
					number = number * i;
					
				}
		return number;
		
	}
}
