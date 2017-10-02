package com.capitalone.stringreverse;

public class StringReverse {
	private String myNewName;
	public String getMyNewName() {
		return myNewName;
	}
	public void setMyNewName(String myNewName) {
		this.myNewName = myNewName;
	}
	public String reverseString(String myName) {
		for(int i=myName.length();i>0;i--) {
			if(this.myNewName!=null) {
				this.myNewName = this.myNewName + myName.charAt(i-1);
			}
			else {
				this.myNewName = myName.substring(i-1);
			}
		}
		System.out.println(myNewName);	
		return myNewName;
	}
}
