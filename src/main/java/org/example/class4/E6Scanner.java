package org.example.class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        //new Scanner (System.in) creating the object from an input

        Scanner input= new Scanner(System.in);
        //Scanner is a class that is written by a programmer
        System.out.println("Please enter your age");
        int age=input.nextInt(); // we are calling te nextIn method to take input from the keyboard
        System.out.println("My age is " + age + " years old");


    }
}
