package q18;

public class ConcreteClass extends MyAbstractClass {

	@Override
	public boolean isUpperCase(String str) {
		for (int i = 0; i < str.length();) {
			if(Character.isUpperCase(str.charAt(i)));{
				return true;
			}
		}
		return false;
	}

	@Override
	public String lowerToUpper(String str) {
		String temp = "";
		for (int i = 0; i < str.length(); i++) {
			temp += Character.toUpperCase(str.charAt(i));
		}
		return temp;
	}

	@Override
	public void stringToIntAddTen(String num) {
		
		System.out.println("Final Number: " + Integer.parseInt(num) + 10);
		
	}

}
