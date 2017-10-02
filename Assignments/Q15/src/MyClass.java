
public class MyClass implements MyInterface {

	@Override
	public double add(double a, double b) {
		
		return a + b;
	}

	@Override
	public double subtract(double a, double b) {
		
		return (a < b ? b - a : a - b);
	}

	@Override
	public double multiply(double a, double b) {
		
		return a * b;
	}

	@Override
	public double divide(double a, double b) {
		
		return (a < b ? b /a : a / b);
	}
}
