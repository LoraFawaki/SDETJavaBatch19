package org.example.class4;

public class Task5 {
    public static void main(String[] args) {

        /*
Create a Java program and store values of mortgage
rate and mortgage price. First, program should check if rate is
higher than 4.5 user will not buy a house, otherwise user will
consider buying. Once user decides to buy a house, if price of
the house is larger than 100000 than user will take a loan,
otherwise user will pay cash.
 */

        double mortgageRate=4.4;
        double mortgagePrice=1200;

        if (mortgageRate>4.5){
            System.out.println("I will not buy a house");

        }else {
            if (mortgagePrice>100000){
                System.out.println("Will take a loan");
            }else {
                System.out.println("Pay cash");
            }
        }
    }
}
