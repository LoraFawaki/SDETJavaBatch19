package org.example.class5;

import java.util.Scanner;

public class E2Scanner {
    public static void main(String[] args) {

        //for every primitive data type we have a method to get the details from the Scanner class

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a byte number");
        byte smallBox=scanner.nextByte();
        System.out.println("Please Enter a double number");
        double bigBox=scanner.nextDouble();
        System.out.println("Please enter a boolean Value");
        boolean logicalBox=scanner.nextBoolean();

        System.out.println(smallBox);
        System.out.println(bigBox);
        System.out.println(logicalBox);



    }
}
