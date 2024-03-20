package org.example.review3;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Please Enter you Age");
        int age=scan.nextInt();
        /*
        we are creating and int data type to store the age "variable name",
        and we are using the nextInt method to get the input and store it in the variable.
         */
        //System.out.println("Your age is "+ age);

        if (age>50){
            System.out.println("You will get 20% discount on Toys");
        }else {
            System.out.println("You will get 10% discount");
        }
    }
}
