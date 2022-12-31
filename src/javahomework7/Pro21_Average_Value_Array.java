package javahomework7;

// 21. Write a Java program to calculate the average value of array elements

public class Pro21_Average_Value_Array {

    public static void main(String[] args) {

        int[] numbers = new int[]{10, 15, 28, 32, -18, 70, -120};

        //calculate sum of all array elements
        int sum = 0;
        for(int i = 0; i < numbers.length; i++)
            sum = sum + numbers[i];

        //calculate average value
        double average = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + average);
    }
}

