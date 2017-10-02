
public class Launcher {

	public static void main(String[] args) {
		
		//pass the two below variables to checkUpper & toUpper methods
		String myString = "hello";
		String myNum = "123";
		
		// Store results of calls to checkUpper & toUpper into below variables 
		boolean myCheckUpper;
		String toUpper;
		
		// Create Object
		SubClass myObject = new SubClass();
		
		//Call checkUpper
		myCheckUpper = myObject.checkUpper(myString);
		
		// Sysout result
		System.out.println(myCheckUpper);
		
		//Call toUpper
		toUpper = myObject.toUpper(myString);
		
		// Sysout toUpper
		System.out.println(toUpper);
		
		//Call toInteger method of Object
		myObject.toInteger(myNum);
		
	}
}
