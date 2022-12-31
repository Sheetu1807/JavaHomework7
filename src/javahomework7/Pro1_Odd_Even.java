package javahomework7;

/* 1. Write a java program that tells us that Input number is odd or even?
HINT: use ternary operator (? :) */

import java.util.Scanner;

public class Pro1_Odd_Even {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = reader.nextInt();

        String OddEven = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + OddEven);
    }
}
