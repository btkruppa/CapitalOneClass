package question_18;

public class Launcher {
	
	public static void main(String[] args) {
		
		Stringimpl str = new Stringimpl();
		String string = "hello";
		String string1 = "234";
		
		System.out.println("validate uppercase value ??" + "\n" + "Result : " +str.upperCase(string));
        str.changeCase(string);
        str.convertStringToInteger(string1);
	}

}
