package javahomework7;

// 14. Write a program that tells us input value is number or an alphabet or symbol


import java.util.Scanner;

public class Pro14_Input_Value {

    public static void main(String[] args){


            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any character : ");
            char x = scanner.next().charAt(0);

            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z')) {

                System.out.println(x + " is a alphabet.");

            } else if(x >= '0' && x <= '9') {

                System.out.println(x + " is a number.");

            } else {

                System.out.println(x + " is a symbol.");
            }

        }
    }

