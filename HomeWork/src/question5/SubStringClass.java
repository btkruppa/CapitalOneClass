package question5;

public class SubStringClass {

	public static void main(String[] args) {
		
		String str = "Brunda";
		int x = 2;
		
		System.out.println(getSubString(str, x));

	}
	public static String getSubString(String str, int idx){
		
		String newStr = new String();
		for(int i=0; i<=idx; i++){
			newStr = newStr + str.charAt(i);
			
		}		
		return newStr;
	}

}
