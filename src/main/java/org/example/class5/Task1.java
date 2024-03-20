package org.example.class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        /*
        You are a loan specialist and you need to ask user what is the amount of loan is
        needed. If loan is less or
        or equal to 200,000 then you you would lend the money otherwise you would reject the client
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("What is the Loan amount?");
        int amount=scan.nextInt();
                if(amount<=200000){
            System.out.println("Loan Accepted");
        }else {
            System.out.println("Loan Rejected");
        }
    }
}
