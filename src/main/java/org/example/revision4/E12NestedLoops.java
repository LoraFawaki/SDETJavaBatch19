package org.example.revision4;

public class E12NestedLoops {
    public static void main(String[] args) {
/*
        for (int i = 0; i < 5; i++) {

            System.out.println(i + " ");
        }
*/

        for (int j = 0; j < 5; j++) { //control the number of rows
            for (int k = j; k < 5; k++) { // control what will be printed in each row
                System.out.print(k+ " ");
            }
            System.out.println();
            }

        for (int i = 8; i >=0 ; i--) {
            for (int l = 4; l >= 0; l--) {
                System.out.print(l+ " ");

            }
            System.out.println();
        }

        }
    }
