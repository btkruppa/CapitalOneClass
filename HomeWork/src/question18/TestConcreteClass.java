package question18;

public class TestConcreteClass {

	public static void main(String[] args) {
		
		//Checking Upper case
		String uppCase = "teTing";
		boolean foundUpperCase;
		concreteClass cc = new concreteClass();
		foundUpperCase = cc.getUppercaseChar(uppCase);
		System.out.println("Uppercase found: " + foundUpperCase);
		
		//Converting String to Upper case
		String lowerToUpperCase = "testingLowerTOupper";
		String ltu = cc.lowerToUppper(lowerToUpperCase);		
		System.out.println("Converted String: " + ltu);
		
		//Converting String to Integer
		String convertInt = "one";
		int x = cc.stringToInteger(convertInt);
		if(x != 0){
		System.out.println("Converted String to Integer: " + x);
		}else {
		System.out.println("Cannot convert String to Integer " + convertInt);
	}
		
	}

}
