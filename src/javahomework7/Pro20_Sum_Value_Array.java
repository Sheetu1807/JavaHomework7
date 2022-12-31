package javahomework7;

// 20. Write a Java program to sum values of an array

public class Pro20_Sum_Value_Array {

    public static void main(String[] args) {

        int array[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int sum = 0;

        for (int i : array)
            sum += i;
        System.out.println("The sum is " + sum);
    }
}

