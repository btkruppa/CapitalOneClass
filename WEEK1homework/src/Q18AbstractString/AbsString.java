package Q18AbstractString;

 abstract class AbsString {
	 abstract Boolean isUpper(String s);
	 abstract String toUpper(String s);
	 abstract int stringConvertInt(String s);

 }
	 
	 
	 class StringTest extends AbsString {
		 	
		 String s ;
		 
		 	public StringTest() {
			super();
			// TODO Auto-generated constructor stub
		 	}

		 	
			public StringTest(String s) {
				super();
				this.s = s;
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
			
			
		AbsString abs=new StringTest();
		abs.toUpper("akilaArthy");
		abs.stringConvertInt("1234");
		abs.isUpper("AkiLa Arthy");
		}


	 }
 
 
