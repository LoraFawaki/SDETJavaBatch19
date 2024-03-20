package org.example.revision4;

public class E1Arrays {
    public static void main(String[] args) {

        int [] numbers={10,25,45,66,85,100};
        System.out.println(numbers.length);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);

        for (int i = 0; i<numbers.length; i++){
            //System.out.println(numbers[i] + " ");
            System.out.print(i+ " " + numbers[i] + " , ");

        }



    }
}
