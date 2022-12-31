package javahomework7;

/* 6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
HRA = basic salary 10%
DA = Basic salary 8%
TA = Basic salary 9%
PF= Basic salary 20%
Gross salary = basic salary + HRA + TA + DA –PF      */

import java.util.Scanner;

public class Pro6_WAP {

    public static void main(String[] args) {
        Pro6_WAP.employee();
    }
    static void employee() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employee id : ");
        int emplid = scanner.nextInt();

        System.out.println("Enter Employee Name : ");
        String emplname = scanner.next();

        System.out.println("Enter Basic Salary : ");
        int salary = scanner.nextInt();

        double HRA = salary * 10 / 100;
        double DA = salary * 8 / 100;
        double TA = salary * 9 / 100;
        double PF = salary * 20 / 100;

        double gross_salary = salary + HRA + TA + DA - PF;

        System.out.println(    "---------------------------------------------------------");
        System.out.println(    "|                    Salary Slip                        |");
        System.out.println(    "|-------------------------------------------------------|");
        System.out.println(    "| Employee Id    :                     " +  emplid  + " |");
        System.out.println(    "| Employee Name  :                   " +  emplname  + " |");
        System.out.println(    "|-------------------------------------------------------|");
        System.out.println(    "| Basic Salary   :                       " + salary + " |");
        System.out.println(    "| HRA 10%        :                          " + HRA + " |");
        System.out.println(    "| TA 8%          :                           " + TA + " |");
        System.out.println(    "| DA 9%          :                           " + DA + " |");
        System.out.println(    "| PF - 20%       :                           " + PF + " |");
        System.out.println(    "|-------------------------------------------------------|");
        System.out.println(    "| Gross Salary   :                 " + gross_salary + " |");
        System.out.println(    "|=======================================================|");

    }
}





