package com.homework.q2;

public class Fibonacci {

    public static void main(String[] args) {
        int prevNumber = 0;
        int currentNumber = 1;
        int newNumber = 0;
        int count = 1;
        while (count <= 25) {
            System.out.println(newNumber);
            newNumber = prevNumber + currentNumber;// 0,1,1,2,3
            prevNumber = currentNumber;// 1
            currentNumber = newNumber;// 1,2
            count++;
        }

    }

}
