package ie.atu.week5;

import java.util.Scanner;

public class ArrayDemo {
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

        // Print out all elements of myArray
        for (Integer i : myArray) {
            System.out.println(i);
        }

        // Rewrite your application to use an enhanced for loop if you have not done so already. Move this
        // loop to a method so we can reuse the code, if needed. Create this new feature on a branch. If it
        // works after your code change, then push to Master using a pull request

        // ONCE ALL DONE MOVE ONTO ARRAY LISTS
    }
}
