package ie.atu.week5;

public class ArrayDemo {
    public static void main(String[] args) {
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

        // SET BREAKPOINT TO STEP THROUGH CODE TO SEE HOW THE ARRAY IS POPULATED, AND HOW JAVA REFERENCES THE DATA

        // Rewrite you application so that the user is prompted for a new value and then try to store this value
        // in location anArray[10]. Print out the result. Ideally, you should watch what happens using a
        // breakpoint in the debugger

        // Create a branch called “BugFix1” and rewrite your application so that you can deal with this
        // exception using a try/catch block. If it works, then push to Master using a pull request.

        // Rewrite your application to use an enhanced for loop if you have not done so already. Move this
        // loop to a method so we can reuse the code, if needed. Create this new feature on a branch. If it
        // works after your code change, then push to Master using a pull request

        // ONCE ALL DONE MOVE ONTO ARRAY LISTS

        for (Integer i : myArray) {
            System.out.println(i);
        }
    }
}
