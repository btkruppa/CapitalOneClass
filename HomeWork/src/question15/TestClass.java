package question15;

public class TestClass {

	public static void main(String[] args) {
		
		MathOperatorImplementation moi = new MathOperatorImplementation();
		int operand1 = 20;
		int operand2 = 10;
		
		int result = moi.myAddition(operand1, operand2);
		System.out.println("Addition of " + operand1 + "+" + operand2 + " = " + result);
		
		 result = moi.mySubtraction(operand1, operand2);
		 System.out.println("Subtraction of " + operand1 + "-" + operand2 + " = " + result);
		 
		 result = moi.myMultiplication(operand1, operand2);
		 System.out.println("Multiplication of " + operand1 + "*" + operand2 + " = " + result);
		 
		 result = moi.myDivision(operand1, operand2);
		 if (result == -1){
			 System.out.println("You cannot divide by 0");
		 }else {
		 System.out.println("Division of " + operand1 + "/" + operand2 + " = " + result);
		 }
	}

}
