package javahomework7;

// 18.  Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or “ZERO”

import java.util.Scanner;

public class Pro18_Posit_Negat_Zero {

    public static void main(String[] args) {

        int num;

//object of the Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");


//reading a number from the user
        num = sc.nextInt();


//check the number is greater than 0 or not
        if(num > 0)
        {
            System.out.println("The number is positive.");
        }


//check the number is less than 0 or not
        else if(num < 0)
        {
            System.out.println("The number is negative.");
        }


//execute when the above two conditions return false
        else
        {
            System.out.println("The number is zero.");
        }
    }
}

