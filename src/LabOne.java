// Calculate the perimeter & area of various classrooms @GC based on user input
/*Formula
   http://www.mathplanet.com/education/pre-algebra/inequalities-and-one-step-equations/calculating-the-area-and-the-perimeter*/

import java.util.Scanner;

public class LabOne {
    public static void main(String[] args) {
        //creating a Scanner
        Scanner scnr = new Scanner(System.in);

        //creating variable
        double length = 0.0;
        double width = 0.0;
        double perimeter = 0.0;
        double area = 0.0;

        //get user input
        System.out.println("Enter the length of a classroom: ");
        length = scnr.nextDouble();
        System.out.println("Enter the width of a classroom: ");
        width = scnr.nextDouble();

        //using formula to calculate the Perimeter & Area
        perimeter = 2 * (length + width);
        area = length * width;
        //print the output
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);



        boolean answer = true;
        System.out.println("Do you want to continue?(Y/N): ");
        //answer = scnr.
        if (answer == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        System.out.println();
    //userInput = scnr.nextLine();*/

       /* //if user wants to continue
        //boolean userInput = true;
        if (answer == true) {
            System.out.println("keep measuring rooms");
        } else {
            System.out.println("you are done");
        }*/


    }
}
