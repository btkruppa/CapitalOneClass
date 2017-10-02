package question15;

public class Test {

	public static void main(String[] args) {
		 
		int x = 9;
		int y = 3;
		
		Operations op = new Operations();
		System.out.println("x + y = " +  op.addition(x, y));
		System.out.println("x - y = " + op.substraction(x, y));
		System.out.println("x * y  = " + op.multiply(x, y));
		System.out.println("x / y = " + op.division(x, y));
		
		
		
		
		
	}
}
