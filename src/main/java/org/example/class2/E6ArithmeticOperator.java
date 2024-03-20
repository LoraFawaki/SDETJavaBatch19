package org.example.class2;

public class E6ArithmeticOperator {
    public static void main(String[] args) {
        int num1=10;
        int num2=5;
        int result=num1+num2;
        System.out.println(result);

        System.out.println(10+"10"+10);
        //the second "10" is a String not a number
        //So the + operator is concatenating not adding

        System.out.println(10+10+"10");
        // the computer reads instructions from left to write. so it will add the first 2 numbers,
        //then it will concatenate the third number
        //anything between " " is a String.


    }
}
