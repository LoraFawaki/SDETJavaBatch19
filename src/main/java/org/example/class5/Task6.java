package org.example.class5;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
Prompt the user to enter person heights in inches. Person should be classified as one of the following:
• short (under 60 inch)
• medium(between 60 -72 inch)
• tall (over 72 inch)
*/
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter your height in inches");
        double height= scan.nextDouble();
        if (height>72){
            System.out.println("you are tall");
        } else if (height>=60&&height<=72) {
            System.out.println("you are medium in height");

        } else if (height<60) {
            System.out.println("you are short");

        }
    }
}
