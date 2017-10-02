
public class MyMain {

	public static void main(String[] args) {
		
		int a = 3;
		int b = 4;
		
		//Create object of type MyClass and call the overridden methods
		MyClass myObject = new MyClass();
		System.out.println("Add: " + myObject.add(a, b));
		System.out.println("Subtract: " + myObject.subtract(a, b));
		System.out.println("Multiply: " + myObject.multiply(a, b));
		System.out.println("Divide: " + myObject.divide(a, b));
		
	}
}
