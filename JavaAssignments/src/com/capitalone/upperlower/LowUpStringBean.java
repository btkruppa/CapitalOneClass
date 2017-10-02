package com.capitalone.upperlower;

public class LowUpStringBean extends LowerUpperAbs {
	private boolean flag = true;
	private int num;
	@Override
	boolean lowerStr(String value) {
			if(value.equals(value.toUpperCase())) {
				return true;
			}
			else {
				return false;
			}
	}
	
	public void calculateStr() {
		flag = lowerStr("Jagatha");
		if(flag) {
			System.out.println("The string has only upper case");
		}
		else
			System.out.println("The string has lower case too");
		System.out.println(upperStr("Jagatha"));
		System.out.println(convertStr("10"));		
	}

	@Override
	String upperStr(String val) {	
		return val.toUpperCase();
	}

	@Override
	int convertStr(String str) {
		num = Integer.parseInt(str) + 10;		
		return num;
	}


}
