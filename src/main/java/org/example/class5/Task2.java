package org.example.class5;

import java.util.Scanner;
/*
You are DMV representative and you need to ask
customer their age. If they are 18 or older you will
issue a driver license to them, otherwise you will offer
them to get a learners permit.
 */
public class Task2 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("How od are you?");
        int age=scan.nextInt();
        if (age>=18) {
            System.out.println("Will issue driver license");
        }else
            System.out.println("Will issue Learner Permit");
    }
}
