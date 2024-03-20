package org.example.review3;

import java.util.Scanner;

public class E7Loop {
    public static void main(String[] args) {

        // write numbers from 1 - 100.
        // if we are repeating 3-4 lines, we should think about a loop

        //System.out.println(1);
        //System.out.println(2);
        //System.out.println(3);
        //System.out.println(4);

        Scanner scanner=new Scanner(System.in);
       int number=10;
       while (number>5){
           System.out.println("Please Enter a Number");
           number=scanner.nextInt();

       }

        }
    }

