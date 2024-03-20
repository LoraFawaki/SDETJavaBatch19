package org.example.review3;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter your Grade");

        char grade = scan.next().charAt(0);
        // .next will take the entire first word
        // .char will take ONLY one character
        // (0) means the first letter
        /*
        We are calling the next method from the scanner class and top of that we are calling the
        charAt() method so that we can only pick ONLY one letter of the word and ignore the rest
        if user tries to enter more letters
         */

        switch (grade) {

            case 'A':
                System.out.println("Excellent Grade");
                break;
            case 'B':
                System.out.println("Very Good Grade");
                break;
            case 'C':
                System.out.println("You need to work harder");
                break;
            default:
                System.out.println("Wrong Grade Entered");
                // default is same as else
                /* we use "switch" when we have exact matches for the variables

                 */
        }
    }
}
