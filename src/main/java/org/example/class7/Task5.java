package org.example.class7;

public class Task5 {
    public static void main(String[] args) {

        char [] word={'S', 'U', 'N', 'D', 'A','Y'};
        // we can create a loop to increase the numbers or decrease the number
        //0 1 2 3 4 5
        // 5 4 3 2 1 0
        /*
        //when we use .lenght, it will include all the data in the array. We added -1 as the index starts from 0
        // when we put .length, it makes is a generic code. and that is encouraged.
        int i=word.length-1;
        while (i>0) {
            System.out.println(word[i]);
            i--;

         */


            for (int i=word.length-1; i>=0;i--){
            System.out.println(word[i]);
            }


        }
    }

