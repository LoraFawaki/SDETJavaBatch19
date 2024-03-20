package org.example.class5;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
Write a program that will prompt the user for
Day number and print whether it is a weekend or weekday.
If any day from 1-5 → output “It is a weekday”, anyday
from 6-7 → output “It is a weekend”, any other day →
output “Invalid day”
Test your task for -1 3 6 and 8
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter day number");
        int daynum=scan.nextInt();

        if (daynum>=6&&daynum<=7) {
            System.out.println("it is a weekend");

        } else if (daynum>=1&&daynum<=5) {
            System.out.println("it is a weekday");

        } else {
            System.out.println("Invalid day");
        }
    }
}
