package ie.atu.week5;

import java.util.Scanner;

public class ArrayDemo {

    // Print Array Method
    public static void printArray(int[] myArray){
        int x = 0;
        for (Integer i : myArray) {
            System.out.print("Element at index " + x + ": ");
            System.out.println(i);
            x++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] myArray = new int[10];

        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        // Out of Bounds Example
        System.out.println("Please enter another number...go on ;)");
        int user = sc.nextInt();

        try{
            myArray[10] = user;

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(" Invalid! Error Message: " + e.getMessage());
        }

        printArray(myArray);

        // ONCE ALL DONE MOVE ONTO ARRAY LISTS

    }
}
