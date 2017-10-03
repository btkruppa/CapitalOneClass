package Q18AbstractString;

public class Test extends AbsString {
 	
 	String s ;
 
 
	public Test(String s) {
		super();
		this.s = s;
	}


	public Test() {
		// TODO Auto-generated constructor stub
	}


	public Boolean isUpper(String s) {
		this.s=s;
		System.out.println("Searching Uppercase letters");
		 for (int i = 0; i < s.length(); i++) {
			    
	            if(Character.isUpperCase(s.charAt(i))){    
	            System.out.println(s.charAt(i));
	            }
	}
		 return null;
	}

	public String toUpper(String s) {
		this.s=s;
		System.out.println("Convert to UPPERCASE");
		System.out.println(s.toUpperCase());
		return null;
	}


	public int stringConvertInt(String s) {
		this.s=s;
		int y = Integer.parseInt(s);
		System.out.println("Converting Int");
		System.out.println(y);
		return 0;
		
	}


public static void main(String[] args) {
	
	
AbsString abs=new Test();
abs.toUpper("akilaArthy");
abs.stringConvertInt("1234");
abs.isUpper("AkiLa Arthy");
}


}

