package org.example.class7;

public class Task4 {
    public static void main(String[] args) {

        //From an array of integer elements find the largest number.

        int [] num={10,20,30,40,50,19,32};
        /*int max=num[0];

        for (int n:num){
            if (max<n){
                max=n;
            }
        }
        System.out.println(max);
    */
        int min=num[0];
        for (int l:num){
            if (min>l){
                min=l;
            }

        }
        System.out.println(min);

        }

    }

