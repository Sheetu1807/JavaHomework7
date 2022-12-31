package javahomework7;

// 3. Declare multidimensional array and store 5 countries and their capital and print them in console

public class Pro3_Multidimensional_Array {

    public static void main(String[] args){

        String[][] array = {{"Italy", "Rome"},
                            {"China", "Beijing"},
                            {"United Kingdom", "London"},
                            {"Australia", "Canberra"},
                            {"Canada", "Ottawa"}};


        System.out.println("Country is  " +array[0][0] + " and its Capital is " +array[0][1]);
        System.out.println("Country is  " +array[1][0] + " and its Capital is " +array[1][1]);
        System.out.println("Country is  " +array[2][0] + " and its Capital is " +array[2][1]);
        System.out.println("Country is  " +array[3][0] + " and its Capital is " +array[3][1]);
        System.out.println("Country is  " +array[4][0] + " and its Capital is " +array[4][1]);
    }
}