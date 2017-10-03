package q15;

public class TestClass {

	public static void main(String[] args) {
		int a = 20;
		int b = 10;
		InterfaceImplementation im = new InterfaceImplementation();
		System.out.println("Addition of " +" " + a + " and " + b +  " is: " + im.addition(a, b));
		System.out.println("Subt raction of " +" " + a + " and " + b +  " is: " + im.subtraction(a, b));
		System.out.println("Multiplicatiof of " +" " + a + " and " + b +  " is: " + im.multiplication(a, b));
		System.out.println("Division of " +" " + a + " and " + b +  " is: " + im.division(a, b));
		

	}

}
