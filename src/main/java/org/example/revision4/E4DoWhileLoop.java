package org.example.revision4;

import java.util.Scanner;

public class E4DoWhileLoop {
    public static void main(String[] args) {

       /* Scanner scanner=new Scanner(System.in);

        System.out.println("Please Enter the number");
        int number = scanner.nextInt();


        while (number<10){

            System.out.println("Please Enter the number");
            number = scanner.nextInt();
             while loop is not the best for this situation as we ended up repeating the conde
            twice
            */

        Scanner scanner=new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Please Enter the number");
            number= scanner.nextInt();
        }while (number<10);


    }
}
