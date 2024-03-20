package org.example.class5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        //issue program to input city and temp. program should convert F to C and print
        // "The temperature in the city is-"

        Scanner scan=new Scanner(System.in);
        System.out.print("What is your city");
        String city=scan.nextLine();
        System.out.print("What is the Temperature in your city");
        double fTemp=scan.nextDouble();
        double cTemp = (fTemp-32) * 5/9.0;
        System.out.println("The temperature in the city "+ city+" is "+ cTemp);

    }
}
