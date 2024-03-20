package org.example.class6;

import java.util.Scanner;

public class E12LoopsWithScanners {
    public static void main(String[] args) {

        Scanner scannner= new Scanner(System.in);
        System.out.println("Please enter the starting point of the loop");
        int start= scannner.nextInt();
        System.out.println("Please enter the stopping number");
        int end=scannner.nextInt();
        System.out.println("Please enter the step size");
        int stepSiza=scannner.nextInt();

        while (start<=end){
            System.out.print(start + " ");
            start=start+stepSiza;

        }

    }
}
