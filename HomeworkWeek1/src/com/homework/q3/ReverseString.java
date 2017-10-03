package com.homework.q3;

public class ReverseString {

    public static void main(String[] args) {
        String stringy = new String("I am a lowly string that just wants to be reversed");
        String reverseStringy = new String("");

        for (int i = stringy.length() - 1; i >= 0; i--)
            reverseStringy += stringy.charAt(i);
        System.out.println("The reverse string is: " + reverseStringy);

    }

}
