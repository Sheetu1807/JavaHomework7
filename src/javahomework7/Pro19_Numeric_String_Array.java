package javahomework7;

// 19. Write a Java program to sort a numeric array and a string array

import java.util.Arrays;

public class Pro19_Numeric_String_Array {

    public static void main(String[] args){

        int[] num={10,15,20,25,30};
        String[] str={"Sheetal", "Dussooa"};

        Arrays.toString(num);
        Arrays.toString(str);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));
    }
}


