package org.example.class5;

import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        /*
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Please entre your FullName");
        String fullName=scanner.nextLine();
        System.out.println("Your name is " + fullName + " you are " + age + " years old.");
        nextLine(), should only be the very first Scanner outcome. otherwise we need to repeat it twice

        */
        // the above will be wrong outcome

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=scanner.nextInt();
        System.out.println("Please entre your FullName");
        scanner.nextLine();
        //repeating nextLine(), twice clears the extra buffer memory
        String fullName=scanner.nextLine();
        System.out.println("Your name is " + fullName + " you are " + age + " years old.");

        //better way to solve the problem in E6Scanner
    }
}
