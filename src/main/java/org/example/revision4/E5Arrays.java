package org.example.revision4;

public class E5Arrays {
    public static void main(String[] args) {

        //calculate the avg of numbers using enhanced for loop

        int [] numbers={10,25,45,66,85,100};
        double sum=0;
        for (int n:numbers) {
            sum+=n;
        }
        double average= sum/numbers.length;
        System.out.println(average);

        }
        }


