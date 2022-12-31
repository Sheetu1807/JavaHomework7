package javahomework7;

/* 10. Input any alphabet from “A" to “F” and print their city name accordingly (use if else)
if any other alphabet should be invalid entry */

import java.util.Scanner;

public class Pro10_Alphabet {

    public static void main(String[] args) {


        char a = 'A';
        char f = 'F';

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A or F:");
        char alphabetic = sc.next().charAt(0);


        if (alphabetic == 'A') {
            System.out.println("Country is Australia");
        } else if (alphabetic != 'F') {
            System.out.println("country is Finland");

        } else {
            System.out.println("other country");
        }
    }
}
