package org.example.revision4;

public class E3Arrays {
    public static void main(String[] args) {

        int [] num={10,25,45,66,85,100};
        for (int i= num.length-1; i<num.length; i--) {
            // i = num.length "we added the -1" as index starts from 0 not from 1
            // to avoid the the out of bound we write i>=0 instead of i<num.length
            System.out.println(i+ " " + num[i] + " ");
        }

    }
}
