package com.capitalone.revature.week1.q8;

import java.util.ArrayList;

public class updated {
	public static void main(String[] args) {
    ArrayList<String> stringArray = new ArrayList<String>();
    ArrayList<String> palindromeStringArray = new ArrayList<String>();
    stringArray.add("karan");
    stringArray.add("madam");
    stringArray.add("tom");
    stringArray.add("civic");
    stringArray.add("radar");
    stringArray.add("sexes");
    stringArray.add("jimmy");
    stringArray.add("kayak");
    stringArray.add("john");
    stringArray.add("refer");
    stringArray.add("billy");
    stringArray.add("did");
    System.out.println("Original Array Data " + stringArray);
    // Verify if the string is Palindrome and move it to new ArrayList.
    checkForPalindrome(stringArray, palindromeStringArray);
    System.out.println("Original Array Data after removing Palindrome " + stringArray);
    System.out.println("Total number of Palindrome Strings identified " + palindromeStringArray.size());
    System.out.println("Newly created Palindrome Array " + palindromeStringArray);
}
private static void checkForPalindrome(ArrayList<String> stringArray, ArrayList<String> palindromeStringArray) {
    String originalString;
    String reverseString;
    for (int stringIndex = 0; stringIndex < stringArray.size(); stringIndex++) {
        // original string
        originalString = stringArray.get(stringIndex);
        System.out.println("orignial: " + originalString);
        // reverse the string
        reverseString = new StringBuffer(originalString).reverse().toString();
        System.out.println("reverse: " + reverseString);
        // Compares original string with reverse string to decide whether it
        // is a Palindrome
        System.out.println(originalString.equals(reverseString));
        if (originalString.equals(reverseString)) {
            // Add the Palindrome String to Palindrome ArrayList
            palindromeStringArray.add(originalString);
            // Remove Palindrome Sting from original ArrayList
            stringArray.remove(originalString);
            stringIndex--;
        }
    }
}}