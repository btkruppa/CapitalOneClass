package question4;

public class Factorial {

	public static void main(String[] args) {
		
		int input = 5;
		int factorialResult = 1;
		
		if(input <=0){
			System.out.println("Enter positive number to calculate Factorial");
		}else{
		for(int i=1; i<=5; i++){
			factorialResult = i * factorialResult;
			System.out.println(factorialResult);
			}
	  }
  }
}
