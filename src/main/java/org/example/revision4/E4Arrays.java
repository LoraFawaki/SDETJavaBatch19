package org.example.revision4;

public class E4Arrays {
    public static void main(String[] args) {
        // write a program to calculate the avg. of these numbers

        int[] num={10,25,45,66,85,100};
        int sum = 0;
        for (int i =0; i< num.length; i++){
            sum= sum+ num[i];

        }
        double average= sum/num.length;
        System.out.println(average);








    }
}
