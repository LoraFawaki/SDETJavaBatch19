package org.example.class5;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        /*
Write a program that will read three inputs of scores (quiz, mid term, and final scores)
and determine the grade based on the following rules:
if the average score >=90 → grade=A
if the average score >= 70 and <90 → grade=B
if the average score>=50 and <70 → grade=C
if the average score<50 → grade=F
 */

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter you Quiz score");
        double quizScore=scan.nextDouble();
        System.out.println("Enter your mid-term score");
        double midTerm= scan.nextDouble();
        System.out.println("Enter your final score");
        double finalScore= scan.nextDouble();

        double average=(quizScore+midTerm+finalScore)/3;

        if (average>=90){
            System.out.println("Your grade is A");

        } else if (average>= 70 && average <90) {
            System.out.println("Your grade is B");

        } else if (average>=50 && average <70) {
            System.out.println("Your grade is C");

        }else {
            System.out.println("Your grade is F");
        }



        }
    }

