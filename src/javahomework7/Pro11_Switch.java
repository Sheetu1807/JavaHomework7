package javahomework7;

// 11. Write java program using switch statement and print your group name 10 times


import java.util.Scanner;

public class Pro11_Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Input any letter from A to G: ");
        String country = sc.next();


            switch(country) {

                case "A":
                    System.out.println("Argentina");
                    break;


                case "B":
                    System.out.println("Bolivia");
                    break;


                case "C":
                    System.out.println("China");
                    break;


                case "D":
                    System.out.println("Denmark");
                    break;


                case "E":
                    System.out.println("Egypt");
                    break;


                case "F":
                    System.out.println("Finland");
                    break;

                case "G":
                    System.out.println("Greece");
                    break;


                default:
                    System.out.println("not valid");
            }
        }
    }
