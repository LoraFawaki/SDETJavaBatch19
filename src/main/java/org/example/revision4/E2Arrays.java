package org.example.revision4;

public class E2Arrays {
    public static void main(String[] args) {

        int [] num={10,25,45,66,85,100};
        for (int i=0; i<num.length; i=i+2) {
            System.out.println(i+ " " + num[i] + " ");
        }
    }
}
