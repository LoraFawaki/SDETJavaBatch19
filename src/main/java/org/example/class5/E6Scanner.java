package org.example.class5;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner1=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner1.nextInt();
        System.out.println("Please Enter your Full name");
        //we add and extra nextLine. as extra call to nextLine to clear the buffer memory
        scanner1.nextLine();
        String fullName=scanner1.nextLine();
        System.out.println("Your full name is "+fullName+" you are "+age+" years old");

        /*
        or
         Scanner scanner1=new Scanner(System.in);
        Scanner scanner2=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner1.nextInt();
        System.out.println("Please Enter your Full name");
        String fullName=scanner2.nextLine();
        System.out.println("Your full name is "+fullName+" you are "+age+" years old");
         */
    }
}
