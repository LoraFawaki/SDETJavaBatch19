package org.example.class5;

import java.util.Scanner;
/*
Create a Java program that will ask if
user has a credit card or not. If you user does not
have a credit card then offer them. If they do have one ask what
is balance on the card? If balance of the card is larger than 1000,
tell them to pay off immediately, otherwise you can tell them that they can
spend more.
 */
public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Do you have Credit Card");
        String haveCreditCard=scanner.next();
        if (haveCreditCard.equalsIgnoreCase("Yes")){
            System.out.println("What is your balance on the card?");
            double balance=scanner.nextDouble();
            if (balance>1000) {

                System.out.println("Pay off immediately");

            }else {
                System.out.println("you can spend more.");
            }


        }else {
            System.out.println("Would you like to open credit card?");
        }
    }
}
