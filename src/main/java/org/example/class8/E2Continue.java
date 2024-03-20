package org.example.class8;

public class E2Continue {
    public static void main(String[] args) {

        int [] numbers={10,70,30,40,50,60,35,5,55,100};

        for (int num:numbers){
            if (num>50){
                continue;
            }
            System.out.print(num+10);
            System.out.println();
            System.out.print(num-1);
            System.out.println();
            System.out.print(num*4);
            System.out.println();
            System.out.print(num/3);
            System.out.println();
            System.out.print(num%2);

        }


    }
}
