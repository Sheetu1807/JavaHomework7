package javahomework7;

/* 9. Write a java program input sales id, seller's name, sales amount, and salary basic and
//then fined this sales
//Commission
//Sales amount >= 50,000 35%
//Sales amount >= 30,000 20%
//>= 20,000 10%
//>= 10,000 5%
//< 10,000 2%
 */

import java.util.Scanner;

public class Pro9_Sales {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales id : ");
        int eid = sc.nextInt();

        System.out.println("Enter seller's name : ");
        String name = sc.next();

        System.out.println("Enter Sales Amount : ");
        double sale_amount = sc.nextDouble();

        System.out.println("Enter Basic Salary : ");
        double salary = sc.nextDouble();

        double commission = 0;

        if (sale_amount >= 50000) {
            commission = sale_amount * 0.35;
        } else if (sale_amount >= 30000) {
            commission = sale_amount * 0.20;
        } else if (sale_amount >= 20000) {
            commission = sale_amount * 0.10;
        } else if (sale_amount >= 10000) {
            commission = sale_amount * 0.5;
        } else if (sale_amount < 10000) {
            commission = sale_amount * 0.2;
        }
        System.out.println("Commission is : " + commission);
    }
}

