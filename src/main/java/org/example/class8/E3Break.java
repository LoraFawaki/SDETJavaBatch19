package org.example.class8;

public class E3Break {
    public static void main(String[] args) {

        /*
        2D Arrays looks like te below

        10 20 40 50
        22 40 90 65
        15 50 33 30
         */

        int [] [] matrix= {
                {10, 20, 40, 50},
                {22, 40, 90, 65},
                {15, 50, 33, 30},

        };
        System.out.println(matrix[1][2]);
        System.out.println(matrix[2][3]);

    }
}
