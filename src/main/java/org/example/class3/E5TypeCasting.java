package org.example.class3;

public class E5TypeCasting {
    public static void main(String[] args) {

        int num=1000;
        byte number=(byte)num; // Type Casting, we forced Java to do it,  so we got a random results
        //We can't fit large number into a smaller box that doesn't have enough space.

        System.out.println(number);
    }
}
