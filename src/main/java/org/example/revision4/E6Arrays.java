package org.example.revision4;

public class E6Arrays {
    public static void main(String[] args) {

        //calculate the avg of numbers which are greater than 25

        int [] numbers={10,25,45,66,85,100};
        double sum=0;
        int counter=0;

        for (int n:numbers) {
            if (n>25){
                sum+=n;
                counter++;
            }
            }
        double average= sum/counter;
        System.out.println(average);

        }

    }

