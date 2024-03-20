package org.example.class5;

import java.util.Scanner;

public class E1Scanner {
    public static void main(String[] args) {
        /*
        Scanner => is a non-primitive data type
        scan => is just a variable name, can be anything
        any non-primitive data type always start with Upper-case
        every class is treated as a non-primitive data type
        = is assignment operator
        new Scanner(System.in) => creates an object of the scanner class.
        nextInt or nextLine or nextdouble "depends on the type of data of the input
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scan.nextInt();
        if(age>18){
            System.out.println("You can vote");
        }else {
            System.out.println("You need to wait");
        }

    }
}
